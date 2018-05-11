Feature: To Test the Name Field
	
		@test
  Scenario Outline: Verify the age field with invalid values
		Given the form is opened
		When the user enters invalid "<values>" in Age field
		Then the error should appear for Age field

    Examples: 
      | values  |
      |         |
      | 17      |

	@test
  Scenario Outline: Verify the age field with valid values
		Given the form is opened
		When the user enters valid "<values>" in Age field
		Then the error should not appear for Age field

    Examples: 
      | values  |
      | 18      |
      | 101     |