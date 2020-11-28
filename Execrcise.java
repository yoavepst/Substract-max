public class Execrcise 
{ 
    public static int subStrMaxC(String s, char c, int k){

        int count = 0;
        int MIN = 2;

        //Verifying the minimal vaild string
        if(s.length() >= MIN){
            for (int i = 0; i <= s.length()-1; i++){
                if(s.charAt(i) == c){
                    //Counting how many relevent chars
                    count++;
                }
            }
            //Calculate how many substrings in according to the number of chars
            if(count > 0 )
                return howManySub (k,count) ; 
        }
        return 0;
    }

    private static int howManySub (int k, int c)
    {
        //Minimal int for valid counting of how many substrings
        final int min = 1;
        if(c > min){
            //For any 'k', 'c' goes to c-(k+1), but you have to add all the substrings that were calculated  
            //beforehand what makes it an itn partial sum, while i=1 and n=c-(k+1). By developing the equation you 
            //get the aforementioned final sequence.
            return  ((k+1)*(2*c-k-2))/2; 
        }
        return 0;
    }

}