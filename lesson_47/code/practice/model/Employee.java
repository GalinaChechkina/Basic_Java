package practice.model;

public abstract class Employee {

    protected final int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double hours;
    protected int workExp;
    protected String education;


    // конструктор
    public Employee(int id, String firstName, String lastName, int age, double hours,int workExp,String education) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
        this.workExp = workExp;
        this.education = education;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    public int getWorkExp() {
        return workExp;
    }
    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());
        sb.append(", workExp=").append(workExp);
        sb.append(", education=").append(education).append('\'');
        return sb.toString();
    }
    public abstract double calcSalary(); // определили абстрактный метод (у него нет тела!)
}
