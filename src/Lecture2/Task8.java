package Lecture2;

/*
8) И ещё можете попрактиковаться и нарисовать оставшиеся 2
треугольника

       *
     * * (1)
   * * *
 * * * *

* * * *
  * * * (2)
    * *
      *
 */
public class Task8 {
    public static void main(String[] args) {
/*
       *
     * *
   * * *
 * * * *
 */
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j=0; j<n-i ;j++) {
                System.out.print("  ");
            }
            for (int y=0; y<i;y++) {
                System.out.print("* ");
            }
            System.out.println();}

        System.out.println();


        int o = 4;
        for (int i = 0; i < o; i++) {
            for (int y=0; y<i;y++) {
                System.out.print("  ");
            }
            for (int j=0; j<o-i ;j++) {
                System.out.print("* ");
            }
            System.out.println();}
    }
}


