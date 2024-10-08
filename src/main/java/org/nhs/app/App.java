public class App
{
    public static void main(String args[])
    {
        //Example
        /*for (int number = 1; number <= 5; number++)
        {
            for (int counter = 1; counter <= 4; counter ++)
            {
                System.out.print(number);
            }
            System.out.println();
        }

        //Practice 1
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        //Practice 2
        for(int i = 1;i <= 5;i++)
        {
            for(int j = 1;j<=5-i;j++)
            {
                System.out.print(".");
            } 
            for (int j = 5-i;j<5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        //Practice 3
        for(int i = 1;i <= 5;i++)
        {
            for(int j = 1; j<=5-i; j++)
            {
                System.out.print(".");
            } 
            for (int k = 1; k<=1; k++)
            {
                System.out.print(i);
            }
            for(int l = 5-i; l <= 3; l++)
            {
                System.out.print(".");
            } 
            System.out.println();
        }*/

        //Challenge Problem
        for (int i = 1; i <= 9; i++)
        { 
            for (int j = 1; j <= 9-i; j ++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2; k ++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++)
        { 
            for (int j = 1; j <= 9-i; j ++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2; k ++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}