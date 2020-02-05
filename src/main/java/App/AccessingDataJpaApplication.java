package App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    @Bean
    public CommandLineRunner demo(BuddyRep repository) {
        return (args) -> {

            repository.save(new BuddyInfo("Rayhaan", "Ottawa",1,22));
            repository.save(new BuddyInfo("RayRay", "Montreal",2,22));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo bud : repository.findAll()) {
                log.info(bud.toString());
            }
            log.info("");


           BuddyInfo customer = repository.findByNumber(1);
            log.info("Customer found with findByNumber(1):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");


            log.info("Customer found with findByName('Rayhaan'):");
            log.info("--------------------------------------------");
            repository.findByName("Rayhaan").forEach(rayhaan -> {
                log.info(rayhaan.toString());
            });

            log.info("");
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

}