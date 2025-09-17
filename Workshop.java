import java.util.Scanner; 

public class Workshop {

    // 1 - Function getSum to get Sum of numbers
    static int getSum(int number1, int number2)
    {
        int sum = number1 + number2;
        return sum;
    }

    static void invoke_getSum()
    {
        int result = getSum(10, 20);
        System.out.println("Sum of two numbers is = " + result);
    }

    public static void main() {
        invoke_getSum(); 
        invoke_swap();  
        invoke_isEven();  
        invoke_inNumber(); 
        simpleInputAndGreet();  
        invoke_printAscii();
        invoke_stringlength();
        invoke_getCountOfVowels();
        invoke_reverseString();
        invoke_getSumArray(); 
        invoke_isPalidrome();
        invoke_printMaxMin();
        invoke_binarySearch();
        invoke_mergeArrays();
        invoke_getSecondLargest();
        invoke_printUniqueElements();
        invoke_printCommonElements();
        invoke_getCountofwords();
        invoke_printBinaryValues();
        invoke_removeSpaces();
    }

    // 2 - Function swapNumbers to Swap two variable values

    // This code esn't work, it is written here to demonstrate that 
    // Java is using pass by value 
    // static void swap(int number1, int number2)
    // {
    //     int temp = number1;
    //     number1 = number2;
    //     number2 = temp;

    //     System.out.println(" number1 = " + number1 + " number2 = "+ number2);
    // }

    // pass by ref example using the array
    static void swap_v2(int[] numbers)
    {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }

    static void invoke_swap()
    {
        //int input1 = 10;
        //int input2 = 20;
        //System.out.println("BEFORE Input1 = " + input1 + " input2 = "+ input2);
        //swap(input1, input2);
        //System.out.println("AFTER Input1 = " + input1 + " input2 = "+ input2);

        int[] input3 = {10,20};
        swap_v2(input3);

        System.out.println("AFTER input3[0] = " + input3[0] + " input3[1] = "+ input3[1]);
    }

    // 3 - Function isEven to return true if number is even
    static boolean isEven(int number)
    {
        if (number % 2 == 0)
        {
           System.out.println( number + " Number is even");
            return true;
        }
        else
        {
            System.out.println(number + " Number is odd");
            return false;
        }
    }

    static void invoke_isEven()
    {
        isEven(10);
        isEven(11);
    }

//     // 4 - Function isNumber to return true if it is a digit

    static boolean isNumber(String input)
    {
        boolean result = true;

        for (int index=0; index < input.length(); index++)
        {
            char character = input.charAt(index);
            if (character < '0' || character > '9')
            {
                result = false;
                break;
            }
        }
        return result;
    }

    static void invoke_inNumber()
    {
        boolean result = isNumber("12a");
        if (result)
            System.out.println("It is a proper number");
        else
            System.out.println("It is a invalid number");
    }

 // 5 - Function  simpleGreetings to accept name as input and print simple greetings Namaskara name
    
    static void simpleInputAndGreet()
    {
        Scanner reader = new Scanner(System.in);
        String Name;

        Name = reader.nextLine();
        reader.close();

        System.out.println("Namaskara " + Name);
    }

     //#6 Function to Print ASCII  values of string input

    static void printASCII(String input)
    {
        char character;

        for (int index=0; index < input.length(); index++)
        {
            character = input.charAt(index);
            int asciiValue = character;

            System.out.println("Asccii value fo the char  " + character + "  " + asciiValue);
        }
    }

    static void invoke_printAscii()
    {
        printASCII("abc");
    }

     // 7 Function to getStrlength to get string length

    static int getStringLength(String input)
    {
        int length = 0;

        for (char c : input.toCharArray()) {
            length++;
        }

        return length;
    }

    static void invoke_stringlength()
    {
        String input = "1234";
        int result = getStringLength(input);

        System.out.println("Length of the string is " + result);
    }


   // 8 - Function to Count vowels  getCountOfOvewel for a given string

    static int getCountOfOvewels(String input)
    {
        int count = 0;

        for (int index=0; index < input.length(); index++)
        {
            char character  = input.charAt(index);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
                count++;
        }

        return count;
    }

    static void invoke_getCountOfVowels()
    {
        String input = "aeiouxyz";

        int count = getCountOfOvewels(input);
        System.out.println("Number of vowels in string " + input + "   " + count);
    }

    // 9 - Function to reverse a string reveseString

    static String reveseString(String input)
    {
        StringBuilder output = new StringBuilder();

        for (int index = input.length()-1 ; index >= 0; index--)
        {
            output.append(input.charAt(index));
        }

        return output.toString();
    }

    static String reveseStringV2(String input)
    {
        char[] inputArray = input.toCharArray();
        
        int leftIndex = 0;
        int rightIndex = input.length()-1;
        
        while(leftIndex < rightIndex)
        {
            char temp = inputArray[leftIndex];
            inputArray[leftIndex] = inputArray[rightIndex];
            inputArray[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        String output = new String(inputArray);
        System.out.println(output);

        return output;
    }

    static void invoke_reverseString()
    {
        String input1 = "abcd";
        String input2 = "abcde";

        String output2 = reveseString(input2);

        String output1 = reveseStringV2(input1);

        System.out.println("Input " + input1 + " Output " + output1);
        System.out.println("Input " + input2 + " Output " + output2);
    }   

     // 10 - Function to get sum of all elements in the integer array getSum

    static int getSum(int[] numbers)
    {
        int sum = 0 ;

        for (int index =0; index < numbers.length; index++)
        {
            sum = sum + numbers[index];
        }
        return sum;
    }

    static void invoke_getSumArray()
    {
        int[] input1 = {1,2,3};

        int sumOfElements = getSum(input1);

        System.out.println("Sum of elements = " + sumOfElements);

    }

     // 11 - Function to find given string is Palindrome, function isPalidrome returns true if string is palindrome

    static boolean isPalidrome(String input)
    {
        boolean result = true;

        int leftIndex = 0;
        int rightIndex = input.length()-1;

        while(leftIndex < rightIndex)
        {
            if (input.charAt(leftIndex) != input.charAt(rightIndex))
            {
                result = false;
                break;
            }
            leftIndex++;
            rightIndex--;
        }

        return result;
    }
    
    static void invoke_isPalidrome()
    {
        String input1 = "Siddu"; // not a palindrome


        boolean result = isPalidrome(input1);

        if (result)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is NOT palindrome");
        }
    
    }

     // 12 - Function to print max and min value from an integer array ,  printMaxMin

    static void printMaxMin(int[] numbers)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int index=0; index < numbers.length; index++)
        {
            if (numbers[index] > max)
                max = numbers[index];

            if (numbers[index] < min)
                min = numbers[index];
                
        }
        System.out.println("Max value = " + max + " Min value = " + min);
    }

    static void printMaxMinV2(int[] numbers)
    {
        if (numbers.length == 0)
            return;
        
        int max = numbers[0] ;
        int min = numbers[0];

        for (int index=1; index < numbers.length; index++)
        {
            if (numbers[index] > max)
                max = numbers[index];

            if (numbers[index] < min)
                min = numbers[index];
                
        }
        System.out.println("Max value = " + max + " Min value = " + min);
    }

    static void invoke_printMaxMin()
    {
        int[] input1 = {5,2,-3,4,5,-6,999};

        int[] input2 = {-1,-2,-3};
        int[] input3 = {-1};

        printMaxMin(input1);
        printMaxMin(input3);

        printMaxMinV2(input1);
        printMaxMinV2(input2);
    }

    // 13 - Function to search in an sorted integer array
    static boolean binarySearch(int[] numbers, int key)
    {
        boolean isFound = false;

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        int midIndex = (rightIndex - leftIndex) / 2;
        
        while (leftIndex <= rightIndex)
        {
            if (key == numbers[midIndex])
            {
                isFound = true;
                break;
            }
            else if (key > numbers[midIndex])
            {
                leftIndex = midIndex+1;
            }
            else if (key < numbers[midIndex])
            {
                rightIndex = midIndex-1;
            }

            midIndex = leftIndex + (rightIndex - leftIndex)/2; 
        }

        return isFound;
    }

    static void invoke_binarySearch()
    {
        int[] input1 = { 1,2,3,4,5,6,7,8,9,10,11};
        int key = 11;

        boolean result = binarySearch(input1, key);

        if (result)
        {
            System.out.println("number is found");
        }
        else
        {
            System.out.println("number is NOT found");
        }

    }

     // 14 - Function to merge two arrays and return combined output in first array

     // Assume that master array has memory allocated to have all elements from data 
    static void mergeArrays(int[] masterArray, int[] data)
    {
        int countData = data.length;

        int startIndex =  masterArray.length - countData ; 

        for (int dataIndex =0 ; startIndex < masterArray.length ; startIndex++, dataIndex++)
        {
            masterArray[startIndex] = data[dataIndex];
        }
    }

    static void printArray(int[] numbers)
    {
        for (int index=0; index < numbers.length; index++)
        {
            System.out.println(numbers[index]);
        }
    }

    static void invoke_mergeArrays()
    {
        //int[] masterArray = { 1,2,3};
        int[] masterArray = { 1,2,3,0,0,0,0};

        int[] data = {4,5,6,7};

        mergeArrays(masterArray, data);

        printArray(masterArray);
    }

    // 15 - Function get second largest element in an integer array  getSecondLargest

    static int getSecondLargest(int[] numbers)
    {
        if (numbers.length == 0)
            return -1;
        
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for( int index=1; index < numbers.length; index++)
        {
            if (numbers[index] > largest)
            {
                secondLargest = largest;
                largest = numbers[index];
            }
            else if (numbers[index] > secondLargest)
            {
                secondLargest = numbers[index];
            }
        }

        return secondLargest;
    }

    static void invoke_getSecondLargest()
    {
        int[] input1 = {1,2,3,4,5,6};
        //int[] input1 = {5,2};
        //int[] input1 = {2};

        int result = getSecondLargest(input1);

        System.out.print("Second largest element is " + result);
    }

    // 16 - Function to print unique elements in an integer array   printUniqueElements

    static void printUniqueElements(int[] numbers)
    {
        for (int readIndex=0 ; readIndex < numbers.length; readIndex++)
        {
            boolean isDuplicate = false;
            
            // Check if the number has any duplicates in the array
            for (int compareIndex=0; compareIndex< numbers.length; compareIndex++)
            {
                if (readIndex == compareIndex)
                    continue;

                if (numbers[readIndex] == numbers[compareIndex])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
                System.out.println(numbers[readIndex]);
        }
    }

    static void invoke_printUniqueElements()
    {
        int[] intput1 = {6,1,2,3,4,2,6,4};
        printUniqueElements(intput1);
    }


     // 17 - Function to print intersection or common elements of two integer arrays  getCommonElements

    static void printCommonElements(int[] input1, int[] input2)
    {
        for (int input1Index=0; input1Index < input1.length; input1Index++ )
        {
            boolean isFound = false;
            for (int input2Index=0; input2Index< input2.length; input2Index++ )
            {
                if (input1[input1Index] == input2[input2Index])
                {
                    isFound = true;
                    break;
                }
            }

            if (isFound)
                System.out.println(input1[input1Index]);
        }
    }

    static void invoke_printCommonElements()
    {
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {4,5,9,10};

        printCommonElements(input1, input2);
    }   

    //count of words 
    static int getCountofwords(String input)
    {
        int countofwords = 0;

        if(input == null || input.length() == 0 || input.charAt(0) == ' ')
        {
            return countofwords;
        }
        char prevcharacter = input.charAt(0);

        for(int index = 0; index <= input.length()-1; index++)
        {
            char character = input.charAt(index);
            if(character == ' ' || character == '\n' || character == '\t')
            {
                if(prevcharacter != ' ' && prevcharacter != '\n' && prevcharacter != '\t')
                {
                    countofwords++;
                }
            }
            prevcharacter = character;
        }
        return countofwords + 1;
    }
    
    static void invoke_getCountofwords()
    {
        //String input = "I am learning  Java";
        //String input = null;
        String input = "    ";
        int count = getCountofwords(input);
 
        System.out.println("Number of words in the string is " + count);
    }

    //#19 function to print binary values of various input like int, char, string, float, double, long  
    
    static void printBinaryValues(int number) //signed int 
    {
        if(number < 0)
            return;
        
        int countBits  = Integer.BYTES * 8;

        //Ex: integer is 4 bytes = 32 bits, left most bit is sign bit
        //31 bits are used to represent the number

        int mask =1;
        mask = mask << (countBits - 2); // left shift the 2 to the left most bit position
        
        System.out.println("\nBinary value of the number " + number + " is : ");
        while(mask > 0)
        {
            int result = number & mask;
            if(result != 0)
                System.out.print("1");
            else
                System.out.print("0");
            
            mask = mask >> 1; // unsigned right shift
        }

    }
    static void invoke_printBinaryValues() {
        printBinaryValues(10);
        printBinaryValues(-10); // negative number, function will return without printing anything
        printBinaryValues(0);
    }

    //20 Remove spaces from a string 
    static String removeSpaces(String input)
    {
        StringBuilder output = new StringBuilder();

        for(int index = 0; index < input.length(); index++)
        {
            char character = input.charAt(index);
            if(character != ' ')
            {
                output.append(character);
            }
        }

        return output.toString();
    }
    static void invoke_removeSpaces()
    {
        String input = "I am                                                learning Java";
        String output = removeSpaces(input);    
        System.out.println("Input string : " + input);
        System.out.println("Output string : " + output);
    }


    //assaignment Question - function to print all prime factors of a given number

    static void printPrimeFactors(int Number)
    {
        if (Number <= 1)
            return;

        // for (int factor = 2; factor  <= Number; factor++)
        // {
        //     while (Number % factor == 0)
        //     {
        //         System.out.println(factor);
        //         Number = Number / factor;
        //     }
        // }

        for (int factor = 2; factor <= Math.sqrt(Number); factor++) 
        {
            while (Number % factor == 0)
            {
                System.out.print(factor + " ");
                Number = Number / factor;
            } 
        }
        if (Number > 2) 
        {
            System.out.print(Number + " ");
        }


    }

    static void invoke_printPrimeFactors()
    {
        int input = 60;   
        printPrimeFactors(input);
    } 

    // print prime numbers in a given range
    // print all prime numbers between 10 to 99
    static void printPrimeNumbersInRange(int lowerLimit, int upperLimit)
    {
        for (int number = lowerLimit; number <= upperLimit; number++)
        {
            boolean isPrime = true;

            for (int factor = 2; factor <= number/2; factor++)
            {
                if (number % factor == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println(number);
        }
    }
    static void invoke_printPrimeNumbersInRange()
    {       
        int lowerLimit = 10;
        int upperLimit = 99;        
        printPrimeNumbersInRange(lowerLimit, upperLimit);
    }

        public static void main(String[] args)
    {
        // invoke_printUniqueElements();
        // invoke_printCommonElements();
        //invoke_getCountofwords();
        //invoke_printBinaryValues();
        //  invoke_removeSpaces();
        invoke_printPrimeFactors();
        //invoke_printPrimeNumbersInRange();
    }


}