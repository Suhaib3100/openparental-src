package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.i;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
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

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
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
    private volatile AttributionSourceWrapper zzB;

    @q0
    private ConnectionResult zzC;
    private boolean zzD;

    @q0
    private volatile zzj zzE;

    @m1
    zzs zza;
    final Handler zzb;

    @o0
    @m1
    protected ConnectionProgressReportCallbacks zzc;

    @o0
    @m1
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
    private IGmsServiceBroker zzr;

    @q0
    private IInterface zzs;
    private final ArrayList zzt;

    @q0
    private zze zzu;
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
    public static final String DEFAULT_ACCOUNT = ProtectedSandApp.s("젵");

    @o0
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = ProtectedSandApp.s("젶");
    private static final Feature[] zze = new Feature[0];

    @o0
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {ProtectedSandApp.s("젷"), ProtectedSandApp.s("져")};

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface BaseConnectionCallbacks {

        @KeepForSdk
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;

        @KeepForSdk
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        @KeepForSdk
        void onConnected(@q0 Bundle bundle);

        @KeepForSdk
        void onConnectionSuspended(int i4);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        @KeepForSdk
        void onConnectionFailed(@o0 ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        @KeepForSdk
        void onReportServiceBinding(@o0 ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    protected class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        final /* synthetic */ BaseGmsClient zza;

        @KeepForSdk
        public LegacyClientCallbackAdapter(BaseGmsClient baseGmsClient) {
            java.util.Objects.requireNonNull(baseGmsClient);
            this.zza = baseGmsClient;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(@o0 ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                BaseGmsClient baseGmsClient = this.zza;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else {
                BaseGmsClient baseGmsClient2 = this.zza;
                if (baseGmsClient2.zzl() != null) {
                    baseGmsClient2.zzl().onConnectionFailed(connectionResult);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface SignOutCallbacks {
        @KeepForSdk
        void onSignOutComplete();
    }

    @KeepForSdk
    @m1
    protected BaseGmsClient(@o0 Context context, @o0 Handler handler, @o0 GmsClientSupervisor gmsClientSupervisor, @o0 GoogleApiAvailabilityLight googleApiAvailabilityLight, int i4, @q0 BaseConnectionCallbacks baseConnectionCallbacks, @q0 BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, ProtectedSandApp.s("젹"));
        this.zzl = context;
        Preconditions.checkNotNull(handler, ProtectedSandApp.s("젺"));
        this.zzb = handler;
        this.zzm = handler.getLooper();
        Preconditions.checkNotNull(gmsClientSupervisor, ProtectedSandApp.s("젻"));
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, ProtectedSandApp.s("젼"));
        this.zzo = googleApiAvailabilityLight;
        this.zzy = i4;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzp(int i4, @q0 IInterface iInterface) {
        zzs zzsVar;
        Preconditions.checkArgument((i4 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i4;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i4 == 1) {
                    zze zzeVar = this.zzu;
                    if (zzeVar != null) {
                        GmsClientSupervisor gmsClientSupervisor = this.zzn;
                        String zza = this.zza.zza();
                        Preconditions.checkNotNull(zza);
                        gmsClientSupervisor.zzb(zza, this.zza.zzb(), 4225, zzeVar, zza(), this.zza.zzc());
                        this.zzu = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    String s4 = ProtectedSandApp.s("젾");
                    zze zzeVar2 = this.zzu;
                    if (zzeVar2 != null && (zzsVar = this.zza) != null) {
                        new StringBuilder(String.valueOf(zzsVar.zza()).length() + 70 + String.valueOf(zzsVar.zzb()).length());
                        GmsClientSupervisor gmsClientSupervisor2 = this.zzn;
                        String zza2 = this.zza.zza();
                        Preconditions.checkNotNull(zza2);
                        gmsClientSupervisor2.zzb(zza2, this.zza.zzb(), 4225, zzeVar2, zza(), this.zza.zzc());
                        this.zzd.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.zzd.get());
                    this.zzu = zzeVar3;
                    zzs zzsVar2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new zzs(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new zzs(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = zzsVar2;
                    if (zzsVar2.zzc() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException(s4.concat(String.valueOf(this.zza.zza())));
                    }
                    GmsClientSupervisor gmsClientSupervisor3 = this.zzn;
                    String zza3 = this.zza.zza();
                    Preconditions.checkNotNull(zza3);
                    ConnectionResult zza4 = gmsClientSupervisor3.zza(new zzn(zza3, this.zza.zzb(), 4225, this.zza.zzc()), zzeVar3, zza(), getBindServiceExecutor());
                    if (!zza4.isSuccess()) {
                        new StringBuilder(String.valueOf(this.zza.zza()).length() + 34 + String.valueOf(this.zza.zzb()).length());
                        int errorCode = zza4.getErrorCode() == -1 ? 16 : zza4.getErrorCode();
                        if (zza4.getResolution() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(ProtectedSandApp.s("젶"), zza4.getResolution());
                        }
                        zzb(errorCode, bundle, this.zzd.get());
                    }
                } else if (i4 == 4) {
                    Preconditions.checkNotNull(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new LegacyClientCallbackAdapter(this), isGooglePlayServicesAvailable, null);
        }
    }

    @KeepForSdk
    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException(ProtectedSandApp.s("젿"));
        }
    }

    @KeepForSdk
    public void connect(@o0 ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, ProtectedSandApp.s("졀"));
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    @q0
    @KeepForSdk
    protected abstract T createServiceInterface(@o0 IBinder iBinder);

    @KeepForSdk
    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((zzc) arrayList.get(i4)).zzf();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    @KeepForSdk
    public void dump(@o0 String str, @o0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @o0 String[] strArr) {
        int i4;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.zzp) {
            i4 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iGmsServiceBroker = this.zzr;
        }
        printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("졁"));
        if (i4 == 1) {
            printWriter.print(ProtectedSandApp.s("졇"));
        } else if (i4 == 2) {
            printWriter.print(ProtectedSandApp.s("졆"));
        } else if (i4 == 3) {
            printWriter.print(ProtectedSandApp.s("졅"));
        } else if (i4 == 4) {
            printWriter.print(ProtectedSandApp.s("졄"));
        } else if (i4 != 5) {
            printWriter.print(ProtectedSandApp.s("졂"));
        } else {
            printWriter.print(ProtectedSandApp.s("졃"));
        }
        printWriter.append((CharSequence) ProtectedSandApp.s("졈"));
        if (iInterface == null) {
            printWriter.append((CharSequence) ProtectedSandApp.s("졉"));
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append((CharSequence) ProtectedSandApp.s("졊")).append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append((CharSequence) ProtectedSandApp.s("졋"));
        if (iGmsServiceBroker == null) {
            printWriter.println(ProtectedSandApp.s("졉"));
        } else {
            printWriter.append((CharSequence) ProtectedSandApp.s("졌")).println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ProtectedSandApp.s("졍"), Locale.US);
        long j4 = this.zzh;
        String s4 = ProtectedSandApp.s("졎");
        if (j4 > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("졏"));
            long j5 = this.zzh;
            String format = simpleDateFormat.format(new Date(j5));
            StringBuilder sb = new StringBuilder(String.valueOf(j5).length() + 1 + String.valueOf(format).length());
            sb.append(j5);
            sb.append(s4);
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("졐"));
            int i5 = this.zzf;
            if (i5 == 1) {
                printWriter.append((CharSequence) ProtectedSandApp.s("졓"));
            } else if (i5 == 2) {
                printWriter.append((CharSequence) ProtectedSandApp.s("졒"));
            } else if (i5 != 3) {
                printWriter.append((CharSequence) String.valueOf(i5));
            } else {
                printWriter.append((CharSequence) ProtectedSandApp.s("졑"));
            }
            PrintWriter append2 = printWriter.append((CharSequence) ProtectedSandApp.s("졔"));
            long j6 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j6));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 1 + String.valueOf(format2).length());
            sb2.append(j6);
            sb2.append(s4);
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("졕")).append((CharSequence) CommonStatusCodes.getStatusCodeString(this.zzi));
            PrintWriter append3 = printWriter.append((CharSequence) ProtectedSandApp.s("졖"));
            long j7 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j7));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 1 + String.valueOf(format3).length());
            sb3.append(j7);
            sb3.append(s4);
            sb3.append(format3);
            append3.println(sb3.toString());
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
    public AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.zzB;
    }

    @q0
    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
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
        zzs zzsVar;
        if (!isConnected() || (zzsVar = this.zza) == null) {
            throw new RuntimeException(ProtectedSandApp.s("졗"));
        }
        return zzsVar.zzb();
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
        String attributionTag;
        String attributionTag2;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.zzA;
        } else if (this.zzB == null) {
            attributionTag2 = this.zzA;
        } else {
            AttributionSource attributionSource = this.zzB.getAttributionSource();
            if (attributionSource == null) {
                attributionTag2 = this.zzA;
            } else {
                attributionTag = attributionSource.getAttributionTag();
                attributionTag2 = attributionTag == null ? this.zzA : attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i4 = this.zzy;
        int i5 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i4, i5, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(ProtectedSandApp.s("젵"), ProtectedSandApp.s("졘"));
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
                    try {
                        IGmsServiceBroker iGmsServiceBroker = this.zzr;
                        if (iGmsServiceBroker != null) {
                            iGmsServiceBroker.getService(new zzd(this, this.zzd.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                onPostInitHandler(8, null, null, this.zzd.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e4) {
            throw e4;
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
        T t4;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                Preconditions.checkNotNull(iInterface, ProtectedSandApp.s("졙"));
                t4 = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t4;
    }

    @q0
    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                IGmsServiceBroker iGmsServiceBroker = this.zzr;
                if (iGmsServiceBroker == null) {
                    return null;
                }
                return iGmsServiceBroker.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @o0
    @KeepForSdk
    protected abstract String getServiceDescriptor();

    @o0
    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("졚"));
    }

    @o0
    @KeepForSdk
    protected abstract String getStartServiceAction();

    @o0
    @KeepForSdk
    protected String getStartServicePackage() {
        return ProtectedSandApp.s("졛");
    }

    @q0
    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
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
        return this.zzE != null;
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z4;
        synchronized (this.zzp) {
            z4 = this.zzv == 4;
        }
        return z4;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z4;
        synchronized (this.zzp) {
            int i4 = this.zzv;
            z4 = true;
            if (i4 != 2 && i4 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    @i
    @KeepForSdk
    protected void onConnectedLocked(@o0 T t4) {
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
    protected void onConnectionSuspended(int i4) {
        this.zzf = i4;
        this.zzg = System.currentTimeMillis();
    }

    @KeepForSdk
    protected void onPostInitHandler(int i4, @q0 IBinder iBinder, @q0 Bundle bundle, int i5) {
        zzf zzfVar = new zzf(this, i4, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i5, -1, zzfVar));
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
    public void setAttributionSourceWrapper(@o0 AttributionSourceWrapper attributionSourceWrapper) {
        this.zzB = attributionSourceWrapper;
    }

    @KeepForSdk
    public void setAttributionTag(@o0 String str) {
        this.zzA = str;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i4) {
        int i5 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i5, i4));
    }

    @KeepForSdk
    @m1
    protected void triggerNotAvailable(@o0 ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i4, @q0 PendingIntent pendingIntent) {
        Preconditions.checkNotNull(connectionProgressReportCallbacks, ProtectedSandApp.s("졀"));
        this.zzc = connectionProgressReportCallbacks;
        int i5 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i5, i4, pendingIntent));
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    @o0
    protected final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzb(int i4, @q0 Bundle bundle, int i5) {
        zzg zzgVar = new zzg(this, i4, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i5, -1, zzgVar));
    }

    final /* synthetic */ void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.zzd;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
    }

    final /* synthetic */ void zzd(int i4, IInterface iInterface) {
        zzp(i4, null);
    }

    final /* synthetic */ boolean zze(int i4, int i5, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i4) {
                    return false;
                }
                zzp(i5, iInterface);
                return true;
            } finally {
            }
        }
    }

    final /* synthetic */ void zzf(int i4) {
        int i5;
        int i6;
        synchronized (this.zzp) {
            i5 = this.zzv;
        }
        if (i5 == 3) {
            this.zzD = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i6, this.zzd.get(), 16));
    }

    final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    final /* synthetic */ void zzi(IGmsServiceBroker iGmsServiceBroker) {
        this.zzr = iGmsServiceBroker;
    }

    final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    final /* synthetic */ BaseConnectionCallbacks zzk() {
        return this.zzw;
    }

    final /* synthetic */ BaseOnConnectionFailedListener zzl() {
        return this.zzx;
    }

    final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    final /* synthetic */ boolean zzo() {
        return this.zzD;
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

    @KeepForSdk
    @m1
    protected BaseGmsClient(@o0 Context context, @o0 Looper looper, @o0 GmsClientSupervisor gmsClientSupervisor, @o0 GoogleApiAvailabilityLight googleApiAvailabilityLight, int i4, @q0 BaseConnectionCallbacks baseConnectionCallbacks, @q0 BaseOnConnectionFailedListener baseOnConnectionFailedListener, @q0 String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        Preconditions.checkNotNull(context, ProtectedSandApp.s("젹"));
        this.zzl = context;
        Preconditions.checkNotNull(looper, ProtectedSandApp.s("젽"));
        this.zzm = looper;
        Preconditions.checkNotNull(gmsClientSupervisor, ProtectedSandApp.s("젻"));
        this.zzn = gmsClientSupervisor;
        Preconditions.checkNotNull(googleApiAvailabilityLight, ProtectedSandApp.s("젼"));
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i4;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }
}
