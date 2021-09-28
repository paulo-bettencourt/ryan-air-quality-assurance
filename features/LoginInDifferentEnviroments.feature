@testAll
Feature: Login with different username in different envs
  As a user i want to be able to login, and I want to be able to do it in different enviroments
  Different from the "Login" test, here we are able to create those tables of information, and on those table we can use different logins for different enviroments
  By following that template, you can use a tag to name a enviroment (test, UAT, development, production) and pass the specific data you want to use on that env

  Scenario Outline: Do the login with correct credentials
    Given i am in the login page
    Then i want to login with "<username>" and "<password>"

  @test
    Examples:
      | username | password |
      | Fake_Password | Fake_Password |

  #@uxt
    #Examples:
      #| username | password |
      #| uxt.company | Fake_Password_UXT |

  #@uat
    #Examples:
      #| username | password |
      #| uat.company | Fake_Password_UAT |

  #Scenario Outline: Do the login with wrong credentials
    #Given i am in the login page
    #Then i want to login with "<username>" and "<password>"

  #@test
    #Examples:
      #| username | password |
      #| real1 | Password1* |

  #@uxt
    #Examples:
      #| username | password |
      #| real1 | Password1* |

  #@uat
    #Examples:
      #| username | password |
      #| real1 | Password1* |