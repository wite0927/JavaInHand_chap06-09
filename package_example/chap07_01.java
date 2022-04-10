package package_example;
public class chap07_01 {
    //MyClass p.173
    chap07_01(){
        System.out.println("NO Param");
    }

    public chap07_01(int p){
        System.out.println("int : "+p);
    }

    chap07_01(String p){
        System.out.println("string : "+p);
    }
    public static void main(String[] args) {
        chap07_01 obj1 = new chap07_01();

        chap07_01 obj2 = new chap07_01(1);

        chap07_01 obj3 = new chap07_01("exam");
    }
}