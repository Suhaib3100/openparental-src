package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.p;

/* compiled from: RouteException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lkotlin/m2;", "a", "<set-?>", "o", "Ljava/io/IOException;", "c", "()Ljava/io/IOException;", "lastConnectException", "p", "b", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private IOException lastConnectException;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final IOException firstConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@d5.d IOException iOException) {
        super(iOException);
        l0.p(iOException, ProtectedSandApp.s("憝"));
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void a(@d5.d IOException iOException) {
        l0.p(iOException, ProtectedSandApp.s("憞"));
        p.a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @d5.d
    /* renamed from: c, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
