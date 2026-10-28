package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import okio.q0;

/* compiled from: Call.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0000H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/e;", "", "Lokhttp3/d0;", "h", "()Lokhttp3/d0;", "Lokhttp3/f0;", "j", "()Lokhttp3/f0;", "Lokhttp3/f;", "responseCallback", "Lkotlin/k2;", "n2", "(Lokhttp3/f;)V", "cancel", "()V", "", "x", "()Z", "L", "Lokio/q0;", "timeout", "()Lokio/q0;", "clone", "()Lokhttp3/e;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface e extends Cloneable {

    /* compiled from: Call.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/e$a;", "", "Lokhttp3/d0;", "request", "Lokhttp3/e;", "b", "(Lokhttp3/d0;)Lokhttp3/e;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @fg.l
        e b(@fg.l d0 request);
    }

    boolean L();

    void cancel();

    @fg.l
    /* renamed from: clone */
    e mo22clone();

    @fg.l
    d0 h();

    @fg.l
    f0 j() throws IOException;

    void n2(@fg.l f responseCallback);

    @fg.l
    q0 timeout();

    boolean x();
}
