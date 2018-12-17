# JavaServices
Run Java Services to support My Application
This is a Spring boot project which will use in-memory database. we can check data of the table in the url http://localhost:5056/h2_console once we build and run the services successfully.
Below are the steps to run the services:-
Step-1:- open eclipse and import this project in eclipse.
Step-2:- Build it
Step-3:- run main application file.
After step-3 , plese run http://localhost:5056/school/v1/students in your borser and check whether you are able to fetch the data or not.
We have two method in this services:- 
1) GET : http://localhost:5056/school/v1/students
2) PUT:- http://localhost:5056/school/v1/students 
Payload for PUT Method is:-  {
        "id": 10001,
        "name": "Jitesh",
        "passportNumber": "E1234567",
        "fullTime": false
    }
Swagger Structure is in :-http://localhost:5056/v2/api-docs
