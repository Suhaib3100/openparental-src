package com.google.android.datatransport;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.g;
import java.util.Arrays;

/* compiled from: AutoValue_EventContext.java */
/* loaded from: classes5.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final String f51751a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f51752b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f51753c;

    /* compiled from: AutoValue_EventContext.java */
    /* renamed from: com.google.android.datatransport.b$b, reason: collision with other inner class name */
    static final class C0784b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        private String f51754a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f51755b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f51756c;

        C0784b() {
        }

        @Override // com.google.android.datatransport.g.a
        public g a() {
            return new b(this.f51754a, this.f51755b, this.f51756c);
        }

        @Override // com.google.android.datatransport.g.a
        public g.a b(byte[] bArr) {
            this.f51755b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.g.a
        public g.a c(byte[] bArr) {
            this.f51756c = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.g.a
        public g.a d(String str) {
            this.f51754a = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.g
    @q0
    public byte[] b() {
        return this.f51752b;
    }

    @Override // com.google.android.datatransport.g
    @q0
    public byte[] c() {
        return this.f51753c;
    }

    @Override // com.google.android.datatransport.g
    @q0
    public String d() {
        return this.f51751a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.f51751a;
        if (str != null ? str.equals(gVar.d()) : gVar.d() == null) {
            boolean z4 = gVar instanceof b;
            if (Arrays.equals(this.f51752b, z4 ? ((b) gVar).f51752b : gVar.b())) {
                if (Arrays.equals(this.f51753c, z4 ? ((b) gVar).f51753c : gVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f51751a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f51752b)) * 1000003) ^ Arrays.hashCode(this.f51753c);
    }

    public String toString() {
        return ProtectedSandApp.s("쒫") + this.f51751a + ProtectedSandApp.s("쒬") + Arrays.toString(this.f51752b) + ProtectedSandApp.s("쒭") + Arrays.toString(this.f51753c) + ProtectedSandApp.s("쒮");
    }

    private b(@q0 String str, @q0 byte[] bArr, @q0 byte[] bArr2) {
        this.f51751a = str;
        this.f51752b = bArr;
        this.f51753c = bArr2;
    }
}
