package raphael.MyHotels;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
@Slf4j
public class MyHotelsApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyHotelsApplication.class, args);
		makeDirectory();
	}

	private static void makeDirectory(){
		File directory = new File(System.getProperty("user.dir"));
		String path = "pictures";
		File newDirectory = new File(directory, path);
		if(!newDirectory.exists()){
			boolean directoryStatus = newDirectory.mkdir();
			if (directoryStatus){
				log.info("Directory created");
			} else {
				log.warn("Error creating directory");
			}
		}
	}

}
