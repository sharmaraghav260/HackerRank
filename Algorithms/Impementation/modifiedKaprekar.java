import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int first = sc.nextInt();
      int last = sc.nextInt();
      String ans = "";
      for(int i=first; i<=last; i++){
        String sq = Long.toString((long)i*i);
        String _l = sq.substring(0,sq.length()/2);
        String _r = sq.substring(sq.length()/2);
        int l = (_l.isEmpty())? 0:Integer.parseInt(_l);
        int r = (_r.isEmpty())? 0:Integer.parseInt(_r);
        if((l+r) == i)
          ans += i + " ";
      }
      if(ans.isEmpty())
        System.out.print("INVALID RANGE");
      else
        System.out.print(ans);
    }
}
