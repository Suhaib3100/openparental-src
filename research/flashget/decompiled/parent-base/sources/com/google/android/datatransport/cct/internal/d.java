package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import t9.a;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes5.dex */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f51877a;

    d(List<u> list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("씡"));
        }
        this.f51877a = list;
    }

    @Override // com.google.android.datatransport.cct.internal.n
    @a.InterfaceC1396a(name = "logRequest")
    @o0
    public List<u> c() {
        return this.f51877a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f51877a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f51877a.hashCode() ^ 1000003;
    }

    public String toString() {
        return androidx.privacysandbox.ads.adservices.measurement.d.a(new StringBuilder(ProtectedSandApp.s("씢")), this.f51877a, ProtectedSandApp.s("씣"));
    }
}
