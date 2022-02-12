import java.util.Scanner;
/**
 * Write a description of class Linear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linear
{
    public static double slx(double a1,double b1,double c1,double a2,double b2,double c2 )
    {
        return (b1*c2-b2*c1)/(a1*b2 - a2*b1);
    }

    public static double sly(double a1,double b1,double c1,double a2,double b2,double c2 )
    {
        return (c1*a2-c2*a1)/(a1*b2 - a2*b1);
    }

    public static void sli()
    {
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            double a[]=new double[2];
            double b[]=new double[2];
            double c[]=new double[2];
            Input in=new Input();
            Output op=new Output();
            op.println("Enter the values from the 2 equations in the following format:"+'\n' +"a1x + b1y + c1=0"+'\n'+"a1x + b1y + c1=0");
            op.print("a1=");
            a[0]=in.num();
            op.print("b1=");
            b[0]=in.num();
            op.print("c1=");
            c[0]=in.num();
            op.print("a2=");
            a[1]=in.num();
            op.print("b2=");
            b[1]=in.num();
            op.print("c2=");
            c[1]=in.num();
            op.println("Solution set is {"+slx(a[0],b[0],c[0],a[1],b[1],c[1])+","+sly(a[0],b[0],c[0],a[1],b[1],c[1])+"}");
            op.println("Enter 1 to exit linear equations or press any key to continue");
            String ch=sc.nextLine();
            if(ch.equalsIgnoreCase("1"))
                break;
        }
    }
}