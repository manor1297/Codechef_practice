import java.util.*;
class ChefsGlove
{
    public static int k=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int result[]=new int[T];
        while(T!=0)
        {
            int Fn=sc.nextInt();
            int ar[]=new int[Fn];
            int arG[]=new int[Fn];
            for(int i=0;i<Fn;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(int i=0;i<Fn;i++)
            {
                arG[i]=sc.nextInt();
            }
            ChefsGlove.check(ar,arG,result);
            T--;
        }
        ChefsGlove.display(result);
    }
    public static void display(int result[])
    {
        for(int i=0;i<result.length;i++)
        {
            if(result[i]==1)
            {
                System.out.println("both");
            }
            else if(result[i]==2)
            {
                System.out.println("none");
            }
            else if(result[i]==3)
            {
                System.out.println("front");
            }
            else if(result[i]==4)
            {
                System.out.println("back");
            }
        }
    }
    public static void check(int ar[],int arG[],int result[])
    {
        int n=ar.length;
        int j=n;
        int Front=1,Back=1;
        for(int i=0;i<n;i++,j--)
        {
            if(ar[i]>arG[i])
                Front=0;
            if(ar[i]>arG[j-1])
                Back=0;
        }
        if(Front==1 && Back==1)
            {
                result[ChefsGlove.k++]=1;
            }
            else if(Front==0 && Back==0)
            {
                result[ChefsGlove.k++]=2;
            }
            else if(Front==1 && Back==0)
            {
                result[ChefsGlove.k++]=3;
            }
            else if(Front==0 && Back==1)
            {
                result[ChefsGlove.k++]=4;
            }
    }
}
