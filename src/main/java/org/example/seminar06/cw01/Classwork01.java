package org.example.seminar06.cw01;

public class Classwork01 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker = WorkerBuilder.setNameAge("Vladimir",35);
        System.out.println(worker);
        var worker2 = WorkerBuilder.setNameSalary("Ivan",60000);
        System.out.println(worker2);
        var worker3 = WorkerBuilderMain.getInstance().setName("Petr").phoneNumber(123456).cabinet(223).build();
        System.out.println(worker3);
        Worker worker4 = new Worker();
    }
}
