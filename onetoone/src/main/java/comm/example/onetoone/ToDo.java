package comm.example.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ToDo")
public class ToDo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int todoid;
	@Column(name="todo_Name")
	private String todoName;
	
	@Override
	public String toString() {
		return "ToDo [todoid=" + todoid + ", todoName=" + todoName + "]";
	}
	
	

}
