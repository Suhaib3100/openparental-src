package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokio/n0;", "Lokio/k;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "Ljava/io/IOException;", "cause", "x", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lkotlin/k2;", "B", "()V", "n", "Ljava/net/Socket;", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class n0 extends k {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    public n0(@fg.l Socket socket) {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("\u2001"));
        this.socket = socket;
    }

    @Override // okio.k
    protected void B() {
        Logger logger;
        Logger logger2;
        String s4 = ProtectedSandApp.s("\u2002");
        try {
            this.socket.close();
        } catch (AssertionError e4) {
            if (!b0.d(e4)) {
                throw e4;
            }
            logger2 = b0.f85158a;
            logger2.log(Level.WARNING, s4 + this.socket, (Throwable) e4);
        } catch (Exception e5) {
            logger = b0.f85158a;
            logger.log(Level.WARNING, s4 + this.socket, (Throwable) e5);
        }
    }

    @Override // okio.k
    @fg.l
    protected IOException x(@fg.m IOException cause) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProtectedSandApp.s("\u2003"));
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }
}
