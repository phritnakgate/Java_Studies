import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = sc.nextInt();
        if(age >= 20){
            System.out.println("You can buy alcohol!");
        }else{
            System.out.println("Sorry, you can't buy alcohol!");
        }
    }
}
