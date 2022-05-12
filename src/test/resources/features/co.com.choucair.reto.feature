@stories
Feature: buy cell phone
  As a user, I want to buy a cell phone Celular on the falabella web portal

  @scenario1
  Scenario: standard user product selection

    Given that a user enters the falabella web portal
    When the pop-up is opened the user closes it
    And he searchs Celular Samsung Galaxy A32 128GB on the portal web
    And add the bag
    And click in button Ver Bolsa de Compras
    And check item selection
    And fill form delivery
    And data for the shipment address Av Siempre Viva, type Apartamento and continue
    And continue payment
    Then Validate message payment Elige tu medio de pago

