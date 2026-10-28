package com.airbnb.lottie.model;

import android.graphics.Typeface;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: Font.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f38980a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38981b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38982c;

    /* renamed from: d, reason: collision with root package name */
    private final float f38983d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private Typeface f38984e;

    public c(String str, String str2, String str3, float f4) {
        this.f38980a = str;
        this.f38981b = str2;
        this.f38982c = str3;
        this.f38983d = f4;
    }

    float a() {
        return this.f38983d;
    }

    public String b() {
        return this.f38980a;
    }

    public String c() {
        return this.f38981b;
    }

    public String d() {
        return this.f38982c;
    }

    @q0
    public Typeface e() {
        return this.f38984e;
    }

    public void f(@q0 Typeface typeface) {
        this.f38984e = typeface;
    }
}
