package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
@KeepForSdk
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class AdvertisingIdClient {

    @q0
    @GuardedBy("this")
    BlockingServiceConnection zza;

    @q0
    @GuardedBy("this")
    zzf zzb;

    @GuardedBy("this")
    boolean zzc;
    final Object zzd;

    @q0
    @GuardedBy("mAutoDisconnectTaskLock")
    zzb zze;
    final long zzf;

    @GuardedBy("this")
    private final Context zzg;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    @KeepForSdkWithMembers
    public static final class Info {

        @q0
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(@q0 String str, boolean z5) {
            this.zza = str;
            this.zzb = z5;
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
            boolean z5 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append(ProtectedSandApp.s("\u0992"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("ও"));
            sb.append(z5);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(@o0 Context context) {
        this(context, 30000L, false, false);
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
            Preconditions.checkNotMainThread(ProtectedSandApp.s("ঔ"));
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.zzc) {
                    synchronized (advertisingIdClient.zzd) {
                        zzb zzbVar = advertisingIdClient.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException(ProtectedSandApp.s("গ"));
                        }
                    }
                    try {
                        advertisingIdClient.zzb(false);
                        if (!advertisingIdClient.zzc) {
                            throw new IOException(ProtectedSandApp.s("ক"));
                        }
                    } catch (Exception e6) {
                        throw new IOException(ProtectedSandApp.s("খ"), e6);
                    }
                }
                Preconditions.checkNotNull(advertisingIdClient.zza);
                Preconditions.checkNotNull(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException unused) {
                    throw new IOException(ProtectedSandApp.s("ঘ"));
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
    public static void setShouldSkipGmsCoreVersionCheck(boolean z5) {
    }

    private final Info zzd(int i5) throws IOException {
        Info info;
        Preconditions.checkNotMainThread(ProtectedSandApp.s("ঙ"));
        synchronized (this) {
            if (!this.zzc) {
                synchronized (this.zzd) {
                    zzb zzbVar = this.zze;
                    if (zzbVar == null || !zzbVar.zzb) {
                        throw new IOException(ProtectedSandApp.s("জ"));
                    }
                }
                try {
                    zzb(false);
                    if (!this.zzc) {
                        throw new IOException(ProtectedSandApp.s("চ"));
                    }
                } catch (Exception e6) {
                    throw new IOException(ProtectedSandApp.s("ছ"), e6);
                }
            }
            Preconditions.checkNotNull(this.zza);
            Preconditions.checkNotNull(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException unused) {
                throw new IOException(ProtectedSandApp.s("ঝ"));
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
            long j5 = this.zzf;
            if (j5 > 0) {
                this.zze = new zzb(this, j5);
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
        Preconditions.checkNotMainThread(ProtectedSandApp.s("ঞ"));
        synchronized (this) {
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
        }
    }

    @VisibleForTesting
    protected final void zzb(boolean z5) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("ট"));
        synchronized (this) {
            if (this.zzc) {
                zza();
            }
            Context context = this.zzg;
            try {
                context.getPackageManager().getPackageInfo(ProtectedSandApp.s("ঠ"), 0);
                int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
                    throw new IOException(ProtectedSandApp.s("ড"));
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent(ProtectedSandApp.s("ঢ"));
                intent.setPackage(ProtectedSandApp.s("ণ"));
                try {
                    if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                        throw new IOException(ProtectedSandApp.s("থ"));
                    }
                    this.zza = blockingServiceConnection;
                    try {
                        this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                        this.zzc = true;
                        if (z5) {
                            zze();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException(ProtectedSandApp.s("ত"));
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    @VisibleForTesting
    final boolean zzc(@q0 Info info, boolean z5, float f6, long j5, String str, @q0 Throwable th) {
        if (Math.random() > p.f18289o) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String s5 = ProtectedSandApp.s("দ");
        String s6 = ProtectedSandApp.s("ধ");
        hashMap.put(s5, s6);
        if (info != null) {
            if (true != info.isLimitAdTrackingEnabled()) {
                s6 = ProtectedSandApp.s("ন");
            }
            hashMap.put(ProtectedSandApp.s("\u09a9"), s6);
            String id = info.getId();
            if (id != null) {
                hashMap.put(ProtectedSandApp.s("প"), Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put(ProtectedSandApp.s("ফ"), th.getClass().getName());
        }
        hashMap.put(ProtectedSandApp.s("ব"), ProtectedSandApp.s("ভ"));
        hashMap.put(ProtectedSandApp.s("ম"), Long.toString(j5));
        new zza(this, hashMap).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(@o0 Context context, long j5, boolean z5, boolean z6) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z5 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j5;
    }
}
