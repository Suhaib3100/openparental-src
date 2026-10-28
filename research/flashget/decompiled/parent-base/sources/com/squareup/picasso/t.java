package com.squareup.picasso;

/* compiled from: NetworkPolicy.java */
/* loaded from: classes6.dex */
public enum t {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    t(int i4) {
        this.index = i4;
    }

    public static boolean isOfflineOnly(int i4) {
        return (i4 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i4) {
        return (i4 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i4) {
        return (i4 & NO_STORE.index) == 0;
    }
}
