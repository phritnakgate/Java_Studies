import java.util.Scanner;
class BasicIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your Full name: ");
        String name = sc.next();

        //System.out.print("Input Birth year ");
        //int birth = sc.nextInt();
        //int age = 2565 - birth;

        System.out.println("Your name is: "+name);
        //System.out.println("Your age is: "+age);
    }
    

}
