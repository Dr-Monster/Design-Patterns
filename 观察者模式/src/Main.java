public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        ISubject iSubject = new ESubject();

        EObserver eObserver1 = new EObserver("AA");
        EObserver eObserver2 = new EObserver("BB");
        EObserver eObserver3 = new EObserver("CC");

        iSubject.attachOB(eObserver1);
        iSubject.attachOB(eObserver2);
        iSubject.attachOB(eObserver3);

        iSubject.notifyOB();
    }
}
