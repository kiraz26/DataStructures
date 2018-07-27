package warmup;

import java.util.List;

public class CheckDuplicates {
	public static void main(String[] args) {
		boolean result = hasDuplicates(new int[] { 5, 3, 10, 1 });
		System.out.println(result);
		result = hasDuplicates(new int[] { 5, 3, 10, 1, 5 });
		System.out.println(result);
		
		

	}

	public static boolean hasDuplicates(int[] nums) {
		if (nums.length <= 1)
			return false;

		for (int i = 0; i < nums.length; i++) {

			for (int k = i + 1; k < nums.length; k++) {
				System.out.println(nums[i] + "->" + nums[k]);

				if (nums[i] == nums[k]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean hasDuplicates(List<Integer> nums) {
		if (nums.size() <= 1)
			return false;

		for (int i = 0; i < nums.size(); i++) {

			for (int k = i + 1; k < nums.size(); i++) {
				System.out.println(nums.get(i) + "->" + nums.get(k));

				if (nums.get(i) == nums.get(k)) {
					return true;
				}
			}
		}
		return false;
	}

}
