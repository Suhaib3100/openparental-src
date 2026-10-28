package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.b1;
import androidx.annotation.e1;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f15209c;

    /* renamed from: a, reason: collision with root package name */
    private final zzef f15210a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f15211b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
    public enum a {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
    public static class c {

        @o0
        public static final String A = ProtectedSandApp.s("ዦ");

        @o0
        public static final String B = ProtectedSandApp.s("ዧ");

        @o0
        public static final String C = ProtectedSandApp.s("የ");

        @o0
        public static final String D = ProtectedSandApp.s("ዩ");

        @o0
        public static final String E = ProtectedSandApp.s("ዪ");

        @o0
        public static final String F = ProtectedSandApp.s("ያ");

        @o0
        public static final String G = ProtectedSandApp.s("ዬ");

        @o0
        public static final String H = ProtectedSandApp.s("ይ");

        @o0
        public static final String I = ProtectedSandApp.s("ዮ");

        /* renamed from: a, reason: collision with root package name */
        @o0
        public static final String f15212a = ProtectedSandApp.s("ዯ");

        /* renamed from: b, reason: collision with root package name */
        @o0
        public static final String f15213b = ProtectedSandApp.s("ደ");

        /* renamed from: c, reason: collision with root package name */
        @o0
        public static final String f15214c = ProtectedSandApp.s("ዱ");

        /* renamed from: d, reason: collision with root package name */
        @o0
        public static final String f15215d = ProtectedSandApp.s("ዲ");

        /* renamed from: e, reason: collision with root package name */
        @o0
        public static final String f15216e = ProtectedSandApp.s("ዳ");

        /* renamed from: f, reason: collision with root package name */
        @o0
        public static final String f15217f = ProtectedSandApp.s("ዴ");

        /* renamed from: g, reason: collision with root package name */
        @o0
        public static final String f15218g = ProtectedSandApp.s("ድ");

        /* renamed from: h, reason: collision with root package name */
        @o0
        public static final String f15219h = ProtectedSandApp.s("ዶ");

        /* renamed from: i, reason: collision with root package name */
        @o0
        public static final String f15220i = ProtectedSandApp.s("ዷ");

        /* renamed from: j, reason: collision with root package name */
        @o0
        public static final String f15221j = ProtectedSandApp.s("ዸ");

        /* renamed from: k, reason: collision with root package name */
        @o0
        public static final String f15222k = ProtectedSandApp.s("ዹ");

        /* renamed from: l, reason: collision with root package name */
        @o0
        public static final String f15223l = ProtectedSandApp.s("ዺ");

        /* renamed from: m, reason: collision with root package name */
        @o0
        public static final String f15224m = ProtectedSandApp.s("ዻ");

        /* renamed from: n, reason: collision with root package name */
        @o0
        public static final String f15225n = ProtectedSandApp.s("ዼ");

        /* renamed from: o, reason: collision with root package name */
        @o0
        public static final String f15226o = ProtectedSandApp.s("ዽ");

        /* renamed from: p, reason: collision with root package name */
        @o0
        public static final String f15227p = ProtectedSandApp.s("ዾ");

        /* renamed from: q, reason: collision with root package name */
        @o0
        public static final String f15228q = ProtectedSandApp.s("ዿ");

        /* renamed from: r, reason: collision with root package name */
        @o0
        public static final String f15229r = ProtectedSandApp.s("ጀ");

        /* renamed from: s, reason: collision with root package name */
        @o0
        public static final String f15230s = ProtectedSandApp.s("ጁ");

        /* renamed from: t, reason: collision with root package name */
        @o0
        public static final String f15231t = ProtectedSandApp.s("ጂ");

        /* renamed from: u, reason: collision with root package name */
        @o0
        public static final String f15232u = ProtectedSandApp.s("ጃ");

        /* renamed from: v, reason: collision with root package name */
        @o0
        public static final String f15233v = ProtectedSandApp.s("ጄ");

        /* renamed from: w, reason: collision with root package name */
        @o0
        public static final String f15234w = ProtectedSandApp.s("ጅ");

        /* renamed from: x, reason: collision with root package name */
        @o0
        public static final String f15235x = ProtectedSandApp.s("ጆ");

        /* renamed from: y, reason: collision with root package name */
        @o0
        public static final String f15236y = ProtectedSandApp.s("ጇ");

        /* renamed from: z, reason: collision with root package name */
        @o0
        public static final String f15237z = ProtectedSandApp.s("ገ");

        protected c() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
    public static class d {

        /* renamed from: n0, reason: collision with root package name */
        @o0
        public static final String f15265n0 = ProtectedSandApp.s("ጉ");

        /* renamed from: j0, reason: collision with root package name */
        @o0
        public static final String f15257j0 = ProtectedSandApp.s("ጊ");

        /* renamed from: f0, reason: collision with root package name */
        @o0
        public static final String f15249f0 = ProtectedSandApp.s("ጋ");

        /* renamed from: b0, reason: collision with root package name */
        @o0
        public static final String f15241b0 = ProtectedSandApp.s("ጌ");

        /* renamed from: o0, reason: collision with root package name */
        @o0
        public static final String f15267o0 = ProtectedSandApp.s("ግ");

        /* renamed from: k0, reason: collision with root package name */
        @o0
        public static final String f15259k0 = ProtectedSandApp.s("ጎ");

        /* renamed from: g0, reason: collision with root package name */
        @o0
        public static final String f15251g0 = ProtectedSandApp.s("ጏ");

        /* renamed from: c0, reason: collision with root package name */
        @o0
        public static final String f15243c0 = ProtectedSandApp.s("ጐ");

        /* renamed from: p0, reason: collision with root package name */
        @o0
        public static final String f15269p0 = ProtectedSandApp.s("\u1311");

        @o0
        public static final String A = ProtectedSandApp.s("ጒ");

        @o0
        public static final String B = ProtectedSandApp.s("ጓ");

        @o0
        public static final String C = ProtectedSandApp.s("ጔ");

        @o0
        public static final String D = ProtectedSandApp.s("ጕ");

        /* renamed from: l0, reason: collision with root package name */
        @o0
        public static final String f15261l0 = ProtectedSandApp.s("\u1316");

        @o0
        public static final String E = ProtectedSandApp.s("\u1317");

        @o0
        public static final String F = ProtectedSandApp.s("ጘ");

        @o0
        public static final String G = ProtectedSandApp.s("ጙ");

        @o0
        public static final String H = ProtectedSandApp.s("ጚ");

        /* renamed from: h0, reason: collision with root package name */
        @o0
        public static final String f15253h0 = ProtectedSandApp.s("ጛ");

        @o0
        public static final String I = ProtectedSandApp.s("ጜ");

        @o0
        public static final String J = ProtectedSandApp.s("ጝ");

        @o0
        public static final String K = ProtectedSandApp.s("ጞ");

        @o0
        public static final String L = ProtectedSandApp.s("ጟ");

        /* renamed from: d0, reason: collision with root package name */
        @o0
        public static final String f15245d0 = ProtectedSandApp.s("ጠ");

        @o0
        public static final String M = ProtectedSandApp.s("ጡ");

        @o0
        public static final String N = ProtectedSandApp.s("ጢ");

        @o0
        public static final String O = ProtectedSandApp.s("ጣ");

        @o0
        public static final String P = ProtectedSandApp.s("ጤ");

        @o0
        public static final String Q = ProtectedSandApp.s("ጥ");

        @o0
        public static final String R = ProtectedSandApp.s("ጦ");

        @o0
        public static final String S = ProtectedSandApp.s("ጧ");

        @o0
        public static final String T = ProtectedSandApp.s("ጨ");

        @o0
        public static final String U = ProtectedSandApp.s("ጩ");

        @o0
        public static final String V = ProtectedSandApp.s("ጪ");

        @o0
        public static final String W = ProtectedSandApp.s("ጫ");

        @o0
        public static final String X = ProtectedSandApp.s("ጬ");

        @o0
        public static final String Y = ProtectedSandApp.s("ጭ");

        @o0
        public static final String Z = ProtectedSandApp.s("ጮ");

        /* renamed from: q0, reason: collision with root package name */
        @o0
        public static final String f15271q0 = ProtectedSandApp.s("ጯ");

        /* renamed from: a, reason: collision with root package name */
        @o0
        public static final String f15238a = ProtectedSandApp.s("ጰ");

        /* renamed from: b, reason: collision with root package name */
        @o0
        public static final String f15240b = ProtectedSandApp.s("ጱ");

        /* renamed from: c, reason: collision with root package name */
        @o0
        public static final String f15242c = ProtectedSandApp.s("ጲ");

        /* renamed from: m0, reason: collision with root package name */
        @o0
        public static final String f15263m0 = ProtectedSandApp.s("ጳ");

        /* renamed from: d, reason: collision with root package name */
        @o0
        public static final String f15244d = ProtectedSandApp.s("ጴ");

        /* renamed from: e, reason: collision with root package name */
        @o0
        public static final String f15246e = ProtectedSandApp.s("ጵ");

        /* renamed from: f, reason: collision with root package name */
        @o0
        public static final String f15248f = ProtectedSandApp.s("ጶ");

        /* renamed from: g, reason: collision with root package name */
        @o0
        public static final String f15250g = ProtectedSandApp.s("ጷ");

        /* renamed from: i0, reason: collision with root package name */
        @o0
        public static final String f15255i0 = ProtectedSandApp.s("ጸ");

        /* renamed from: h, reason: collision with root package name */
        @o0
        public static final String f15252h = ProtectedSandApp.s("ጹ");

        /* renamed from: i, reason: collision with root package name */
        @o0
        public static final String f15254i = ProtectedSandApp.s("ጺ");

        /* renamed from: j, reason: collision with root package name */
        @o0
        public static final String f15256j = ProtectedSandApp.s("ጻ");

        /* renamed from: e0, reason: collision with root package name */
        @o0
        public static final String f15247e0 = ProtectedSandApp.s("ጼ");

        /* renamed from: k, reason: collision with root package name */
        @o0
        public static final String f15258k = ProtectedSandApp.s("ጽ");

        /* renamed from: l, reason: collision with root package name */
        @o0
        public static final String f15260l = ProtectedSandApp.s("ጾ");

        /* renamed from: m, reason: collision with root package name */
        @o0
        public static final String f15262m = ProtectedSandApp.s("ጿ");

        /* renamed from: n, reason: collision with root package name */
        @o0
        public static final String f15264n = ProtectedSandApp.s("ፀ");

        /* renamed from: a0, reason: collision with root package name */
        @o0
        public static final String f15239a0 = ProtectedSandApp.s("ፁ");

        /* renamed from: o, reason: collision with root package name */
        @o0
        public static final String f15266o = ProtectedSandApp.s("ፂ");

        /* renamed from: p, reason: collision with root package name */
        @o0
        public static final String f15268p = ProtectedSandApp.s("ፃ");

        /* renamed from: q, reason: collision with root package name */
        @o0
        public static final String f15270q = ProtectedSandApp.s("ፄ");

        /* renamed from: r, reason: collision with root package name */
        @o0
        public static final String f15272r = ProtectedSandApp.s("ፅ");

        /* renamed from: s, reason: collision with root package name */
        @o0
        public static final String f15273s = ProtectedSandApp.s("ፆ");

        /* renamed from: t, reason: collision with root package name */
        @o0
        public static final String f15274t = ProtectedSandApp.s("ፇ");

        /* renamed from: u, reason: collision with root package name */
        @o0
        public static final String f15275u = ProtectedSandApp.s("ፈ");

        /* renamed from: v, reason: collision with root package name */
        @o0
        public static final String f15276v = ProtectedSandApp.s("ፉ");

        /* renamed from: w, reason: collision with root package name */
        @o0
        public static final String f15277w = ProtectedSandApp.s("ፊ");

        /* renamed from: x, reason: collision with root package name */
        @o0
        public static final String f15278x = ProtectedSandApp.s("ፋ");

        /* renamed from: y, reason: collision with root package name */
        @o0
        public static final String f15279y = ProtectedSandApp.s("ፌ");

        /* renamed from: z, reason: collision with root package name */
        @o0
        public static final String f15280z = ProtectedSandApp.s("ፍ");

        protected d() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.3.0 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public static final String f15281a = ProtectedSandApp.s("ፎ");

        /* renamed from: b, reason: collision with root package name */
        @o0
        public static final String f15282b = ProtectedSandApp.s("ፏ");

        protected e() {
        }
    }

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.f15210a = zzefVar;
    }

    @Keep
    @o0
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static FirebaseAnalytics getInstance(@o0 Context context) {
        if (f15209c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f15209c == null) {
                    f15209c = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return f15209c;
    }

    @q0
    @Keep
    public static zzil getScionFrontendApiImplementation(Context context, @q0 Bundle bundle) {
        zzef zzg = zzef.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new com.google.firebase.analytics.d(zzg);
    }

    @EnsuresNonNull({"this.executor"})
    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f15211b == null) {
                this.f15211b = new com.google.firebase.analytics.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f15211b;
        }
        return executorService;
    }

    @o0
    public Task<String> a() {
        try {
            return Tasks.call(l(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e6) {
            this.f15210a.zzB(5, ProtectedSandApp.s("ፐ"), null, null, null);
            return Tasks.forException(e6);
        }
    }

    @o0
    public Task<Long> b() {
        try {
            return Tasks.call(l(), new com.google.firebase.analytics.c(this));
        } catch (RuntimeException e6) {
            this.f15210a.zzB(5, ProtectedSandApp.s("ፑ"), null, null, null);
            return Tasks.forException(e6);
        }
    }

    public void c(@e1(max = 40, min = 1) @o0 String str, @q0 Bundle bundle) {
        this.f15210a.zzy(str, bundle);
    }

    public void d() {
        this.f15210a.zzD();
    }

    public void e(boolean z5) {
        this.f15210a.zzL(Boolean.valueOf(z5));
    }

    public void f(@o0 Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        String s5 = ProtectedSandApp.s("ፒ");
        String s6 = ProtectedSandApp.s("ፓ");
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            String s7 = ProtectedSandApp.s("ፔ");
            if (ordinal == 0) {
                bundle.putString(s7, s6);
            } else if (ordinal == 1) {
                bundle.putString(s7, s5);
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            String s8 = ProtectedSandApp.s("ፕ");
            if (ordinal2 == 0) {
                bundle.putString(s8, s6);
            } else if (ordinal2 == 1) {
                bundle.putString(s8, s5);
            }
        }
        this.f15210a.zzG(bundle);
    }

    public void g(@q0 Bundle bundle) {
        this.f15210a.zzJ(bundle);
    }

    @Keep
    @o0
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(j.u().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            throw new IllegalStateException(e6);
        } catch (ExecutionException e7) {
            throw new IllegalStateException(e7.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException(ProtectedSandApp.s("ፖ"));
        }
    }

    public void h(long j5) {
        this.f15210a.zzM(j5);
    }

    public void i(@q0 String str) {
        this.f15210a.zzN(str);
    }

    public void j(@e1(max = 24, min = 1) @o0 String str, @e1(max = 36) @q0 String str2) {
        this.f15210a.zzO(null, str, str2, false);
    }

    @Keep
    @l0
    @Deprecated
    public void setCurrentScreen(@o0 Activity activity, @e1(max = 36, min = 1) @q0 String str, @e1(max = 36, min = 1) @q0 String str2) {
        this.f15210a.zzH(activity, str, str2);
    }
}
