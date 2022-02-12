import java.util.Scanner;
/**
 * Write a description of class SciCalc here.
 * 
 * @author (Anubroto Ghose) 
 * @version (9.0)
 */
public class SciCalc
{
    private static Input in=new Input();
    private static Output op=new Output();
    private static char operator[]={'^','/','*','%','+','-'};
    int ops;
    int no;
    SciCalc()
    {
        ops=0;
        no=0;
    }

    private String calc(String exp)
    {
        String str="";
        //op.println("Entering calc");
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)==' ')
            {
                if(str.equals("^"))
                    ops++;
                else if(str.equals("-"))
                    ops++;
                else if(str.equals("*"))
                    ops++;
                else if(str.equals("/"))
                    ops++;
                else if(str.equals("+"))
                    ops++;
                else if(str.equals("%"))
                    ops++;
                else
                    no++;
                str="";
            }
            else
            {
                str=str+exp.charAt(i);
            }
        }
        //SciCalc ob=new SciCalc();
        //op.println(no);
        //op.println(ops);
        str="";
        char o[]=new char[ops];
        double n[]=new double[no];
        if(no-ops!=1 && no==1)
        {
            op.println("Enter again\nInvalid expression");
            cal();
        }
        ops=0;
        no=0;
        try
        {
            for(int i=0;i<exp.length();i++)
            {
                if(exp.charAt(i)==' ')
                {
                    if(str.equals("-"))
                    {
                        o[ops]=str.charAt(0);
                        ops++;
                    }
                    else if(str.equals("^"))
                    {
                        o[ops]=str.charAt(0);
                        ops++;
                    }
                    else if(str.equals("*"))
                    {
                        o[ops]=str.charAt(0);
                        ops++;
                    }
                    else if(str.equals("/"))
                    {
                        o[ops]=str.charAt(0);
                        ops++;
                    }
                    else if(str.equals("+"))
                    {
                        o[ops]=str.charAt(0);
                        ops++;
                    }
                    else if(str.equals("%"))
                    {
                        o[ops]=str.charAt(0);
                        ops++;
                    }
                    else
                    {
                        n[no]=Double.parseDouble(str);
                        no++;
                    }
                    str="";
                }
                else
                {
                    str=str+exp.charAt(i);
                }
            }
        }
        catch(Exception e)
        {
            ops=0;
            no=0;
        }
        double ans=0;
        //op.println("Ans");
        try
        {
            for(int i=0;i<operator.length;i++)
            {
                for(int j=0;j<o.length;j++)
                {
                    if(operator[i]=='^'&& o[j]=='^')
                    {
                        //op.println("Hello");
                        ans=Math.pow(n[j],n[j+1]);
                        //op.println(ans);
                        String a=""+ans;
                        String f=""+n[j]+" "+"^"+" "+n[j+1];
                        //op.println(a);
                        //op.println(f);
                        exp=exp.replace(f,a);
                        // ans=i+1;
                        //op.println("^");
                    }

                    if(operator[i]=='/'&& o[j]=='/')
                    {
                        ans=n[j]/n[j+1];
                        String a=""+ans;
                        String f=""+n[j]+" "+"/"+" "+n[j+1];
                        //op.println(a);
                        //op.println(f);
                        exp=exp.replace(f,a);
                        //ans=i+1;
                    }

                    if(operator[i]=='*'&& o[j]=='*')
                    {
                        ans=n[j]*n[j+1];
                        String a=""+ans;
                        String f=""+n[j]+" "+"*"+" "+n[j+1];
                        //op.println(a);
                        //op.println(f);
                        exp=exp.replace(f,a);
                        //op.println("*");
                        //ans=i+1;
                    }

                    if(operator[i]=='+'&& o[j]=='+')
                    {
                        ans=n[j]+n[j+1];
                        String a=""+ans;
                        String f=""+n[j]+" "+"+"+" "+n[j+1];
                        //op.println(a);
                        //op.println(f);
                        exp=exp.replace(f,a);
                        //op.println(exp);
                        //ans=i+1;
                        //op.println("+");
                    }

                    if(operator[i]=='-'&& o[j]=='-')
                    {
                        ans=n[j]-n[j+1];
                        String a=""+ans;
                        String f=""+n[j]+" "+"-"+" "+n[j+1];
                        //op.println(a);
                        //op.println(f);
                        exp=exp.replace(f,a);
                        //ans=i+1;
                        //op.println("-");
                    }

                }

            }
        }
        catch(ArrayIndexOutOfBoundsException ob)
        {
            op.println("Something has gone wrong");
            op.println("Don't panic you can enter again"); 
        }
        //op.println("Coming out");
        return exp;
    }

    private static void rules()
    {
        op.println("Please enter the number in decimels only.");
        op.println("If it's a trigonmetical ratio please don't put the radians in brackets");
        op.println("Please put spaces between the numbers and operators");      
        op.println("Brackets of any kind is not allowed");
        op.println("Therefore the calculator follows odmas instead of bodmas");
    }

    private static String changing(String exp)
    {
        String str="";
        try
        {
            for(int i=0;i<exp.length();i++)
            {
                if(exp.charAt(i)==' ')
                {
                    if(str.equalsIgnoreCase("Pi"))
                    {
                        //op.println(Math.PI);
                        String p=Math.PI+"";
                        exp=exp.replace(str,p);
                    }
                    else if(str.equalsIgnoreCase("e"))
                    {
                        //op.println(Math.E);
                        String e=Math.E+"";
                        exp=exp.replace(str,e);
                    }
                    else if(str.equalsIgnoreCase("L"))
                    {
                        String e=Values.L+"";
                        exp=exp.replace(str,e);
                    }
                    else if(str.equalsIgnoreCase("G"))
                    {
                        String e=Values.G+"";
                        exp=exp.replace(str,e);
                    }
                    else if(str.startsWith("sin"))
                    {
                        double a=Double.parseDouble(str.substring(3));
                        double s=Math.sin(a);
                        exp=exp.replace(str,s+"");
                        //op.println(s);
                    }
                    else if(str.startsWith("cos"))
                    {
                        double a=Double.parseDouble(str.substring(3));
                        double s=Math.cos(a);
                        exp=exp.replace(str,s+"");
                        //op.println(s);
                    }
                    else if(str.startsWith("cot"))
                    {
                        double a=Double.parseDouble(str.substring(3));
                        double s=Math.cos(a)/Math.sin(a);;
                        exp=exp.replace(str,s+"");
                        //op.println(s);
                    }
                    else if(str.startsWith("tan"))
                    {
                        double a=Double.parseDouble(str.substring(3));
                        double s=Math.tan(a);
                        exp=exp.replace(str,s+"");
                        //op.println(s);
                    }
                    else if(str.startsWith("cosec"))
                    {
                        double a=Double.parseDouble(str.substring(5));
                        double s=1.0/Math.sin(a);
                        exp=exp.replace(str,s+"");
                        //op.println(s);
                    }
                    else if(str.startsWith("sec"))
                    {
                        double a=Double.parseDouble(str.substring(3));
                        double s=1.0/Math.cos(a);
                        exp=exp.replace(str,s+"");
                        //op.println(s);
                    }
                    str="";
                }
                else
                {
                    str=str+exp.charAt(i);
                }
            }
        }
        catch(Exception e)
        {
            op.println("You might have put something");
            cal();
        }
        return exp;
    }

    public static void cal()
    {
        String ch="";
        Scanner sc=new Scanner(System.in);
        do
        {
            op.println("Enter help if you want to know how the calculator works otherwise any character from the keyboard");
            ch=sc.nextLine();
            if(ch.equals("help"))
                rules();
            op.println("Enter expression");
            String exp=sc.nextLine();
            exp=exp+" ";
            SciCalc ob=new SciCalc();
            exp=ob.changing(exp);
            for(int i=0;i<exp.length();i++)
            {
                exp=ob.calc(exp);
            }
            exp=ob.calc(exp);
            op.println(exp);
            op.println("Enter '.' to quit calculator");
            ch=sc.nextLine();
        }while(!(ch.equals(".")));
    }
}