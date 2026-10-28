package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class ProviderInstaller {

    @o0
    public static final String PROVIDER_NAME = ProtectedSandApp.s("\ue4d5");
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();

    @q0
    @b0("ProviderInstaller.lock")
    private static Method zzc = null;

    @b0("ProviderInstaller.lock")
    private static boolean zzd = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i4, @q0 Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(@o0 Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.checkNotNull(context, ProtectedSandApp.s("\ue4d6"));
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (zzb) {
            Context context3 = null;
            if (!zzd) {
                String s4 = ProtectedSandApp.s("\ue4d7");
                try {
                    context2 = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ProtectedSandApp.s("\ue4d8")).getModuleContext();
                } catch (DynamiteModule.LoadingException e4) {
                    s4.concat(String.valueOf(e4.getMessage()));
                    context2 = null;
                }
                if (context2 != null) {
                    zzb(context2, context, ProtectedSandApp.s("\ue4d9"));
                    return;
                }
            }
            boolean z4 = zzd;
            String s5 = ProtectedSandApp.s("\ue4da");
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                zzd = true;
                if (!z4) {
                    try {
                        zzj.zzb(ProtectedSandApp.s("\ue4db"), ProtectedSandApp.s("\ue4dc"), remoteContext.getClassLoader(), zzi.zzb(Context.class, context), zzh.zza(uptimeMillis), zzh.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e5) {
                        s5.concat(e5.toString());
                    }
                }
                context3 = remoteContext;
            }
            if (context3 == null) {
                throw new GooglePlayServicesNotAvailableException(8);
            }
            zzb(context3, context, ProtectedSandApp.s("\ue4db"));
        }
    }

    public static void installIfNeededAsync(@o0 Context context, @o0 ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("\ue4d6"));
        Preconditions.checkNotNull(providerInstallListener, ProtectedSandApp.s("\ue4dd"));
        Preconditions.checkMainThread(ProtectedSandApp.s("\ue4de"));
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    @b0("ProviderInstaller.lock")
    private static void zzb(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod(ProtectedSandApp.s("\ue4df"), Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e4) {
            Throwable cause = e4.getCause();
            if (Log.isLoggable(ProtectedSandApp.s("\ue4e0"), 6)) {
                ProtectedSandApp.s("\ue4e1").concat(String.valueOf(cause == null ? e4.toString() : cause.toString()));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
