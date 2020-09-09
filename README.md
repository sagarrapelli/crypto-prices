# Crypto Prices 

Crypto Prices is a Spring Boot application that shows prices of cryptocurrencies from two different exchanges and suggests which exchange is best for buying or selling a cryptocurrency. I have built a REST API which fetches prices from different APIs and returns the results and suggestions.


### Link to the live app
[CryptoPrices](https://crypto-prices-spring.herokuapp.com/)

### Watch Demo if live app is down or max requests reached
[Demo](https://drive.google.com/file/d/1TQKHPQm89iH4XXiAUnTBT7jdzCyhVp01/view?usp=sharing)



## **Note**

I have used  Public APIs of the exchanges which serve only a few requests. If the live app says **Maximum requests reached** then please wait for a few minutes and try again or try running it offline or watch the demo




### Screenshots
- Home page
- ![Home](https://github.com/sagarrapelli/crypto-prices/blob/master/screenshots/Screen%20Shot%202020-09-08%20at%2012.49.36%20PM.png)

- Prices page
- ![Price](https://github.com/sagarrapelli/crypto-prices/blob/master/screenshots/Screen%20Shot%202020-09-08%20at%201.55.46%20PM.png)


## Steps to run
1. Clone this repository
2. If you use Maven, you can run the application using
```
./mvnw spring-boot:run
```
3. Alternatively, you can build the JAR file using command './mvnw clean package' and then run the JAR file, as follows:
```
java -jar target/crypto-prices-0.0.1-SNAPSHOT.jar
```
4. Or open the project in an IDE and run as Java Application
5. Open browser and navigate to http://localhost:8080/ to see the application 


## Dependencies
- Bootstrap
- JQuery
- Javascript
- HTML
- CSS
- Spring


## Rest API Endpoint

 The Spring RestController provides an endpoint
```
/price/{id}
```
 where parameter id is the cryptocurrency code. The API is capable of getting prices for many cryptocurrencies from two exchanges given their currency code.
