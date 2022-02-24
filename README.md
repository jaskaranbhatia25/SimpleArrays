# SimpleArrays
1. Look at the documentation on java.util.Arrays.
2. Create a class ’SimpleArrays’ which has the characteristics specified to the right.
3. You may include additional methods, but no methods beyond those specified need to be
included.
4. You may use additional methods provided by java.util.Arrays, beyond those specified.
•The class has an instance variable (a 4-element array of Strings)
•Has a constructor which can be called with one argument: a String
– Uses the java.util.Arrays method fill to populate all elements of the instance variable
array with the String
•Overloads the constructor with a zero argument version
– The array is populated with the default String "Hello, world"
•Provides a method arrayConcat
– Accepts an array index; if no array index is supplied, 0 is used by default
– This method should have default behavior if the index supplied exceeds the bounds of the
array (IndexOutofBoundsException error)
– Returns a String consisting of all the elements of the array, from the provided index to the
end, concatenated, separated by the # character (no whitespace should be introduced)
•Provides a method arrayCrop
– Accepts two integers as arguments, corresponding to starting and ending array indices. The
starting and ending indices are inclusive.
– Returns a String consisting of all the elements between the two indices specified, concate-
nated, separated by the # character (no whitespace should be introduced)
– If the ending integer is smaller than the starting integer, switch the two (use the start as the
end, and the end as the start)
– If either integer is not a valid index, return "Fail"
– If the two integers are the same, return "Match"

MAIN:

public static void main(String[] args){
SimpleArrays myArray1 = new SimpleArrays();
String foundResult1 = myArray1.arrayConcat();
System.out.println(foundResult1);
SimpleArrays myArray2 = new SimpleArrays();
String foundResult2 = myArray2.arrayConcat(2);
System.out.println(foundResult2);
SimpleArrays myArray3 = new SimpleArrays("Hi you");
String foundResult3 = myArray3.arrayConcat();
System.out.println(foundResult3);
SimpleArrays myArray4 = new SimpleArrays("Hi you");
String foundResult4 = myArray4.arrayConcat(2);
System.out.println(foundResult4);
SimpleArrays myArray5 = new SimpleArrays("Hi you");
String foundResult5 = myArray5.arrayCrop(0, 2);
System.out.println(foundResult5);
SimpleArrays myArray6 = new SimpleArrays("Hi you");
String foundResult6 = myArray6.arrayCrop(3, 2);
System.out.println(foundResult6);
SimpleArrays myArray7 = new SimpleArrays("Hi you");
String foundResult7 = myArray7.arrayCrop(0, 6);
System.out.println(foundResult7);
SimpleArrays myArray8 = new SimpleArrays("Hi you");
String foundResult8 = myArray8.arrayCrop(3, 3);
System.out.println(foundResult8);
}


OUTPUT:

Hello, world#Hello, world#Hello, world#Hello, world
Hello, world#Hello, world
Hi you#Hi you#Hi you#Hi you
Hi you#Hi you
Hi you#Hi you#Hi you
Hi you#Hi you
Fail
Match

