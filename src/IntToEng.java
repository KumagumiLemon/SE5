
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
    	
    	if (n>19) { //20以上の時
    		m = n / 10;
    		switch (m) { 
    		case 2:
    			sm = "twenty";
    			break;
    		case 3:
    		}
    	}
    	
        return "";
    }
}
