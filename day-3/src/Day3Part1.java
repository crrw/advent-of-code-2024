import java.io.File;
import java.util.Scanner;

public class Day3Part1 {

  static int i = 0;
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(new File("day-3/input.txt"));
    StringBuilder sb = new StringBuilder();
    while(sc.hasNext()) {
      sb.append(sc.nextLine());
    }
    String s = sb.toString();

    int ans = 0;
    boolean enabled = true;

    for(i=0; i<s.length(); i++) {
      if(i+4 < s.length() && s.substring(i, i + 4).equals("do()")) {
        enabled = true;
      }
      if(i+7 < s.length() && s.substring(i, i + 7).equals("don't()")) {
        enabled = false;
      }
      if(enabled && s.charAt(i) == 'm') {
        if(s.charAt(i+1) == 'u' && s.charAt(i+2) == 'l' && s.charAt(i+3) == '(') {
          i+=4;
          int first = f(s);
          if(s.charAt(i) == ',') {
            i++;
            int second = f(s);
            if(s.charAt(i) == ')') {
              System.out.println("first=" + first + " second=" + second);
              ans += (first * second);
            }
          }
        }
      }
    }

    System.out.println(ans);
  }

  private static int f(String s) {
    int ans = 0;
    while(isDigit(s.charAt(i))) {
      ans = ans * 10 + (s.charAt(i) - '0');
      i++;
    }

    return ans;
  }

  private static boolean isDigit(char c) {
    return c >= '0' && c <= '9';
  }
}
