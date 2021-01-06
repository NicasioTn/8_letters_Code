import java.util.Scanner ;
class CaLanDaOfDec
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of Month : ");
        int num = in.nextInt();
        int day = num % 7 ;
        String x = " " ;
        if (day == 1) 
        {
            x = " Monday ";
        }
        else if (day == 2)
        {
            x = " Tuesday ";
        }
        else if (day == 3)
        {
            x = " Wednesday ";
        }
        else if (day == 4)
        {
            x = " Thursday ";
        }
        else if (day == 5)
        {
            x = " Friday ";
        }
        else if (day == 6)
        {
            x = " Saterday ";
        }
        else 
        {
            x = " Sunday ";
        }
        System.out.println(num + x + "of December");
    }
}