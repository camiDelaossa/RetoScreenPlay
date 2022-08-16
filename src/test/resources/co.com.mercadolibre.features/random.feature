#language: en
Feature: Busqueda random en mercado libre

  Background:
    Given que me encuentro en el buscador de mercado libre https://www.mercadolibre.com.co/

  Scenario: Busqueda de productos en mercado libre
    When quiero ingresar a la categoria de camaras y selecciono un producto de forma aleatoria
    Then valido que fue seleccionado un producto
