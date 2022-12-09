//3.Write a program to find greatest of three numbers using if else ladder
package myfirstlabproject;

public class Greatestnumber {

	public static void main(String[] args) {
		int n1=10,n2=15,n3=20;
		if(n1 >= n2) {
		if(n1 >= n3) 
			System.out.println(n1 + " is the greatest number.");
		else
				System.out.println(n3 + "is the greatest number.");
		}
		else {
			if(n2 >= n3)
				System.out.println(n2 +"is the greatest number.");
			else
				System.out.println(n3 +"is the greatest number.");
		}
         }

}
