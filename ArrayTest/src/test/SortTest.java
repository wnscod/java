package test;

public class SortTest {

	public static void main(String[] args) {
		int [] nums = {57,5,10,7,63,9};
		sort(nums,1);
		sort(nums,2);
	}

	private static void sort(int []nums,int orderby){
		if (orderby == 1) { // 오름차순 정렬
			for (int i = 0; i < nums.length; i++) {

				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] > nums[j]) {
						int temp = nums[i]; // temp=57;
						nums[i] = nums[j]; // nums[0]=5;
						nums[j] = temp; // nums[1]=57;
					} // for j

				} // for i

			} // if
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]+" ");
			}

		}

		if (orderby == 2) { // 내림차순
			for (int i = 0; i < nums.length; i++) {

				for (int j = i + 1; j < nums.length; j++) {
					int temp = 0;
					if (nums[i] < nums[j]) {

						temp = nums[i];

						nums[i] = nums[j];

						nums[j] = temp;

					} // for i

				} // for j

			} // if
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]+" ");
			}

		}
		
		//System.out.println();
	}
	
}