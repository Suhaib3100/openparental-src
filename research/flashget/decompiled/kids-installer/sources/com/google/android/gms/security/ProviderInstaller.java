package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class ProviderInstaller {

    @o0
    public static final String PROVIDER_NAME = ProtectedSandApp.s("ᆰ");
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();

    @b0("ProviderInstaller.lock")
    private static Method zzc = null;

    @b0("ProviderInstaller.lock")
    private static Method zzd = null;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i5, @q0 Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(@o0 Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        Context context2;
        Preconditions.checkNotNull(context, ProtectedSandApp.s("ᆱ"));
        zza.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (zzb) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ProtectedSandApp.s("ᆲ")).getModuleContext();
            } catch (DynamiteModule.LoadingException e6) {
                ProtectedSandApp.s("ᆳ").concat(String.valueOf(e6.getMessage()));
                context2 = null;
            }
            if (context2 != null) {
                zzc(context2, context, ProtectedSandApp.s("ᆸ"));
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    if (zzd == null) {
                        Class cls = Long.TYPE;
                        zzd = zzb(remoteContext, ProtectedSandApp.s("ᆴ"), ProtectedSandApp.s("ᆵ"), new Class[]{Context.class, cls, cls});
                    }
                    zzd.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e7) {
                    ProtectedSandApp.s("ᆶ").concat(String.valueOf(e7.getMessage()));
                }
            }
            if (remoteContext == null) {
                throw new GooglePlayServicesNotAvailableException(8);
            }
            zzc(remoteContext, context, ProtectedSandApp.s("ᆷ"));
        }
    }

    public static void installIfNeededAsync(@o0 Context context, @o0 ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, ProtectedSandApp.s("ᆹ"));
        Preconditions.checkNotNull(providerInstallListener, ProtectedSandApp.s("ᆺ"));
        Preconditions.checkMainThread(ProtectedSandApp.s("ᆻ"));
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    private static Method zzb(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    @b0("ProviderInstaller.lock")
    private static void zzc(Context context, Context context2, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (zzc == null) {
                zzc = zzb(context, str, ProtectedSandApp.s("ᆼ"), new Class[]{Context.class});
            }
            zzc.invoke(null, context);
        } catch (Exception e6) {
            Throwable cause = e6.getCause();
            if (Log.isLoggable(ProtectedSandApp.s("ᆽ"), 6)) {
                ProtectedSandApp.s("ᆾ").concat(String.valueOf(cause == null ? e6.getMessage() : cause.getMessage()));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
