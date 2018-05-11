Feature: To Test the Name Field
	
		@test
  Scenario Outline: Verify the password field with invalid values
		Given the form is opened
		When the user enters invalid "<values>" in Password field
		Then the error should appear for Password field

    Examples: 
      | values           |
      |                  |
      | A123456          |
      | A123456789012345 |

	@test
  Scenario Outline: Verify the password field with valid values
		Given the form is opened
		When the user enters valid "<values>" in Password field
		Then the error should not appear for Password field

    Examples: 
      | values  	 		  |
      | A1234567        |
      | A12345678901234 |
      