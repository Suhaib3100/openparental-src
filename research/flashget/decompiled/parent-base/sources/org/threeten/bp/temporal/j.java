package org.threeten.bp.temporal;

import java.util.Locale;
import java.util.Map;

/* compiled from: TemporalField.java */
/* loaded from: classes9.dex */
public interface j {
    <R extends e> R adjustInto(R r4, long j4);

    m getBaseUnit();

    String getDisplayName(Locale locale);

    long getFrom(f fVar);

    m getRangeUnit();

    boolean isDateBased();

    boolean isSupportedBy(f fVar);

    boolean isTimeBased();

    n range();

    n rangeRefinedBy(f fVar);

    f resolve(Map<j, Long> map, f fVar, org.threeten.bp.format.j jVar);
}
