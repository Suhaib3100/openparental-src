package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.o;

/* compiled from: PushObserver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/http2/k;", "", "", "streamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/o;", "source", "byteCount", "d", "Lokhttp3/internal/http2/a;", "errorCode", "Lkotlin/m2;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final k f31246a = new Companion.C0480a();

    /* compiled from: PushObserver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/k$a;", "", "Lokhttp3/internal/http2/k;", "CANCEL", "Lokhttp3/internal/http2/k;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.k$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f31248a = null;

        /* compiled from: PushObserver.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http2/k$a$a;", "Lokhttp3/internal/http2/k;", "", "streamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/o;", "source", "byteCount", "d", "Lokhttp3/internal/http2/a;", "errorCode", "Lkotlin/m2;", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.k$a$a, reason: collision with other inner class name */
        private static final class C0480a implements k {
            @Override // okhttp3.internal.http2.k
            public boolean a(int streamId, @d5.d List<b> requestHeaders) {
                l0.p(requestHeaders, ProtectedSandApp.s("擦"));
                return true;
            }

            @Override // okhttp3.internal.http2.k
            public boolean b(int streamId, @d5.d List<b> responseHeaders, boolean last) {
                l0.p(responseHeaders, ProtectedSandApp.s("擧"));
                return true;
            }

            @Override // okhttp3.internal.http2.k
            public void c(int i5, @d5.d a aVar) {
                l0.p(aVar, ProtectedSandApp.s("擨"));
            }

            @Override // okhttp3.internal.http2.k
            public boolean d(int streamId, @d5.d o source, int byteCount, boolean last) throws IOException {
                l0.p(source, ProtectedSandApp.s("擩"));
                source.skip(byteCount);
                return true;
            }
        }

        private Companion() {
        }

        public Companion(w wVar) {
        }
    }

    boolean a(int streamId, @d5.d List<b> requestHeaders);

    boolean b(int streamId, @d5.d List<b> responseHeaders, boolean last);

    void c(int i5, @d5.d a aVar);

    boolean d(int streamId, @d5.d o source, int byteCount, boolean last) throws IOException;
}
