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
	
	/**
	 * 初始化區塊 (類別)
	 */
	static {
		//類別被實體化成物件時，會先重這邊開始執行
	}
	
	/**
	 * 初始化區塊(物件)
	 */
	{
		//當執行完類別的初始化區塊，才會執行物件的初始化區塊
	}
	
	/**
	 * 物件的建構子
	 * 方法名稱與class相同
	 */
	public ClassStructure() {
		//類別被實體化物件時，當物件的初始化區塊執行完後，才會執行物件的建構子
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
		 * Class 執行的順序
		 * 1. 自最高父類別開始
		 * 2. 載入該類別的所有static屬性和方法(寫入記憶體)
		 * 3. 執行 static block (類別初始區塊) line 25 
		 * 4. 執行 Non-static block (物件初始區塊) [使用物件才有] line 32
		 * 5. 執行物件的建構子 [使用物件才有]
		 * 6. 執行main方法
		 */
		System.out.println("認識JAVA程式語言基本概念");

	}

}
