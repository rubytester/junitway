public class HelloEmpire {

    //field with default value
    Boolean someFieldForClass = false;
    // also field with default null
    String s = null;

    // constructor that sets field to value other than default
    public HelloEmpire() {
        someFieldForClass = true;
    }

    // constructor accepts String and sets field to value other than default
    private HelloEmpire(String s) {
        this.s = s;
    }

    // public method of the class instance
    // this is a happy way of sending messages to objects
    public String hello() {
        return "Hello";
    }

    // static method means it can be called on Class (like class method in Ruby)
    //it's like a function call, requires no state so static is fine
    public static Boolean exists(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }



    // so static factory method sets this? but how?
    private static HelloEmpire rome = null;

    // static method acts as factory method returns instance of class
    public static HelloEmpire createRome() {
        if (rome == null) {
            rome = new HelloEmpire("AVE CESAR");
        }
        return rome;
    }

    public String salutation() {
        return s;
    }
}
