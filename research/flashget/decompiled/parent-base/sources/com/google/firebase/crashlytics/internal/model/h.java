package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.Arrays;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* loaded from: classes6.dex */
final class h extends g0.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f59222a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f59223b;

    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    static final class b extends g0.e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59224a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f59225b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.e.b.a
        public g0.e.b a() {
            byte[] bArr;
            String str = this.f59224a;
            if (str != null && (bArr = this.f59225b) != null) {
                return new h(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59224a == null) {
                sb.append(ProtectedSandApp.s("︻"));
            }
            if (this.f59225b == null) {
                sb.append(ProtectedSandApp.s("︼"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("︽"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.e.b.a
        public g0.e.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException(ProtectedSandApp.s("︾"));
            }
            this.f59225b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.e.b.a
        public g0.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("︿"));
            }
            this.f59224a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.e.b
    @o0
    public byte[] b() {
        return this.f59223b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.e.b
    @o0
    public String c() {
        return this.f59222a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.e.b)) {
            return false;
        }
        g0.e.b bVar = (g0.e.b) obj;
        if (this.f59222a.equals(bVar.c())) {
            if (Arrays.equals(this.f59223b, bVar instanceof h ? ((h) bVar).f59223b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f59222a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f59223b);
    }

    public String toString() {
        return ProtectedSandApp.s("﹀") + this.f59222a + ProtectedSandApp.s("﹁") + Arrays.toString(this.f59223b) + ProtectedSandApp.s("﹂");
    }

    private h(String str, byte[] bArr) {
        this.f59222a = str;
        this.f59223b = bArr;
    }
}
