package liang;
import java.util.Scanner;
public class First {
	public static void main(String[] args){
		int n,n6,n7,n8;
		n=n6=n7=n8=0;
		int score;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("请输入学生的成绩(0-100之间的整数，输入负数则结束程序):");
			
		score=sc.nextInt();
		if(score>=80&&score<=100)n8++;
		else if(score>=70&&score<80)n7++;
		else if(score>=60&&score<70)n6++;
		else if (score>=0&&score<60)n++;
		}
		while(score>=0);
		sc.close();
		System.out.println("成绩在80-100分的人数为："+n8);
		System.out.println("成绩在70-79.99分的人数为"+n7);
		System.out.println("成绩在60-69.99分的人数为"+n6);
		System.out.println("成绩在60分以下的人数为："+n);






		}

}
