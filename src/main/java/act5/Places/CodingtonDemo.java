package act5.Places;

import java.lang.reflect.Method;

public class CodingtonDemo {

    public static void main(String[] args) {

        //created object
        Theater ticket1 = new Theater();

        //display area
        ticket1.showArea();


        ticket1.showEvents();

        //invoke showEvents()
        /*Method m = ticket1.getClass().getDeclaredMethod("showEvents);
        * System.out.println(m.invoke(ticket1));*/


    }
}
