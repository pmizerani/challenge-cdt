        
 /*           
 Criado por: Abdel Galeb         
 Criado em: 26/03/2021 
 Descrição: Simulando um pagamento por cartão de credito
 */  
USE conductor
GO
 
IF exists(select * from sys.all_objects where name = 'sp_payment')
	DROP PROCEDURE dbo.sp_payment
GO
  
CREATE PROCEDURE dbo.sp_payment
	(@credit_card	AS VARCHAR(16),
	 @orderId		AS BIGINT,
	 @result		AS VARCHAR(8) OUTPUT) 
AS BEGIN
SET NOCOUNT ON 


DECLARE
@status		AS VARCHAR(8),
@date		AS DATETIME 

IF (SELECT floor(RAND()*(10 - 9 + 1)+1)) = 1
	BEGIN 
		SET @status		= 'APPROVED'
		SET @date		= GETDATE()

		INSERT PAYMENT (credit_card_num, payment_date, status)
		VALUES ( @credit_card, @date, @status)

		UPDATE ORDERS 
		SET confirmation_date = @date, status = @status
		WHERE id = @orderId
		RETURN @status
	END
	ELSE
		BEGIN
			SET @status		= 'REFUSED'
			SET @date		= GETDATE()

			INSERT PAYMENT (credit_card_num, payment_date, status)
			VALUES ( @credit_card, null, @status)

			UPDATE ORDERS 
			SET status = @status
			WHERE id = @orderId
			RETURN @status
		END
	END
END
GO;


 