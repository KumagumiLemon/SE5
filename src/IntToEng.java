
import java.util.Scanner;
public class IntToEng {
    //メインメソッド
	public static void main(String[] args) {
		System.out.println("99までの自然数を入力してください");
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
	}
	
	// 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	int m; //10の位
    	int l; //1の位
    	String sm; //英訳された10の位
    	String sl; //英訳された1の位
    	
    	if (n>12) { //13以上の時
    		m = n / 10;
  		  if (m == 1) sm = "teen";
  		  if (m == 2) sm = "twenty";
  		  if (m == 3) sm = "thirty"; 
  		  if (m == 4) sm = "forty"; 
          if (m == 5) sm = "fifty"; 
          if (m == 6) sm = "sixty"; 
          if (m == 7) sm = "seventy"; 
          if (m == 8) sm = "eighty"; 
          if (m == 9) sm = "ninety"; 
    	}
    	
    	l = n % 10;
		  if (l == 1) sl = "one";
		  if (l == 2) sl = "two"; 
		  if (l == 3) sl = "three"; 
		  if (l == 4) sl = "four"; 
		  if (l == 5) sl = "five";
		  if (l == 6) sl = "six"; 
		  if (l == 7) sl = "seven"; 
		  if (l == 8) sl = "eight"; 
		  if (l == 9) sl = "nine"; 
    		
    	if (n < 10)  return sl;
    	
    	if (n == 10) return "ten"; 
    	
    	if (n < 20) {
    		l = n % 10;
    		switch (l) {
    		  case 1: sl = "one"; break;
  		      case 2: sl = "two"; break;  
  		      case 3: sl = "three"; break;
  		      case 4: sl = "four"; break;
  		      case 5: sl = "five"; break;
  		      case 6: sl = "six"; break;
  		      case 7: sl = "seven"; break;  
  		      case 8: sl = "eight"; break;
  		      case 9: sl = "nine"; break;
    		}
    		return sm + sl;
    	}
    }
}
