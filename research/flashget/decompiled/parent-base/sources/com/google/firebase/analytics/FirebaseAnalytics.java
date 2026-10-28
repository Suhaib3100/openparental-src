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
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.j;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes6.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f58283c;

    /* renamed from: a, reason: collision with root package name */
    private final zzdy f58284a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f58285b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
    public enum a {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
    public static class c {

        @o0
        public static final String A = ProtectedSandApp.s("瞧");

        @o0
        public static final String B = ProtectedSandApp.s("爵");

        @o0
        public static final String C = ProtectedSandApp.s("犯");

        @o0
        public static final String D = ProtectedSandApp.s("猪");

        @o0
        public static final String E = ProtectedSandApp.s("瑱");

        @o0
        public static final String F = ProtectedSandApp.s("甆");

        @o0
        public static final String G = ProtectedSandApp.s("画");

        @o0
        public static final String H = ProtectedSandApp.s("瘝");

        @o0
        public static final String I = ProtectedSandApp.s("瘟");

        /* renamed from: a, reason: collision with root package name */
        @o0
        public static final String f58286a = ProtectedSandApp.s("益");

        /* renamed from: b, reason: collision with root package name */
        @o0
        public static final String f58287b = ProtectedSandApp.s("盛");

        /* renamed from: c, reason: collision with root package name */
        @o0
        public static final String f58288c = ProtectedSandApp.s("直");

        /* renamed from: d, reason: collision with root package name */
        @o0
        public static final String f58289d = ProtectedSandApp.s("睊");

        /* renamed from: e, reason: collision with root package name */
        @o0
        public static final String f58290e = ProtectedSandApp.s("着");

        /* renamed from: f, reason: collision with root package name */
        @o0
        public static final String f58291f = ProtectedSandApp.s("磌");

        /* renamed from: g, reason: collision with root package name */
        @o0
        public static final String f58292g = ProtectedSandApp.s("窱");

        /* renamed from: h, reason: collision with root package name */
        @o0
        public static final String f58293h = ProtectedSandApp.s("節");

        /* renamed from: i, reason: collision with root package name */
        @o0
        public static final String f58294i = ProtectedSandApp.s("类");

        /* renamed from: j, reason: collision with root package name */
        @o0
        public static final String f58295j = ProtectedSandApp.s("絛");

        /* renamed from: k, reason: collision with root package name */
        @o0
        public static final String f58296k = ProtectedSandApp.s("練");

        /* renamed from: l, reason: collision with root package name */
        @o0
        public static final String f58297l = ProtectedSandApp.s("缾");

        /* renamed from: m, reason: collision with root package name */
        @o0
        public static final String f58298m = ProtectedSandApp.s("者");

        /* renamed from: n, reason: collision with root package name */
        @o0
        public static final String f58299n = ProtectedSandApp.s("荒");

        /* renamed from: o, reason: collision with root package name */
        @o0
        public static final String f58300o = ProtectedSandApp.s("華");

        /* renamed from: p, reason: collision with root package name */
        @o0
        public static final String f58301p = ProtectedSandApp.s("蝹");

        /* renamed from: q, reason: collision with root package name */
        @o0
        public static final String f58302q = ProtectedSandApp.s("襁");

        /* renamed from: r, reason: collision with root package name */
        @o0
        public static final String f58303r = ProtectedSandApp.s("覆");

        /* renamed from: s, reason: collision with root package name */
        @o0
        public static final String f58304s = ProtectedSandApp.s("視");

        /* renamed from: t, reason: collision with root package name */
        @o0
        public static final String f58305t = ProtectedSandApp.s("調");

        /* renamed from: u, reason: collision with root package name */
        @o0
        public static final String f58306u = ProtectedSandApp.s("諸");

        /* renamed from: v, reason: collision with root package name */
        @o0
        public static final String f58307v = ProtectedSandApp.s("請");

        /* renamed from: w, reason: collision with root package name */
        @o0
        public static final String f58308w = ProtectedSandApp.s("謁");

        /* renamed from: x, reason: collision with root package name */
        @o0
        public static final String f58309x = ProtectedSandApp.s("諾");

        /* renamed from: y, reason: collision with root package name */
        @o0
        public static final String f58310y = ProtectedSandApp.s("諭");

        /* renamed from: z, reason: collision with root package name */
        @o0
        public static final String f58311z = ProtectedSandApp.s("謹");

        protected c() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
    public static class d {

        /* renamed from: n0, reason: collision with root package name */
        @o0
        public static final String f58339n0 = ProtectedSandApp.s("變");

        /* renamed from: j0, reason: collision with root package name */
        @o0
        public static final String f58331j0 = ProtectedSandApp.s("贈");

        /* renamed from: f0, reason: collision with root package name */
        @o0
        public static final String f58323f0 = ProtectedSandApp.s("輸");

        /* renamed from: b0, reason: collision with root package name */
        @o0
        public static final String f58315b0 = ProtectedSandApp.s("遲");

        /* renamed from: o0, reason: collision with root package name */
        @o0
        public static final String f58341o0 = ProtectedSandApp.s("醙");

        /* renamed from: k0, reason: collision with root package name */
        @o0
        public static final String f58333k0 = ProtectedSandApp.s("鉶");

        /* renamed from: g0, reason: collision with root package name */
        @o0
        public static final String f58325g0 = ProtectedSandApp.s("陼");

        /* renamed from: c0, reason: collision with root package name */
        @o0
        public static final String f58317c0 = ProtectedSandApp.s("難");

        /* renamed from: p0, reason: collision with root package name */
        @o0
        public static final String f58343p0 = ProtectedSandApp.s("靖");

        @o0
        public static final String A = ProtectedSandApp.s("韛");

        @o0
        public static final String B = ProtectedSandApp.s("響");

        @o0
        public static final String C = ProtectedSandApp.s("頋");

        @o0
        public static final String D = ProtectedSandApp.s("頻");

        /* renamed from: l0, reason: collision with root package name */
        @o0
        public static final String f58335l0 = ProtectedSandApp.s("鬒");

        @o0
        public static final String E = ProtectedSandApp.s("龜");

        @o0
        public static final String F = ProtectedSandApp.s("𢡊");

        @o0
        public static final String G = ProtectedSandApp.s("𢡄");

        @o0
        public static final String H = ProtectedSandApp.s("𣏕");

        /* renamed from: h0, reason: collision with root package name */
        @o0
        public static final String f58327h0 = ProtectedSandApp.s("㮝");

        @o0
        public static final String I = ProtectedSandApp.s("䀘");

        @o0
        public static final String J = ProtectedSandApp.s("䀹");

        @o0
        public static final String K = ProtectedSandApp.s("𥉉");

        @o0
        public static final String L = ProtectedSandApp.s("𥳐");

        /* renamed from: d0, reason: collision with root package name */
        @o0
        public static final String f58319d0 = ProtectedSandApp.s("𧻓");

        @o0
        public static final String M = ProtectedSandApp.s("齃");

        @o0
        public static final String N = ProtectedSandApp.s("龎");

        @o0
        public static final String O = ProtectedSandApp.s("\ufada");

        @o0
        public static final String P = ProtectedSandApp.s("\ufadb");

        @o0
        public static final String Q = ProtectedSandApp.s("\ufadc");

        @o0
        public static final String R = ProtectedSandApp.s("\ufadd");

        @o0
        public static final String S = ProtectedSandApp.s("\ufade");

        @o0
        public static final String T = ProtectedSandApp.s("\ufadf");

        @o0
        public static final String U = ProtectedSandApp.s("\ufae0");

        @o0
        public static final String V = ProtectedSandApp.s("\ufae1");

        @o0
        public static final String W = ProtectedSandApp.s("\ufae2");

        @o0
        public static final String X = ProtectedSandApp.s("\ufae3");

        @o0
        public static final String Y = ProtectedSandApp.s("\ufae4");

        @o0
        public static final String Z = ProtectedSandApp.s("\ufae5");

        /* renamed from: q0, reason: collision with root package name */
        @o0
        public static final String f58345q0 = ProtectedSandApp.s("\ufae6");

        /* renamed from: a, reason: collision with root package name */
        @o0
        public static final String f58312a = ProtectedSandApp.s("\ufae7");

        /* renamed from: b, reason: collision with root package name */
        @o0
        public static final String f58314b = ProtectedSandApp.s("\ufae8");

        /* renamed from: c, reason: collision with root package name */
        @o0
        public static final String f58316c = ProtectedSandApp.s("\ufae9");

        /* renamed from: m0, reason: collision with root package name */
        @o0
        public static final String f58337m0 = ProtectedSandApp.s("\ufaea");

        /* renamed from: d, reason: collision with root package name */
        @o0
        public static final String f58318d = ProtectedSandApp.s("\ufaeb");

        /* renamed from: e, reason: collision with root package name */
        @o0
        public static final String f58320e = ProtectedSandApp.s("\ufaec");

        /* renamed from: f, reason: collision with root package name */
        @o0
        public static final String f58322f = ProtectedSandApp.s("\ufaed");

        /* renamed from: g, reason: collision with root package name */
        @o0
        public static final String f58324g = ProtectedSandApp.s("\ufaee");

        /* renamed from: i0, reason: collision with root package name */
        @o0
        public static final String f58329i0 = ProtectedSandApp.s("\ufaef");

        /* renamed from: h, reason: collision with root package name */
        @o0
        public static final String f58326h = ProtectedSandApp.s("\ufaf0");

        /* renamed from: i, reason: collision with root package name */
        @o0
        public static final String f58328i = ProtectedSandApp.s("\ufaf1");

        /* renamed from: j, reason: collision with root package name */
        @o0
        public static final String f58330j = ProtectedSandApp.s("\ufaf2");

        /* renamed from: e0, reason: collision with root package name */
        @o0
        public static final String f58321e0 = ProtectedSandApp.s("\ufaf3");

        /* renamed from: k, reason: collision with root package name */
        @o0
        public static final String f58332k = ProtectedSandApp.s("\ufaf4");

        /* renamed from: l, reason: collision with root package name */
        @o0
        public static final String f58334l = ProtectedSandApp.s("\ufaf5");

        /* renamed from: m, reason: collision with root package name */
        @o0
        public static final String f58336m = ProtectedSandApp.s("\ufaf6");

        /* renamed from: n, reason: collision with root package name */
        @o0
        public static final String f58338n = ProtectedSandApp.s("\ufaf7");

        /* renamed from: a0, reason: collision with root package name */
        @o0
        public static final String f58313a0 = ProtectedSandApp.s("\ufaf8");

        /* renamed from: o, reason: collision with root package name */
        @o0
        public static final String f58340o = ProtectedSandApp.s("\ufaf9");

        /* renamed from: p, reason: collision with root package name */
        @o0
        public static final String f58342p = ProtectedSandApp.s("\ufafa");

        /* renamed from: q, reason: collision with root package name */
        @o0
        public static final String f58344q = ProtectedSandApp.s("\ufafb");

        /* renamed from: r, reason: collision with root package name */
        @o0
        public static final String f58346r = ProtectedSandApp.s("\ufafc");

        /* renamed from: s, reason: collision with root package name */
        @o0
        public static final String f58347s = ProtectedSandApp.s("\ufafd");

        /* renamed from: t, reason: collision with root package name */
        @o0
        public static final String f58348t = ProtectedSandApp.s("\ufafe");

        /* renamed from: u, reason: collision with root package name */
        @o0
        public static final String f58349u = ProtectedSandApp.s("\ufaff");

        /* renamed from: v, reason: collision with root package name */
        @o0
        public static final String f58350v = ProtectedSandApp.s("ﬀ");

        /* renamed from: w, reason: collision with root package name */
        @o0
        public static final String f58351w = ProtectedSandApp.s("ﬁ");

        /* renamed from: x, reason: collision with root package name */
        @o0
        public static final String f58352x = ProtectedSandApp.s("ﬂ");

        /* renamed from: y, reason: collision with root package name */
        @o0
        public static final String f58353y = ProtectedSandApp.s("ﬃ");

        /* renamed from: z, reason: collision with root package name */
        @o0
        public static final String f58354z = ProtectedSandApp.s("ﬄ");

        protected d() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public static final String f58355a = ProtectedSandApp.s("ﬅ");

        /* renamed from: b, reason: collision with root package name */
        @o0
        public static final String f58356b = ProtectedSandApp.s("ﬆ");

        protected e() {
        }
    }

    private FirebaseAnalytics(zzdy zzdyVar) {
        Preconditions.checkNotNull(zzdyVar);
        this.f58284a = zzdyVar;
    }

    @Keep
    @o0
    @b1(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static FirebaseAnalytics getInstance(@o0 Context context) {
        if (f58283c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f58283c == null) {
                        f58283c = new FirebaseAnalytics(zzdy.zza(context));
                    }
                } finally {
                }
            }
        }
        return f58283c;
    }

    @q0
    @Keep
    public static zzlb getScionFrontendApiImplementation(Context context, @q0 Bundle bundle) {
        zzdy zza = zzdy.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new g(zza);
    }

    @mf.d({"this.executor"})
    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f58285b == null) {
                    this.f58285b = new com.google.firebase.analytics.d(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f58285b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @o0
    public final Task<String> a() {
        try {
            return Tasks.call(l(), new f(this));
        } catch (RuntimeException e4) {
            this.f58284a.zza(5, ProtectedSandApp.s("\ufb07"), (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e4);
        }
    }

    @o0
    public final Task<Long> b() {
        try {
            return Tasks.call(l(), new com.google.firebase.analytics.e(this));
        } catch (RuntimeException e4) {
            this.f58284a.zza(5, ProtectedSandApp.s("\ufb08"), (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e4);
        }
    }

    public final void c(@e1(max = 40, min = 1) @o0 String str, @q0 Bundle bundle) {
        this.f58284a.zza(str, bundle);
    }

    public final void d() {
        this.f58284a.zzj();
    }

    public final void e(boolean z4) {
        this.f58284a.zza(Boolean.valueOf(z4));
    }

    public final void f(@o0 Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.AD_STORAGE);
        String s4 = ProtectedSandApp.s("\ufb09");
        String s5 = ProtectedSandApp.s("\ufb0a");
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            String s6 = ProtectedSandApp.s("\ufb0b");
            if (ordinal == 0) {
                bundle.putString(s6, s4);
            } else if (ordinal == 1) {
                bundle.putString(s6, s5);
            }
        }
        a aVar2 = map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            String s7 = ProtectedSandApp.s("\ufb0c");
            if (ordinal2 == 0) {
                bundle.putString(s7, s4);
            } else if (ordinal2 == 1) {
                bundle.putString(s7, s5);
            }
        }
        a aVar3 = map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            String s10 = ProtectedSandApp.s("\ufb0d");
            if (ordinal3 == 0) {
                bundle.putString(s10, s4);
            } else if (ordinal3 == 1) {
                bundle.putString(s10, s5);
            }
        }
        a aVar4 = map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            String s11 = ProtectedSandApp.s("\ufb0e");
            if (ordinal4 == 0) {
                bundle.putString(s11, s4);
            } else if (ordinal4 == 1) {
                bundle.putString(s11, s5);
            }
        }
        this.f58284a.zzc(bundle);
    }

    public final void g(@q0 Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f58284a.zzd(bundle);
    }

    @Keep
    @o0
    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(j.v().a(), i0.f35989d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw new IllegalStateException(e4);
        } catch (ExecutionException e5) {
            throw new IllegalStateException(e5.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException(ProtectedSandApp.s("\ufb0f"));
        }
    }

    public final void h(long j4) {
        this.f58284a.zza(j4);
    }

    public final void i(@q0 String str) {
        this.f58284a.zzd(str);
    }

    public final void j(@e1(max = 24, min = 1) @o0 String str, @e1(max = 36) @q0 String str2) {
        this.f58284a.zzb(str, str2);
    }

    @Keep
    @l0
    @Deprecated
    public final void setCurrentScreen(@o0 Activity activity, @e1(max = 36, min = 1) @q0 String str, @e1(max = 36, min = 1) @q0 String str2) {
        this.f58284a.zza(activity, str, str2);
    }
}
