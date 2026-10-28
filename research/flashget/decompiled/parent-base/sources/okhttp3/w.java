package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Interceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/w;", "", "Lokhttp3/w$a;", "chain", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f85111a;

    /* compiled from: Interceptor.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH&¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000fH&¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lokhttp3/w$a;", "", "Lokhttp3/d0;", "h", "()Lokhttp3/d0;", "request", "Lokhttp3/f0;", "c", "(Lokhttp3/d0;)Lokhttp3/f0;", "Lokhttp3/j;", "f", "()Lokhttp3/j;", "Lokhttp3/e;", "call", "()Lokhttp3/e;", "", "i", "()I", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "b", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/w$a;", "a", "g", "e", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        int a();

        @fg.l
        a b(int timeout, @fg.l TimeUnit unit);

        @fg.l
        f0 c(@fg.l d0 request) throws IOException;

        @fg.l
        e call();

        @fg.l
        a d(int timeout, @fg.l TimeUnit unit);

        int e();

        @fg.m
        j f();

        @fg.l
        a g(int timeout, @fg.l TimeUnit unit);

        @fg.l
        d0 h();

        int i();
    }

    /* compiled from: Interceptor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2#\b\u0004\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lokhttp3/w$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Lokhttp3/w$a;", "Lkotlin/r0;", "name", "chain", "Lokhttp3/f0;", "block", "Lokhttp3/w;", "a", "(Lld/l;)Lokhttp3/w;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.w$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f85111a = new Companion();

        /* compiled from: Interceptor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/w$a;", "it", "Lokhttp3/f0;", "intercept", "(Lokhttp3/w$a;)Lokhttp3/f0;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.w$b$a */
        public static final class a implements w {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l f85112b;

            public a(ld.l lVar) {
                this.f85112b = lVar;
            }

            @Override // okhttp3.w
            @fg.l
            public final f0 intercept(@fg.l a aVar) {
                l0.p(aVar, ProtectedSandApp.s("ꊤ\u0001"));
                return (f0) this.f85112b.invoke(aVar);
            }
        }

        private Companion() {
        }

        @fg.l
        public final w a(@fg.l ld.l<? super a, f0> block) {
            l0.p(block, ProtectedSandApp.s("ꊥ\u0001"));
            return new a(block);
        }
    }

    @fg.l
    f0 intercept(@fg.l a chain) throws IOException;
}
