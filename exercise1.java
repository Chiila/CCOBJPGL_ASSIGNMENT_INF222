public class exercise1 {

    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;

    public static void main(String[] args) throws Exception {
        //precondition
        assert iwillBehave == true : "Good Job!";
        //method
        College();
        //postcondition
        assert iwillGraduate == true : "Congratulations Ganda!";

    }
    static void College() {
        iwillGraduate = false;
        System.out.println("Oh noes!!! How tragic :(");
    }
}
