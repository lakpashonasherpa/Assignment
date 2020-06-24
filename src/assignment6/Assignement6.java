package assignment6;



public class Assignement6 {
	
	
	public void factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
			}
			System.out.println("Factorial of "+num+"! is"+fact);
			
		
	}
	public void fibonacciSeries(int num) {
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		
		for(int i=2;i<=num;i++) {
			c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public void table(int num) {

		for(int i=1;i<=10;i++) {
			int mul=num*i;
			System.out.println(num+" * "+i+" : "+mul);
		
	}
		
	}
	public void isPrime(int num) {
		int i;
		
		if(num==0&&num==1) {
			System.out.println(num+" is not prime");
		} else {
		
			for( i=2;i<num;i++) {
				
				if(num%i==0) {
					
					System.out.println(num+" is not prime");
					break;
				}
				
			}
			if(num==i) {
				System.out.println(num+" is prime");
			}
			
			}
		}
	
	public void reverseIt(int num) {
		int reverse=0;
		while(num!=0) {
			reverse =reverse *10;
			reverse=reverse+num%10;
			num=num/10;
			
		}
		System.out.println(reverse);
	}
	public void sumOfnth(int num) {
		
		int sum=0;
		
			for(int i=1;i<=num;i++) {
				sum+=i;
				
			}
			System.out.println("Sum of "+num+" natural number : "+sum);
			
		}
	}
	
	

