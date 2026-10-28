package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.l;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes3.dex */
final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    private final long f12363a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f12364b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12365c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f12366d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12367e;

    /* renamed from: f, reason: collision with root package name */
    private final long f12368f;

    /* renamed from: g, reason: collision with root package name */
    private final o f12369g;

    /* compiled from: AutoValue_LogEvent.java */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f12370a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f12371b;

        /* renamed from: c, reason: collision with root package name */
        private Long f12372c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f12373d;

        /* renamed from: e, reason: collision with root package name */
        private String f12374e;

        /* renamed from: f, reason: collision with root package name */
        private Long f12375f;

        /* renamed from: g, reason: collision with root package name */
        private o f12376g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l a() {
            String s5 = this.f12370a == null ? ProtectedSandApp.s("Ύ") : "";
            if (this.f12372c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("Ῥ"));
            }
            if (this.f12375f == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("῭"));
            }
            if (s5.isEmpty()) {
                return new f(this.f12370a.longValue(), this.f12371b, this.f12372c.longValue(), this.f12373d, this.f12374e, this.f12375f.longValue(), this.f12376g);
            }
            throw new IllegalStateException(ProtectedSandApp.s("΅").concat(s5));
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a b(@q0 Integer num) {
            this.f12371b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a c(long j5) {
            this.f12370a = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a d(long j5) {
            this.f12372c = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a e(@q0 o oVar) {
            this.f12376g = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        l.a f(@q0 byte[] bArr) {
            this.f12373d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        l.a g(@q0 String str) {
            this.f12374e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public l.a h(long j5) {
            this.f12375f = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @q0
    public Integer b() {
        return this.f12364b;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public long c() {
        return this.f12363a;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public long d() {
        return this.f12365c;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @q0
    public o e() {
        return this.f12369g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f12363a == lVar.c() && ((num = this.f12364b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f12365c == lVar.d()) {
            if (Arrays.equals(this.f12366d, lVar instanceof f ? ((f) lVar).f12366d : lVar.f()) && ((str = this.f12367e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f12368f == lVar.h()) {
                o oVar = this.f12369g;
                if (oVar == null) {
                    if (lVar.e() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @q0
    public byte[] f() {
        return this.f12366d;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @q0
    public String g() {
        return this.f12367e;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public long h() {
        return this.f12368f;
    }

    public int hashCode() {
        long j5 = this.f12363a;
        int i5 = (((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f12364b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j6 = this.f12365c;
        int hashCode2 = (((((i5 ^ hashCode) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f12366d)) * 1000003;
        String str = this.f12367e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j7 = this.f12368f;
        int i6 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        o oVar = this.f12369g;
        return i6 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("`") + this.f12363a + ProtectedSandApp.s("\u1ff0") + this.f12364b + ProtectedSandApp.s("\u1ff1") + this.f12365c + ProtectedSandApp.s("ῲ") + Arrays.toString(this.f12366d) + ProtectedSandApp.s("ῳ") + this.f12367e + ProtectedSandApp.s("ῴ") + this.f12368f + ProtectedSandApp.s("\u1ff5") + this.f12369g + ProtectedSandApp.s("ῶ");
    }

    private f(long j5, @q0 Integer num, long j6, @q0 byte[] bArr, @q0 String str, long j7, @q0 o oVar) {
        this.f12363a = j5;
        this.f12364b = num;
        this.f12365c = j6;
        this.f12366d = bArr;
        this.f12367e = str;
        this.f12368f = j7;
        this.f12369g = oVar;
    }
}
