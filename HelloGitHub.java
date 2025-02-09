import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloGitHub {
	public static void main(String[] args) {
		// By Marvin Morales Agudines

	        // Get the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        
	        // Format the date and time
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        String formattedDateTime = currentDateTime.format(formatter);
		
		System.out.println("Hello, Github!");

		// Prints Current Date
		System.out.println("Current Date and Time: " + formattedDateTime);	

		// This is the merged code
		System.out.println("Merged code.")
	}
}
