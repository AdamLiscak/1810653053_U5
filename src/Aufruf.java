import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aufruf {
    public static void main(String[] args) {
        Mensch adam= new Mensch("Adam liscak",20,"mann");
        System.out.println(adam.printall());
        Mensch adamliscak= new Mensch(20,"mann","Adam","Liscak");
adamliscak.status();
Student atarurisucaku = new Student(20,"mann","Adam","Liscak",
        1810653053,"web.vzb.18");
atarurisucaku.status();

        Auto bmw= new Auto( );
        bmw.setReifen((short) 4);
        bmw.setFarbe("silber");
        bmw.setTueren((short) 5);
        bmw.setAirbags((short) 4);
        bmw.setPs((short) 220);
        Auto audi= new Auto( );
        audi.setReifen((short) 4);
        audi.setFarbe("schwarz");
        audi.setTueren((short) 5);
        audi.setAirbags((short) 8);
        audi.setPs((short) 180);
        Auto audi2= new Auto( );
        audi2.setReifen((short) 4);
        audi2.setFarbe("schwarz");
        audi2.setTueren((short) 5);
        audi2.setAirbags((short) 8);
        audi2.setPs((short) 183);
        Auto audi3= new Auto( );
        audi3.setReifen((short) 4);
        audi3.setFarbe("schwarz");
        audi3.setTueren((short) 5);
        audi3.setAirbags((short) 8);
        audi3.setPs((short) 80);
        Auto audi4= new Auto( );
        audi4.setReifen((short) 4);
        audi4.setFarbe("schwarz");
        audi4.setTueren((short) 5);
        audi4.setAirbags((short) 8);
        audi4.setPs((short) 95);
        List<Auto> list = new ArrayList<>(Arrays.asList(bmw,audi2,audi,audi3,audi4));
        Collections.sort(list);
        for (Auto a:list)
        {
            System.out.println(a.toString());
        }
    }
}
