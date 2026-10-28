package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: StreamResetException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "Lokhttp3/internal/http2/a;", "errorCode", "<init>", "(Lokhttp3/internal/http2/a;)V", "b", "Lokhttp3/internal/http2/a;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class StreamResetException extends IOException {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final a errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@fg.l a aVar) {
        super(ProtectedSandApp.s("᱐") + aVar);
        l0.p(aVar, ProtectedSandApp.s("ᱏ"));
        this.errorCode = aVar;
    }
}
