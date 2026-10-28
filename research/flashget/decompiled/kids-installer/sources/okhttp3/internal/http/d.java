package okhttp3.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.v;
import okio.m0;
import okio.o0;

/* compiled from: ExchangeCodec.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\bH&R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http/d;", "", "Lokhttp3/e0;", "request", "", "contentLength", "Lokio/m0;", "h", "Lkotlin/m2;", "b", "e", "a", "", "expectContinue", "Lokhttp3/g0$a;", "d", "Lokhttp3/g0;", "response", "f", "Lokio/o0;", "c", "Lokhttp3/v;", "g", "cancel", "Lokhttp3/internal/connection/f;", "getConnection", "()Lokhttp3/internal/connection/f;", "connection", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f30951b;

    /* renamed from: b, reason: collision with root package name */
    public static final int f30949b = 100;

    /* compiled from: ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lokhttp3/internal/http/d$a;", "", "", "a", "I", "DISCARD_STREAM_TIMEOUT_MILLIS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f30951b = new Companion();

        private Companion() {
        }
    }

    void a() throws IOException;

    void b(@d5.d e0 e0Var) throws IOException;

    @d5.d
    o0 c(@d5.d g0 response) throws IOException;

    void cancel();

    @d5.e
    g0.a d(boolean expectContinue) throws IOException;

    void e() throws IOException;

    long f(@d5.d g0 response) throws IOException;

    @d5.d
    v g() throws IOException;

    @d5.d
    okhttp3.internal.connection.f getConnection();

    @d5.d
    m0 h(@d5.d e0 request, long contentLength) throws IOException;
}
