package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.analytics.connector.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    @m1
    static final String f58119d = ProtectedSandApp.s("望");

    /* renamed from: e, reason: collision with root package name */
    @m1
    static final String f58120e = ProtectedSandApp.s("杖");

    /* renamed from: a, reason: collision with root package name */
    private final y9.b<com.google.firebase.analytics.connector.a> f58121a;

    /* renamed from: b, reason: collision with root package name */
    private final String f58122b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private Integer f58123c = null;

    /* compiled from: FirebaseABTesting.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* renamed from: u2, reason: collision with root package name */
        public static final String f58125u2 = ProtectedSandApp.s("搜");

        /* renamed from: t2, reason: collision with root package name */
        public static final String f58124t2 = ProtectedSandApp.s("摒");
    }

    public c(Context context, y9.b<com.google.firebase.analytics.connector.a> bVar, String str) {
        this.f58121a = bVar;
        this.f58122b = str;
    }

    private void a(a.c cVar) {
        this.f58121a.get().a(cVar);
    }

    private void b(List<com.google.firebase.abt.a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i4 = i();
        for (com.google.firebase.abt.a aVar : list) {
            while (arrayDeque.size() >= i4) {
                k(((a.c) arrayDeque.pollFirst()).f58365b);
            }
            a.c i5 = aVar.i(this.f58122b);
            a(i5);
            arrayDeque.offer(i5);
        }
    }

    private static List<com.google.firebase.abt.a> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.abt.a.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<com.google.firebase.abt.a> list, com.google.firebase.abt.a aVar) {
        String c5 = aVar.c();
        String h4 = aVar.h();
        for (com.google.firebase.abt.a aVar2 : list) {
            if (aVar2.c().equals(c5) && aVar2.h().equals(h4)) {
                return true;
            }
        }
        return false;
    }

    @n1
    private List<a.c> f() {
        return this.f58121a.get().f(this.f58122b, "");
    }

    private ArrayList<com.google.firebase.abt.a> g(List<com.google.firebase.abt.a> list, List<com.google.firebase.abt.a> list2) {
        ArrayList<com.google.firebase.abt.a> arrayList = new ArrayList<>();
        for (com.google.firebase.abt.a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<com.google.firebase.abt.a> list, List<com.google.firebase.abt.a> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (com.google.firebase.abt.a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar.i(this.f58122b));
            }
        }
        return arrayList;
    }

    @n1
    private int i() {
        if (this.f58123c == null) {
            this.f58123c = Integer.valueOf(this.f58121a.get().e(this.f58122b));
        }
        return this.f58123c.intValue();
    }

    private void k(String str) {
        this.f58121a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f58365b);
        }
    }

    private void n(List<com.google.firebase.abt.a> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<com.google.firebase.abt.a> e4 = e();
        l(h(e4, list));
        b(g(list, e4));
    }

    private void p() throws AbtException {
        if (this.f58121a.get() == null) {
            throw new AbtException(ProtectedSandApp.s("敖"));
        }
    }

    @n1
    public List<com.google.firebase.abt.a> e() throws AbtException {
        p();
        List<a.c> f4 = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = f4.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.abt.a.a(it.next()));
        }
        return arrayList;
    }

    @n1
    public void j() throws AbtException {
        p();
        l(f());
    }

    @n1
    public void m(List<Map<String, String>> list) throws AbtException {
        p();
        if (list == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("晴"));
        }
        n(c(list));
    }

    @n1
    public void o(com.google.firebase.abt.a aVar) throws AbtException {
        p();
        com.google.firebase.abt.a.k(aVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> j4 = aVar.j();
        j4.remove(ProtectedSandApp.s("朗"));
        arrayList.add(com.google.firebase.abt.a.b(j4));
        b(arrayList);
    }

    @n1
    public void q(List<com.google.firebase.abt.a> list) throws AbtException {
        p();
        l(h(e(), list));
    }
}
