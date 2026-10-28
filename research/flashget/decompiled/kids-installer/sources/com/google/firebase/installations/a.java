package com.google.firebase.installations;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.installations.o;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes3.dex */
final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    private final String f16675a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16676b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16677c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16678a;

        /* renamed from: b, reason: collision with root package name */
        private Long f16679b;

        /* renamed from: c, reason: collision with root package name */
        private Long f16680c;

        @Override // com.google.firebase.installations.o.a
        public o a() {
            String s5 = this.f16678a == null ? ProtectedSandApp.s("⪖") : "";
            if (this.f16679b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⪗"));
            }
            if (this.f16680c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⪘"));
            }
            if (s5.isEmpty()) {
                return new a(this.f16678a, this.f16679b.longValue(), this.f16680c.longValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⪙").concat(s5));
        }

        @Override // com.google.firebase.installations.o.a
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⪚"));
            }
            this.f16678a = str;
            return this;
        }

        @Override // com.google.firebase.installations.o.a
        public o.a c(long j5) {
            this.f16680c = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.installations.o.a
        public o.a d(long j5) {
            this.f16679b = Long.valueOf(j5);
            return this;
        }

        b() {
        }

        private b(o oVar) {
            this.f16678a = oVar.b();
            this.f16679b = Long.valueOf(oVar.d());
            this.f16680c = Long.valueOf(oVar.c());
        }
    }

    @Override // com.google.firebase.installations.o
    @o0
    public String b() {
        return this.f16675a;
    }

    @Override // com.google.firebase.installations.o
    @o0
    public long c() {
        return this.f16677c;
    }

    @Override // com.google.firebase.installations.o
    @o0
    public long d() {
        return this.f16676b;
    }

    @Override // com.google.firebase.installations.o
    public o.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16675a.equals(oVar.b()) && this.f16676b == oVar.d() && this.f16677c == oVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f16675a.hashCode() ^ 1000003) * 1000003;
        long j5 = this.f16676b;
        long j6 = this.f16677c;
        return ((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("⪛") + this.f16675a + ProtectedSandApp.s("⪜") + this.f16676b + ProtectedSandApp.s("⪝") + this.f16677c + ProtectedSandApp.s("⪞");
    }

    private a(String str, long j5, long j6) {
        this.f16675a = str;
        this.f16676b = j5;
        this.f16677c = j6;
    }
}
