package sortings;
class Leaner{
    public static void main(String[] args) {
        int[] arr = {12,10,4,3,6,11};
        int target =30;
    int ans = LinearSearching(arr,target);
    System.out.println(ans);
    }


     static int LinearSearching(int[] arr , int target){
    if(arr.length==0){
       return -1;
 }
   for(int i=0;i<arr.length;i++){
     if(arr[i]==target){
    return arr[i];
 }
  }
return -1;
                
    
    

}
}


