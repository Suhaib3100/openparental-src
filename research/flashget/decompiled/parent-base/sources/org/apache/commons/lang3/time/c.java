package org.apache.commons.lang3.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateParser.java */
/* loaded from: classes6.dex */
public interface c {
    String b();

    TimeZone c();

    boolean f(String str, ParsePosition parsePosition, Calendar calendar);

    Locale getLocale();

    Date i(String str, ParsePosition parsePosition);

    Date n(String str) throws ParseException;

    Object parseObject(String str) throws ParseException;

    Object parseObject(String str, ParsePosition parsePosition);
}
