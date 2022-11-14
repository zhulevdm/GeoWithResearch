import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Reserch implements Search {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        this.tree = geoTree.getTree();
    }
    @Override
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName()) && t.re == re) {
                    result.add(t.p2.getFullName());
                }
        }
        return result;
    }

    public Set<Person> getUniqPerson() {
        Set<Person> uniqPerson = new HashSet<>();
        for (Node t : tree) {
            uniqPerson.add(t.p1);
            uniqPerson.add(t.p2);
        }
        return uniqPerson;
    }

        @Override
        public ArrayList<String> findAge(int n, String s) {
            for (Person p : getUniqPerson()) {
                if (s.equals(">") && p.getAge() > n) {
                    result.add(p.getFullName() + ": " + p.getAge());
                }
                else if (s.equals("<") && p.getAge() < n) {
                    result.add(p.getFullName() + ": " + p.getAge());
                }
            }
            if (result.isEmpty()){
                System.out.println("Некорректные данные для поиска.");}
            return result;

        }
}
