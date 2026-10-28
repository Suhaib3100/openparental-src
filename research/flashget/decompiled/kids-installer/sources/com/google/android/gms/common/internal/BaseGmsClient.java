package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.i;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class BaseGmsClient<T extends IInterface> {

    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @q0
    private volatile String zzA;

    @q0
    private ConnectionResult zzB;
    private boolean zzC;

    @q0
    private volatile zzj zzD;

    @VisibleForTesting
    zzu zza;
    final Handler zzb;

    @VisibleForTesting
    @o0
    protected ConnectionProgressReportCallbacks zzc;

    @VisibleForTesting
    @o0
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;

    @q0
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final GmsClientSupervisor zzn;
    private final GoogleApiAvailabilityLight zzo;
    private final Object zzp;
    private final Object zzq;

    @q0
    @GuardedBy("mServiceBrokerLock")
    private IGmsServiceBroker zzr;

    @q0
    @GuardedBy("mLock")
    private IInterface zzs;
    private final ArrayList zzt;

    @q0
    @GuardedBy("mLock")
    private zze zzu;

    @GuardedBy("mLock")
    private int zzv;

    @q0
    private final BaseConnectionCallbacks zzw;

    @q0
    private final BaseOnConnectionFailedListener zzx;
    private final int zzy;

    @q0
    private final String zzz;

    @o0
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = ProtectedSandApp.s("ର");

    @o0
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = ProtectedSandApp.s("\u0b31");
    private static final Feature[] zze = new Feature[0];

    @o0
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {ProtectedSandApp.s("ଲ"), ProtectedSandApp.s("ଳ")};

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public interface BaseConnectionCallbacks {

        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(@q0 Bundle bundle);

        @KeepForSdk
        void onConnectionSuspended(int i5);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(@o0 ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(@o0 ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes3.dex */
    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@o0 ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (BaseGmsClient.this.zzx != null) {
                BaseGmsClient.this.zzx.onConnectionFailed(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    @VisibleForTesting
    @KeepForSdk
    protected BaseGmsClient(@o0 Context context, @o0 Handler handler, @o0 GmsClientSupervisor gmsClientSupervisor, @o0 GoogleApiAvailabilityLight googleApiAvailabilityLight, int i5, @q0 BaseConnectionCallbacks baseConnectionCallbacks, @q0 BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, ProtectedSandApp.s("\u0b34"));
        this.zzl = context;
        Preconditions.checkNotNull(handler, ProtectedSandApp.s("ଵ"));
        this.zzb = handler;
        this.zzm = handler.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor, ProtectedSandApp.s("ଶ"));
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, ProtectedSandApp.s("ଷ"));
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i5;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    static /* bridge */ /* synthetic */ void zzj(BaseGmsClient baseGmsClient, zzj zzjVar) {
        baseGmsClient.zzD = zzjVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.zzd;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(BaseGmsClient baseGmsClient, int i5) {
        int i6;
        int i7;
        synchronized (baseGmsClient.zzp) {
            i6 = baseGmsClient.zzv;
        }
        if (i6 == 3) {
            baseGmsClient.zzC = true;
            i7 = 5;
        } else {
            i7 = 4;
        }
        Handler handler = baseGmsClient.zzb;
        handler.sendMessage(handler.obtainMessage(i7, baseGmsClient.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(BaseGmsClient baseGmsClient, int i5, int i6, IInterface iInterface) {
        synchronized (baseGmsClient.zzp) {
            if (baseGmsClient.zzv != i5) {
                return false;
            }
            baseGmsClient.zzp(i6, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(BaseGmsClient baseGmsClient) {
        if (baseGmsClient.zzC || TextUtils.isEmpty(baseGmsClient.getServiceDescriptor()) || TextUtils.isEmpty(baseGmsClient.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(baseGmsClient.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i5, @q0 IInterface iInterface) {
        zzu zzuVar;
        Preconditions.checkArgument((i5 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i5;
            this.zzs = iInterface;
            if (i5 == 1) {
                zze zzeVar = this.zzu;
                if (zzeVar != null) {
                    GmsClientSupervisor gmsClientSupervisor = this.zzn;
                    String zzc = this.zza.zzc();
                    Preconditions.checkNotNull(zzc);
                    gmsClientSupervisor.zzb(zzc, this.zza.zzb(), this.zza.zza(), zzeVar, zze(), this.zza.zzd());
                    this.zzu = null;
                }
            } else if (i5 == 2 || i5 == 3) {
                zze zzeVar2 = this.zzu;
                if (zzeVar2 != null && (zzuVar = this.zza) != null) {
                    zzuVar.zzc();
                    zzuVar.zzb();
                    GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                    String zzc2 = this.zza.zzc();
                    Preconditions.checkNotNull(zzc2);
                    gmsClientSupervisor2.zzb(zzc2, this.zza.zzb(), this.zza.zza(), zzeVar2, zze(), this.zza.zzd());
                    this.zzd.incrementAndGet();
                }
                zze zzeVar3 = new zze(this, this.zzd.get());
                this.zzu = zzeVar3;
                zzu zzuVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new zzu(getStartServicePackage(), getStartServiceAction(), false, GmsClientSupervisor.getDefaultBindFlags(), getUseDynamicLookup()) : new zzu(getContext().getPackageName(), getLocalStartServiceAction(), true, GmsClientSupervisor.getDefaultBindFlags(), false);
                this.zza = zzuVar2;
                if (zzuVar2.zzd() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException(ProtectedSandApp.s("଼").concat(String.valueOf(this.zza.zzc())));
                }
                GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                String zzc3 = this.zza.zzc();
                Preconditions.checkNotNull(zzc3);
                if (!gmsClientSupervisor3.zzc(new zzn(zzc3, this.zza.zzb(), this.zza.zza(), this.zza.zzd()), zzeVar3, zze(), getBindServiceExecutor())) {
                    this.zza.zzc();
                    this.zza.zzb();
                    zzl(16, null, this.zzd.get());
                }
            } else if (i5 == 4) {
                Preconditions.checkNotNull(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter());
        } else {
            zzp(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(), isGooglePlayServicesAvailable, null);
        }
    }

    @KeepForSdk
    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException(ProtectedSandApp.s("ଽ"));
        }
    }

    @KeepForSdk
    public void connect(@o0 ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, ProtectedSandApp.s("ା"));
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    @q0
    @KeepForSdk
    protected abstract T createServiceInterface(@o0 IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((zzc) this.zzt.get(i5)).zzf();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    @KeepForSdk
    public void dump(@o0 String str, @o0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @o0 String[] strArr) {
        int i5;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i5 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("ି"));
        if (i5 == 1) {
            printWriter.print(ProtectedSandApp.s("\u0b45"));
        } else if (i5 == 2) {
            printWriter.print(ProtectedSandApp.s("ୄ"));
        } else if (i5 == 3) {
            printWriter.print(ProtectedSandApp.s("ୃ"));
        } else if (i5 == 4) {
            printWriter.print(ProtectedSandApp.s("ୂ"));
        } else if (i5 != 5) {
            printWriter.print(ProtectedSandApp.s("ୀ"));
        } else {
            printWriter.print(ProtectedSandApp.s("ୁ"));
        }
        printWriter.append((CharSequence) ProtectedSandApp.s("\u0b46"));
        if (iInterface == null) {
            printWriter.append((CharSequence) ProtectedSandApp.s("େ"));
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append((CharSequence) ProtectedSandApp.s("ୈ")).append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append((CharSequence) ProtectedSandApp.s("\u0b49"));
        if (iGmsServiceBroker == null) {
            printWriter.println(ProtectedSandApp.s("\u0b4a"));
        } else {
            printWriter.append((CharSequence) ProtectedSandApp.s("ୋ")).println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("ୌ"), Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("୍"));
            long j5 = this.zzh;
            append.println(j5 + ProtectedSandApp.s("\u0b4e") + simpleDateFormat.format(new Date(j5)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("\u0b4f"));
            int i6 = this.zzf;
            if (i6 == 1) {
                printWriter.append((CharSequence) ProtectedSandApp.s("\u0b52"));
            } else if (i6 == 2) {
                printWriter.append((CharSequence) ProtectedSandApp.s("\u0b51"));
            } else if (i6 != 3) {
                printWriter.append((CharSequence) String.valueOf(i6));
            } else {
                printWriter.append((CharSequence) ProtectedSandApp.s("\u0b50"));
            }
            PrintWriter append2 = printWriter.append((CharSequence) ProtectedSandApp.s("\u0b53"));
            long j6 = this.zzg;
            append2.println(j6 + ProtectedSandApp.s("\u0b54") + simpleDateFormat.format(new Date(j6)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("୕")).append((CharSequence) CommonStatusCodes.getStatusCodeString(this.zzi));
            PrintWriter append3 = printWriter.append((CharSequence) ProtectedSandApp.s("ୖ"));
            long j7 = this.zzj;
            append3.println(j7 + ProtectedSandApp.s("ୗ") + simpleDateFormat.format(new Date(j7)));
        }
    }

    @KeepForSdk
    protected boolean enableLocalFallback() {
        return false;
    }

    @q0
    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @o0
    @KeepForSdk
    public Feature[] getApiFeatures() {
        return zze;
    }

    @q0
    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzb;
    }

    @q0
    @KeepForSdk
    protected Executor getBindServiceExecutor() {
        return null;
    }

    @q0
    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @o0
    @KeepForSdk
    public final Context getContext() {
        return this.zzl;
    }

    @o0
    @KeepForSdk
    public String getEndpointPackageName() {
        zzu zzuVar;
        if (!isConnected() || (zzuVar = this.zza) == null) {
            throw new RuntimeException(ProtectedSandApp.s("\u0b58"));
        }
        return zzuVar.zzb();
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.zzy;
    }

    @o0
    @KeepForSdk
    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @q0
    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    @q0
    @KeepForSdk
    protected String getLocalStartServiceAction() {
        return null;
    }

    @o0
    @KeepForSdk
    public final Looper getLooper() {
        return this.zzm;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @n1
    @KeepForSdk
    public void getRemoteService(@q0 IAccountAccessor iAccountAccessor, @o0 Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i5 = this.zzy;
        String str = this.zzA;
        int i6 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i5, i6, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(ProtectedSandApp.s("\u0b59"), ProtectedSandApp.s("\u0b5a"));
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzj = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    IGmsServiceBroker iGmsServiceBroker = this.zzr;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.getService(new zzd(this, this.zzd.get()), getServiceRequest);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                onPostInitHandler(8, null, null, this.zzd.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e6) {
            throw e6;
        }
    }

    @o0
    @KeepForSdk
    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    @o0
    @KeepForSdk
    public final T getService() throws DeadObjectException {
        T t5;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t5 = (T) this.zzs;
            Preconditions.checkNotNull(t5, ProtectedSandApp.s("\u0b5b"));
        }
        return t5;
    }

    @q0
    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            IGmsServiceBroker iGmsServiceBroker = this.zzr;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    @o0
    @KeepForSdk
    protected abstract String getServiceDescriptor();

    @o0
    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ଡ଼"));
    }

    @o0
    @KeepForSdk
    protected abstract String getStartServiceAction();

    @o0
    @KeepForSdk
    protected String getStartServicePackage() {
        return ProtectedSandApp.s("ଢ଼");
    }

    @q0
    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzd;
    }

    @KeepForSdk
    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    @KeepForSdk
    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z5;
        synchronized (this.zzp) {
            z5 = this.zzv == 4;
        }
        return z5;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z5;
        synchronized (this.zzp) {
            int i5 = this.zzv;
            z5 = true;
            if (i5 != 2 && i5 != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    @i
    @KeepForSdk
    protected void onConnectedLocked(@o0 T t5) {
        this.zzh = System.currentTimeMillis();
    }

    @i
    @KeepForSdk
    protected void onConnectionFailed(@o0 ConnectionResult connectionResult) {
        this.zzi = connectionResult.getErrorCode();
        this.zzj = System.currentTimeMillis();
    }

    @i
    @KeepForSdk
    protected void onConnectionSuspended(int i5) {
        this.zzf = i5;
        this.zzg = System.currentTimeMillis();
    }

    @KeepForSdk
    protected void onPostInitHandler(int i5, @q0 IBinder iBinder, @q0 Bundle bundle, int i6) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i6, -1, new zzf(this, i5, iBinder, bundle)));
    }

    @KeepForSdk
    public void onUserSignOut(@o0 SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    @KeepForSdk
    public void setAttributionTag(@o0 String str) {
        this.zzA = str;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i5) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i5));
    }

    @VisibleForTesting
    @KeepForSdk
    protected void triggerNotAvailable(@o0 ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i5, @q0 PendingIntent pendingIntent) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, ProtectedSandApp.s("\u0b5e"));
        this.zzc = connectionProgressReportCallbacks;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i5, pendingIntent));
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    @o0
    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i5, @q0 Bundle bundle, int i6) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i6, -1, new zzg(this, i5, null)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected BaseGmsClient(@androidx.annotation.o0 android.content.Context r10, @androidx.annotation.o0 android.os.Looper r11, int r12, @androidx.annotation.q0 com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, @androidx.annotation.q0 com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, @androidx.annotation.q0 java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.BaseGmsClient.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener, java.lang.String):void");
    }

    @KeepForSdk
    public void disconnect(@o0 String str) {
        this.zzk = str;
        disconnect();
    }

    @VisibleForTesting
    @KeepForSdk
    protected BaseGmsClient(@o0 Context context, @o0 Looper looper, @o0 GmsClientSupervisor gmsClientSupervisor, @o0 GoogleApiAvailabilityLight googleApiAvailabilityLight, int i5, @q0 BaseConnectionCallbacks baseConnectionCallbacks, @q0 BaseOnConnectionFailedListener baseOnConnectionFailedListener, @q0 String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, ProtectedSandApp.s("ସ"));
        this.zzl = context;
        Preconditions.checkNotNull(looper, ProtectedSandApp.s("ହ"));
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, ProtectedSandApp.s("\u0b3a"));
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, ProtectedSandApp.s("\u0b3b"));
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i5;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
