@stories
  Feature: Academy Choucair
    As a user, I want to learn how automate in screamplay at the Choucair Academy with automation course
  @scenario1
  Scenario: Search for a automation course
    Given than brandon wants to learn automation at the academy Choucair
    | strUser   | strPassword |
    | TuUsuario | TuClave     |

    When she search for the course on the Choucair Academy platform
    | strCourse               |
    | Metodología Bancolombia |
    Then she finds the course called
    | strCourse               |
    | Metodología Bancolombia |



