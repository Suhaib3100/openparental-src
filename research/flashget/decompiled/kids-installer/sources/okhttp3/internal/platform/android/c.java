package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.d0;
import okhttp3.internal.platform.android.m;

/* compiled from: Android10SocketAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/platform/android/c;", "Lokhttp3/internal/platform/android/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "isSupported", "", "b", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "e", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
@SuppressLint({"NewApi"})
@okhttp3.internal.c
/* loaded from: classes5.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: Android10SocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/android/c$a;", "", "Lokhttp3/internal/platform/android/m;", "a", "", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    @okhttp3.internal.c
    /* renamed from: okhttp3.internal.platform.android.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
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
    public boolean a(@d5.d SSLSocket sslSocket) {
        boolean isSupportedSocket;
        l0.p(sslSocket, ProtectedSandApp.s("攠"));
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    @SuppressLint({"NewApi"})
    public String b(@d5.d SSLSocket sslSocket) {
        String applicationProtocol;
        l0.p(sslSocket, ProtectedSandApp.s("攡"));
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public X509TrustManager c(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("攢"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("攣"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    @SuppressLint({"NewApi"})
    public void e(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("攤"));
        l0.p(list, ProtectedSandApp.s("攥"));
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            l0.o(sSLParameters, ProtectedSandApp.s("攦"));
            Object[] array = okhttp3.internal.platform.j.INSTANCE.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("攧"));
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e6) {
            throw new IOException(ProtectedSandApp.s("攨"), e6);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        return INSTANCE.b();
    }
}
