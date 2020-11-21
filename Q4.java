import java.util.Scanner;

class Q4 {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);

        String str = Scan.nextLine();
        PigLatin(str);
    }

    public static void PigLatin(String str){
        String answer = "";
        String Object = "";
        while (str.indexOf(" ") > 0){
            Object = str.substring(0,str.indexOf(" "));
            if (Object.length() >= 3){
                answer = answer + Object.substring(1) + Object.charAt(0) + "ay" + " ";
            }
            else {
                answer = answer + Object + " ";
            }
            str = str.substring(str.indexOf(" ") + 1);
        }
        //System.out.println(str);
        //System.out.println(answer);
        if (str.length() >= 3){
            answer = answer + str.substring(1) + str.charAt(0) + "ay" + " ";
        }
        else {
            answer = answer + str + " ";
        }
        System.out.println(answer);
    }     
 }
