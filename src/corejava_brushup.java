
public class corejava_brushup {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,6,78,9,102020};
		
		for (int i = 0; i<arr2.length; i++)
		{
		
			if (arr2[i] % 2 == 0)
		{
		System.out.println(arr2[i]);
		
		}
			else 
			{
				System.out.println(arr2[i] +"is not a multiple of 2");		
				break;
			}
		}
		
		
		
	}
}
