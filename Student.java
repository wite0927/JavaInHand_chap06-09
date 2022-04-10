public class Student extends Human {
    //Student p.187
    @Override
    void play(){
        System.out.println("not play at "+age);
    }

    void study(){
        System.out.println("study at "+age);
    }
    
    public static void main(String[] args) {
        Student student = new Student();

        student.age = 10;
        student.play();
        student.study();
    }
}
//@Override 를 통해 부모 클래스의 메소드를 오버라이드 가능
//super 를 사용하여 명시적으로 부모 클래스의 자원임을 나타낼 수 있고,
//this 를 사용하여 명시적으로 자식 클래스의 자원임을 나타낼 수 있음.