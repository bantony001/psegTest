Feature: To verify the form 
	
	@test
  Scenario Outline: Verify the name field with invalid values
		Given the form is opened
		When the user enters valid "<names>" in Name field
		Then the error should not appear for Name field
		Then the user enters valid "<ages>" in Age field
		Then the error should not appear for Age field
		Then the user enters valid "<password>" in Password field
		Then the error should not appear for Password field
		Then the user enters valid "<password>" in Confirm Password field
		Then the error should not appear for Confirm Password field
		Then the user enters the "<hobby>" in Hobby field
		And clicks on the Add button
		Then the entered "<hobby>" should appear above the Hobby field
		And the hobby field should disappear from the textbox

    Examples: 
      | names              | ages | password        |  hobby     |
      | Jenny Jackson      | 19   | A1234567        |  chess     |
      #| Junior M. Mathew  | 101  | A12345678901234 |  watch tv  |