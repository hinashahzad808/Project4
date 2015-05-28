
public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people ) // This is another condition statement after if that if if-cindition is not true then there is another condition elseif control moves to this and check if condition is true then its body will be executed otherwise else part will be executed
		{
			System.out.println( "We should not take the cars." );
		}
	/**	else  by removing this else part it has no effect on output as control does not enter in this part because above if condition is true and statements inside if statement is executed
		{
			System.out.println( "We can't decide." );
		}**/


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}
