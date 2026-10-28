package com.google.android.material.datepicker;

import androidx.annotation.q0;
import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes2.dex */
class p {

    /* renamed from: c, reason: collision with root package name */
    private static final p f13438c = new p(null, null);

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final Long f13439a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final TimeZone f13440b;

    private p(@q0 Long l5, @q0 TimeZone timeZone) {
        this.f13439a = l5;
        this.f13440b = timeZone;
    }

    static p a(long j5) {
        return new p(Long.valueOf(j5), null);
    }

    static p b(long j5, @q0 TimeZone timeZone) {
        return new p(Long.valueOf(j5), timeZone);
    }

    static p e() {
        return f13438c;
    }

    Calendar c() {
        return d(this.f13440b);
    }

    Calendar d(@q0 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l5 = this.f13439a;
        if (l5 != null) {
            calendar.setTimeInMillis(l5.longValue());
        }
        return calendar;
    }
}
