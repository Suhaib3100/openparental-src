package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11932d = ProtectedSandApp.s("Ȁ");

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f11933a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.request.e> f11934b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f11935c;

    @m1
    void a(com.bumptech.glide.request.e eVar) {
        this.f11933a.add(eVar);
    }

    public boolean b(@q0 com.bumptech.glide.request.e eVar) {
        boolean z5 = true;
        if (eVar == null) {
            return true;
        }
        boolean remove = this.f11933a.remove(eVar);
        if (!this.f11934b.remove(eVar) && !remove) {
            z5 = false;
        }
        if (z5) {
            eVar.clear();
        }
        return z5;
    }

    public void c() {
        Iterator it = com.bumptech.glide.util.n.k(this.f11933a).iterator();
        while (it.hasNext()) {
            b((com.bumptech.glide.request.e) it.next());
        }
        this.f11934b.clear();
    }

    public boolean d() {
        return this.f11935c;
    }

    public void e() {
        this.f11935c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f11933a)) {
            if (eVar.isRunning() || eVar.i()) {
                eVar.clear();
                this.f11934b.add(eVar);
            }
        }
    }

    public void f() {
        this.f11935c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f11933a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.f11934b.add(eVar);
            }
        }
    }

    public void g() {
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f11933a)) {
            if (!eVar.i() && !eVar.f()) {
                eVar.clear();
                if (this.f11935c) {
                    this.f11934b.add(eVar);
                } else {
                    eVar.h();
                }
            }
        }
    }

    public void h() {
        this.f11935c = false;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.n.k(this.f11933a)) {
            if (!eVar.i() && !eVar.isRunning()) {
                eVar.h();
            }
        }
        this.f11934b.clear();
    }

    public void i(@o0 com.bumptech.glide.request.e eVar) {
        this.f11933a.add(eVar);
        if (!this.f11935c) {
            eVar.h();
            return;
        }
        eVar.clear();
        Log.isLoggable(ProtectedSandApp.s("Ǽ"), 2);
        this.f11934b.add(eVar);
    }

    public String toString() {
        return super.toString() + ProtectedSandApp.s("ǽ") + this.f11933a.size() + ProtectedSandApp.s("Ǿ") + this.f11935c + ProtectedSandApp.s("ǿ");
    }
}
