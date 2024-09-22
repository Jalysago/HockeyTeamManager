public class Coach extends Person{

    String coach_role;
    public  Coach(String name, int age, String role) {
        setName(name);
        setAge(age);
        this.coach_role = role;
    }

    @Override
    public void show() {
        super.show();
        System.out.println( "Role: " + coach_role);
        System.out.println("==============================");
    }
}
