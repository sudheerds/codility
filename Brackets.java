// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        char[] br = S.toCharArray();
        int N=br.length;
        Stack<Integer> q = new Stack<Integer>();
        int val=0;
        int popval=0;
        q.push(0);
        for(int i=0;i<N;i++){
            val=q.peek();
            switch(br[i]){
                case '{':
                    {
                        q.push(1);
                        //val=1;
                        break;
                    }
                case '(':
                    {
                        //val=2;
                        q.push(2);
                        break;
                    }
                case '[':
                    {
                        //val=3;
                        q.push(3);
                        break;
                    }
                case '}':
                    {
                        if(val==1){
                        popval=q.pop();
                        //val=a.peek();
                        }
                        else{
                        q.push(1);
                        //val=a.peek();
                        }
                        break;
                    }
                case ')':
                    {
                        if(val==2){
                        popval=q.pop();
                        //val=a.peek();
                        }
                        else{
                        q.push(2);
                        //val=a.peek();
                        }
                        break;
                    }
                case ']':
                    {
                        if(val==3){
                        popval=q.pop();
                        //val=a.peek();
                        }
                        else{
                        q.push(3);
                        //val=a.peek();
                        }
                        break;
                    }
            }
                    
        }
        
        if(q.peek()==0)
        return 1;
        else
        return 0;
                        
            
    }
    
}
