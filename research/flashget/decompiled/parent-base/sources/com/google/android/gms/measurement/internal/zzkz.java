package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.l0;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
@l0
@m1
/* loaded from: classes5.dex */
final class zzkz implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjq zza;

    zzkz(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0 A[Catch: RuntimeException -> 0x002e, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x002e, blocks: (B:3:0x0011, B:5:0x001e, B:8:0x0032, B:14:0x00e0, B:16:0x00ec, B:19:0x0101, B:21:0x0107, B:24:0x0118, B:26:0x011e, B:27:0x0139, B:29:0x0145, B:33:0x014c, B:37:0x017b, B:38:0x019b, B:40:0x0188, B:41:0x01a1, B:43:0x01a7, B:45:0x01ad, B:47:0x01b3, B:49:0x01b9, B:51:0x01c5, B:53:0x01d1, B:55:0x01d7, B:58:0x01dd, B:60:0x005f, B:63:0x0067, B:65:0x0073, B:67:0x0079, B:69:0x007f, B:71:0x0085, B:73:0x0091, B:75:0x009d, B:77:0x00a9, B:79:0x00b5, B:80:0x00c1, B:82:0x00cf), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c A[Catch: RuntimeException -> 0x002e, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x002e, blocks: (B:3:0x0011, B:5:0x001e, B:8:0x0032, B:14:0x00e0, B:16:0x00ec, B:19:0x0101, B:21:0x0107, B:24:0x0118, B:26:0x011e, B:27:0x0139, B:29:0x0145, B:33:0x014c, B:37:0x017b, B:38:0x019b, B:40:0x0188, B:41:0x01a1, B:43:0x01a7, B:45:0x01ad, B:47:0x01b3, B:49:0x01b9, B:51:0x01c5, B:53:0x01d1, B:55:0x01d7, B:58:0x01dd, B:60:0x005f, B:63:0x0067, B:65:0x0073, B:67:0x0079, B:69:0x007f, B:71:0x0085, B:73:0x0091, B:75:0x009d, B:77:0x00a9, B:79:0x00b5, B:80:0x00c1, B:82:0x00cf), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzkz r16, boolean r17, android.net.Uri r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(com.google.android.gms.measurement.internal.zzkz, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.zza.zzj().zzp().zza(ProtectedSandApp.s("\ue154"));
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.zza.zzn().zza(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString(ProtectedSandApp.s("\ue155"));
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    this.zza.zzq();
                    this.zza.zzl().zzb(new zzlc(this, bundle == null, uri, zzos.zza(intent) ? ProtectedSandApp.s("\ue156") : ProtectedSandApp.s("\ue14f"), uri.getQueryParameter(ProtectedSandApp.s("\ue148"))));
                    this.zza.zzn().zza(activity, bundle);
                }
            } catch (RuntimeException e4) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\ue157"), e4);
                this.zza.zzn().zza(activity, bundle);
            }
        } finally {
            this.zza.zzn().zza(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @l0
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zznd(zzp, zzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @l0
    public final void onActivityResumed(Activity activity) {
        zznb zzp = this.zza.zzp();
        zzp.zzl().zzb(new zzne(zzp, zzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
