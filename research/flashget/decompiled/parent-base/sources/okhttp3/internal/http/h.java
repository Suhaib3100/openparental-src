package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.g0;
import okhttp3.x;
import okio.o;

/* compiled from: RealResponseBody.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http/h;", "Lokhttp3/g0;", "", "contentTypeString", "", "contentLength", "Lokio/o;", "source", "<init>", "(Ljava/lang/String;JLokio/o;)V", "g", "()J", "Lokhttp3/x;", "h", "()Lokhttp3/x;", "t", "()Lokio/o;", "d", "Ljava/lang/String;", "e", "J", "f", "Lokio/o;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class h extends g0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contentTypeString;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long contentLength;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o source;

    public h(@m String str, long j4, @l o oVar) {
        l0.p(oVar, ProtectedSandApp.s("["));
        this.contentTypeString = str;
        this.contentLength = j4;
        this.source = oVar;
    }

    @Override // okhttp3.g0
    /* renamed from: g, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.g0
    @m
    /* renamed from: h */
    public x getF84143e() {
        String str = this.contentTypeString;
        if (str != null) {
            return x.INSTANCE.d(str);
        }
        return null;
    }

    @Override // okhttp3.g0
    @l
    /* renamed from: t, reason: from getter */
    public o getSource() {
        return this.source;
    }
}
