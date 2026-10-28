package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.Arrays;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes3.dex */
final class g extends f0.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16103a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16104b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    static final class b extends f0.e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16105a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f16106b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.b.a
        public f0.e.b a() {
            String s5 = this.f16105a == null ? ProtectedSandApp.s("⥁") : "";
            if (this.f16106b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥂"));
            }
            if (s5.isEmpty()) {
                return new g(this.f16105a, this.f16106b);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⥃").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.b.a
        public f0.e.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥄"));
            }
            this.f16106b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.e.b.a
        public f0.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥅"));
            }
            this.f16105a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e.b
    @o0
    public byte[] b() {
        return this.f16104b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.e.b
    @o0
    public String c() {
        return this.f16103a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.b)) {
            return false;
        }
        f0.e.b bVar = (f0.e.b) obj;
        if (this.f16103a.equals(bVar.c())) {
            if (Arrays.equals(this.f16104b, bVar instanceof g ? ((g) bVar).f16104b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16103a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16104b);
    }

    public String toString() {
        return ProtectedSandApp.s("⥆") + this.f16103a + ProtectedSandApp.s("⥇") + Arrays.toString(this.f16104b) + ProtectedSandApp.s("⥈");
    }

    private g(String str, byte[] bArr) {
        this.f16103a = str;
        this.f16104b = bArr;
    }
}
