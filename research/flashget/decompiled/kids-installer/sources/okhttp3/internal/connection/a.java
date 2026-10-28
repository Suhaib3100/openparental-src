package okhttp3.internal.connection;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.g0;
import okhttp3.x;

/* compiled from: ConnectInterceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/a;", "Lokhttp3/x;", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30829b = new a();

    private a() {
    }

    @Override // okhttp3.x
    @d5.d
    public g0 a(@d5.d x.a chain) throws IOException {
        l0.p(chain, ProtectedSandApp.s("憟"));
        okhttp3.internal.http.g gVar = (okhttp3.internal.http.g) chain;
        return okhttp3.internal.http.g.k(gVar, 0, gVar.getCall().v(gVar), null, 0, 0, 0, 61, null).e(gVar.p());
    }
}
