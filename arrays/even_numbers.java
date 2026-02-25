class even_numbers
{
    public static void main(String[] args) {
        {
            int[] arr={15,12,14,13,17,16};
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] % 2==0)       // (arr[i]%2==1) or (arr[i]%2!=0) for odd numbers   
            {
                System.out.println(arr[i]);
            }
        }
    }
    }
}