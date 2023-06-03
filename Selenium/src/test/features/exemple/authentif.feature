@tag
Feature: cas de test authenfication

  @tag1
  Scenario Outline: Authentification cas passant et non passant
    Given ouvrir chrome
    And ouvrir URL application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir "<user>" dans le login
    And saisir "<mdp>" dans mot de passe
    And taper sur le bouton connexion
    Then verifier le resultat obtenu "<resultat>"

    Examples: 
      | user   | mdp      | resultat            |
      | Admin  | admin123 | Paul Collings       |
      | Azerty |      723 | Invalid credentials |
      | kholud | admin123 | Invalid credentials |
      | Admin  |      128 | Invalid credentials |
      
      
