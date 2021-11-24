public class Leader {
    public static void main(String[] args) {
        int[] arr={7,10,4,10,6,1,2};
        int n=arr.length;
        int currentLeader=arr[n-1];
        System.out.println(currentLeader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>currentLeader){
                currentLeader=arr[i];
                System.out.println(currentLeader);
            }
         }
  
    }
}
