package com.google.android.datatransport.runtime;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.c f12549a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12550b;

    public j(@o0 com.google.android.datatransport.c cVar, @o0 byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ऴ"));
        }
        if (bArr == null) {
            throw new NullPointerException(ProtectedSandApp.s("ळ"));
        }
        this.f12549a = cVar;
        this.f12550b = bArr;
    }

    public byte[] a() {
        return this.f12550b;
    }

    public com.google.android.datatransport.c b() {
        return this.f12549a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f12549a.equals(jVar.f12549a)) {
            return Arrays.equals(this.f12550b, jVar.f12550b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12549a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12550b);
    }

    public String toString() {
        return ProtectedSandApp.s("व") + this.f12549a + ProtectedSandApp.s("श");
    }
}
