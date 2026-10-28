package com.google.android.gms.common.data;

import androidx.annotation.o0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class FreezableUtils {
    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@o0 ArrayList<E> arrayList) {
        h4.a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            aVar.add(arrayList.get(i5).freeze());
        }
        return aVar;
    }

    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@o0 Iterable<E> iterable) {
        h4.a aVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.add(it.next().freeze());
        }
        return aVar;
    }

    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@o0 E[] eArr) {
        h4.a aVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e6 : eArr) {
            aVar.add(e6.freeze());
        }
        return aVar;
    }
}
