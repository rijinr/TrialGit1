package test2;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication  

@RestController
	@EnableAutoConfiguration
	
public class HelloWorld {


	    @RequestMapping("/")
	    String home() {
	    
<<<<<<< HEAD
	    	System.out.println("Edited in Cloned Eclipse Workspace 3");
	        return "Hello World Test2! Git edited 2 (Edited in Cloned Eclipse Workspace 3)";
=======
	    	System.out.println("Test Commit 4 Workspace2");
	        return "Hello World Test2! Git edited 2  ";
>>>>>>> branch 'master' of https://github.com/rijinr/TrialGit1.git
	    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorld.class, args);  
	}

}
