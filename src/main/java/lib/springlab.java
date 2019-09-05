package lib;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class springlab {
	
	public static ArrayList<Car> car1 = new ArrayList<Car>();
	public static void main(String[] args) {
		SpringApplication.run(springlab.class, args);
	}

	@RequestMapping(value = "/create/{color}/{type}/{displacement}/{sunroof}/{speed}")
	public ResponseEntity<Car> create(@PathVariable String color, @PathVariable String type, @PathVariable int displacement, @PathVariable boolean sunroof, @PathVariable double speed) throws CloneNotSupportedException{
		Car car = new Car(color, type, displacement, sunroof, speed);
		car1.add(car);
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete/{index}")
	public String delete(@PathVariable int index) throws CloneNotSupportedException{
		car1.remove(index);
		return "Delete Success";
	}
	
	@RequestMapping(value = "/show")
	public List<Car> delete() {
		return car1;
	}
	
	@RequestMapping(value = "/update/{index}", method = RequestMethod.POST)
	public Car update(@RequestBody Car update, @PathVariable int index) {
		car1.get(index).setColor(update.getColor());
		car1.get(index).setType(update.getType());
		car1.get(index).setDisplacement((int) update.getDisplacement());
		car1.get(index).setSunroof(update.getSunroof());
		car1.get(index).setSpeed(update.getSpeed());
		return car1.get(index);
	}
	

}