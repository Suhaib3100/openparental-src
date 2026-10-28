package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzla;
import com.google.android.gms.internal.play_billing.zzld;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@UsedByReflection("PlatformActivityProxy")
@v6
/* loaded from: classes3.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: l, reason: collision with root package name */
    private static final int f40239l = 100;

    /* renamed from: m, reason: collision with root package name */
    private static final int f40240m = 101;

    /* renamed from: n, reason: collision with root package name */
    private static final int f40241n = 110;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.m1
    static final int f40242o = 3;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.m1
    static final int f40243p = 4;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.m1
    static final int f40244q = 5;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40248b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f40249c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40250d;

    /* renamed from: e, reason: collision with root package name */
    private int f40251e;

    /* renamed from: f, reason: collision with root package name */
    private long f40252f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40253g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.q0
    @androidx.annotation.m1
    q5 f40254h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.q0
    @androidx.annotation.m1
    j4 f40255i;

    /* renamed from: r, reason: collision with root package name */
    private static final String f40245r = ProtectedSandApp.s("̾");

    /* renamed from: s, reason: collision with root package name */
    private static final String f40246s = ProtectedSandApp.s("̿");

    /* renamed from: t, reason: collision with root package name */
    static final String f40247t = ProtectedSandApp.s("̫");

    /* renamed from: j, reason: collision with root package name */
    static final String f40237j = ProtectedSandApp.s("̜");

    /* renamed from: k, reason: collision with root package name */
    private static final String f40238k = ProtectedSandApp.s("̬");

    private zzjs a(int i4, @androidx.annotation.q0 Intent intent) {
        return intent == null ? i4 != -1 ? i4 != 0 ? i4 != 3 ? i4 != 4 ? zzjs.zzbm : zzjs.zzbl : zzjs.zzbk : zzjs.zzbj : zzjs.zzbi : intent.getExtras() == null ? zzjs.zzv : i4 == 5 ? zzjs.zzbI : zzjs.zza;
    }

    private boolean b(@androidx.annotation.q0 Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey(ProtectedSandApp.s("̜"));
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra(ProtectedSandApp.s("̛"));
    }

    private boolean c(int i4, @androidx.annotation.q0 Intent intent) {
        return !a(i4, intent).equals(zzjs.zza);
    }

    private boolean d() {
        return this.f40254h != null;
    }

    private Intent e(String str) {
        Intent intent = new Intent(ProtectedSandApp.s("̝"));
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra(ProtectedSandApp.s("̞"), str);
        return intent;
    }

    private Intent f(zzjs zzjsVar, long j4, boolean z4) {
        Intent g4 = g();
        String s4 = ProtectedSandApp.s("̟");
        String s5 = ProtectedSandApp.s("̠");
        String s6 = ProtectedSandApp.s("̡");
        if (z4) {
            if (d() && this.f40254h.a() != null) {
                y a5 = this.f40254h.a();
                g4.putExtra(s6, a5.c());
                g4.putExtra(s5, a5.a());
            } else if (d() && !this.f40254h.c()) {
                g4.putExtra(s6, 3);
                String s7 = ProtectedSandApp.s("̢");
                g4.putExtra(s5, s7);
                y.a d5 = y.d();
                d5.d(3);
                d5.b(s7);
                y a6 = d5.a();
                zzjs zzjsVar2 = zzjs.zzbL;
                int i4 = i4.f40395a;
                g4.putExtra(s4, i4.b(zzjsVar2, 2, a6, null, zzjz.zza).zzQ());
            }
            g4.putExtra(ProtectedSandApp.s("̤"), ProtectedSandApp.s("̥"));
            g4.putExtra(ProtectedSandApp.s("̦"), j4);
            g4.putExtra(ProtectedSandApp.s("̧"), this.f40253g);
            return g4;
        }
        g4.putExtra(s6, 6);
        String s10 = ProtectedSandApp.s("̣");
        g4.putExtra(s5, s10);
        y.a d6 = y.d();
        d6.d(6);
        d6.b(s10);
        y a7 = d6.a();
        int i5 = i4.f40395a;
        g4.putExtra(s4, i4.b(zzjsVar, 2, a7, null, zzjz.zza).zzQ());
        g4.putExtra(ProtectedSandApp.s("̤"), ProtectedSandApp.s("̥"));
        g4.putExtra(ProtectedSandApp.s("̦"), j4);
        g4.putExtra(ProtectedSandApp.s("̧"), this.f40253g);
        return g4;
    }

    private Intent g() {
        Intent intent = new Intent(ProtectedSandApp.s("̨"));
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    private synchronized void h() {
        try {
            this.f40254h = new q5(this.f40255i);
            IntentFilter intentFilter = new IntentFilter(ProtectedSandApp.s("̩"));
            intentFilter.addAction(ProtectedSandApp.s("̪"));
            androidx.core.content.d.registerReceiver(this, this.f40254h, intentFilter, ProtectedSandApp.s("̫"), null, 2);
        } catch (NoSuchMethodError | RuntimeException e4) {
            this.f40254h = null;
            if (e4 instanceof NoSuchMethodError) {
                j4 j4Var = this.f40255i;
                zzla zza = zzld.zza();
                zza.zza(2);
                j4Var.k((zzld) zza.zzi());
            } else {
                j4 j4Var2 = this.f40255i;
                zzla zza2 = zzld.zza();
                zza2.zza(1);
                j4Var2.k((zzld) zza2.zzi());
            }
            zzc.zzo(ProtectedSandApp.s("̬"), ProtectedSandApp.s("̭"), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0017, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0066, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    @Override // android.app.Activity
    @com.android.billingclient.api.v6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onActivityResult(int r9, int r10, @androidx.annotation.q0 android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    @v6
    protected void onCreate(@androidx.annotation.q0 Bundle bundle) {
        int i4;
        PendingIntent pendingIntent;
        Bundle bundle2;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        Bundle bundle3;
        ActivityOptions pendingIntentBackgroundActivityStartMode2;
        super.onCreate(bundle);
        boolean b5 = b(bundle);
        String s4 = ProtectedSandApp.s("̬");
        if (!b5) {
            try {
                i4 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e4) {
                zzc.zzo(s4, ProtectedSandApp.s("̷"), e4);
                i4 = -1;
            }
            if (this.f40255i == null) {
                Context applicationContext = getApplicationContext();
                zzke zza = zzkg.zza();
                zza.zzq(getPackageName());
                zza.zzx(ProtectedSandApp.s("̸"));
                zza.zzb(i4);
                zza.zza(Build.VERSION.SDK_INT);
                zza.zzp(926300087L);
                this.f40255i = new x4(applicationContext, (zzkg) zza.zzi());
            }
            h();
        }
        String s5 = ProtectedSandApp.s("̜");
        String s6 = ProtectedSandApp.s("̹");
        String s7 = ProtectedSandApp.s("̧");
        String s10 = ProtectedSandApp.s("̦");
        if (bundle != null) {
            zzc.zzm(s4, ProtectedSandApp.s("̽"));
            this.f40249c = bundle.getBoolean(ProtectedSandApp.s("̾"), false);
            if (bundle.containsKey(s5)) {
                this.f40248b = (ResultReceiver) bundle.getParcelable(s5);
            }
            this.f40250d = bundle.getBoolean(s6, false);
            this.f40251e = bundle.getInt(ProtectedSandApp.s("̿"), 100);
            if (bundle.containsKey(s10)) {
                this.f40252f = bundle.getLong(s10);
            }
            if (bundle.containsKey(s7)) {
                this.f40253g = bundle.getBoolean(s7);
                return;
            }
            return;
        }
        zzc.zzm(s4, ProtectedSandApp.s("̺"));
        this.f40251e = 100;
        Intent intent = getIntent();
        String s11 = ProtectedSandApp.s("̻");
        if (intent.hasExtra(s11)) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra(s11);
            if (getIntent().hasExtra(s6) && getIntent().getBooleanExtra(s6, false)) {
                this.f40250d = true;
                this.f40251e = 110;
            }
        } else {
            Intent intent2 = getIntent();
            String s12 = ProtectedSandApp.s("̛");
            if (intent2.hasExtra(s12)) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra(s12);
                this.f40248b = (ResultReceiver) getIntent().getParcelableExtra(s5);
                this.f40251e = 101;
            } else {
                pendingIntent = null;
            }
        }
        if (getIntent().hasExtra(s10)) {
            this.f40252f = getIntent().getLongExtra(s10, 0L);
        }
        if (getIntent().hasExtra(s7)) {
            this.f40253g = getIntent().getBooleanExtra(s7, false);
        }
        try {
            this.f40249c = true;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 36) {
                pendingIntentBackgroundActivityStartMode2 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3);
                bundle3 = pendingIntentBackgroundActivityStartMode2.toBundle();
            } else if (i5 < 34) {
                bundle2 = null;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f40251e, new Intent(), 0, 0, 0, bundle2);
            } else {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle3 = pendingIntentBackgroundActivityStartMode.toBundle();
            }
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f40251e, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e5) {
            zzc.zzo(s4, ProtectedSandApp.s("̼"), e5);
            ResultReceiver resultReceiver = this.f40248b;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent f4 = f(zzjs.zzbG, this.f40252f, false);
                if (this.f40250d) {
                    f4.putExtra(ProtectedSandApp.s("̶"), true);
                }
                sendBroadcast(f4);
            }
            this.f40249c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    @v6
    protected void onDestroy() {
        y yVar;
        super.onDestroy();
        if (d()) {
            yVar = this.f40254h.a();
            try {
                unregisterReceiver(this.f40254h);
            } catch (RuntimeException e4) {
                zzc.zzo(ProtectedSandApp.s("̬"), ProtectedSandApp.s("̀"), e4);
            }
        } else {
            yVar = null;
        }
        if (isFinishing() && this.f40249c) {
            Intent g4 = g();
            String s4 = ProtectedSandApp.s("̠");
            String s5 = ProtectedSandApp.s("̡");
            if (yVar != null) {
                g4.putExtra(s5, yVar.c());
                g4.putExtra(s4, yVar.a());
            } else {
                g4.putExtra(s5, 1);
                g4.putExtra(s4, ProtectedSandApp.s("́"));
            }
            if (this.f40250d) {
                g4.putExtra(ProtectedSandApp.s("̶"), true);
            }
            int i4 = this.f40251e;
            if (i4 == 110 || i4 == 100) {
                g4.putExtra(ProtectedSandApp.s("̤"), ProtectedSandApp.s("̥"));
                g4.putExtra(ProtectedSandApp.s("̦"), this.f40252f);
            }
            sendBroadcast(g4);
        }
    }

    @Override // android.app.Activity
    @v6
    protected void onSaveInstanceState(@androidx.annotation.o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f40248b;
        if (resultReceiver != null) {
            bundle.putParcelable(ProtectedSandApp.s("̜"), resultReceiver);
        }
        bundle.putBoolean(ProtectedSandApp.s("̾"), this.f40249c);
        bundle.putBoolean(ProtectedSandApp.s("̹"), this.f40250d);
        bundle.putInt(ProtectedSandApp.s("̿"), this.f40251e);
        bundle.putLong(ProtectedSandApp.s("̦"), this.f40252f);
        bundle.putBoolean(ProtectedSandApp.s("̧"), this.f40253g);
    }
}
