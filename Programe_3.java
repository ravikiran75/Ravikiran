import java.util.Scanner;

public class Program_3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Integer");
	int j=1;
	try{
	int n=scan.nextInt();
	for(int i=1;i<=n;i++){
		if(i==n){
			break;
		}
		System.out.print(j+" ");
		j=j+2;
	}
	}catch(Exception ex){
		for(int i=1;i>0;i++){
			System.out.print(j+" ");
			j=j+2;
		}
	}
	finally{
		scan.close();
	}
}
}
