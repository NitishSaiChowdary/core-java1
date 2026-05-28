public class ex {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg , sum=0;
        int length = ages.length;
        for (int age : ages) {
            sum += age;
        }
        avg = sum / length;
        System.out.println("The average age is: " + avg);
        int i=10;
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println("happy new year ,weclome to 2025 and good year is come to your life");

        int aa=-10100;
        System.out.println(~aa);

        int x1 =10;
        int x2 =10;
        boolean c1=x1++==10 || x2++==10;
        System.out.println(c1);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);
        int ers[]  = {1, 2, 3, 4};
        System.out.println(ers[2]);
    }
    
    
}
