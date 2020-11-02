import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		Exercise11();
		Exercise12();
		Exercise13();
		Exercise14();
		Exercise15();
		Exercise16();
		Exercise17();
		Exercise18();
		Exercise19();
		Exercise20();
		
      input.close();
      
	}
		
	public static void Exercise11() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input a Sentence: ");
		String line = in.nextLine();
		String[] words = line.split("[ ]+");
		System.out.println("Penultimate word: "+words[words.length - 2]);   
	}
	
	public static void Exercise12() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("\nInput a word: ");
		String word = in.nextLine();
		word = word.trim();
		String result = "";
		char[] ch = word.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
				result +=ch[i];		}
		System.out.println("Reverse word: "+result.trim());		
	}
	
	public static void Exercise13() { 
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int a = in.nextInt();
		System.out.print("Input the second number: ");
		int b = in.nextInt();
		System.out.println("Result: "+ result(a, b));
		
		}
		public static int result(int x, int y)
		 {
		if(x == y)	
			return 0;
			if(x % 6 == y % 6)
				return (x < y) ? x : y;
			return (x > y) ? x : y;
	}
		
	public static void Exercise14() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the first number : ");		 	int a = in.nextInt();
		System.out.print("Input the second number: ");
	 	int b = in.nextInt();
	 	System.out.println("Result: "+common_digit(a, b));	
		}		 
 	public static boolean common_digit(int p, int q) {
			 		
 		if (p<25 || q>75)
		return false;
 		int x = p % 10;
		int y = q % 10;
		p /= 10;
		q /= 10;
		return (p == q || p == y || x == q || x == y);				
 	} 	
 	
 	public static void Exercise15() {
 		Scanner in = new Scanner(System.in);
 			
 		System.out.print("Input the first number :");
 		int a = in.nextInt();
 		System.out.print("Input the second number: ");
 		int b = in.nextInt();
 		int divided = a / b;
 		int result = a - (divided * b);
 		System.out.println(result);	
 	}
 	
 	public static void Exercise16() { 
 		
 			int sum = 1;
 			 int ctr = 0;
 			 int n = 0;
 			 
 			 	while (ctr < 100) {
 			 		n++;
 			 		if (n % 2 != 0) {
 			 		// check if the number is even
 			 			if (is_Prime(n)) {
 			 				sum += n;
 			 			}
 			 		}
 			 				ctr++;
 			 	}
 			 	System.out.println("\nSum of the prime numbers till 100: "+sum); 
 			}

 			public static boolean is_Prime(int n) {
 				for (int i = 3; i * i <= n; i+= 2) {
 					if (n % i == 0) {
 						return false;	
 					}
 				}
 				return true;			
 	}
 			
 	public static void Exercise17() {
 					
 		String main_string = "Python 3.0";
 		String word = "Tutorial";
 		System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));	
 	}
 	
 	public static void Exercise18() {
		
		String main_string = "Python 3.0";
	
		String last_three_chars = main_string.substring(main_string.length() - 3);
		System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);	
 	}
 	
 	public static void Exercise19() {
 			
 		String main_string = "Python";
 		System.out.println(main_string.substring(0, main_string.length()/2));	
 	}
 	
 	public static void Exercise20() {
 		
 		String str1 = "Python ";
 		String str2 = "Tutorial ";
 			
 		if(str1.length() >= str2.length())
				System.out.println( str2 + str1 + str2);
 		else
 		System.out.println(str1+str2+str1);
 					
 		}
	}