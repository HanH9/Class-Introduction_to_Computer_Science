public class SocSecException extends Exception
{
   public SocSecException(String error)
   {
      super(error);
      System.out.println("Invalid the social security number,"+error);
   }
}
