package org.apache.commons.lang3.time;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DatePrinter.java */
/* loaded from: classes6.dex */
public interface d {
    String b();

    TimeZone c();

    @Deprecated
    StringBuffer d(long j4, StringBuffer stringBuffer);

    @Deprecated
    StringBuffer e(Date date, StringBuffer stringBuffer);

    StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition);

    <B extends Appendable> B g(Calendar calendar, B b5);

    Locale getLocale();

    String k(Date date);

    @Deprecated
    StringBuffer l(Calendar calendar, StringBuffer stringBuffer);

    String m(long j4);

    <B extends Appendable> B o(long j4, B b5);

    <B extends Appendable> B p(Date date, B b5);

    String q(Calendar calendar);
}
