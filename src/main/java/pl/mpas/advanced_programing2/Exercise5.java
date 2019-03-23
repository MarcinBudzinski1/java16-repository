package pl.mpas.advanced_programing2;

class Person implements Cloneable{
    private String name;
    private String surname;

    private Person partner;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner.name +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }
    public Person performCLoning() {
        Person newYou = null;
        try {
            newYou.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newYou;
    }
}
public class Exercise5 {

    public static void main(String[] args) {


        Person me = new Person("Marcin", "Budziński", null);
        Person wife = new Person("Kasia", "P", me);
        me.setPartner(wife);

        System.out.println("Me " + me);
        System.out.println("Wife" + wife);

        Person clonedWife = wife.performCLoning();
        System.out.println(clonedWife);

    }
}