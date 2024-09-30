import java.util.Scanner;
public class SocSecProcessor
{
    public static void main(String[] args)
    {
        String i = "y";
        while (i.equalsIgnoreCase("y"))
        {
            System.out.print("Name?  ");
            Scanner n = new Scanner(System.in);
            String name = n.nextLine();
            System.out.print("SSN?   ");
            String SSN = n.nextLine();
            try
            {
                if (isValid(SSN))
                {
                    System.out.println(name + " " + SSN + " " + "is void");
                }
            }
                catch(SocSecException ignored)
                {

                }

            System.out.println("Continue？");
            i = n.nextLine();
        }
    }
        public static boolean isValid(String ssn) throws SocSecException
        {
            char [] s = ssn.toCharArray();
            int length = ssn.length();
            if (length != 11)
            {
                throw new SocSecException(" wrong number of characters");
            }
            if (s[3] != s[6] || s[3]!='-')
            {
                throw new SocSecException("dashes at wrong positions");
            }
            for(int i = 0;i < 11;i++ )
            {
                if(s[i]=='-' && i!=3 && i!=6)
                {
                    throw new SocSecException("dashes at wrong positions");
                }
            }
            for(int i = 0;i < 11;i++)
            {
                if (s[i] != '-' && !Character.isDigit(ssn.charAt(i)))
                {
                    throw new SocSecException("contains a character that is not a digit");
                }
            }
            return true;
        }
    }