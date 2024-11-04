# springbootedu
SpringBoot Edu

Set of examples for introduction into Spring Boot and ideas it is based on.

Ideas to demonstrate:
* components and beans
* Inversion of Control (as Dependency Injection implemented as autowiring)
* list autowiring
* autoconfiguration with default values
* reading properties from configuration file
* REST controller
* JPA repository and queries autocreation
* MapStruct mapping

Different examples are on different branches.

* main - like it was downloaded from Spring Initializr.
* 00 - almost empty project.
* 01 - example in standard Java.
* 02 - same as above but with one Spring component
* 03 - fully springified application from branch 01
* 04 - basic REST application with one controller
* 05 - same as above but with Swagger UI and actuator
* 06 - same as above but with Open API configuration
* 07 - same as above but with database name configured making database UI easier to access
* 08 - repository, error handler and mapper added - to be split into at least two parts