package comm.example.bean3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Task {

private String taskId;
private String author;
private String taskName;
@Override
public String toString() {
	return "Task [taskId=" + taskId + ", author=" + author + ", taskName=" + taskName + "]";
}


}
