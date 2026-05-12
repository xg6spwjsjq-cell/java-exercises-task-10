public class Main {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        validator.addRule(form -> form.email().contains("@"));
        validator.addRule(form -> form.password().length() >= 8);
        validator.addRule(form -> form.age() >= 18);

        UserForm form1 = new UserForm("anna@example.com", "secure123", 20);
        UserForm form2 = new UserForm("invalid-email", "shortpw", 16);

        System.out.println("Form 1 valid: " + validator.isValid(form1));
        System.out.println("Form 2 valid: " + validator.isValid(form2));
    }
}