import java.util.Scanner;

class Assignment5 {

    public static void main(String[] args) {
        float bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Weight(kg): ");
        float weight = sc.nextFloat();
        System.out.print("Input Height(cm): ");
        float height = sc.nextFloat();
        height /= 100;
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("BMI = " + bmi + "ต่ำกว่าเกณฑ์");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("BMI = " + bmi + "สมส่วน");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("BMI = " + bmi + "น้ำหนักเกิน");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("BMI = " + bmi + "โรคอ้วน");
        } else {
            System.out.println("BMI = " + bmi + "โรคอ้วนอันตราย");
        }

    }
}
