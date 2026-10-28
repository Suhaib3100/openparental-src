package org.ocpsoft.prettytime.units;

import java.io.Serializable;
import java.util.Comparator;
import org.ocpsoft.prettytime.TimeUnit;

/* compiled from: TimeUnitComparator.java */
/* loaded from: classes9.dex */
public class a implements Comparator<TimeUnit>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final long f87931b = 1;

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(TimeUnit timeUnit, TimeUnit timeUnit2) {
        if (timeUnit.b() < timeUnit2.b()) {
            return -1;
        }
        return timeUnit.b() > timeUnit2.b() ? 1 : 0;
    }
}
