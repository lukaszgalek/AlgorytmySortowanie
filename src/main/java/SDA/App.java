package SDA;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static SDA.Priorytet.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LiczbaPierwsza liczbaPierwsza = new LiczbaPierwsza();
        System.out.println(liczbaPierwsza.getPrime(56));

Task task = new Task(WYSOKI, Status.NOWE,"nazwa","zrobic to i to ", LocalDate.parse("2019-02-03"));
Task task1 = new Task(NISKI, Status.ZAKOŃCZONE,"A","rób to i tamto ", LocalDate.parse("2010-03-05"));
Task task2 = new Task(WYSOKI, Status.WtrakcieREALIZACJI,"A","zrobic cos ", LocalDate.parse("2010-03-05"));
Task task3 = new Task(ŚREDNI, Status.NOWE,"jakas nazwa","zrobic cos innego ", LocalDate.parse("2014-10-10"));

        List<Task>list = new LinkedList<>();
        list.add(task);
        list.add(task1);
        list.add(task2);
        list.add(task3);

        for(Task x: list){
            System.out.println(x.toString());
        }

        list.sort(Task::compareTo);
        System.out.println("\n");
        for(Task x: list){
            System.out.println(x.toString());
        }

    }
}
