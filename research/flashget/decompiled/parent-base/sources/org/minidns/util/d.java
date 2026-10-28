package org.minidns.util;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* compiled from: CollectionsUtil.java */
/* loaded from: classes9.dex */
public class d {
    public static <T> T a(Set<T> set, Random random) {
        int nextInt = random.nextInt(set.size());
        Iterator<T> it = set.iterator();
        for (int i4 = 0; i4 < nextInt && it.hasNext(); i4++) {
            it.next();
        }
        return it.next();
    }
}
