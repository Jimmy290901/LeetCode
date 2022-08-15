class Solution {
    public int romanToInt(String s) {
        int i=0;
        int ans=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)=='I'){
                if((i+1)<n && s.charAt(i+1)=='V'){
                    ans+=4; i+=2;
                }
                else if((i+1)<n && s.charAt(i+1)=='X'){
                    ans+=9; i+=2;
                }
                else{
                    ans+=1; i++;
                }
            }
             
            else if(s.charAt(i)=='V'){
                ans+=5; i++;
            }
            else if(s.charAt(i)=='X') {
                if((i+1)<n && s.charAt(i+1)=='L'){
                    ans+=40; i+=2;
                }
                else if((i+1)<n && s.charAt(i+1)=='C'){
                    ans+=90; i+=2;
                }
                else{
                    ans+=10; i++;
                }
            }
            else if(s.charAt(i)=='L'){
                ans+=50; i++;
            }
            else if(s.charAt(i)=='C'){
                if((i+1)<n && s.charAt(i+1)=='D'){
                    ans+=400; i+=2;
                }
                else if((i+1)<n && s.charAt(i+1)=='M'){
                    ans+=900; i+=2;
                }
                else{
                    ans+=100; i++;
                }
            }
            else if(s.charAt(i)=='D'){
                ans+=500; i++;
            }
            else{
                ans+=1000; i++;
            }

       }
        return ans;
    }
}