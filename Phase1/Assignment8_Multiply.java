import java.util.Scanner;

class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 12; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
