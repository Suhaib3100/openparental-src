package com.google.android.gms.maps;

import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class MapsInitializer {
    private static boolean zzb;
    private static final String zza = ProtectedSandApp.s("\uda4c");
    private static Renderer zzc = Renderer.LEGACY;

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(@o0 Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|16|17|(10:19|(1:(1:22))|23|24|(1:26)|27|28|(1:30)|31|32)|35|23|24|(0)|27|28|(0)|31|32) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: all -> 0x0026, RemoteException -> 0x005e, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0020, B:12:0x002a, B:15:0x002e, B:17:0x003d, B:19:0x0042, B:24:0x004d, B:26:0x0053, B:27:0x0057, B:28:0x005e, B:30:0x006f, B:38:0x0077, B:39:0x007c, B:41:0x007e), top: B:3:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0020, B:12:0x002a, B:15:0x002e, B:17:0x003d, B:19:0x0042, B:24:0x004d, B:26:0x0053, B:27:0x0057, B:28:0x005e, B:30:0x006f, B:38:0x0077, B:39:0x007c, B:41:0x007e), top: B:3:0x0003, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int initialize(@androidx.annotation.o0 android.content.Context r5, @androidx.annotation.q0 com.google.android.gms.maps.MapsInitializer.Renderer r6, @androidx.annotation.q0 com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "\uda4d"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "\uda4e"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.Throwable -> L26
            r2.concat(r1)     // Catch: java.lang.Throwable -> L26
            boolean r1 = com.google.android.gms.maps.MapsInitializer.zzb     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r1 == 0) goto L2a
            if (r7 == 0) goto L28
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L26
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r5 = move-exception
            goto L82
        L28:
            monitor-exit(r0)
            return r2
        L2a:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzcc.zza(r5, r6)     // Catch: java.lang.Throwable -> L26 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L7d
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L76
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L76
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L76
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L76
            r3 = 1
            com.google.android.gms.maps.MapsInitializer.zzb = r3     // Catch: java.lang.Throwable -> L26
            r4 = 2
            if (r6 == 0) goto L4a
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L4d
            if (r6 == r3) goto L4c
        L4a:
            r3 = r2
            goto L4d
        L4c:
            r3 = r4
        L4d:
            int r6 = r1.zzd()     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L5e
            if (r6 != r4) goto L57
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L5e
            com.google.android.gms.maps.MapsInitializer.zzc = r6     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L5e
        L57:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L5e
            r1.zzl(r5, r3)     // Catch: java.lang.Throwable -> L26 android.os.RemoteException -> L5e
        L5e:
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "\uda4f"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L26
            r6.concat(r5)     // Catch: java.lang.Throwable -> L26
            if (r7 == 0) goto L74
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.zzc     // Catch: java.lang.Throwable -> L26
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L26
        L74:
            monitor-exit(r0)
            return r2
        L76:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L26
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L7d:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return r5
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
