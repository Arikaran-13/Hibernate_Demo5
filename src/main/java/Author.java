import javax.persistence.*;

@Entity
@Table(name="author_table")
public class Author {
    @Id
    private int id;
    private String name;
    @ManyToOne(targetEntity=Author.class)
    @JoinTable(
            name="author_sponser",
            joinColumns = @JoinColumn(name="id"),
            inverseJoinColumns = @JoinColumn(name="sponser_name")
    )
  private Author sponser_person;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sponser_person=" + sponser_person +
                '}';
    }

    public int getId() {
        return id;
    }

    public Author getSponser_person() {
        return sponser_person;
    }

    public void setSponser_person(Author sponser_person) {
        this.sponser_person = sponser_person;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
