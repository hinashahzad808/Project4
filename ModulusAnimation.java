public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%70 == 0 ){
				System.out.print("11111111111 \r");
			}
			else if ( i%70 == 1 ){
				System.out.print("         11111111111 \r");
			}
			else if ( i%70 == 2 ){
				System.out.print("                   11111111111 \r");
			}
			else if ( i%70 == 3 ){
				System.out.print("                             11111111111 \r");
			}
			else if ( i%70 == 4 ){
				System.out.print("                                     11111111111 \r");
			}
			else if ( i%70 == 5 ){
				System.out.print("                             11111111111 \r");
			}
			else if ( i%70 == 6 ){
				System.out.print("                  11111111111 \r");
			}
			else if ( i%70 == 7 ){
				System.out.print("        11111111111 \r");
			}
			else if ( i%70 == 8 ){
				System.out.print("11111111111 \r");
			}
			
			Thread.sleep(100);
		}
		
	}
} 