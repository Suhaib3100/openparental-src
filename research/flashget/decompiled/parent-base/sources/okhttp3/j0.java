package okhttp3;

import kotlin.Metadata;

/* compiled from: WebSocket.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/j0;", "", "Lokhttp3/d0;", "h", "()Lokhttp3/d0;", "", "g", "()J", "", "text", "", "a", "(Ljava/lang/String;)Z", "Lokio/p;", "bytes", "c", "(Lokio/p;)Z", "", "code", "reason", "b", "(ILjava/lang/String;)Z", "Lkotlin/k2;", "cancel", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface j0 {

    /* compiled from: WebSocket.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/j0$a;", "", "Lokhttp3/d0;", "request", "Lokhttp3/k0;", "listener", "Lokhttp3/j0;", "c", "(Lokhttp3/d0;Lokhttp3/k0;)Lokhttp3/j0;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @fg.l
        j0 c(@fg.l d0 request, @fg.l k0 listener);
    }

    boolean a(@fg.l String text);

    boolean b(int code, @fg.m String reason);

    boolean c(@fg.l okio.p bytes);

    void cancel();

    long g();

    @fg.l
    /* renamed from: h */
    d0 getOriginalRequest();
}
