package okhttp3.internal.platform;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.d0;

/* compiled from: Jdk9Platform.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006H\u0017J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/h;", "Lokhttp3/internal/platform/j;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lp3/o;", "protocols", "Lkotlin/m2;", "f", "j", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "<init>", "()V", "g", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public class h extends j {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f31318f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);

    /* compiled from: Jdk9Platform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/platform/h$a;", "", "Lokhttp3/internal/platform/h;", "a", "", "isAvailable", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.h$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
        public final h a() {
            if (h.f31318f) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f31318f;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r1.intValue() >= 9) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        /*
            okhttp3.internal.platform.h$a r0 = new okhttp3.internal.platform.h$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.h.INSTANCE = r0
            java.lang.String r0 = "鈃"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L18
            java.lang.Integer r1 = kotlin.text.v.X0(r0)
        L18:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L27
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L25
            goto L34
        L25:
            r0 = r2
            goto L34
        L27:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "鈄"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)     // Catch: java.lang.NoSuchMethodException -> L25
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L25
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L25
        L34:
            okhttp3.internal.platform.h.f31318f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.h.<clinit>():void");
    }

    @Override // okhttp3.internal.platform.j
    @okhttp3.internal.c
    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("鈅"));
        l0.p(list, ProtectedSandApp.s("鈆"));
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b6 = j.INSTANCE.b(list);
        l0.o(sSLParameters, ProtectedSandApp.s("鈇"));
        Object[] array = b6.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("鈈"));
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    @okhttp3.internal.c
    public String j(@d5.d SSLSocket sslSocket) {
        String applicationProtocol;
        l0.p(sslSocket, ProtectedSandApp.s("鈉"));
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
    @d5.e
    public X509TrustManager s(@d5.d SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("鈊"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("鈋"));
    }
}
