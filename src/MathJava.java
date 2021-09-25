public class MathJava {
    public static void main(String[] args) {
        /*To find Highest number between 2 numbers use max() method*/
        int highestNum = Math.max(6, 100);
        System.out.println(highestNum);

        /*To find a random number between 0 and 1*/
        int randomNum = (int) (Math.random() * 100);

        System.out.println(randomNum);
    }
}
