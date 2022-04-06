package birthday;

import java.io.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String response;

        System.out.println("Is today your birthday? (Y/N)" );
        response = input.nextLine();
        if ( response.equals( "y" ) | response.equals( "Y" ) )
        {
            System.out.println("\u001b[38;5;40m" );
            System.out.println("#     #                               ######                                                   ######                ### ");
            System.out.println("#     #   ##   #####  #####  #   #    #     # # #####  ##### #    # #####    ##   #   #        #     #   ##   #####  ### " );
            System.out.println("#     #  #  #  #    # #    #  # #     #     # # #    #   #   #    # #    #  #  #   # #         #     #  #  #  #    # ### " );
            System.out.println("####### #    # #    # #    #   #      ######  # #    #   #   ###### #    # #    #   #          #     # #    # #    #  #  " );
            System.out.println("#     # ###### #####  #####    #      #     # # #####    #   #    # #    # ######   #   ###    #     # ###### #    #     " );
            System.out.println("#     # #    # #      #        #      #     # # #   #    #   #    # #    # #    #   #   ###    #     # #    # #    # ###" );
            System.out.println("#     # #    # #      #        #      ######  # #    #   #   #    # #####  #    #   #    #     ######  #    # #####  ### " );
            System.out.println("                                                                                        #\u001b[0m" );
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
