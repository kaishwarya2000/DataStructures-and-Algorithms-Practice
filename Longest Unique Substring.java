import java.util.*;
public class Main {
   // enter your program here 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        uniqueString(str);
    }
    public static void uniqueString(String str){
        int i = 0, j = 0;
        String s = "";
        Set<Character> set = new HashSet<>();
        while(i < str.length()){
            char ich = str.charAt(i);
            if(!set.contains(ich)){
                set.add(ich);
                i++;
            }
            else{
                
                while(j<=i){
                    char jch = str.charAt(j);
                    if(jch == ich){
                        set.remove(jch);
                        j++;
                        set.add(ich);
                        i++;
                        break;
                    }
                    else{
                        set.remove(jch);
                        j++;
                    }
                }
            }
            String ss = str.substring(j,i);
            if(ss.length()>s.length()){
                s = str.substring(j,i); 
            }
        }
        if(s.length()>=3){
            System.out.print(s);
        }
        else{
            System.out.print(-1);
        }
    }
    
}
