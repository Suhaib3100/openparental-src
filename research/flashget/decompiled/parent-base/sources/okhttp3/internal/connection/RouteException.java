package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.o;

/* compiled from: RouteException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "e", "Lkotlin/k2;", "a", "<set-?>", "b", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "lastConnectException", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private IOException lastConnectException;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final IOException firstConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@l IOException iOException) {
        super(iOException);
        l0.p(iOException, ProtectedSandApp.s("ꂗ\u0001"));
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void a(@l IOException e4) {
        l0.p(e4, ProtectedSandApp.s("ꂘ\u0001"));
        o.a(this.firstConnectException, e4);
        this.lastConnectException = e4;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
