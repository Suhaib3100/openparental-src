package com.applandeo.materialcalendarview;

import android.graphics.drawable.Drawable;
import androidx.annotation.c1;
import androidx.annotation.v;
import java.util.Calendar;

/* compiled from: EventDay.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private Calendar f41902a;

    /* renamed from: b, reason: collision with root package name */
    private Object f41903b;

    /* renamed from: c, reason: collision with root package name */
    private int f41904c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41905d;

    public m(Calendar calendar) {
        this.f41902a = calendar;
    }

    public Calendar a() {
        return this.f41902a;
    }

    @c1({c1.a.LIBRARY})
    public Object b() {
        return this.f41903b;
    }

    @c1({c1.a.LIBRARY})
    public int c() {
        return this.f41904c;
    }

    public boolean d() {
        return !this.f41905d;
    }

    @c1({c1.a.LIBRARY})
    public void e(boolean z4) {
        this.f41905d = z4;
    }

    public m(Calendar calendar, @v int i4) {
        t3.h.h(calendar);
        this.f41902a = calendar;
        this.f41903b = Integer.valueOf(i4);
    }

    public m(Calendar calendar, Drawable drawable) {
        t3.h.h(calendar);
        this.f41902a = calendar;
        this.f41903b = drawable;
    }

    public m(Calendar calendar, @v int i4, int i5) {
        t3.h.h(calendar);
        this.f41902a = calendar;
        this.f41903b = Integer.valueOf(i4);
        this.f41904c = i5;
    }

    public m(Calendar calendar, Drawable drawable, int i4) {
        t3.h.h(calendar);
        this.f41902a = calendar;
        this.f41903b = drawable;
        this.f41904c = i4;
    }
}
