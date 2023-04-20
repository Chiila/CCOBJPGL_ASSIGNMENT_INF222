public class exercise1 {

    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;

    public static void main(String[] args) throws Exception {
        //precondition
        assert iwillBehave == true : "LUH C ATE AT KUYA......";
        //method
        College();
        //postcondition
        assert iwillGraduate == true : "haha idol c sneakybooger";

    }
    static void College() {
        iwillGraduate = false;
        System.out.println("Oh noes!!! How tragic :(");
    }
}
