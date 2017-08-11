public class RepeatedNumber
   public static void main( String[] args) {
   	 int[] arr= { 1,2,3,4,5,3,6,7,8};
   	 for (int i=0;i<arr.Length-1;i++)
   	 {
   	 	for (int j=i+1; j<arr.Length; j++)
   	 	{
   	 		if((arr[i]==(arr[j])) && (i=!j))
   	 		{
   	 			System.out.println("Repeated number is:"+arr[j]);
   	 		}
   	 	}
   	 }

   }