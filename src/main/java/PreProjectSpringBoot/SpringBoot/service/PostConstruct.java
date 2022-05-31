package PreProjectSpringBoot.SpringBoot.service;

import PreProjectSpringBoot.SpringBoot.model.Gender;
import PreProjectSpringBoot.SpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostConstruct {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @javax.annotation.PostConstruct
    public void init() {
        userService.addUser(new User("Andres", "Iniesta", Gender.male, "Football", 280000));
        userService.addUser(new User("Rafael", "Nadal", Gender.male, "Tennis", 650000));
        userService.addUser(new User("Lebron", "James", Gender.male, "Basketball", 920000));
        userService.addUser(new User("Shaquille", "O'neil", Gender.male, "Basketball", 480000));
        userService.addUser(new User("Naomi", "Osaka", Gender.female, "Tennis", 320000));
        userService.addUser(new User("Tiger", "Woods", Gender.male, "Golf", 33450000));
        userService.addUser(new User("Novak", "Djokovic", Gender.male, "Tennis", 870000));
        userService.addUser(new User("Mario", "Balotelli", Gender.male, "Football", 150000));
    }
}
