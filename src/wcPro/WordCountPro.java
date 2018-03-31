package wcPro;
import java.io.File;
import java.util.TreeMap;

public class WordCountPro {
//---------------------------Attributes-----------------------------//
	TreeMap Info;
//-----------------------------methods-----------------------------//
static Boolean IsInputValid(String[] input){	
		if(input.length==0){
			System.out.print("请输入文件名");
			return false;
		}
		else if(input.length>1){
			System.out.print("请以格式wcPro.exe [input_file_name]输入命令");
			return false;
		}
		else{
			File file=new File(input[0]);
			if(!file.exists()){
				System.out.print("该文件不存在");
				return false;
				}
			else{
				System.out.print("文件为：");
				System.out.print(input[0]);
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
	
	public static void main(String[] args){
		IsInputValid(args);
	}
}
