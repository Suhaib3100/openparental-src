package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/connection/b;", "", "", "Lokhttp3/l;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "(Ljavax/net/ssl/SSLSocket;)Z", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/l;", "Ljava/io/IOException;", "e", "b", "(Ljava/io/IOException;)Z", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "isFallback", "d", "Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int nextModeIndex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isFallbackPossible;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isFallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<l> connectionSpecs;

    public b(@fg.l List<l> list) {
        l0.p(list, ProtectedSandApp.s("ꂚ\u0001"));
        this.connectionSpecs = list;
    }

    private final boolean c(SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i4 = this.nextModeIndex; i4 < size; i4++) {
            if (this.connectionSpecs.get(i4).h(socket)) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    public final l a(@fg.l SSLSocket sslSocket) throws IOException {
        l lVar;
        l0.p(sslSocket, ProtectedSandApp.s("ꂛ\u0001"));
        int i4 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i4 >= size) {
                lVar = null;
                break;
            }
            lVar = this.connectionSpecs.get(i4);
            if (lVar.h(sslSocket)) {
                this.nextModeIndex = i4 + 1;
                break;
            }
            i4++;
        }
        if (lVar != null) {
            this.isFallbackPossible = c(sslSocket);
            lVar.f(sslSocket, this.isFallback);
            return lVar;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꂜ\u0001"));
        sb.append(this.isFallback);
        sb.append(ProtectedSandApp.s("ꂝ\u0001"));
        sb.append(this.connectionSpecs);
        sb.append(ProtectedSandApp.s("ꂞ\u0001"));
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        l0.m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        l0.o(arrays, ProtectedSandApp.s("ꂟ\u0001"));
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(@fg.l IOException e4) {
        l0.p(e4, ProtectedSandApp.s("ꂠ\u0001"));
        this.isFallback = true;
        return (!this.isFallbackPossible || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException) || ((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }
}
