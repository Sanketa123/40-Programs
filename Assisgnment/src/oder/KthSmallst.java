package oder;

public class KthSmallst {
	public static void main(String[] args) {

		KthSmallst ob = new KthSmallst(); 

        int arr[] = {12, 3, 57, 4, 19, 26}; 

        int left=0;//first index

        int n = arr.length;

        int right= n-1; //last index
        int k = 4; 

        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, left, right, k)); 
    }

	private String kthSmallest(int[] arr, int left, int right, int k) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	