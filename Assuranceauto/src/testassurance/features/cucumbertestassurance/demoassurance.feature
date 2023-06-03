
@tag
Feature: Assurance auto
  en tant que administrateur je dois avoir une marque de voiture à partie d une plaque d immatriculation

  @tag1
  Scenario: autentification une plaque immatriculation valide
    Given ouvrir navigateur chrome
    And ouvrir URL "https://www.ornikar.com/assurance-auto"
    When cliquer sur le bouton j obtiens mon tarif
    And cliquer sur le bouton non
    And cliquer sur le bouton rechercher par plaque
    And remplir le champ plaque d immatriculation "DQ326HS"
    And cliquer sur le bouton confirmer
    Then verifier le resultat obtenu "<resultat>"
    