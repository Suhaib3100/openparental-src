package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okhttp3.y;

/* compiled from: RequestBuilder.java */
/* loaded from: classes9.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f90012a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.v f90013b;

    /* renamed from: c, reason: collision with root package name */
    @zc.h
    private String f90014c;

    /* renamed from: d, reason: collision with root package name */
    @zc.h
    private v.a f90015d;

    /* renamed from: e, reason: collision with root package name */
    private final d0.a f90016e = new d0.a();

    /* renamed from: f, reason: collision with root package name */
    private final u.a f90017f;

    /* renamed from: g, reason: collision with root package name */
    @zc.h
    private okhttp3.x f90018g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f90019h;

    /* renamed from: i, reason: collision with root package name */
    @zc.h
    private y.a f90020i;

    /* renamed from: j, reason: collision with root package name */
    @zc.h
    private s.a f90021j;

    /* renamed from: k, reason: collision with root package name */
    @zc.h
    private e0 f90022k;

    /* renamed from: m, reason: collision with root package name */
    private static final String f90010m = ProtectedSandApp.s("ꘄ\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f90009l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f90011n = Pattern.compile(ProtectedSandApp.s("ꘅ\u0001"));

    /* compiled from: RequestBuilder.java */
    private static class a extends e0 {

        /* renamed from: a, reason: collision with root package name */
        private final e0 f90023a;

        /* renamed from: b, reason: collision with root package name */
        private final okhttp3.x f90024b;

        a(e0 e0Var, okhttp3.x xVar) {
            this.f90023a = e0Var;
            this.f90024b = xVar;
        }

        @Override // okhttp3.e0
        public long contentLength() throws IOException {
            return this.f90023a.contentLength();
        }

        @Override // okhttp3.e0
        /* renamed from: contentType */
        public okhttp3.x getContentType() {
            return this.f90024b;
        }

        @Override // okhttp3.e0
        public void writeTo(okio.n nVar) throws IOException {
            this.f90023a.writeTo(nVar);
        }
    }

    v(String str, okhttp3.v vVar, @zc.h String str2, @zc.h okhttp3.u uVar, @zc.h okhttp3.x xVar, boolean z4, boolean z5, boolean z6) {
        this.f90012a = str;
        this.f90013b = vVar;
        this.f90014c = str2;
        this.f90018g = xVar;
        this.f90019h = z4;
        if (uVar != null) {
            this.f90017f = uVar.m();
        } else {
            this.f90017f = new u.a();
        }
        if (z5) {
            this.f90021j = new s.a();
        } else if (z6) {
            y.a aVar = new y.a();
            this.f90020i = aVar;
            aVar.g(okhttp3.y.f85126j);
        }
    }

    private static String i(String str, boolean z4) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt >= 127 || ProtectedSandApp.s("ꘄ\u0001").indexOf(codePointAt) != -1 || (!z4 && (codePointAt == 47 || codePointAt == 37))) {
                okio.m mVar = new okio.m();
                mVar.a1(str, 0, i4);
                j(mVar, str, i4, length, z4);
                return mVar.n3();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(okio.m mVar, String str, int i4, int i5, boolean z4) {
        okio.m mVar2 = null;
        while (i4 < i5) {
            int codePointAt = str.codePointAt(i4);
            if (!z4 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || ProtectedSandApp.s("ꘄ\u0001").indexOf(codePointAt) != -1 || (!z4 && (codePointAt == 47 || codePointAt == 37))) {
                    if (mVar2 == null) {
                        mVar2 = new okio.m();
                    }
                    mVar2.f0(codePointAt);
                    while (!mVar2.t2()) {
                        byte readByte = mVar2.readByte();
                        mVar.writeByte(37);
                        char[] cArr = f90009l;
                        mVar.writeByte(cArr[((readByte & 255) >> 4) & 15]);
                        mVar.writeByte(cArr[readByte & com.google.common.base.c.f54871q]);
                    }
                } else {
                    mVar.f0(codePointAt);
                }
            }
            i4 += Character.charCount(codePointAt);
        }
    }

    void a(String str, String str2, boolean z4) {
        if (z4) {
            this.f90021j.b(str, str2);
        } else {
            this.f90021j.a(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!ProtectedSandApp.s("ꘆ\u0001").equalsIgnoreCase(str)) {
            this.f90017f.b(str, str2);
            return;
        }
        try {
            this.f90018g = okhttp3.x.h(str2);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꘇ\u0001"), str2), e4);
        }
    }

    void c(okhttp3.u uVar) {
        this.f90017f.e(uVar);
    }

    void d(okhttp3.u uVar, e0 e0Var) {
        this.f90020i.c(uVar, e0Var);
    }

    void e(y.c cVar) {
        this.f90020i.d(cVar);
    }

    void f(String str, String str2, boolean z4) {
        if (this.f90014c == null) {
            throw new AssertionError();
        }
        String i4 = i(str2, z4);
        String replace = this.f90014c.replace(ProtectedSandApp.s("ꘈ\u0001") + str + ProtectedSandApp.s("ꘉ\u0001"), i4);
        if (f90011n.matcher(replace).matches()) {
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꘊ\u0001"), str2));
        }
        this.f90014c = replace;
    }

    void g(String str, @zc.h String str2, boolean z4) {
        String str3 = this.f90014c;
        if (str3 != null) {
            v.a I = this.f90013b.I(str3);
            this.f90015d = I;
            if (I == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꘋ\u0001") + this.f90013b + ProtectedSandApp.s("ꘌ\u0001") + this.f90014c);
            }
            this.f90014c = null;
        }
        if (z4) {
            this.f90015d.c(str, str2);
        } else {
            this.f90015d.g(str, str2);
        }
    }

    <T> void h(Class<T> cls, @zc.h T t4) {
        this.f90016e.z(cls, t4);
    }

    d0.a k() {
        okhttp3.v W;
        v.a aVar = this.f90015d;
        if (aVar != null) {
            W = aVar.h();
        } else {
            W = this.f90013b.W(this.f90014c);
            if (W == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꘋ\u0001") + this.f90013b + ProtectedSandApp.s("ꘌ\u0001") + this.f90014c);
            }
        }
        e0 e0Var = this.f90022k;
        if (e0Var == null) {
            s.a aVar2 = this.f90021j;
            if (aVar2 != null) {
                e0Var = aVar2.c();
            } else {
                y.a aVar3 = this.f90020i;
                if (aVar3 != null) {
                    e0Var = aVar3.f();
                } else if (this.f90019h) {
                    e0Var = e0.create((okhttp3.x) null, new byte[0]);
                }
            }
        }
        okhttp3.x xVar = this.f90018g;
        if (xVar != null) {
            if (e0Var != null) {
                e0Var = new a(e0Var, xVar);
            } else {
                this.f90017f.b(ProtectedSandApp.s("ꘆ\u0001"), xVar.getMediaType());
            }
        }
        return this.f90016e.D(W).o(this.f90017f.i()).p(this.f90012a, e0Var);
    }

    void l(e0 e0Var) {
        this.f90022k = e0Var;
    }

    void m(Object obj) {
        this.f90014c = obj.toString();
    }
}
