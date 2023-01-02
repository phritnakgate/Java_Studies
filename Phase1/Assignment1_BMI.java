import java.util.Scanner;

class Assignment1{
    public static void main(String[] args) {
        float bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Weight(kg): ");
        float weight = sc.nextFloat();
        System.out.print("Input Height(cm): ");
        float height = sc.nextFloat();
        height /= 100;
        bmi = weight / (height * height);
        System.out.println("BMI = "+bmi);
    }
}
