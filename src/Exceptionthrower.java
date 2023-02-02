public class Exceptionthrower
{
    public static void selfHandled()
    {
        try
        {
            Thread.sleep(1000);
        }

        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

     public static void notselfHandled() throws InterruptedException
    {
        Thread.sleep(1000);
    }


}
