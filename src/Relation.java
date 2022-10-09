public class Relation {
    private Human humanFirst;
    private Human humanSecond;
    private Relationship relationship;

    public Relation(Human humanFirst, Human humanSecond, Relationship relationship) {
        this.humanFirst = humanFirst;
        this.humanSecond = humanSecond;
        this.relationship = relationship;
    }

    public Human getHumanFirst() {
        return humanFirst;
    }

    public void setHumanFirst(Human humanFirst) {
        this.humanFirst = humanFirst;
    }

    public Human getHumanSecond() {
        return humanSecond;
    }

    public void setHumanSecond(Human humanSecond) {
        this.humanSecond = humanSecond;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return  relationship +" -> "+ humanSecond;
    }
}
