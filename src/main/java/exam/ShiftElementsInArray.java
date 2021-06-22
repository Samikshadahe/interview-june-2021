package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    for(int i=0;i<arr.length;i++){
      arr[i+1]=arr[i];
    }
    arr[0]=arr[arr.length-1];

  }

}
