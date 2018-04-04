package wcPro;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

public class WordCountPro {
//---------------------------Attributes-----------------------------//
	TreeMap Info;
//-----------------------------methods-----------------------------//
static Boolean IsInputValid(ArrayList<String> strArray){	
		if(strArray.size()==0){
			System.out.println("请输入文件名");
			return false;
		}
		else if(strArray.size()>1){
			System.out.println("请以格式wcPro.exe [input_file_name]输入命令");
			return false;
		}
		else{
			File file=new File(strArray.get(0));
			if(!file.exists()){
				System.out.println("该文件不存在");
				return false;
				}
			else{
				System.out.println("文件为：");
				System.out.print(strArray.get(0));
				return true;
				}
			}
		/* 判断参数是否合理，
		 * 若不合理，报错，return false；(之后主函数退出)
		 * 若合理，return true（之后主函数中args【0】即为inputfilename）
		 * 商莹*/
	
	}

	void wcPro(String input){
		
		/*将单词和词频存入info
		 * 雷佳谕、余乔
		 * */
		
	} 
		
	void output(){    
		//将Info的相关内容输出到result.txt
		//蒋雨晨
	}
	
	public static void main(ArrayList<String> args){
		IsInputValid(args);
	}
}
