package t3;

import android.content.Context;
import com.annimon.stream.p;
import com.applandeo.materialcalendarview.n;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: DateUtils.java */
/* loaded from: classes3.dex */
public class h {
    public static Calendar a() {
        Calendar calendar = Calendar.getInstance();
        h(calendar);
        return calendar;
    }

    private static long b(Calendar calendar, Calendar calendar2) {
        return TimeUnit.MILLISECONDS.toDays(calendar2.getTimeInMillis() - calendar.getTimeInMillis());
    }

    public static String c(Context context, Calendar calendar) {
        return String.format(ProtectedSandApp.s("⁰"), context.getResources().getStringArray(n.b.f41919b)[calendar.get(2)], Integer.valueOf(calendar.get(1)));
    }

    public static int d(Calendar calendar, Calendar calendar2) {
        return (calendar2.get(2) + ((calendar2.get(1) - calendar.get(1)) * 12)) - calendar.get(2);
    }

    public static boolean e(List<Calendar> list) {
        int size = list.size();
        if (list.isEmpty() || size == 1) {
            return true;
        }
        List G2 = p.N0(list).g2(new g()).G2();
        return ((long) size) == b((Calendar) G2.get(0), (Calendar) G2.get(size - 1)) + 1;
    }

    public static boolean f(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            return false;
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        h(calendar3);
        calendar3.set(5, 1);
        Calendar calendar4 = (Calendar) calendar2.clone();
        h(calendar4);
        calendar4.set(5, 1);
        return calendar4.after(calendar3);
    }

    public static boolean g(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            return false;
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        h(calendar3);
        calendar3.set(5, 1);
        Calendar calendar4 = (Calendar) calendar2.clone();
        h(calendar4);
        calendar4.set(5, 1);
        return calendar4.before(calendar3);
    }

    public static void h(Calendar calendar) {
        if (calendar != null) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
    }
}
