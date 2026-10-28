package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Authenticator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lokhttp3/b;", "", "Lokhttp3/i0;", "route", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "a", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b f30462a = new Companion.C0466a();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b f30463b = new s4.b(null, 1, null);

    /* compiled from: Authenticator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\t"}, d2 = {"Lokhttp3/b$a;", "", "Lokhttp3/b;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/b;", "NONE", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f30465a = null;

        /* compiled from: Authenticator.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/b$a$a;", "Lokhttp3/b;", "Lokhttp3/i0;", "route", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        private static final class C0466a implements b {
            @Override // okhttp3.b
            @d5.e
            public e0 a(@d5.e i0 route, @d5.d g0 response) {
                kotlin.jvm.internal.l0.p(response, ProtectedSandApp.s("廘"));
                return null;
            }
        }

        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @d5.e
    e0 a(@d5.e i0 route, @d5.d g0 response) throws IOException;
}
