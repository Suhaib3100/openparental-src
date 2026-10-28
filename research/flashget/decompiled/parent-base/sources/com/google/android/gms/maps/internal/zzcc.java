package com.google.android.gms.maps.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzcc {
    private static final String zza = ProtectedSandApp.s("\uda92");

    @q0
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzb;
    private static zzf zzc;

    public static zzf zza(Context context, @q0 MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        Preconditions.checkNotNull(context);
        ProtectedSandApp.s("\uda93").concat(String.valueOf(renderer));
        zzf zzfVar = zzc;
        if (zzfVar != null) {
            return zzfVar;
        }
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        zzf zzd = zzd(context, renderer);
        zzc = zzd;
        try {
            if (zzd.zzd() == 2) {
                try {
                    zzc.zzm(ObjectWrapper.wrap(zzc(context, renderer)));
                } catch (RemoteException e4) {
                    throw new RuntimeRemoteException(e4);
                } catch (UnsatisfiedLinkError unused) {
                    zzb = null;
                    zzc = zzd(context, MapsInitializer.Renderer.LEGACY);
                }
            }
            try {
                zzf zzfVar2 = zzc;
                Context zzc2 = zzc(context, renderer);
                zzc2.getClass();
                zzfVar2.zzk(ObjectWrapper.wrap(zzc2.getResources()), 18020000);
                return zzc;
            } catch (RemoteException e5) {
                throw new RuntimeRemoteException(e5);
            }
        } catch (RemoteException e6) {
            throw new RuntimeRemoteException(e6);
        }
    }

    private static Context zzb(Exception exc, Context context) {
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    @q0
    private static Context zzc(Context context, @q0 MapsInitializer.Renderer renderer) {
        Context zzb2;
        Context context2 = zzb;
        if (context2 != null) {
            return context2;
        }
        String s4 = renderer == MapsInitializer.Renderer.LEGACY ? ProtectedSandApp.s("\uda94") : ProtectedSandApp.s("\uda95");
        try {
            zzb2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, s4).getModuleContext();
        } catch (Exception e4) {
            String s5 = ProtectedSandApp.s("\uda96");
            if (s4.equals(s5)) {
                zzb2 = zzb(e4, context);
            } else {
                try {
                    zzb2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, s5).getModuleContext();
                } catch (Exception e5) {
                    zzb2 = zzb(e5, context);
                }
            }
        }
        zzb = zzb2;
        return zzb2;
    }

    private static zzf zzd(Context context, @q0 MapsInitializer.Renderer renderer) {
        try {
            IBinder iBinder = (IBinder) zze(((ClassLoader) Preconditions.checkNotNull(zzc(context, renderer).getClassLoader())).loadClass(ProtectedSandApp.s("\uda97")));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ProtectedSandApp.s("\uda98"));
            return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zze(iBinder);
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("\uda99"), e4);
        }
    }

    private static Object zze(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(ProtectedSandApp.s("\uda9a").concat(cls.getName()), e4);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(ProtectedSandApp.s("\uda9b").concat(cls.getName()), e5);
        }
    }
}
