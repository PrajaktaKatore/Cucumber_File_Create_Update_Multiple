Feature: Account Management on Demoblaze Site

Scenario Outline: Account Registration 

Given    I am on the site homepage
When     I click on "Sign Up" on 
And      I enter "<email> on" 
And      I enter "<password>" 
Then     I click on "submit"  on page


Examples:
| name     	 |  email							           	| password	  |
| Prajakta   |	studymailid12@gmail.com				        | Prajakta@123     |



Scenario Outline: Login into demoblaze site with valid credentials

Given    I have demoblaze account created
When     I click on "Log in" on the "Home" Page
And      I enter "<email>" into user name field
And      I enter "<password>" into password field
Then     I click on "Log in" 


Examples:
| name     	 |  email							          	| password	  |
| Prajakta   |	studymailid12@gmail.com				        | Prajakta@12    |


Scenario Outline: Add product into cart

Given    I have logged in into demoblaze account
When     I click on "Samsung galaxy s6" on the Page
And      I click on "Add To Cart" button
Then     Product get added into Cart

