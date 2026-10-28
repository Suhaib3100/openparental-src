package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.o0;
import androidx.core.util.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class PackageManagerWrapper {

    @o0
    protected final Context zza;

    public PackageManagerWrapper(@o0 Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(@o0 String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(@o0 String str, @o0 String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @o0
    @KeepForSdk
    public ApplicationInfo getApplicationInfo(@o0 String str, int i4) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i4);
    }

    @o0
    @KeepForSdk
    public CharSequence getApplicationLabel(@o0 String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @o0
    @KeepForSdk
    public s<CharSequence, Drawable> getApplicationLabelAndIcon(@o0 String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
        return new s<>(context.getPackageManager().getApplicationLabel(applicationInfo), context.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @o0
    @KeepForSdk
    public PackageInfo getPackageInfo(@o0 String str, int i4) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i4);
    }

    @o0
    @KeepForSdk
    public String[] getPackagesForUid(int i4) {
        return this.zza.getPackageManager().getPackagesForUid(i4);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO()) {
            return false;
        }
        Context context = this.zza;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    public final boolean zza(int i4, @o0 String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService(ProtectedSandApp.s("찭"));
            if (appOpsManager == null) {
                throw new NullPointerException(ProtectedSandApp.s("찮"));
            }
            appOpsManager.checkPackage(i4, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
