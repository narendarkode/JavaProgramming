package java_Programming;

public class Access_Modifiers {
    /**
     * public,
     * default /No Access Specifier
     * private
     * protected
     *
     */

    public void doThis1(){
        System.out.println("public method" );
    }

    private void doThisPrivate(){
        //This means where ever the method created as private it can used or reusable in the same class.
        System.out.println("private Method");
    }

    void doThisDefault(){
        System.out.println("private Method");
    }
}
