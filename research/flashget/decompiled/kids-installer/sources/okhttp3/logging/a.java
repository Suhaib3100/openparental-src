package okhttp3.logging;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.nio.charset.Charset;
import okhttp3.internal.platform.j;
import okhttp3.v;
import okhttp3.x;
import okio.m;

/* compiled from: HttpLoggingInterceptor.java */
/* loaded from: classes6.dex */
public final class a implements x {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f31474d = Charset.forName(ProtectedSandApp.s("鉘"));

    /* renamed from: b, reason: collision with root package name */
    private final b f31475b;

    /* renamed from: c, reason: collision with root package name */
    private volatile EnumC0487a f31476c;

    /* compiled from: HttpLoggingInterceptor.java */
    /* renamed from: okhttp3.logging.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0487a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.java */
    /* loaded from: classes5.dex */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f31477a = new C0488a();

        /* compiled from: HttpLoggingInterceptor.java */
        /* renamed from: okhttp3.logging.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        final class C0488a implements b {
            C0488a() {
            }

            @Override // okhttp3.logging.a.b
            public void a(String str) {
                j.h().log(4, str, null);
            }
        }

        void a(String str);
    }

    public a() {
        this(b.f31477a);
    }

    private boolean b(v vVar) {
        String g5 = vVar.g(ProtectedSandApp.s("鉙"));
        return (g5 == null || g5.equalsIgnoreCase(ProtectedSandApp.s("鉚"))) ? false : true;
    }

    static boolean d(m mVar) {
        try {
            m mVar2 = new m();
            mVar.o(mVar2, 0L, mVar.size() < 64 ? mVar.size() : 64L);
            for (int i5 = 0; i5 < 16; i5++) {
                if (mVar2.M()) {
                    return true;
                }
                int s02 = mVar2.s0();
                if (Character.isISOControl(s02) && !Character.isWhitespace(s02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    @Override // okhttp3.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.g0 a(okhttp3.x.a r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.a.a(okhttp3.x$a):okhttp3.g0");
    }

    public EnumC0487a c() {
        return this.f31476c;
    }

    public a e(EnumC0487a enumC0487a) {
        if (enumC0487a == null) {
            throw new NullPointerException(ProtectedSandApp.s("鉳"));
        }
        this.f31476c = enumC0487a;
        return this;
    }

    public a(b bVar) {
        this.f31476c = EnumC0487a.NONE;
        this.f31475b = bVar;
    }
}
