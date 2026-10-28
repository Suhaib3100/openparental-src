package okhttp3.internal.connection;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.f0;
import okhttp3.w;

/* compiled from: ConnectInterceptor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/a;", "Lokhttp3/w;", "<init>", "()V", "Lokhttp3/w$a;", "chain", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class a implements w {

    /* renamed from: b, reason: collision with root package name */
    public static final a f84350b = new a();

    private a() {
    }

    @Override // okhttp3.w
    @l
    public f0 intercept(@l w.a chain) throws IOException {
        l0.p(chain, ProtectedSandApp.s("ꂙ\u0001"));
        okhttp3.internal.http.g gVar = (okhttp3.internal.http.g) chain;
        return okhttp3.internal.http.g.k(gVar, 0, gVar.getCall().u(gVar), null, 0, 0, 0, 61, null).c(gVar.p());
    }
}
