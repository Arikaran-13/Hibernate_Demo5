import javax.persistence.*;

@Entity
@Table(name="branch_Table")
public class Branch {
    @Id
    @Column(name="Branch_ID")
    private int branchId;
    @Column(name="Branch_Name")
    private String branchName;

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", branchName='" + branchName + '\'' +
                '}';
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
