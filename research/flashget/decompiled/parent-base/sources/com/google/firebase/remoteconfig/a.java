package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate.java */
/* loaded from: classes6.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f60380a;

    a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException(ProtectedSandApp.s("̶\u0001"));
        }
        this.f60380a = set;
    }

    @Override // com.google.firebase.remoteconfig.c
    @o0
    public Set<String> b() {
        return this.f60380a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f60380a.equals(((c) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f60380a.hashCode() ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("̷\u0001") + this.f60380a + ProtectedSandApp.s("̸\u0001");
    }
}
