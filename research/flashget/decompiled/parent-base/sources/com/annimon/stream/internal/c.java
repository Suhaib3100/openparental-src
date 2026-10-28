package com.annimon.stream.internal;

import com.annimon.stream.function.i0;
import com.annimon.stream.internal.e;
import com.annimon.stream.iterator.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Operators.java */
/* loaded from: classes3.dex */
public final class c {
    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T, R> R[] a(Iterator<? extends T> it, i0<R[]> i0Var) {
        List d5 = d(it);
        int size = d5.size();
        a.a(size);
        Object[] array = d5.toArray(a.b(size, new Object[0]));
        R[] c5 = i0Var.c(size);
        System.arraycopy(array, 0, c5, 0, size);
        return c5;
    }

    public static double[] b(g.a aVar) {
        e.a aVar2 = new e.a();
        while (aVar.hasNext()) {
            aVar2.c(aVar.b());
        }
        return aVar2.i();
    }

    public static int[] c(g.b bVar) {
        e.b bVar2 = new e.b();
        while (bVar.hasNext()) {
            bVar2.f(bVar.b());
        }
        return bVar2.i();
    }

    public static <T> List<T> d(Iterator<? extends T> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static long[] e(g.c cVar) {
        e.c cVar2 = new e.c();
        while (cVar.hasNext()) {
            cVar2.h(cVar.b());
        }
        return cVar2.i();
    }
}
