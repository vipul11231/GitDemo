
public class Core_Java {

	public static void main(String[] args) {
		
		int myNum = 5;
		String Name = "Vipul Garg";
		char letter = 'r';
		boolean mycard = true;
		double dec = 0.55;
		
		System.out.println(myNum+" is the value stored in myNum variable");
		System.out.println(Name);

		System.out.println("postjira4");
		System.out.println("postjira5");
		System.out.println("postjira6");
		System.out.println("postjira7");
		
		//Array -
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,102020};
		
//		System.out.println(arr2[5]);
		
		//for loop
		for (int i = 0;i<arr.length; i++)
		{
		System.out.println(arr[i]);	
		}
		
		for (int i = 7; i<arr2.length; i++)
		{
		System.out.println(arr2[i]);
		
		}
		
		String[] val = {"Vipul","garg","Kaithal"};
		
		for(int i= 0; i<val.length;i++)
		{
			System.out.println(val[i]);
		}
		System.out.println(".....................");
		for(String s:val)
		{
			System.out.println(s);
		}
		
	
	}
		
		
	}
	

