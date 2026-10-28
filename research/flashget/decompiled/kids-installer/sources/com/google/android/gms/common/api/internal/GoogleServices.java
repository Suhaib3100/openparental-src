package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class GoogleServices {
    private static final Object zza = new Object();

    @q0
    @GuardedBy("sLock")
    private static GoogleServices zzb;

    @q0
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(String str, boolean z5) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z5;
        this.zzf = !z5;
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        String s5 = ProtectedSandApp.s("ૢ");
        synchronized (zza) {
            googleServices = zzb;
            if (googleServices == null) {
                throw new IllegalStateException(s5 + str + ProtectedSandApp.s("ૣ"));
            }
        }
        return googleServices;
    }

    @VisibleForTesting
    @KeepForSdk
    static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    @q0
    @KeepForSdk
    public static String getGoogleAppId() {
        return checkInitialized(ProtectedSandApp.s("\u0ae4")).zzc;
    }

    @o0
    @KeepForSdk
    public static Status initialize(@o0 Context context) {
        Status status;
        Preconditions.checkNotNull(context, ProtectedSandApp.s("\u0ae5"));
        synchronized (zza) {
            if (zzb == null) {
                zzb = new GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices checkInitialized = checkInitialized(ProtectedSandApp.s("૨"));
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized(ProtectedSandApp.s("૩")).zzf;
    }

    @VisibleForTesting
    @KeepForSdk
    Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        if (str2 == null || str2.equals(str)) {
            return Status.RESULT_SUCCESS;
        }
        return new Status(10, e.a(ProtectedSandApp.s("૪"), this.zzc, ProtectedSandApp.s("૫")));
    }

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(ProtectedSandApp.s("\u0ade"), ProtectedSandApp.s("\u0adf"), resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z5 = integer == 0;
            r2 = integer != 0;
            this.zzf = z5;
        } else {
            this.zzf = false;
        }
        this.zze = r2;
        String zzb2 = zzag.zzb(context);
        zzb2 = zzb2 == null ? new StringResourceValueReader(context).getString(ProtectedSandApp.s("ૠ")) : zzb2;
        if (TextUtils.isEmpty(zzb2)) {
            this.zzd = new Status(10, ProtectedSandApp.s("ૡ"));
            this.zzc = null;
        } else {
            this.zzc = zzb2;
            this.zzd = Status.RESULT_SUCCESS;
        }
    }

    @o0
    @KeepForSdk
    public static Status initialize(@o0 Context context, @o0 String str, boolean z5) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("૦"));
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("૧"));
        synchronized (zza) {
            GoogleServices googleServices = zzb;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            GoogleServices googleServices2 = new GoogleServices(str, z5);
            zzb = googleServices2;
            return googleServices2.zzd;
        }
    }
}
