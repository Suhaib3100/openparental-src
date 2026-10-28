package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    @m1
    static final String f15046d = ProtectedSandApp.s("ዠ");

    /* renamed from: e, reason: collision with root package name */
    @m1
    static final String f15047e = ProtectedSandApp.s("ዡ");

    /* renamed from: a, reason: collision with root package name */
    private final o2.b<com.google.firebase.analytics.connector.a> f15048a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15049b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private Integer f15050c = null;

    /* compiled from: FirebaseABTesting.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* renamed from: r, reason: collision with root package name */
        public static final String f15051r = ProtectedSandApp.s("ዛ");

        /* renamed from: s, reason: collision with root package name */
        public static final String f15052s = ProtectedSandApp.s("ዜ");
    }

    public c(Context context, o2.b<com.google.firebase.analytics.connector.a> bVar, String str) {
        this.f15048a = bVar;
        this.f15049b = str;
    }

    private void a(a.c cVar) {
        this.f15048a.get().b(cVar);
    }

    private void b(List<com.google.firebase.abt.a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i5 = i();
        for (com.google.firebase.abt.a aVar : list) {
            while (arrayDeque.size() >= i5) {
                k(((a.c) arrayDeque.pollFirst()).f15286b);
            }
            a.c i6 = aVar.i(this.f15049b);
            a(i6);
            arrayDeque.offer(i6);
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
        String c6 = aVar.c();
        String h5 = aVar.h();
        for (com.google.firebase.abt.a aVar2 : list) {
            if (aVar2.c().equals(c6) && aVar2.h().equals(h5)) {
                return true;
            }
        }
        return false;
    }

    @n1
    private List<a.c> f() {
        return this.f15048a.get().e(this.f15049b, "");
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
                arrayList.add(aVar.i(this.f15049b));
            }
        }
        return arrayList;
    }

    @n1
    private int i() {
        if (this.f15050c == null) {
            this.f15050c = Integer.valueOf(this.f15048a.get().d(this.f15049b));
        }
        return this.f15050c.intValue();
    }

    private void k(String str) {
        this.f15048a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f15286b);
        }
    }

    private void n(List<com.google.firebase.abt.a> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<com.google.firebase.abt.a> e6 = e();
        l(h(e6, list));
        b(g(list, e6));
    }

    private void p() throws AbtException {
        if (this.f15048a.get() == null) {
            throw new AbtException(ProtectedSandApp.s("ዝ"));
        }
    }

    @n1
    public List<com.google.firebase.abt.a> e() throws AbtException {
        p();
        List<a.c> f6 = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = f6.iterator();
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
            throw new IllegalArgumentException(ProtectedSandApp.s("ዞ"));
        }
        n(c(list));
    }

    @n1
    public void o(com.google.firebase.abt.a aVar) throws AbtException {
        p();
        com.google.firebase.abt.a.k(aVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> j5 = aVar.j();
        j5.remove(ProtectedSandApp.s("ዟ"));
        arrayList.add(com.google.firebase.abt.a.b(j5));
        b(arrayList);
    }

    @n1
    public void q(List<com.google.firebase.abt.a> list) throws AbtException {
        p();
        l(h(e(), list));
    }
}
