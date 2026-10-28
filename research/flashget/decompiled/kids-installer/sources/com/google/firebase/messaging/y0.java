package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.n1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes2.dex */
final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17652a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17653b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17654c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f17656e;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("internalQueue")
    @androidx.annotation.m1
    final ArrayDeque<String> f17655d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("internalQueue")
    private boolean f17657f = false;

    private y0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f17652a = sharedPreferences;
        this.f17653b = str;
        this.f17654c = str2;
        this.f17656e = executor;
    }

    @androidx.annotation.b0("internalQueue")
    private String e(String str) {
        f(str != null);
        return str;
    }

    @androidx.annotation.b0("internalQueue")
    private boolean f(boolean z5) {
        if (z5 && !this.f17657f) {
            s();
        }
        return z5;
    }

    @n1
    static y0 j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        y0 y0Var = new y0(sharedPreferences, str, str2, executor);
        y0Var.k();
        return y0Var;
    }

    @n1
    private void k() {
        synchronized (this.f17655d) {
            this.f17655d.clear();
            String string = this.f17652a.getString(this.f17653b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f17654c)) {
                String[] split = string.split(this.f17654c, -1);
                int length = split.length;
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f17655d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public void r() {
        synchronized (this.f17655d) {
            this.f17652a.edit().putString(this.f17653b, o()).commit();
        }
    }

    private void s() {
        this.f17656e.execute(new Runnable() { // from class: com.google.firebase.messaging.x0
            @Override // java.lang.Runnable
            public final void run() {
                y0.this.r();
            }
        });
    }

    public boolean b(@androidx.annotation.o0 String str) {
        boolean f6;
        if (TextUtils.isEmpty(str) || str.contains(this.f17654c)) {
            return false;
        }
        synchronized (this.f17655d) {
            f6 = f(this.f17655d.add(str));
        }
        return f6;
    }

    @androidx.annotation.b0("internalQueue")
    public void c() {
        this.f17657f = true;
    }

    @androidx.annotation.m1
    void d() {
        synchronized (this.f17655d) {
            this.f17657f = true;
        }
    }

    public void g() {
        synchronized (this.f17655d) {
            this.f17655d.clear();
            f(true);
        }
    }

    @androidx.annotation.b0("internalQueue")
    public void h() {
        this.f17657f = false;
        s();
    }

    @androidx.annotation.m1
    void i() {
        synchronized (this.f17655d) {
            h();
        }
    }

    @androidx.annotation.q0
    public String l() {
        String peek;
        synchronized (this.f17655d) {
            peek = this.f17655d.peek();
        }
        return peek;
    }

    public String m() {
        String e6;
        synchronized (this.f17655d) {
            e6 = e(this.f17655d.remove());
        }
        return e6;
    }

    public boolean n(@androidx.annotation.q0 Object obj) {
        boolean f6;
        synchronized (this.f17655d) {
            f6 = f(this.f17655d.remove(obj));
        }
        return f6;
    }

    @androidx.annotation.b0("internalQueue")
    @androidx.annotation.o0
    public String o() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f17655d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f17654c);
        }
        return sb.toString();
    }

    @androidx.annotation.m1
    public String p() {
        String o5;
        synchronized (this.f17655d) {
            o5 = o();
        }
        return o5;
    }

    public int q() {
        int size;
        synchronized (this.f17655d) {
            size = this.f17655d.size();
        }
        return size;
    }

    @androidx.annotation.o0
    public List<String> t() {
        ArrayList arrayList;
        synchronized (this.f17655d) {
            arrayList = new ArrayList(this.f17655d);
        }
        return arrayList;
    }
}
