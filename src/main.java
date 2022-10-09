import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Human> humanList = new ArrayList<Human>();
        humanList.add(new Human("Katrin", "Ivanova",75,Sex.Fem));
        humanList.add(new Human("Nikolay", "Ivanov", 74,Sex.Mal));
        humanList.add(new Human("Serg","Ivanov",43,Sex.Mal));
        humanList.add(new Human("Ivan", "Ivanov", 34,Sex.Mal));
        humanList.add(new Human("Irina", "Ivanova",34,Sex.Fem));
        humanList.add(new Human("Maria", "Ivanova",15,Sex.Fem));
        humanList.add(new Human("Vasiliy", "Ivanov", 14,Sex.Mal));

        ArrayList<Relation> relationList  = new ArrayList<>();
        relationList.add(new Relation(humanList.get(0),humanList.get(1),Relationship.WIFE));
        relationList.add(new Relation(humanList.get(0),humanList.get(2),Relationship.MOTHER));
        relationList.add(new Relation(humanList.get(0),humanList.get(3),Relationship.MOTHER));
        relationList.add(new Relation(humanList.get(0),humanList.get(4),Relationship.MOTHERINLAW));
        relationList.add(new Relation(humanList.get(0),humanList.get(5),Relationship.GRANDMOTHER));
        relationList.add(new Relation(humanList.get(0),humanList.get(6),Relationship.GRANDMOTHER));
        relationList.add(new Relation(humanList.get(1),humanList.get(0),Relationship.HUSBAND));
        relationList.add(new Relation(humanList.get(1),humanList.get(2),Relationship.FATHER));
        relationList.add(new Relation(humanList.get(1),humanList.get(3),Relationship.FATHER));
        relationList.add(new Relation(humanList.get(1),humanList.get(4),Relationship.FATHERINLAW));
        relationList.add(new Relation(humanList.get(1),humanList.get(5),Relationship.GRANDFATHER));
        relationList.add(new Relation(humanList.get(1),humanList.get(6),Relationship.GRANDFATHER));
        relationList.add(new Relation(humanList.get(2),humanList.get(0),Relationship.SON));
        relationList.add(new Relation(humanList.get(2),humanList.get(1),Relationship.SON));
        relationList.add(new Relation(humanList.get(2),humanList.get(3),Relationship.BROTHER));
        relationList.add(new Relation(humanList.get(2),humanList.get(4),Relationship.BROTHERINLAW));
        relationList.add(new Relation(humanList.get(2),humanList.get(5),Relationship.DAUGHTERINLAW));
        relationList.add(new Relation(humanList.get(2),humanList.get(6),Relationship.NEPHEW));
        relationList.add(new Relation(humanList.get(3),humanList.get(0),Relationship.SON));
        relationList.add(new Relation(humanList.get(3),humanList.get(1),Relationship.SON));
        relationList.add(new Relation(humanList.get(3),humanList.get(2),Relationship.BROTHER));
        relationList.add(new Relation(humanList.get(3),humanList.get(4),Relationship.HUSBAND));
        relationList.add(new Relation(humanList.get(3),humanList.get(5),Relationship.FATHER));
        relationList.add(new Relation(humanList.get(3),humanList.get(6),Relationship.FATHER));
        relationList.add(new Relation(humanList.get(4),humanList.get(0),Relationship.DAUGHTERINLAW));
        relationList.add(new Relation(humanList.get(4),humanList.get(1),Relationship.DAUGHTERINLAW));
        relationList.add(new Relation(humanList.get(4),humanList.get(2),Relationship.DAUGHTERINLAW));
        relationList.add(new Relation(humanList.get(4),humanList.get(3),Relationship.WIFE));
        relationList.add(new Relation(humanList.get(4),humanList.get(5),Relationship.MOTHER));
        relationList.add(new Relation(humanList.get(4),humanList.get(6),Relationship.MOTHER));
        relationList.add(new Relation(humanList.get(5),humanList.get(0),Relationship.GRANDDAUGHTER));
        relationList.add(new Relation(humanList.get(5),humanList.get(1),Relationship.GRANDDAUGHTER));
        relationList.add(new Relation(humanList.get(5),humanList.get(2),Relationship.DAUGHTERINLAW));
        relationList.add(new Relation(humanList.get(5),humanList.get(3),Relationship.DAUGHTER));
        relationList.add(new Relation(humanList.get(5),humanList.get(4),Relationship.DAUGHTER));
        relationList.add(new Relation(humanList.get(5),humanList.get(6),Relationship.SISTER));
        relationList.add(new Relation(humanList.get(6),humanList.get(0),Relationship.GRANDSON));
        relationList.add(new Relation(humanList.get(6),humanList.get(1),Relationship.GRANDSON));
        relationList.add(new Relation(humanList.get(6),humanList.get(2),Relationship.NEPHEW));
        relationList.add(new Relation(humanList.get(6),humanList.get(3),Relationship.SON));
        relationList.add(new Relation(humanList.get(6),humanList.get(4),Relationship.SON));
        relationList.add(new Relation(humanList.get(6),humanList.get(5),Relationship.BROTHER));



        Scanner in = new Scanner(System.in);

        System.out.println("Перечень людей в базе:");
//        System.out.println(humanList);
        for (Human  h: humanList) {
            System.out.println(h);
        }
//        System.out.println(relationList);
        System.out.println("Введите Фамилию по кому будем искать");
        String searchLastNameValue = in.next();
        System.out.println("Введите Имя по кому будем искать");
        String searchFirstNameValue = in.next();
        in.close();

        Controller controller = new Controller();
//        System.out.println(controller.getAllRellation(searchFirstNameValue,searchLastNameValue,relationList));
        for (Relation r: controller.getAllRellation(searchFirstNameValue,searchLastNameValue,relationList)
             ) {
            System.out.println(r);
        }
    }
}
