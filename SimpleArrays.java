import java.util.Arrays;


class SimpleArrays
{
	String[] arraystring = new String[4];            //initialisation of instance variable
	
	public SimpleArrays()                            //overloaded constructor with no args
	{
		Arrays.fill(arraystring, "Hello, world");
	}
	
	public SimpleArrays(String a)                    //overloaded constructor with string args
	{
		Arrays.fill(arraystring, a);
	}
	
	
	public String arrayCrop(int start, int end)            //returns a concat file with array elements bewtween two specified indices
	{
		if (start > end ){
			int temp;
			temp=start;
			start=end;
			end=temp;
			
			
			String newstring = new String ();
		    for(int i = start; i < end+1; i++)
		    {			
			    if (i < end)
			    {
					 
				    newstring += arraystring[i] + "#";
			    }
			    else{
				    newstring+=arraystring[i];
			    }
		    }
		    return newstring;
		}
		
	    if ((start < 0 || start > 3) || (end < 0 || end > 3))
	    {
		    return "fail";                                         //if specified index range is not between 0 and 4 , return fail
	    }
		
	    else if(start == end)                                        //if specified indices are equal returhn match
	    {
		    return "Match";
	    }
	 
	    else{
		    String newstring = new String ();
		    for(int i = start; i < end+1; i++)
		    {			
			    if (i < end)
			    {
				    newstring+= arraystring[i] + "#";
			    }
			    else{
				    newstring+= arraystring[i];
			    }
		    }
		    return newstring;
        }
	
	}
    
	
	public String arrayConcat(int number)                           //returns a string consisted of concatenated elements from starting index to the ending index of the array
	
	{
		if (number > 3||number < 0){
			throw new IndexOutOfBoundsException("error");
		}
		else{
			String newstring = new String ();
		    for(int i = number; i < 4; i++)
		    {			
			    if (i < 3)
			    {
					 
				    newstring += arraystring[i] + "#";
			    }
			    else{
				    newstring+=arraystring[i];
			    }
		    }
		    return newstring;
			
		}
	} 
	
	public String arrayConcat(){
		String newstring = new String ();
	    for(int i = 0; i < 4; i++)
	    {			
			if (i < 3)
			{
					 
			    newstring += arraystring[i] + "#";
			}
			else{
				newstring+=arraystring[i];
		    }
	    }
	    return newstring;
	}
			
		
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
}

	




	

	
	
	
	
	
	
	
	
