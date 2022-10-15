public class palindromeProblem {
    public static void main(String[] args) {

        isPalindrome(121);
    }
    public static boolean isPalindrome (int x ){
        if(x<0)
            return false;
        int reversed=0, number=x;
        while(number>0)
        {
            int lastnum=number%10;
            reversed=reversed*10+lastnum;
            number=number/10;


        }
        if(reversed==x)
            return true;
        else
            return false;





    }
}
