package SDA;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TodoList {
    private List<Task> tasks = new LinkedList<>();
//    Task task = new Task(WYSOKI, Status.NOWE, "A", "C", LocalDate.parse("2019-02-03"));
//    Task task1 = new Task(NISKI, Status.ZAKOŃCZONE, "A", "B", LocalDate.parse("2010-03-05"));
//    Task task2 = new Task(WYSOKI, Status.WtrakcieREALIZACJI, "A", "A", LocalDate.parse("2010-03-05"));
//    Task task3 = new Task(ŚREDNI, Status.NOWE, "A", "C", LocalDate.parse("2014-10-10"));


    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks(Comparator <Task> taskComparator) {
        tasks.sort(taskComparator);
        return tasks;// jak wywołamy compatarot to bez sortowania juz nie pokaze ta metoda nizej
    }

    public List<Task> getTasks() {
        return tasks;
    }
    public List<Task> getTasks(Comparator <Task> taskComparator,OrderSort order) {
        if(order.equals(OrderSort.ASC)){
        tasks.sort(taskComparator);}else
        {tasks.sort(taskComparator.reversed());}
        return tasks;
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "list=" + tasks +
                '}';

    }

}
