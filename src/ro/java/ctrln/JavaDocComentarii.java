package ro.java.ctrln;

public class JavaDocComentarii {
        //javadoc incepe cu /** atentie !!!!
    /**
     * putem sa transmitem argumente aditionale prin <b>Bold</b>
     * metoda main este metoda apelata de masina virtuala java si care porneste o alicatie java
     * @param args acesta este parametru prin care transmitem argument programului nostru
     * @author Cerneleac Ionut astfel se poate trece autorul javadoc ului
     */
    public static void main(String[] args) { //hover peste metoda si va aparea java docul de mai sus
        System.out.println("Comentari pop-up JavaDoc");
        System.out.println(metodaMea(1,2));
    }

    /**
     * metodaMea returneaza suma celor 2 agumente
     * @author Cerneleac Ionut
     * @param arg1 un int
     * @param arg2 al doilea int
     * @return returneza smecherie
     */
    public static int metodaMea(int arg1 ,int arg2) {
        System.out.println("Test pentru javadoc ");
        return arg1 / arg2;
    }
}
