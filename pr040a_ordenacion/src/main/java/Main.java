/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.javiermoreno.introduccion.colecciones.SucesoHistorico;
import com.javiermoreno.introduccion.colecciones.SucesoHistoricoPorNombreComparator;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        SucesoHistorico sh1 =
                new SucesoHistorico(1956, 3, 8, "1ª copa Europa R. M.", "Lalala....");
        SucesoHistorico sh2 =
                new SucesoHistorico(1492, 10, 12, "Descubrimiento América", "Blah bla");
        SucesoHistorico sh3 =
                new SucesoHistorico(1999, 1, 1, "Introducción Euro", "Bli bli bli.");

        SortedSet<SucesoHistorico> sucesos =
                new TreeSet<SucesoHistorico>();
        sucesos.add(sh1);
        sucesos.add(sh2);
        sucesos.add(sh3);

        System.out.println("FECHA\t\t\t\t\tNOMBRE\t\t\t\tDESCRIPCIÓN");
        for (SucesoHistorico suceso : sucesos) {
            System.out.println(suceso.getFecha() + "\t\t"
                    + suceso.getNombre() + "\t\t"
                    + suceso.getDescripcion());
        }

        System.out.println();

        SucesoHistoricoPorNombreComparator comp =
                new SucesoHistoricoPorNombreComparator();
        SortedSet<SucesoHistorico> setAlfabetico =
                new TreeSet<SucesoHistorico>(comp);
        setAlfabetico.add(sh1);
        setAlfabetico.add(sh2);
        setAlfabetico.add(sh3);
        for (SucesoHistorico suceso : setAlfabetico) {
            System.out.println(suceso.getFecha() + "\t\t"
                    + suceso.getNombre() + "\t\t"
                    + suceso.getDescripcion());
        }

        System.out.println();
        
        SortedSet<SucesoHistorico> setDesc =
                new TreeSet<SucesoHistorico>(
                new Comparator<SucesoHistorico>() {
                    @Override
                    public int compare(SucesoHistorico sc1, SucesoHistorico sc2) {
                        int orden = sc1.getDescripcion().compareTo(sc2.getDescripcion());
                        if (orden == 0) {
                            orden = sc1.getFecha().compareTo(sc2.getFecha());
                        }
                        if (orden == 0) {
                            orden = sc1.getNombre().compareTo(sc2.getNombre());
                        }
                        return orden;
                    }
                });
        setDesc.add(sh1);
        setDesc.add(sh2);
        setDesc.add(sh3);
        for (SucesoHistorico suceso : setDesc) {
            System.out.println(suceso.getFecha() + "\t\t"
                    + suceso.getNombre() + "\t\t"
                    + suceso.getDescripcion());
        }
    }
}
