package org.apache.log4j.helpers;

import java.util.Hashtable;

/* loaded from: classes5.dex */
public final class ThreadLocalMap extends InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Hashtable hashtable = (Hashtable) obj;
        if (hashtable != null) {
            return hashtable.clone();
        }
        return null;
    }
}
