| ![Architecture](./documents/images/archunit-logo.png) | ![Architecture2](./documents/images/spring-boot.webp) |
| ------------- | ------------- | 
# ArchUnit and Springboot Hello World Project
This is the first project to understand how ArchTest framework can be used within a springboot project. 
## Test Three Layers Architecture 
The project is a simple three-layered spring boot application includes controller, service, and repository layers.   
To test the architecture that this tree-layers is respected or not look at this code
```java
layeredArchitecture()
                .layer("Controller").definedBy("..controller..")
                .layer("Service").definedBy("..service..")
                .layer("Repository").definedBy("..repository..")

                .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
                .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller")
                .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service")
                .check(importedClasses);
```
When you execute the test, everything is ok. But when you add this block of code into BookController class and then run the test again, you find that you have not respected the three-layers rule.
```java
@Autowired
     private BookRepository bookRepository;
```
Because you are not allowed to use repository layer's classes within controller layer's classes.