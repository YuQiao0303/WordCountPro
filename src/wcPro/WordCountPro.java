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
			System.out.println("�������ļ���");
			return false;
		}
		else if(strArray.size()>1){
			System.out.println("���Ը�ʽwcPro.exe [input_file_name]��������");
			return false;
		}
		else{
			File file=new File(strArray.get(0));
			if(!file.exists()){
				System.out.println("���ļ�������");
				return false;
				}
			else{
				System.out.println("�ļ�Ϊ��");
				System.out.print(strArray.get(0));
				return true;
				}
			}
		/* �жϲ����Ƿ����
		 * ������������return false��(֮���������˳�)
		 * ������return true��֮����������args��0����Ϊinputfilename��
		 * ��Ө*/
	
	}

	void wcPro(String input){
		
		/*�����ʺʹ�Ƶ����info
		 * �׼��͡�����
		 * */
		
	} 
		
	void output(){    
		//��Info��������������result.txt
		//���곿
	}
	
	public static void main(ArrayList<String> args){
		IsInputValid(args);
	}
}
