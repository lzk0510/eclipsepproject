package liang;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Hello {
public static void main(String[]args)
{int score=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

try {
	System.out.println("����������ɼ�:");
	score=Integer.parseInt(br.readLine());
	
}catch(IOException e) {
}
System.out.println("�����ȼ�Ϊ��");

if(score>=90) {
	System.out.println("����");
	
}else if(score>=80&&score<90) {
	System.out.println("��");
	
}else if(score>=70&&score<80) {
	System.out.println("��");
}else if(score>=60&&score<70) {
	System.out.println("����");
	
}else {
	System.out.println("������");
}


}
}
