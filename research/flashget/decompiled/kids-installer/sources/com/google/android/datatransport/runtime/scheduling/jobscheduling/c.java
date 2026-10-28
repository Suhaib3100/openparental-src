package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes3.dex */
final class c extends g {

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12589e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<com.google.android.datatransport.e, g.b> f12590f;

    c(com.google.android.datatransport.runtime.time.a aVar, Map<com.google.android.datatransport.e, g.b> map) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ⁱ"));
        }
        this.f12589e = aVar;
        if (map == null) {
            throw new NullPointerException(ProtectedSandApp.s("⁰"));
        }
        this.f12590f = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    com.google.android.datatransport.runtime.time.a e() {
        return this.f12589e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12589e.equals(gVar.e()) && this.f12590f.equals(gVar.i());
    }

    public int hashCode() {
        return ((this.f12589e.hashCode() ^ 1000003) * 1000003) ^ this.f12590f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map<com.google.android.datatransport.e, g.b> i() {
        return this.f12590f;
    }

    public String toString() {
        return ProtectedSandApp.s("\u2072") + this.f12589e + ProtectedSandApp.s("\u2073") + this.f12590f + ProtectedSandApp.s("⁴");
    }
}
