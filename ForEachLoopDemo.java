package class2;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		String[] collegeName = {"Texas","abc","xyz"};
		
		for(String data : collegeName)
		{
			data = data.toLowerCase();
			int vowelCount=0;
			int conCount=0;
			for(int i=0;i<data.length();i++)
			{
			    char c =data.charAt(i);
			    if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u')
			    {
			    	vowelCount = vowelCount+1;
			    }
			    else {
			    	conCount = conCount+1;
			    }
			}
			System.out.println("Input:"+data+" "+"vowel Count:"+vowelCount+" "+" Consonat Count:"+conCount);
		}
	}

}
