public class Main {
    public static void main(String[] args){
//#1 Создать класс Student со следующими полями
// (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
//Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
// который возвращает строку с данными студента.
        System.out.println("Student : ");
Student ruslan = new Student();
ruslan.firstName= "Ruslan";
ruslan.lastName="Andrieiev";
ruslan.birthday =4;
ruslan.group = 31;
ruslan.startCourse = 9;
        ptintStudent(ruslan);
    }
public static void ptintStudent(Student student){
    System.out.println("First name - "+ student.firstName+"\nLast name -  "+student.lastName+"\nBirthday - "+student.birthday+"\nGroup number -  "+student.group+"\nStart course -  "+student.startCourse);
}
}