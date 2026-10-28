package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.q0;
import com.bumptech.glide.load.engine.bitmap_recycle.m;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
class h<K extends m, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f11161a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f11162b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f11163a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f11164b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f11165c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f11166d;

        a() {
            this(null);
        }

        public void a(V v5) {
            if (this.f11164b == null) {
                this.f11164b = new ArrayList();
            }
            this.f11164b.add(v5);
        }

        @q0
        public V b() {
            int c6 = c();
            if (c6 > 0) {
                return this.f11164b.remove(c6 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f11164b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k5) {
            this.f11166d = this;
            this.f11165c = this;
            this.f11163a = k5;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f11161a;
        aVar.f11166d = aVar2;
        aVar.f11165c = aVar2.f11165c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f11161a;
        aVar.f11166d = aVar2.f11166d;
        aVar.f11165c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f11166d;
        aVar2.f11165c = aVar.f11165c;
        aVar.f11165c.f11166d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f11165c.f11166d = aVar;
        aVar.f11166d.f11165c = aVar;
    }

    @q0
    public V a(K k5) {
        a<K, V> aVar = this.f11162b.get(k5);
        if (aVar == null) {
            aVar = new a<>(k5);
            this.f11162b.put(k5, aVar);
        } else {
            k5.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k5, V v5) {
        a<K, V> aVar = this.f11162b.get(k5);
        if (aVar == null) {
            aVar = new a<>(k5);
            c(aVar);
            this.f11162b.put(k5, aVar);
        } else {
            k5.a();
        }
        aVar.a(v5);
    }

    @q0
    public V f() {
        for (a aVar = this.f11161a.f11166d; !aVar.equals(this.f11161a); aVar = aVar.f11166d) {
            V v5 = (V) aVar.b();
            if (v5 != null) {
                return v5;
            }
            e(aVar);
            this.f11162b.remove(aVar.f11163a);
            ((m) aVar.f11163a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ě"));
        a aVar = this.f11161a.f11165c;
        boolean z5 = false;
        while (!aVar.equals(this.f11161a)) {
            sb.append('{');
            sb.append(aVar.f11163a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append(ProtectedSandApp.s("Ĝ"));
            aVar = aVar.f11165c;
            z5 = true;
        }
        if (z5) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(ProtectedSandApp.s("ĝ"));
        return sb.toString();
    }
}
