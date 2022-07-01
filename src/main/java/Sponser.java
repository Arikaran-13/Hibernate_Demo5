import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sponsers_table")
public class Sponser {
    @Id
    @Column(name="sponser_id")
    private int sponser_id;
    @Column(name="sponser_name")
    private String sponser_name;

    public int getSponser_id() {
        return sponser_id;
    }

    public void setSponser_id(int sponser_id) {
        this.sponser_id = sponser_id;
    }

    public String getSponser_name() {
        return sponser_name;
    }

    public void setSponser_name(String sponser_name) {
        this.sponser_name = sponser_name;
    }
}
