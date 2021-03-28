# Conductor recruitment challenge

The ACME company is migrating their monolithic system to a microservice architecture and you’re responsible to build their MVP (minimum viable product)  .
https://en.wikipedia.org/wiki/Minimum_viable_product

Your challenge is:
Build an application with those features described below, if you think the requirements aren’t detailed enough please leave a comment (portuguese or english) and proceed as best as you can.

You can choose as many features you think it’s necessary for the MVP,  IT’S NOT necessary build all the features, we strongly recommend to focus on quality over quantity, you’ll be evaluated by the quality of your solution.

If you think something is really necessary but you don’t have enough time to implement please at least explain how you would implement it.

## Tasks

Your task is to develop one (or more, feel free) RESTful service(s) to:
* Create a **Store**
* Update a **Store** information
* Retrieve a **Store** by parameters
* Create an **Order** with items
* Create a **Payment** for an **Order**
* Retrieve an **Order** by parameters
* Refund **Order** or any **Order Item**

**IMPORTANT** You have to implement at least one **database procedure** to execute the payment process or other process you may judge important.

Fork this repository and submit your code with partial commits.

## Business Rules

* A **Store** is composed by name and address
* An **Order** is composed by address, confirmation date and status
* An **Order Item** is composed by description, unit price and quantity.
* A **Payment** is composed by status, credit card number and payment date
* An **Order** just should be refunded until ten days after confirmation and the payment is concluded.

## Non functional requirements

Your service(s) must be resilient, fault tolerant, responsive. You should prepare it/them to be highly scalable as possible.

The process should be closest possible to "real-time", balancing your choices in order to achieve the expected
scalability.

## Nice to have features (describe or implement):
- [ ] Asynchronous processing 
- [x] Database      
- [x] Docker        
- [ ] AWS
- [x] Security
- [x] Swagger       
- [x] Clean Code    
- [x] Test          


## 🚀 Starting

Essas instruções permitirão que você obtenha uma cópia do projeto em máquina local para fins de deploy em containers.

<!--ts--> 
* [Requireds](#📋-requireds) 
* [Instalations](#🔧instalations) 
* [Deploy](#⚙️-deploy) 
* [Built with](#🛠️-built-with)
<!--te-->

### 📋 Requireds

Para este projeto será necessario:

```
Docker
docker-compose
```

### 🔧 Installations

Para prepara o ambiente, siga os passos e instale as seguintes ferramentas:

Clone o repositorio em uma pasta a sua escolha:

```
git clone https://github.com/Hajadalaj/challenge-cdt.git
```

* [Instalar o Docker](https://docs.docker.com/engine/install/)

Após instalar o Docker, faça um pull da imagem do Microsoft SQL Server:

```
docker pull mcr.microsoft.com/mssql/server
```
* [Instalar o docker-compose](https://docs.docker.com/compose/install/)

### ⚙️ Deploy

Após concluir o passo de instalação, navegue até a pasta raiz do projeto pela cli:

```
cd /challenge-cdt/conductor-project/
```

Vamos executar comando docker para criar uma imagem do projeto:

```
docker build -t conductor-service .
```

E por fim, subir as duas imagens, **Microsoft SQL Server** e **conductor-service** 

```
docker-compose up
```

A partir de agora a aplicação fica acessivel pelo seguinte IP:

```
200.100.50.10:8080
```

[API](http://200.100.50.10:8080/swagger-ui.html#)

E o BD pelo IP:

```
200.100.50.5:1433
```
Obs: Para este exemplo os dados de login e senha estão no arquivo 

### 🛠️ Built with

* [jdk-11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html) - Versão java;
* [Maven](https://maven.apache.org/) - Gerenciador de Dependência;
* [spring-boot](https://spring.io/projects/spring-boot) - Framework: web, jpa, security e jpa.


### [Voltar ao Starting](#🚀-starting)
