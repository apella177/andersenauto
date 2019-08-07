package Task16;

public class DataTest4<T, E> {                                               //Задание 2.Generic
    private T name;
    private E age;

    public void setName(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public E getAge() {
        return age;
    }
}
