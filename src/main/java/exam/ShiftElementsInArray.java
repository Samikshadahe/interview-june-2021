package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    for(int i=0;i<arr.length;i++){
      arr[i+1]=arr[i];
    }
    arr[0]=arr[arr.length-1];

  }

}
