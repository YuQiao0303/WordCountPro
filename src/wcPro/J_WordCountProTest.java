package wcPro;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import  org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class J_WordCountProTest {
	private static WordCountPro wordcount = new WordCountPro();
	private TreeMap<String,Integer> input1;
	private String input2;
	private boolean result = true;
	
	@Parameters
	public static Collection data() {
		//普通的树
		TreeMap<String,Integer> tree1 = new TreeMap<String,Integer>();
		tree1.put("miao", 1);
		tree1.put("mao", 2);
		tree1.put("mi", 3);
		tree1.put("mie", 4);
		tree1.put("mei", 5);
		tree1.put("666", 6);
		//乱序的value
		TreeMap<String,Integer> tree2 = new TreeMap<String,Integer>();
		tree2.put("beta", 1);
		tree2.put("gama", 2);
		tree2.put("sum", 3);
		tree2.put("sin", 4);
		tree2.put("mega", 5);
		tree2.put("mishi", 7);
		tree2.put("mibb", 115);
		tree2.put("sugar", 77);
		tree2.put("babe", 136);
		tree2.put("miew", 55);
		//value相同单词首字母乱序
		TreeMap<String,Integer> tree3 = new TreeMap<String,Integer>();
		tree3.put("bbduibuqi" ,1);
		tree3.put("bbbushiren",1);
		tree3.put("bbwocuole" ,1);
		tree3.put("baba",1);
		tree3.put("baby",1);
		tree3.put("babe",1);
		tree3.put("beta",1);
		tree3.put("bisides",1);
		tree3.put("actually",1);
		tree3.put("acfun",1);
		tree3.put("bilibili",1);
		//100个以上的测试
		TreeMap<String,Integer> tree4 = new TreeMap<String,Integer>();
		tree4.put("a1",101);
		tree4.put("a2",100);
		tree4.put("a3",99);
		tree4.put("a4",98);
		tree4.put("a5",97);
		tree4.put("a6",96);
		tree4.put("a7",95);
		tree4.put("a8",94);
		tree4.put("a9",93);
		tree4.put("b1",92);
		tree4.put("b2",91);
		tree4.put("b3",90);
		tree4.put("b4",89);
		tree4.put("b5",88);
		tree4.put("b6",87);
		tree4.put("b7",86);
		tree4.put("b8",85);
		tree4.put("b9",84);
		tree4.put("c1",83);
		tree4.put("c2",82);
		tree4.put("c3",81);
		tree4.put("c4",80);
		tree4.put("c5",79);
		tree4.put("c6",78);
		tree4.put("c7",77);
		tree4.put("c8",76);
		tree4.put("c9",75);
		tree4.put("d1",74);
		tree4.put("d2",73);
		tree4.put("d3",72);
		tree4.put("d4",71);
		tree4.put("d5",70);
		tree4.put("d6",69);
		tree4.put("d7",68);
		tree4.put("d8",67);
		tree4.put("d9",66);
		tree4.put("e1",65);
		tree4.put("e2",64);
		tree4.put("e3",63);
		tree4.put("e4",62);
		tree4.put("e5",61);
		tree4.put("e6",60);
		tree4.put("e7",59);
		tree4.put("e8",58);
		tree4.put("e9",57);
		tree4.put("f1",56);
		tree4.put("f2",55);
		tree4.put("f3",54);
		tree4.put("f4",53);
		tree4.put("f5",52);
		tree4.put("f6",51);
		tree4.put("f7",50);
		tree4.put("f8",49);
		tree4.put("f9",48);
		tree4.put("g1",47);
		tree4.put("g2",46);
		tree4.put("g3",45);
		tree4.put("g4",44);
		tree4.put("g5",43);
		tree4.put("g6",42);
		tree4.put("g7",41);
		tree4.put("g8",40);
		tree4.put("g9",39);
		tree4.put("h1",38);
		tree4.put("h2",37);
		tree4.put("h3",36);
		tree4.put("h4",35);
		tree4.put("h5",34);
		tree4.put("h6",33);
		tree4.put("h7",32);
		tree4.put("h8",31);
		tree4.put("h9",30);
		tree4.put("i1",29);
		tree4.put("i2",28);
		tree4.put("i3",27);
		tree4.put("i4",26);
		tree4.put("i5",25);
		tree4.put("i6",24);
		tree4.put("i7",23);
		tree4.put("i8",22);
		tree4.put("i9",21);
		tree4.put("j1",20);
		tree4.put("j2",19);
		tree4.put("j3",18);
		tree4.put("j4",17);
		tree4.put("j5",16);
		tree4.put("j6",15);
		tree4.put("j7",14);
		tree4.put("j8",13);
		tree4.put("j9",12);
		tree4.put("k1",11);
		tree4.put("k2",10);
		tree4.put("k3",9);
		tree4.put("k4",8);
		tree4.put("k5",7);
		tree4.put("k6",6);
		tree4.put("k7",5);
		tree4.put("k8",4);
		tree4.put("k9",3);
		tree4.put("l1",2);
		tree4.put("l2",1);
		tree4.put("m",1);
		tree4.put("s",1);
		tree4.put("z",1);
		//黑盒测试：
		TreeMap<String,Integer> tree5 = new TreeMap<String,Integer>();
		tree5.put("a1",101);
		tree5.put("a2",100);
		tree5.put("a3",99);
		tree5.put("a4",98);
		tree5.put("a5",97);
		tree5.put("a6",96);
		tree5.put("a7",95);
		tree5.put("a8",94);
		tree5.put("a9",93);
		tree5.put("b1",92);
		tree5.put("b2",91);
		tree5.put("b3",90);
		tree5.put("b4",89);
		tree5.put("b5",88);
		tree5.put("b6",87);
		TreeMap<String,Integer> tree6 = new TreeMap<String,Integer>();
		tree6.put("i7",23);
		tree6.put("i8",22);
		tree6.put("i9",21);
		tree6.put("j1",20);
		tree6.put("j2",19);
		tree6.put("j3",18);
		tree6.put("j4",17);
		tree6.put("j5",16);
		tree6.put("j6",15);
		tree6.put("j7",14);
		tree6.put("j8",13);
		tree6.put("j9",12);
		tree6.put("k1",11);
		tree6.put("k2",10);
		tree6.put("k3",9);
		tree6.put("k4",8);
		tree6.put("k5",7);
		tree6.put("k6",6);
		tree6.put("k7",5);
		TreeMap<String,Integer> tree7 = new TreeMap<String,Integer>();
		tree7.put("c9",75);
		tree7.put("d1",74);
		tree7.put("d2",73);
		tree7.put("d3",72);
		tree7.put("d4",71);
		tree7.put("d5",70);
		tree7.put("d6",69);
		tree7.put("d7",68);
		tree7.put("d8",67);
		tree7.put("d9",66);
		tree7.put("e1",65);
		tree7.put("e2",64);
		TreeMap<String,Integer> tree8 = new TreeMap<String,Integer>();
		tree8.put("g6",42);
		tree8.put("g7",41);
		tree8.put("g8",40);
		tree8.put("g9",39);
		tree8.put("h1",38);
		tree8.put("h2",37);
		tree8.put("h3",36);
		tree8.put("h4",35);
		tree8.put("h5",34);
		tree8.put("h6",33);
		tree8.put("h7",32);
		tree8.put("h8",31);
		TreeMap<String,Integer> tree9 = new TreeMap<String,Integer>();
		tree9.put("f6",51);
		tree9.put("f7",50);
		tree9.put("f8",49);
		tree9.put("f9",48);
		tree9.put("g1",47);
		tree9.put("g2",46);
		tree9.put("g3",45);
		TreeMap<String,Integer> tree10 = new TreeMap<String,Integer>();
		tree10.put("a3",99);
		tree10.put("a4",98);
		tree10.put("a5",97);
		tree10.put("a6",96);
		tree10.put("a7",95);
		tree10.put("a8",94);
		TreeMap<String,Integer> tree11 = new TreeMap<String,Integer>();
		tree11.put("g7",41);
		tree11.put("g8",40);
		tree11.put("g9",39);
		tree11.put("h1",38);
		tree11.put("h2",37);
		tree11.put("h3",36);
		tree11.put("h4",35);
		tree11.put("h5",34);
		TreeMap<String,Integer> tree12 = new TreeMap<String,Integer>();
		tree12.put("e5",61);
		tree12.put("e6",60);
		tree12.put("e7",59);
		tree12.put("e8",58);
		tree12.put("e9",57);
		tree12.put("f1",56);
		tree12.put("f2",55);
		TreeMap<String,Integer> tree13 = new TreeMap<String,Integer>();
		tree13.put("d8",67);
		tree13.put("d9",66);
		tree13.put("e1",65);
		tree13.put("e2",64);
		tree13.put("e3",63);
		tree13.put("e4",62);
		tree13.put("e5",61);
		tree13.put("e6",60);
		tree13.put("e7",59);
		tree13.put("e8",58);
		TreeMap<String,Integer> tree14 = new TreeMap<String,Integer>();
		tree14.put("h4",35);
		tree14.put("h5",34);
		tree14.put("h6",33);
		tree14.put("h7",32);
		TreeMap<String,Integer> tree15 = new TreeMap<String,Integer>();
		tree15.put("k4",8);
		tree15.put("k5",7);
		tree15.put("k6",6);
		tree15.put("k7",5);
		tree15.put("k8",4);
		tree15.put("k9",3);
		TreeMap<String,Integer> tree16 = new TreeMap<String,Integer>();
		tree16.put("l1",2);
		tree16.put("l2",1);
		tree16.put("m",1);
		tree16.put("s",1);
		tree16.put("z",1);
		TreeMap<String,Integer> tree17 = new TreeMap<String,Integer>();
		tree17.put("e7",59);
		tree17.put("e8",58);
		tree17.put("e9",57);
		tree17.put("f1",56);
		tree17.put("f2",55);
		tree17.put("f3",54);
		TreeMap<String,Integer> tree18 = new TreeMap<String,Integer>();
		tree18.put("c8",76);
		tree18.put("c9",75);
		tree18.put("d1",74);
		tree18.put("d2",73);
		tree18.put("d3",72);
		tree18.put("d4",71);
		tree18.put("d5",70);
		tree18.put("d6",69);
		TreeMap<String,Integer> tree19 = new TreeMap<String,Integer>();
		tree19.put("h5",34);
		tree19.put("h6",33);
		tree19.put("h7",32);
		tree19.put("h8",31);
		tree19.put("h9",30);
		tree19.put("i1",29);
		tree19.put("i2",28);
		TreeMap<String,Integer> tree20 = new TreeMap<String,Integer>();
		tree20.put("h5",34);
		tree20.put("h6",33);
		tree20.put("h7",32);
		tree20.put("h8",31);
		tree20.put("h9",30);
		tree20.put("i1",29);
		tree20.put("i2",28);
		return Arrays.asList(new Object[][] {
			{tree1 , "true/true1.txt" , true},
			{tree2 , "true/true2.txt" , true},
			{tree3 , "true/true3.txt" , true},
			{tree4 , "true/true4.txt" , true},
			{tree5 , "true/true5.txt" , true},
			{tree6 , "true/true6.txt" , true},
			{tree7 , "true/true7.txt" , true},
			{tree8 , "true/true8.txt" , true},
			{tree9 , "true/true9.txt" , true},
			{tree10 , "true/true10.txt" , true},
			{tree11 , "true/true11.txt" , true},
			{tree12 , "true/true12.txt" , true},
			{tree13 , "true/true13.txt" , true},
			{tree14 , "true/true14.txt" , true},
			{tree15 , "true/true15.txt" , true},
			{tree16 , "true/true16.txt" , true},
			{tree17 , "true/true17.txt" , true},
			{tree18 , "true/true18.txt" , true},
			{tree19 , "true/true19.txt" , true},
			{tree20 , "true/true20.txt" , true},
			
		});
	}
	
	public J_WordCountProTest(TreeMap<String,Integer> input1,String input2,boolean result) {
		this.input1 = input1;
		this.input2 = input2;
		this.result = result;
	}

	static boolean comparefile(TreeMap<String,Integer> info,String path) {
		WordCountPro.Info=info;
		WordCountPro.output();
		//比较“result.txt”与“path”内容是否相等
		try {
			File result = new File("result.txt");
			File trueRes = new File(path);
			List<String> rlist = new ArrayList();
			List tlist = new ArrayList();
			BufferedReader rbr = new BufferedReader(new FileReader(result)); 
			BufferedReader tbr = new BufferedReader(new FileReader(trueRes)); 
			String lineTxt = null;
			while((lineTxt = rbr.readLine()) != null) {
				rlist.add(lineTxt);
			}
			while((lineTxt = tbr.readLine()) != null) {
				tlist.add(lineTxt);
			}
			for(int i=0;i<rlist.size();i++) {
				if(!(rlist.get(i)).equals(tlist.get(i))){
					System.out.println("不相同的是=="+rlist.get(i));
					return false;
					}
			}
		}catch(Exception e) {
			 System.out.println("读取文件内容出错");
		}
		System.out.println("Success");
		return true;
	}
	
	@Test
	public void testComparefile() {
		//fail("Not yet implemented");
		assertEquals(result, comparefile(input1,input2));
	}

}
