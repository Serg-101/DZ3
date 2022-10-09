import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<Relation> GetAllRelationFromHuman(String firstName, String lastName, List<Relation> relation){
        List<Relation> hList = new ArrayList<>();
        for (Relation r: relation) {
            if (r.getHumanFirst().getFirsName().equals(firstName) && r.getHumanFirst().getLastName().equals(lastName)){
                hList.add(r);
            }
        }
        return hList;
    }
}

