package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.view.C1434k;
import com.android.billingclient.api.b1;
import com.android.billingclient.api.j;
import com.android.billingclient.api.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzcg;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzes;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzim;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzkk;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzll;
import com.google.android.gms.internal.play_billing.zzln;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
class m extends j {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;

    @androidx.annotation.q0
    private s0 G;
    private boolean H;
    private boolean I;
    private zzcf J;

    @androidx.annotation.q0
    private volatile n K;
    private ExecutorService L;
    private final Long M;
    private final com.google.android.gms.internal.play_billing.zzbq N;

    /* renamed from: a, reason: collision with root package name */
    private final Object f40465a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f40466b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40467c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40468d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f40469e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.q0
    private volatile a7 f40470f;

    /* renamed from: g, reason: collision with root package name */
    private Context f40471g;

    /* renamed from: h, reason: collision with root package name */
    private j4 f40472h;

    /* renamed from: i, reason: collision with root package name */
    private volatile zzar f40473i;

    /* renamed from: j, reason: collision with root package name */
    private volatile d3 f40474j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40475k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f40476l;

    /* renamed from: m, reason: collision with root package name */
    private int f40477m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f40478n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f40479o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f40480p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f40481q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f40482r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f40483s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f40484t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f40485u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f40486v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f40487w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f40488x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f40489y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f40490z;

    @androidx.annotation.d
    m(@androidx.annotation.q0 String str, Context context, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        this.f40465a = new Object();
        this.f40466b = 0;
        this.f40469e = new Handler(Looper.getMainLooper());
        this.f40477m = 0;
        this.J = zzcf.zzk();
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.M = valueOf;
        this.N = zzbf.zza();
        String s4 = ProtectedSandApp.s("ϊ");
        this.f40467c = s4;
        String p02 = p0();
        this.f40468d = p02;
        this.f40471g = context.getApplicationContext();
        zzke zza = zzkg.zza();
        zza.zzx(s4);
        if (p02 != null) {
            zza.zzy(p02);
        }
        zza.zzq(this.f40471g.getPackageName());
        zza.zzd(valueOf.longValue());
        zza.zzw(cVar.f40414q);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(926300087L);
        c1(zza, context);
        try {
            zza.zzb(this.f40471g.getPackageManager().getPackageInfo(this.f40471g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ό"), th);
        }
        this.f40472h = new x4(this.f40471g, (zzkg) zza.zzi());
        this.f40471g.getPackageName();
        this.H = cVar.f40414q;
    }

    public static /* synthetic */ Object A(m mVar, p pVar) {
        mVar.m0(pVar);
        return null;
    }

    private final void A0(c cVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ώ"), exc);
        i1(zzjsVar, 3, yVar, i4.a(exc));
        cVar.a(yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(zzjl zzjlVar) {
        try {
            this.f40472h.l(zzjlVar, this.f40477m);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    public static /* synthetic */ void B0(m mVar, u0 u0Var) {
        zzjs zzjsVar = zzjs.zzx;
        y yVar = n4.f40523k;
        mVar.g1(zzjsVar, 7, yVar);
        u0Var.a(yVar, new c1(zzca.zzk(), zzca.zzk()));
    }

    private final void B1(zzjl zzjlVar, long j4, boolean z4) {
        try {
            this.f40472h.f(zzjlVar, this.f40477m, j4, z4);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(zzjp zzjpVar) {
        try {
            this.f40472h.g(zzjpVar, this.f40477m);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    public static /* synthetic */ void D0(m mVar, y yVar) {
        if (mVar.f40470f.e() != null) {
            mVar.f40470f.e().e(yVar, null);
        } else {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϐ"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(zzjs zzjsVar, y yVar, int i4) {
        try {
            int i5 = i4.f40395a;
            zzjj zzjjVar = (zzjj) i4.b(zzjsVar, 6, yVar, null, zzjz.zza).zzq();
            zzll zza = zzln.zza();
            zza.zza(i4 > 0);
            zza.zzb(i4);
            zzjjVar.zze(zza);
            A1((zzjl) zzjjVar.zzi());
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    public static /* synthetic */ Void E(m mVar, e eVar, Activity activity, ResultReceiver resultReceiver) {
        mVar.v0(eVar, activity, resultReceiver);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1(int i4) {
        String s4 = ProtectedSandApp.s("ϑ");
        synchronized (this.f40465a) {
            try {
                if (this.f40466b == 3) {
                    return;
                }
                zzc.zzm(ProtectedSandApp.s("ϋ"), s4 + L1(this.f40466b) + ProtectedSandApp.s("ϒ") + L1(i4));
                this.f40466b = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Void F(m mVar, g0 g0Var) {
        mVar.u0(g0Var);
        return null;
    }

    private final synchronized void F1() {
        ExecutorService executorService = this.L;
        if (executorService != null) {
            executorService.shutdownNow();
            this.L = null;
        }
    }

    public static /* synthetic */ Void G(m mVar, s sVar, int i4) {
        mVar.t0(sVar, i4);
        return null;
    }

    private final void G1(n nVar, int i4) {
        zzjs zzjsVar;
        y yVar;
        y yVar2;
        synchronized (this.f40465a) {
            try {
                if (K1()) {
                    yVar = h0(i4);
                } else {
                    if (this.f40466b == 1) {
                        zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϓ"));
                        zzjs zzjsVar2 = zzjs.zzK;
                        yVar2 = n4.f40516d;
                        D1(zzjsVar2, yVar2, i4);
                    } else if (this.f40466b == 3) {
                        zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϔ"));
                        zzjs zzjsVar3 = zzjs.zzL;
                        yVar2 = n4.f40522j;
                        D1(zzjsVar3, yVar2, i4);
                    } else {
                        E1(1);
                        if (i4 == 0) {
                            this.K = nVar;
                            i4 = 0;
                        }
                        H1();
                        zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϕ"));
                        this.f40474j = new d3(this, nVar, i4, null);
                        this.f40474j.f();
                        Intent intent = new Intent(ProtectedSandApp.s("ϖ"));
                        intent.setPackage(ProtectedSandApp.s("ϗ"));
                        List<ResolveInfo> queryIntentServices = this.f40471g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            zzjsVar = zzjs.zzO;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, ProtectedSandApp.s("ϗ")) || str2 == null) {
                                    String s4 = ProtectedSandApp.s("ϋ");
                                    String s5 = ProtectedSandApp.s("Ϝ");
                                    zzjsVar = zzjs.zzN;
                                    zzc.zzn(s4, s5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra(ProtectedSandApp.s("Ϙ"), this.f40467c);
                                    synchronized (this.f40465a) {
                                        try {
                                            if (this.f40466b == 2) {
                                                yVar = h0(i4);
                                            } else if (this.f40466b != 1) {
                                                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϙ"));
                                                zzjs zzjsVar4 = zzjs.zzba;
                                                yVar2 = n4.f40522j;
                                                D1(zzjsVar4, yVar2, i4);
                                            } else {
                                                d3 d3Var = this.f40474j;
                                                if ((i4 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f40471g.bindService(intent2, d3Var, 1) : this.f40471g.bindService(intent2, 1, O(), d3Var)) {
                                                    zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϛ"));
                                                    yVar = null;
                                                } else {
                                                    String s6 = ProtectedSandApp.s("ϋ");
                                                    String s7 = ProtectedSandApp.s("ϛ");
                                                    zzjsVar = zzjs.zzM;
                                                    zzc.zzn(s6, s7);
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                String s10 = ProtectedSandApp.s("ϋ");
                                String s11 = ProtectedSandApp.s("Ϝ");
                                zzjsVar = zzjs.zzN;
                                zzc.zzn(s10, s11);
                            }
                        }
                        E1(0);
                        zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϝ"));
                        y yVar3 = n4.f40514b;
                        D1(zzjsVar, yVar3, i4);
                        yVar = yVar3;
                    }
                    yVar = yVar2;
                }
            } finally {
            }
        }
        if (yVar != null) {
            nVar.b(yVar);
        }
    }

    public static /* synthetic */ Void H(m mVar, r0 r0Var, q0 q0Var, Activity activity) {
        zzar zzarVar;
        r3 r3Var = null;
        try {
            if (!mVar.J1(w4.b())) {
                mVar.w1(r0Var, n4.f40522j, zzjs.zzb, null);
            } else if (mVar.D) {
                synchronized (mVar.f40465a) {
                    zzarVar = mVar.f40473i;
                }
                if (zzarVar == null) {
                    mVar.w1(r0Var, n4.f40522j, zzjs.zzbc, null);
                } else {
                    String packageName = mVar.f40471g.getPackageName();
                    String str = mVar.f40468d;
                    long longValue = mVar.M.longValue();
                    int i4 = zzc.zza;
                    String s4 = ProtectedSandApp.s("ϊ");
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, s4, str, longValue);
                    zzij zza = zzim.zza();
                    String s5 = ProtectedSandApp.s("ϟ");
                    zzjd zza2 = zzjf.zza();
                    zza2.zza(q0Var.e().toString());
                    zza.zza(s5, (zzjf) zza2.zzi());
                    String s6 = ProtectedSandApp.s("Ϡ");
                    zzjd zza3 = zzjf.zza();
                    zza3.zza(String.valueOf(q0Var.c()));
                    zza.zza(s6, (zzjf) zza3.zzi());
                    String s7 = ProtectedSandApp.s("ϡ");
                    zzjd zza4 = zzjf.zza();
                    zza4.zza(String.valueOf(q0Var.d()));
                    zza.zza(s7, (zzjf) zza4.zzi());
                    String s10 = ProtectedSandApp.s("Ϣ");
                    zzjd zza5 = zzjf.zza();
                    zza5.zza(String.valueOf(q0Var.a()));
                    zza.zza(s10, (zzjf) zza5.zzi());
                    if (!TextUtils.isEmpty(q0Var.b())) {
                        String s11 = ProtectedSandApp.s("ϣ");
                        zzjd zza6 = zzjf.zza();
                        zza6.zza(q0Var.b());
                        zza.zza(s11, (zzjf) zza6.zzi());
                    }
                    bundle.putByteArray(ProtectedSandApp.s("Ϥ"), ((zzim) zza.zzi()).zzQ());
                    zzarVar.zzp(27, packageName, bundle, new k3(mVar, new WeakReference(activity), r0Var, r3Var));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϟ"));
                mVar.w1(r0Var, n4.H, zzjs.zzbs, null);
            }
        } catch (RuntimeException e4) {
            mVar.w1(r0Var, n4.f40520h, zzjs.zzbb, e4);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void H1() {
        synchronized (this.f40465a) {
            if (this.f40474j != null) {
                try {
                    this.f40471g.unbindService(this.f40474j);
                } catch (Throwable th) {
                    try {
                        zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϥ"), th);
                        this.f40473i = null;
                        this.f40474j = null;
                    } finally {
                        this.f40473i = null;
                        this.f40474j = null;
                    }
                }
            }
        }
    }

    public static /* synthetic */ Void I(m mVar, t tVar, u uVar, Activity activity) {
        mVar.w0(tVar, uVar, activity);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean I1(long j4) {
        String s4 = ProtectedSandApp.s("ϋ");
        String s5 = ProtectedSandApp.s("Ϧ");
        String s6 = ProtectedSandApp.s("ϧ");
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j4 = 0;
            }
            y yVar = (y) j0(1).get(j4, TimeUnit.MILLISECONDS);
            if (yVar.c() == 0) {
                zzc.zzm(s4, s6 + yVar.c());
            } else {
                zzc.zzn(s4, s5 + yVar.c());
            }
        } catch (Exception e4) {
            if (e4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzo(s4, ProtectedSandApp.s("Ϩ"), e4);
        }
        return K1();
    }

    public static /* synthetic */ Void J(m mVar, j0 j0Var) {
        mVar.s0(j0Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean J1(long j4) {
        long max;
        com.google.android.gms.internal.play_billing.zzbn zzb = com.google.android.gms.internal.play_billing.zzbn.zzb(this.N);
        int a5 = w4.a();
        long j5 = j4;
        int i4 = 1;
        while (true) {
            String s4 = ProtectedSandApp.s("ϋ");
            if (i4 > a5) {
                break;
            }
            try {
                max = Math.max(0L, j5);
            } catch (Exception e4) {
                if (e4 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo(s4, ProtectedSandApp.s("Ϩ"), e4);
            }
            if (max <= 0) {
                zzc.zzn(s4, ProtectedSandApp.s("ϩ"));
                return K1();
            }
            y yVar = (y) j0(i4).get(max, TimeUnit.MILLISECONDS);
            if (yVar.c() == 0) {
                zzc.zzm(s4, ProtectedSandApp.s("ϧ") + yVar.c());
                return K1();
            }
            zzc.zzn(s4, ProtectedSandApp.s("Ϧ") + yVar.c());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j5 = j4 - zzb.zza(timeUnit);
            long pow = ((long) Math.pow(2.0d, i4 - 1)) * 1000;
            if (j5 < pow) {
                zzc.zzn(s4, ProtectedSandApp.s("Ϫ"));
                return K1();
            }
            if (i4 < a5 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j5 = j4 - zzb.zza(timeUnit);
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    zzc.zzo(s4, ProtectedSandApp.s("ϫ"), e5);
                    zzc.zzn(s4, ProtectedSandApp.s("Ϭ"));
                    return K1();
                }
            }
            i4++;
        }
    }

    public static /* synthetic */ Void K(m mVar, h0 h0Var, Activity activity, ResultReceiver resultReceiver) {
        mVar.x0(h0Var, activity, resultReceiver);
        return null;
    }

    private final boolean K1() {
        boolean z4;
        synchronized (this.f40465a) {
            try {
                z4 = false;
                if (this.f40466b == 2 && this.f40473i != null && this.f40474j != null) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public static /* synthetic */ Void L(m mVar, g gVar) {
        mVar.q0(gVar);
        return null;
    }

    private static final String L1(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? ProtectedSandApp.s("ϭ") : ProtectedSandApp.s("Ϯ") : ProtectedSandApp.s("ϯ") : ProtectedSandApp.s("ϰ");
    }

    public static /* synthetic */ Void M(m mVar, w wVar, x xVar) {
        mVar.r0(wVar, xVar);
        return null;
    }

    public static /* synthetic */ Void N(m mVar, d dVar) {
        zzar zzarVar;
        r3 r3Var = null;
        try {
            if (!mVar.J1(w4.b())) {
                mVar.m1(dVar, n4.f40522j, zzjs.zzb, null);
            } else if (mVar.f40489y) {
                synchronized (mVar.f40465a) {
                    zzarVar = mVar.f40473i;
                }
                if (zzarVar == null) {
                    mVar.m1(dVar, n4.f40522j, zzjs.zzbc, null);
                } else {
                    zzarVar.zzr(21, mVar.f40471g.getPackageName(), zzc.zzh(mVar.f40467c, mVar.f40468d, mVar.M.longValue()), new m3(dVar, mVar.f40472h, mVar.f40477m, r3Var));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϱ"));
                mVar.m1(dVar, n4.D, zzjs.zzan, null);
            }
        } catch (Exception e4) {
            mVar.m1(dVar, e4 instanceof DeadObjectException ? n4.f40522j : n4.f40520h, zzjs.zzaq, e4);
        }
        return null;
    }

    @androidx.annotation.q0
    static Future P(Callable callable, long j4, @androidx.annotation.q0 final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.k2
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzc.zzn(ProtectedSandApp.s("ӡ"), ProtectedSandApp.s("Ӣ"));
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j4 * 0.95d));
            return submit;
        } catch (Exception e4) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϲ"), e4);
            return null;
        }
    }

    static /* bridge */ /* synthetic */ ResultReceiver Q1(m mVar, r0 r0Var) {
        return new zzbw(mVar, mVar.f40469e, r0Var);
    }

    public static /* synthetic */ void R(m mVar, a0 a0Var, z zVar) {
        zzjs zzjsVar = zzjs.zzx;
        y yVar = n4.f40523k;
        mVar.g1(zzjsVar, 4, yVar);
        a0Var.a(yVar, zVar.a());
    }

    public static /* synthetic */ void S(m mVar, z0 z0Var) {
        zzjs zzjsVar = zzjs.zzx;
        y yVar = n4.f40523k;
        mVar.g1(zzjsVar, 9, yVar);
        z0Var.a(yVar, zzca.zzk());
    }

    public static /* synthetic */ void T(m mVar, p pVar) {
        zzjs zzjsVar = zzjs.zzx;
        y yVar = n4.f40523k;
        mVar.g1(zzjsVar, 13, yVar);
        pVar.a(yVar, null);
    }

    static /* bridge */ /* synthetic */ void U0(m mVar, int i4) {
        mVar.f40477m = i4;
        mVar.F = i4 >= 29;
        mVar.E = i4 >= 28;
        mVar.D = i4 >= 27;
        mVar.C = i4 >= 26;
        mVar.B = i4 >= 24;
        mVar.A = i4 >= 23;
        mVar.f40490z = i4 >= 22;
        mVar.f40489y = i4 >= 21;
        mVar.f40488x = i4 >= 20;
        mVar.f40487w = i4 >= 19;
        mVar.f40486v = i4 >= 18;
        mVar.f40485u = i4 >= 17;
        mVar.f40484t = i4 >= 16;
        mVar.f40483s = i4 >= 15;
        mVar.f40482r = i4 >= 14;
        mVar.f40481q = i4 >= 12;
        mVar.f40480p = i4 >= 9;
        mVar.f40479o = i4 >= 8;
        mVar.f40478n = i4 >= 6;
    }

    static /* bridge */ /* synthetic */ void W0(m mVar, int i4) {
        if (i4 != 0) {
            mVar.E1(0);
            return;
        }
        synchronized (mVar.f40465a) {
            try {
                if (mVar.f40466b == 3) {
                    return;
                }
                mVar.E1(2);
                a7 a7Var = mVar.f40470f != null ? mVar.f40470f : null;
                if (a7Var != null) {
                    a7Var.i(mVar.f40489y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void X(m mVar, c cVar) {
        zzjs zzjsVar = zzjs.zzx;
        y yVar = n4.f40523k;
        mVar.g1(zzjsVar, 3, yVar);
        cVar.a(yVar);
    }

    static /* bridge */ /* synthetic */ y X1(Exception exc) {
        return exc instanceof DeadObjectException ? n4.f40522j : n4.f40520h;
    }

    static /* bridge */ /* synthetic */ boolean a1(m mVar) {
        boolean z4;
        synchronized (mVar.f40465a) {
            z4 = true;
            if (mVar.f40466b != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    private static final void c1(zzke zzkeVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ProtectedSandApp.s("ϳ"));
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzkeVar.zzv((int) (memoryInfo.totalMem / 1048576));
                zzkeVar.zzr(Build.BRAND);
                zzkeVar.zzu(Build.MODEL);
                zzkeVar.zzt(Build.MANUFACTURER);
                zzkeVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e4) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϴ"), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle d0(int i4, String str, String str2, q qVar, Bundle bundle) throws Exception {
        zzar zzarVar;
        try {
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            return zzarVar == null ? zzc.zzd(n4.f40522j, zzjs.zzbc) : zzarVar.zzg(i4, this.f40471g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e4) {
            return zzc.zze(n4.f40522j, zzjs.zze, i4.a(e4));
        } catch (Exception e5) {
            return zzc.zze(n4.f40520h, zzjs.zze, i4.a(e5));
        }
    }

    private final r5 d1(int i4, y yVar, zzjs zzjsVar, String str, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 9, yVar, i4.a(exc));
        zzc.zzo(ProtectedSandApp.s("ϋ"), str, exc);
        return new r5(yVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle e0(String str, String str2) throws Exception {
        zzar zzarVar;
        try {
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            return zzarVar == null ? zzc.zzd(n4.f40522j, zzjs.zzbc) : zzarVar.zzf(3, this.f40471g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e4) {
            return zzc.zze(n4.f40522j, zzjs.zze, i4.a(e4));
        } catch (Exception e5) {
            return zzc.zze(n4.f40520h, zzjs.zze, i4.a(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.billingclient.api.r5 e1(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.m.e1(java.lang.String, boolean, int):com.android.billingclient.api.r5");
    }

    public static /* synthetic */ Object e2(m mVar, int i4, zzp zzpVar) {
        mVar.G1(new a3(mVar, zzpVar), i4);
        return ProtectedSandApp.s("Ќ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler f0() {
        return Looper.myLooper() == null ? this.f40469e : new Handler(Looper.myLooper());
    }

    private final void f1(y yVar, zzjs zzjsVar, int i4) {
        int c5 = yVar.c();
        zzjp zzjpVar = null;
        zzjl zzjlVar = null;
        String s4 = ProtectedSandApp.s("Ѝ");
        String s5 = ProtectedSandApp.s("Ў");
        if (c5 == 0) {
            int i5 = i4.f40395a;
            try {
                zzjn zza = zzjp.zza();
                zza.zze(5);
                zzkk zza2 = zzkn.zza();
                zza2.zza(i4);
                zza.zzb((zzkn) zza2.zzi());
                zzjpVar = (zzjp) zza.zzi();
            } catch (Exception e4) {
                zzc.zzo(s5, s4, e4);
            }
            C1(zzjpVar);
            return;
        }
        int i6 = i4.f40395a;
        try {
            zzjj zza3 = zzjl.zza();
            zzjq zza4 = zzju.zza();
            zza4.zzp(yVar.c());
            zza4.zzb(yVar.a());
            zza4.zze(zzjsVar);
            zza3.zzb(zza4);
            zza3.zzp(5);
            zzkk zza5 = zzkn.zza();
            zza5.zza(i4);
            zza3.zzc((zzkn) zza5.zzi());
            zzjlVar = (zzjl) zza3.zzi();
        } catch (Exception e5) {
            zzc.zzo(s5, s4, e5);
        }
        A1(zzjlVar);
    }

    public static /* synthetic */ Object f2(m mVar, i iVar, k0 k0Var) {
        mVar.l0(iVar, k0Var);
        return null;
    }

    private final q3 g0(y yVar, zzjs zzjsVar, String str, @androidx.annotation.q0 Exception exc) {
        zzc.zzo(ProtectedSandApp.s("ϋ"), str, exc);
        i1(zzjsVar, 7, yVar, i4.a(exc));
        return new q3(yVar.c(), yVar.a(), new ArrayList(), new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(zzjs zzjsVar, int i4, y yVar) {
        try {
            int i5 = i4.f40395a;
            A1(i4.b(zzjsVar, i4, yVar, null, zzjz.zza));
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    public static /* synthetic */ Object g2(m mVar, a0 a0Var, z zVar) {
        if (mVar.J1(w4.b())) {
            mVar.z0(zVar, a0Var);
            return null;
        }
        zzjs zzjsVar = zzjs.zzb;
        y yVar = n4.f40522j;
        mVar.g1(zzjsVar, 4, yVar);
        a0Var.a(yVar, zVar.a());
        return null;
    }

    private final y h0(int i4) {
        zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Џ"));
        zzjn zza = zzjp.zza();
        zza.zze(6);
        zzll zza2 = zzln.zza();
        zza2.zze(true);
        zza2.zza(i4 > 0);
        zza2.zzb(i4);
        zza.zzd(zza2);
        C1((zzjp) zza.zzi());
        return n4.f40521i;
    }

    private final void h1(zzjs zzjsVar, int i4, y yVar, long j4) {
        String s4 = ProtectedSandApp.s("Ϗ");
        String s5 = ProtectedSandApp.s("ϋ");
        try {
            int i5 = i4.f40395a;
            try {
                this.f40472h.i(i4.b(zzjsVar, 2, yVar, null, zzjz.zza), this.f40477m, j4);
            } catch (Throwable th) {
                zzc.zzo(s5, s4, th);
            }
        } catch (Throwable th2) {
            zzc.zzo(s5, s4, th2);
        }
    }

    public static /* synthetic */ Object h2(m mVar, u0 u0Var, b1 b1Var) {
        if (!mVar.J1(w4.b())) {
            zzjs zzjsVar = zzjs.zzb;
            y yVar = n4.f40522j;
            mVar.g1(zzjsVar, 7, yVar);
            u0Var.a(yVar, new c1(zzca.zzk(), zzca.zzk()));
            return null;
        }
        if (mVar.f40485u) {
            q3 S1 = mVar.S1(b1Var);
            u0Var.a(n4.a(S1.a(), S1.b()), new c1(S1.c(), S1.d()));
            return null;
        }
        zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("А"));
        zzjs zzjsVar2 = zzjs.zzt;
        y yVar2 = n4.f40531s;
        mVar.g1(zzjsVar2, 7, yVar2);
        u0Var.a(yVar2, new c1(zzca.zzk(), zzca.zzk()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y i0() {
        y yVar;
        int i4 = 0;
        int[] iArr = {0, 3};
        synchronized (this.f40465a) {
            while (true) {
                if (i4 >= 2) {
                    yVar = n4.f40520h;
                    break;
                }
                if (this.f40466b == iArr[i4]) {
                    yVar = n4.f40522j;
                    break;
                }
                i4++;
            }
        }
        return yVar;
    }

    private final void i1(zzjs zzjsVar, int i4, y yVar, @androidx.annotation.q0 String str) {
        try {
            int i5 = i4.f40395a;
            A1(i4.b(zzjsVar, i4, yVar, str, zzjz.zza));
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    public static /* synthetic */ Object i2(m mVar, c cVar, b bVar) {
        mVar.k0(cVar, bVar);
        return null;
    }

    private final zzdk j0(final int i4) {
        if (this.H && !K1()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.j1
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return m.e2(m.this, i4, zzpVar);
                }
            });
        }
        zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Б"));
        return zzdf.zza(n4.f40521i);
    }

    private final void j1(zzjs zzjsVar, int i4, y yVar, long j4, boolean z4) {
        try {
            int i5 = i4.f40395a;
            B1(i4.b(zzjsVar, 2, yVar, null, zzjz.zza), j4, z4);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    public static /* synthetic */ Object j2(m mVar, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        mVar.n0(bundle, activity, resultReceiver);
        return null;
    }

    private final /* synthetic */ Object k0(c cVar, b bVar) throws Exception {
        zzar zzarVar;
        try {
            if (!J1(w4.b())) {
                zzjs zzjsVar = zzjs.zzb;
                y yVar = n4.f40522j;
                g1(zzjsVar, 3, yVar);
                cVar.a(yVar);
            } else if (TextUtils.isEmpty(bVar.a())) {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("В"));
                zzjs zzjsVar2 = zzjs.zzz;
                y yVar2 = n4.f40519g;
                g1(zzjsVar2, 3, yVar2);
                cVar.a(yVar2);
            } else if (this.f40480p) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar != null) {
                    String packageName = this.f40471g.getPackageName();
                    String a5 = bVar.a();
                    String str = this.f40468d;
                    long longValue = this.M.longValue();
                    int i4 = zzc.zza;
                    String s4 = ProtectedSandApp.s("ϊ");
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, s4, str, longValue);
                    Bundle zzd = zzarVar.zzd(9, packageName, a5, bundle);
                    cVar.a(n4.a(zzc.zzb(zzd, ProtectedSandApp.s("ϋ")), zzc.zzj(zzd, ProtectedSandApp.s("ϋ"))));
                    return null;
                }
                A0(cVar, n4.f40522j, zzjs.zzbc, null);
            } else {
                zzjs zzjsVar3 = zzjs.zzA;
                y yVar3 = n4.f40513a;
                g1(zzjsVar3, 3, yVar3);
                cVar.a(yVar3);
            }
            return null;
        } catch (DeadObjectException e4) {
            A0(cVar, n4.f40522j, zzjs.zzB, e4);
            return null;
        } catch (Exception e5) {
            A0(cVar, n4.f40520h, zzjs.zzB, e5);
            return null;
        }
    }

    private final void k1(zzjs zzjsVar, int i4, y yVar, @androidx.annotation.q0 String str, long j4, boolean z4) {
        try {
            int i5 = i4.f40395a;
            B1(i4.b(zzjsVar, 2, yVar, str, zzjz.zza), j4, z4);
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    private final /* synthetic */ Object l0(i iVar, k0 k0Var) throws Exception {
        zzar zzarVar;
        try {
            if (!J1(w4.b())) {
                n1(iVar, n4.f40522j, zzjs.zzb, null);
            } else if (this.f40477m < 24) {
                n1(iVar, n4.K, zzjs.zzbP, null);
            } else {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    n1(iVar, n4.f40522j, zzjs.zzbc, null);
                } else {
                    String str = this.f40467c;
                    zzes b5 = r4.b(str, 24, this.f40471g, q4.zzd.zza());
                    zzij zza = zzim.zza();
                    String s4 = ProtectedSandApp.s("Г");
                    zzjd zza2 = zzjf.zza();
                    zza2.zza(str);
                    zza.zza(s4, (zzjf) zza2.zzi());
                    String s5 = ProtectedSandApp.s("Д");
                    zzjd zza3 = zzjf.zza();
                    zza3.zza(this.f40471g.getPackageName());
                    zza.zza(s5, (zzjf) zza3.zzi());
                    String s6 = ProtectedSandApp.s("Е");
                    zzjd zza4 = zzjf.zza();
                    zza4.zza(String.valueOf(k0Var.a()));
                    zza.zza(s6, (zzjf) zza4.zzi());
                    if (k0Var.c() != null) {
                        String s7 = ProtectedSandApp.s("Ж");
                        zzjd zza5 = zzjf.zza();
                        zza5.zza(k0Var.c().toLanguageTag());
                        zza.zza(s7, (zzjf) zza5.zzi());
                    }
                    if (k0Var.b() != null) {
                        String s10 = ProtectedSandApp.s("З");
                        zzjd zza6 = zzjf.zza();
                        zza6.zza(k0Var.b());
                        zza.zza(s10, (zzjf) zza6.zzi());
                    }
                    zzarVar.zzm(r4.a(b5, (zzim) zza.zzi()), new b5(iVar, this.f40472h, this.f40477m));
                }
            }
        } catch (DeadObjectException e4) {
            n1(iVar, n4.f40522j, zzjs.zzbb, e4);
        } catch (Exception e5) {
            n1(iVar, n4.f40520h, zzjs.zzbb, e5);
        }
        return null;
    }

    private void l1(int i4) {
        try {
            int i5 = i4.f40395a;
            C1(i4.c(i4, zzjz.zza));
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ϗ"), th);
        }
    }

    private final /* synthetic */ Object m0(p pVar) throws Exception {
        zzar zzarVar;
        r3 r3Var = null;
        try {
            if (!J1(w4.b())) {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("И"));
                zzjs zzjsVar = zzjs.zzb;
                y yVar = n4.f40522j;
                g1(zzjsVar, 13, yVar);
                pVar.a(yVar, null);
            } else if (this.f40486v) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    v1(pVar, n4.f40522j, zzjs.zzbc, null);
                } else if (w4.j() && this.B) {
                    String str = this.f40467c;
                    zzes b5 = r4.b(str, 24, this.f40471g, q4.zza.zza());
                    zzij zza = zzim.zza();
                    String s4 = ProtectedSandApp.s("Г");
                    zzjd zza2 = zzjf.zza();
                    zza2.zza(str);
                    zza.zza(s4, (zzjf) zza2.zzi());
                    String s5 = ProtectedSandApp.s("Д");
                    zzjd zza3 = zzjf.zza();
                    zza3.zza(this.f40471g.getPackageName());
                    zza.zza(s5, (zzjf) zza3.zzi());
                    Bundle a5 = r4.a(b5, (zzim) zza.zzi());
                    if (!TextUtils.isEmpty(null)) {
                        a5.putString(ProtectedSandApp.s("К"), null);
                    }
                    zzarVar.zzm(a5, new d5(pVar, this.f40472h, this.f40477m));
                } else {
                    String packageName = this.f40471g.getPackageName();
                    String str2 = this.f40468d;
                    long longValue = this.M.longValue();
                    int i4 = zzc.zza;
                    String s6 = ProtectedSandApp.s("ϊ");
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, s6, str2, longValue);
                    if (!TextUtils.isEmpty(null)) {
                        bundle.putString(ProtectedSandApp.s("К"), null);
                    }
                    zzarVar.zzo(18, packageName, bundle, new i3(pVar, this.f40472h, this.f40477m, r3Var));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Й"));
                zzjs zzjsVar2 = zzjs.zzF;
                y yVar2 = n4.f40538z;
                g1(zzjsVar2, 13, yVar2);
                pVar.a(yVar2, null);
            }
        } catch (DeadObjectException e4) {
            v1(pVar, n4.f40522j, zzjs.zzaj, e4);
        } catch (Exception e5) {
            v1(pVar, n4.f40520h, zzjs.zzaj, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(d dVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 14, yVar, i4.a(exc));
        dVar.a(yVar);
    }

    private final /* synthetic */ Object n0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        zzar zzarVar;
        try {
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            if (zzarVar == null) {
                z1(-1, zzjs.zzbc, null);
            } else {
                zzarVar.zzt(12, this.f40471g.getPackageName(), bundle, new o3(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e4) {
            z1(-1, zzjs.zzbb, e4);
        } catch (Exception e5) {
            z1(6, zzjs.zzbb, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(i iVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Л"), exc);
        i1(zzjsVar, 40, yVar, i4.a(exc));
        iVar.a(yVar, null);
    }

    private final String o0(b1 b1Var) {
        if (TextUtils.isEmpty(null)) {
            return this.f40471g.getPackageName();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(s sVar, int i4, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 33, yVar, i4.a(exc));
        sVar.a(yVar, new r(i4));
    }

    @androidx.annotation.q0
    @SuppressLint({"PrivateApi"})
    private static String p0() {
        try {
            return (String) Class.forName(ProtectedSandApp.s("М")).getField(ProtectedSandApp.s("Н")).get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void p1(a0 a0Var, String str, y yVar, zzjs zzjsVar, String str2, @androidx.annotation.q0 Exception exc) {
        zzc.zzo(ProtectedSandApp.s("ϋ"), str2, exc);
        i1(zzjsVar, 4, yVar, i4.a(exc));
        a0Var.a(yVar, str);
    }

    private final /* synthetic */ Void q0(g gVar) throws Exception {
        zzar zzarVar;
        r3 r3Var = null;
        try {
            if (!J1(w4.b())) {
                q1(gVar, n4.f40522j, zzjs.zzb, null);
            } else if (this.f40489y) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    q1(gVar, n4.f40522j, zzjs.zzbc, null);
                } else {
                    zzarVar.zzk(21, this.f40471g.getPackageName(), zzc.zzh(this.f40467c, this.f40468d, this.M.longValue()), new f3(gVar, this.f40472h, this.f40477m, r3Var));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϱ"));
                q1(gVar, n4.D, zzjs.zzan, null);
            }
        } catch (DeadObjectException e4) {
            q1(gVar, n4.f40522j, zzjs.zzar, e4);
        } catch (Exception e5) {
            q1(gVar, n4.f40520h, zzjs.zzar, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1(g gVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 15, yVar, i4.a(exc));
        gVar.a(yVar, null);
    }

    private final /* synthetic */ Void r0(w wVar, x xVar) throws Exception {
        zzar zzarVar;
        try {
            if (!J1(w4.b())) {
                r1(wVar, n4.f40522j, zzjs.zzb, null);
            } else if (this.D) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    r1(wVar, n4.f40522j, zzjs.zzbc, null);
                } else {
                    String str = this.f40467c;
                    zzes b5 = r4.b(str, 24, this.f40471g, q4.zzc.zza());
                    zzij zza = zzim.zza();
                    String s4 = ProtectedSandApp.s("Г");
                    zzjd zza2 = zzjf.zza();
                    zza2.zza(str);
                    zza.zza(s4, (zzjf) zza2.zzi());
                    String s5 = ProtectedSandApp.s("Д");
                    zzjd zza3 = zzjf.zza();
                    zza3.zza(this.f40471g.getPackageName());
                    zza.zza(s5, (zzjf) zza3.zzi());
                    String s6 = ProtectedSandApp.s("Е");
                    zzjd zza4 = zzjf.zza();
                    zza4.zza(String.valueOf(xVar.a()));
                    zza.zza(s6, (zzjf) zza4.zzi());
                    String s7 = ProtectedSandApp.s("П");
                    zzjd zza5 = zzjf.zza();
                    zza5.zza(ProtectedSandApp.s("Р"));
                    zza.zza(s7, (zzjf) zza5.zzi());
                    if (xVar.a() == 3) {
                        String s10 = ProtectedSandApp.s("С");
                        zzjd zza6 = zzjf.zza();
                        zza6.zza(String.valueOf(this.f40471g.getPackageManager().getPackageInfo(this.f40471g.getPackageName(), 0).firstInstallTime));
                        zza.zza(s10, (zzjf) zza6.zzi());
                    } else if (xVar.a() == 5) {
                        String s11 = ProtectedSandApp.s("Т");
                        zzjd zza7 = zzjf.zza();
                        zza7.zza(String.valueOf(xVar.b()));
                        zza.zza(s11, (zzjf) zza7.zzi());
                    }
                    zzarVar.zzm(r4.a(b5, (zzim) zza.zzi()), new b0(wVar, xVar.a(), this.f40472h, this.f40477m, f0(), O()));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("О"));
                r1(wVar, n4.G, zzjs.zzbp, null);
            }
        } catch (DeadObjectException e4) {
            r1(wVar, n4.f40522j, zzjs.zzbb, e4);
        } catch (RuntimeException e5) {
            r1(wVar, n4.f40520h, zzjs.zzbb, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(w wVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 35, yVar, i4.a(exc));
        wVar.a(yVar, null);
    }

    private final /* synthetic */ Void s0(j0 j0Var) throws Exception {
        zzar zzarVar;
        r3 r3Var = null;
        try {
            if (!J1(w4.b())) {
                s1(j0Var, n4.f40522j, zzjs.zzb, null);
            } else if (this.f40490z) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    s1(j0Var, n4.f40522j, zzjs.zzbc, null);
                } else {
                    String packageName = this.f40471g.getPackageName();
                    long j4 = this.f40471g.getPackageManager().getPackageInfo(this.f40471g.getPackageName(), 0).firstInstallTime;
                    String str = this.f40468d;
                    long longValue = this.M.longValue();
                    int i4 = zzc.zza;
                    String s4 = ProtectedSandApp.s("ϊ");
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, s4, str, longValue);
                    bundle.putLong(ProtectedSandApp.s("Ф"), j4);
                    zzarVar.zzl(22, packageName, bundle, new g3(j0Var, this.f40472h, this.f40477m, r3Var));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("У"));
                s1(j0Var, n4.f40533u, zzjs.zzaE, null);
            }
        } catch (DeadObjectException e4) {
            s1(j0Var, n4.f40522j, zzjs.zzaF, e4);
        } catch (Exception e5) {
            s1(j0Var, n4.f40520h, zzjs.zzaF, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(j0 j0Var, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 24, yVar, i4.a(exc));
        j0Var.a(yVar, null);
    }

    private final /* synthetic */ Void t0(s sVar, int i4) throws Exception {
        zzar zzarVar;
        try {
            if (!J1(w4.b())) {
                o1(sVar, i4, n4.f40522j, zzjs.zzb, null);
                return null;
            }
            if (!this.D) {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("О"));
                o1(sVar, i4, n4.G, zzjs.zzbp, null);
                return null;
            }
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            if (zzarVar == null) {
                o1(sVar, i4, n4.f40522j, zzjs.zzbc, null);
                return null;
            }
            String str = this.f40467c;
            zzes b5 = r4.b(str, 24, this.f40471g, q4.zzb.zza());
            zzij zza = zzim.zza();
            String s4 = ProtectedSandApp.s("Г");
            zzjd zza2 = zzjf.zza();
            zza2.zza(str);
            zza.zza(s4, (zzjf) zza2.zzi());
            String s5 = ProtectedSandApp.s("Д");
            zzjd zza3 = zzjf.zza();
            zza3.zza(this.f40471g.getPackageName());
            zza.zza(s5, (zzjf) zza3.zzi());
            String s6 = ProtectedSandApp.s("Е");
            zzjd zza4 = zzjf.zza();
            zza4.zza(String.valueOf(i4));
            zza.zza(s6, (zzjf) zza4.zzi());
            zzarVar.zzm(r4.a(b5, (zzim) zza.zzi()), new p0(sVar, i4, this.f40472h, this.f40477m, f0(), O()));
            return null;
        } catch (DeadObjectException e4) {
            o1(sVar, i4, n4.f40522j, zzjs.zzaj, e4);
            return null;
        } catch (Exception e5) {
            o1(sVar, i4, n4.f40520h, zzjs.zzbb, e5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(g0 g0Var, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 23, yVar, i4.a(exc));
        g0Var.a(yVar);
    }

    private final /* synthetic */ Void u0(g0 g0Var) throws Exception {
        zzar zzarVar;
        r3 r3Var = null;
        try {
            if (!J1(w4.b())) {
                t1(g0Var, n4.f40522j, zzjs.zzb, null);
            } else if (this.B) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    t1(g0Var, n4.f40522j, zzjs.zzbc, null);
                } else {
                    zzarVar.zzs(24, this.f40471g.getPackageName(), zzc.zzh(this.f40467c, this.f40468d, this.M.longValue()), new n3(g0Var, this.f40472h, this.f40477m, r3Var));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("У"));
                t1(g0Var, n4.f40533u, zzjs.zzaE, null);
            }
        } catch (DeadObjectException e4) {
            t1(g0Var, n4.f40522j, zzjs.zzaC, e4);
        } catch (Exception e5) {
            t1(g0Var, n4.f40520h, zzjs.zzaC, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(h0 h0Var, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 25, yVar, i4.a(exc));
        h0Var.a(yVar);
    }

    private final /* synthetic */ Void v0(e eVar, Activity activity, ResultReceiver resultReceiver) throws Exception {
        zzar zzarVar;
        try {
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            if (zzarVar == null) {
                x1(eVar, n4.f40522j, zzjs.zzbc, null);
            } else {
                zzarVar.zzn(21, this.f40471g.getPackageName(), zzc.zzh(this.f40467c, this.f40468d, this.M.longValue()), new h3(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e4) {
            x1(eVar, n4.f40522j, zzjs.zzav, e4);
        } catch (Exception e5) {
            x1(eVar, n4.f40520h, zzjs.zzav, e5);
        }
        return null;
    }

    private final void v1(p pVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Х"), exc);
        i1(zzjsVar, 13, yVar, i4.a(exc));
        pVar.a(yVar, null);
    }

    private final /* synthetic */ Void w0(t tVar, u uVar, Activity activity) throws Exception {
        zzar zzarVar;
        try {
            if (!J1(w4.b())) {
                y1(tVar, n4.f40522j, zzjs.zzb, null);
            } else if (this.F) {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    y1(tVar, n4.f40522j, zzjs.zzbc, null);
                } else {
                    String packageName = this.f40471g.getPackageName();
                    String str = this.f40468d;
                    long longValue = this.M.longValue();
                    int i4 = zzc.zza;
                    String s4 = ProtectedSandApp.s("ϊ");
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, s4, str, longValue);
                    zzij zza = zzim.zza();
                    String s5 = ProtectedSandApp.s("Ч");
                    zzjd zza2 = zzjf.zza();
                    zza2.zza(String.valueOf(uVar.a()));
                    zza.zza(s5, (zzjf) zza2.zzi());
                    if (uVar.b() != null) {
                        String s6 = ProtectedSandApp.s("ϣ");
                        zzjd zza3 = zzjf.zza();
                        zza3.zza(uVar.b());
                        zza.zza(s6, (zzjf) zza3.zzi());
                    }
                    bundle.putByteArray(ProtectedSandApp.s("Ϥ"), ((zzim) zza.zzi()).zzQ());
                    zzarVar.zzn(28, packageName, bundle, new p3(new WeakReference(activity), new zzbn(this, this.f40469e, tVar), null));
                }
            } else {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ц"));
                y1(tVar, n4.J, zzjs.zzbP, null);
            }
        } catch (DeadObjectException e4) {
            y1(tVar, n4.f40522j, zzjs.zzbb, e4);
        } catch (RuntimeException e5) {
            y1(tVar, n4.f40520h, zzjs.zzbb, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(r0 r0Var, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 37, yVar, i4.a(exc));
        r0Var.a(yVar);
    }

    private final /* synthetic */ Void x0(h0 h0Var, Activity activity, ResultReceiver resultReceiver) throws Exception {
        zzar zzarVar;
        try {
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            if (zzarVar == null) {
                u1(h0Var, n4.f40522j, zzjs.zzbc, null);
            } else {
                zzarVar.zzp(22, this.f40471g.getPackageName(), zzc.zzh(this.f40467c, this.f40468d, this.M.longValue()), new j3(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e4) {
            u1(h0Var, n4.f40522j, zzjs.zzaJ, e4);
        } catch (Exception e5) {
            u1(h0Var, n4.f40520h, zzjs.zzaJ, e5);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(e eVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 16, yVar, i4.a(exc));
        eVar.a(yVar);
    }

    private void y(Context context, a1 a1Var, s0 s0Var, @androidx.annotation.q0 f1 f1Var, @androidx.annotation.q0 e0 e0Var, String str, @androidx.annotation.q0 j4 j4Var, j.c cVar) {
        String s4 = ProtectedSandApp.s("ϋ");
        this.f40471g = context.getApplicationContext();
        zzke zza = zzkg.zza();
        zza.zzx(str);
        String str2 = this.f40468d;
        if (str2 != null) {
            zza.zzy(str2);
        }
        zza.zzq(this.f40471g.getPackageName());
        zza.zzd(this.M.longValue());
        zza.zzw(cVar.f40414q);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(926300087L);
        c1(zza, context);
        try {
            zza.zzb(this.f40471g.getPackageManager().getPackageInfo(this.f40471g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo(s4, ProtectedSandApp.s("ό"), th);
        }
        if (j4Var != null) {
            this.f40472h = j4Var;
        } else {
            this.f40472h = new x4(this.f40471g, (zzkg) zza.zzi());
        }
        if (a1Var == null) {
            zzc.zzn(s4, ProtectedSandApp.s("ύ"));
        }
        this.f40470f = new a7(this.f40471g, a1Var, null, f1Var, e0Var, this.f40472h);
        this.G = s0Var;
        this.I = f1Var != null;
        this.H = cVar.f40414q;
    }

    @androidx.annotation.q0
    private final Future y0(Callable callable, long j4, @androidx.annotation.q0 final Runnable runnable, Handler handler) throws Exception {
        try {
            final Future submit = O().submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.v2
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzc.zzn(ProtectedSandApp.s("מ"), ProtectedSandApp.s("ן"));
                    runnable2.run();
                }
            }, 28500L);
            return submit;
        } catch (Exception e4) {
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ϲ"), e4);
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(t tVar, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        i1(zzjsVar, 39, yVar, i4.a(exc));
        tVar.a(yVar);
    }

    private void z(Context context, a1 a1Var, s0 s0Var, String str, @androidx.annotation.q0 j4 j4Var, j.c cVar) {
        String s4 = ProtectedSandApp.s("ϋ");
        this.f40471g = context.getApplicationContext();
        zzke zza = zzkg.zza();
        zza.zzx(str);
        String str2 = this.f40468d;
        if (str2 != null) {
            zza.zzy(str2);
        }
        zza.zzq(this.f40471g.getPackageName());
        zza.zzd(this.M.longValue());
        zza.zzw(cVar.f40414q);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(926300087L);
        c1(zza, context);
        try {
            zza.zzb(this.f40471g.getPackageManager().getPackageInfo(this.f40471g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo(s4, ProtectedSandApp.s("ό"), th);
        }
        if (j4Var != null) {
            this.f40472h = j4Var;
        } else {
            this.f40472h = new x4(this.f40471g, (zzkg) zza.zzi());
        }
        if (a1Var == null) {
            zzc.zzn(s4, ProtectedSandApp.s("ύ"));
        }
        this.f40470f = new a7(this.f40471g, a1Var, null, null, null, this.f40472h);
        this.G = s0Var;
        this.f40471g.getPackageName();
        this.H = cVar.f40414q;
    }

    private final void z0(z zVar, a0 a0Var) {
        zzar zzarVar;
        int zza;
        String str;
        String s4 = ProtectedSandApp.s("Ш");
        String a5 = zVar.a();
        try {
            zzc.zzm(ProtectedSandApp.s("ϋ"), s4 + a5);
            synchronized (this.f40465a) {
                zzarVar = this.f40473i;
            }
            if (zzarVar == null) {
                p1(a0Var, a5, n4.f40522j, zzjs.zzbc, ProtectedSandApp.s("Щ"), null);
                return;
            }
            if (this.f40480p) {
                String packageName = this.f40471g.getPackageName();
                boolean z4 = this.f40480p;
                String str2 = this.f40468d;
                long longValue = this.M.longValue();
                String s5 = ProtectedSandApp.s("ϊ");
                Bundle bundle = new Bundle();
                if (z4) {
                    zzc.zzc(bundle, s5, str2, longValue);
                }
                Bundle zze = zzarVar.zze(9, packageName, a5, bundle);
                zza = zze.getInt(ProtectedSandApp.s("Ъ"));
                str = zzc.zzj(zze, ProtectedSandApp.s("ϋ"));
            } else {
                zza = zzarVar.zza(3, this.f40471g.getPackageName(), a5);
                str = "";
            }
            y a6 = n4.a(zza, str);
            if (zza != 0) {
                p1(a0Var, a5, a6, zzjs.zzw, h1.a(zza, ProtectedSandApp.s("Ь")), null);
            } else {
                zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ы"));
                a0Var.a(a6, a5);
            }
        } catch (DeadObjectException e4) {
            p1(a0Var, a5, n4.f40522j, zzjs.zzC, ProtectedSandApp.s("Э"), e4);
        } catch (Exception e5) {
            p1(a0Var, a5, n4.f40520h, zzjs.zzC, ProtectedSandApp.s("Э"), e5);
        }
    }

    private final void z1(int i4, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        zzjl zzjlVar;
        zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ю"), exc);
        j4 j4Var = this.f40472h;
        String a5 = i4.a(exc);
        try {
            zzjq zza = zzju.zza();
            zza.zzp(i4);
            if (zzjsVar != null) {
                zza.zze(zzjsVar);
            }
            if (a5 != null) {
                zza.zza(a5);
            }
            zzjj zza2 = zzjl.zza();
            zza2.zzb(zza);
            zza2.zzp(30);
            zzjlVar = (zzjl) zza2.zzi();
        } catch (Throwable th) {
            zzc.zzo(ProtectedSandApp.s("Ў"), ProtectedSandApp.s("Ѝ"), th);
            zzjlVar = null;
        }
        j4Var.m(zzjlVar);
    }

    final synchronized ExecutorService O() {
        try {
            if (this.L == null) {
                this.L = Executors.newFixedThreadPool(zzc.zza, new w2(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.L;
    }

    @androidx.annotation.m1
    final q3 S1(b1 b1Var) throws JSONException {
        zzar zzarVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String c5 = b1Var.c();
        zzca b5 = b1Var.b();
        int size = b5.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 20;
            ArrayList arrayList3 = new ArrayList(b5.subList(i4, i5 > size ? size : i5));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList4.add(((b1.b) arrayList3.get(i6)).c());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(ProtectedSandApp.s("Я"), arrayList4);
            String str = this.f40467c;
            bundle.putString(ProtectedSandApp.s("Ϙ"), str);
            try {
                synchronized (this.f40465a) {
                    zzarVar = this.f40473i;
                }
                if (zzarVar == null) {
                    return g0(n4.f40522j, zzjs.zzbc, ProtectedSandApp.s("Щ"), null);
                }
                boolean z4 = this.f40487w && this.G.b();
                o0(b1Var);
                o0(b1Var);
                o0(b1Var);
                o0(b1Var);
                Bundle zzj = zzarVar.zzj(true != this.f40488x ? 17 : 20, this.f40471g.getPackageName(), c5, bundle, zzc.zzg(str, this.f40468d, arrayList3, null, null, zza.zza(z4, true, true, true, false, true), this.M.longValue()));
                if (zzj == null) {
                    return g0(n4.B, zzjs.zzR, ProtectedSandApp.s("а"), null);
                }
                if (!zzj.containsKey(ProtectedSandApp.s("б"))) {
                    int zzb = zzc.zzb(zzj, ProtectedSandApp.s("ϋ"));
                    String zzj2 = zzc.zzj(zzj, ProtectedSandApp.s("ϋ"));
                    if (zzb != 0) {
                        return g0(n4.a(zzb, zzj2), zzjs.zzw, h1.a(zzb, ProtectedSandApp.s("в")), null);
                    }
                    return g0(n4.a(6, zzj2), zzjs.zzS, ProtectedSandApp.s("г"), null);
                }
                ArrayList<String> stringArrayList = zzj.getStringArrayList(ProtectedSandApp.s("б"));
                if (stringArrayList == null) {
                    return g0(n4.B, zzjs.zzT, ProtectedSandApp.s("д"), null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    try {
                        t0 t0Var = new t0(stringArrayList.get(i7));
                        zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("е").concat(t0Var.toString()));
                        arrayList5.add(t0Var);
                    } catch (JSONException e4) {
                        return g0(n4.a(6, ProtectedSandApp.s("ж")), zzjs.zzU, ProtectedSandApp.s("з"), e4);
                    }
                }
                ArrayList<String> stringArrayList2 = zzj.getStringArrayList(ProtectedSandApp.s("и"));
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            b1.b bVar = (b1.b) it.next();
                            Iterator it2 = arrayList5.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    arrayList6.add(new e1(new JSONObject().put(ProtectedSandApp.s("к"), bVar.c()).put(ProtectedSandApp.s("л"), bVar.d()).put(ProtectedSandApp.s("м"), 0).toString()));
                                    break;
                                }
                                t0 t0Var2 = (t0) it2.next();
                                if (!bVar.c().equals(t0Var2.e()) || !bVar.d().equals(t0Var2.f())) {
                                }
                            }
                        }
                    } else {
                        Iterator<String> it3 = stringArrayList2.iterator();
                        while (it3.hasNext()) {
                            e1 e1Var = new e1(it3.next());
                            zzc.zzm(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("й").concat(e1Var.toString()));
                            arrayList6.add(e1Var);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i4 = i5;
                } catch (JSONException e5) {
                    return g0(n4.a(6, ProtectedSandApp.s("ж")), zzjs.zzU, ProtectedSandApp.s("н"), e5);
                }
            } catch (DeadObjectException e6) {
                return g0(n4.f40522j, zzjs.zzQ, ProtectedSandApp.s("о"), e6);
            } catch (Exception e7) {
                return g0(n4.f40520h, zzjs.zzQ, ProtectedSandApp.s("о"), e7);
            }
        }
        return new q3(0, "", arrayList, arrayList2);
    }

    final j4 V1() {
        return this.f40472h;
    }

    public final void Y0(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f40469e.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y Y1(final y yVar) {
        if (Thread.interrupted()) {
            return yVar;
        }
        this.f40469e.post(new Runnable() { // from class: com.android.billingclient.api.s1
            @Override // java.lang.Runnable
            public final void run() {
                m.D0(m.this, yVar);
            }
        });
        return yVar;
    }

    @Override // com.android.billingclient.api.j
    public void a(final b bVar, final c cVar) {
        if (P(new Callable() { // from class: com.android.billingclient.api.r1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.i2(m.this, cVar, bVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.t1
            @Override // java.lang.Runnable
            public final void run() {
                m.X(m.this, cVar);
            }
        }, f0(), O()) == null) {
            y i02 = i0();
            g1(zzjs.zzy, 3, i02);
            cVar.a(i02);
        }
    }

    @Override // com.android.billingclient.api.j
    public void b(final z zVar, final a0 a0Var) {
        if (P(new Callable() { // from class: com.android.billingclient.api.l2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.g2(m.this, a0Var, zVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.m2
            @Override // java.lang.Runnable
            public final void run() {
                m.R(m.this, a0Var, zVar);
            }
        }, f0(), O()) == null) {
            y i02 = i0();
            g1(zzjs.zzy, 4, i02);
            a0Var.a(i02, zVar.a());
        }
    }

    @Override // com.android.billingclient.api.j
    @e3
    public void c(final g gVar) {
        if (P(new Callable() { // from class: com.android.billingclient.api.f2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.L(m.this, gVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.g2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.q1(gVar, n4.f40523k, zzjs.zzx, null);
            }
        }, f0(), O()) == null) {
            q1(gVar, i0(), zzjs.zzy, null);
        }
    }

    @Override // com.android.billingclient.api.j
    @e6
    public void d(final x xVar, final w wVar) {
        try {
            y0(new Callable() { // from class: com.android.billingclient.api.y1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    m.M(m.this, wVar, xVar);
                    return null;
                }
            }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.z1
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.r1(wVar, n4.f40523k, zzjs.zzx, null);
                }
            }, f0());
        } catch (Exception e4) {
            r1(wVar, i0(), zzjs.zzy, e4);
        }
    }

    @Override // com.android.billingclient.api.j
    @h6
    public void e(final j0 j0Var) {
        if (P(new Callable() { // from class: com.android.billingclient.api.d2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.J(m.this, j0Var);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.n2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.s1(j0Var, n4.f40523k, zzjs.zzx, null);
            }
        }, f0(), O()) == null) {
            s1(j0Var, i0(), zzjs.zzy, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:3|4|(1:6))|(2:8|9)|10|11|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        com.google.android.gms.internal.play_billing.zzc.zzo(com.flashget.parentalcontrol.ProtectedSandApp.s("ϋ"), com.flashget.parentalcontrol.ProtectedSandApp.s("т"), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        E1(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        E1(3);
        r6.K = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        throw r3;
     */
    @Override // com.android.billingclient.api.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r6 = this;
            r0 = 12
            r6.l1(r0)
            java.lang.Object r0 = r6.f40465a
            monitor-enter(r0)
            com.android.billingclient.api.a7 r1 = r6.f40470f     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L22
            com.android.billingclient.api.a7 r1 = r6.f40470f     // Catch: java.lang.Throwable -> L12
            r1.h()     // Catch: java.lang.Throwable -> L12
            goto L22
        L12:
            r1 = move-exception
            java.lang.String r2 = "ϋ"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "п"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.play_billing.zzc.zzo(r2, r3, r1)     // Catch: java.lang.Throwable -> L50
        L22:
            java.lang.String r1 = "ϋ"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "р"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.play_billing.zzc.zzm(r1, r2)     // Catch: java.lang.Throwable -> L35
            r6.H1()     // Catch: java.lang.Throwable -> L35
            goto L45
        L35:
            r1 = move-exception
            java.lang.String r2 = "ϋ"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "с"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.play_billing.zzc.zzo(r2, r3, r1)     // Catch: java.lang.Throwable -> L50
        L45:
            r1 = 0
            r2 = 3
            r6.F1()     // Catch: java.lang.Throwable -> L52
            r6.E1(r2)     // Catch: java.lang.Throwable -> L50
        L4d:
            r6.K = r1     // Catch: java.lang.Throwable -> L50
            goto L66
        L50:
            r1 = move-exception
            goto L6f
        L52:
            r3 = move-exception
            java.lang.String r4 = "ϋ"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "т"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)     // Catch: java.lang.Throwable -> L68
            com.google.android.gms.internal.play_billing.zzc.zzo(r4, r5, r3)     // Catch: java.lang.Throwable -> L68
            r6.E1(r2)     // Catch: java.lang.Throwable -> L50
            goto L4d
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            return
        L68:
            r3 = move-exception
            r6.E1(r2)     // Catch: java.lang.Throwable -> L50
            r6.K = r1     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L50
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.m.f():void");
    }

    @Override // com.android.billingclient.api.j
    @g5
    public void g(final k0 k0Var, final i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ф"));
        }
        if (k0Var == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("у"));
        }
        if (P(new Callable() { // from class: com.android.billingclient.api.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.f2(m.this, iVar, k0Var);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.t2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.n1(iVar, n4.f40523k, zzjs.zzx, null);
            }
        }, f0(), O()) == null) {
            n1(iVar, i0(), zzjs.zzy, null);
        }
    }

    @Override // com.android.billingclient.api.j
    @k6
    public void h(l0 l0Var, final p pVar) {
        if (P(new Callable() { // from class: com.android.billingclient.api.a2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.A(m.this, pVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.b2
            @Override // java.lang.Runnable
            public final void run() {
                m.T(m.this, pVar);
            }
        }, f0(), O()) == null) {
            y i02 = i0();
            g1(zzjs.zzy, 13, i02);
            pVar.a(i02, null);
        }
    }

    @Override // com.android.billingclient.api.j
    public final int i() {
        int i4;
        synchronized (this.f40465a) {
            i4 = this.f40466b;
        }
        return i4;
    }

    @Override // com.android.billingclient.api.j
    @e3
    public void j(final d dVar) {
        if (P(new Callable() { // from class: com.android.billingclient.api.h2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.N(m.this, dVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.j2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.m1(dVar, n4.f40523k, zzjs.zzx, null);
            }
        }, f0(), O()) == null) {
            m1(dVar, i0(), zzjs.zzy, null);
        }
    }

    @Override // com.android.billingclient.api.j
    @e6
    public void k(final int i4, final s sVar) {
        if (P(new Callable() { // from class: com.android.billingclient.api.w1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.G(m.this, sVar, i4);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.x1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.o1(sVar, i4, n4.f40523k, zzjs.zzx, null);
            }
        }, f0(), O()) == null) {
            o1(sVar, i4, i0(), zzjs.zzy, null);
        }
    }

    @Override // com.android.billingclient.api.j
    @h6
    public void l(final g0 g0Var) {
        if (P(new Callable() { // from class: com.android.billingclient.api.l1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.F(m.this, g0Var);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.m1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.t1(g0Var, n4.f40523k, zzjs.zzx, null);
            }
        }, f0(), O()) == null) {
            t1(g0Var, i0(), zzjs.zzy, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.j
    public final y m(String str) {
        char c5;
        if (!I1(w4.c())) {
            y yVar = n4.f40522j;
            zzjs zzjsVar = zzjs.zzb;
            if (yVar.c() != 0) {
                g1(zzjsVar, 5, yVar);
            } else {
                l1(5);
            }
            return yVar;
        }
        int i4 = n4.L;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(ProtectedSandApp.s("і"))) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 96321:
                if (str.equals(ProtectedSandApp.s("ѕ"))) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 97314:
                if (str.equals(ProtectedSandApp.s("є"))) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 98307:
                if (str.equals(ProtectedSandApp.s("ѓ"))) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case 99300:
                if (str.equals(ProtectedSandApp.s("ђ"))) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 100293:
                if (str.equals(ProtectedSandApp.s("ё"))) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case 101286:
                if (str.equals(ProtectedSandApp.s("ѐ"))) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 102279:
                if (str.equals(ProtectedSandApp.s("я"))) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case 103272:
                if (str.equals(ProtectedSandApp.s("ю"))) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case 104265:
                if (str.equals(ProtectedSandApp.s("э"))) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case 105258:
                if (str.equals(ProtectedSandApp.s("ь"))) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case 106251:
                if (str.equals(ProtectedSandApp.s("ы"))) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case 107244:
                if (str.equals(ProtectedSandApp.s("ъ"))) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case 108237:
                if (str.equals(ProtectedSandApp.s("щ"))) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case 109230:
                if (str.equals(ProtectedSandApp.s("ш"))) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 110223:
                if (str.equals(ProtectedSandApp.s("ч"))) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case 207616302:
                if (str.equals(ProtectedSandApp.s("ц"))) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 1987365622:
                if (str.equals(ProtectedSandApp.s("х"))) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                y yVar2 = this.f40475k ? n4.f40521i : n4.f40524l;
                f1(yVar2, zzjs.zzi, 2);
                return yVar2;
            case 1:
                y yVar3 = this.f40476l ? n4.f40521i : n4.f40525m;
                f1(yVar3, zzjs.zzj, 3);
                return yVar3;
            case 2:
                y yVar4 = this.f40479o ? n4.f40521i : n4.f40526n;
                f1(yVar4, zzjs.zzI, 4);
                return yVar4;
            case 3:
                y yVar5 = this.f40481q ? n4.f40521i : n4.f40532t;
                f1(yVar5, zzjs.zzD, 5);
                return yVar5;
            case 4:
                y yVar6 = this.f40483s ? n4.f40521i : n4.f40527o;
                f1(yVar6, zzjs.zzE, 6);
                return yVar6;
            case 5:
                y yVar7 = this.f40482r ? n4.f40521i : n4.f40529q;
                f1(yVar7, zzjs.zzu, 7);
                return yVar7;
            case 6:
                y yVar8 = this.f40484t ? n4.f40521i : n4.f40528p;
                f1(yVar8, zzjs.zzs, 8);
                return yVar8;
            case 7:
                y yVar9 = this.f40484t ? n4.f40521i : n4.f40528p;
                f1(yVar9, zzjs.zzai, 9);
                return yVar9;
            case '\b':
                y yVar10 = this.f40485u ? n4.f40521i : n4.f40531s;
                f1(yVar10, zzjs.zzt, 10);
                return yVar10;
            case '\t':
                y yVar11 = this.f40486v ? n4.f40521i : n4.f40538z;
                f1(yVar11, zzjs.zzF, 11);
                return yVar11;
            case '\n':
                y yVar12 = this.f40486v ? n4.f40521i : n4.A;
                f1(yVar12, zzjs.zzG, 12);
                return yVar12;
            case 11:
                y yVar13 = this.f40488x ? n4.f40521i : n4.C;
                f1(yVar13, zzjs.zzah, 13);
                return yVar13;
            case '\f':
                y yVar14 = this.f40489y ? n4.f40521i : n4.D;
                f1(yVar14, zzjs.zzan, 14);
                return yVar14;
            case '\r':
                y yVar15 = this.B ? n4.f40521i : n4.f40533u;
                f1(yVar15, zzjs.zzaE, 18);
                return yVar15;
            case 14:
                y yVar16 = this.A ? n4.f40521i : n4.f40534v;
                f1(yVar16, zzjs.zzaZ, 19);
                return yVar16;
            case 15:
                y yVar17 = this.B ? n4.f40521i : n4.f40535w;
                f1(yVar17, zzjs.zzbo, 20);
                return yVar17;
            case 16:
                y yVar18 = this.C ? n4.f40521i : n4.f40536x;
                f1(yVar18, zzjs.zzbH, 21);
                return yVar18;
            case 17:
                y yVar19 = this.E ? n4.f40521i : n4.f40530r;
                f1(yVar19, zzjs.zzbM, 22);
                return yVar19;
            default:
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ї").concat(str));
                y yVar20 = n4.f40537y;
                f1(yVar20, zzjs.zzH, 1);
                return yVar20;
        }
    }

    @Override // com.android.billingclient.api.j
    public final boolean n() {
        if (this.H) {
            return true;
        }
        return K1();
    }

    @Override // com.android.billingclient.api.j
    public y o(Activity activity, final q qVar) {
        boolean g4;
        String str;
        long j4;
        boolean z4;
        Future P;
        boolean z5;
        zzjs zzjsVar;
        String string;
        String str2;
        String str3;
        String str4;
        boolean z6;
        long nextLong = new Random().nextLong();
        if (this.f40470f == null || this.f40470f.e() == null) {
            zzjs zzjsVar2 = zzjs.zzl;
            y yVar = n4.E;
            h1(zzjsVar2, 2, yVar, nextLong);
            return yVar;
        }
        if (qVar.a() != null && this.f40470f.c() == null) {
            zzjs zzjsVar3 = zzjs.zzbJ;
            y yVar2 = n4.I;
            h1(zzjsVar3, 2, yVar2, nextLong);
            return yVar2;
        }
        if (!I1(w4.c())) {
            zzjs zzjsVar4 = zzjs.zzb;
            y yVar3 = n4.f40522j;
            h1(zzjsVar4, 2, yVar3, nextLong);
            Y1(yVar3);
            return yVar3;
        }
        synchronized (this.f40465a) {
            try {
                g4 = this.f40474j != null ? this.f40474j.g() : false;
            } finally {
            }
        }
        ArrayList l4 = qVar.l();
        List m4 = qVar.m();
        b6 b6Var = (b6) zzcg.zza(l4, null);
        q.b bVar = (q.b) zzcg.zza(m4, null);
        if (b6Var != null) {
            throw null;
        }
        final String e4 = bVar.c().e();
        final String f4 = bVar.c().f();
        if (f4.equals(ProtectedSandApp.s("ј")) && !this.f40475k) {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("љ"));
            zzjs zzjsVar5 = zzjs.zzi;
            y yVar4 = n4.f40524l;
            j1(zzjsVar5, 2, yVar4, nextLong, g4);
            Y1(yVar4);
            return yVar4;
        }
        if (qVar.w() && !this.f40478n) {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("њ"));
            zzjs zzjsVar6 = zzjs.zzr;
            y yVar5 = n4.f40518f;
            j1(zzjsVar6, 2, yVar5, nextLong, g4);
            Y1(yVar5);
            return yVar5;
        }
        if (l4.size() > 1 && !this.f40484t) {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ћ"));
            zzjs zzjsVar7 = zzjs.zzs;
            y yVar6 = n4.f40528p;
            j1(zzjsVar7, 2, yVar6, nextLong, g4);
            Y1(yVar6);
            return yVar6;
        }
        if (!m4.isEmpty() && !this.f40485u) {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ќ"));
            zzjs zzjsVar8 = zzjs.zzt;
            y yVar7 = n4.f40531s;
            j1(zzjsVar8, 2, yVar7, nextLong, g4);
            Y1(yVar7);
            return yVar7;
        }
        Iterator it = m4.iterator();
        while (it.hasNext()) {
            String d5 = ((q.b) it.next()).d();
            if (d5 != null && d5.contains(ProtectedSandApp.s("ѝ")) && !this.E) {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ў"));
                zzjs zzjsVar9 = zzjs.zzbM;
                y yVar8 = n4.f40530r;
                j1(zzjsVar9, 2, yVar8, nextLong, g4);
                Y1(yVar8);
                return yVar8;
            }
        }
        y f5 = qVar.f();
        if (f5 != n4.f40521i) {
            j1(zzjs.zzbd, 2, f5, nextLong, g4);
            Y1(f5);
            return f5;
        }
        if (this.f40478n) {
            z4 = g4;
            final Bundle zzf = zzc.zzf(qVar, this.f40480p, this.f40487w, this.G.a(), this.G.b(), this.I, this.f40467c, this.f40468d, this.M.longValue(), this.f40471g.getPackageName(), nextLong);
            if (l4.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(m4.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(m4.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                int i4 = 0;
                while (i4 < m4.size()) {
                    q.b bVar2 = (q.b) m4.get(i4);
                    t0 c5 = bVar2.c();
                    if (c5.j().isEmpty()) {
                        str3 = e4;
                    } else {
                        str3 = e4;
                        arrayList3.add(c5.j());
                    }
                    String d6 = bVar2.d();
                    arrayList4.add(d6);
                    String k4 = c5.k(d6);
                    if (!TextUtils.isEmpty(k4)) {
                        arrayList5.add(k4);
                    }
                    if (i4 > 0) {
                        arrayList.add(((q.b) m4.get(i4)).c().e());
                        arrayList2.add(((q.b) m4.get(i4)).c().f());
                    }
                    i4++;
                    e4 = str3;
                }
                str2 = e4;
                zzf.putStringArrayList(ProtectedSandApp.s("Ѣ"), arrayList4);
                if (!arrayList6.isEmpty()) {
                    zzf.putIntegerArrayList(ProtectedSandApp.s("ѣ"), arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    zzf.putStringArrayList(ProtectedSandApp.s("џ"), arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    zzf.putStringArrayList(ProtectedSandApp.s("Ѥ"), arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    zzf.putStringArrayList(ProtectedSandApp.s("Ѡ"), arrayList);
                    zzf.putStringArrayList(ProtectedSandApp.s("ѡ"), arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = l4.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    zzf.putStringArrayList(ProtectedSandApp.s("џ"), arrayList7);
                }
                if (l4.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(l4.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(l4.size() - 1);
                    if (l4.size() > 1) {
                        throw null;
                    }
                    zzf.putStringArrayList(ProtectedSandApp.s("Ѡ"), arrayList8);
                    zzf.putStringArrayList(ProtectedSandApp.s("ѡ"), arrayList9);
                }
                str2 = e4;
            }
            if (zzf.containsKey(ProtectedSandApp.s("Ѣ")) && !this.f40482r) {
                zzjs zzjsVar10 = zzjs.zzu;
                y yVar9 = n4.f40529q;
                j1(zzjsVar10, 2, yVar9, nextLong, z4);
                Y1(yVar9);
                return yVar9;
            }
            if (TextUtils.isEmpty(bVar.c().i())) {
                str4 = null;
                z6 = false;
            } else {
                zzf.putString(ProtectedSandApp.s("ѥ"), bVar.c().i());
                str4 = null;
                z6 = true;
            }
            if (!TextUtils.isEmpty(str4)) {
                zzf.putString(ProtectedSandApp.s("К"), str4);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ѧ"));
            } else if (!TextUtils.isEmpty(intent.getStringExtra(ProtectedSandApp.s("ѧ")))) {
                String stringExtra = intent.getStringExtra(ProtectedSandApp.s("ѧ"));
                zzf.putString(ProtectedSandApp.s("Ѩ"), stringExtra);
                try {
                    zzf.putString(ProtectedSandApp.s("ѩ"), this.f40471g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    zzf.putString(ProtectedSandApp.s("ѩ"), ProtectedSandApp.s("Ѫ"));
                }
            }
            final int i5 = this.E ? 28 : (!this.f40485u || m4.isEmpty()) ? (this.f40483s && z6) ? 15 : this.f40480p ? 9 : 6 : 17;
            final String str5 = str2;
            str = str4;
            j4 = nextLong;
            P = P(new Callable() { // from class: com.android.billingclient.api.n1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle d02;
                    d02 = m.this.d0(i5, str5, f4, qVar, zzf);
                    return d02;
                }
            }, C1434k.f30360a, null, this.f40469e, O());
        } else {
            str = null;
            j4 = nextLong;
            z4 = g4;
            P = P(new Callable() { // from class: com.android.billingclient.api.o1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle e02;
                    e02 = m.this.e0(e4, f4);
                    return e02;
                }
            }, C1434k.f30360a, null, this.f40469e, O());
        }
        try {
            if (P == null) {
                zzjs zzjsVar11 = zzjs.zzy;
                y yVar10 = n4.f40515c;
                j1(zzjsVar11, 2, yVar10, j4, z4);
                Y1(yVar10);
                return yVar10;
            }
            Bundle bundle = (Bundle) P.get(C1434k.f30360a, TimeUnit.MILLISECONDS);
            int zzb = zzc.zzb(bundle, ProtectedSandApp.s("ϋ"));
            String zzj = zzc.zzj(bundle, ProtectedSandApp.s("ϋ"));
            if (zzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra(ProtectedSandApp.s("ѱ"), (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("ѱ")));
                intent2.putExtra(ProtectedSandApp.s("Ѳ"), j4);
                z5 = z4;
                try {
                    intent2.putExtra(ProtectedSandApp.s("ѳ"), z5);
                    activity.startActivity(intent2);
                    return n4.f40521i;
                } catch (CancellationException e5) {
                    e = e5;
                    zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ѵ"), e);
                    zzjs zzjsVar12 = zzjs.zzd;
                    y yVar11 = n4.f40523k;
                    k1(zzjsVar12, 2, yVar11, i4.a(e), j4, z5);
                    Y1(yVar11);
                    return yVar11;
                } catch (TimeoutException e6) {
                    e = e6;
                    zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ѵ"), e);
                    zzjs zzjsVar122 = zzjs.zzd;
                    y yVar112 = n4.f40523k;
                    k1(zzjsVar122, 2, yVar112, i4.a(e), j4, z5);
                    Y1(yVar112);
                    return yVar112;
                } catch (Exception e7) {
                    e = e7;
                    zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ѵ"), e);
                    zzjs zzjsVar13 = zzjs.zze;
                    y yVar12 = n4.f40522j;
                    k1(zzjsVar13, 2, yVar12, i4.a(e), j4, z5);
                    Y1(yVar12);
                    return yVar12;
                }
            }
            zzc.zzn(ProtectedSandApp.s("ϋ"), h1.a(zzb, ProtectedSandApp.s("ѫ")));
            y a5 = n4.a(zzb, zzj);
            String s4 = ProtectedSandApp.s("ϋ");
            try {
                if (bundle == null) {
                    zzjsVar = zzjs.zza;
                } else {
                    Object obj = bundle.get(ProtectedSandApp.s("Ѭ"));
                    if (obj == null) {
                        zzjsVar = zzjs.zza;
                    } else if (obj instanceof Integer) {
                        zzjsVar = zzjs.zzb(((Integer) obj).intValue());
                    } else {
                        zzc.zzn(s4, ProtectedSandApp.s("ѭ") + obj.getClass().getName());
                        zzjsVar = zzjs.zza;
                    }
                }
            } catch (Throwable th) {
                zzc.zzn(s4, ProtectedSandApp.s("Ѯ").concat(String.valueOf(th.getMessage())));
                zzjsVar = zzjs.zza;
            }
            if (zzjsVar == zzjs.zza) {
                zzjsVar = zzjs.zzw;
            }
            zzjs zzjsVar14 = zzjsVar;
            String s5 = ProtectedSandApp.s("ϋ");
            if (bundle != null) {
                try {
                    string = bundle.getString(ProtectedSandApp.s("ѯ"));
                } catch (Throwable th2) {
                    zzc.zzn(s5, ProtectedSandApp.s("Ѱ").concat(String.valueOf(th2.getMessage())));
                }
                k1(zzjsVar14, 2, a5, string, j4, z4);
                Y1(a5);
                return a5;
            }
            string = str;
            k1(zzjsVar14, 2, a5, string, j4, z4);
            Y1(a5);
            return a5;
        } catch (CancellationException e10) {
            e = e10;
            z5 = z4;
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ѵ"), e);
            zzjs zzjsVar1222 = zzjs.zzd;
            y yVar1122 = n4.f40523k;
            k1(zzjsVar1222, 2, yVar1122, i4.a(e), j4, z5);
            Y1(yVar1122);
            return yVar1122;
        } catch (TimeoutException e11) {
            e = e11;
            z5 = z4;
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ѵ"), e);
            zzjs zzjsVar12222 = zzjs.zzd;
            y yVar11222 = n4.f40523k;
            k1(zzjsVar12222, 2, yVar11222, i4.a(e), j4, z5);
            Y1(yVar11222);
            return yVar11222;
        } catch (Exception e12) {
            e = e12;
            z5 = z4;
            zzc.zzo(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ѵ"), e);
            zzjs zzjsVar132 = zzjs.zze;
            y yVar122 = n4.f40522j;
            k1(zzjsVar132, 2, yVar122, i4.a(e), j4, z5);
            Y1(yVar122);
            return yVar122;
        }
    }

    @Override // com.android.billingclient.api.j
    @m6
    public void p(final Activity activity, final q0 q0Var, final r0 r0Var) {
        if (activity == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ѷ"));
        }
        try {
            y0(new Callable() { // from class: com.android.billingclient.api.c2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    m.H(m.this, r0Var, q0Var, activity);
                    return null;
                }
            }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.e2
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.w1(r0Var, n4.f40523k, zzjs.zzx, null);
                }
            }, f0());
        } catch (Exception e4) {
            w1(r0Var, i0(), zzjs.zzbb, e4);
        }
    }

    @Override // com.android.billingclient.api.j
    public void r(final b1 b1Var, final u0 u0Var) {
        if (P(new Callable() { // from class: com.android.billingclient.api.q2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.h2(m.this, u0Var, b1Var);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.r2
            @Override // java.lang.Runnable
            public final void run() {
                m.B0(m.this, u0Var);
            }
        }, f0(), O()) == null) {
            y i02 = i0();
            g1(zzjs.zzy, 7, i02);
            u0Var.a(i02, new c1(zzca.zzk(), zzca.zzk()));
        }
    }

    @Override // com.android.billingclient.api.j
    public final void s(d1 d1Var, final z0 z0Var) {
        if (P(new x2(this, z0Var, d1Var.c(), d1Var.a()), androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.k1
            @Override // java.lang.Runnable
            public final void run() {
                m.S(m.this, z0Var);
            }
        }, f0(), O()) == null) {
            y i02 = i0();
            g1(zzjs.zzy, 9, i02);
            z0Var.a(i02, zzca.zzk());
        }
    }

    @Override // com.android.billingclient.api.j
    @e3
    public y t(final Activity activity, final e eVar) {
        if (activity == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ѷ"));
        }
        if (!I1(w4.c())) {
            zzjs zzjsVar = zzjs.zzb;
            y yVar = n4.f40522j;
            g1(zzjsVar, 16, yVar);
            return yVar;
        }
        if (!this.f40489y) {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("ѷ"));
            zzjs zzjsVar2 = zzjs.zzan;
            y yVar2 = n4.D;
            g1(zzjsVar2, 16, yVar2);
            return yVar2;
        }
        Handler handler = this.f40469e;
        final zzbr zzbrVar = new zzbr(this, handler, eVar);
        if (P(new Callable() { // from class: com.android.billingclient.api.p1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.E(m.this, eVar, activity, zzbrVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.q1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.x1(eVar, n4.f40523k, zzjs.zzx, null);
            }
        }, handler, O()) != null) {
            return n4.f40521i;
        }
        y i02 = i0();
        g1(zzjs.zzy, 16, i02);
        return i02;
    }

    @Override // com.android.billingclient.api.j
    @g5
    public void u(final Activity activity, final u uVar, final t tVar) {
        if (activity == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ѷ"));
        }
        try {
            y0(new Callable() { // from class: com.android.billingclient.api.u1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    m.I(m.this, tVar, uVar, activity);
                    return null;
                }
            }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.v1
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.y1(tVar, n4.f40523k, zzjs.zzx, null);
                }
            }, f0());
        } catch (Exception e4) {
            y1(tVar, i0(), zzjs.zzbb, e4);
        }
    }

    @Override // com.android.billingclient.api.j
    @h6
    public y v(final Activity activity, final h0 h0Var) {
        if (activity == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ѷ"));
        }
        if (!I1(w4.c())) {
            zzjs zzjsVar = zzjs.zzb;
            y yVar = n4.f40522j;
            g1(zzjsVar, 25, yVar);
            return yVar;
        }
        if (!this.f40490z) {
            zzc.zzn(ProtectedSandApp.s("ϋ"), ProtectedSandApp.s("Ѹ"));
            zzjs zzjsVar2 = zzjs.zzaE;
            y yVar2 = n4.f40533u;
            g1(zzjsVar2, 25, yVar2);
            return yVar2;
        }
        Handler handler = this.f40469e;
        final zzbs zzbsVar = new zzbs(this, handler, h0Var);
        if (P(new Callable() { // from class: com.android.billingclient.api.o2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.K(m.this, h0Var, activity, zzbsVar);
                return null;
            }
        }, androidx.work.i0.f35989d, new Runnable() { // from class: com.android.billingclient.api.p2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.u1(h0Var, n4.f40523k, zzjs.zzx, null);
            }
        }, handler, O()) != null) {
            return n4.f40521i;
        }
        y i02 = i0();
        g1(zzjs.zzy, 25, i02);
        return i02;
    }

    @Override // com.android.billingclient.api.j
    public final y w(final Activity activity, m0 m0Var, n0 n0Var) {
        boolean I1 = I1(w4.c());
        String s4 = ProtectedSandApp.s("ϋ");
        if (!I1) {
            zzc.zzn(s4, ProtectedSandApp.s("И"));
            return n4.f40522j;
        }
        if (!this.f40481q) {
            zzc.zzn(s4, ProtectedSandApp.s("ѹ"));
            return n4.f40532t;
        }
        View findViewById = activity.findViewById(R.id.content);
        IBinder windowToken = findViewById.getWindowToken();
        if (windowToken == null) {
            zzc.zzn(s4, ProtectedSandApp.s("Ѻ"));
        }
        Rect rect = new Rect();
        findViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        bundle.putBinder(ProtectedSandApp.s("ѻ"), windowToken);
        bundle.putInt(ProtectedSandApp.s("Ѽ"), rect.left);
        bundle.putInt(ProtectedSandApp.s("ѽ"), rect.top);
        bundle.putInt(ProtectedSandApp.s("Ѿ"), rect.right);
        bundle.putInt(ProtectedSandApp.s("ѿ"), rect.bottom);
        bundle.putString(ProtectedSandApp.s("Ϙ"), this.f40467c);
        String str = this.f40468d;
        if (str != null) {
            bundle.putString(ProtectedSandApp.s("Ҁ"), str);
        }
        bundle.putIntegerArrayList(ProtectedSandApp.s("ҁ"), m0Var.b());
        if (!TextUtils.isEmpty(null)) {
            bundle.putString(ProtectedSandApp.s("К"), null);
        }
        Handler handler = this.f40469e;
        final zzbq zzbqVar = new zzbq(this, handler, n0Var);
        P(new Callable() { // from class: com.android.billingclient.api.u2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m.j2(m.this, bundle, activity, zzbqVar);
                return null;
            }
        }, C1434k.f30360a, null, handler, O());
        return n4.f40521i;
    }

    @Override // com.android.billingclient.api.j
    public void x(n nVar) {
        G1(nVar, 0);
    }

    @androidx.annotation.d
    m(@androidx.annotation.q0 String str, s0 s0Var, Context context, a1 a1Var, @androidx.annotation.q0 f1 f1Var, @androidx.annotation.q0 e0 e0Var, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        this.f40465a = new Object();
        this.f40466b = 0;
        this.f40469e = new Handler(Looper.getMainLooper());
        this.f40477m = 0;
        this.J = zzcf.zzk();
        this.M = Long.valueOf(new Random().nextLong());
        this.N = zzbf.zza();
        String s4 = ProtectedSandApp.s("ϊ");
        this.f40467c = s4;
        this.f40468d = p0();
        y(context, a1Var, s0Var, f1Var, e0Var, s4, null, cVar);
    }

    @androidx.annotation.d
    m(@androidx.annotation.q0 String str, s0 s0Var, Context context, a1 a1Var, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        this.f40465a = new Object();
        this.f40466b = 0;
        this.f40469e = new Handler(Looper.getMainLooper());
        this.f40477m = 0;
        this.J = zzcf.zzk();
        this.M = Long.valueOf(new Random().nextLong());
        this.N = zzbf.zza();
        String s4 = ProtectedSandApp.s("ϊ");
        this.f40467c = s4;
        this.f40468d = p0();
        z(context, a1Var, s0Var, s4, null, cVar);
    }

    @androidx.annotation.d
    m(@androidx.annotation.q0 String str, s0 s0Var, Context context, a5 a5Var, @androidx.annotation.q0 j4 j4Var, @androidx.annotation.q0 ExecutorService executorService, j.c cVar) {
        String s4 = ProtectedSandApp.s("ϋ");
        this.f40465a = new Object();
        this.f40466b = 0;
        this.f40469e = new Handler(Looper.getMainLooper());
        this.f40477m = 0;
        this.J = zzcf.zzk();
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.M = valueOf;
        this.N = zzbf.zza();
        String s5 = ProtectedSandApp.s("ϊ");
        this.f40467c = s5;
        String p02 = p0();
        this.f40468d = p02;
        this.f40471g = context.getApplicationContext();
        zzke zza = zzkg.zza();
        zza.zzx(s5);
        if (p02 != null) {
            zza.zzy(p02);
        }
        zza.zzq(this.f40471g.getPackageName());
        zza.zzd(valueOf.longValue());
        zza.zzw(cVar.f40414q);
        zza.zza(Build.VERSION.SDK_INT);
        zza.zzp(926300087L);
        c1(zza, context);
        try {
            zza.zzb(this.f40471g.getPackageManager().getPackageInfo(this.f40471g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo(s4, ProtectedSandApp.s("ό"), th);
        }
        this.f40472h = new x4(this.f40471g, (zzkg) zza.zzi());
        zzc.zzn(s4, ProtectedSandApp.s("ύ"));
        this.f40470f = new a7(this.f40471g, null, null, null, null, this.f40472h);
        this.G = s0Var;
        this.f40471g.getPackageName();
        this.H = cVar.f40414q;
    }
}
