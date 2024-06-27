
public class PairInArray {
  public static void arrPair(int arr[]){
    int sumMax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      int start=i;
      for(int j=i;j<arr.length;j++){
        int end=j,sum=0;
        for(int k=start;k<=end;k++){
          System.out.print(arr[k]+" ");
          sum+=arr[k];
        }
        if(sum>sumMax){
          sumMax=sum;
        }
        System.out.println("--Sum :"+sum);
        System.out.println();
      }
      System.out.println();
    }

    System.out.println("Max sum :"+sumMax);
  }
  public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    arrPair(arr);
  }

}