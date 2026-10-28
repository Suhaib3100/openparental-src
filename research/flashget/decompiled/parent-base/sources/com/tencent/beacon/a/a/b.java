package com.tencent.beacon.a.a;

import android.util.SparseArray;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BeaconBus.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f71014a;

    /* renamed from: c, reason: collision with root package name */
    private final Object f71016c = new Object();

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f71019f = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<List<d>> f71015b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<List<c>> f71017d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<Object> f71018e = new SparseArray<>();

    private b() {
    }

    public static b a() {
        if (f71014a == null) {
            synchronized (b.class) {
                try {
                    if (f71014a == null) {
                        f71014a = new b();
                    }
                } finally {
                }
            }
        }
        return f71014a;
    }

    private void c(c cVar) {
        d(cVar);
        synchronized (b(cVar.f71020a)) {
            try {
                List<d> c5 = c(cVar.f71020a);
                if (c5 == null) {
                    return;
                }
                Iterator<d> it = c5.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(cVar);
                    } catch (Throwable th) {
                        com.tencent.beacon.base.util.c.a(th);
                        if (this.f71019f.compareAndSet(false, true)) {
                            j.e().a(ProtectedSandApp.s("\u2fe6\u0001"), ProtectedSandApp.s("\u2fe7\u0001"), th);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d(c cVar) {
    }

    public void b(@o0 c cVar) {
        synchronized (b(cVar.f71020a)) {
            try {
                c cVar2 = new c(cVar.f71020a, cVar.f71021b);
                List<c> list = this.f71017d.get(cVar2.f71020a);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f71017d.put(cVar2.f71020a, list);
                }
                list.add(cVar2);
                c(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i4, d dVar) {
        synchronized (b(i4)) {
            try {
                List<d> list = this.f71015b.get(i4);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f71015b.put(i4, list);
                }
                if (list.contains(dVar)) {
                    return;
                }
                list.add(dVar);
                List<c> list2 = this.f71017d.get(i4);
                if (list2 != null) {
                    Iterator<c> it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            dVar.a(it.next());
                        } catch (Throwable th) {
                            com.tencent.beacon.base.util.c.a(th);
                        }
                    }
                    if (i4 == 6 || i4 == 12) {
                        a(i4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Object b(int i4) {
        Object obj;
        synchronized (this.f71016c) {
            try {
                obj = this.f71018e.get(i4);
                if (obj == null) {
                    obj = new Object();
                    this.f71018e.put(i4, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    private List<d> c(int i4) {
        List<d> list = this.f71015b.get(i4);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public void a(@o0 c cVar) {
        com.tencent.beacon.a.b.b.a().a(new a(this, cVar));
    }

    public void a(int i4) {
        synchronized (b(i4)) {
            this.f71017d.remove(i4);
        }
    }
}
