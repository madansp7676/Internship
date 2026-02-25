public class searching_brute_force {
    public static void main(String[] args) {
        int[] arr={14,13,10,12,16,15,13,18};
        int element=13;
        boolean present=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Element "+element+" found at index: "+i);
                present=true;

               
            }
        }
        if(present==false)
        {
            System.out.println("Element "+element+" not found in the array.");
        }
        
    }
}

