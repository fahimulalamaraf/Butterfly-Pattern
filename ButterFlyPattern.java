public class ButterFlyPattern {
    
    
    public static void Butterfly(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)  //Printing first half of stars
            {
                System.out.print("*");
            }

            for(int j = 1; j <= 2*(n-i); j++)   // Printing spaces between the stars
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)     //Printing last half of the stars
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n; i >= 1; i--)                 // Mirroring the top half
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for(int j = 1; j <= 2*(n-i); j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        Butterfly(10);
    }
}
