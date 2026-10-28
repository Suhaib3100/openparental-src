package okhttp3.internal.platform.android;

import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: StandardAndroidSocketAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B3\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000e0\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\b\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/n;", "Lokhttp3/internal/platform/android/h;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "d", "Ljavax/net/ssl/X509TrustManager;", "c", "Ljava/lang/Class;", "h", "Ljava/lang/Class;", "sslSocketFactoryClass", "i", "paramClass", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "j", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class n extends h {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Class<?> paramClass;

    /* compiled from: StandardAndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/android/n$a;", "", "", "packageName", "Lokhttp3/internal/platform/android/m;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.n$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ m b(Companion companion, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = ProtectedSandApp.s("數");
            }
            return companion.a(str);
        }

        @d5.e
        public final m a(@d5.d String packageName) {
            l0.p(packageName, ProtectedSandApp.s("敹"));
            try {
                Class<?> cls = Class.forName(packageName + ProtectedSandApp.s("敺"));
                Class<?> cls2 = Class.forName(packageName + ProtectedSandApp.s("敻"));
                Class<?> cls3 = Class.forName(packageName + ProtectedSandApp.s("敼"));
                l0.o(cls3, ProtectedSandApp.s("敽"));
                return new n(cls, cls2, cls3);
            } catch (Exception e6) {
                okhttp3.internal.platform.j.INSTANCE.getClass();
                okhttp3.internal.platform.j.f31323a.m(ProtectedSandApp.s("敾"), 5, e6);
                return null;
            }
        }

        public Companion(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@d5.d Class<? super SSLSocket> cls, @d5.d Class<? super SSLSocketFactory> cls2, @d5.d Class<?> cls3) {
        super(cls);
        l0.p(cls, ProtectedSandApp.s("釞"));
        l0.p(cls2, ProtectedSandApp.s("釟"));
        l0.p(cls3, ProtectedSandApp.s("釠"));
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    @Override // okhttp3.internal.platform.android.h, okhttp3.internal.platform.android.m
    @d5.e
    public X509TrustManager c(@d5.d SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("釡"));
        Object Q = okhttp3.internal.d.Q(sslSocketFactory, this.paramClass, ProtectedSandApp.s("釢"));
        l0.m(Q);
        X509TrustManager x509TrustManager = (X509TrustManager) okhttp3.internal.d.Q(Q, X509TrustManager.class, ProtectedSandApp.s("釣"));
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) okhttp3.internal.d.Q(Q, X509TrustManager.class, ProtectedSandApp.s("釤"));
    }

    @Override // okhttp3.internal.platform.android.h, okhttp3.internal.platform.android.m
    public boolean d(@d5.d SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, ProtectedSandApp.s("釥"));
        return this.sslSocketFactoryClass.isInstance(sslSocketFactory);
    }
}
