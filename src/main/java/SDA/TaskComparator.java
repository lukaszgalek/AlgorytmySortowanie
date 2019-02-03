package SDA;

import java.util.Comparator;

public class TaskComparator  {

    public static Comparator<Task> sortyByName(){
        Comparator<Task> sortByName = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getNazwa().compareTo(o2.getNazwa());
                return result;
            }
        };
        return sortByName;
    }
    public static Comparator<Task>sortyByLocalDate() {
        Comparator<Task> sortByLocalDate = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getDataUtworzenia().compareTo(o2.getDataUtworzenia());

                return result;
            }
        };
        return sortByLocalDate;
    }

    public static Comparator<Task>sortyByPriorytet() {
        Comparator<Task> sortByPriorytet = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getPriorytet().compareTo(o2.getPriorytet());

                return result;
            }
        };
        return sortByPriorytet;
    }

    public static Comparator<Task>sortyByLocalDatePrio() {
        Comparator<Task> sortByLocalDate = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getDataUtworzenia().compareTo(o2.getDataUtworzenia());
                if(result ==0){
                    result = o1.getPriorytet().compareTo(o2.getPriorytet());
                }

                return result;
            }
        };
        return sortByLocalDate;
    }

    public static Comparator<Task> sortyByNameAD(){
        Comparator<Task> sortByName = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int result = o1.getNazwa().compareTo(o2.getNazwa());
                return result;
            }
        };
        return sortByName;
    }
    //reversOrder lub revers

//Comparator<Task> porownywanie = new Comparator<Task>() {
//    @Override
//    public int compare(Task o1, Task o2) {
//        return o1.getPriorytet().compareTo();
//    }
//};

}
