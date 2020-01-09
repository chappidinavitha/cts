package todopackage;

import java.util.List;

public interface ToDoDao {
	public ToDo createToDo(String toDoName);
	public List<ToDo> getAllToDoc();
	public ToDo findById(String toDoId);
	
	

}
