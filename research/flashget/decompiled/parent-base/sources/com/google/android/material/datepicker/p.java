package com.google.android.material.datepicker;

import androidx.annotation.q0;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes6.dex */
class p {

    /* renamed from: c, reason: collision with root package name */
    private static final p f53217c = new p(null, null);

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Long f53218a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final TimeZone f53219b;

    private p(@q0 Long l4, @q0 TimeZone timeZone) {
        this.f53218a = l4;
        this.f53219b = timeZone;
    }

    static p a(long j4) {
        return new p(Long.valueOf(j4), null);
    }

    static p b(long j4, @q0 TimeZone timeZone) {
        return new p(Long.valueOf(j4), timeZone);
    }

    static p e() {
        return f53217c;
    }

    Calendar c() {
        return d(this.f53219b);
    }

    Calendar d(@q0 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l4 = this.f53218a;
        if (l4 != null) {
            calendar.setTimeInMillis(l4.longValue());
        }
        return calendar;
    }
}
