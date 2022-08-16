#language: en
Feature: Busqueda en mercado libre

  Background:
    Given que me encuentro en el buscador de mercado libre https://www.mercadolibre.com.co/

  Scenario: Busqueda en mercado libre
    When quiero realizar tres busquedas desde un archivo de excel
    Then valido que la cantidad de productos buscados sea 3