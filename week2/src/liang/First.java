package liang;
import java.util.Scanner;
public class First {
	public static void main(String[] args){
		int n,n6,n7,n8;
		n=n6=n7=n8=0;
		int score;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("������ѧ���ĳɼ�(0-100֮������������븺�����������):");
			
		score=sc.nextInt();
		if(score>=80&&score<=100)n8++;
		else if(score>=70&&score<80)n7++;
		else if(score>=60&&score<70)n6++;
		else if (score>=0&&score<60)n++;
		}
		while(score>=0);
		sc.close();
		System.out.println("�ɼ���80-100�ֵ�����Ϊ��"+n8);
		System.out.println("�ɼ���70-79.99�ֵ�����Ϊ"+n7);
		System.out.println("�ɼ���60-69.99�ֵ�����Ϊ"+n6);
		System.out.println("�ɼ���60�����µ�����Ϊ��"+n);






		}

}
