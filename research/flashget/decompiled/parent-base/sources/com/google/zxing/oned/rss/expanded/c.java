package com.google.zxing.oned.rss.expanded;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandedRow.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<b> f63086a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63087b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63088c;

    c(List<b> list, int i4, boolean z4) {
        this.f63086a = new ArrayList(list);
        this.f63087b = i4;
        this.f63088c = z4;
    }

    List<b> a() {
        return this.f63086a;
    }

    int b() {
        return this.f63087b;
    }

    boolean c(List<b> list) {
        return this.f63086a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f63086a.equals(cVar.f63086a) && this.f63088c == cVar.f63088c;
    }

    public int hashCode() {
        return this.f63086a.hashCode() ^ Boolean.valueOf(this.f63088c).hashCode();
    }

    public String toString() {
        return androidx.privacysandbox.ads.adservices.measurement.d.a(new StringBuilder(ProtectedSandApp.s("୯\u0001")), this.f63086a, ProtectedSandApp.s("୰\u0001"));
    }
}
