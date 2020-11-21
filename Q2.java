class Q2 {
    public static void main(String[] args){
        //panlindrome("A man, A plan, a canal: Panama");
        panlindrome("Amy, must I jujitsu my ma?");
    }
    
    public static boolean panlindrome(String str){
        str = str.toLowerCase();
        String Object = "";
        String ObjectReverse = "";
        for (int i = 0; i < str.length(); i++){
            char A = str.charAt(i);
            if (Character.isLetter(A)){
                Object = Object + A;
            }
            else{}
        }
        
        for (int k = 1; k <= Object.length(); k++){
            char B = Object.charAt(Object.length()-k);
            ObjectReverse = ObjectReverse + B;
        }
        if (Object.equals(ObjectReverse)){
            return true;
        }
        return false;
    }
}