
/*
Basic maven project structure

my-app/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/          # Application source code
│   │   │   └── com/
│   │   │       └── mycompany/
│   │   │           ├── domain/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           └── controller/
│   │   ├── resources/     # Configuration files, properties
│   │   │   ├── application.yml
│   │   │   └── db/
│   │   │       └── migration/
│   │   └── webapp/        # Web resources (for web apps)
│   │       └── WEB-INF/
│   └── test/
│       ├── java/          # Test source code
│       │   └── com/
│       │       └── mycompany/
│       │           ├── integration/
│       │           └── unit/
│       └── resources/     # Test-specific configuration
│           └── application-test.yml
└── target/                # Generated artifacts (excluded from VCS)


*/




/*
Layer-based packaging

com.mycompany.myapp/
├── domain/              # Business entities and value objects
│   ├── User.java
│   ├── Order.java
│   └── Product.java
├── repository/          # Data access interfaces
│   ├── UserRepository.java
│   ├── OrderRepository.java
│   └── ProductRepository.java
├── service/             # Business logic
│   ├── UserService.java
│   ├── OrderService.java
│   └── PaymentService.java
├── controller/          # API endpoints
│   ├── UserController.java
│   └── OrderController.java
└── dto/                 # Data transfer objects
    ├── UserDTO.java
    └── OrderDTO.java

*/




/*
Feature-based packaging

com.mycompany.myapp/
├── user/
│   ├── User.java                    # Domain entity
│   ├── UserRepository.java          # Data access
│   ├── UserService.java             # Business logic
│   ├── UserController.java          # API endpoint
│   └── dto/
│       ├── UserRegistrationDTO.java
│       └── UserProfileDTO.java
├── order/
│   ├── Order.java
│   ├── OrderRepository.java
│   ├── OrderService.java
│   ├── OrderController.java
│   └── dto/
│       └── OrderDTO.java
├── payment/
│   ├── Payment.java
│   ├── PaymentProcessor.java
│   ├── PaymentService.java
│   └── gateway/
│       ├── StripeGateway.java
│       └── PayPalGateway.java
└── shared/
    ├── exception/
    ├── util/
    └── config/

*/