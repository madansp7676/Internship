class average
{
    public static void main(String[] args)
    {
        int[] arr={12,13,14,15};
        int avg=0;
        for(int i=0;i<arr.length;i++)
        {
            
            avg=avg+arr[i];
        }
        avg=avg/arr.length;
        
        System.out.println("Average of array elements is: "+avg);
    }
}