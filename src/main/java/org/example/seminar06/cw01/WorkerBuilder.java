package org.example.seminar06.cw01;

public class WorkerBuilder {
    public static Worker setNameAge(String name, int age){
        Worker worker = new Worker();
        worker.setName(name);
        worker.setAge(age);
        return worker;
    }
    public static Worker setNameSalary(String name, int salary){
        Worker worker = new Worker();
        worker.setName(name);
        worker.setSalary(salary);
        return worker;
    }


}
