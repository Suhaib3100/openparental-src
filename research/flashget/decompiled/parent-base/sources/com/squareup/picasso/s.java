package com.squareup.picasso;

/* compiled from: MemoryPolicy.java */
/* loaded from: classes6.dex */
public enum s {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    s(int i4) {
        this.index = i4;
    }

    static boolean shouldReadFromMemoryCache(int i4) {
        return (i4 & NO_CACHE.index) == 0;
    }

    static boolean shouldWriteToMemoryCache(int i4) {
        return (i4 & NO_STORE.index) == 0;
    }
}
