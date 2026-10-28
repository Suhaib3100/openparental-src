package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WebSocketListener.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lokhttp3/k0;", "", "<init>", "()V", "Lokhttp3/j0;", "webSocket", "Lokhttp3/f0;", "response", "Lkotlin/k2;", "j", "(Lokhttp3/j0;Lokhttp3/f0;)V", "", "text", "h", "(Lokhttp3/j0;Ljava/lang/String;)V", "Lokio/p;", "bytes", "i", "(Lokhttp3/j0;Lokio/p;)V", "", "code", "reason", "f", "(Lokhttp3/j0;ILjava/lang/String;)V", "e", "", "t", "g", "(Lokhttp3/j0;Ljava/lang/Throwable;Lokhttp3/f0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class k0 {
    public void e(@fg.l j0 webSocket, int code, @fg.l String reason) {
        l0.p(webSocket, ProtectedSandApp.s("ꆞ\u0001"));
        l0.p(reason, ProtectedSandApp.s("ꆟ\u0001"));
    }

    public void f(@fg.l j0 webSocket, int code, @fg.l String reason) {
        l0.p(webSocket, ProtectedSandApp.s("ꆞ\u0001"));
        l0.p(reason, ProtectedSandApp.s("ꆟ\u0001"));
    }

    public void g(@fg.l j0 webSocket, @fg.l Throwable t4, @fg.m f0 response) {
        l0.p(webSocket, ProtectedSandApp.s("ꆞ\u0001"));
        l0.p(t4, ProtectedSandApp.s("ꆠ\u0001"));
    }

    public void h(@fg.l j0 webSocket, @fg.l String text) {
        l0.p(webSocket, ProtectedSandApp.s("ꆞ\u0001"));
        l0.p(text, ProtectedSandApp.s("ꆡ\u0001"));
    }

    public void i(@fg.l j0 webSocket, @fg.l okio.p bytes) {
        l0.p(webSocket, ProtectedSandApp.s("ꆞ\u0001"));
        l0.p(bytes, ProtectedSandApp.s("ꆢ\u0001"));
    }

    public void j(@fg.l j0 webSocket, @fg.l f0 response) {
        l0.p(webSocket, ProtectedSandApp.s("ꆞ\u0001"));
        l0.p(response, ProtectedSandApp.s("ꆣ\u0001"));
    }
}
