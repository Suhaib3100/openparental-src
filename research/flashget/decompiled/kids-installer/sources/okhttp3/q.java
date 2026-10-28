package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Dns.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0006J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lokhttp3/q;", "", "", "hostname", "", "Ljava/net/InetAddress;", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface q {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final q f31512a = new Companion.C0490a();

    /* compiled from: Dns.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/q$a;", "", "Lokhttp3/q;", "SYSTEM", "Lokhttp3/q;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.q$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f31514a = null;

        /* compiled from: Dns.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lokhttp3/q$a$a;", "Lokhttp3/q;", "", "hostname", "", "Ljava/net/InetAddress;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        private static final class C0490a implements q {
            @Override // okhttp3.q
            @d5.d
            public List<InetAddress> a(@d5.d String hostname) {
                List<InetAddress> Jy;
                kotlin.jvm.internal.l0.p(hostname, ProtectedSandApp.s("鉷"));
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.l0.o(allByName, ProtectedSandApp.s("鉸"));
                    Jy = kotlin.collections.t.Jy(allByName);
                    return Jy;
                } catch (NullPointerException e6) {
                    UnknownHostException unknownHostException = new UnknownHostException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("鉹"), hostname));
                    unknownHostException.initCause(e6);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @d5.d
    List<InetAddress> a(@d5.d String hostname) throws UnknownHostException;
}
