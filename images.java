
public class images {
	private static int letter =0;
	public static String str = " ";
	public static String tried = " ";
	public static int x =0;
	public static void draw(){
		
		Main c = new Main();
		if(Strings.word.contains(Main.text2.getText()) ){
			System.out.println(str);
			

			if(str.contains(Main.text2.getText())){
				
			}else{

				str = Main.text2.getText()+str;
				Main.text1.setText(new StringBuilder(str).reverse().toString());
				letter++;
				
			}
		
		
		
		
			if(Strings.word.length() == letter){
				c.updatePic(18
						);
				Main.frame.pack();
			}
		}
		else{
			if(tried.contains(Main.text2.getText())){
				
			}else{
			tried = Main.text2.getText() +" " + tried;
			Main.text3.setText(tried);
			}
			
			c.hangState++;
			c.updatePic(c.hangState);
			Main.frame.pack();
		}
		
		
		
	}
}
