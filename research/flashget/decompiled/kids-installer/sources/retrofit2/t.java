package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.UByte;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.s;
import okhttp3.v;
import okhttp3.w;
import okhttp3.z;

/* compiled from: RequestBuilder.java */
/* loaded from: classes5.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private final String f33096a;

    /* renamed from: b, reason: collision with root package name */
    private final okhttp3.w f33097b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private String f33098c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private w.a f33099d;

    /* renamed from: e, reason: collision with root package name */
    private final e0.a f33100e = new e0.a();

    /* renamed from: f, reason: collision with root package name */
    private final v.a f33101f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private okhttp3.y f33102g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f33103h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private z.a f33104i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private s.a f33105j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private f0 f33106k;

    /* renamed from: m, reason: collision with root package name */
    private static final String f33094m = ProtectedSandApp.s("楇");

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f33093l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f33095n = Pattern.compile(ProtectedSandApp.s("楈"));

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes6.dex */
    private static class a extends f0 {

        /* renamed from: b, reason: collision with root package name */
        private final f0 f33107b;

        /* renamed from: c, reason: collision with root package name */
        private final okhttp3.y f33108c;

        a(f0 f0Var, okhttp3.y yVar) {
            this.f33107b = f0Var;
            this.f33108c = yVar;
        }

        @Override // okhttp3.f0
        public long a() throws IOException {
            return this.f33107b.a();
        }

        @Override // okhttp3.f0
        /* renamed from: b */
        public okhttp3.y getContentType() {
            return this.f33108c;
        }

        @Override // okhttp3.f0
        public void r(okio.n nVar) throws IOException {
            this.f33107b.r(nVar);
        }
    }

    t(String str, okhttp3.w wVar, @Nullable String str2, @Nullable okhttp3.v vVar, @Nullable okhttp3.y yVar, boolean z5, boolean z6, boolean z7) {
        this.f33096a = str;
        this.f33097b = wVar;
        this.f33098c = str2;
        this.f33102g = yVar;
        this.f33103h = z5;
        if (vVar != null) {
            this.f33101f = vVar.s();
        } else {
            this.f33101f = new v.a();
        }
        if (z6) {
            this.f33105j = new s.a();
        } else if (z7) {
            z.a aVar = new z.a();
            this.f33104i = aVar;
            aVar.g(okhttp3.z.f31584k);
        }
    }

    private static String i(String str, boolean z5) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            if (codePointAt < 32 || codePointAt >= 127 || ProtectedSandApp.s("楉").indexOf(codePointAt) != -1 || (!z5 && (codePointAt == 47 || codePointAt == 37))) {
                okio.m mVar = new okio.m();
                mVar.u0(str, 0, i5);
                j(mVar, str, i5, length, z5);
                return mVar.L0();
            }
            i5 += Character.charCount(codePointAt);
        }
        return str;
    }

    private static void j(okio.m mVar, String str, int i5, int i6, boolean z5) {
        okio.m mVar2 = null;
        while (i5 < i6) {
            int codePointAt = str.codePointAt(i5);
            if (!z5 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || ProtectedSandApp.s("楊").indexOf(codePointAt) != -1 || (!z5 && (codePointAt == 47 || codePointAt == 37))) {
                    if (mVar2 == null) {
                        mVar2 = new okio.m();
                    }
                    mVar2.y(codePointAt);
                    while (!mVar2.M()) {
                        int readByte = mVar2.readByte() & UByte.f27220r;
                        mVar.writeByte(37);
                        char[] cArr = f33093l;
                        mVar.writeByte(cArr[(readByte >> 4) & 15]);
                        mVar.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    mVar.y(codePointAt);
                }
            }
            i5 += Character.charCount(codePointAt);
        }
    }

    void a(String str, String str2, boolean z5) {
        if (z5) {
            this.f33105j.b(str, str2);
        } else {
            this.f33105j.a(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!ProtectedSandApp.s("楋").equalsIgnoreCase(str)) {
            this.f33101f.b(str, str2);
            return;
        }
        try {
            this.f33102g = okhttp3.y.h(str2);
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("楌"), str2), e6);
        }
    }

    void c(okhttp3.v vVar) {
        this.f33101f.e(vVar);
    }

    void d(okhttp3.v vVar, f0 f0Var) {
        this.f33104i.c(vVar, f0Var);
    }

    void e(z.c cVar) {
        this.f33104i.d(cVar);
    }

    void f(String str, String str2, boolean z5) {
        if (this.f33098c == null) {
            throw new AssertionError();
        }
        String i5 = i(str2, z5);
        String replace = this.f33098c.replace(ProtectedSandApp.s("楍") + str + ProtectedSandApp.s("楎"), i5);
        if (f33095n.matcher(replace).matches()) {
            throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("楏"), str2));
        }
        this.f33098c = replace;
    }

    void g(String str, @Nullable String str2, boolean z5) {
        String str3 = this.f33098c;
        if (str3 != null) {
            w.a I = this.f33097b.I(str3);
            this.f33099d = I;
            if (I == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("楐") + this.f33097b + ProtectedSandApp.s("楑") + this.f33098c);
            }
            this.f33098c = null;
        }
        if (z5) {
            this.f33099d.c(str, str2);
        } else {
            this.f33099d.g(str, str2);
        }
    }

    <T> void h(Class<T> cls, @Nullable T t5) {
        this.f33100e.z(cls, t5);
    }

    e0.a k() {
        okhttp3.w W;
        w.a aVar = this.f33099d;
        if (aVar != null) {
            W = aVar.h();
        } else {
            W = this.f33097b.W(this.f33098c);
            if (W == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("楓") + this.f33097b + ProtectedSandApp.s("楔") + this.f33098c);
            }
        }
        f0 f0Var = this.f33106k;
        if (f0Var == null) {
            s.a aVar2 = this.f33105j;
            if (aVar2 != null) {
                f0Var = aVar2.c();
            } else {
                z.a aVar3 = this.f33104i;
                if (aVar3 != null) {
                    f0Var = aVar3.f();
                } else if (this.f33103h) {
                    f0Var = f0.h(null, new byte[0]);
                }
            }
        }
        okhttp3.y yVar = this.f33102g;
        if (yVar != null) {
            if (f0Var != null) {
                f0Var = new a(f0Var, yVar);
            } else {
                this.f33101f.b(ProtectedSandApp.s("楒"), yVar.getMediaType());
            }
        }
        return this.f33100e.D(W).o(this.f33101f.i()).p(this.f33096a, f0Var);
    }

    void l(f0 f0Var) {
        this.f33106k = f0Var;
    }

    void m(Object obj) {
        this.f33098c = obj.toString();
    }
}
