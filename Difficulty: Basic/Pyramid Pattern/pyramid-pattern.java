import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1;r<=n;r++)
        {
            for (int i=1;i<=n-r;i++)
            {
                System.out.print(" ");
            }
            for(int i=1;i<=r*2-1;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}