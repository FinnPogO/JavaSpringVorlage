
package gymhum.de;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import gymhum.de.model.Person;

@SpringBootApplication
public class VorlageJsApplication {

	static ArrayList<Person> personen;
	public static void main(String[] args) {
		SpringApplication.run(VorlageJsApplication.class, args);
	}

}
