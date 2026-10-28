package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: d, reason: collision with root package name */
    private static final String f44703d = ProtectedSandApp.s("ਸ");

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f44704a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f44705b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f44706c;

    @m1
    void a(com.bumptech.glide.request.e eVar) {
        this.f44704a.add(eVar);
    }

    public boolean b(@q0 com.bumptech.glide.request.e eVar) {
        boolean z4 = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.f44704a.remove(eVar);
        if (!this.f44705b.remove(eVar) && !remove) {
            z4 = false;
        }
        if (z4) {
            eVar.clear();
        }
        return z4;
    }

    public void c() {
        Iterator it = com.bumptech.glide.util.o.l(this.f44704a).iterator();
        while (it.hasNext()) {
            b((com.bumptech.glide.request.e) it.next());
        }
        this.f44705b.clear();
    }

    public boolean d() {
        return this.f44706c;
    }

    public void e() {
        this.f44706c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f44704a)) {
            if (eVar.isRunning() || eVar.isComplete()) {
                eVar.clear();
                this.f44705b.add(eVar);
            }
        }
    }

    public void f() {
        this.f44706c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f44704a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.f44705b.add(eVar);
            }
        }
    }

    public void g() {
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f44704a)) {
            if (!eVar.isComplete() && !eVar.e()) {
                eVar.clear();
                if (this.f44706c) {
                    this.f44705b.add(eVar);
                } else {
                    eVar.h();
                }
            }
        }
    }

    public void h() {
        this.f44706c = false;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f44704a)) {
            if (!eVar.isComplete() && !eVar.isRunning()) {
                eVar.h();
            }
        }
        this.f44705b.clear();
    }

    public void i(@o0 com.bumptech.glide.request.e eVar) {
        this.f44704a.add(eVar);
        if (!this.f44706c) {
            eVar.h();
            return;
        }
        eVar.clear();
        Log.isLoggable(ProtectedSandApp.s("ਸ"), 2);
        this.f44705b.add(eVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(ProtectedSandApp.s("ਹ"));
        sb.append(this.f44704a.size());
        sb.append(ProtectedSandApp.s("\u0a3a"));
        return androidx.appcompat.app.h.a(sb, this.f44706c, ProtectedSandApp.s("\u0a3b"));
    }
}
