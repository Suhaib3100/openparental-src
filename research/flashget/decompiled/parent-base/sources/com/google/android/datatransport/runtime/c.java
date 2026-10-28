package com.google.android.datatransport.runtime;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.k;
import java.util.Arrays;
import java.util.Map;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes5.dex */
final class c extends k {

    /* renamed from: a, reason: collision with root package name */
    private final String f51986a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f51987b;

    /* renamed from: c, reason: collision with root package name */
    private final j f51988c;

    /* renamed from: d, reason: collision with root package name */
    private final long f51989d;

    /* renamed from: e, reason: collision with root package name */
    private final long f51990e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f51991f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f51992g;

    /* renamed from: h, reason: collision with root package name */
    private final String f51993h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f51994i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f51995j;

    /* compiled from: AutoValue_EventInternal.java */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private String f51996a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f51997b;

        /* renamed from: c, reason: collision with root package name */
        private j f51998c;

        /* renamed from: d, reason: collision with root package name */
        private Long f51999d;

        /* renamed from: e, reason: collision with root package name */
        private Long f52000e;

        /* renamed from: f, reason: collision with root package name */
        private Map<String, String> f52001f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f52002g;

        /* renamed from: h, reason: collision with root package name */
        private String f52003h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f52004i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f52005j;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k d() {
            String s4 = this.f51996a == null ? ProtectedSandApp.s("얺") : "";
            if (this.f51998c == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("얻"));
            }
            if (this.f51999d == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("얼"));
            }
            if (this.f52000e == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("얽"));
            }
            if (this.f52001f == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("얾"));
            }
            if (s4.isEmpty()) {
                return new c(this.f51996a, this.f51997b, this.f51998c, this.f51999d.longValue(), this.f52000e.longValue(), this.f52001f, this.f52002g, this.f52003h, this.f52004i, this.f52005j);
            }
            throw new IllegalStateException(ProtectedSandApp.s("얿").concat(s4));
        }

        @Override // com.google.android.datatransport.runtime.k.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f52001f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException(ProtectedSandApp.s("엀"));
        }

        @Override // com.google.android.datatransport.runtime.k.a
        protected k.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException(ProtectedSandApp.s("엁"));
            }
            this.f52001f = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a g(Integer num) {
            this.f51997b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a h(j jVar) {
            if (jVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("엂"));
            }
            this.f51998c = jVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a i(long j4) {
            this.f51999d = Long.valueOf(j4);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a j(byte[] bArr) {
            this.f52004i = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a k(byte[] bArr) {
            this.f52005j = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a l(Integer num) {
            this.f52002g = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a m(String str) {
            this.f52003h = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a n(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("엃"));
            }
            this.f51996a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public k.a o(long j4) {
            this.f52000e = Long.valueOf(j4);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.k
    protected Map<String, String> c() {
        return this.f51991f;
    }

    @Override // com.google.android.datatransport.runtime.k
    @q0
    public Integer d() {
        return this.f51987b;
    }

    @Override // com.google.android.datatransport.runtime.k
    public j e() {
        return this.f51988c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f51986a.equals(kVar.p()) && ((num = this.f51987b) != null ? num.equals(kVar.d()) : kVar.d() == null) && this.f51988c.equals(kVar.e()) && this.f51989d == kVar.f() && this.f51990e == kVar.q() && this.f51991f.equals(kVar.c()) && ((num2 = this.f51992g) != null ? num2.equals(kVar.n()) : kVar.n() == null) && ((str = this.f51993h) != null ? str.equals(kVar.o()) : kVar.o() == null)) {
            boolean z4 = kVar instanceof c;
            if (Arrays.equals(this.f51994i, z4 ? ((c) kVar).f51994i : kVar.g())) {
                if (Arrays.equals(this.f51995j, z4 ? ((c) kVar).f51995j : kVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.k
    public long f() {
        return this.f51989d;
    }

    @Override // com.google.android.datatransport.runtime.k
    @q0
    public byte[] g() {
        return this.f51994i;
    }

    @Override // com.google.android.datatransport.runtime.k
    @q0
    public byte[] h() {
        return this.f51995j;
    }

    public int hashCode() {
        int hashCode = (this.f51986a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f51987b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f51988c.hashCode()) * 1000003;
        long j4 = this.f51989d;
        int i4 = (hashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f51990e;
        int hashCode3 = (((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f51991f.hashCode()) * 1000003;
        Integer num2 = this.f51992g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f51993h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f51994i)) * 1000003) ^ Arrays.hashCode(this.f51995j);
    }

    @Override // com.google.android.datatransport.runtime.k
    @q0
    public Integer n() {
        return this.f51992g;
    }

    @Override // com.google.android.datatransport.runtime.k
    @q0
    public String o() {
        return this.f51993h;
    }

    @Override // com.google.android.datatransport.runtime.k
    public String p() {
        return this.f51986a;
    }

    @Override // com.google.android.datatransport.runtime.k
    public long q() {
        return this.f51990e;
    }

    public String toString() {
        return ProtectedSandApp.s("엄") + this.f51986a + ProtectedSandApp.s("업") + this.f51987b + ProtectedSandApp.s("없") + this.f51988c + ProtectedSandApp.s("엇") + this.f51989d + ProtectedSandApp.s("었") + this.f51990e + ProtectedSandApp.s("엉") + this.f51991f + ProtectedSandApp.s("엊") + this.f51992g + ProtectedSandApp.s("엋") + this.f51993h + ProtectedSandApp.s("엌") + Arrays.toString(this.f51994i) + ProtectedSandApp.s("엍") + Arrays.toString(this.f51995j) + ProtectedSandApp.s("엎");
    }

    private c(String str, @q0 Integer num, j jVar, long j4, long j5, Map<String, String> map, @q0 Integer num2, @q0 String str2, @q0 byte[] bArr, @q0 byte[] bArr2) {
        this.f51986a = str;
        this.f51987b = num;
        this.f51988c = jVar;
        this.f51989d = j4;
        this.f51990e = j5;
        this.f51991f = map;
        this.f51992g = num2;
        this.f51993h = str2;
        this.f51994i = bArr;
        this.f51995j = bArr2;
    }
}
