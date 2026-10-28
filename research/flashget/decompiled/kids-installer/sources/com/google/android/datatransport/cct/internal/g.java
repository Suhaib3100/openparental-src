package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.m;
import j2.a;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes3.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f12377a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12378b;

    /* renamed from: c, reason: collision with root package name */
    private final k f12379c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f12380d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12381e;

    /* renamed from: f, reason: collision with root package name */
    private final List<l> f12382f;

    /* renamed from: g, reason: collision with root package name */
    private final p f12383g;

    /* compiled from: AutoValue_LogRequest.java */
    static final class b extends m.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f12384a;

        /* renamed from: b, reason: collision with root package name */
        private Long f12385b;

        /* renamed from: c, reason: collision with root package name */
        private k f12386c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f12387d;

        /* renamed from: e, reason: collision with root package name */
        private String f12388e;

        /* renamed from: f, reason: collision with root package name */
        private List<l> f12389f;

        /* renamed from: g, reason: collision with root package name */
        private p f12390g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        public m a() {
            String s5 = this.f12384a == null ? ProtectedSandApp.s("ῷ") : "";
            if (this.f12385b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("Ὸ"));
            }
            if (s5.isEmpty()) {
                return new g(this.f12384a.longValue(), this.f12385b.longValue(), this.f12386c, this.f12387d, this.f12388e, this.f12389f, this.f12390g);
            }
            throw new IllegalStateException(ProtectedSandApp.s("Ό").concat(s5));
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        public m.a b(@q0 k kVar) {
            this.f12386c = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        public m.a c(@q0 List<l> list) {
            this.f12389f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        m.a d(@q0 Integer num) {
            this.f12387d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        m.a e(@q0 String str) {
            this.f12388e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        public m.a f(@q0 p pVar) {
            this.f12390g = pVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        public m.a g(long j5) {
            this.f12384a = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.m.a
        public m.a h(long j5) {
            this.f12385b = Long.valueOf(j5);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.m
    @q0
    public k b() {
        return this.f12379c;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    @q0
    @a.InterfaceC0250a(name = "logEvent")
    public List<l> c() {
        return this.f12382f;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    @q0
    public Integer d() {
        return this.f12380d;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    @q0
    public String e() {
        return this.f12381e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f12377a == mVar.g() && this.f12378b == mVar.h() && ((kVar = this.f12379c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f12380d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f12381e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f12382f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f12383g;
            if (pVar == null) {
                if (mVar.f() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    @q0
    public p f() {
        return this.f12383g;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    public long g() {
        return this.f12377a;
    }

    @Override // com.google.android.datatransport.cct.internal.m
    public long h() {
        return this.f12378b;
    }

    public int hashCode() {
        long j5 = this.f12377a;
        long j6 = this.f12378b;
        int i5 = (((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        k kVar = this.f12379c;
        int hashCode = (i5 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f12380d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f12381e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f12382f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f12383g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("Ὼ") + this.f12377a + ProtectedSandApp.s("Ώ") + this.f12378b + ProtectedSandApp.s("ῼ") + this.f12379c + ProtectedSandApp.s("´") + this.f12380d + ProtectedSandApp.s("῾") + this.f12381e + ProtectedSandApp.s("\u1fff") + this.f12382f + ProtectedSandApp.s("\u2000") + this.f12383g + ProtectedSandApp.s("\u2001");
    }

    private g(long j5, long j6, @q0 k kVar, @q0 Integer num, @q0 String str, @q0 List<l> list, @q0 p pVar) {
        this.f12377a = j5;
        this.f12378b = j6;
        this.f12379c = kVar;
        this.f12380d = num;
        this.f12381e = str;
        this.f12382f = list;
        this.f12383g = pVar;
    }
}
