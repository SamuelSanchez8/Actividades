
package tarea_1;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rueda ruedaHumedo = new Rueda(2, Rueda.HUMEDO);
        Rueda ruedaDefault = new Rueda();

        System.out.println(ruedaHumedo);
        System.out.println(ruedaDefault);

        Chasis chasisCustom = new Chasis(2500, Chasis.MATERIAL2);
        Chasis chasisDefault = new Chasis();

        System.out.println(chasisCustom);
        System.out.println(chasisDefault);

        Coche coche1 = new Coche(ruedaHumedo, chasisCustom, Coche.AZUL);
        System.out.println(coche1);

        Fabrica fabricaPepe = new Fabrica("PEPE", 2, Rueda.HUMEDO, 2500, Chasis.MATERIAL2, 10);
        fabricaPepe.iniciarFabricacion(100);
        System.out.println(fabricaPepe);

        Fabrica fabricaJuan = new Fabrica("JUAN", 3, Rueda.NEVADO, 2000, Chasis.MATERIAL4, 5);
        fabricaJuan.iniciarFabricacion(50);
        System.out.println(fabricaJuan);

        System.out.println("------------------------retirar 10 coches----------------------------------------------");
        fabricaPepe.retirarCoche(10);
        System.out.println(fabricaPepe);

        System.out.println("---------------------------retirar 2 azules-------------------------------------------");
        fabricaPepe.retirarCoche(10, Coche.AZUL);
        System.out.println(fabricaPepe);

    }

}
