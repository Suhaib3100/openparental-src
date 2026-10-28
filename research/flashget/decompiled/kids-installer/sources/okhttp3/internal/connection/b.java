package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.l;

/* compiled from: ConnectionSpecSelector.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/connection/b;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "sslSocket", "Lokhttp3/l;", "a", "Ljava/io/IOException;", "e", "b", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "isFallback", "", "d", "Ljava/util/List;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int nextModeIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isFallbackPossible;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isFallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<l> connectionSpecs;

    public b(@d5.d List<l> list) {
        l0.p(list, ProtectedSandApp.s("憠"));
        this.connectionSpecs = list;
    }

    private final boolean c(SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i5 = this.nextModeIndex; i5 < size; i5++) {
            if (this.connectionSpecs.get(i5).h(socket)) {
                return true;
            }
        }
        return false;
    }

    @d5.d
    public final l a(@d5.d SSLSocket sslSocket) throws IOException {
        l lVar;
        l0.p(sslSocket, ProtectedSandApp.s("憡"));
        int i5 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i5 >= size) {
                lVar = null;
                break;
            }
            lVar = this.connectionSpecs.get(i5);
            if (lVar.h(sslSocket)) {
                this.nextModeIndex = i5 + 1;
                break;
            }
            i5++;
        }
        if (lVar != null) {
            this.isFallbackPossible = c(sslSocket);
            lVar.f(sslSocket, this.isFallback);
            return lVar;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("憢"));
        sb.append(this.isFallback);
        sb.append(ProtectedSandApp.s("憣"));
        sb.append(this.connectionSpecs);
        sb.append(ProtectedSandApp.s("憤"));
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        l0.m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        l0.o(arrays, ProtectedSandApp.s("憥"));
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(@d5.d IOException e6) {
        l0.p(e6, ProtectedSandApp.s("憦"));
        this.isFallback = true;
        return (!this.isFallbackPossible || (e6 instanceof ProtocolException) || (e6 instanceof InterruptedIOException) || ((e6 instanceof SSLHandshakeException) && (e6.getCause() instanceof CertificateException)) || (e6 instanceof SSLPeerUnverifiedException) || !(e6 instanceof SSLException)) ? false : true;
    }
}
