This repository contains source code for Spring Boot 3 Observability with Grafana Stack - Loki, Tempo, Prometheus, Grafana  
https://www.youtube.com/watch?v=PT2yZTBnUwQ  
https://programmingtechie.com/articles/spring-boot3-observability-grafana-stack

![image](https://github.com/user-attachments/assets/cb6f6bbc-24ad-4e00-8843-e234e359beea)
--------------------------------------------------------------------------------------------------------------  
# initial-commit branch

Initial micro-services code is checked-in into "initial-commit" branch (without observability):  

git clone https://github.com/LokeshJavaTech/micro-services-observability.git --branch initial-commit  
cd micro-services-observability  
docker compose up -d  

Start FraudDetectionServiceApplication  
1. GET endpoint to check fraud status by customer id: http://localhost:8081/fraud/check?customerId=101  

Start LoanServiceApplication  
1. POST endpoint to create a new loan request: http://localhost:8080/loan  
{  
"customerName" : "John",  
"customerId" : "100",  
"amount" : 10000,  
"currency" : "USD"  
}  
2. GET endpoint to get all loan requests: http://localhost:8080/loan
--------------------------------------------------------------------------------------------------------------  
# master branch

git clone https://github.com/LokeshJavaTech/micro-services-observability.git --branch master
cd micro-services-observability  

We can see all the actuator data on below endpoints:  

loan-service:
http://localhost:8080/actuator/health  
http://localhost:8080/actuator/info  
http://localhost:8080/actuator/metrics  
http://localhost:8080/actuator/prometheus  

fraud-detection-service:  
http://localhost:8081/actuator/health  
http://localhost:8081/actuator/info  
http://localhost:8081/actuator/metrics  
http://localhost:8081/actuator/prometheus  


Grafana URL: http://localhost:3000/