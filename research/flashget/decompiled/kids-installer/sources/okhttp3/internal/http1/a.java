package okhttp3.internal.http1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.v;
import okio.o;

/* compiled from: HeadersReader.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/a;", "", "", "c", "Lokhttp3/v;", "b", "", "a", "J", "headerLimit", "Lokio/o;", "Lokio/o;", "()Lokio/o;", "source", "<init>", "(Lokio/o;)V", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f30979c = 262144;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long headerLimit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final o source;

    public a(@d o oVar) {
        l0.p(oVar, ProtectedSandApp.s("捘"));
        this.source = oVar;
        this.headerLimit = 262144;
    }

    @d
    /* renamed from: a, reason: from getter */
    public final o getSource() {
        return this.source;
    }

    @d
    public final v b() {
        v.a aVar = new v.a();
        while (true) {
            String c6 = c();
            if (c6.length() == 0) {
                return aVar.i();
            }
            aVar.f(c6);
        }
    }

    @d
    public final String c() {
        String c02 = this.source.c0(this.headerLimit);
        this.headerLimit -= c02.length();
        return c02;
    }
}
