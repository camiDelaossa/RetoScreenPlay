#language: en
Feature: Busqueda productos en mercado libre

  Scenario Outline: <Caso><producto>
    Given que me encuentro en el buscador de mercado libre <url>
    When quiero buscar cinco productos <producto>
    Then valido el nombre del producto <validacion>

    Examples:
      | Caso             | producto                      | url                              | validacion                                                            |
      | Buscar productos | teclado logitech pop          | https://www.mercadolibre.com.co/ | Teclado bluetooth Logitech Pop Keys QWERTY Logitech Brown color blast |
      | Buscar productos | Dangerous Woman ariana grande | https://www.mercadolibre.com.co/ | Ariana Grande - Dangerous Woman (cd Original - Nuevo)                 |
      | Buscar productos | audifonos xiaomi              | https://www.mercadolibre.com.co/ | Audífonos in-ear inalámbricos Xiaomi Redmi AirDots negro              |
      | Buscar productos | iphone 13 pro max             | https://www.mercadolibre.com.co/ | Celular iPhone 13 Pro Max 128gb                                       |
      | Buscar productos | Walll-E                       | https://www.mercadolibre.com.co/ | Funko Pop Charging Wall - E (1119) Wall - E                           |