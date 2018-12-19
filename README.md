# JavaServices
Run this Java Services to support My Student Appplication.
This is a Spring boot project which will use in-memory database. we can check data of the table in the url http://localhost:5056/h2_console once we build and run the services successfully.
Below are the steps to run the services:-
Step-1:- open eclipse and import this project in eclipse.
Step-2:- do build.
Step-3:- do run main java application file.
This java application support two Methods:- 
1) GET : http://localhost:5056/school/v1/students
2) PUT:- http://localhost:5056/school/v1/students 
Payload for PUT Method is:-  {
        "id": 10001,
        "name": "Jitesh",
        "passportNumber": "E1234567",
        "fullTime": false
    }
Swagger Structure is in :-http://localhost:5056/v2/api-docs
