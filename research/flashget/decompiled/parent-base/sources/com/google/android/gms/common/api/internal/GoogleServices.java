package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzae;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public final class GoogleServices {
    private static final Object zza = new Object();

    @q0
    private static GoogleServices zzb;

    @q0
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    @KeepForSdk
    @m1
    GoogleServices(String str, boolean z4) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z4;
        this.zzf = !z4;
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        Object obj = zza;
        String s4 = ProtectedSandApp.s("짭");
        String s5 = ProtectedSandApp.s("짮");
        synchronized (obj) {
            try {
                googleServices = zzb;
                if (googleServices == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                    sb.append(s5);
                    sb.append(str);
                    sb.append(s4);
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleServices;
    }

    @KeepForSdk
    @m1
    static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    @q0
    @KeepForSdk
    public static String getGoogleAppId() {
        return checkInitialized(ProtectedSandApp.s("짯")).zzc;
    }

    @o0
    @KeepForSdk
    public static Status initialize(@o0 Context context) {
        Status status;
        Preconditions.checkNotNull(context, ProtectedSandApp.s("짰"));
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new GoogleServices(context);
                }
                status = zzb.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return status;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices checkInitialized = checkInitialized(ProtectedSandApp.s("짲"));
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized(ProtectedSandApp.s("짳")).zzf;
    }

    @KeepForSdk
    @m1
    Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        return (str2 == null || str2.equals(str)) ? Status.RESULT_SUCCESS : new Status(10, k0.a(new StringBuilder(str2.length() + 97), ProtectedSandApp.s("짴"), str2, ProtectedSandApp.s("짵")));
    }

    @KeepForSdk
    @m1
    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(ProtectedSandApp.s("짩"), ProtectedSandApp.s("짪"), resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z4 = integer == 0;
            r2 = integer != 0;
            this.zzf = z4;
        } else {
            this.zzf = false;
        }
        this.zze = r2;
        String zza2 = zzae.zza(context);
        zza2 = zza2 == null ? new StringResourceValueReader(context).getString(ProtectedSandApp.s("짫")) : zza2;
        if (TextUtils.isEmpty(zza2)) {
            this.zzd = new Status(10, ProtectedSandApp.s("짬"));
            this.zzc = null;
        } else {
            this.zzc = zza2;
            this.zzd = Status.RESULT_SUCCESS;
        }
    }

    @o0
    @KeepForSdk
    public static Status initialize(@o0 Context context, @o0 String str, boolean z4) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("짰"));
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("짱"));
        synchronized (zza) {
            try {
                GoogleServices googleServices = zzb;
                if (googleServices != null) {
                    return googleServices.checkGoogleAppId(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z4);
                zzb = googleServices2;
                return googleServices2.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
