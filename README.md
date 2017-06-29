
[![Build Status](https://api.travis-ci.org/namumba22/eureka.svg?branch=master)](https://travis-ci.org/namumba22/eureka)

# Eureka example
Eureka, Feign, Ribbon client-service sample. Based on docker

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Docker, Docker compose, git, java and maven shoudl be installed. All scripts are given for shell/bash

```
bash-3.2$ docker -v
Docker version 17.06.0-ce-rc5, build b7e4173

bash-3.2$ docker-compose -v
docker-compose version 1.14.0, build c7bdf9e

bash-3.2$ git --version
git version 2.11.0 (Apple Git-81)

bash-3.2$ mvn -v
Apache Maven 3.3.9

bash-3.2$ java -version
java version "1.8.0_77"
```

### Installing

Clone a repository from git

```
bash-3.2$ git clone https://github.com/namumba22/eureka.git
```

enter the project folder
```
bash-3.2$ cd eureka
```

build the app with maven
```
bash-3.2$ mvn clean install
```

### Run

First run an eureka server

```
bash-3.2$ cd ./docker
bash-3.2$ docker-compose -f docker-compose-eureka.yml up
```

and wait intill the request below returns the responce
```
bash-3.2$ curl http://localhost:8761/eureka/apps/
<applications>
  <versions__delta>1</versions__delta>
  <apps__hashcode></apps__hashcode>
</applications>
```

Then run services

```
bash-3.2$ docker-compose -f docker-compose-pizza.yml up
```

## Testing the app

### Components

Service | Type | test url
--- |---|---
eireka itself | ... | http://localhost:8761/eureka/apps/
aggregator| Aggregator | http://localhost:8080/calculate/1000/5
tax | Aggregator | http://localhost:8085/tax
discount | Endpoint|http://localhost:8083/discount/12
multiple-devide | Endpoint|http://localhost:8081/devide/12/5
plus-minus | Endpoint|http://localhost:8082/plus/12/3
rounder | Endpoint| http://localhost:8084/round/9.55888


pizza calculator:
http://localhost:8080/calculate/4200/3

### Running a Jmeter tests

Enter jmeter project folder

```
bash-3.2$ cd .././infrastructure/jmeter
bash-3.2$ mvn jmeter:jmeter
```

Results could be reviewed via files

```
[info] Raw results: .eureka/infrastructure/jmeter/target/jmeter/report/tax-170627.jtl
[info] Test report: ./eureka/infrastructure/jmeter/target/jmeter/report/tax-170627.jtl-report.html
```

## Authors

* **Andy** - *Initial work* - [PurpleBooth](https://github.com/namumba22/)


## Cation

!!! it's not configured for timeout ... that's why sometimes some exceptions with the error coud appear.


