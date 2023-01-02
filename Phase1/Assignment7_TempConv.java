import java.util.Scanner;

class Assignment7{
    public static void main(String[] args){
        float conv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Mode 1-C to F 2-F to C: ");
        int mode = sc.nextInt();
        if(mode == 1){
            System.out.println("Input temp in Celcius: ");
            float inputtemp = sc.nextFloat(); 
            conv = ((inputtemp / 5)*9) + 32;
            System.out.println(inputtemp + " oC = " + conv + " oF");
        }
        else if(mode == 2){
            System.out.println("Input temp in Farenheit: ");
            float inputtemp = sc.nextFloat(); 
            conv = ((inputtemp - 32) / 9) * 5;
            System.out.println(inputtemp + " oF = " + conv + " oC");
        }
        else{
            System.out.println("ERROR");
        }
    }
}
