import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Service service;

    public Controller(){
        this.service = new Service();
    }

    public List<Relation> getAllRellation(String firstName , String lastName, List<Relation> relation){
        if(firstName.isBlank() || lastName.isBlank()){
            throw new RuntimeException();
        }
        List<Relation> temp = service.GetAllRelationFromHuman(firstName, lastName, relation);
        return temp;
    }
}
