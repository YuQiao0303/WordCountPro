package wcPro;
import java.util.List;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import java.io.IOException;

import java.util.TreeMap;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Comparator;

public class WordCountPro {
//---------------------------Attributes-----------------------------//
	static TreeMap<String,Integer> Info = new TreeMap<String,Integer>(); 
//-----------------------------methods-----------------------------//
	Boolean IsInputValid(String input){
		/* �жϲ����Ƿ����
		 * ������������return false��(֮���������˳�)
		 * ������return true��֮����������args��0����Ϊinputfilename��
		 * ��Ө*/
		return true;
	}
	
//�����õķ���������ֵΪһ���Ե���Ϊkey����ƵΪvalue�ĺ����
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
		   String reg1 = "[\\s~`!#%\\^&\\*_\\.\\(\\)\\[\\]\\+=:;\"'\\|<>\\,/\\?0-9]+"; 
		   String containLetter=".*[a-z].*";
		   //String reg2 ="\\w+"; 
		   //����ȡ���ı����зָ� 
		   String words[] = line.split(reg1); 
		   for(String word: words){ 
			   if(word.equals("")||!word.matches(containLetter))
					   continue;
			   int firstIndex=0,lastIndex=word.length()-1;
			   while(word.charAt(firstIndex)=='-')//Ѱ�ҵ�һ����ĸ������
			   {
				   firstIndex++;
			   }
			   while(word.charAt(lastIndex)=='-')//Ѱ�����һ����ĸ������
			   {
				   lastIndex--;
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

		br.close();
		
	} 
		
	void output(){    
		//��Info��������������result.txt
		//���곿
	}
	
	public static void main(String[] args) throws IOException{
		//
		wcPro("test20.txt");
		System.out.println(Info);
		
	}
}
