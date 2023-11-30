

/* Introduction to Computer Science II */
/* Tutorial 1 & Assigned Reading       */


import java.util.Arrays;  // helper functions for arrays
import java.util.Scanner; // helper class for reading keyboard input



public class SampleJavaCodeProgram{

	
	/* Example of a STATIC function.                             */
	/* Static functions can be called without having to create   */
	/* object of the class it is defined in.                     */
	public static String makeQs(int[] numbers){
		// returns a string consisting of n Q's, where
		// n is the number of even integers in the numbers input

		int n = 0;
		
		/* first, count the number of even integers                     */
		/* note: numbers.length is the size of the numbers array        */
		for(int index=0; index<numbers.length; index+=1){
			if( (numbers[index] % 2) == 0){
				// if numbers[index] is even add 1 to n
				n += 1;
			}
		}
		
		/* we could use a string to build up the answer....
         but a StringBuilder would be better!

		// Using a string to build up the desired output 
		String output1 = "";
		for(int i=0; i<n; i+=1){
			output1 += "Q";
		}

		*/
		
		/* Using a stringbuilder object to build up the desired output */
		/* when we initialize an empty stringbuilder object, we can    */
		/* specify how big it will be if we already know and that    */
		/* will make it more efficient */
		StringBuilder output2 = new StringBuilder(n);
		for(int i=0; i<n; i+=1){
			output2.append("Q");
		}
		// get a string object from the stringbuilder object
		String output = output2.toString();

		return output;
	}

	/** simple method to wait for user to enter something using the keyboard */
	public static void wait(String message){
		System.out.println("\n" + message + "\n");
		Scanner wait = new Scanner(System.in);
		wait.nextLine();  // get input but do nothing with it....
	}
	

	/* the main method is the "program"              */
	/* this is what is executed when we run the code */
	public static void main(String[] args){
		
		System.out.println("Some primitive data types in Java");
		System.out.println("---------------------------------");
		
		int     int_example  = 13;
		long    long_example = 12345678901234L; // bigger than an int, we need the L here
		boolean boolean_example = true;
		char    char_example = 'q';
		double  double_example = 3.145195;

		

		// Java will automatically convert primitives to strings if you "add" them to a string		
		System.out.println("int_example = " + int_example);
		System.out.println("long_example = " + long_example);
		System.out.println("boolean_example = " + boolean_example);
		System.out.println("char_example = " + char_example);
		System.out.println("double_example = " + double_example);
		

		wait("hit enter to continue...");


		System.out.println("\nThe String class lets us use text");
		System.out.println("---------------------------------");
		
		String name1 = "cat";             // strings are enclosed in double quotes
		String name2 = new String("dog"); // can create them with new operator
		String name3 = name1 + name2;     // can concatenate strings with + operator
		
		System.out.println("name1 = " + name1);
		System.out.println("name2 = " + name2);
		System.out.println("name3 = " + name3);
		
		wait("hit enter to continue...");
		System.out.println("branching...");
		System.out.println("------------");
		
		// branching
		// if, else if, else 
		int x = 12, y = 7, z = 187;
		if(x < y){
			System.out.print("x < y is true : ");
			System.out.println(x < y);	
		}else if(x < z){
			System.out.print("x < z and x >= y is true : ");
			System.out.println( x < z && x >= y ); // && is conjunction/AND
		}else{
			System.out.println("x >= z and x >= y is true : ");
			System.out.println(x >= z && x >= y);
		}
		
		System.out.print("x is odd or y is even should be false : ");
		System.out.println( (x%2==1) || (y%2==0) ); // || is disjunction/OR
		
		wait("hit enter to continue...");
		
		int count = 0;
		int bound = 7;
		System.out.println("while loop example");
		while(count < bound){
			System.out.print(count + ",");
			count += 1;
		}
		System.out.println();  // 
		
		// same thing using a for loop
		System.out.println("for loop equivalent");
		for(int count2=0; count2<bound; count2+=1){
			System.out.print(count2 + ",");
		}
		System.out.println();  // 
		

		// do-while loop
		boolean stop = false;
		count = 1;
		System.out.println("do-while loop");
		do{
			System.out.println("inside the do-while, count = " + count);
			if(count >= 3){
				stop = true;
			}
			count += 1;
		}while( !stop );   // to negate a boolean (not) we use !
		// Danger! do-while NEEDS a semi-colon ; after the condition
		//
		//         while, for, if, etc. has DIFFERENT behaviour. Do NOT
		//         add a semi-colon for these (unless you really need it!)


		//
		// arrays 
		//

		wait("hit enter to continue...");
		System.out.println("arrays!!!!!!");
		System.out.println("------------");


		int[] numbers0 = null;        // array variable declaration and initialization to null
		int[] numbers1 = null;        // 
		
		System.out.println("numbers1 (before allocation) : " + numbers1);
		
		numbers1 = new int[3]; // allocate memory to store an array of size 3

		System.out.println("numbers1 (after allocation) : " + numbers1);

		// use the Arrays.toString() method to print an array nicer
		System.out.println("numbers1 (after allocation) : " + Arrays.toString(numbers1));
		
		numbers1[0] = 10;      // populate array with data
		numbers1[1] = 20;      // we access and set array elements using square
		numbers1[2] = 30;      // brackets and index position (starting with 0)
		
		System.out.println("numbers1 (after population) : " + numbers1);
		System.out.println("numbers1 (after population) : " + Arrays.toString(numbers1));
		
		numbers0 = numbers1;
		System.out.println("numbers0 (after assignment) : " + Arrays.toString(numbers0));
		
		
		// populate an array using a for loop
		int[] numbers2 = new int[3];
		System.out.println("numbers2 (after memory allocation) : " + Arrays.toString(numbers2));
		for(int i=0; i<numbers2.length; i+=1){
			numbers2[i] = (i+1)*10;
		}
		System.out.println("numbers2 (after populating with data) : " + Arrays.toString(numbers2));
		
		// we can initialize an array when we declare it 
		// (this is useful for small arrays when we know what should be in it)
		int[] numbers3 = {10, 20, 30};
		System.out.println("numbers3 : " + Arrays.toString(numbers3));
		
		
		String[] words = new String[4];
		System.out.println("words (before population) : " + Arrays.toString(words));
		words[0] = "cat";
		words[1] = "dog";
		words[2] = "eel";
		words[3] = "owl";
		System.out.println("words (after population)  : " + Arrays.toString(words));
		
		// 
		// size of an array is stored in the .length attribute 
		// of the array
		//
		
		System.out.println("size of words array : words.length = " + words.length);
		System.out.println("size of numbers1  array : numbers1.length = " + numbers1.length);
		

		wait("hit enter to continue...");
		System.out.println("2d arrays!!!!!!");
		System.out.println("---------------");


		//
		// 2d-array
		//
		int[][] matrix = new int[3][4];  // 3 rows, 4 columns
		
		System.out.println("2D array with " + matrix.length + " rows and " + matrix[0].length + " columns");
		System.out.println( Arrays.deepToString( matrix ));
		for(int r=0; r<matrix.length; r+=1){
			for(int c=0; c<matrix[0].length; c+=1){
				matrix[r][c] = r*10 + c;
			}
		}
		
		System.out.println("2D array after adding numbers");
		System.out.println( Arrays.deepToString( matrix ));
		//
		// enhanced for loop 
		//
		System.out.println("Enhanced for loop example");
		for(String s : words){
			System.out.print(s + ",");
		}
		System.out.println();
		
		// the enhanced for loop above is essentially the same as
		System.out.println("Same output with normal for loop");
		for(int index=0; index<words.length; index+=1){
			String s = words[index];
			System.out.print(s + ",");
		}
		System.out.println();

		
		System.out.println("Example of passing array as input to function");
		
		int[]  in1 = {1,2,3,4,5,6,7,8};
		String s1 = makeQs(in1);
		System.out.println( Arrays.toString(in1) + "--> makeQs --> " + s1);
		
		// can create arrays on the fly as arguments to functions
		// we do not have to specify how long the array is since the initialization
		// gives this information. 
		System.out.println("Example of creating array on the fly as input to function");
     
		String s2 = makeQs( new int[]{1,2,3,4,5,6,7,8} );
		System.out.println( Arrays.toString(new int[]{1,2,3,4,5,6,7,8}) + "--> makeQs --> " + s2);
		
		wait("hit enter to continue...");

		System.out.println("Keyboard (user) input");
		
		// read input from standard input stream (System.in)
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		do{
			System.out.print("enter something [quit to exit] : ");
			input = keyboard.next();
			System.out.println("you typed \"" + input + "\"");
		}while(!input.equalsIgnoreCase("quit"));
		
		// need numbers?
		
		// take a string and convert it into a number
		System.out.print("enter a number (integer) between 0 and 100 : ");
		int guess = Integer.parseInt(keyboard.next());
		
		// let the Scanner object itself turn the string into a number
		System.out.print("that was not correct, try another number : ");
		guess = keyboard.nextInt();
		System.out.println("that is right! the secret number was " + guess);

		// Note: it is good habit to close things that you open. This includes files
		//       and things like Scanner objects. 
		//    
		//       The exception for Scanner objects is when you have standard input 
		//       (System.in) as the source of the Scanner object. 
		//       In this case, we do not want to close System.in. 
		//       VS Code, or other IDEs, might give you a warning that you haven't 
		//       closed your Scanner object and that is OK in this situation. 		 
	}
	
}