package com.example.accessingdatacassandra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

@SpringBootApplication
public class AccessingDataCassandraApplication {

	private final static Logger log = LoggerFactory.getLogger(AccessingDataCassandraApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataCassandraApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner clr(VetRepository vetRepository) {
		return args -> {
			vetRepository.deleteAll();
			
			Vet john = new Vet(UUID.randomUUID(), "John", "Doe", new HashSet<>(Arrays.asList("surgery", "radiology")));
			Vet jane = new Vet(UUID.randomUUID(), "Jane", "Doe", new HashSet<>(Arrays.asList("radiology, surgery", "dentistry", "dermatology", "ophthalmology", "oncology", "pathology", "radiology", "surgery")));
			Vet jane1 = new Vet(UUID.randomUUID(), "Jane", "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));
			Vet jane2= new Vet(UUID.randomUUID(), "Jane", "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));
			Vet jane3 = new Vet(UUID.randomUUID(), "Jane", "Doe", new HashSet<>(Arrays.asList("radiology, surgery", "dentistry", "dermatology", "ophthalmology", "oncology", "pathology", "radiology", "surgery")));
			Vet jane4 = new Vet(UUID.randomUUID(), "Jane", "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));

			Vet savedJohn = vetRepository.save(john);
			Vet savedJane = vetRepository.save(jane);
			Vet savedJane1 = vetRepository.save(jane1);
			Vet savedJane2 = vetRepository.save(jane2);
			Vet savedJane3 = vetRepository.save(jane3);
			Vet savedJane4 = vetRepository.save(jane4);



			vetRepository.findAll()
				.forEach(v -> log.info("Vet: {},{},{}", v.getFirstName(),v.getLastName(),v.getSpecialties()));
			
			vetRepository.findById(savedJohn.getId())
				.ifPresent(v -> log.info("Vet by id: {}", v.getFirstName()));
		};
	}
}
