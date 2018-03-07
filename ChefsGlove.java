import java.util.*;
class ChefsGlove
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int Fn=sc.nextInt();
        while(T!=0)
        {
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
            int p=ChefsGlove.checkFront(ar,arG);
            int q=ChefsGlove.checkBack(ar,arG);
            if((p==1)&&(q==1))
            {
                System.out.println("Both");
            }
            else if((p==0)&&(q==0))
            {
                System.out.println("None");
            }
            else if((p==1)&&(q==0))
            {
                System.out.println("Front");
            }
            else if((p==0)&&(q==1))
            {
                System.out.println("Back");
            }
        }
    }
    public static int checkFront(int ar[],int arG[])
    {
        int n=ar.length;
        for(int i=0;i<n;i++)
        {
            if(ar[i]>arG[i])
                return 0;
        }
        return 1;
    }
    public static int checkBack(int ar[],int arG[])
    {
        int n=ar.length;
        int j=n;
        for(int i=0;i<n;i++,j--)
        {
            if(ar[i]>arG[j-1])
                return 0;
        }
        return 1;
    }
}