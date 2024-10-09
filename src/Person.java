public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    protected void getInfo() {
        System.out.println("Имя: " + this.name + " , возраст: " + this.age);
    }
}
