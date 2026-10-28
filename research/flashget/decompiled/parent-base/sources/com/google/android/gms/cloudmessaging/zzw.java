package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
public final class zzw {
    private final Context zza;
    private int zzb;
    private int zzc = 0;

    public zzw(Context context) {
        this.zza = context;
    }

    public final synchronized int zza() {
        PackageInfo packageInfo;
        if (this.zzb == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.zza).getPackageInfo(ProtectedSandApp.s("줊"), 0);
            } catch (PackageManager.NameNotFoundException e4) {
                ProtectedSandApp.s("줋").concat(e4.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.zzb = packageInfo.versionCode;
            }
        }
        return this.zzb;
    }

    public final synchronized int zzb() {
        try {
            int i4 = this.zzc;
            if (i4 != 0) {
                return i4;
            }
            Context context = this.zza;
            PackageManager packageManager = context.getPackageManager();
            if (Wrappers.packageManager(context).checkPermission(ProtectedSandApp.s("줌"), ProtectedSandApp.s("줊")) == -1) {
                return 0;
            }
            int i5 = 1;
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent(ProtectedSandApp.s("줍"));
                intent.setPackage(ProtectedSandApp.s("줊"));
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    this.zzc = i5;
                    return i5;
                }
            }
            Intent intent2 = new Intent(ProtectedSandApp.s("줎"));
            intent2.setPackage(ProtectedSandApp.s("줊"));
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                i5 = 2;
                this.zzc = i5;
                return i5;
            }
            if (true == PlatformVersion.isAtLeastO()) {
                i5 = 2;
            }
            this.zzc = i5;
            return i5;
        } catch (Throwable th) {
            throw th;
        }
    }
}
