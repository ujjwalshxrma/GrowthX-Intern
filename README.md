
# GrowthX Assignment Submission Portal

This is a Spring Boot Project Assignment Submission portal bakend for GrowthX. You can use Spring Boot to create stand-alone Java applications that can be started using java -jar or more traditional WAR deployments. We also provide a command-line tool that runs Spring scripts.

### Our primary goals are :
Users can upload assignments.
- **Users** can:
    - Register and log in.
    - Upload assignments.
Admins can accept or reject these assignments.
- **Admins** can:
    - Register and log in.
    - View assignments tagged to them.
    - Accept or reject assignments.

## Tech Stack

**Client:** Java, Springboot, Maven

**Database:** Mongodb


## Running Tests

run tests on Postman 

```bash
User Endpoint 
- `POST /register` - Register a new user.
- `POST /login` - User login.
- `POST /upload` - Upload an assignment.
- `GET /admins`- fetch all admins

Admin Endpoint
- `POST /register` - Register a new admin.
- `POST /login` - Admin login.
- `GET /assignments` - View assignments tagged to the admin.
- `POST /assignments/:id/accept` - Accept an assignment.
- `POST /assignments/:id/reject` - Reject an assignment.
```


## Modules

There are several modules in Spring Boot. Here is a quick overview:



### spring-boot

The main library providing features that support the other parts of Spring Boot. These include:

* The `SpringApplication` class, providing static convenience methods that can be used to write a stand-alone Spring Application.
  Its sole job is to create and refresh an appropriate Spring `ApplicationContext`.
* Embedded web applications with a choice of container (Tomcat, Jetty, or Undertow).
* First-class externalized configuration support.
* Convenience `ApplicationContext` initializers, including support for sensible logging defaults.



### spring-boot-autoconfigure

Spring Boot can configure large parts of typical applications based on the content of their classpath.
A single `@EnableAutoConfiguration` annotation triggers auto-configuration of the Spring context.

Auto-configuration attempts to deduce which beans a user might need. For example, if `HSQLDB` is on the classpath, and the user has not configured any database connections, then they probably want an in-memory database to be defined.
Auto-configuration will always back away as the user starts to define their own beans.



### spring-boot-starters

Starters are a set of convenient dependency descriptors that you can include in your application.
You get a one-stop shop for all the Spring and related technology you need without having to hunt through sample code and copy-paste loads of dependency descriptors.
For example, if you want to get started using Spring and JPA for database access, include the `spring-boot-starter-data-jpa` dependency in your project, and you are good to go.


### springboot-data-Mongodb

Spring Data for MongoDB is part of the umbrella Spring Data providing integration with the MongoDB document database with a wide range of server and driver versions, offering a familiar and consistent Spring based programming model while retaining store specific features and capabilities.



### spring-boot-test

This module contains core items and annotations that can be helpful when testing your application.



### spring-boot-test-autoconfigure

Like other Spring Boot auto-configuration modules, spring-boot-test-autoconfigure provides auto-configuration for tests based on the classpath.
It includes many annotations that can automatically configure a slice of your application that needs to be tested.



### spring-boot-loader

Spring Boot Loader provides the secret sauce that allows you to build a single jar file that can be launched using `java -jar`.
Generally, you will not need to use `spring-boot-loader` directly but work with the link:spring-boot-project/spring-boot-tools/spring-boot-gradle-plugin[Gradle] or link:spring-boot-project/spring-boot-tools/spring-boot-maven-plugin[Maven] plugin instead.



### spring-boot-devtools

The spring-boot-devtools module provides additional development-time features, such as automatic restarts, for a smoother application development experience.
Developer tools are automatically disabled when running a fully packaged application.


## Guides

The [Spring.io](https://spring.io) site contains several guides that show how to use Spring Boot step-by-step:

* [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot) is an introductory guide that shows you how to create an application, run it, and add some management services.
* [Building Web Services with Spring Boot mongodb](https://spring.io/projects/spring-data-mongodb) is a guide to creating a web service and also Spring Data providing integration with the MongoDB document database with a wide range of server and driver versions,

## License

Spring Boot is Open Source software released under the [Apache 2.0 License](https://www.apache.org/licenses/LICENSE-2.0.html)