public class fibonocci {
    public static void main(String[]args){
        int f=1,s=1;
        int t=0;
        int n=10;
        for(int i=2;i<=n;i++){
           t=f+s;
           f=s;
           s=t;
            System.out.println(t);
        }
       // System.out.println(t);
    }
}
