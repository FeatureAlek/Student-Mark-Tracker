public class Main {

    public static final int[][] MARKS = {
            {1, 5, 10},
            {3, 4, 6, 8},
            {2, 1, 3, 5, 3},
            {10, 9}
    };

    public static void main(String[] args) {

        System.out.println("Student Mark Ratings: ");
        for(int []marks : MARKS) {
            int i = averageOfMarks(marks);
            System.out.println(classification(i));
        }
    }

    // possible loss of information -> int - average
    public static int averageOfMarks(int [] array){

        int sum = 0;
        for(int x : array){
            sum += x;
        }
        return sum / array.length;
    }

    public static String classification(int average) {

        String classification;
        switch (average) {
            case 0, 1, 2, 3, 4 -> classification = "Bad";
            case 5, 6, 7, 8 -> classification = "Good";
            case 9, 10 -> classification = "Great";
            default -> classification = " ";
        }
        return classification;
    }
}