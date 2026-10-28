package okhttp3.internal.platform.android;

import androidx.compose.foundation.layout.f3;
import androidx.content.preferences.protobuf.o1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.text.v;
import okhttp3.c0;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;

/* compiled from: AndroidSocketAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001\u000bB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006\""}, d2 = {"Lokhttp3/internal/platform/android/h;", "Lokhttp3/internal/platform/android/m;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "", "isSupported", "()Z", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/c0;", "protocols", "Lkotlin/k2;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "c", "getAlpnSelectedProtocol", "d", "setAlpnProtocols", "Ljava/lang/Class;", "g", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class h implements m {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final l.a f84815f;

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
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/platform/android/h$a;", "", "<init>", "()V", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lokhttp3/internal/platform/android/h;", "b", "(Ljava/lang/Class;)Lokhttp3/internal/platform/android/h;", "", "packageName", "Lokhttp3/internal/platform/android/l$a;", "c", "(Ljava/lang/String;)Lokhttp3/internal/platform/android/l$a;", "playProviderFactory", "Lokhttp3/internal/platform/android/l$a;", "d", "()Lokhttp3/internal/platform/android/l$a;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: AndroidSocketAdapter.kt */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"okhttp3/internal/platform/android/h$a$a", "Lokhttp3/internal/platform/android/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lokhttp3/internal/platform/android/m;", "b", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/m;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.platform.android.h$a$a, reason: collision with other inner class name */
        public static final class C1323a implements l.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f84822a;

            C1323a(String str) {
                this.f84822a = str;
            }

            @Override // okhttp3.internal.platform.android.l.a
            public boolean a(@fg.l SSLSocket sslSocket) {
                l0.p(sslSocket, ProtectedSandApp.s("᷏"));
                String name = sslSocket.getClass().getName();
                l0.o(name, ProtectedSandApp.s("᷐"));
                return v.s2(name, f3.a(new StringBuilder(), this.f84822a, '.'), false, 2, null);
            }

            @Override // okhttp3.internal.platform.android.l.a
            @fg.l
            public m b(@fg.l SSLSocket sslSocket) {
                l0.p(sslSocket, ProtectedSandApp.s("᷏"));
                return h.INSTANCE.b(sslSocket.getClass());
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class<? super SSLSocket> actualSSLSocketClass) {
            Class<? super SSLSocket> cls = actualSSLSocketClass;
            while (cls != null && !l0.g(cls.getSimpleName(), ProtectedSandApp.s("᷑"))) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    throw new AssertionError(o1.a(ProtectedSandApp.s("᷒"), actualSSLSocketClass));
                }
            }
            l0.m(cls);
            return new h(cls);
        }

        @fg.l
        public final l.a c(@fg.l String packageName) {
            l0.p(packageName, ProtectedSandApp.s("ᷓ"));
            return new C1323a(packageName);
        }

        @fg.l
        public final l.a d() {
            return h.f84815f;
        }

        public Companion(w wVar) {
        }
    }

    static {
        Companion companion = new Companion();
        INSTANCE = companion;
        f84815f = companion.c(ProtectedSandApp.s("ᷔ"));
    }

    public h(@fg.l Class<? super SSLSocket> cls) {
        l0.p(cls, ProtectedSandApp.s("ᷕ"));
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod(ProtectedSandApp.s("ᷖ"), Boolean.TYPE);
        l0.o(declaredMethod, ProtectedSandApp.s("ᷗ"));
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod(ProtectedSandApp.s("ᷘ"), String.class);
        this.getAlpnSelectedProtocol = cls.getMethod(ProtectedSandApp.s("ᷙ"), null);
        this.setAlpnProtocols = cls.getMethod(ProtectedSandApp.s("ᷚ"), byte[].class);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@fg.l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷛ"));
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public String b(@fg.l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷛ"));
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, null);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            l0.o(charset, ProtectedSandApp.s("ᷜ"));
            return new String(bArr, charset);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (NullPointerException e5) {
            if (l0.g(e5.getMessage(), ProtectedSandApp.s("ᷝ"))) {
                return null;
            }
            throw e5;
        } catch (InvocationTargetException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public X509TrustManager c(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᷞ"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᷞ"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public void e(@fg.l SSLSocket sslSocket, @fg.m String hostname, @fg.l List<? extends c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷛ"));
        l0.p(protocols, ProtectedSandApp.s("ᷟ"));
        if (a(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
                if (hostname != null) {
                    this.setHostname.invoke(sslSocket, hostname);
                }
                this.setAlpnProtocols.invoke(sslSocket, okhttp3.internal.platform.j.INSTANCE.c(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        okhttp3.internal.platform.b.INSTANCE.getClass();
        return okhttp3.internal.platform.b.f84836h;
    }
}
