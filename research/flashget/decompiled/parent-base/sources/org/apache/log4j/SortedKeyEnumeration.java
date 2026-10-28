package org.apache.log4j;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PropertyConfigurator.java */
/* loaded from: classes3.dex */
class SortedKeyEnumeration implements Enumeration {

    /* renamed from: e, reason: collision with root package name */
    private Enumeration f86717e;

    public SortedKeyEnumeration(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector(hashtable.size());
        int i4 = 0;
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            int i5 = 0;
            while (i5 < i4 && str.compareTo((String) vector.get(i5)) > 0) {
                i5++;
            }
            vector.add(i5, str);
            i4++;
        }
        this.f86717e = vector.elements();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f86717e.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        return this.f86717e.nextElement();
    }
}
