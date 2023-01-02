import java.util.Scanner;

class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Num1: ");
        int n1 = sc.nextInt();
        System.out.print("Input Num2: ");
        int n2 = sc.nextInt();

        //Arithmetic Operator
        System.out.println("Sum: "+(n1+n2));
        System.out.println("Diff: "+(n1-n2));
        System.out.println("Multiply: "+(n1*n2));
        System.out.println("Divide: "+(n1/n2));
        System.out.println("Mod: "+(n1%n2));

        //Compound Assignment
        n1+=n2;
        System.out.println("Sum: "+n1);
        n1-=n2;
        System.out.println("Diff: "+n1);
        n1*=n2;
        System.out.println("Multiply: "+n1);
        n1/=n2;
        System.out.println("Divide: "+n1);
        n1%=n2;
        System.out.println("Mod: "+n1);

        //Comparison Operator
        System.out.println("IsEqual: "+(n1==n2));
        System.out.println("IsNotEqual: "+(n1!=n2));
        System.out.println("IsMoreThan: "+(n1>n2));
        System.out.println("IsMorethanorEqual: "+(n1>=n2));
        System.out.println("IsLessthan: "+(n1<n2));
        System.out.println("IsLessthanorEqual: "+(n1<=n2));

        //Logic Opreator
        boolean a = true, b = false;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("!a: "+!a);
        System.out.println("!b: "+!b);
        System.out.println("a && b : "+(a&&b));
        System.out.println("a || b : "+(a||b));

        //Increment Decrement
        int inc = 1,dec = 1;
        System.out.println("Inc: "+inc);
        System.out.println("++Inc: "+(++inc));
        System.out.println("Inc++: "+(inc++));
        System.out.println("Dec: "+dec);
        System.out.println("++Dec: "+(++dec));
        System.out.println("Dec++: "+(dec++));

        
    }
}
