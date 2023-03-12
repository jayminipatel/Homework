package sprint3;

public class Variables {
    // declare variables
    double Printer_Version;
    int book;
    char h;
    String room;

    public static void main(String[] args) {
        //create an object
        Variables house = new Variables();
        // assign the value in to the ref object

        house.Printer_Version =14.7;
        house.book = 15;
        house.h = 's';
        house.room = "Study Room";
        System.out.println("Printer Version:"+house.Printer_Version);
        System.out.println("Book number:"+house.book);
        System.out.println("house:"+house.h);
        System.out.println("Room name:"+house.room);


    }





}
