Notes
=================

##Array
int[] arr = new int[2];  
String[] arr = new String[]{"11","22"}  
int[][] 2darray = new int[4][2];//2D array with 4 rows and 2 columns  
int[][] 2darray = new int[2][];//2D array with 2 rows (2 arrays)  

Arrays.toString();//used to print a whole string  
Arrays.sort()//sort the array  
Arrays.asList(arr[0],arr[1])//convert array to list  

##List
List<Integer> list = new ArrayList<Integer>();  
List.add();  
List.add(int index,val)  
List.size();  
List.remove();  
List.size();  
List.contains();  

List<List<Integer>> 2dList = new ArrayList<List<Integer>>();//construct a 2d list  
Collections.sort(List);//sort a list  

##Math
Math.sqrt()//lower bound of square root  
Math.abs()//absolute value  
Math.pow(x,y)//x power y  
(x+y)^n=Cn0x0yn+Cn1x1y(n-1)+...+Cnnxny0// in set

##String
String xx = new String() //declare and allocate  
String.length()  
String.equals()  
String.charAt()  //charAt(index)-'0'calculate the num at index, charAt(index)-'A'calculate the excel num  
String.toCharArray()  
String.valueOf(char[])//convert char array to string  
String.substring(int begin, int end)  
String.trim()// remove spaces at the beginning and the end of a string  
String.replace("()","")//replace brackets  
String.replace("\\s"," ")//replace multi spaces into one space  
String.replaceAll("[^a-z0-9]", "")//regular expression used to remove non-alphanumeric characters  
String.toLowerCase()  
String.indexOf(String str)//can be used to check prefix  
String[] str = String.split(",");  


StringBuffer  
StringBuffer sb = new StingBuffer()  
StringBuffer.append()  
StringBuffer.reverse()  
StringBuffer.deleteCharAt(int index)  
StringBuffer.delere(int start, int end)  
StringBuffer.toString()//=StringBuffer+""  


StringBuilder  
StringBuilder sb = new StringBuilder()  
StringBuilder.reverse()  
StringBuilder.toString()  

Character  
Character.isLetterOrDigit()  
Character.isDigit()  
Character.isWhitespace()  

Integer  
Integer.MAX_VALUE = 2147483647  
Integer.MIN_VALUE = -2147483648  
Integer.toBinaryString();//convert int to binary string  
Integer.parseInt();//convert string to int  


##Hash
HashMap<Character, Integer> Hashmap = new HashMap<Character, Integer>()    
Hashmap.put(key,value)  
Hashmap.get(key)  
Hashmap.containsKey(key)  
Hashmap.containsValue(value)  

HashSet<Integer> Hashset = new HashSet<Integer>()  
Hashset.add()
HashSet.contains()  

##Bit
a = 0011 1100  
b = 0000 1101  
a&b = 00001100//Bitwise And a&1 check whether the last digit is 1 or not   
a|b = 00111101//Bitwise Or a|0=a a|1 set last digit as 1   
a^b = 00110001//Bitwise Xor: 1^1=0^0=0,1^0=0^1=1 a^0=a, a^a=0  
~a = 11000011//Bitwise compliment  -a=~a+1=11000100 -a&a=00000100  
a<<2 = 11110000//left shift 1<<n=2^n  
a>>2 = 1111//right shift without zero fill  
a>>>2 = 00001111//right shift with zero fill  

String.format("%16s", Integer.toBinaryString(1)).replace(' ', '0')//convert int to binary string with 0 padding.

##Stack
Stack stack=new Stack()//initialize a new stack  
stack.push(new Integer(a))//input an object on the top of a stack  
stack.pop()//return the object on the top of the stack and delete it in the stack  
stack.peek()//return the object on the top of the stack, but keep it in the stack  
stack.empty()//return a boolean value whether the stack is empty or not    

##Queue
Queue<Integer> queue=new LinkedList<Integer>()//Queue is interface in Java  
queue.add()//insert element  
queue.offer()//insert element  
queue.poll()//retrive and remove the head of this queue, return null if its empty    
queue.peek()//retrive but not remove the head  
queue.remove()//retrive and remove the head of this queue  
queue.size()  

##Git
git status//check current status  
git push//sync changes  
git log//check history of the current version  
git commit "description"


##Regular Expression
^-?\d+(\.\d+)?$  
^ start of string  
-? minus sign one or zero times  
\d+ digits, one or more  
(\.\d+)? a dot following by one or more digits, this whole block one or zero times  
$ end of string  
. \\.
[\w] words and whitespace 
[A_Za_z0_9 ] words and whitespace 
