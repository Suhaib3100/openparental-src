package com.google.android.datatransport.runtime.backends;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.backends.g;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes3.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<com.google.android.datatransport.runtime.k> f12420a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12421b;

    /* compiled from: AutoValue_BackendRequest.java */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<com.google.android.datatransport.runtime.k> f12422a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f12423b;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g a() {
            String s5 = this.f12422a == null ? ProtectedSandApp.s("―") : "";
            if (s5.isEmpty()) {
                return new a(this.f12422a, this.f12423b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("‖").concat(s5));
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a b(Iterable<com.google.android.datatransport.runtime.k> iterable) {
            if (iterable == null) {
                throw new NullPointerException(ProtectedSandApp.s("‗"));
            }
            this.f12422a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a c(@q0 byte[] bArr) {
            this.f12423b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public Iterable<com.google.android.datatransport.runtime.k> c() {
        return this.f12420a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    @q0
    public byte[] d() {
        return this.f12421b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f12420a.equals(gVar.c())) {
            if (Arrays.equals(this.f12421b, gVar instanceof a ? ((a) gVar).f12421b : gVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12420a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12421b);
    }

    public String toString() {
        return ProtectedSandApp.s("‘") + this.f12420a + ProtectedSandApp.s("’") + Arrays.toString(this.f12421b) + ProtectedSandApp.s("‚");
    }

    private a(Iterable<com.google.android.datatransport.runtime.k> iterable, @q0 byte[] bArr) {
        this.f12420a = iterable;
        this.f12421b = bArr;
    }
}
