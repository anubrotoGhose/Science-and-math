import java.util.Scanner;
/**
 *This class is the starting point.
 *This class is executed to start the program
 *The program is developed by Angh.Inc©
 * @author(Anubroto Ghose) 
 * @version (1.o-20th Sept,2018)
 */
public class Start
{
    private static Input in=new Input();
    private static Output op=new Output();
    private static Start ob=new Start();
    private static Scanner sc=new Scanner(System.in);
    private void star(int s)
    {
        for(int i=0;i<s;i++)
        {
            op.print("*");
        }
        op.println("");
    }

    private static void wel()
    {
        op.println("Sci-Lab is developed ANGH.Inc"+"©");
    }

    private static void welcome()
    {
        op.println("\f");
        ob.star(100);
        ob.wel();
        ob.star(100);
        op.println("Welcome to Sci Lab");
        ob.star(100);
    }

    private static void opt()
    {
        op.println("Enter 1 for generating series");
        op.println("Enter 2 for generating a calculator");
        op.println("Enter 3 for solving linear equations with 2 unknowns");
        op.println("Enter 4 for solving a quadratic equation using formula");
        op.println("Enter 5 for maintaining statistics");
        op.println("Enter 6 for solving some scientific calculations");
        op.println("Enter 7 for knowing the terms and conditions and privacy policy of the company");
        ob.star(100);
    }

    private static void privacypolicyandtermsandcond()
    {
        op.println("Sci-Lab is developed by ANGH.Inc"+"©.");
        op.println("You are welcome to develop,discover and invent with our software.");
        op.println("We are commited to keeping your personal information safe");
        op.println("That's why Angh innovate ways to safegaurd your experience and why we personalise your experience.");
        op.println("Sci-Lab collects information to help us to give you an experience to help Science grow.");
        op.println("Also if our customer misuses the software to create a harmful device.");
        op.println("Then the customer will be blacklisted and will never be able to access services provided by ANGH.Inc");
    }

    public static void main(String args[])
    {
        op.println("\f");
        ob.welcome();
        while(true)
        {
            ob.opt();
            int ch=in.num("");
            switch(ch)
            {  
                case 1:
                Series.se();
                break;
                case 2:
                SciCalc.cal();
                break;
                case 3:
                Linear.sli();
                break;
                case 4:
                Quadratic.quad();
                break;
                case 5:
                Stats.stat();
                break;
                case 6:
                Science.dis();
                break;
                case 7:
                privacypolicyandtermsandcond();
                break;
                default:
                op.println("Invalid option");
            }
            op.println("Enter 1 to exit the program or any key to continue");
            String c=sc.nextLine();
            if(c.equals("1"))
            {
                break;
            }
        }
    }
}