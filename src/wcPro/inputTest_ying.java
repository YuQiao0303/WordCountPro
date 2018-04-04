package wcPro;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//������ָ�������������org.junit.runners.Parameterized  
@RunWith(Parameterized.class) 
public class inputTest_ying { 
	private static WordCountPro wcpro = new WordCountPro();
	static ArrayList<String>  strArray1 = new ArrayList<String> (); //wcpro.exe
	static ArrayList<String>  strArray2 = new ArrayList<String> (); //wcpro.exe G:\\test.txt -c
	static ArrayList<String>  strArray3 = new ArrayList<String> (); //wcpro.exe G:\\test.txt -c G:\\test.txt
	static ArrayList<String>  strArray4 = new ArrayList<String> (); //wcpro.exe 11
	static ArrayList<String>  strArray5 = new ArrayList<String> (); //wcpro.exe G:\\test.txt"
	static ArrayList<String>  strArray6 = new ArrayList<String> (); //wcpro.exe G:\\test.txt 111
	static ArrayList<String>  strArray7 = new ArrayList<String> (); //wcpro.exe G:\\test.txt 11 11
	static ArrayList<String>  strArray8 = new ArrayList<String> (); //wcpro.exe G:\\test.txt -c G:\\test.txt 
	static ArrayList<String>  strArray9 = new ArrayList<String> (); //wcpro.exe G:dds
	static ArrayList<String>  strArray10 = new ArrayList<String> ();//wc.pro.exe G:\\wc\\result.txt
	static ArrayList<String>  strArray11 = new ArrayList<String> (); //wcpro.exe
	static ArrayList<String>  strArray12 = new ArrayList<String> (); //wcpro.exe G:\\test.txt -c
	static ArrayList<String>  strArray13 = new ArrayList<String> (); //wcpro.exe G:\\test.txt -c G:\\test.txt
	static ArrayList<String>  strArray14 = new ArrayList<String> (); //wcpro.exe 11
	static ArrayList<String>  strArray15 = new ArrayList<String> (); //wcpro.exe G:\\test.txt"
	static ArrayList<String>  strArray16 = new ArrayList<String> (); //wcpro.exe G:\\test.txt 111
	static ArrayList<String>  strArray17 = new ArrayList<String> (); //wcpro.exe G:\\test.txt 11 11
	static ArrayList<String>  strArray18 = new ArrayList<String> (); //wcpro.exe G:\\test.txt -c G:\\test.txt 
	static ArrayList<String>  strArray19 = new ArrayList<String> (); //wcpro.exe G:dds
	static ArrayList<String>  strArray20 = new ArrayList<String> ();//wc.pro.exe G:\\wc\\result.txt

	//Ϊ���������������������ֱ����ڴ������ֵ�Ͳ����������ݡ�
	private ArrayList<String> param;  
    private static boolean expect; 
	
	@Before
	public void setUp() throws Exception {
	}
	//Ϊ����������һ�����в����Ĺ������캯������������Ϊ�ڶ��������������ļ���������ֵ
    public inputTest_ying(ArrayList<String> param, boolean expect) {  
        this.param = param;  
        this.expect = expect;  
    } 
    // Ϊ����������һ��ʹ��ע�� org.junit.runners.Parameterized.Parameters ���εģ�����ֵΪ  
    // java.util.Collection �Ĺ�����̬���������ڴ˷����г�ʼ��������Ҫ���ԵĲ����ԡ�  
    @Parameters  
    public static Collection usernameData() {  
    	 ///////////////////////////////
		 strArray2.add("G:\\input1.txt");
		 strArray2.add("-c");
		 ///////////////////////////////
		 strArray3.add("G:\\input1.txt");
		 strArray3.add("-c");
		 strArray3.add("G:\\input1.txt");
		 //////////////////////////////
		 strArray4.add("11");
		 //////////////////////////////
		 strArray5.add("input1.txt");
		 //////////////////////////////
		 strArray6.add("G:\\input1.txt");
		 strArray6.add("111");
		 //////////////////////////////
		 strArray7.add("G:\\input1.txt");
		 strArray7.add("11");
		 strArray7.add("111");
		 //////////////////////////////
		 strArray8.add("G:\\input1.txt");
		 strArray8.add("-c");
		 strArray8.add("G:\\input1.txt");
		 //////////////////////////////
		 strArray9.add("G:dds");
		 /////////////////////////////
		 strArray10.add("input2.txt");
		 /////////////////////////////
		 strArray12.add("a");
		 /////////////////////////////
		 strArray13.add("a");
		 strArray13.add("a");
		 strArray13.add("a");
		 ////////////////////////////
		 strArray14.add("G:\\input1.txt");
		 strArray14.add("a");
		 ///////////////////////////
		 strArray15.add("input2.txt");
		 ///////////////////////////
		 strArray16.add("a");
		 strArray16.add("a");
		 strArray16.add("a");
		 strArray16.add("a");
		 //////////////////////////
		 strArray17.add("G:\\input1.txt");
		 strArray17.add("G:\\input1.txt");
		 //////////////////////////
		 strArray18.add("G:\\input1.txt");
		 strArray18.add("11");
		 /////////////////////////
		 strArray19.add("G:\\input1.txt");
		 strArray19.add("-c");
		 strArray19.add("G:\\input1.txt");
		 /////////////////////////
		 strArray20.add("input1.txt");
  
        return Arrays.asList(new Object[][] { { strArray1, false}, { strArray2, false }, { strArray3, false }, { strArray4, false }, { strArray5, true }, { strArray6, false }, { strArray7, false }, { strArray8, false }, { strArray9, false }, { strArray10, true}, { strArray11, false }, { strArray12, false }, { strArray13, false }, { strArray14, false }, { strArray15, true }, { strArray16, false }, { strArray17, false }, { strArray18, false }, { strArray19, false }, { strArray20, true } });  
  
    } 
   // ��д���Է�����ʹ�ö���ı�����Ϊ�������в��ԡ�  
	@Test
	public void testIsInputValid() {		
		assertEquals(inputTest_ying.expect, WordCountPro.isInputValid(this.param));
		 }


}
