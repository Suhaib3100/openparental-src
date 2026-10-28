package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Objects;

/* compiled from: CalendarUtils.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f86222b = new a(Calendar.getInstance());

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f86223a;

    public a(Calendar calendar) {
        Objects.requireNonNull(calendar, "calendar");
        this.f86223a = calendar;
    }

    public int a() {
        return this.f86223a.get(5);
    }

    public int b() {
        return this.f86223a.get(2);
    }

    public int c() {
        return this.f86223a.get(1);
    }
}
