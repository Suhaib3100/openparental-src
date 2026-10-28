package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.d0;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.android.m;

/* compiled from: Android10Platform.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0017J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/platform/a;", "Lokhttp3/internal/platform/j;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/m2;", "f", "j", "", "l", "trustManager", "Lu4/c;", "d", "Lokhttp3/internal/platform/android/m;", "Ljava/util/List;", "socketAdapters", "<init>", "()V", "h", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
@okhttp3.internal.c
/* loaded from: classes5.dex */
public final class a extends j {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f31263g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<m> socketAdapters;

    /* compiled from: Android10Platform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/platform/a$a;", "", "Lokhttp3/internal/platform/j;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.e
        public final j a() {
            if (a.f31263g) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f31263g;
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        f31263g = j.INSTANCE.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List Q;
        okhttp3.internal.platform.android.h.INSTANCE.getClass();
        k.INSTANCE.getClass();
        okhttp3.internal.platform.android.i.INSTANCE.getClass();
        Q = a0.Q(okhttp3.internal.platform.android.c.INSTANCE.a(), new l(okhttp3.internal.platform.android.h.f31275f), new l(k.f31289a), new l(okhttp3.internal.platform.android.i.f31283a));
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q) {
            if (((m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // okhttp3.internal.platform.j
    @d5.d
    public u4.c d(@d5.d X509TrustManager trustManager) {
        l0.p(trustManager, ProtectedSandApp.s("攚"));
        okhttp3.internal.platform.android.d a6 = okhttp3.internal.platform.android.d.INSTANCE.a(trustManager);
        return a6 != null ? a6 : super.d(trustManager);
    }

    @Override // okhttp3.internal.platform.j
    public void f(@d5.d SSLSocket sSLSocket, @d5.e String str, @d5.d List<? extends d0> list) {
        Object obj;
        l0.p(sSLSocket, ProtectedSandApp.s("攛"));
        l0.p(list, ProtectedSandApp.s("攜"));
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.e(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public String j(@d5.d SSLSocket sslSocket) {
        Object obj;
        l0.p(sslSocket, ProtectedSandApp.s("攝"));
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
    public boolean l(@d5.d String hostname) {
        l0.p(hostname, ProtectedSandApp.s("攞"));
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.j
    @d5.e
    public X509TrustManager s(@d5.d SSLSocketFactory sslSocketFactory) {
        Object obj;
        l0.p(sslSocketFactory, ProtectedSandApp.s("攟"));
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
