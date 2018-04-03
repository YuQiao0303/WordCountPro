package wcPro;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;

public class WordCountPro {
 //---------------------------Attributes-----------------------------//
static TreeMap<String,Integer> Info=new TreeMap<String, Integer>();
//-----------------------------methods------------------------------//
	Boolean IsInputValid(String input){
		/* �жϲ����Ƿ����
		 * ������������return false��(֮���������˳�)
		 * ������return true��֮����������args��0����Ϊinputfilename��
		 * ��Ө*/
		return true;
	}

static void wcPro(String input) throws IOException{
		
		/*�����ʺʹ�Ƶ����info
		 * �׼��͡�����
		 * */
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
		   String words[] = line.split(reg1); 
		   for(String word: words){ 

			   if(word.equals(""))
					   continue;
//			   System.out.print(word);
//			   System.out.print(" : ");
//			   System.out.print(firstIndex);
//			   System.out.print(" , ");
//			   System.out.println(lastIndex);
			   int firstIndex=0,lastIndex=word.length(),len=word.length();
			   if(word.matches(containLetter)) //�������ĸ
			   {
				   for(int i=0;i<len;i++)
				   {
					   if(word.charAt(i)!='-')
					   {
						   firstIndex=i;   //Ѱ�ҵ�һ����ĸ������
						   break;
					   }
				   }
				   for(int i=len-1;i>-1;i--)
				   {
					   if(word.charAt(i)!='-')
					   {
						   lastIndex=i;   //Ѱ�����һ����ĸ������
						   break;
					   }
				   }
				   word=word.substring(firstIndex, lastIndex+1);
				   if(!Info.containsKey(word)){ 
					   Info.put(word,1); 
				   }
				   else{ 
					   Info.put(word,Info.get(word)+1); 
				   } 
				   
			   }
			   

		   } 

		} 

		br.close();
		
	} 
		
	static void output(){    
		//��Info��������������result.txt
		//���곿
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(Info.entrySet()); 
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() 
		{  
		            //��������  
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
		            if(flag>=100)
		            	break;
		        }  
				
			
			out.close();
		}catch(Exception e){
		}
		
	}
	
	static boolean comparefile(TreeMap<String,Integer> Info,String path) {
		output();
		//�Ƚϡ�result.txt���롰path�������Ƿ����
		try {
			File result = new File("result.txt");
			File trueRes = new File(path);
			List Rlist = new ArrayList();
			List Tlist = new ArrayList();
			BufferedReader Rbr = new BufferedReader(new FileReader(result)); 
			BufferedReader Tbr = new BufferedReader(new FileReader(trueRes)); 
			String lineTxt = null;
			while((lineTxt = Rbr.readLine()) != null) {
				Rlist.add(lineTxt);
			}
			while((lineTxt = Tbr.readLine()) != null) {
				Tlist.add(lineTxt);
			}
			for(int i=0;i<Rlist.size();i++) {
				if(!(Rlist.get(i)).equals(Tlist.get(i))){
					System.out.println("����ͬ����=="+Rlist.get(i));
					return false;
					}
			}
		}catch(Exception e) {
			 System.out.println("��ȡ�ļ����ݳ���");
		}
		System.out.println("Success");
		return true;
	}
	public static void main(String[] args) throws IOException{
		//
		
		
		wcPro("test.txt");
		System.out.println(Info);
		output();
		comparefile(Info ,  "true3.txt");
		
		

	}
}