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
		/* 判断参数是否合理，
		 * 若不合理，报错，return false；(之后主函数退出)
		 * 若合理，return true（之后主函数中args【0】即为inputfilename）
		 * 商莹*/
		return true;
	}

static void wcPro(String input) throws IOException{
		
		/*将单词和词频存入info
		 * 雷佳谕、余乔
		 * */
		File file=new File(input); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line = null; 
		//定义一个map集合保存单词和单词出现的个数 
		//TreeMap<String,Integer> tm = new TreeMap<String,Integer>(); 
		//读取文件 
		while((line=br.readLine())!=null){ 
		   line=line.toLowerCase(); 
		   //System.out.println(line);
		   String reg1 = "[\\s~`!#%\\^&\\*_\\.\\(\\)\\[\\]\\+=:;\"'\\|<>\\,/\\?0-9]+"; 
		   String containLetter=".*[a-z].*";
		   //String reg2 ="\\w+"; 
		   //将读取的文本进行分割 
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
			   if(word.matches(containLetter)) //如果含字母
			   {
				   for(int i=0;i<len;i++)
				   {
					   if(word.charAt(i)!='-')
					   {
						   firstIndex=i;   //寻找第一个字母的坐标
						   break;
					   }
				   }
				   for(int i=len-1;i>-1;i--)
				   {
					   if(word.charAt(i)!='-')
					   {
						   lastIndex=i;   //寻找最后一个字母的坐标
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
		//将Info的相关内容输出到result.txt
		//蒋雨晨
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(Info.entrySet()); 
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() 
		{  
		            //升序排序  
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
		//比较“result.txt”与“path”内容是否相等
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
					System.out.println("不相同的是=="+Rlist.get(i));
					return false;
					}
			}
		}catch(Exception e) {
			 System.out.println("读取文件内容出错");
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