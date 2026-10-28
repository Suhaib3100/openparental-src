package okhttp3.internal.platform;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;

/* compiled from: Jdk9Platform.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/h;", "Lokhttp3/internal/platform/j;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/c0;", "Lkd/o;", "protocols", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "g", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class h extends j {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f84858f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: Jdk9Platform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/h$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/h;", "a", "()Lokhttp3/internal/platform/h;", "", "isAvailable", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.h$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @m
        public final h a() {
            if (h.f84858f) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f84858f;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        /*
            okhttp3.internal.platform.h$a r0 = new okhttp3.internal.platform.h$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.h.INSTANCE = r0
            java.lang.String r0 = "Ṙ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L19
            java.lang.Integer r0 = kotlin.text.v.X0(r0)
            goto L1a
        L19:
            r0 = r1
        L1a:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L28
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L34
        L26:
            r2 = r3
            goto L34
        L28:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "ṙ"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.NoSuchMethodException -> L34
            r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L34
            goto L26
        L34:
            okhttp3.internal.platform.h.f84858f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.h.<clinit>():void");
    }

    @Override // okhttp3.internal.platform.j
    @okhttp3.internal.c
    public void f(@l SSLSocket sslSocket, @m String hostname, @l List<c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("Ṛ"));
        l0.p(protocols, ProtectedSandApp.s("ṛ"));
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        List<String> b5 = j.INSTANCE.b(protocols);
        l0.o(sSLParameters, ProtectedSandApp.s("Ṝ"));
        Object[] array = b5.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("ṝ"));
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.j
    @m
    @okhttp3.internal.c
    public String j(@l SSLSocket sslSocket) {
        String applicationProtocol;
        l0.p(sslSocket, ProtectedSandApp.s("Ṛ"));
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.j
    @m
    public X509TrustManager s(@l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("Ṟ"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("ṟ"));
    }
}
