/*
5 10 15 20
5 10 15 20
5 10 15 20
*/

class P5 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            int a = 5;
            for(int j=1;j<=4;j++)
            {
                
                System.out.print(a+" ");
                a=a+5;
            }
            System.out.println();
        }
    }
}