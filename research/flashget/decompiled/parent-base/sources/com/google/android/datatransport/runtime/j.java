package com.google.android.datatransport.runtime;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.datatransport.e f52079a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f52080b;

    public j(@o0 com.google.android.datatransport.e eVar, @o0 byte[] bArr) {
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("엻"));
        }
        if (bArr == null) {
            throw new NullPointerException(ProtectedSandApp.s("엺"));
        }
        this.f52079a = eVar;
        this.f52080b = bArr;
    }

    public byte[] a() {
        return this.f52080b;
    }

    public com.google.android.datatransport.e b() {
        return this.f52079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f52079a.equals(jVar.f52079a)) {
            return Arrays.equals(this.f52080b, jVar.f52080b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f52079a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52080b);
    }

    public String toString() {
        return ProtectedSandApp.s("염") + this.f52079a + ProtectedSandApp.s("엽");
    }
}
