package com.googlecode.mp4parser.authoring;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.k;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Movie.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    k f63399a;

    /* renamed from: b, reason: collision with root package name */
    List<h> f63400b;

    public d() {
        this.f63399a = k.f64099j;
        this.f63400b = new LinkedList();
    }

    public static long b(long j4, long j5) {
        return j5 == 0 ? j4 : b(j5, j4 % j5);
    }

    public void a(h hVar) {
        if (f(hVar.u2().l()) != null) {
            hVar.u2().w(d());
        }
        this.f63400b.add(hVar);
    }

    public k c() {
        return this.f63399a;
    }

    public long d() {
        long j4 = 0;
        for (h hVar : this.f63400b) {
            if (j4 < hVar.u2().l()) {
                j4 = hVar.u2().l();
            }
        }
        return j4 + 1;
    }

    public long e() {
        long k4 = g().iterator().next().u2().k();
        Iterator<h> it = g().iterator();
        while (it.hasNext()) {
            k4 = b(it.next().u2().k(), k4);
        }
        return k4;
    }

    public h f(long j4) {
        for (h hVar : this.f63400b) {
            if (hVar.u2().l() == j4) {
                return hVar;
            }
        }
        return null;
    }

    public List<h> g() {
        return this.f63400b;
    }

    public void h(k kVar) {
        this.f63399a = kVar;
    }

    public void i(List<h> list) {
        this.f63400b = list;
    }

    public String toString() {
        String s4 = ProtectedSandApp.s("\u0ccf\u0001");
        for (h hVar : this.f63400b) {
            s4 = String.valueOf(s4) + ProtectedSandApp.s("\u0cd1\u0001") + hVar.u2().l() + ProtectedSandApp.s("\u0cd2\u0001") + hVar.getHandler() + ProtectedSandApp.s("\u0cd3\u0001");
        }
        return String.valueOf(s4).concat(ProtectedSandApp.s("\u0cd0\u0001"));
    }

    public d(List<h> list) {
        this.f63399a = k.f64099j;
        new LinkedList();
        this.f63400b = list;
    }
}
