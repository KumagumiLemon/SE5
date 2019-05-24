
import java.util.Scanner;
public class IntToEng {
    //メインメソッド
	public static void main(String[] args) {
		System.out.println("0~1000までの整数を入力してください");
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
	}
	
	// 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	int o; //100の位
    	int m; //10の位
    	int l; //1の位
    	String so = ""; //英訳された100の位
    	String sm = ""; //英訳された10の位
    	String sl = ""; //英訳された1の位
    	String s;
    	
        if (n == 0) sl = "zero"; //nが0のとき
        if (n == 1000) sl = "one thousand"; //nが1000のとき
        if (100<n && n<1000) {  //nが100~1000のとき
    		o = n / 100;
  		    if (o == 1) so = "one";  
  		    if (o == 2) so = "two"; 
  		    if (o == 3) so = "three"; 
  		    if (o == 4) so = "four"; 
  	  	    if (o == 5) so = "five";
 	        if (o == 6) so = "six"; 
  		    if (o == 7) so = "seven"; 
  		    if (o == 8) so = "eight"; 
  		    if (o == 9) so = "nine"; 
  		    so += " hundred ";
  		    n -= o*100;
    	}
    	if (0<n && n<11) { //nが0~10以下のとき
    		l = n % 10;
    		if (l == 0) sl = "ten";
  		    if (l == 1) sl = "one";  
  		    if (l == 2) sl = "two"; 
  		    if (l == 3) sl = "three"; 
  		    if (l == 4) sl = "four"; 
  	  	    if (l == 5) sl = "five";
 	        if (l == 6) sl = "six"; 
  		    if (l == 7) sl = "seven"; 
  		    if (l == 8) sl = "eight"; 
  		    if (l == 9) sl = "nine"; 
        }
    	if (10<n && n<20) { //nが10~20のとき
    		l = n % 10;
    		if (l == 1) sl = "elevn";
  		    if (l == 2) sl = "twelve"; 
  		    if (l == 3) sl = "thirteen"; 
  		    if (l == 4) sl = "fourteen"; 
  		    if (l == 5) sl = "fifteen";
  		    if (l == 6) sl = "sixteen"; 
  	        if (l == 7) sl = "seventeen"; 
  	  	    if (l == 8) sl = "eighteen"; 
  		    if (l == 9) sl = "nineteen";
    	}
    	if (19<n && n<100) { //nが20~100のとき
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
  		    
    		m = n / 10;
  		    if (m == 2) sm = "twenty "; 
  		    if (m == 3) sm = "thirty ";   
  		    if (m == 4) sm = "forty "; 
            if (m == 5) sm = "fifty "; 
            if (m == 6) sm = "sixty "; 
            if (m == 7) sm = "seventy "; 
            if (m == 8) sm = "eighty "; 
            if (m == 9) sm = "ninety "; 
    	}
    	if (so == "" && sm == ""){
    		s = sl;
    	} else if (so =="") {
    		s = sm + sl;
    	} else {
    		s = so + sm + sl; 
    	}
    	return s;
    }
}
