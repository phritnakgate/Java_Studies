import java.util.Scanner;

class Assignment4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Year: ");
        int y = sc.nextInt();
        System.out.print("Choose Mode(1-BE to AD 2-AD to BE): ");
        int mode = sc.nextInt();
        if(mode == 1){
            System.out.println("BE to AD = "+(y-543));
        }else if(mode == 2){
            System.out.println("AD to BE = "+(y+543));
        }else{
            System.out.println("Input Valid Mode Pleaseee");
        }
    }
}
