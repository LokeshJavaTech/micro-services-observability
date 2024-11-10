# micro-services-observability
This repository contains source code for Spring Boot 3 Observability with Grafana Stack - Loki, Tempo, Prometheus, Grafana

Initial micro-services code is checked-in into initial-commit branch (without observability):

cd micro-services-observability
docker compose up -d

Start FraudDetectionServiceApplication
GET http://localhost:8081/fraud/check?customerId=101

Start LoanServiceApplication
POST http://localhost:8080/loan
{
"customerName" : "John",
"customerId" : "100",
"amount" : 10000,
"currency" : "USD"
}

--------------------------------------------------------------------------------------------------------------
