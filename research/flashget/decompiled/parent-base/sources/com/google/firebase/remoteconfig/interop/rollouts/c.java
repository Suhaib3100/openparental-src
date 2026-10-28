package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;

/* compiled from: AutoValue_RolloutsState.java */
/* loaded from: classes6.dex */
final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<d> f60651a;

    c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException(ProtectedSandApp.s("ϫ\u0001"));
        }
        this.f60651a = set;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.e
    @o0
    public Set<d> b() {
        return this.f60651a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f60651a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f60651a.hashCode() ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("Ϭ\u0001") + this.f60651a + ProtectedSandApp.s("ϭ\u0001");
    }
}
