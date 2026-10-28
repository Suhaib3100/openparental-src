package com.android.volley;

import androidx.annotation.q0;
import com.android.volley.e;

/* compiled from: Response.java */
/* loaded from: classes3.dex */
public class q<T> {

    /* renamed from: a, reason: collision with root package name */
    @q0
    public final T f40938a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    public final e.a f40939b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    public final VolleyError f40940c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40941d;

    /* compiled from: Response.java */
    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* compiled from: Response.java */
    public interface b<T> {
        void onResponse(T t4);
    }

    private q(@q0 T t4, @q0 e.a aVar) {
        this.f40941d = false;
        this.f40938a = t4;
        this.f40939b = aVar;
        this.f40940c = null;
    }

    public static <T> q<T> a(VolleyError volleyError) {
        return new q<>(volleyError);
    }

    public static <T> q<T> c(@q0 T t4, @q0 e.a aVar) {
        return new q<>(t4, aVar);
    }

    public boolean b() {
        return this.f40940c == null;
    }

    private q(VolleyError volleyError) {
        this.f40941d = false;
        this.f40938a = null;
        this.f40939b = null;
        this.f40940c = volleyError;
    }
}
