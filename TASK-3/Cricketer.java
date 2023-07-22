public class Cricketer {
    private String name;
    private int age;

    public Cricketer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void play() {
        System.out.println(name + " is playing cricket.");
    }
}

