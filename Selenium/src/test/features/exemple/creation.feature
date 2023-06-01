@tag-creation-compte
Feature: Creation compte facebook
  @tag1
  Scenario: Creation compte facebook valide avec genre femme ou homme
    Given ouvrir navigateur chrome
    Given saisir URL "https://fr-fr.facebook.com/"
    When cliquer sur le bouton creer un compte
    And remplir prenom "khouloud"
    And remplir nom "hedhli"
    And remplir num de mobile ou e mail "khouloudhedhli.pro@gmail.com"
    And remplir  mail de confirmation "khouloudhedhli.pro@gmail.com"
    And remplir nouveau mot de passe "AZERTY123"
    And remplir date de naissance jours "6"
    And remplir date da naissance mois "5"
    And remplir date de naissance annee "1992"
    And remplir genre "femme"
    And remplir s inscrire
    Then verifier l inscription

  @tag2-personalise
  Scenario: Creation compte facebook valide avec genre personalise
    Given ouvrir navigateur chrome
    Given saisir URL "https://fr-fr.facebook.com/"
    When cliquer sur le bouton creer un compte
    And remplir prenom "khouloud"
    And remplir nom "hedhli"
    And remplir num de mobile ou e mail "khouloudhedhli.pro@gmail.com"
    And remplir  mail de confirmation "khouloudhedhli.pro@gmail.com"
    And remplir nouveau mot de passe "AZERTY123"
    And remplir date de naissance jours "6"
    And remplir date da naissance mois "5"
    And remplir date de naissance annee "1992"
    When remplir genre "personnalise" et selectionner "2"
    Then verifier l inscription


  @tag2_cas_accepter
  Scenario Outline: cas d acceptance
    Given ouvrir navigateur
    And saisir l adresse "https://fr-fr.facebook.com/"
    When cliquer sur le bouton creer un compte
    And remplir le champ nom "<nom>"
    And remplire le champ prenom  "<prenom>"
    And remlire l adresse email "<mail>"
    And remlire le mail de confirmation "<mail>"
    And saisir le mot de passe "<mdp>"
    And choisir le jour de naissance "<jdn>"
    And choisir le mois de naissance "<mdn>"
    And choisir l annee de naissance "<adn>"
    And choisir le genre  "<genre>"
    And cliquer sur s inscrire
    Then verifier la connexion 

    Examples: 
      | nom   | prenom | mail                     | mdp        | jdn | mdn | adn  | genre |
      | kais  | salah  | mohamed.salah54@gmail.fr | salah12345 |  15 |  12 | 2000 | Homme |
      | leila | fatma  | lailaaftma45@hotmail.fr  | fatma12578 |  30 |  10 | 1994 | femme |
    
  
  