import java.util.Scanner;

class Assignment3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        float n = sc.nextFloat();
        String result="";
        result = n%2 == 0 ? n+" is Even number" : n+" is Odd number";
        System.out.println(result);
    }
}
