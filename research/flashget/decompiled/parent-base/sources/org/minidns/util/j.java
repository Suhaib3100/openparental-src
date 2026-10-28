package org.minidns.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import org.minidns.record.w;

/* compiled from: SrvUtil.java */
/* loaded from: classes9.dex */
public class j {
    private static int a(int[] iArr, double d5) {
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length && d5 >= iArr[i5]; i5++) {
            i4++;
        }
        return i4;
    }

    public static List<w> b(Collection<w> collection) {
        int i4;
        int i5;
        if (collection.size() == 1 && collection.iterator().next().f87513g.equals(org.minidns.dnsname.a.f87222q)) {
            return Collections.emptyList();
        }
        TreeMap treeMap = new TreeMap();
        for (w wVar : collection) {
            Integer valueOf = Integer.valueOf(wVar.f87510d);
            List list = (List) treeMap.get(valueOf);
            if (list == null) {
                list = new LinkedList();
                treeMap.put(valueOf, list);
            }
            list.add(wVar);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List list2 : treeMap.values()) {
            while (true) {
                int size = list2.size();
                if (size > 0) {
                    int[] iArr = new int[size];
                    Iterator it = list2.iterator();
                    while (true) {
                        i4 = 0;
                        if (!it.hasNext()) {
                            i5 = 1;
                            break;
                        }
                        if (((w) it.next()).f87511e > 0) {
                            i5 = 0;
                            break;
                        }
                    }
                    Iterator it2 = list2.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        i4 += ((w) it2.next()).f87511e + i5;
                        iArr[i6] = i4;
                        i6++;
                    }
                    arrayList.add((w) list2.remove(i4 == 0 ? (int) (Math.random() * size) : a(iArr, Math.random() * i4)));
                }
            }
        }
        return arrayList;
    }
}
