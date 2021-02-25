package ru.pebgs.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.pebgs.model.Student;
import ru.pebgs.repository.StudentRepository;

@SpringBootApplication(scanBasePackages = "ru.pebgs.*")
@EnableJpaRepositories("ru.pebgs.repository")
@EntityScan("ru.pebgs.model")
public class App implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public App(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = Student.builder()
                .name("Name")
                .secondName("SecondName")
                .surname("surname")
                .build();
        this.studentRepository.save(student);
    }
}
