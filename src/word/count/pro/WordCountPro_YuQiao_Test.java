/**
 * 
 */
package word.count.pro;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import  org.junit.runners.Parameterized.Parameters;
/**
 * @author yuqiao
 *
 */
@RunWith(Parameterized.class )
public class WordCountPro_YuQiao_Test {

	/**
	 * @throws java.lang.Exception
	 */
    private String param;
    private TreeMap<String,Integer> expect;


    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int n=35;
		String fileName[] = new String[n];
		String fileContent[] = new String[n];
		//给文件名赋值
		for(int i=0;i<n;i++)
		{
			fileName[i]="YuQiaoTestFile\\YuTest"+i+".txt";
			//System.out.println(fileName[i]);
		}
		//给文件内容赋值
		fileContent[0]="a";
		fileContent[1]="";
		fileContent[2]="a\n\nb";
		fileContent[3]="-----";
		fileContent[4]="-a";
		fileContent[5]="a-";
		fileContent[6]="a\n\na";
		fileContent[7]="aaa";
		fileContent[8]="aa-";
		fileContent[9]="aa1";
		fileContent[10]="a-a";
		fileContent[11]="a--";
		fileContent[12]="a-1";
		fileContent[13]="a1a";
		fileContent[14]="a1-";
		fileContent[15]="a11";
		fileContent[16]="-aa";
		fileContent[17]="-a-";
		fileContent[18]="-a1";
		fileContent[19]="--a";
		fileContent[20]="---";
		fileContent[21]="--1";
		fileContent[22]="-1a";
		fileContent[23]="-1-";
		fileContent[24]="-11";
		fileContent[25]="1aa";
		fileContent[26]="1a-";
		fileContent[27]="1a1";
		fileContent[28]="1-a";
		fileContent[29]="1--";
		fileContent[30]="1-1";
		fileContent[31]="11a";
		fileContent[32]="11-";
		fileContent[33]="111";
		fileContent[34]="software Let's\n\rnight- night-night -night\n\r\"I I\" \"I\"\n\rTABLE1-2\n\r(see Box 3–2).8885d_c01_016\n\ra a	a~a`a!a#a%a^a&a*a_a...a.a(a)a[a]a+a=a:a;a\"a'a|a<a>a,a/a?a0a1a2a3a4a5a6a7a8a9a";
		//写入文件
		for(int i=0;i<n;i++)
		{
			try 
			{
				
		        File writename = new File(fileName[i]); // 如果没有则要建立一个新的output。txt文件  
		        writename.createNewFile(); // 创建新文件  
		        BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
		        out.write(fileContent[i]); // 
		        out.flush(); // 把缓存区内容压入文件  
		        out.close(); // 最后记得关闭文件  
				//System.out.println("already written the output.txt"); 
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		WordCountPro.Info.clear();
	}

	/**
	 * Test method for {@link word.count.pro.WordCountPro#wcPro(java.lang.String)}.
	 */
	@Parameters
	public static Collection<Object[]> usernameData() {  
		
		TreeMap<String,Integer> expect0 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect1 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect2 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect3 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect4 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect5 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect6 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect7 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect8 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect9 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect10 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect11 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect12 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect13 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect14 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect15 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect16 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect17 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect18 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect19 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect20 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect21 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect22 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect23 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect24 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect25 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect26 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect27 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect28 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect29 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect30 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect31 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect32 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect33 = new TreeMap<String, Integer>();
		TreeMap<String,Integer> expect34 = new TreeMap<String, Integer>();
		
		expect0.put("a", 1);
		//expect1.put("a", 1);
		expect2.put("a",1);
		expect2.put("b",1);
		//expect3空
		expect4.put("a",1);
		expect5.put("a",1);
		expect6.put("a",2);
		expect7.put("aaa",1);
		expect8.put("aa",1);
		expect9.put("aa",1);
		expect10.put("a-a",1);
		expect11.put("a",1);
		expect12.put("a",1);
		expect13.put("a",2);
		expect14.put("a",1);
		expect15.put("a",1);
		expect16.put("aa",1);
		expect17.put("a",1);
		expect18.put("a",1);
		expect19.put("a",1);
		//expect20.put(空);
		//expect21.put(空;
		expect22.put("a",1);
		//expect23.put(空;
		//expect24.put(空;
		expect25.put("aa",1);
		expect26.put("a",1);
		expect27.put("a",1);
		expect28.put("a",1);
		//expect29.put(空;
		//expect30.put(空;
		expect31.put("a",1);
		//expect32.put(空;
		//expect33.put(空;
		expect34.put("software",1);
		expect34.put("let",1);
		expect34.put("s",1);
		expect34.put("night",2);
		expect34.put("night-night",1);
		expect34.put("i",3);
		expect34.put("table",1);
		expect34.put("see",1);
		expect34.put("box",1);
		expect34.put("d",1);
		expect34.put("c",1);
		expect34.put("a",40);
		
		
		return Arrays.asList(new Object[][] { 
			{"YuQiaoTestFile\\YuTest0.txt",expect0},
			{"YuQiaoTestFile\\YuTest1.txt",expect1}, 
			{"YuQiaoTestFile\\YuTest2.txt",expect2}, 
		    {"YuQiaoTestFile\\YuTest3.txt",expect3},
		    {"YuQiaoTestFile\\YuTest4.txt",expect4},
		    {"YuQiaoTestFile\\YuTest5.txt",expect5},
		    {"YuQiaoTestFile\\YuTest6.txt",expect6},
		    {"YuQiaoTestFile\\YuTest7.txt",expect7},
		    {"YuQiaoTestFile\\YuTest8.txt",expect8},
		    {"YuQiaoTestFile\\YuTest9.txt",expect9},
		    {"YuQiaoTestFile\\YuTest10.txt",expect10},
		    {"YuQiaoTestFile\\YuTest11.txt",expect11},
		    {"YuQiaoTestFile\\YuTest12.txt",expect12},
		    {"YuQiaoTestFile\\YuTest13.txt",expect13},
		    {"YuQiaoTestFile\\YuTest14.txt",expect14},
		    {"YuQiaoTestFile\\YuTest15.txt",expect15},
		    {"YuQiaoTestFile\\YuTest16.txt",expect16},
		    {"YuQiaoTestFile\\YuTest17.txt",expect17},
		    {"YuQiaoTestFile\\YuTest18.txt",expect18},
		    {"YuQiaoTestFile\\YuTest19.txt",expect19},
		    {"YuQiaoTestFile\\YuTest20.txt",expect20},
		    {"YuQiaoTestFile\\YuTest21.txt",expect21},
		    {"YuQiaoTestFile\\YuTest22.txt",expect22},
		    {"YuQiaoTestFile\\YuTest23.txt",expect23},
		    {"YuQiaoTestFile\\YuTest24.txt",expect24},
		    {"YuQiaoTestFile\\YuTest25.txt",expect25},
		    {"YuQiaoTestFile\\YuTest26.txt",expect26},
		    {"YuQiaoTestFile\\YuTest27.txt",expect27},
		    {"YuQiaoTestFile\\YuTest28.txt",expect28},
		    {"YuQiaoTestFile\\YuTest29.txt",expect29},
		    {"YuQiaoTestFile\\YuTest30.txt",expect30},
		    {"YuQiaoTestFile\\YuTest31.txt",expect31},
		    {"YuQiaoTestFile\\YuTest32.txt",expect32},
		    {"YuQiaoTestFile\\YuTest33.txt",expect33},
		    {"YuQiaoTestFile\\YuTest34.txt",expect34}
		});  
	}  
	//公共构造函数
	public WordCountPro_YuQiao_Test(String param,TreeMap<String,Integer> expect) {  
		this.param = param;  
		this.expect = expect;
	}  

	
	@Test
	public void testWcPro() throws IOException {
		//fail("Not yet implemented");
		System.out.println("testWcPro");
		//报错信息，预期结果，实际结果
		WordCountPro.wcPro(this.param);
		assertEquals("this,wrong",this.expect,WordCountPro.Info);          
		//assertEquals(expect); 
	}

}
