package comm6.example;
import java.time.LocalDate;
import java.util.UUID;

public class MyApp {

	public static void main(String[] args) {
		Task myTask=new Task(UUID.randomUUID().toString(),"java",LocalDate.now(),true);
		Task myTask1=new Task(UUID.randomUUID().toString(),"java",LocalDate.now(),true);
		System.out.println("TaskDetails: \n"+myTask+"\nTask2 Details: \n"+myTask1);
		System.out.println(myTask==myTask1);
		System.out.println(myTask.equals(myTask1));
		
	}

	
    
}
