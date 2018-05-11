Feature: To Test the Name Field
	
  @test
  Scenario Outline: Verify the password and confirm password field with invalid values
		Given the form is opened
		When the user enters valid "<value1>" in Password field
		And the user enters invalid "<value2>" in Confirm Password field
		Then the error should appear for Confirm Password field

    Examples: 
      | value1  	 		  | value2  	 		  |
      | A1234567        | A1234bc         |
      | ABC345678901234 | abc345678901234 |
   
  @test
  Scenario Outline: Verify the password and confirm password field with valid values
		Given the form is opened
		When the user enters valid "<value1>" in Password field
		When the user enters valid "<value2>" in Confirm Password field
		Then the error should not appear for Confirm Password field

    Examples: 
      | value1  	 		  | value2  	 		  |
      | A1234567        | A1234567        |
      | A12345678901234 | A12345678901234 |