package com.google.android.datatransport;

import androidx.annotation.q0;
import com.google.auto.value.AutoValue;

/* compiled from: Event.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class d<T> {
    public static <T> d<T> d(int i5, T t5) {
        return new a(Integer.valueOf(i5), t5, e.DEFAULT);
    }

    public static <T> d<T> e(T t5) {
        return new a(null, t5, e.DEFAULT);
    }

    public static <T> d<T> f(int i5, T t5) {
        return new a(Integer.valueOf(i5), t5, e.VERY_LOW);
    }

    public static <T> d<T> g(T t5) {
        return new a(null, t5, e.VERY_LOW);
    }

    public static <T> d<T> h(int i5, T t5) {
        return new a(Integer.valueOf(i5), t5, e.HIGHEST);
    }

    public static <T> d<T> i(T t5) {
        return new a(null, t5, e.HIGHEST);
    }

    @q0
    public abstract Integer a();

    public abstract T b();

    public abstract e c();
}
