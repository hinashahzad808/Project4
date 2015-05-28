public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 0;
		int cats = 0;
		int dogs = 15;

		if ( people < cats )     // if statement is used as a condition that means if the condition is true then the code under the if statement will be executed otherwise not
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}

		if ( people > cats )
		{                        // The curly braces are used when the condition of if statment is true then the control enters in the body of if statement that is inside curly braces and performs the funtionality defined in the body of the statement.
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}

		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
