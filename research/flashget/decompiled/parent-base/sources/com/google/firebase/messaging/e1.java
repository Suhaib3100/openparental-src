package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: SharedPreferencesQueue.java */
/* loaded from: classes6.dex */
final class e1 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f60030a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60031b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60032c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f60034e;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("internalQueue")
    @androidx.annotation.m1
    final ArrayDeque<String> f60033d = new ArrayDeque<>();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("internalQueue")
    private boolean f60035f = false;

    private e1(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f60030a = sharedPreferences;
        this.f60031b = str;
        this.f60032c = str2;
        this.f60034e = executor;
    }

    @androidx.annotation.b0("internalQueue")
    private String e(String str) {
        f(str != null);
        return str;
    }

    @androidx.annotation.b0("internalQueue")
    private boolean f(boolean z4) {
        if (z4 && !this.f60035f) {
            s();
        }
        return z4;
    }

    @androidx.annotation.n1
    static e1 j(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        e1 e1Var = new e1(sharedPreferences, str, str2, executor);
        e1Var.k();
        return e1Var;
    }

    @androidx.annotation.n1
    private void k() {
        synchronized (this.f60033d) {
            try {
                this.f60033d.clear();
                String string = this.f60030a.getString(this.f60031b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f60032c)) {
                    String[] split = string.split(this.f60032c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f60033d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.n1
    public void r() {
        synchronized (this.f60033d) {
            this.f60030a.edit().putString(this.f60031b, o()).commit();
        }
    }

    private void s() {
        this.f60034e.execute(new Runnable() { // from class: com.google.firebase.messaging.d1
            @Override // java.lang.Runnable
            public final void run() {
                e1.this.r();
            }
        });
    }

    public boolean b(@androidx.annotation.o0 String str) {
        boolean f4;
        if (TextUtils.isEmpty(str) || str.contains(this.f60032c)) {
            return false;
        }
        synchronized (this.f60033d) {
            f4 = f(this.f60033d.add(str));
        }
        return f4;
    }

    @androidx.annotation.b0("internalQueue")
    public void c() {
        this.f60035f = true;
    }

    @androidx.annotation.m1
    void d() {
        synchronized (this.f60033d) {
            this.f60035f = true;
        }
    }

    public void g() {
        synchronized (this.f60033d) {
            this.f60033d.clear();
            f(true);
        }
    }

    @androidx.annotation.b0("internalQueue")
    public void h() {
        this.f60035f = false;
        s();
    }

    @androidx.annotation.m1
    void i() {
        synchronized (this.f60033d) {
            h();
        }
    }

    @androidx.annotation.q0
    public String l() {
        String peek;
        synchronized (this.f60033d) {
            peek = this.f60033d.peek();
        }
        return peek;
    }

    public String m() {
        String e4;
        synchronized (this.f60033d) {
            e4 = e(this.f60033d.remove());
        }
        return e4;
    }

    public boolean n(@androidx.annotation.q0 Object obj) {
        boolean f4;
        synchronized (this.f60033d) {
            f4 = f(this.f60033d.remove(obj));
        }
        return f4;
    }

    @androidx.annotation.b0("internalQueue")
    @androidx.annotation.o0
    public String o() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f60033d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f60032c);
        }
        return sb.toString();
    }

    @androidx.annotation.m1
    public String p() {
        String o4;
        synchronized (this.f60033d) {
            o4 = o();
        }
        return o4;
    }

    public int q() {
        int size;
        synchronized (this.f60033d) {
            size = this.f60033d.size();
        }
        return size;
    }

    @androidx.annotation.o0
    public List<String> t() {
        ArrayList arrayList;
        synchronized (this.f60033d) {
            arrayList = new ArrayList(this.f60033d);
        }
        return arrayList;
    }
}
