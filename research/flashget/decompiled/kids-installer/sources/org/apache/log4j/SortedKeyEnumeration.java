package org.apache.log4j;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PropertyConfigurator.java */
/* loaded from: classes5.dex */
class SortedKeyEnumeration implements Enumeration {

    /* renamed from: e, reason: collision with root package name */
    private Enumeration f32117e;

    public SortedKeyEnumeration(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector(hashtable.size());
        int i5 = 0;
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            int i6 = 0;
            while (i6 < i5 && str.compareTo((String) vector.get(i6)) > 0) {
                i6++;
            }
            vector.add(i6, str);
            i5++;
        }
        this.f32117e = vector.elements();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f32117e.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return this.f32117e.nextElement();
    }
}
