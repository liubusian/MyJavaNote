/**
 * package 所屬組件 (命名空間)
 * 一般命名方式為 tw.com.doman.path...(網址的倒寫)
 * 
 */
package edu.basic.First;

/**
 * 類別class 
 * public class [類別名稱] (採駝峰式命名)[字首大寫]
 * @author LiuBuSain
 *
 */
public class ClassStructure {

	/**
	 * 屬性
	 * [作用域][其他修飾詞][類別修飾詞][類別名稱] = 值;
	 */
	int a = 1;
	
	static int b = 2;
	
	/**
	 * 初始化區塊 (類別)
	 */
	static {
		//類別被使用時，會先重這邊開始執行
		System.out.println("類別載入時，將static屬性寫入記憶體，然後先執行static block\n");
		System.out.println("所以這邊可以打印出static屬性 b = "+b+"\n");
	}
	
	/**
	 * 初始化區塊(物件)
	 */
	{
		//當在實例化物件時，會先執行物件的初始化區塊
		System.out.println("實例化物件時，先執行此區塊\n");
	}
	
	/**
	 * 物件的建構子
	 * 方法名稱與class相同
	 */
	public ClassStructure() {
		//類別被實體化物件時，當物件的初始化區塊執行完後，才會執行物件的建構子
		System.out.println("實例化物件時，後執行此建構子\n");
	}
	
		
	/**
	 * main 方法 - java程式的進入點
	 * 每個java只需要一個class有main方法
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Java Class基本概念
		 * 1. 實例化以前稱為[類別]
		 * 2. 實例化以後稱為[物件]
		 * 3. static修飾詞的屬性與方法，在類別被載入時，就會被寫入記憶體
		 * 4. Non-static的屬性與方法，則是在類別被實例化成物件才會寫入記憶體
		 * 5. 實例化即是使用關鍵字 new 將類別實例成物件
		 * 類別被載入時執行的順序
		 * 1. 自最高父類別開始
		 * 2. 載入該類別的所有static屬性和方法(寫入記憶體)
		 * 3. 執行 static block (類別初始區塊) line 25 
		 * 4. 執行main方法
		 * 物件宣告後執行
		 * 1. 執行 Non-static block (物件初始區塊) [使用物件才有] line 32
		 * 2. 執行物件的建構子 [使用物件才有]
		 */
		System.out.println("程式執行時，執行程式進入點 main方法\n");
		System.out.println("-----------下面開始實例化類別成物件----------------\n");
		// cs 即為類別ClassStructure的實例化物件
		ClassStructure cs = new ClassStructure();
		System.out.println("實例化物件時，會把該物件的屬性都寫入記憶體\n");
		
		System.out.println("這行呼叫屬性a，會到記憶體中把a的值打印出來: a="+cs.a);
		
	}

}
