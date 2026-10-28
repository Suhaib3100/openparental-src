package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.t;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes5.dex */
final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f51894a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f51895b;

    /* renamed from: c, reason: collision with root package name */
    private final p f51896c;

    /* renamed from: d, reason: collision with root package name */
    private final long f51897d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f51898e;

    /* renamed from: f, reason: collision with root package name */
    private final String f51899f;

    /* renamed from: g, reason: collision with root package name */
    private final long f51900g;

    /* renamed from: h, reason: collision with root package name */
    private final w f51901h;

    /* renamed from: i, reason: collision with root package name */
    private final q f51902i;

    /* compiled from: AutoValue_LogEvent.java */
    static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f51903a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f51904b;

        /* renamed from: c, reason: collision with root package name */
        private p f51905c;

        /* renamed from: d, reason: collision with root package name */
        private Long f51906d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f51907e;

        /* renamed from: f, reason: collision with root package name */
        private String f51908f;

        /* renamed from: g, reason: collision with root package name */
        private Long f51909g;

        /* renamed from: h, reason: collision with root package name */
        private w f51910h;

        /* renamed from: i, reason: collision with root package name */
        private q f51911i;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t a() {
            String s4 = this.f51903a == null ? ProtectedSandApp.s("씱") : "";
            if (this.f51906d == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("씲"));
            }
            if (this.f51909g == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("씳"));
            }
            if (s4.isEmpty()) {
                return new j(this.f51903a.longValue(), this.f51904b, this.f51905c, this.f51906d.longValue(), this.f51907e, this.f51908f, this.f51909g.longValue(), this.f51910h, this.f51911i);
            }
            throw new IllegalStateException(ProtectedSandApp.s("씴").concat(s4));
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a b(@q0 p pVar) {
            this.f51905c = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a c(@q0 Integer num) {
            this.f51904b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a d(long j4) {
            this.f51903a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a e(long j4) {
            this.f51906d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a f(@q0 q qVar) {
            this.f51911i = qVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a g(@q0 w wVar) {
            this.f51910h = wVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        t.a h(@q0 byte[] bArr) {
            this.f51907e = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        t.a i(@q0 String str) {
            this.f51908f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.t.a
        public t.a j(long j4) {
            this.f51909g = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @q0
    public p b() {
        return this.f51896c;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @q0
    public Integer c() {
        return this.f51895b;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long d() {
        return this.f51894a;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long e() {
        return this.f51897d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f51894a == tVar.d() && ((num = this.f51895b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f51896c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f51897d == tVar.e()) {
            if (Arrays.equals(this.f51898e, tVar instanceof j ? ((j) tVar).f51898e : tVar.h()) && ((str = this.f51899f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f51900g == tVar.j() && ((wVar = this.f51901h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f51902i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @q0
    public q f() {
        return this.f51902i;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @q0
    public w g() {
        return this.f51901h;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @q0
    public byte[] h() {
        return this.f51898e;
    }

    public int hashCode() {
        long j4 = this.f51894a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f51895b;
        int hashCode = (i4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f51896c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j5 = this.f51897d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f51898e)) * 1000003;
        String str = this.f51899f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j6 = this.f51900g;
        int i5 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        w wVar = this.f51901h;
        int hashCode5 = (i5 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f51902i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.t
    @q0
    public String i() {
        return this.f51899f;
    }

    @Override // com.google.android.datatransport.cct.internal.t
    public long j() {
        return this.f51900g;
    }

    public String toString() {
        return ProtectedSandApp.s("씵") + this.f51894a + ProtectedSandApp.s("씶") + this.f51895b + ProtectedSandApp.s("씷") + this.f51896c + ProtectedSandApp.s("씸") + this.f51897d + ProtectedSandApp.s("씹") + Arrays.toString(this.f51898e) + ProtectedSandApp.s("씺") + this.f51899f + ProtectedSandApp.s("씻") + this.f51900g + ProtectedSandApp.s("씼") + this.f51901h + ProtectedSandApp.s("씽") + this.f51902i + ProtectedSandApp.s("씾");
    }

    private j(long j4, @q0 Integer num, @q0 p pVar, long j5, @q0 byte[] bArr, @q0 String str, long j6, @q0 w wVar, @q0 q qVar) {
        this.f51894a = j4;
        this.f51895b = num;
        this.f51896c = pVar;
        this.f51897d = j5;
        this.f51898e = bArr;
        this.f51899f = str;
        this.f51900g = j6;
        this.f51901h = wVar;
        this.f51902i = qVar;
    }
}
