package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
import org.androidannotations.api.sharedpreferences.e;

/* compiled from: EditorHelper.java */
/* loaded from: classes5.dex */
public abstract class e<T extends e<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f31789a;

    public e(SharedPreferences sharedPreferences) {
        this.f31789a = sharedPreferences.edit();
    }

    private T c() {
        return this;
    }

    public final void a() {
        m.a(this.f31789a);
    }

    protected c<T> b(String str) {
        return new c<>(this, str);
    }

    public final T d() {
        this.f31789a.clear();
        return this;
    }

    protected f<T> e(String str) {
        return new f<>(this, str);
    }

    protected SharedPreferences.Editor f() {
        return this.f31789a;
    }

    protected h<T> g(String str) {
        return new h<>(this, str);
    }

    protected j<T> h(String str) {
        return new j<>(this, str);
    }

    protected o<T> i(String str) {
        return new o<>(this, str);
    }

    protected q<T> j(String str) {
        return new q<>(this, str);
    }
}
