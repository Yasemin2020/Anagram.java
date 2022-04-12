package DAY21_ForEachLoop;

public class CommonElements {
    public static void main(String[] args) {
   int[] arr1= {1,2,3,4,5};
   int[] arr2= {4,5,6,7,8};
   String common="";
   for(int each:arr1){
       for (int i = 0; i <arr2.length ; i++) {
           if(each==arr2[i]){
              common+=arr2[i]+" ";
           }
       }
   }
        System.out.println("common = " + common);
        
        
        
        
        /*
       Write a program that can print out the common elements from two 
integer array
Ex:
arr1: 
arr2: 
output:
4 5 
        */
        
    }
}
