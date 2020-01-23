package comm.example.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="Task_Name")
	private String taskName;
	@Column(name="task_authour")
	private String taskAuthour;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ToDo_id")
	private ToDo todo;
	
	public Task(String tname, String tauthour)
	{
		super();
		
		this.taskName = tname;
		this.taskAuthour = tauthour;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskAuthour() {
		return taskAuthour;
	}
	public void setTaskAuthour(String taskAuthour) {
		this.taskAuthour = taskAuthour;
	}
	public ToDo getTodo() {
		return todo;
	}
	public void setTodo(ToDo todo) {
		this.todo = todo;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", taskAuthour=" + taskAuthour + ", todo=" + todo + "]";
	}


	public void setToDo(ToDo toDo2) {
		// TODO Auto-generated method stub
		
	}
	
}
