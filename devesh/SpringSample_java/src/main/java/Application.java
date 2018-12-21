

import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;





public class Application {

	public static void main(String[] args) {
    @SuppressWarnings("resource")
	ApplicationContext configuration= new AnnotationConfigApplicationContext(Appconfig.class);
    CustomerService service=configuration.getBean("customerService",CustomerService.class);
    service.addCustomer(new Customer("devesh","sethia"));
    System.out .println(service);
    
    CustomerService service2=configuration.getBean("customerService",CustomerService.class);
    service.addCustomer(new Customer("dev","gupta"));
    System.out .println(service2);
	}

}
