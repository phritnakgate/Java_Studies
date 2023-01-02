class Variable {
    public static void main(String[] args) {
        Integer num1 = 10,num2 = 20;
        float money = 20.5f;
        //Constant
        final int WIDTH = 1920, HEIGHT = 1080;
        //String
        String a = "ABC",b = "DEF";
        //String to 
        String stri = "100";
        num1 = Integer.parseInt(stri); 
        // to string
        String n2 = String.valueOf(num2);

         {
            //Local Variable
            int c = 100;
            System.out.println(c);
         }
        
         boolean checknum2 = num2 instanceof Integer;
         

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Your Money is "+money+"Baht");

        System.out.println("WIDTH = "+ WIDTH +" HEIGHT = " + HEIGHT);
        System.out.println(a+b);
        System.out.println(n2);
        System.out.println(checknum2);

    }
}
