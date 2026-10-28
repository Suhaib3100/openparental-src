package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes5.dex */
final class c extends g {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52119e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<com.google.android.datatransport.h, g.b> f52120f;

    c(com.google.android.datatransport.runtime.time.a aVar, Map<com.google.android.datatransport.h, g.b> map) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("옕"));
        }
        this.f52119e = aVar;
        if (map == null) {
            throw new NullPointerException(ProtectedSandApp.s("옔"));
        }
        this.f52120f = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    com.google.android.datatransport.runtime.time.a e() {
        return this.f52119e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f52119e.equals(gVar.e()) && this.f52120f.equals(gVar.i());
    }

    public int hashCode() {
        return ((this.f52119e.hashCode() ^ 1000003) * 1000003) ^ this.f52120f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map<com.google.android.datatransport.h, g.b> i() {
        return this.f52120f;
    }

    public String toString() {
        return ProtectedSandApp.s("옖") + this.f52119e + ProtectedSandApp.s("옗") + this.f52120f + ProtectedSandApp.s("옘");
    }
}
