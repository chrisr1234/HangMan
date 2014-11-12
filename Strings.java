import java.util.Random;


public class Strings {
	private static String[] words = { "hello", "world", "i", "can","code"};
	public static String word;
	public static void init(){
		int x;
		Random ran = new Random();
		 x = ran.nextInt(5);
		
		word = words[x];
		
	}
	
	public static String ret(){
		return word;
		
	}
	
	public static String str(){
		if(word.length() == 1){
			return "-";
		}if(word.length() == 2){
			return "--";
		}if(word.length() == 3){
			return "---";
		}if(word.length() == 4){
			return "----";
		}if(word.length() == 5){
			return "-----";
		}else{
			return word;
		}
	
		
		
	}
}
