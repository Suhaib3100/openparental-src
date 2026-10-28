package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.u;
import java.util.List;
import t9.a;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes5.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final long f51912a;

    /* renamed from: b, reason: collision with root package name */
    private final long f51913b;

    /* renamed from: c, reason: collision with root package name */
    private final o f51914c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f51915d;

    /* renamed from: e, reason: collision with root package name */
    private final String f51916e;

    /* renamed from: f, reason: collision with root package name */
    private final List<t> f51917f;

    /* renamed from: g, reason: collision with root package name */
    private final x f51918g;

    /* compiled from: AutoValue_LogRequest.java */
    static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f51919a;

        /* renamed from: b, reason: collision with root package name */
        private Long f51920b;

        /* renamed from: c, reason: collision with root package name */
        private o f51921c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f51922d;

        /* renamed from: e, reason: collision with root package name */
        private String f51923e;

        /* renamed from: f, reason: collision with root package name */
        private List<t> f51924f;

        /* renamed from: g, reason: collision with root package name */
        private x f51925g;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u a() {
            String s4 = this.f51919a == null ? ProtectedSandApp.s("씿") : "";
            if (this.f51920b == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("앀"));
            }
            if (s4.isEmpty()) {
                return new k(this.f51919a.longValue(), this.f51920b.longValue(), this.f51921c, this.f51922d, this.f51923e, this.f51924f, this.f51925g);
            }
            throw new IllegalStateException(ProtectedSandApp.s("앁").concat(s4));
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a b(@q0 o oVar) {
            this.f51921c = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a c(@q0 List<t> list) {
            this.f51924f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        u.a d(@q0 Integer num) {
            this.f51922d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        u.a e(@q0 String str) {
            this.f51923e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a f(@q0 x xVar) {
            this.f51925g = xVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a g(long j4) {
            this.f51919a = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.u.a
        public u.a h(long j4) {
            this.f51920b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @q0
    public o b() {
        return this.f51914c;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @q0
    @a.InterfaceC1396a(name = "logEvent")
    public List<t> c() {
        return this.f51917f;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @q0
    public Integer d() {
        return this.f51915d;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @q0
    public String e() {
        return this.f51916e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f51912a == uVar.g() && this.f51913b == uVar.h() && ((oVar = this.f51914c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f51915d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f51916e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f51917f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f51918g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    @q0
    public x f() {
        return this.f51918g;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    public long g() {
        return this.f51912a;
    }

    @Override // com.google.android.datatransport.cct.internal.u
    public long h() {
        return this.f51913b;
    }

    public int hashCode() {
        long j4 = this.f51912a;
        long j5 = this.f51913b;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        o oVar = this.f51914c;
        int hashCode = (i4 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f51915d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f51916e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f51917f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f51918g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("앂") + this.f51912a + ProtectedSandApp.s("앃") + this.f51913b + ProtectedSandApp.s("아") + this.f51914c + ProtectedSandApp.s("악") + this.f51915d + ProtectedSandApp.s("앆") + this.f51916e + ProtectedSandApp.s("앇") + this.f51917f + ProtectedSandApp.s("안") + this.f51918g + ProtectedSandApp.s("앉");
    }

    private k(long j4, long j5, @q0 o oVar, @q0 Integer num, @q0 String str, @q0 List<t> list, @q0 x xVar) {
        this.f51912a = j4;
        this.f51913b = j5;
        this.f51914c = oVar;
        this.f51915d = num;
        this.f51916e = str;
        this.f51917f = list;
        this.f51918g = xVar;
    }
}
