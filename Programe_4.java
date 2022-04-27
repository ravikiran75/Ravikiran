import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Program_4 {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<Integer> mul=new ArrayList<>();
	for(int i=0;i<9;i++){
		mul.add(i+1);
	}
	List<Integer> al=new ArrayList<Integer>();
	 System.out.println("Enter the Numbers to get the total count of numbers which is Multiple of (1,2,3,4,5,6,7,8,9)");
	             String[] a=br.readLine().replaceAll("\\[|\\]|\\|\\s+$", "").split(",");
	              for(int i=0;i<a.length;i++){
	          	   int b=Integer.parseInt(a[i]);
	          	   al.add(b);
	             }
	              List<Integer> tcount=new ArrayList<Integer>();
	              int count=0;
	               for(int i=0;i<mul.size();i++){
	                for(int j=0;j<al.size();j++){
	    	             if((al.get(j)%mul.get(i))==0){
	    	            	 count++;
	    	             }  
	                }
	                tcount.add(count);
	                count=0;
	               }
	               System.out.print("{");
	               for(int i=0;i<mul.size();i++){
	            	   if(i<mul.size()-1){
	            	   System.out.print(mul.get(i)+": "+tcount.get(i)+", ");
	            	   }
	            	   else{
	            	   System.out.print(mul.get(i)+": "+tcount.get(i)+" ");
	            	   }
	               }
	               System.out.print("}");
                     br.close();
	               
}
}