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
		/* 判断参数是否合理，
		 * 若不合理，报错，return false；(之后主函数退出)
		 * 若合理，return true（之后主函数中args【0】即为inputfilename）
		 * 商莹*/
		return true;
	}
	
//测试用的方法，返回值为一颗以单词为key，词频为value的红黑树
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
		   String reg1 = "[\\s~`!#%\\^&\\*_\\.\\(\\)\\[\\]\\+=:;\"'\\|<>\\,/\\?0-9]+"; 
		   String containLetter=".*[a-z].*";
		   //String reg2 ="\\w+"; 
		   //将读取的文本进行分割 
		   String words[] = line.split(reg1); 
		   for(String word: words){ 
			   if(word.equals("")||!word.matches(containLetter))
					   continue;
			   int firstIndex=0,lastIndex=word.length()-1;
			   while(word.charAt(firstIndex)=='-')//寻找第一个字母的坐标
			   {
				   firstIndex++;
			   }
			   while(word.charAt(lastIndex)=='-')//寻找最后一个字母的坐标
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
		//将Info的相关内容输出到result.txt
		//蒋雨晨
	}
	
	public static void main(String[] args) throws IOException{
		//
		wcPro("test20.txt");
		System.out.println(Info);
		
	}
}
