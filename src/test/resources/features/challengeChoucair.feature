# Autor: JOSE LUIS ALONSO MERCADO
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given since Jose Is Doing A Choucair Automation Challenge

      When he Search For The Automation Challenge On The Utest Page
        | strFirstName | strLastName | strEmail                  | strMonthBirth | strDayBirth | strYearBirth | strCity     | strZipCode | strCountry | strComputer | strVersion  | strLanguage | strMobile | strModel    | strOs      | strPassword |
        | JOSE         | ALONSO      | josealonso111122@gmail.com | September     | 22          | 1991         | Barranquilla| 470004     | Colombia   | Ubuntu      | Ubuntu 19.04| Spanish     | Xiaomi    | Redmi Note 8| Android 11 | Qwerty2022*1122 |

      Then he Complete The Automation Challenge Completely
        | strComplete    |
        | Complete Setup |