#language: en

  Feature: busqueda de productos de mercado libre
    Background:
      Given que me encuentro en el buscador de mercado libre https://www.mercadolibre.com.co/

    Scenario: Busqueda productos en mercado libre
      When quiero buscar tres productos en mercado libre
        |productomeli|
        |rex toy story|
      Then valido el producto
        |productomeli|
        |Rex Dinosaurio Toy Story, Rex Original Disney Store.|

    Scenario: Busqueda productos en mercado libre
     When quiero buscar tres productos en mercado libre
       |productomeli|
       |mouse logitech pop daydream|
      Then valido el producto
        |productomeli|
        |Mouse inalámbrico Logitech POP daydream|

    Scenario: Busqueda productos en mercado libre
      When quiero buscar tres productos en mercado libre
        |productomeli|
        |fenty beauty|
      Then valido el producto
        |productomeli|
        |Fenty Beauty By Rihanna Invisimatte Blotting Polvo|

