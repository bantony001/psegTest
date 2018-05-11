Feature: To Test the Name Field
	
  @test
  Scenario Outline: Verify the name field with invalid values
		Given the form is opened
		When the user enters invalid "<values>" in Name field
		Then the error should appear for Name field

    Examples:     
      | values             |
      |                    |
      | This is an invalid value to test |

	@test
  Scenario Outline: Verify the name field with invalid values
		Given the form is opened
		When the user enters valid "<values>" in Name field
		Then the error should not appear for Name field

    Examples: 
      | values             |
      | Jenny              |
      | Junior M. Mathew   |
