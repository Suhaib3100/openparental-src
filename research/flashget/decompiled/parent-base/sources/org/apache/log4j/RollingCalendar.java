package org.apache.log4j;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DailyRollingFileAppender.java */
/* loaded from: classes3.dex */
class RollingCalendar extends GregorianCalendar {
    private static final long serialVersionUID = -3560331770601814177L;
    int type;

    RollingCalendar() {
        this.type = -1;
    }

    public Date getNextCheckDate(Date date) {
        setTime(date);
        int i4 = this.type;
        if (i4 == 0) {
            set(13, 0);
            set(14, 0);
            add(12, 1);
        } else if (i4 == 1) {
            set(12, 0);
            set(13, 0);
            set(14, 0);
            add(11, 1);
        } else if (i4 == 2) {
            set(12, 0);
            set(13, 0);
            set(14, 0);
            if (get(11) < 12) {
                set(11, 12);
            } else {
                set(11, 0);
                add(5, 1);
            }
        } else if (i4 == 3) {
            set(11, 0);
            set(12, 0);
            set(13, 0);
            set(14, 0);
            add(5, 1);
        } else if (i4 == 4) {
            set(7, getFirstDayOfWeek());
            set(11, 0);
            set(12, 0);
            set(13, 0);
            set(14, 0);
            add(3, 1);
        } else {
            if (i4 != 5) {
                throw new IllegalStateException("Unknown periodicity type.");
            }
            set(5, 1);
            set(11, 0);
            set(12, 0);
            set(13, 0);
            set(14, 0);
            add(2, 1);
        }
        return getTime();
    }

    public long getNextCheckMillis(Date date) {
        return getNextCheckDate(date).getTime();
    }

    void setType(int i4) {
        this.type = i4;
    }

    RollingCalendar(TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
        this.type = -1;
    }
}
