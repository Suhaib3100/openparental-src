package okhttp3.logging;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.nio.charset.Charset;
import okhttp3.internal.platform.j;
import okhttp3.u;
import okhttp3.w;
import okio.m;

/* compiled from: HttpLoggingInterceptor.java */
/* loaded from: classes3.dex */
public final class a implements w {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f85018d = Charset.forName(ProtectedSandApp.s("ữ"));

    /* renamed from: b, reason: collision with root package name */
    private final b f85019b;

    /* renamed from: c, reason: collision with root package name */
    private volatile EnumC1326a f85020c;

    /* compiled from: HttpLoggingInterceptor.java */
    /* renamed from: okhttp3.logging.a$a, reason: collision with other inner class name */
    public enum EnumC1326a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f85021a = new C1327a();

        /* compiled from: HttpLoggingInterceptor.java */
        /* renamed from: okhttp3.logging.a$b$a, reason: collision with other inner class name */
        final class C1327a implements b {
            C1327a() {
            }

            @Override // okhttp3.logging.a.b
            public void a(String str) {
                j.h().log(4, str, null);
            }
        }

        void a(String str);
    }

    public a() {
        this(b.f85021a);
    }

    private boolean a(u uVar) {
        String f4 = uVar.f(ProtectedSandApp.s("Ự"));
        return (f4 == null || f4.equalsIgnoreCase(ProtectedSandApp.s("ự"))) ? false : true;
    }

    static boolean c(m mVar) {
        try {
            m mVar2 = new m();
            mVar.n(mVar2, 0L, mVar.size() < 64 ? mVar.size() : 64L);
            for (int i4 = 0; i4 < 16; i4++) {
                if (mVar2.t2()) {
                    return true;
                }
                int Z2 = mVar2.Z2();
                if (Character.isISOControl(Z2) && !Character.isWhitespace(Z2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public EnumC1326a b() {
        return this.f85020c;
    }

    public a d(EnumC1326a enumC1326a) {
        if (enumC1326a == null) {
            throw new NullPointerException(ProtectedSandApp.s("Ỳ"));
        }
        this.f85020c = enumC1326a;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    @Override // okhttp3.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.f0 intercept(okhttp3.w.a r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.a.intercept(okhttp3.w$a):okhttp3.f0");
    }

    public a(b bVar) {
        this.f85020c = EnumC1326a.NONE;
        this.f85019b = bVar;
    }
}
