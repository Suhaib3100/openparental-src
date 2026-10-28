package com.google.android.gms.ads.identifier;

import ad.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import zc.j;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@KeepForSdk
@j
/* loaded from: classes5.dex */
public class AdvertisingIdClient {

    @q0
    @a("this")
    BlockingServiceConnection zza;

    @q0
    @a("this")
    zzf zzb;

    @a("this")
    boolean zzc;
    final Object zzd;

    @q0
    @a("mAutoDisconnectTaskLock")
    zzb zze;
    final long zzf;

    @a("this")
    private final Context zzg;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    @KeepForSdkWithMembers
    public static final class Info {

        @q0
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@q0 String str, boolean z4) {
            this.zza = str;
            this.zzb = z4;
        }

        @q0
        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        @o0
        public String toString() {
            String str = this.zza;
            boolean z4 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append(ProtectedSandApp.s("웟"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("웠"));
            sb.append(z4);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@o0 Context context) {
        this(context, i0.f35989d, false, false);
    }

    @o0
    @KeepForSdk
    public static Info getAdvertisingIdInfo(@o0 Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@o0 Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread(ProtectedSandApp.s("웡"));
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException(ProtectedSandApp.s("웣"));
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException(ProtectedSandApp.s("웢"));
                            }
                        } catch (Exception e4) {
                            throw new IOException(ProtectedSandApp.s("웢"), e4);
                        }
                    }
                    Preconditions.checkNotNull(advertisingIdClient.zza);
                    Preconditions.checkNotNull(advertisingIdClient.zzb);
                    try {
                        zzd = advertisingIdClient.zzb.zzd();
                    } catch (RemoteException unused) {
                        throw new IOException(ProtectedSandApp.s("웤"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z4) {
    }

    private final Info zzd(int i4) throws IOException {
        Info info;
        Preconditions.checkNotMainThread(ProtectedSandApp.s("웡"));
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException(ProtectedSandApp.s("웣"));
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException(ProtectedSandApp.s("웢"));
                        }
                    } catch (Exception e4) {
                        throw new IOException(ProtectedSandApp.s("웢"), e4);
                    }
                }
                Preconditions.checkNotNull(this.zza);
                Preconditions.checkNotNull(this.zzb);
                try {
                    info = new Info(this.zzb.zzc(), this.zzb.zze(true));
                } catch (RemoteException unused) {
                    throw new IOException(ProtectedSandApp.s("웤"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j4 = this.zzf;
            if (j4 > 0) {
                this.zze = new zzb(this, j4);
            }
        }
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @o0
    @KeepForSdk
    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    @KeepForSdk
    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("웡"));
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    protected final void zzb(boolean z4) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("웡"));
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo(ProtectedSandApp.s("웥"), 0);
                    int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                    if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                        throw new IOException(ProtectedSandApp.s("웦"));
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent(ProtectedSandApp.s("웧"));
                    intent.setPackage(ProtectedSandApp.s("웨"));
                    try {
                        if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException(ProtectedSandApp.s("웪"));
                        }
                        this.zza = blockingServiceConnection;
                        try {
                            this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(i0.f35991f, TimeUnit.MILLISECONDS));
                            this.zzc = true;
                            if (z4) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException(ProtectedSandApp.s("웩"));
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final boolean zzc(@q0 Info info, boolean z4, float f4, long j4, String str, @q0 Throwable th) {
        if (Math.random() > p.f60679p) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String s4 = ProtectedSandApp.s("웫");
        String s5 = ProtectedSandApp.s("웬");
        hashMap.put(s4, s5);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                s5 = ProtectedSandApp.s("웭");
            }
            hashMap.put(ProtectedSandApp.s("웮"), s5);
            String id2 = info.getId();
            if (id2 != null) {
                hashMap.put(ProtectedSandApp.s("웯"), Integer.toString(id2.length()));
            }
        }
        if (th != null) {
            hashMap.put(ProtectedSandApp.s("웰"), th.getClass().getName());
        }
        hashMap.put(ProtectedSandApp.s("웱"), ProtectedSandApp.s("웲"));
        hashMap.put(ProtectedSandApp.s("웳"), Long.toString(j4));
        new zza(this, hashMap).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@o0 Context context, long j4, boolean z4, boolean z5) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z4 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j4;
    }
}
