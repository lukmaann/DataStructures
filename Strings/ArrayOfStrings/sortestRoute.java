package Strings.ArrayOfStrings;

import java.util.*;

public class sortestRoute {

    public static float calculateSortestDistance(String str) {
        int y = 0;
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E':
                    x++;

                    break;
                case 'e':
                    x++;

                    break;

                case 'w':
                    x--;

                    break;
                case 'W':
                    x--;

                    break;    

                case 'N':
                    y++;

                    break;
                case 'n':
                    y++;

                    break;

                case 's':
                    y--;

                    break;
                case 'S':
                    y--;

                    break;

                default:
                    break;
            }
        }

        float sortestDistance= (float)Math.sqrt(Math.pow(x, 2)+(Math.pow(y, 2)));

        return sortestDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the directions: ");
        String directions = sc.nextLine();
        System.out.println(calculateSortestDistance(directions));
    }

}
