package Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class People extends RealmObject {

    @PrimaryKey
    private int people_id;

    private String people_name;

    public int getPeople_id() {
        return people_id;
    }

    public void setPeople_id(int people_id) {
        this.people_id = people_id;
    }

    public String getPeople_name() {
        return people_name;
    }

    public void setPeople_name(String people_name) {
        this.people_name = people_name;
    }
}
