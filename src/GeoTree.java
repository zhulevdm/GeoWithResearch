import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person pr1, String rel, Person pr2) {
        switch (rel) {
            case "родитель" -> {
                tree.add(new Node(pr1, Relationship.parent, pr2));
                tree.add(new Node(pr2, Relationship.children, pr1));
                }
            case "ребенок" -> {
                tree.add(new Node(pr1, Relationship.children, pr2));
                tree.add(new Node(pr2, Relationship.parent, pr1));
                }
            case "брат" -> {
                tree.add(new Node(pr1, Relationship.brother, pr2));
                tree.add(new Node(pr2, Relationship.sister, pr1));
                }
            case "сестра" -> {
                tree.add(new Node(pr1, Relationship.sister, pr2));
                tree.add(new Node(pr2, Relationship.brother, pr1));
                }


        }
//        if (rel == "родитель") {
//            tree.add(new Node(pr1, Relationship.parent, pr2));
//            tree.add(new Node(pr2, Relationship.children, pr1));
//        }
//        else if (rel == "ребенок") {
//            tree.add(new Node(pr1, Relationship.children, pr2));
//            tree.add(new Node(pr2, Relationship.parent, pr1));
//        }
//        else if (rel == "брат") {
//            tree.add(new Node(pr1, Relationship.brother, pr2));
//            tree.add(new Node(pr2, Relationship.sister, pr1));
//        }
//        else if (rel == "сестра") {
//            tree.add(new Node(pr1, Relationship.sister, pr2));
//            tree.add(new Node(pr2, Relationship.brother, pr1));
//        }

    }

}
