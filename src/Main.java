public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}

class Person {
    String firstName, lastName, job;
    double weight, height;
    int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, String job, int age, double height, double weight){
        this(firstName,lastName,age);
        this.job = job;
        this.height = height;
        this.weight = weight;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if(age >= 13 && age <= 19) return true;

        return false;
    }
}

class Wall {
    double width, height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width >= 0 ? width : 0;
    }

    public void setHeight(double height) {
        this.height = height >= 0 ? height : 0;
    }

    public double getArea() {
        return  width * height;
    }
}