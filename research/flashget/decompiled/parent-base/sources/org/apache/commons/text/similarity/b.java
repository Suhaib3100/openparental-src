package org.apache.commons.text.similarity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: CosineSimilarity.java */
/* loaded from: classes3.dex */
public class b {
    private double b(Map<CharSequence, Integer> map, Map<CharSequence, Integer> map2, Set<CharSequence> set) {
        long j4 = 0;
        for (CharSequence charSequence : set) {
            j4 += map.get(charSequence).intValue() * map2.get(charSequence).intValue();
        }
        return j4;
    }

    private Set<CharSequence> c(Map<CharSequence, Integer> map, Map<CharSequence, Integer> map2) {
        HashSet hashSet = new HashSet(map.keySet());
        hashSet.retainAll(map2.keySet());
        return hashSet;
    }

    public Double a(Map<CharSequence, Integer> map, Map<CharSequence, Integer> map2) {
        if (map == null || map2 == null) {
            throw new IllegalArgumentException("Vectors must not be null");
        }
        double b5 = b(map, map2, c(map, map2));
        Iterator<Integer> it = map.values().iterator();
        double d5 = com.google.firebase.remoteconfig.p.f60679p;
        double d6 = 0.0d;
        while (it.hasNext()) {
            d6 += Math.pow(it.next().intValue(), 2.0d);
        }
        Iterator<Integer> it2 = map2.values().iterator();
        double d7 = 0.0d;
        while (it2.hasNext()) {
            d7 += Math.pow(it2.next().intValue(), 2.0d);
        }
        if (d6 > com.google.firebase.remoteconfig.p.f60679p && d7 > com.google.firebase.remoteconfig.p.f60679p) {
            d5 = b5 / (Math.sqrt(d7) * Math.sqrt(d6));
        }
        return Double.valueOf(d5);
    }
}
