Feature: To Test the Name Field
	
	@test
  Scenario Outline: Verify the hobby field with invalid values
		Given the form is opened
		When the user enters the "<values>" in Hobby field
		And clicks on the Add button
		Then the entered "<values>" should appear above the Hobby field
		And the hobby field should disappear from the textbox

    Examples: 
      | values      |
      | chess       |
      | baseball    |
			| watching tv |