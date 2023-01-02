/*โปรแกรมแลกธนบัตร */
import java.util.Scanner;

class Assignment6{
    public static void main(String[] args){
        int bank;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input money: ");
        int inputmoney = sc.nextInt();
        bank = inputmoney / 1000;
        if(bank != 0){
            System.out.println("แบงก์ 1000: "+ bank + " ใบ");
            inputmoney -= (bank * 1000);
        }
        bank = inputmoney / 500;
        if(bank != 0){
            System.out.println("แบงก์ 500: "+ bank + " ใบ");
            inputmoney -= (bank * 500);
        }
        bank = inputmoney / 100;
        if(bank != 0){
            System.out.println("แบงก์ 100: "+ bank + " ใบ");
            inputmoney -= (bank * 100);
        }
        bank = inputmoney / 50;
        if(bank != 0){
            System.out.println("แบงก์ 50: "+ bank + " ใบ");
            inputmoney -= (bank * 50);
        }
        bank = inputmoney / 20;
        if(bank != 0){
            System.out.println("แบงก์ 20: "+ bank + " ใบ");
            inputmoney -= (bank * 20);
        }
        System.out.println("เหลือเงินที่แลกเป็นธนบัตรไม่ได้: "+inputmoney+" บาท");
    }
}
