package wcPro;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import   static  org.junit.Assert.assertEquals;
import  org.junit.Test;
import  org.junit.runner.RunWith;
import  org.junit.runners.Parameterized;
import  org.junit.runners.Parameterized.Parameters;

import java.io.IOException;
import  java.util.Arrays;
import  java.util.Collection;
import java.util.TreeMap;

//指定可以参数化运行测试用例的Runner
@RunWith(Parameterized. class )

public class lei_Test {

	//属性声明
	private   static  WordCountPro wordCount  =   new  WordCountPro();
    private   String  filename;
    private   TreeMap<String,Integer>  expect;
	
    //默认需要重写的测试类方法
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		WordCountPro.Info.clear();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//开始设置所有的测试用例的输入与输出结果
	@Parameters
    public   static  Collection data()  {
		//初始化所有的期望结果
		TreeMap<String,Integer> expect1 = new TreeMap<String,Integer>(); //测试1，2，16，17
		TreeMap<String,Integer> expect2 = new TreeMap<String,Integer>(); //测试15，18，19
		expect2.put("test",1);
		TreeMap<String,Integer> expect3 = new TreeMap<String,Integer>(); //测试20
		expect3.put("test",2);
		TreeMap<String,Integer> expect4 = new TreeMap<String,Integer>(); //测试3，4
		expect4.put("abcdefghijklmnopqrstuvwxyz",1);
		TreeMap<String,Integer> expect5 = new TreeMap<String,Integer>(); //测试5
		expect5.put("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz",1);
		TreeMap<String,Integer> expect6 = new TreeMap<String,Integer>(); //测试6，7
		expect6.put("a",1);
		expect6.put("b",1);
		expect6.put("c",1);
		expect6.put("d",1);
		expect6.put("e",1);
		expect6.put("f",1);
		expect6.put("g",1);
		expect6.put("h",1);
		expect6.put("i",1);
		expect6.put("j",1);
		expect6.put("k",1);
		expect6.put("l",1);
		expect6.put("m",1);
		expect6.put("n",1);
		expect6.put("o",1);
		expect6.put("p",1);
		expect6.put("q",1);
		expect6.put("r",1);
		expect6.put("s",1);
		expect6.put("t",1);
		expect6.put("u",1);
		expect6.put("v",1);
		expect6.put("w",1);
		expect6.put("x",1);
		expect6.put("y",1);
		expect6.put("z",1);
		TreeMap<String,Integer> expect7 = new TreeMap<String,Integer>(); //测试8
		expect7.put("a",2);
		expect7.put("b",2);
		expect7.put("c",2);
		expect7.put("d",2);
		expect7.put("e",2);
		expect7.put("f",2);
		expect7.put("g",2);
		expect7.put("h",2);
		expect7.put("i",2);
		expect7.put("j",2);
		expect7.put("k",2);
		expect7.put("l",2);
		expect7.put("m",2);
		expect7.put("n",2);
		expect7.put("o",2);
		expect7.put("p",2);
		expect7.put("q",2);
		expect7.put("r",2);
		expect7.put("s",2);
		expect7.put("t",2);
		expect7.put("u",2);
		expect7.put("v",2);
		expect7.put("w",2);
		expect7.put("x",2);
		expect7.put("y",2);
		expect7.put("z",2);
		TreeMap<String,Integer> expect8 = new TreeMap<String,Integer>(); //测试9，10
		expect8.put("l-jy",4);
		expect8.put("ljy",2);
		TreeMap<String,Integer> expect9 = new TreeMap<String,Integer>(); //测试11
		expect9.put("test",9);
		expect9.put("for-test",5);
		expect9.put("one",6);
		expect9.put("two",5);
		expect9.put("three",4);
		expect9.put("four",3);
		TreeMap<String,Integer> expect10= new TreeMap<String,Integer>(); //测试12
		expect10.put("l-jy",8);
		expect10.put("ljy",4);
		TreeMap<String,Integer> expect11= new TreeMap<String,Integer>(); //测试13
		expect11.put("l-jy",16);
		expect11.put("ljy",8);
		TreeMap<String,Integer> expect12 = new TreeMap<String,Integer>(); //测试14
		expect12.put("test",8);
		expect12.put("for-test",5);
		expect12.put("one",5);
		expect12.put("two",4);
		expect12.put("three",3);
		expect12.put("four",2);
		
		
        return  Arrays.asList( new  Object[][] {

                {"LeiTestFile/test1.txt",expect1} ,
                {"LeiTestFile/test2.txt",expect1} ,
                {"LeiTestFile/test3.txt",expect4} ,
                {"LeiTestFile/test4.txt",expect4} ,
                {"LeiTestFile/test5.txt",expect5} ,
                {"LeiTestFile/test6.txt",expect6} ,
                {"LeiTestFile/test7.txt",expect6} ,
                {"LeiTestFile/test8.txt",expect7} ,
                {"LeiTestFile/test9.txt",expect8} ,
                {"LeiTestFile/test10.txt",expect8} ,
                {"LeiTestFile/test11.txt",expect9} ,
                {"LeiTestFile/test12.txt",expect10} ,
                {"LeiTestFile/test13.txt",expect11} ,
                {"LeiTestFile/test14.txt",expect12} ,
                {"LeiTestFile/test15.txt",expect2} ,
                {"LeiTestFile/test16.txt",expect1} ,
                {"LeiTestFile/test17.txt",expect1} ,
                {"LeiTestFile/test18.txt",expect2} ,
                {"LeiTestFile/test19.txt",expect2} ,
                {"LeiTestFile/test20.txt",expect3} ,
       } );

   }
	
	public lei_Test(String filename,TreeMap<String,Integer> expect) {
		this.filename=filename;
		this.expect=expect;
	}
	
	@Test
	public void testWcPro() throws IOException {
		WordCountPro.wcPro(filename);
		assertEquals(expect,WordCountPro.Info);
	}

}
