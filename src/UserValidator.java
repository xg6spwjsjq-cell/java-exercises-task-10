import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserValidator {
    private final List<Predicate<UserForm>> rules = new ArrayList<>();

    public void addRule(Predicate<UserForm> rule) {
        rules.add(rule);
    }

    public boolean isValid(UserForm form) {
        for (Predicate<UserForm> rule : rules) {
            if (!rule.test(form)) {
                return false;
            }
        }
        return true;
    }
}