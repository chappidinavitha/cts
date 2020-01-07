package comm6.example;

import java.time.LocalDate;

public class Task {
	private String taskId;
	private String taskName;
	private LocalDate taskDate;
	private boolean isCompleted;

	public Task() {
		super();
	}

	public Task(String taskId, String taskName, LocalDate taskDate, Boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.isCompleted = isCompleted;
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		Task theTask=null;
		boolean isEqual=false;
		if(object instanceof Task)
		{
			theTask=(Task) object;
			
			
		}
		if((this.getTaskName()==theTask.getTaskName()) &&
				(this.getTaskDate().isEqual(theTask.getTaskDate()))  &&  (this.isCompleted()==theTask.isCompleted()))
		{
			isEqual=true;
		}
		return isEqual;
            
		
	}

@Override
public String toString() {
	
	return "TaskDetails: \nTaskId=" + taskId + " taskName=" + taskName  + " TaskDate=" + taskDate
			+ " isCompleted" + isCompleted;
}

public String getTaskId() {
	return taskId;
}

public void setTaskId(String taskId) {
	this.taskId = taskId;
}

public String getTaskName() {
	return taskName;
}

public void setTaskName(String taskName) {
	this.taskName = taskName;
}

public LocalDate getTaskDate() {
	return taskDate;
}

public void setTaskDate(LocalDate taskDate) {
	this.taskDate = taskDate;
}

public boolean isCompleted() {
	return isCompleted;
}

public void setCompleted(boolean isCompleted) {
	this.isCompleted = isCompleted;
}

}
