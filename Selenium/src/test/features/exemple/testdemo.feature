
Feature: Authentification
  en tant que administrateur je dois m auditentifier avec login et un moi de passe valide

  @tagpassant
  Scenario: authentification valide
    Given ouvrir navigateur chrome
    And saisir url
    When saisir mail
    And saisir password
    And cliquer sur le bouton login
    Then verifier page home
    

 