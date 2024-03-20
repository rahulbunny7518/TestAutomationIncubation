package module4_java8.Task01.Task01_10_and_11;

class Employee1 implements Comparable<Employee1> {
    private String name;
    private int id;

    public Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
    	return "[name ="+ this.name + ", id="+this.id+"]";
    }

    @Override
    public int compareTo(Employee1 o) {
        return o.getName().compareTo(this.getName());
    }
}
