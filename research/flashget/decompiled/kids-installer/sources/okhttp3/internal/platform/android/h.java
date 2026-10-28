package okhttp3.internal.platform.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import okhttp3.d0;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;

/* compiled from: AndroidSocketAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0006B\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0017\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001c\u0010\u001a\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/platform/android/h;", "Lokhttp3/internal/platform/android/m;", "", "isSupported", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "e", "b", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "c", "getAlpnSelectedProtocol", "d", "setAlpnProtocols", "Ljava/lang/Class;", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "g", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class h implements m {

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final l.a f31275f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Method setUseSessionTickets;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Method setHostname;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Method getAlpnSelectedProtocol;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Method setAlpnProtocols;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Class<? super SSLSocket> sslSocketClass;

    /* compiled from: AndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/platform/android/h$a;", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lokhttp3/internal/platform/android/h;", "b", "", "packageName", "Lokhttp3/internal/platform/android/l$a;", "c", "playProviderFactory", "Lokhttp3/internal/platform/android/l$a;", "d", "()Lokhttp3/internal/platform/android/l$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: AndroidSocketAdapter.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"okhttp3/internal/platform/android/h$a$a", "Lokhttp3/internal/platform/android/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lokhttp3/internal/platform/android/m;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.platform.android.h$a$a, reason: collision with other inner class name */
        public static final class C0484a implements l.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f31282a;

            C0484a(String str) {
                this.f31282a = str;
            }

            @Override // okhttp3.internal.platform.android.l.a
            public boolean a(@d5.d SSLSocket sslSocket) {
                boolean s22;
                l0.p(sslSocket, ProtectedSandApp.s("敂"));
                String name = sslSocket.getClass().getName();
                l0.o(name, ProtectedSandApp.s("敃"));
                s22 = e0.s2(name, c1.c.a(new StringBuilder(), this.f31282a, org.apache.commons.io.k.f32026a), false, 2, null);
                return s22;
            }

            @Override // okhttp3.internal.platform.android.l.a
            @d5.d
            public m b(@d5.d SSLSocket sslSocket) {
                l0.p(sslSocket, ProtectedSandApp.s("敄"));
                return h.INSTANCE.b(sslSocket.getClass());
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class<? super SSLSocket> actualSSLSocketClass) {
            Class<? super SSLSocket> cls = actualSSLSocketClass;
            while (cls != null && (!l0.g(cls.getSimpleName(), ProtectedSandApp.s("故")))) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    throw new AssertionError(ProtectedSandApp.s("敆") + actualSSLSocketClass);
                }
            }
            l0.m(cls);
            return new h(cls);
        }

        @d5.d
        public final l.a c(@d5.d String packageName) {
            l0.p(packageName, ProtectedSandApp.s("敇"));
            return new C0484a(packageName);
        }

        @d5.d
        public final l.a d() {
            return h.f31275f;
        }

        public Companion(w wVar) {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f31275f = companion.c(ProtectedSandApp.s("效"));
    }

    public h(@d5.d Class<? super SSLSocket> cls) {
        l0.p(cls, ProtectedSandApp.s("敉"));
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod(ProtectedSandApp.s("敊"), Boolean.TYPE);
        l0.o(declaredMethod, ProtectedSandApp.s("敋"));
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod(ProtectedSandApp.s("敌"), String.class);
        this.getAlpnSelectedProtocol = cls.getMethod(ProtectedSandApp.s("敍"), new Class[0]);
        this.setAlpnProtocols = cls.getMethod(ProtectedSandApp.s("敎"), byte[].class);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("敏"));
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public String b(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("敐"));
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            l0.o(charset, ProtectedSandApp.s("救"));
            return new String(bArr, charset);
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        } catch (NullPointerException e7) {
            if (l0.g(e7.getMessage(), ProtectedSandApp.s("敒"))) {
                return null;
            }
            throw e7;
        } catch (InvocationTargetException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public X509TrustManager c(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("敓"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("敔"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public void e(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("敕"));
        l0.p(list, ProtectedSandApp.s("敖"));
        if (a(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.setHostname.invoke(sSLSocket, str);
                }
                this.setAlpnProtocols.invoke(sSLSocket, okhttp3.internal.platform.j.INSTANCE.c(list));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        okhttp3.internal.platform.b.INSTANCE.getClass();
        return okhttp3.internal.platform.b.f31296h;
    }
}
