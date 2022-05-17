class Solution {
    int isPalindrome(String S) {
    int ans = 0;
       for(int i=0;i<S.length();i++){
           if(S.charAt(i) != S.charAt(S.length()-1 -i)){
               return 0;
           }
       }
       return 1;
   }
};
