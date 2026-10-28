package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: Interceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lokhttp3/x;", "", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f31569a;

    /* compiled from: Interceptor.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u000bH&J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u000bH&J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0015"}, d2 = {"Lokhttp3/x$a;", "", "Lokhttp3/e0;", "g", "request", "Lokhttp3/g0;", "e", "Lokhttp3/j;", "f", "Lokhttp3/e;", "call", "", "i", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "d", "b", "h", "c", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @d5.d
        a a(int timeout, @d5.d TimeUnit unit);

        int b();

        int c();

        @d5.d
        e call();

        @d5.d
        a d(int timeout, @d5.d TimeUnit unit);

        @d5.d
        g0 e(@d5.d e0 request) throws IOException;

        @d5.e
        j f();

        @d5.d
        e0 g();

        @d5.d
        a h(int timeout, @d5.d TimeUnit unit);

        int i();
    }

    /* compiled from: Interceptor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\n\u001a\u00020\t2#\b\u0004\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0086\nø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lokhttp3/x$b;", "", "Lkotlin/Function1;", "Lokhttp3/x$a;", "Lkotlin/r0;", "name", "chain", "Lokhttp3/g0;", "block", "Lokhttp3/x;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.x$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f31569a = new Companion();

        /* compiled from: Interceptor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/x$a;", "it", "Lokhttp3/g0;", "a", "(Lokhttp3/x$a;)Lokhttp3/g0;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.x$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q3.l f31570b;

            public a(q3.l lVar) {
                this.f31570b = lVar;
            }

            @Override // okhttp3.x
            @d5.d
            public final g0 a(@d5.d a aVar) {
                kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("銊"));
                return (g0) this.f31570b.N(aVar);
            }
        }

        private Companion() {
        }

        @d5.d
        public final x a(@d5.d q3.l<? super a, g0> lVar) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("枷"));
            return new a(lVar);
        }
    }

    @d5.d
    g0 a(@d5.d a chain) throws IOException;
}
