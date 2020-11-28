# Java & Spring Boot - Simple REST api.

Simple Spring Boot REST api to serve students information 

## Getting Started

Clone the repository and import the project with your favorite IDE (IntelliJ, Eclipse, VSCode, ...)

### Prerequisites

Gradle 6.0+ is our build tool
Your favorite IDE.
JDK 1.8+

### Installing

After clone the repository, open the project with your IDE and run.

### Dependencies

    implementation 'spring-boot-starter-actuator'
	implementation 'spring-boot-starter-data-jpa'
	implementation 'spring-boot-starter-web'
	developmentOnly 'spring-boot-devtools'
	runtimeOnly 'h2database'
	testImplementation 'spring-boot-starter-test'

## Resources

In this API, we will create a Student Resource exposing three services using proper URIs and HTTP methods:

* Retrieve all Students - @GetMapping(“/students”)
* Get details of specific student - @GetMapping(“/students/{id}”)
* Delete a student - @DeleteMapping(“/students/{id}”)
* Create a new student - @PostMapping(“/students”)
* Update student details - @PutMapping(“/students/{id}”)

### Examples

http://localhost:8080/students

```
[
  {
    "id": 10001,
    "name": "Ranga",
    "passportNumber": "E1234567"
  },
  {
    "id": 10002,
    "name": "Ravi",
    "passportNumber": "A1234568"
  }
]
```

http://localhost:8080/students/10002

```
{
  "id": 10002,
  "name": "Ravi",
  "passportNumber": "A1234568"
}
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Spring](http://spring.io/) - The java web/rest framework used
* [graddle](https://gradle.org/) - Dependency Management
* [Java](https://jdk.java.net/15/) - Used JDK 15.0.1

## Authors

* **Leo Arruda** - *Initial work* - [Portfolio](https://leoarruda.github.io/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Inspiration
* etc