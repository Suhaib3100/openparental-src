package okhttp3.internal.platform.android;

import com.flashget.parentalcontrol.ProtectedSandApp;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: StandardAndroidSocketAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/platform/android/n;", "Lokhttp3/internal/platform/android/h;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "sslSocketFactory", "", "d", "(Ljavax/net/ssl/SSLSocketFactory;)Z", "Ljavax/net/ssl/X509TrustManager;", "c", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "h", "Ljava/lang/Class;", "i", "j", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class n extends h {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Class<?> paramClass;

    /* compiled from: StandardAndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/android/n$a;", "", "<init>", "()V", "", "packageName", "Lokhttp3/internal/platform/android/m;", "a", "(Ljava/lang/String;)Lokhttp3/internal/platform/android/m;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.n$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ m b(Companion companion, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = ProtectedSandApp.s("᷵");
            }
            return companion.a(str);
        }

        @fg.m
        public final m a(@fg.l String packageName) {
            l0.p(packageName, ProtectedSandApp.s("᷶"));
            try {
                Class<?> cls = Class.forName(packageName + ProtectedSandApp.s("᷷"));
                Class<?> cls2 = Class.forName(packageName + ProtectedSandApp.s("᷸"));
                Class<?> cls3 = Class.forName(packageName + ProtectedSandApp.s("᷹"));
                l0.o(cls3, ProtectedSandApp.s("᷺"));
                return new n(cls, cls2, cls3);
            } catch (Exception e4) {
                okhttp3.internal.platform.j.INSTANCE.getClass();
                okhttp3.internal.platform.j.f84863a.m(ProtectedSandApp.s("᷻"), 5, e4);
                return null;
            }
        }

        public Companion(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@fg.l Class<? super SSLSocket> cls, @fg.l Class<? super SSLSocketFactory> cls2, @fg.l Class<?> cls3) {
        super(cls);
        l0.p(cls, ProtectedSandApp.s("᷼"));
        l0.p(cls2, ProtectedSandApp.s("᷽"));
        l0.p(cls3, ProtectedSandApp.s("᷾"));
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    @Override // okhttp3.internal.platform.android.h, okhttp3.internal.platform.android.m
    @fg.m
    public X509TrustManager c(@fg.l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("᷿"));
        Object Q = okhttp3.internal.d.Q(sslSocketFactory, this.paramClass, ProtectedSandApp.s("Ḁ"));
        l0.m(Q);
        X509TrustManager x509TrustManager = (X509TrustManager) okhttp3.internal.d.Q(Q, X509TrustManager.class, ProtectedSandApp.s("ḁ"));
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) okhttp3.internal.d.Q(Q, X509TrustManager.class, ProtectedSandApp.s("Ḃ"));
    }

    @Override // okhttp3.internal.platform.android.h, okhttp3.internal.platform.android.m
    public boolean d(@fg.l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("᷿"));
        return this.sslSocketFactoryClass.isInstance(sslSocketFactory);
    }
}
