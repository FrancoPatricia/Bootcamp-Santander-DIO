# Bootcamp-Santander-DIO
Publicando API Rest na nuvem usando Spring Boot 3, Java 17 e Railway

## Diagrama de Classes

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - card: Card
    - features: Feature[]
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: Float
    - limit: Float
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Float
  }

  class News {
    - icon: String
    - description: String
  }

  User "1" -- "1" Account
  User "1" -- "1" Card
  User "1" -- "*" Feature
  User "1" -- "*" News

