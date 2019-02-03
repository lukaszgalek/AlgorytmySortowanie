package SDA;

import java.time.LocalDate;

import static SDA.Priorytet.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        System.out.println(liczbaPierwsza.getPrime(56));
        Task task = new Task(WYSOKI, Status.NOWE, "B", "C", LocalDate.parse("2019-02-03"));
        Task task4 = new Task(WYSOKI, Status.NOWE, "A", "C", LocalDate.parse("2019-02-03"));
        Task task1 = new Task(NISKI, Status.ZAKOŃCZONE, "D", "B", LocalDate.parse("2010-03-05"));
        Task task2 = new Task(WYSOKI, Status.WtrakcieREALIZACJI, "A", "A", LocalDate.parse("2010-03-05"));
        Task task3 = new Task(ŚREDNI, Status.NOWE, "A", "C", LocalDate.parse("2014-10-10"));

//        List<Task>list = new LinkedList<>();
//        list.add(task);
//        list.add(task1);
//        list.add(task2);
//        list.add(task3);

//        for(Task x: list){
//            System.out.println(x.toString());
//        }
//
//        list.sort(Task::compareTo);
//        System.out.println("\n");
//        for(Task x: list){
//            System.out.println(x.toString());
//        }
        TodoList todoList = new TodoList();
        todoList.addTask(task);
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.addTask(task3);
        todoList.addTask(task4);
//        System.out.println(todoList.getTasks(TaskComparator.sortyByName())+ "\n");
//        for(Task x: todoList.getTasks()){
//            System.out.println(x.toString());
//            System.out.println(todoList.getTasks(TaskComparator.sortyByLocalDatePrio()));
//        for( int i = 0; i<list.size(); i++);
//        return list;
        System.out.println(todoList.getTasks(TaskComparator.sortyByName(),OrderSort.DESC)+ "\n");
        System.out.println(todoList.getTasks(TaskComparator.sortyByName(),OrderSort.ASC)+ "\n");
        System.out.println(todoList.getTasks(new SortyByName()));
    }


    }

