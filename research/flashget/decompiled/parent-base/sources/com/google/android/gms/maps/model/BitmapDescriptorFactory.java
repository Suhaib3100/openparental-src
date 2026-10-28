package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;
    private static com.google.android.gms.internal.maps.zzi zza;

    private BitmapDescriptorFactory() {
    }

    @o0
    public static BitmapDescriptor defaultMarker() {
        try {
            return new BitmapDescriptor(zzb().zzd());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static BitmapDescriptor fromAsset(@o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("\udab6"));
        try {
            return new BitmapDescriptor(zzb().zzf(str));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static BitmapDescriptor fromBitmap(@o0 Bitmap bitmap) {
        Preconditions.checkNotNull(bitmap, ProtectedSandApp.s("\udab7"));
        try {
            return new BitmapDescriptor(zzb().zzg(bitmap));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static BitmapDescriptor fromFile(@o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("\udab8"));
        try {
            return new BitmapDescriptor(zzb().zzh(str));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static BitmapDescriptor fromPath(@o0 String str) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("\udab9"));
        try {
            return new BitmapDescriptor(zzb().zzi(str));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static BitmapDescriptor fromPinConfig(@o0 PinConfig pinConfig) {
        try {
            return new BitmapDescriptor(zzb().zzj(pinConfig));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    @o0
    public static BitmapDescriptor fromResource(int i4) {
        try {
            return new BitmapDescriptor(zzb().zzk(i4));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public static void zza(com.google.android.gms.internal.maps.zzi zziVar) {
        if (zza != null) {
            return;
        }
        zza = (com.google.android.gms.internal.maps.zzi) Preconditions.checkNotNull(zziVar, ProtectedSandApp.s("\udaba"));
    }

    private static com.google.android.gms.internal.maps.zzi zzb() {
        return (com.google.android.gms.internal.maps.zzi) Preconditions.checkNotNull(zza, ProtectedSandApp.s("\udabb"));
    }

    @o0
    public static BitmapDescriptor defaultMarker(float f4) {
        try {
            return new BitmapDescriptor(zzb().zze(f4));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
