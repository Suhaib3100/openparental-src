package okhttp3.internal.http1;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.u;
import okio.o;

/* compiled from: HeadersReader.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/a;", "", "Lokio/o;", "source", "<init>", "(Lokio/o;)V", "", "c", "()Ljava/lang/String;", "Lokhttp3/u;", "b", "()Lokhttp3/u;", "", "a", "J", "headerLimit", "Lokio/o;", "()Lokio/o;", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f84506c = 262144;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long headerLimit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final o source;

    public a(@l o oVar) {
        l0.p(oVar, ProtectedSandApp.s("{"));
        this.source = oVar;
        this.headerLimit = 262144;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final o getSource() {
        return this.source;
    }

    @l
    public final u b() {
        u.a aVar = new u.a();
        while (true) {
            String c5 = c();
            if (c5.length() == 0) {
                return aVar.i();
            }
            aVar.f(c5);
        }
    }

    @l
    public final String c() {
        String D0 = this.source.D0(this.headerLimit);
        this.headerLimit -= D0.length();
        return D0;
    }
}
