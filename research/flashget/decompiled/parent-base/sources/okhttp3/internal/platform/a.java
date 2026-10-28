package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.c0;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;

/* compiled from: Android10Platform.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006!"}, d2 = {"Lokhttp3/internal/platform/a;", "Lokhttp3/internal/platform/j;", "<init>", "()V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/c0;", "protocols", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "j", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "l", "(Ljava/lang/String;)Z", "trustManager", "Lue/c;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lue/c;", "Lokhttp3/internal/platform/android/m;", "Ljava/util/List;", "socketAdapters", "h", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
@okhttp3.internal.c
/* loaded from: classes3.dex */
public final class a extends j {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f84803g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<m> socketAdapters;

    /* compiled from: Android10Platform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/platform/a$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/j;", "a", "()Lokhttp3/internal/platform/j;", "", "isSupported", "Z", "b", "()Z", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        public final j a() {
            if (a.f84803g) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f84803g;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        f84803g = j.INSTANCE.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        m a5 = okhttp3.internal.platform.android.c.INSTANCE.a();
        okhttp3.internal.platform.android.h.INSTANCE.getClass();
        l lVar = new l(okhttp3.internal.platform.android.h.f84815f);
        k.INSTANCE.getClass();
        l lVar2 = new l(k.f84829a);
        okhttp3.internal.platform.android.i.INSTANCE.getClass();
        List Q = kotlin.collections.w.Q(a5, lVar, lVar2, new l(okhttp3.internal.platform.android.i.f84823a));
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // okhttp3.internal.platform.j
    @fg.l
    public ue.c d(@fg.l X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("ᶫ"));
        okhttp3.internal.platform.android.d a5 = okhttp3.internal.platform.android.d.INSTANCE.a(trustManager);
        return a5 != null ? a5 : super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.j
    public void f(@fg.l SSLSocket sslSocket, @fg.m String hostname, @fg.l List<? extends c0> protocols) {
        Object obj;
        l0.p(sslSocket, ProtectedSandApp.s("ᶬ"));
        l0.p(protocols, ProtectedSandApp.s("ᶭ"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.e(sslSocket, hostname, protocols);
        }
    }

    @Override // okhttp3.internal.platform.j
    @fg.m
    public String j(@fg.l SSLSocket sslSocket) {
        Object obj;
        l0.p(sslSocket, ProtectedSandApp.s("ᶬ"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).a(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.j
    @SuppressLint({"NewApi"})
    public boolean l(@fg.l String hostname) {
        l0.p(hostname, ProtectedSandApp.s("ᶮ"));
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.j
    @fg.m
    public X509TrustManager s(@fg.l SSLSocketFactory sslSocketFactory) {
        Object obj;
        l0.p(sslSocketFactory, ProtectedSandApp.s("ᶯ"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).d(sslSocketFactory)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            return mVar.c(sslSocketFactory);
        }
        return null;
    }
}
