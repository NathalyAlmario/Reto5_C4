package Ciclo4.g20;

import Ciclo4.g20.interfaces.InterfaceOrder;
import Ciclo4.g20.interfaces.InterfaceProduct;
import Ciclo4.g20.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class G20Application implements CommandLineRunner{
    
        @Autowired
        private InterfaceProduct interfaceProduct;
        @Autowired
        private InterfaceUser interfaceUser;
        @Autowired
        private InterfaceOrder interfaceOrder;

	public static void main(String[] args) {
		SpringApplication.run(G20Application.class, args);
	}
        
        @Override
        public void run(String ... args) throws Exception{
        interfaceProduct.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
        }

}
