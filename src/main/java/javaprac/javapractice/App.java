package javaprac.javapractice;

import org.apache.logging.log4j.*;
import java.util.*;
public class App 
{	
	private static final Logger LOG=LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
        int b=sc.nextInt();
        add2numbers(a,b);
        multiply2numbers(a, b);
        minus2numbers(a, b);
        
    }
    private static void add2numbers(int a,int b) {
    	long sum=a+b;
    	LOG.info("sum = "+sum);
    }
    private static void multiply2numbers(int a,int b) {
    	long sum=a*b;
    	LOG.info("sum = "+sum);
    }
    private static void minus2numbers(int a,int b) {
    	long sum=a-b;
    	LOG.info("sum = "+sum);
    }
}
