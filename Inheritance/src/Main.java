import model.Child;
import model.Hobbies;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hobbies> c1_list = new ArrayList<>();
        Hobbies h1 = new Hobbies("Singing");
        Hobbies h2 = new Hobbies("Crochet");

        c1_list.add(h1);
        c1_list.add(h2);

        Child c1 = new Child("Kapan", "Thami");
    }
}    