import java.util.Scanner;

class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numint;
        int sum = 0;
        while(true){
            System.out.println("Input number (type * to terminate): ");
            String numstr = sc.nextLine();
            if(numstr.contains("*")){
                System.out.println("Sum: " + sum);
                break;
            }else{
                numint = Integer.parseInt(numstr);
                sum += numint;
            }
            System.out.println("Sum: " + sum);
        }
    }
}
