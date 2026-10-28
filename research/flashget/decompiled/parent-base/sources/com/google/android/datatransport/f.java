package com.google.android.datatransport;

import androidx.annotation.q0;

/* compiled from: Event.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class f<T> {
    public static <T> f<T> A(T t4, @q0 g gVar) {
        return new a(null, t4, h.HIGHEST, null, gVar);
    }

    public static <T> f<T> B(T t4, @q0 i iVar) {
        return new a(null, t4, h.HIGHEST, iVar, null);
    }

    public static <T> f<T> C(T t4, @q0 i iVar, @q0 g gVar) {
        return new a(null, t4, h.HIGHEST, iVar, gVar);
    }

    public static <T> f<T> f(int i4, T t4) {
        return new a(Integer.valueOf(i4), t4, h.DEFAULT, null, null);
    }

    public static <T> f<T> g(int i4, T t4, @q0 g gVar) {
        return new a(Integer.valueOf(i4), t4, h.DEFAULT, null, gVar);
    }

    public static <T> f<T> h(int i4, T t4, @q0 i iVar) {
        return new a(Integer.valueOf(i4), t4, h.DEFAULT, iVar, null);
    }

    public static <T> f<T> i(int i4, T t4, @q0 i iVar, @q0 g gVar) {
        return new a(Integer.valueOf(i4), t4, h.DEFAULT, iVar, gVar);
    }

    public static <T> f<T> j(T t4) {
        return new a(null, t4, h.DEFAULT, null, null);
    }

    public static <T> f<T> k(T t4, @q0 g gVar) {
        return new a(null, t4, h.DEFAULT, null, gVar);
    }

    public static <T> f<T> l(T t4, @q0 i iVar) {
        return new a(null, t4, h.DEFAULT, iVar, null);
    }

    public static <T> f<T> m(T t4, @q0 i iVar, @q0 g gVar) {
        return new a(null, t4, h.DEFAULT, iVar, gVar);
    }

    public static <T> f<T> n(int i4, T t4) {
        return new a(Integer.valueOf(i4), t4, h.VERY_LOW, null, null);
    }

    public static <T> f<T> o(int i4, T t4, @q0 g gVar) {
        return new a(Integer.valueOf(i4), t4, h.VERY_LOW, null, gVar);
    }

    public static <T> f<T> p(int i4, T t4, @q0 i iVar) {
        return new a(Integer.valueOf(i4), t4, h.VERY_LOW, iVar, null);
    }

    public static <T> f<T> q(int i4, T t4, @q0 i iVar, @q0 g gVar) {
        return new a(Integer.valueOf(i4), t4, h.VERY_LOW, iVar, gVar);
    }

    public static <T> f<T> r(T t4) {
        return new a(null, t4, h.VERY_LOW, null, null);
    }

    public static <T> f<T> s(T t4, @q0 g gVar) {
        return new a(null, t4, h.VERY_LOW, null, gVar);
    }

    public static <T> f<T> t(T t4, @q0 i iVar) {
        return new a(null, t4, h.VERY_LOW, iVar, null);
    }

    public static <T> f<T> u(T t4, @q0 i iVar, @q0 g gVar) {
        return new a(null, t4, h.VERY_LOW, iVar, gVar);
    }

    public static <T> f<T> v(int i4, T t4) {
        return new a(Integer.valueOf(i4), t4, h.HIGHEST, null, null);
    }

    public static <T> f<T> w(int i4, T t4, @q0 g gVar) {
        return new a(Integer.valueOf(i4), t4, h.HIGHEST, null, gVar);
    }

    public static <T> f<T> x(int i4, T t4, @q0 i iVar) {
        return new a(Integer.valueOf(i4), t4, h.HIGHEST, iVar, null);
    }

    public static <T> f<T> y(int i4, T t4, @q0 i iVar, @q0 g gVar) {
        return new a(Integer.valueOf(i4), t4, h.HIGHEST, iVar, gVar);
    }

    public static <T> f<T> z(T t4) {
        return new a(null, t4, h.HIGHEST, null, null);
    }

    @q0
    public abstract Integer a();

    @q0
    public abstract g b();

    public abstract T c();

    public abstract h d();

    @q0
    public abstract i e();
}
