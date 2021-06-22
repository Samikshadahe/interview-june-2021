package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
     int [] binaryNum=new int[32];
    int i=0;
    while(n>0){
      binaryNum[i]=n%2;
      n=n/2;
      i++;
    }
    for(int j=i-1;j>=0;j--)
      System.out.print(binaryNum[j]);
    try{
      if(n<0)
        System.out.println("Error:Not Positive integer");
    }
    return "";
  }
}
