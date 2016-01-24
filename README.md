# slf4j-example
Example program showing slf4j-api as the facade over log4j2. This is showing that:

 1) A dependency built using log4j 1.x still works
 2) A dependency built using log4j 2.x still works
 3) A project depending on (1) and (2) but using the slf4j-api(with log4j implementation) still works.
 
## log4j
This project was built using the log4j 1.x libraries. Note the dependency is marked provided so the project dependent on 
this project must provide the implementation.

## log4j2
This project was built using the log4j 2.x libraries. Note the dependencies are marked provided so teh project dependent
on this project must provided the implementations.

## slf4j-log4j2
This project depends on the slf4j-api and the log4j2 implementation of the api.  For completeness it depends on the above
two projects as well but delegates the log4j libraries to slf4j(which is backed by log4j2).  This is showing how the