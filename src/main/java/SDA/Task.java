package SDA;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private Priorytet priorytet;
    private Status status;
    private String nazwa;
    private String opis;
    LocalDate dataUtworzenia;

    public Task(Priorytet priorytet, Status status, String nazwa, String opis, LocalDate dataUtworzenia) {
        this.priorytet = priorytet;
        this.status = status;
        this.nazwa = nazwa;
        this.opis = opis;
        this.dataUtworzenia = dataUtworzenia;
    }

    public Priorytet getPriorytet() {
        return priorytet;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public LocalDate getDataUtworzenia() {
        return dataUtworzenia;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "priorytet=" + priorytet +
                ", status=" + status +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", dataUtworzenia=" + dataUtworzenia +
                '}';
    }


    @Override
    public int compareTo(Task o) {
        int result = this.nazwa.compareTo(o.getNazwa());
        if (result == 0) {
            result = this.opis.compareTo(o.getOpis());
        }
        if (result == 0) {
//           result = this.priorytet.compareTo(o.getPriorytet());
            result = o.getPriorytet().compareTo(this.priorytet);

        }
        if (result == 0) {
            result = this.status.compareTo(o.getStatus());
        }
        return result;


    }
}

