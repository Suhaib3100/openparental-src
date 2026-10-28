package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;

/* compiled from: AbstractPrefField.java */
/* loaded from: classes5.dex */
public abstract class b<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final T f31786a;

    /* renamed from: b, reason: collision with root package name */
    protected final SharedPreferences f31787b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f31788c;

    public b(SharedPreferences sharedPreferences, String str, T t5) {
        this.f31787b = sharedPreferences;
        this.f31788c = str;
        this.f31786a = t5;
    }

    protected final void a(SharedPreferences.Editor editor) {
        m.a(editor);
    }

    protected SharedPreferences.Editor b() {
        return this.f31787b.edit();
    }

    public final boolean c() {
        return this.f31787b.contains(this.f31788c);
    }

    public final T d() {
        return e(this.f31786a);
    }

    public abstract T e(T t5);

    public String f() {
        return this.f31788c;
    }

    public final void g(T t5) {
        if (t5 == null) {
            t5 = this.f31786a;
        }
        h(t5);
    }

    protected abstract void h(T t5);

    public final void i() {
        a(b().remove(this.f31788c));
    }
}
