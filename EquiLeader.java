// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N=A.length;
        int leader=0;
        int equileader=0;
        int popval=0;
        int count=0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<N-2;i++){
            leader=A[i];
            s.push(A[i+1]);
            count=1;
            for(int j=i+2;j<N;j++){
                if(!s.isEmpty() && s.peek()!=A[j]){
                    popval=s.pop();
                    //count--;
                }
                else if (s.isEmpty()){ 
                    s.push(A[j]);
                    count++;
                }else {
                    s.push(A[j]);
                    count++;
                }
                    
                if(!s.isEmpty()){
                    if(s.peek()==leader && count>((j-i+1)/2))
                     equileader++;
                }
                    
            }
                
    }
    return equileader;
}
}
