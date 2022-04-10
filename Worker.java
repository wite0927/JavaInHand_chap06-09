public class Worker extends Human {
    //Worker p.185
    void work(){
        System.out.println("work at " +age);
    }
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.age = 10;
        worker.play();
        worker.work();
    }
}
