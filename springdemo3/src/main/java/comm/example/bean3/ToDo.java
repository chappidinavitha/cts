package comm.example.bean3;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter


public class ToDo {
	private Task task;
	private String todoId;
	private LocalDate date;
	private boolean isCompleted;
	
	
	
	@Override
	public String toString() {
		return "ToDo [task=" + task + ", todoId=" + todoId + ", date=" + date + ", isCompleted=" + isCompleted + "]";
	}

	public Task getTask() {
		return task;
	}

	public String getTodoId() {
		return todoId;
	}

	public LocalDate getDate() {
		return date;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public ToDo(Task task, String todoId, boolean isCompleted) {
		super();
		this.task = task;
		this.todoId = todoId;
		this.isCompleted = isCompleted;
	}

	
	

	
	
}
