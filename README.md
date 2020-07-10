# oye-ricksha-assignment

Tech stack: maven, java 1.8, spring-boot, couchbase, restFul and lombok

How to run:

1. Run couchbase on default port : 8091 and create the configuration:
     * bucketName - test, <br>
     * Username - admin, <br>
     * bucket password - password
2. maven build: mvn clean install
3. Run application with command <code>mvn spring-boot</code>:

####Rest End-Points for Driver:

1. Add driver rating <br>
  POST URL: <code>localhost:8080/driver/rating/create</code><br>
  Request Body:<br>
  {
  	"id": "1",
  	"rating": 5,
  	"passengerName": "SS",
  	"passengerEmail":"ss@email.com",
  	"source":"delhi",
  	"destination": "noida",
  	"date": "2020-07-10",
  	"driverName": "DD",
  	"driverEmail": "DD@email.com"
  }

2. Get All Rating by Driver<br>
  GET URL: <code>localhost:8080/driver/rating/DD@email.com</code>
  
 #### Rest End-Points for Passenger:
  
  1. Add passenger rating <br>
    POST URL: <code>localhost:8080/passenger/rating/create</code><br>
    Request Body:<br>
    {
    	"id": "2",
    	"rating": 3,
    	"passengerName": "passenger name",
    	"passengerEmail":"passenger@email.com",
    	"source":"delhi",
    	"destination": "noida",
    	"date": "2020-07-10",
    	"driverName": "Driver",
    	"driverEmail": "driver@email.com"
    }
  
  2. Get All Rating By Passenger<br>
    GET URL: <code>localhost:8080/passenger/rating/passenger@email.com</code>
    
    
 ####Assumptions for Driver:-
 * Assuming email Id's are unique at the time of Driver account creation.
 * create rating with some general fields
 * get all ratings as per Driver's email
 
 ####Assumptions for Passenger:-
 * Assuming email Id's are unique at the time of Passenger account creation.
  * create rating with some general fields
  * get all ratings as per passenger's email
  
