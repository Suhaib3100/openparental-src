package com.google.android.gms.common.data;

import androidx.annotation.o0;
import java.util.ArrayList;
import java.util.Iterator;
import net.minidev.json.a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class FreezableUtils {
    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@o0 ArrayList<E> arrayList) {
        a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            aVar.add(arrayList.get(i4).freeze());
        }
        return aVar;
    }

    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@o0 Iterable<E> iterable) {
        a aVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.add(it.next().freeze());
        }
        return aVar;
    }

    @o0
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@o0 E[] eArr) {
        a aVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e4 : eArr) {
            aVar.add(e4.freeze());
        }
        return aVar;
    }
}
