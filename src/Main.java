import javax.sound.midi.Soundbank;

public class Main
{
    public static void main(String[] args)
    {
//        Exceptionthrower.selfHandled();
//
//        try
//        {
//            Exceptionthrower.notselfHandled();
//        }
//
//        catch (InterruptedException e)
//        {
//            System.exit(1);
//        }

        sillyPrint(1);

    }


    public static void sillyPrint(int i)
    {
        System.out.println("A");
        boolean b = false;
        if (i < 5)
        {
            try
            {
                methodA(15);
            }
            catch (NoSuchFuckeryException e)
            {
                System.out.println("D");
                methodB("SOVS");
                b = true;
            }

            catch (IllegalArgumentException ex)
            {
                methodC(b);
                System.out.println("E");
            }


            finally
            {
                methodD("K");
                System.out.println("H");
            }
        }

        else
        {
            System.out.println("M");
            methodB("sjov");
        }
    }

    private static void methodD(String str)
    {
        try
        {
            if (str.length() == 1)
            {
                throw new NoSuchFuckeryException("L");
            }
        }

        catch (RuntimeException r)
        {
            System.out.println(r.getMessage());
        }

        finally
        {
            System.out.println(str);
        }
    }

    private static void methodC(boolean b)
    {
        if (b)
        {
            System.out.println("I");
            return;
        }
        System.out.println("J");
    }

    private static void methodB(String str)
    {
        if (str.length() < 5 && str.startsWith("s"))
        {
            System.out.println("F");
        }

        else System.out.println("G");
    }

    private static void methodA(int i)
    {
        System.out.println(("B"));
        if (i > 7)
        {
            throw new NoSuchFuckeryException("Nonono");
        }
        System.out.println("C");
    }

}
