#Curso de Programación Orientada a Objetos: POO 
Proyecto que desarrolle en el curso de POO de @Platzi.
##Análisis de los objetos, clases y métodos de la aplicación Uber
Para resolver un problema como desarrollador es de gran utilidad dividirlo en subproblemas y generar un modelo que te permita implementar las soluciones en código. A lo largo de este curso analizamos Uber, una de las aplicaciones más usadas en el mundo, para entender cómo está construida. A partir de este análisis hicimos la extracción y definición de los objetos, clases y métodos que conforman la aplicación, usamos el siguiente diagrama UML para modelarla y, finalmente, usando diferentes lenguajes como Java, PHP y Python hicimos la implementación de las clases y objetos de la aplicación.

```mermaid
---
title: Uber UML
---
classDiagram
    Account <|-- Driver
    
    Car --> Driver
    Trip --> User
    Car <|-- UberX
    Car <|-- UberPool
    Car <|-- UberBlack
    Car <|-- UberVan
    Payment <|-- Cash
    Payment <|-- Card 
    Payment <|-- PayPal
    Trip *-- Car
    Trip *-- Route
    Trip *-- Payment
    Account <|-- User

    class Account{
        +int id
        +str name
        +str document 
        +str email
        +str password   
    }
    class Car{
        +int id
        +str license
        +str driver 
        +str passengers
    }
    class UberX{
        +str brand
        +str model
    }
    class UberPool{
        +str brand
        +str model
    }
    class UberBlack{
        +typeCarAccepted
        +seatsMaterial
    }
    class UberVan{
        +typeCarAccepted
        +seatsMaterial
    }
    class Trip{
        + route
        +car
        +payment
    }
    class Route{
        +origin 
        +destination
    }
    class Payment{
        +int id
        +float cost
    }
    class Card{
        +int number
        +int cvv
        +str date         
    }
    class PayPal{
        +str email
    }

```
<details>
  <summary>📕Referencias</summary>
  Si te interesa saber más sobre el curso te dejo los siguientes enlaces:
  -🔗 [Curso](https://platzi.com/cursos/oop/)
  -🔗 [Slides de la clase ](https://static.platzi.com/media/public/uploads/programacion-orientada-a-objetos-poo_c4774196-cfdb-412e-bae5-210a97d78f8b.pdf)

Quieres hacer diagramas UML como este?, [aquí](https://github.com/mermaid-js/mermaid) te dejo la herramienta que use.
  
</details>