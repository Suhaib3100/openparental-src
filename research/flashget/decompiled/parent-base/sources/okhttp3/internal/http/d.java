package okhttp3.internal.http;

import fg.l;
import fg.m;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.u;
import okio.m0;
import okio.o0;

/* compiled from: ExchangeCodec.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\rR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lokhttp3/internal/http/d;", "", "Lokhttp3/d0;", "request", "", "contentLength", "Lokio/m0;", "e", "(Lokhttp3/d0;J)Lokio/m0;", "Lkotlin/k2;", "f", "(Lokhttp3/d0;)V", "h", "()V", "a", "", "expectContinue", "Lokhttp3/f0$a;", "g", "(Z)Lokhttp3/f0$a;", "Lokhttp3/f0;", "response", "d", "(Lokhttp3/f0;)J", "Lokio/o0;", "b", "(Lokhttp3/f0;)Lokio/o0;", "Lokhttp3/u;", "i", "()Lokhttp3/u;", "cancel", "Lokhttp3/internal/connection/f;", "c", "()Lokhttp3/internal/connection/f;", "connection", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f84478b;

    /* renamed from: b, reason: collision with root package name */
    public static final int f84476b = 100;

    /* compiled from: ExchangeCodec.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lokhttp3/internal/http/d$a;", "", "<init>", "()V", "", "a", "I", "DISCARD_STREAM_TIMEOUT_MILLIS", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f84478b = new Companion();

        private Companion() {
        }
    }

    void a() throws IOException;

    @l
    o0 b(@l f0 response) throws IOException;

    @l
    /* renamed from: c */
    okhttp3.internal.connection.f getConnection();

    void cancel();

    long d(@l f0 response) throws IOException;

    @l
    m0 e(@l d0 request, long contentLength) throws IOException;

    void f(@l d0 request) throws IOException;

    @m
    f0.a g(boolean expectContinue) throws IOException;

    void h() throws IOException;

    @l
    u i() throws IOException;
}
