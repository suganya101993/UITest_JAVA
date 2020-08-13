Feature: Home page


  @home_page @home_page_display
  Scenario: Check page display
    Given A user navigates to HomePage
    Then Page is displayed

  @home_page @home_page_title
  Scenario: Check title
    Given A user navigates to HomePage
    Then page title is "Podium Solutions"

  @home_page @product_list
  Scenario: Check products
    Given A user navigates to HomePage
    Then product list is displayed

#    I have gone through the screen(website) and given information, thing that its not the time to automate.
#    As UI is going to keep on change so don't know the property details whats been used by development team.
#    so based on my current understanding created a automation setup just automated the page visibility and
#    done the basic setup follow for automation test.