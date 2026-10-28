package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.h0;
import okhttp3.y;
import okio.o;

/* compiled from: RealResponseBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/http/h;", "Lokhttp3/h0;", "", "j", "Lokhttp3/y;", "k", "Lokio/o;", "B", "", "q", "Ljava/lang/String;", "contentTypeString", "r", "J", "contentLength", "s", "Lokio/o;", "source", "<init>", "(Ljava/lang/String;JLokio/o;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class h extends h0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final String contentTypeString;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long contentLength;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final o source;

    public h(@d5.e String str, long j5, @d5.d o oVar) {
        l0.p(oVar, ProtectedSandApp.s("挸"));
        this.contentTypeString = str;
        this.contentLength = j5;
        this.source = oVar;
    }

    @Override // okhttp3.h0
    @d5.d
    /* renamed from: B, reason: from getter */
    public o getSource() {
        return this.source;
    }

    @Override // okhttp3.h0
    /* renamed from: j, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.h0
    @d5.e
    /* renamed from: k */
    public y getF30637r() {
        String str = this.contentTypeString;
        if (str != null) {
            return y.INSTANCE.d(str);
        }
        return null;
    }
}
