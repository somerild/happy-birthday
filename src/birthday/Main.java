package birthday;

import java.io.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String response;
        File f = new File( "C:\\Users\\leram\\Java\\happy-birthday\\src\\birthday\\banner.txt" );

        System.out.println("Is today your birthday? (Y/N)" );
        response = input.nextLine();
        if ( response.equals( "y" ) | response.equals( "Y" ) )
        {
            try ( BufferedReader banner = new BufferedReader( new FileReader( f ) ) )
            {
                String happyBirthday = null;
                System.out.println("\u001b[38;5;40m" );
                while((happyBirthday = banner.readLine( ) ) != null)
                {
                    System.out.println( happyBirthday );
                }
                System.out.println("\u001b[0m" );
            } catch ( IOException e )
            {
                System.out.println( e );
            }
        }
        else if ( response.equals( "n" ) | response.equals( "N" ) )
        {
            System.out.println( "Hmm...well this is awkward." );
        }
        else
        {
            System.out.println("That's probably not a valid answer." );
        }
    }
}
