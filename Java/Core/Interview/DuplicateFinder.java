import java.util.ArrayList;
import java.util.List;

public class DuplicateFinder {
	public int findDuplicateNumber(List<Integer> list) {
		int highestNumber = list.size() - 1;
		int total = sum(list);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	public int sum(List<Integer> list) {
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 30; i++) {
			list.add(i);
		}
		list.add(19);
		DuplicateFinder dup = new DuplicateFinder();
		System.out.println("Duplicate Number: " + dup.findDuplicateNumber(list));
	}
}
