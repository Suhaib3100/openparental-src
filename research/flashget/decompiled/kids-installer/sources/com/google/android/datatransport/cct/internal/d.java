package com.google.android.datatransport.cct.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import j2.a;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes3.dex */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final List<m> f12358a;

    d(List<m> list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("ῥ"));
        }
        this.f12358a = list;
    }

    @Override // com.google.android.datatransport.cct.internal.j
    @o0
    @a.InterfaceC0250a(name = "logRequest")
    public List<m> c() {
        return this.f12358a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f12358a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f12358a.hashCode() ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("ῦ") + this.f12358a + ProtectedSandApp.s("ῧ");
    }
}
