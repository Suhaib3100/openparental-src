package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;

/* compiled from: AutoValue_RolloutsState.java */
/* loaded from: classes3.dex */
final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<d> f18105a;

    c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException(ProtectedSandApp.s("⭄"));
        }
        this.f18105a = set;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.e
    @o0
    public Set<d> b() {
        return this.f18105a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f18105a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f18105a.hashCode() ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("⭅") + this.f18105a + ProtectedSandApp.s("⭆");
    }
}
