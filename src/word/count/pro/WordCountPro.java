package word.count.pro;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;

/**
 * @author ���ǡ���Ө�����곿���׼���
 *
 */
public class WordCountPro {
//---------------------------Attributes-----------------------------//
	/**һ��treemap��ľ�̬���ԣ��洢�����ļ��ĵ��ʣ���Ϊkey���ʹ�Ƶ����Ϊvalue��*/
static TreeMap<String,Integer> Info = new TreeMap<String,Integer>(); 
//-----------------------------methods-----------------------------//
/**�жϲ����Ƿ����
 * ������������return false��(֮���������˳�)
 * ������return true��֮����������args��0����Ϊinputfilename��
 * ��Ө*/
static Boolean isInputValid(ArrayList<String> strArray){

		if(strArray.size()==0){
			System.out.println("�������ļ���");
			return false;
		}else if(strArray.size()>1){
			System.out.println("���Ը�ʽwcPro.exe [input_file_name]��������");
			return false;
		}else{
			File file=new File(strArray.get(0));
			if(!file.exists()){
				System.out.println("���ļ�������");
				return false;
				}else{
				System.out.println("�ļ�Ϊ��");
				System.out.print(strArray.get(0));
				return true;
				}
			}
		}



/**�����ʺʹ�Ƶ����info
 * �׼��͡�����
 * */
static void wcPro(String input) throws IOException{
		

		File file=new File(input); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line = null; 
		//����һ��map���ϱ��浥�ʺ͵��ʳ��ֵĸ��� 
		//TreeMap<String,Integer> tm = new TreeMap<String,Integer>(); 
		//��ȡ�ļ� 
		while((line=br.readLine())!=null){ 
		   line=line.toLowerCase(); 

		   //System.out.println(line);
		   String reg1 = "[\\s~`!#%\\^&\\*_\\.\\(\\)\\[\\]\\+=:;\"'\\|<>\\,/\\?0-9]+"; 
		   String containLetter=".*[a-z].*";
		   //String reg2 ="\\w+"; 
		   //����ȡ���ı����зָ� 
		   String[] words = line.split(reg1); 
		   for(String word: words){ 
			   if("".equals(word)||!word.matches(containLetter)){
					   continue;
			   }
			  
			   int firstIndex=0,lastIndex=word.length()-1;
			   char hyphen='-';
			 //Ѱ�ҵ�һ����ĸ������
			   while(word.charAt(firstIndex)==hyphen){
				   firstIndex++;
			   }
			 //Ѱ�����һ����ĸ������
			   while(word.charAt(lastIndex)==hyphen){
				   lastIndex--;
			   }
			   word=word.substring(firstIndex, lastIndex+1);
			   if(!Info.containsKey(word)){ 
				   Info.put(word,1); 
			   }else{ 
				   Info.put(word,Info.get(word)+1); 
			   } 
		   } 

		} 

		br.close();
		
	} 
/**��Info��������������result.txt
***���곿*/
	static void output(){    

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(Info.entrySet()); 
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() 
		{  
		            //��������  
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) 
			{  
				return o2.getValue().compareTo(o1.getValue());  
		    }  
		});  
			
		try {
			File writefile= new File("result.txt");
			if(!writefile.exists()){
				writefile.createNewFile();
				}
			BufferedWriter out = new BufferedWriter(new FileWriter(writefile));
			
			int flag = 0;
			 for (Entry<String, Integer> e: list) {  
		            System.out.println(e.getKey()+":"+e.getValue());  
		            out.write(e.getKey() + " "  + e.getValue()+ "\r\n");
		            flag++;
		            if(flag>=100){
		            	break;
		            }
		        }  
				
			
			out.close();
		}catch(Exception e){
		}
		
	}	
	/**��������붯̬����
	 * �������ж�Ϊ������е���ͳ�Ʋ����
	 * ��Ө*/
	public static void main(String[] args) throws IOException{

		ArrayList<String>  strArray = new ArrayList<String> ();
		for(int i=0;i<args.length;i++){
			strArray.add(args[i]);
		}
		if(isInputValid(strArray)){
			wcPro(args[0]);
			output();
		}
	}
	
}