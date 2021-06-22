package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    List<int[]> combinations = new ArrayList<>();
    helper(combinations, new int[k], 0, total-1, 0);
    return 0;
  }
  private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
    if (index == data.length) {
        int[] combination = data.clone();
        combinations.add(combination);
    } else if (start <= end) {
        data[index] = start;
        helper(combinations, data, start + 1, end, index + 1);
        helper(combinations, data, start + 1, end, index);
    }
}

}
