package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
public final class zzt {
    private final Context zza;

    @GuardedBy("this")
    private int zzb;

    @GuardedBy("this")
    private int zzc = 0;

    public zzt(Context context) {
        this.zza = context;
    }

    public final synchronized int zza() {
        PackageInfo packageInfo;
        if (this.zzb == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.zza).getPackageInfo(ProtectedSandApp.s("ਐ"), 0);
            } catch (PackageManager.NameNotFoundException e6) {
                new StringBuilder(String.valueOf(e6).length() + 23);
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.zzb = packageInfo.versionCode;
            }
        }
        return this.zzb;
    }

    public final synchronized int zzb() {
        int i5 = this.zzc;
        if (i5 != 0) {
            return i5;
        }
        PackageManager packageManager = this.zza.getPackageManager();
        if (Wrappers.packageManager(this.zza).checkPermission(ProtectedSandApp.s("\u0a11"), ProtectedSandApp.s("\u0a12")) == -1) {
            return 0;
        }
        int i6 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent(ProtectedSandApp.s("ਓ"));
            intent.setPackage(ProtectedSandApp.s("ਔ"));
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.zzc = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(ProtectedSandApp.s("ਕ"));
        intent2.setPackage(ProtectedSandApp.s("ਖ"));
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.zzc = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.zzc = 2;
            i6 = 2;
        } else {
            this.zzc = 1;
        }
        return i6;
    }
}
