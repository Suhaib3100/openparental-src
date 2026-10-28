package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.o;

/* compiled from: PushObserver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\u0016J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/http2/k;", "", "", "streamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "", "b", "(ILjava/util/List;)Z", "responseHeaders", "last", "c", "(ILjava/util/List;Z)Z", "Lokio/o;", "source", "byteCount", "d", "(ILokio/o;IZ)Z", "Lokhttp3/internal/http2/a;", "errorCode", "Lkotlin/k2;", "a", "(ILokhttp3/internal/http2/a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final k f84786a = new Companion.C1319a();

    /* compiled from: PushObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/k$a;", "", "<init>", "()V", "Lokhttp3/internal/http2/k;", "CANCEL", "Lokhttp3/internal/http2/k;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.k$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f84788a = null;

        /* compiled from: PushObserver.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/k$a$a;", "Lokhttp3/internal/http2/k;", "<init>", "()V", "", "streamId", "", "Lokhttp3/internal/http2/b;", "requestHeaders", "", "b", "(ILjava/util/List;)Z", "responseHeaders", "last", "c", "(ILjava/util/List;Z)Z", "Lokio/o;", "source", "byteCount", "d", "(ILokio/o;IZ)Z", "Lokhttp3/internal/http2/a;", "errorCode", "Lkotlin/k2;", "a", "(ILokhttp3/internal/http2/a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.internal.http2.k$a$a, reason: collision with other inner class name */
        private static final class C1319a implements k {
            @Override // okhttp3.internal.http2.k
            public void a(int streamId, @fg.l a errorCode) {
                l0.p(errorCode, ProtectedSandApp.s("ᶄ"));
            }

            @Override // okhttp3.internal.http2.k
            public boolean b(int streamId, @fg.l List<b> requestHeaders) {
                l0.p(requestHeaders, ProtectedSandApp.s("ᶅ"));
                return true;
            }

            @Override // okhttp3.internal.http2.k
            public boolean c(int streamId, @fg.l List<b> responseHeaders, boolean last) {
                l0.p(responseHeaders, ProtectedSandApp.s("ᶆ"));
                return true;
            }

            @Override // okhttp3.internal.http2.k
            public boolean d(int streamId, @fg.l o source, int byteCount, boolean last) throws IOException {
                l0.p(source, ProtectedSandApp.s("ᶇ"));
                source.skip(byteCount);
                return true;
            }
        }

        private Companion() {
        }

        public Companion(w wVar) {
        }
    }

    void a(int streamId, @fg.l a errorCode);

    boolean b(int streamId, @fg.l List<b> requestHeaders);

    boolean c(int streamId, @fg.l List<b> responseHeaders, boolean last);

    boolean d(int streamId, @fg.l o source, int byteCount, boolean last) throws IOException;
}
