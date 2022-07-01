import javax.persistence.*;

@Entity
@Table(name="emp_table")
public class Employee {
    @Id
    @Column(name ="emp_id")
    private int id;
    @Column(name="emp_name")
    private String name;

    public Branch getB() {
        return b;
    }

    public void setB(Branch b) {
        this.b = b;
    }

    @ManyToOne(targetEntity = Branch.class)
@JoinTable(
        name="emp_branch",
        joinColumns = @JoinColumn(name="emp_id"),
        inverseJoinColumns = @JoinColumn(name="Branch_Id")
)
private Branch b ;



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    public int getId() {
        return id;
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
