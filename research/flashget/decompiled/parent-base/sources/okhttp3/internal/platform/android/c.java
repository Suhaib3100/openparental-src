package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import okhttp3.internal.platform.android.m;

/* compiled from: Android10SocketAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/android/c;", "Lokhttp3/internal/platform/android/m;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Lokhttp3/c0;", "protocols", "Lkotlin/k2;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
@SuppressLint({"NewApi"})
@okhttp3.internal.c
/* loaded from: classes3.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: Android10SocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/platform/android/c$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/android/m;", "a", "()Lokhttp3/internal/platform/android/m;", "", "b", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    @okhttp3.internal.c
    /* renamed from: okhttp3.internal.platform.android.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            return okhttp3.internal.platform.j.INSTANCE.h() && Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@fg.l SSLSocket sslSocket) {
        boolean isSupportedSocket;
        l0.p(sslSocket, ProtectedSandApp.s("ᶰ"));
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    @SuppressLint({"NewApi"})
    public String b(@fg.l SSLSocket sslSocket) {
        String applicationProtocol;
        l0.p(sslSocket, ProtectedSandApp.s("ᶰ"));
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public X509TrustManager c(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᶱ"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᶱ"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    @SuppressLint({"NewApi"})
    public void e(@fg.l SSLSocket sslSocket, @fg.m String hostname, @fg.l List<? extends c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("ᶰ"));
        l0.p(protocols, ProtectedSandApp.s("ᶲ"));
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            l0.o(sSLParameters, ProtectedSandApp.s("ᶳ"));
            Object[] array = okhttp3.internal.platform.j.INSTANCE.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("ᶴ"));
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException(ProtectedSandApp.s("ᶵ"), e4);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        return INSTANCE.b();
    }
}
