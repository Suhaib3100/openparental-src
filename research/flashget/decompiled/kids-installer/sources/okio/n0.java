package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lokio/n0;", "Lokio/k;", "Ljava/io/IOException;", "cause", "x", "Lkotlin/m2;", "B", "Ljava/net/Socket;", "n", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
final class n0 extends k {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    public n0(@d5.d Socket socket) {
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("鍵"));
        this.socket = socket;
    }

    @Override // okio.k
    protected void B() {
        Logger logger;
        Logger logger2;
        String s5 = ProtectedSandApp.s("鍶");
        try {
            this.socket.close();
        } catch (AssertionError e6) {
            if (!b0.d(e6)) {
                throw e6;
            }
            logger2 = b0.f31602a;
            logger2.log(Level.WARNING, s5 + this.socket, (Throwable) e6);
        } catch (Exception e7) {
            logger = b0.f31602a;
            logger.log(Level.WARNING, s5 + this.socket, (Throwable) e7);
        }
    }

    @Override // okio.k
    @d5.d
    protected IOException x(@d5.e IOException cause) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProtectedSandApp.s("鍷"));
        if (cause != null) {
            socketTimeoutException.initCause(cause);
        }
        return socketTimeoutException;
    }
}
