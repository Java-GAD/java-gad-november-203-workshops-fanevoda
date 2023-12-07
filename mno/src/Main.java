
public class Main {

    public static void printHalfTriangle(int height)
    {
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < i + 1; j++)
                System.out.print("* ");
            System.out.print('\n');
        }
    }
    public static void printHallowPattern(int noOfRows, int noOfCols)
    {
        for (int i = 0; i < noOfCols; i++)
        {
            System.out.print('*');
        }

        System.out.print('\n');

        for (int i = 0; i < noOfRows - 2; i++)
        {
            System.out.print('*');

            for (int j = 0; j < noOfCols - 2; j++)
            {
                System.out.print(' ');
            }

            System.out.print("*\n");

        }

        for (int i = 0; i < noOfCols; i++)
        {
            System.out.print('*');
        }
        System.out.print('\n');

    }

    public static void main(String[] args) {

        printHallowPattern(5, 20);
        printHalfTriangle(5);
    }
}