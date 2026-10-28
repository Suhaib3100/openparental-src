package org.threeten.bp.temporal;

/* compiled from: TemporalAccessor.java */
/* loaded from: classes9.dex */
public interface f {
    int get(j jVar);

    long getLong(j jVar);

    boolean isSupported(j jVar);

    <R> R query(l<R> lVar);

    n range(j jVar);
}
