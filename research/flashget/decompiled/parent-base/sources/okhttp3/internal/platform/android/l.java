package okhttp3.internal.platform.android;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.c0;
import okhttp3.internal.platform.android.m;

/* compiled from: DeferredSocketAdapter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/platform/android/l;", "Lokhttp3/internal/platform/android/m;", "Lokhttp3/internal/platform/android/l$a;", "socketAdapterFactory", "<init>", "(Lokhttp3/internal/platform/android/l$a;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "f", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/m;", "", "isSupported", "()Z", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/c0;", "protocols", "Lkotlin/k2;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Lokhttp3/internal/platform/android/m;", "delegate", "Lokhttp3/internal/platform/android/l$a;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private m delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a socketAdapterFactory;

    /* compiled from: DeferredSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/platform/android/l$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lokhttp3/internal/platform/android/m;", "b", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/m;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        boolean a(@fg.l SSLSocket sslSocket);

        @fg.l
        m b(@fg.l SSLSocket sslSocket);
    }

    public l(@fg.l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("ᷰ"));
        this.socketAdapterFactory = aVar;
    }

    private final synchronized m f(SSLSocket sslSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.a(sslSocket)) {
                this.delegate = this.socketAdapterFactory.b(sslSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.delegate;
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@fg.l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷱ"));
        return this.socketAdapterFactory.a(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public String b(@fg.l SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷱ"));
        m f4 = f(sslSocket);
        if (f4 != null) {
            return f4.b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.m
    @fg.m
    public X509TrustManager c(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᷲ"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@fg.l SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("ᷲ"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public void e(@fg.l SSLSocket sslSocket, @fg.m String hostname, @fg.l List<? extends c0> protocols) {
        l0.p(sslSocket, ProtectedSandApp.s("ᷱ"));
        l0.p(protocols, ProtectedSandApp.s("ᷳ"));
        m f4 = f(sslSocket);
        if (f4 != null) {
            f4.e(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        return true;
    }
}
