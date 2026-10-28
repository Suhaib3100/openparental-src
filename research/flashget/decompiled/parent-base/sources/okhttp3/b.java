package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Authenticator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lokhttp3/b;", "", "Lokhttp3/h0;", "route", "Lokhttp3/f0;", "response", "Lokhttp3/d0;", "a", "(Lokhttp3/h0;Lokhttp3/f0;)Lokhttp3/d0;", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final b f83958a = new Companion.C1305a();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final b f83959b = new se.b(null, 1, 0 == true ? 1 : 0);

    /* compiled from: Authenticator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\t"}, d2 = {"Lokhttp3/b$a;", "", "<init>", "()V", "Lokhttp3/b;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/b;", "NONE", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f83961a = null;

        /* compiled from: Authenticator.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/b$a$a;", "Lokhttp3/b;", "<init>", "()V", "Lokhttp3/h0;", "route", "Lokhttp3/f0;", "response", "Lokhttp3/d0;", "a", "(Lokhttp3/h0;Lokhttp3/f0;)Lokhttp3/d0;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        private static final class C1305a implements b {
            @Override // okhttp3.b
            @fg.m
            public d0 a(@fg.m h0 route, @fg.l f0 response) {
                l0.p(response, ProtectedSandApp.s("鸰\u0001"));
                return null;
            }
        }

        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.m
    d0 a(@fg.m h0 route, @fg.l f0 response) throws IOException;
}
