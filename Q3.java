import java.util.Scanner;

class Q3 {
    public static void main(String[] args){
        int Input = 1;
        Scanner Scan = new Scanner(System.in); 
        Input = Scan.nextInt();
        if (Input < 0){
            System.out.println("What are you doing silly human? Try again");
        }
        else {
            //System.out.println("good");
            Binary(Input);
        }
    }

    public static void Binary(int Input){
        String answer = "";
        String NumberBinary = "";
        int Quotient = 1;
        while (Quotient != 0){
            Quotient = Input/2;
            NumberBinary = NumberBinary + Input%2;
            Input = Quotient;
            //System.out.println(Quotient);
        }
        //System.out.println(NumberBinary);
        for (int i = 1; i <= NumberBinary.length(); i++){
            char A = NumberBinary.charAt(NumberBinary.length()-i);
            answer = answer + A;
        }

        System.out.println("Binary: " + answer);
    }
}
 