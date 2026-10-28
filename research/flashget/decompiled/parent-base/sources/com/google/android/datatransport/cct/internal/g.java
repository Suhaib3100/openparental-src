package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.q;
import java.util.Arrays;

/* compiled from: AutoValue_ExperimentIds.java */
/* loaded from: classes5.dex */
final class g extends q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51886a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f51887b;

    /* compiled from: AutoValue_ExperimentIds.java */
    static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f51888a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f51889b;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q a() {
            return new g(this.f51888a, this.f51889b);
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q.a b(@q0 byte[] bArr) {
            this.f51888a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q.a c(@q0 byte[] bArr) {
            this.f51889b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.q
    @q0
    public byte[] b() {
        return this.f51886a;
    }

    @Override // com.google.android.datatransport.cct.internal.q
    @q0
    public byte[] c() {
        return this.f51887b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z4 = qVar instanceof g;
        if (Arrays.equals(this.f51886a, z4 ? ((g) qVar).f51886a : qVar.b())) {
            if (Arrays.equals(this.f51887b, z4 ? ((g) qVar).f51887b : qVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f51886a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51887b);
    }

    public String toString() {
        return ProtectedSandApp.s("씪") + Arrays.toString(this.f51886a) + ProtectedSandApp.s("씫") + Arrays.toString(this.f51887b) + ProtectedSandApp.s("씬");
    }

    private g(@q0 byte[] bArr, @q0 byte[] bArr2) {
        this.f51886a = bArr;
        this.f51887b = bArr2;
    }
}
