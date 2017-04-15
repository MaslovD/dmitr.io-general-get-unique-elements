package getuniqueelements;

import java.util.HashSet;
import java.util.Set;

public class GetUniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Object> SetA = new HashSet<Object>();
        SetA.add("String1");
        SetA.add("String2");
        SetA.add("String3");
        SetA.add("String3");
        
        Set<Object> SetB = new HashSet<Object>();;
        SetB.add("String3");
        SetB.add("String5");
        SetB.add("String6");
        Set<Object> uniqueElems= getUniqueElements(SetA, SetB);
        
        System.out.println (SetA);
        System.out.println (SetB);
        System.out.println (uniqueElems);
        
    }

    public static Set<Object> getUniqueElements(Set<Object> a, Set<Object> b) {

        // create union
        Set uniqueElems = new HashSet(a);
        uniqueElems.addAll(b);

        for (Object setA : a) {
            if (b.contains(setA)) {
                uniqueElems.remove(setA);
            }
        }

        return uniqueElems;

    }
}
