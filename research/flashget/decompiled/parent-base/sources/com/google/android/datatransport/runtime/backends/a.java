package com.google.android.datatransport.runtime.backends;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.backends.g;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes5.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable<com.google.android.datatransport.runtime.k> f51960a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f51961b;

    /* compiled from: AutoValue_BackendRequest.java */
    static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable<com.google.android.datatransport.runtime.k> f51962a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f51963b;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g a() {
            String s4 = this.f51962a == null ? ProtectedSandApp.s("얛") : "";
            if (s4.isEmpty()) {
                return new a(this.f51962a, this.f51963b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("얜").concat(s4));
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a b(Iterable<com.google.android.datatransport.runtime.k> iterable) {
            if (iterable == null) {
                throw new NullPointerException(ProtectedSandApp.s("얝"));
            }
            this.f51962a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public g.a c(@q0 byte[] bArr) {
            this.f51963b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public Iterable<com.google.android.datatransport.runtime.k> c() {
        return this.f51960a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    @q0
    public byte[] d() {
        return this.f51961b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f51960a.equals(gVar.c())) {
            if (Arrays.equals(this.f51961b, gVar instanceof a ? ((a) gVar).f51961b : gVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f51960a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51961b);
    }

    public String toString() {
        return ProtectedSandApp.s("얞") + this.f51960a + ProtectedSandApp.s("얟") + Arrays.toString(this.f51961b) + ProtectedSandApp.s("얠");
    }

    private a(Iterable<com.google.android.datatransport.runtime.k> iterable, @q0 byte[] bArr) {
        this.f51960a = iterable;
        this.f51961b = bArr;
    }
}
