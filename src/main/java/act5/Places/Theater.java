package act5.Places;

public class Theater extends Building {

    @Override
    public void showArea(){
        capacity = 500;
        System.out.println("Theater area: " + capacity*12);

    }

    @Override
    public void showEvents() {
        System.out.println("Events ready to be hosted !!");
    }
}
