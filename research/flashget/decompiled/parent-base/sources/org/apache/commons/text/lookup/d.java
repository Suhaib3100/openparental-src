package org.apache.commons.text.lookup;

/* compiled from: BiStringLookup.java */
@FunctionalInterface
/* loaded from: classes3.dex */
public interface d<U> extends t {
    default String a(String str, U u4) {
        return lookup(str);
    }
}
