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
	    

	    	System.out.println("Edited in Cloned Eclipse Workspace 3");
//pulled and made conflict free
			System.out.println("Test Commit 4 Workspace2");
			//return "Hello World Test2! Git edited 2  ";
// After resoving conflicts from remote repository
			System.out.println("Branch Edit 1");
			System.out.println("Branch Edit 2");
			

	        return "Hello World Test2! Git edited 2 (Edited in Cloned Eclipse Workspace 3)  ";




	    }
	    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloWorld.class, args);  
	}

}
