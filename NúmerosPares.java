import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner bofao= new Scanner(System.in);
		System.out.println("Digite um número:");
		int n= bofao.nextInt();
		int i=0;
		
		while(i<n){
		    i++;
		 if(i % 2 == 0){
		   System.out.println(i);
		}
		}
	}
}
