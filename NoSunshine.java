public class NoSunshine {
    static void g(){System.out.println("Ain't no sunshine when she's gone");}
    static void a(){System.out.println("Anytime she goes away");}

    static void v1(String l1, String l2){
        g(); System.out.println(l1); g(); System.out.println(l2); a(); System.out.println();
    }

    static void v2(){
        System.out.println("Wonder this time where she's gone\nWonder if she's gone to stay");
        g();
        System.out.println("And this house just ain't no home");
        a(); System.out.println();
    }
    
    static void k(){
       System.out.print("And "+"I know, ".repeat(4).trim()+"\n"+("I know, ".repeat(5).trim()+"\n").repeat(4)+"I know, I know\n\n");
    }

    public static void main(String[] args){
        v1("It's not warm when she's away", "And she's always gone too long");
        v2();
        k();
        System.out.println("Hey, I ought to leave young thing alone\nBut ain't no sunshine when she's gone, whoa-whoa");
        g();
        System.out.println("Only darkness every day\n");
        g();
        System.out.println("And this house just ain't no home\n");
        a(); a(); a(); a();
    }
}
