class Q1 {
    public static void main(String[] arg){
        //lyrics("I have a pen, I have a robot");  
        lyrics("I have a king, I have a monster");  
    }
    
   
    public static String lyrics(String str){
        String answer = "";
        
        String Object1 = str.substring(9,str.indexOf(","));
        String Object2 = (str.substring(str.lastIndexOf(" ")+1)).toUpperCase();
        char A2 = Object2.charAt(0);
        
        answer = "Uh! " + A2 + (Object2.substring(1)).toLowerCase() + " " + Object1;
        return answer;
    }
}