public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 1970);
        Person vasya = new Person("Вася", 1994);
        Person masha = new Person("Маша", 1996);
        Person jane = new Person("Женя", 2019);
        Person ivan = new Person("Ваня", 2020);
        GeoTree gt = new GeoTree();
        gt.append(irina, "родитель", vasya);
        gt.append(irina, "родитель", masha);
        gt.append(vasya, "родитель", jane);
        gt.append(ivan, "ребенок", vasya);
        gt.append(vasya, "брат", masha);
        gt.append(jane, "сестра", ivan);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(jane,
                Relationship.children));
        System.out.println(new Reserch(gt).spend(jane,
                Relationship.sister));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.brother));

        //Поиск людей, которые старше или младше n лет
        System.out.println(new Reserch(gt).findAge(27, ">"));
        System.out.println(new Reserch(gt).findAge(27, "<"));
    }

}
