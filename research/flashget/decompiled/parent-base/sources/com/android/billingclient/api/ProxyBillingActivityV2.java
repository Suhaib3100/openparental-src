package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.IntentSenderRequest;
import b.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes3.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: b, reason: collision with root package name */
    private androidx.view.result.h f40256b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.view.result.h f40257c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.view.result.h f40258d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.view.result.h f40259e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.view.result.h f40260f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.view.result.h f40261g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40262h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40263i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40264j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40265k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40266l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.q0
    private ResultReceiver f40267m;

    @androidx.annotation.q0
    private static final androidx.core.app.e D() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 36) {
            return androidx.core.app.e.b().l(3);
        }
        if (i4 >= 34) {
            return androidx.core.app.e.b().l(1);
        }
        return null;
    }

    @androidx.annotation.m1
    final void A(ActivityResult activityResult) {
        Intent a5 = activityResult.a();
        Bundle extras = a5 == null ? null : a5.getExtras();
        int b5 = activityResult.b();
        String s4 = ProtectedSandApp.s("͂");
        if (b5 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn(s4, String.format(ProtectedSandApp.s("̓"), Integer.valueOf(activityResult.b())));
            extras.putInt(ProtectedSandApp.s("̈́"), zzjs.zzbv.zza());
            extras.putString(ProtectedSandApp.s("͆"), String.format(ProtectedSandApp.s("ͅ"), Integer.valueOf(activityResult.b())));
        }
        int c5 = zzc.zzi(a5, s4).c();
        ResultReceiver resultReceiver = this.f40264j;
        if (resultReceiver != null) {
            resultReceiver.send(c5, extras);
        } else {
            zzc.zzn(s4, ProtectedSandApp.s("͇"));
        }
        if (c5 != 0) {
            zzc.zzn(s4, String.format(ProtectedSandApp.s("͈"), Integer.valueOf(c5)));
        }
        finish();
    }

    @androidx.annotation.m1
    final void B(ActivityResult activityResult) {
        Intent a5 = activityResult.a();
        Bundle extras = a5 == null ? null : a5.getExtras();
        int b5 = activityResult.b();
        String s4 = ProtectedSandApp.s("͂");
        if (b5 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn(s4, String.format(ProtectedSandApp.s("͉"), Integer.valueOf(activityResult.b())));
            extras.putInt(ProtectedSandApp.s("̈́"), zzjs.zzbv.zza());
            extras.putString(ProtectedSandApp.s("͆"), String.format(ProtectedSandApp.s("͊"), Integer.valueOf(activityResult.b())));
        }
        int c5 = zzc.zzi(a5, s4).c();
        ResultReceiver resultReceiver = this.f40265k;
        if (resultReceiver != null) {
            resultReceiver.send(c5, extras);
        } else {
            zzc.zzn(s4, ProtectedSandApp.s("͋"));
        }
        if (c5 != 0) {
            zzc.zzn(s4, String.format(ProtectedSandApp.s("͌"), Integer.valueOf(c5)));
        }
        finish();
    }

    @androidx.annotation.m1
    final void C(ActivityResult activityResult) {
        Intent a5 = activityResult.a();
        String s4 = ProtectedSandApp.s("͂");
        int c5 = zzc.zzi(a5, s4).c();
        ResultReceiver resultReceiver = this.f40267m;
        if (resultReceiver != null) {
            resultReceiver.send(c5, a5 == null ? null : a5.getExtras());
        }
        if (activityResult.b() != -1 || c5 != 0) {
            zzc.zzn(s4, String.format(ProtectedSandApp.s("͍"), Integer.valueOf(activityResult.b()), Integer.valueOf(c5)));
        }
        finish();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(@androidx.annotation.q0 Bundle bundle) {
        super.onCreate(bundle);
        this.f40256b = registerForActivityResult(new b.n(), new androidx.view.result.a() { // from class: com.android.billingclient.api.k5
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.x((ActivityResult) obj);
            }
        });
        this.f40257c = registerForActivityResult(new b.n(), new androidx.view.result.a() { // from class: com.android.billingclient.api.l5
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.z((ActivityResult) obj);
            }
        });
        this.f40258d = registerForActivityResult(new b.n(), new androidx.view.result.a() { // from class: com.android.billingclient.api.m5
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.A((ActivityResult) obj);
            }
        });
        this.f40259e = registerForActivityResult(new b.n(), new androidx.view.result.a() { // from class: com.android.billingclient.api.n5
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.B((ActivityResult) obj);
            }
        });
        this.f40260f = registerForActivityResult(new b.n(), new androidx.view.result.a() { // from class: com.android.billingclient.api.o5
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.y((ActivityResult) obj);
            }
        });
        this.f40261g = registerForActivityResult(new b.n(), new androidx.view.result.a() { // from class: com.android.billingclient.api.p5
            @Override // androidx.view.result.a
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.C((ActivityResult) obj);
            }
        });
        String s4 = ProtectedSandApp.s("͎");
        String s5 = ProtectedSandApp.s("͏");
        String s6 = ProtectedSandApp.s("͐");
        String s7 = ProtectedSandApp.s("͑");
        String s10 = ProtectedSandApp.s("͒");
        String s11 = ProtectedSandApp.s("͓");
        if (bundle != null) {
            if (bundle.containsKey(s11)) {
                this.f40262h = (ResultReceiver) bundle.getParcelable(s11);
            }
            if (bundle.containsKey(s10)) {
                this.f40263i = (ResultReceiver) bundle.getParcelable(s10);
            }
            if (bundle.containsKey(s7)) {
                this.f40264j = (ResultReceiver) bundle.getParcelable(s7);
            }
            if (bundle.containsKey(s6)) {
                this.f40265k = (ResultReceiver) bundle.getParcelable(s6);
            }
            if (bundle.containsKey(s5)) {
                this.f40266l = (ResultReceiver) bundle.getParcelable(s5);
            }
            if (bundle.containsKey(s4)) {
                this.f40267m = (ResultReceiver) bundle.getParcelable(s4);
                return;
            }
            return;
        }
        zzc.zzm(ProtectedSandApp.s("͂"), ProtectedSandApp.s("͔"));
        Intent intent = getIntent();
        String s12 = ProtectedSandApp.s("͕");
        if (intent.hasExtra(s12)) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(s12);
            this.f40262h = (ResultReceiver) getIntent().getParcelableExtra(s11);
            this.f40256b.c(new IntentSenderRequest.a(pendingIntent).a(), D());
            return;
        }
        Intent intent2 = getIntent();
        String s13 = ProtectedSandApp.s("͖");
        if (intent2.hasExtra(s13)) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra(s13);
            this.f40263i = (ResultReceiver) getIntent().getParcelableExtra(s10);
            this.f40257c.c(new IntentSenderRequest.a(pendingIntent2).a(), D());
            return;
        }
        Intent intent3 = getIntent();
        String s14 = ProtectedSandApp.s("͗");
        if (intent3.hasExtra(s14)) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra(s14);
            this.f40264j = (ResultReceiver) getIntent().getParcelableExtra(s7);
            this.f40258d.c(new IntentSenderRequest.a(pendingIntent3).a(), D());
            return;
        }
        Intent intent4 = getIntent();
        String s15 = ProtectedSandApp.s("͘");
        if (intent4.hasExtra(s15)) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra(s15);
            this.f40265k = (ResultReceiver) getIntent().getParcelableExtra(s6);
            this.f40259e.c(new IntentSenderRequest.a(pendingIntent4).a(), D());
            return;
        }
        Intent intent5 = getIntent();
        String s16 = ProtectedSandApp.s("͙");
        if (intent5.hasExtra(s16)) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra(s16);
            this.f40266l = (ResultReceiver) getIntent().getParcelableExtra(s5);
            this.f40260f.c(new IntentSenderRequest.a(pendingIntent5).a(), D());
            return;
        }
        Intent intent6 = getIntent();
        String s17 = ProtectedSandApp.s("͚");
        if (intent6.hasExtra(s17)) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra(s17);
            this.f40267m = (ResultReceiver) getIntent().getParcelableExtra(s4);
            this.f40261g.c(new IntentSenderRequest.a(pendingIntent6).a(), D());
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(@androidx.annotation.o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f40262h;
        if (resultReceiver != null) {
            bundle.putParcelable(ProtectedSandApp.s("͓"), resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f40263i;
        if (resultReceiver2 != null) {
            bundle.putParcelable(ProtectedSandApp.s("͒"), resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f40264j;
        if (resultReceiver3 != null) {
            bundle.putParcelable(ProtectedSandApp.s("͑"), resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f40265k;
        if (resultReceiver4 != null) {
            bundle.putParcelable(ProtectedSandApp.s("͐"), resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.f40266l;
        if (resultReceiver5 != null) {
            bundle.putParcelable(ProtectedSandApp.s("͏"), resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.f40267m;
        if (resultReceiver6 != null) {
            bundle.putParcelable(ProtectedSandApp.s("͎"), resultReceiver6);
        }
    }

    @androidx.annotation.m1
    final void x(ActivityResult activityResult) {
        Intent a5 = activityResult.a();
        String s4 = ProtectedSandApp.s("͂");
        int c5 = zzc.zzi(a5, s4).c();
        ResultReceiver resultReceiver = this.f40262h;
        if (resultReceiver != null) {
            resultReceiver.send(c5, a5 == null ? null : a5.getExtras());
        }
        if (activityResult.b() != -1 || c5 != 0) {
            zzc.zzn(s4, ProtectedSandApp.s("͛") + activityResult.b() + ProtectedSandApp.s("͜") + c5);
        }
        finish();
    }

    @androidx.annotation.m1
    final void y(ActivityResult activityResult) {
        Intent a5 = activityResult.a();
        String s4 = ProtectedSandApp.s("͂");
        int c5 = zzc.zzi(a5, s4).c();
        ResultReceiver resultReceiver = this.f40266l;
        if (resultReceiver != null) {
            resultReceiver.send(c5, a5 == null ? null : a5.getExtras());
        }
        if (activityResult.b() != -1 || c5 != 0) {
            zzc.zzn(s4, ProtectedSandApp.s("͝") + activityResult.b() + ProtectedSandApp.s("͜") + c5);
        }
        finish();
    }

    @androidx.annotation.m1
    final void z(ActivityResult activityResult) {
        Intent a5 = activityResult.a();
        String s4 = ProtectedSandApp.s("͂");
        int c5 = zzc.zzi(a5, s4).c();
        ResultReceiver resultReceiver = this.f40263i;
        if (resultReceiver != null) {
            resultReceiver.send(c5, a5 == null ? null : a5.getExtras());
        }
        if (activityResult.b() != -1 || c5 != 0) {
            zzc.zzn(s4, String.format(ProtectedSandApp.s("͞"), Integer.valueOf(activityResult.b()), Integer.valueOf(c5)));
        }
        finish();
    }
}
