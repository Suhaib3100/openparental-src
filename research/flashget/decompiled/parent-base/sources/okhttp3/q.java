package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Dns.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lokhttp3/q;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "b", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface q {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final q f85056a = new Companion.C1329a();

    /* compiled from: Dns.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/q$a;", "", "<init>", "()V", "Lokhttp3/q;", "SYSTEM", "Lokhttp3/q;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.q$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f85058a = null;

        /* compiled from: Dns.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/q$a$a;", "Lokhttp3/q;", "<init>", "()V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.q$a$a, reason: collision with other inner class name */
        private static final class C1329a implements q {
            @Override // okhttp3.q
            @fg.l
            public List<InetAddress> lookup(@fg.l String hostname) {
                l0.p(hostname, ProtectedSandApp.s("ꈁ\u0001"));
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    l0.o(allByName, ProtectedSandApp.s("ꈂ\u0001"));
                    return kotlin.collections.l.Ky(allByName);
                } catch (NullPointerException e4) {
                    UnknownHostException unknownHostException = new UnknownHostException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꈃ\u0001"), hostname));
                    unknownHostException.initCause(e4);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    List<InetAddress> lookup(@fg.l String hostname) throws UnknownHostException;
}
