class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rem;
        int temp=x;
        long ans=0;
        while(x!=0)
        {
            rem=x%10;
            ans=(ans*10)+rem;
            x=x/10;

        }
        if(temp==ans){
            return true;
        }
        else{
            return false;
        }
        }
        }
        
    
