package com.google.android.libraries.places.api;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzei;
import com.google.android.libraries.places.internal.zzej;
import com.google.android.libraries.places.internal.zzek;
import com.google.android.libraries.places.internal.zzem;
import com.google.android.libraries.places.internal.zzet;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzha;
import java.util.Locale;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class Places {
    private static final zzem zza = new zzem();

    @q0
    private static volatile zzek zzb;

    private Places() {
    }

    @RecentlyNonNull
    public static synchronized PlacesClient createClient(@RecentlyNonNull Context context) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzha.zzc(context, ProtectedSandApp.s("\ue52b"));
                zza2 = zza(context, zzet.zzd(context).zze());
            } catch (Error | RuntimeException e4) {
                zzev.zzb(e4);
                throw e4;
            }
        }
        return zza2;
    }

    public static synchronized void deinitialize() {
        synchronized (Places.class) {
            zza.zzc();
        }
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zzb(context, str, null, false);
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    public static synchronized boolean isInitialized() {
        boolean zzf;
        synchronized (Places.class) {
            try {
                zzf = zza.zzf();
            } catch (Error | RuntimeException e4) {
                zzev.zzb(e4);
                throw e4;
            }
        }
        return zzf;
    }

    public static synchronized PlacesClient zza(Context context, zzet zzetVar) {
        PlacesClient zzb2;
        synchronized (Places.class) {
            try {
                zzha.zzc(context, ProtectedSandApp.s("\ue52b"));
                zzha.zzi(isInitialized(), ProtectedSandApp.s("\ue52c"));
                zzej zza2 = zzei.zza();
                zza2.zzc(context);
                zza2.zza(zza);
                zza2.zzb(zzetVar);
                zzb2 = zza2.zzd().zzb();
            } catch (Error | RuntimeException e4) {
                zzev.zzb(e4);
                throw e4;
            }
        }
        return zzb2;
    }

    public static synchronized void zzb(@RecentlyNonNull Context context, @RecentlyNonNull String str, @q0 Locale locale, boolean z4) {
        synchronized (Places.class) {
            try {
                zzha.zzc(context, ProtectedSandApp.s("\ue52d"));
                zzha.zzc(str, ProtectedSandApp.s("\ue52e"));
                zzha.zze(!str.isEmpty(), ProtectedSandApp.s("\ue52f"));
                zzev.zza(context.getApplicationContext(), false);
                zza.zzd(str, locale, false);
            } catch (Error | RuntimeException e4) {
                zzev.zzb(e4);
                throw e4;
            }
        }
    }

    public static synchronized void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, @q0 Locale locale) {
        synchronized (Places.class) {
            try {
                zzb(context, str, locale, false);
            } catch (Error | RuntimeException e4) {
                zzev.zzb(e4);
                throw e4;
            }
        }
    }
}
