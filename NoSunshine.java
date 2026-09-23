public class NoSunshine
{
    public static void gone()
    {
        System.out.println("Ain't no sunshine when she's gone");
    }

    public static void away()
    {
        System.out.println("Anytime she goes away");
    }

    public static void verse(String uniqueLine1, String uniqueLine2)
    {
        gone();
        System.out.println(uniqueLine1);
        gone();
        System.out.println(uniqueLine2);
        away();
        System.out.println();
    }

      public static void know() {
         System.out.print("And " + "I know, I know, I know, I know\n".repeat(5) 
            + "I know, I know\n\n");
    }


    public static void main(String[] args)
    {
        verse("It's not warm when she's away", "And she's always gone too long");
        verse("Wonder this time where she's gone", "Wonder if she's gone to stay");
        
        know();

        System.out.println("Hey, I ought to leave young thing alone");
        System.out.println("But ain't no sunshine when she's gone, whoa-whoa");
        gone();
        System.out.println("Only darkness every day\n");

        gone();
        System.out.println("And this house just ain't no home\n");
        
        away();
        away();
        away();
        away();
    }
}
