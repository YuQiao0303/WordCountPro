package wcPro;
import java.io.File;
import java.util.TreeMap;

public class WordCountPro {
//---------------------------Attributes-----------------------------//
	TreeMap Info;
//-----------------------------methods-----------------------------//
static Boolean IsInputValid(String[] input){	
		if(input.length==0){
			System.out.print("�������ļ���");
			return false;
		}
		else if(input.length>1){
			System.out.print("���Ը�ʽwcPro.exe [input_file_name]��������");
			return false;
		}
		else{
			File file=new File(input[0]);
			if(!file.exists()){
				System.out.print("���ļ�������");
				return false;
				}
			else{
				System.out.print("�ļ�Ϊ��");
				System.out.print(input[0]);
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
	
	public static void main(String[] args){
		IsInputValid(args);
	}
}
