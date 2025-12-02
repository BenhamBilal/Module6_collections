import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] namenArray = {"Kwik","Kwek","Kwak"};
        System.out.println(namenArray[2]);

        ArrayList<String> namenLijst = new ArrayList<>();
        ArrayList<Integer> getallenLijst = new ArrayList<>();

        namenLijst.add("Mario");
        namenLijst.add("Roger");
        namenLijst.add(1,"Freddy");
        System.out.println(namenLijst);

        Collections.sort(namenLijst);
        System.out.println(namenLijst);

//        .size() == .length    &   .get() == [i]
        for(int i = 0 ; i < namenLijst.size(); i++){
            System.out.println(namenLijst.get(i));
        }
//        Het gaat zichzelf sorteren
//        Set heeft geen index zoals arrayList
        HashSet<String> namenSet = new HashSet<>();
        namenSet.addAll(namenLijst);
        namenSet.add("Pauline");

        System.out.println(namenSet);

//        alfabetisch via treeSet
        TreeSet<String> gesorteerdNamenSet = new TreeSet<>(namenSet);
        System.out.println(gesorteerdNamenSet);



    }
}