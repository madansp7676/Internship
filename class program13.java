class program13
{
    static boolean push()
    {
        return true;
    }
    static char help()
{
    return 'A';
}
public static void main(String[] args) {
    
    char ch=help();
    System.out.println("character value returned by help() is "+ch);
    System.out.println("boolean value returned by push() is "+push());
}
}