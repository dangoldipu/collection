package practice;
import java.util.Comparator;

public class timeCompare implements Comparator< Time2 >{
    public int compare( Time2 time1, Time2 time2) {
        int hourCompare = time1.getHour() - time2.getHour();

        if (hourCompare != 0)
            return hourCompare;

        int minuteCompare = time1.getMin() - time2.getMin();

        if (minuteCompare != 0)
            return minuteCompare;

        int secondCompare = time1.getSec() - time2.getSec();
        return secondCompare;
    }
}
