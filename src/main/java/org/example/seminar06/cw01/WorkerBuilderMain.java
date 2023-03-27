package org.example.seminar06.cw01;

public class WorkerBuilderMain {
    private static WorkerBuilderMain instance = null;
    private Worker obj;

    private WorkerBuilderMain() {
    }

    public static WorkerBuilderMain getInstance() {
        if (instance == null)
            instance = new WorkerBuilderMain();
        instance.obj = new Worker();
        return instance;
    }

    public WorkerBuilderMain setName(String name) {
        obj.setName(name);
        return this;
    }

    public WorkerBuilderMain salary(int salary) {
        obj.setSalary(salary);
        return this;
    }

    public WorkerBuilderMain phoneNumber(int phoneNumber) {
        obj.setPhoneNumber(phoneNumber);
        return this;
    }

    public WorkerBuilderMain cabinet(int cabinet) {
        obj.setCabinet(cabinet);
        return this;
    }


    public Worker build() {
        return obj;
    }

    @Override
    public String toString() {
        return "WorkerBuilder{" +
                "obj=" + obj +
                '}';
    }
}