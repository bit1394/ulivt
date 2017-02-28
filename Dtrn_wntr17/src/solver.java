import java.util.Scanner;

public class solver {

  public static void main(String[] args){
    int n, x;
    
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    
    long mult;
    mult = 1;
        
    for(int i = 0; i < n; i++ ){
      x = in.nextInt();
      mult *= prime(x);
    }  
    System.out.println(mult);
    System.out.println(mult % 1000000007);
  }
  
  static int prime (int a){
    int ret;
    ret = 0;
    for(int j = 2; j <= Math.round(Math.sqrt(a)); j++){
      if(a % j == 0 && a != j) {
        ret = 1;
        break;
        } 
      }
    System.out.println(Math.round(Math.sqrt(a)));
  if(ret != 1) ret = a;
  if(a == 0) ret = 1;
    return ret;
  }
//6 >  3 557 991 997 839 853 = 282793112
//3 > 557 991 997=             550331039
}
