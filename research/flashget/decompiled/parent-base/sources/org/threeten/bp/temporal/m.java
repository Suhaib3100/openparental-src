package org.threeten.bp.temporal;

/* compiled from: TemporalUnit.java */
/* loaded from: classes9.dex */
public interface m {
    <R extends e> R addTo(R r4, long j4);

    long between(e eVar, e eVar2);

    org.threeten.bp.e getDuration();

    boolean isDateBased();

    boolean isDurationEstimated();

    boolean isSupportedBy(e eVar);

    boolean isTimeBased();

    String toString();
}
