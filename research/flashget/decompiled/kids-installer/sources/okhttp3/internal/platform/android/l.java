package okhttp3.internal.platform.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okhttp3.d0;
import okhttp3.internal.platform.android.m;

/* compiled from: DeferredSocketAdapter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/platform/android/l;", "Lokhttp3/internal/platform/android/m;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "f", "", "isSupported", "a", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "e", "b", "Lokhttp3/internal/platform/android/m;", "delegate", "Lokhttp3/internal/platform/android/l$a;", "Lokhttp3/internal/platform/android/l$a;", "socketAdapterFactory", "<init>", "(Lokhttp3/internal/platform/android/l$a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private m delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a socketAdapterFactory;

    /* compiled from: DeferredSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/android/l$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lokhttp3/internal/platform/android/m;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        boolean a(@d5.d SSLSocket sslSocket);

        @d5.d
        m b(@d5.d SSLSocket sslSocket);
    }

    public l(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("敯"));
        this.socketAdapterFactory = aVar;
    }

    private final synchronized m f(SSLSocket sslSocket) {
        if (this.delegate == null && this.socketAdapterFactory.a(sslSocket)) {
            this.delegate = this.socketAdapterFactory.b(sslSocket);
        }
        return this.delegate;
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean a(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("数"));
        return this.socketAdapterFactory.a(sslSocket);
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public String b(@d5.d SSLSocket sslSocket) {
        l0.p(sslSocket, ProtectedSandApp.s("敱"));
        m f6 = f(sslSocket);
        if (f6 != null) {
            return f6.b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.m
    @d5.e
    public X509TrustManager c(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("敲"));
        return m.a.b(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean d(@d5.d SSLSocketFactory sSLSocketFactory) {
        l0.p(sSLSocketFactory, ProtectedSandApp.s("敳"));
        return m.a.a(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.m
    public void e(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list) {
        l0.p(sSLSocket, ProtectedSandApp.s("整"));
        l0.p(list, ProtectedSandApp.s("敵"));
        m f6 = f(sSLSocket);
        if (f6 != null) {
            f6.e(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.android.m
    public boolean isSupported() {
        return true;
    }
}
