package ro.java.ctrln;

//ATENTIE -- SE PPOATE IMPORTA O CLASA DIN ALT PACHET
//import ro.java.misc.Main;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Execut main din ctrl dar si ");
        ro.java.misc.Main.main(args); // asa se poate importa din alt pachet

    }
}
