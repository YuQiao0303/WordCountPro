/**
 * 
 */
package wcPro;

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
public class WCProTestYuQiao {

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
		//���ļ�����ֵ
		for(int i=0;i<n;i++)
		{
			fileName[i]="YuTest"+i+".txt";
			//System.out.println(fileName[i]);
		}
		//���ļ����ݸ�ֵ
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
		fileContent[34]="software Let's\n\rnight- night-night -night\n\r\"I I\" \"I\"\n\rTABLE1-2\n\r(see Box 3�C2).8885d_c01_016\n\ra a	a~a`a!a#a%a^a&a*a_a...a.a(a)a[a]a+a=a:a;a\"a'a|a<a>a,a/a?a0a1a2a3a4a5a6a7a8a9a";
		//д���ļ�
		for(int i=0;i<n;i++)
		{
			try 
			{
				
		        File writename = new File(fileName[i]); // ���û����Ҫ����һ���µ�output��txt�ļ�  
		        writename.createNewFile(); // �������ļ�  
		        BufferedWriter out = new BufferedWriter(new FileWriter(writename));  
		        out.write(fileContent[i]); // 
		        out.flush(); // �ѻ���������ѹ���ļ�  
		        out.close(); // ���ǵùر��ļ�  
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
	 * Test method for {@link wcPro.WordCountPro#wcPro(java.lang.String)}.
	 */
	@Parameters
	public static Collection usernameData() {  
		
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
		//expect3��
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
		//expect20.put(��);
		//expect21.put(��;
		expect22.put("a",1);
		//expect23.put(��;
		//expect24.put(��;
		expect25.put("aa",1);
		expect26.put("a",1);
		expect27.put("a",1);
		expect28.put("a",1);
		//expect29.put(��;
		//expect30.put(��;
		expect31.put("a",1);
		//expect32.put(��;
		//expect33.put(��;
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
			{"YuTest0.txt",expect0},
			{"YuTest1.txt",expect1}, 
			{"YuTest2.txt",expect2}, 
		    {"YuTest3.txt",expect3},
		    {"YuTest4.txt",expect4},
		    {"YuTest5.txt",expect5},
		    {"YuTest6.txt",expect6},
		    {"YuTest7.txt",expect7},
		    {"YuTest8.txt",expect8},
		    {"YuTest9.txt",expect9},
		    {"YuTest10.txt",expect10},
		    {"YuTest11.txt",expect11},
		    {"YuTest12.txt",expect12},
		    {"YuTest13.txt",expect13},
		    {"YuTest14.txt",expect14},
		    {"YuTest15.txt",expect15},
		    {"YuTest16.txt",expect16},
		    {"YuTest17.txt",expect17},
		    {"YuTest18.txt",expect18},
		    {"YuTest19.txt",expect19},
		    {"YuTest20.txt",expect20},
		    {"YuTest21.txt",expect21},
		    {"YuTest22.txt",expect22},
		    {"YuTest23.txt",expect23},
		    {"YuTest24.txt",expect24},
		    {"YuTest25.txt",expect25},
		    {"YuTest26.txt",expect26},
		    {"YuTest27.txt",expect27},
		    {"YuTest28.txt",expect28},
		    {"YuTest29.txt",expect29},
		    {"YuTest30.txt",expect30},
		    {"YuTest31.txt",expect31},
		    {"YuTest32.txt",expect32},
		    {"YuTest33.txt",expect33},
		    {"YuTest34.txt",expect34}
		});  
	}  
	//�������캯��
	public WCProTestYuQiao(String param,TreeMap<String,Integer> expect) {  
		this.param = param;  
		this.expect = expect;
	}  

	
	@Test
	public void testWcPro() throws IOException {
		//fail("Not yet implemented");
		System.out.println("testWcPro");
		//������Ϣ��Ԥ�ڽ����ʵ�ʽ��
		WordCountPro.wcPro(this.param);
		assertEquals("this,wrong",this.expect,WordCountPro.Info);          
		//assertEquals(expect); 
	}

}
