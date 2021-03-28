import java.util.*; 
public class Linearsearch{
  public static void main(String[] args)
  {
    int a[];//Intializing the array of integers...
    int n;
    Scanner ac=new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    n=ac.nextInt();//Taking input the size of the array.
    a=new int[n];//creating the array of size n.
    System.out.println("Enter the array elements : ");
    for(int i=0;i<n;i++)
    {
      a[i]=ac.nextInt();
    }
    int k;
    System.out.println("Enter the search element : ");
    k=ac.nextInt();
    for(int i=0;i<n;i++)
    {
      if(a[i]==k)
      {
        System.out.println("The key is found at position no : "+(i+1));
        return;
      }
    }
    System.out.println("Sorry!!!The key was not found!!!");
  }
}
