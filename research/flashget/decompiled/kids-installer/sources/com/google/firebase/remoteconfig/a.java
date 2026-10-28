package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate.java */
/* loaded from: classes3.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f17862a;

    a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException(ProtectedSandApp.s("⬤"));
        }
        this.f17862a = set;
    }

    @Override // com.google.firebase.remoteconfig.c
    @o0
    public Set<String> b() {
        return this.f17862a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return this.f17862a.equals(((c) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f17862a.hashCode() ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("⬥") + this.f17862a + ProtectedSandApp.s("⬦");
    }
}
