# Crypto Prices 

Crypto Prices is a Spring Boot application that shows prices of cryptocurrencies from two different exchanges and suggests which exchange is best for buying or selling a cryptocurrency. I have built a REST API which fetches prices from different APIs and returns the results and suggestions.


```
Link to the live app
[Heroku-server](https://crypto-prices-spring.herokuapp.com/)
```

## **Note**

I have used  Public APIs of the exchanges which serve only a few requests. If the live app says **Maximum requests reached** then please wait for a few minutes and try again or try running it offline



![ScreenShot](https://github.com/sagarrapelli/crypto-prices/blob/master/screenshots/Screen%20Shot%202020-09-08%20at%2012.49.36%20PM.png)



## Steps to run
1. Clone this repository
2. If you use Maven, run the following command in a terminal window
```
./mvnw spring-boot:run
```
3. Or you can run the JAR file as follows
```
./mvnw clean install
```
4. Or open the project in an IDE and run as Java Application


## Dependencies
- Bootstrap
- JQuery
- Javascript
- HTML
- CSS
- Spring


## Rest API Endpoint

 The Spring RestController provides an enpoint
```
/price/{id}
```
 where parameter id is the cryptocurrency code. The API is capable of getting prices for many cryptocurrencies from two exchanges given their currency code.