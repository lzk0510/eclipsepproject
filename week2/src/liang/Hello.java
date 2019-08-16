package liang;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Hello {
public static void main(String[]args)
{int score=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

try {
	System.out.println("请输入该生成绩:");
	score=Integer.parseInt(br.readLine());
	
}catch(IOException e) {
}
System.out.println("该生等级为：");

if(score>=90) {
	System.out.println("优秀");
	
}else if(score>=80&&score<90) {
	System.out.println("良");
	
}else if(score>=70&&score<80) {
	System.out.println("中");
}else if(score>=60&&score<70) {
	System.out.println("及格");
	
}else {
	System.out.println("不及格");
}


}
}
