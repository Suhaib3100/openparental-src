package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.q0;
import com.bumptech.glide.load.engine.bitmap_recycle.m;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes3.dex */
class h<K extends m, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f43869a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f43870b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    private static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f43871a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f43872b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f43873c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f43874d;

        a() {
            this(null);
        }

        public void a(V v4) {
            if (this.f43872b == null) {
                this.f43872b = new ArrayList();
            }
            this.f43872b.add(v4);
        }

        @q0
        public V b() {
            int c5 = c();
            if (c5 > 0) {
                return this.f43872b.remove(c5 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f43872b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k4) {
            this.f43874d = this;
            this.f43873c = this;
            this.f43871a = k4;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f43869a;
        aVar.f43874d = aVar2;
        aVar.f43873c = aVar2.f43873c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f43869a;
        aVar.f43874d = aVar2.f43874d;
        aVar.f43873c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f43874d;
        aVar2.f43873c = aVar.f43873c;
        aVar.f43873c.f43874d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f43873c.f43874d = aVar;
        aVar.f43874d.f43873c = aVar;
    }

    @q0
    public V a(K k4) {
        a<K, V> aVar = this.f43870b.get(k4);
        if (aVar == null) {
            aVar = new a<>(k4);
            this.f43870b.put(k4, aVar);
        } else {
            k4.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k4, V v4) {
        a<K, V> aVar = this.f43870b.get(k4);
        if (aVar == null) {
            aVar = new a<>(k4);
            c(aVar);
            this.f43870b.put(k4, aVar);
        } else {
            k4.a();
        }
        aVar.a(v4);
    }

    @q0
    public V f() {
        for (a aVar = this.f43869a.f43874d; !aVar.equals(this.f43869a); aVar = aVar.f43874d) {
            V v4 = (V) aVar.b();
            if (v4 != null) {
                return v4;
            }
            e(aVar);
            this.f43870b.remove(aVar.f43871a);
            ((m) aVar.f43871a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("࢞"));
        a aVar = this.f43869a.f43873c;
        boolean z4 = false;
        while (!aVar.equals(this.f43869a)) {
            sb.append('{');
            sb.append(aVar.f43871a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append(ProtectedSandApp.s("࢟"));
            aVar = aVar.f43873c;
            z4 = true;
        }
        if (z4) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(ProtectedSandApp.s("ࢠ"));
        return sb.toString();
    }
}
