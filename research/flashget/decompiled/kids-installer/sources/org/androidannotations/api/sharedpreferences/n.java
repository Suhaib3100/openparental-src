package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: SharedPreferencesHelper.java */
/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f31796a;

    public n(SharedPreferences sharedPreferences) {
        this.f31796a = sharedPreferences;
    }

    protected d a(String str, boolean z5) {
        return new d(this.f31796a, str, Boolean.valueOf(z5));
    }

    public final void b() {
        m.a(this.f31796a.edit().clear());
    }

    protected g c(String str, float f6) {
        return new g(this.f31796a, str, Float.valueOf(f6));
    }

    public final SharedPreferences d() {
        return this.f31796a;
    }

    protected i e(String str, int i5) {
        return new i(this.f31796a, str, Integer.valueOf(i5));
    }

    protected k f(String str, long j5) {
        return new k(this.f31796a, str, Long.valueOf(j5));
    }

    protected p g(String str, String str2) {
        return new p(this.f31796a, str, str2);
    }

    protected r h(String str, Set<String> set) {
        return new r(this.f31796a, str, set);
    }
}
