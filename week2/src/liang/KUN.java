package liang;

import javax.print.attribute.standard.PrinterLocation;

public class KUN{
	public static void main(String[] args){
		int x=88;
		int y=89;
		String s1=Integer.toString(x);
		String s2=Integer.toString(y);
		System.out.println("s1="+s1+"s2="+s2);
        String s3=s1+s2;
        System.out.println("s3="+s3);
        
        double n=88;
        double m=89;
        String l1=Double.toString(n);
        String l2=Double.toString(m);
        System.out.println("l1="+l1+"l2="+l2);
        String l3=l1+l2;
        System.out.println("l3="+l3);
        
        float p=88;
        float q=89;
        String k1=Float.toString(p);
        String k2=Float.toString(q);
        System.out.println("k1="+k1+"k2="+k2);
        String k3=k1+k2;
        System.out.println("k3="+13);
}
}