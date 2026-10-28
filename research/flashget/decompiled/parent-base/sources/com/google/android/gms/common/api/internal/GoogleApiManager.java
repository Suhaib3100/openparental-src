package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.d;
import androidx.collection.r2;
import androidx.fragment.app.y;
import androidx.work.i0;
import androidx.work.z;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g9.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import jf.c;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class GoogleApiManager implements Handler.Callback {

    @o0
    public static final Status zaa = new Status(4, ProtectedSandApp.s("짟"));
    private static final Status zab = new Status(4, ProtectedSandApp.s("짠"));
    private static final Object zac = new Object();

    @q0
    @a("lock")
    private static GoogleApiManager zad;

    @q0
    private TelemetryData zag;

    @q0
    private TelemetryLoggingClient zah;
    private final Context zai;
    private final GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;

    @c
    private final Handler zar;
    private volatile boolean zas;
    private long zae = i0.f35991f;
    private boolean zaf = false;
    private final AtomicInteger zal = new AtomicInteger(1);
    private final AtomicInteger zam = new AtomicInteger(0);
    private final Map zan = new ConcurrentHashMap(5, 0.75f, 1);

    @q0
    @a("lock")
    private zaae zao = null;

    @a("lock")
    private final Set zap = new d();
    private final Set zaq = new d();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zas = true;
        this.zai = context;
        com.google.android.gms.internal.base.zau zauVar = new com.google.android.gms.internal.base.zau(looper, this);
        this.zar = zauVar;
        this.zaj = googleApiAvailability;
        this.zak = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zas = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            try {
                GoogleApiManager googleApiManager = zad;
                if (googleApiManager != null) {
                    googleApiManager.zam.incrementAndGet();
                    Handler handler = googleApiManager.zar;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaF(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(connectionResult, y.a(ProtectedSandApp.s("짡"), apiKey.zaa(), ProtectedSandApp.s("짢"), String.valueOf(connectionResult)));
    }

    @n1
    @ResultIgnorabilityUnspecified
    private final zabq zaG(GoogleApi googleApi) {
        Map map = this.zan;
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            this.zan.put(apiKey, zabqVar);
        }
        if (zabqVar.zaA()) {
            this.zaq.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    @n1
    private final TelemetryLoggingClient zaH() {
        if (this.zah == null) {
            this.zah = TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    @n1
    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaH().log(telemetryData);
            }
            this.zag = null;
        }
    }

    private final void zaJ(TaskCompletionSource taskCompletionSource, int i4, GoogleApi googleApi) {
        zacd zaa2;
        if (i4 == 0 || (zaa2 = zacd.zaa(this, i4, googleApi.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.zar;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zaa2);
    }

    @o0
    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, ProtectedSandApp.s("짣"));
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @ResultIgnorabilityUnspecified
    @o0
    public static GoogleApiManager zak(@o0 Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            try {
                if (zad == null) {
                    zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
                }
                googleApiManager = zad;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    @n1
    public final boolean handleMessage(@o0 Message message) {
        ApiKey apiKey;
        boolean zaO;
        ApiKey apiKey2;
        ApiKey apiKey3;
        ApiKey apiKey4;
        ApiKey apiKey5;
        int i4 = message.what;
        long j4 = z.f36621h;
        zabq zabqVar = null;
        switch (i4) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j4 = i0.f35991f;
                }
                this.zae = j4;
                this.zar.removeMessages(12);
                for (ApiKey apiKey6 : this.zan.keySet()) {
                    Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey6), this.zae);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ApiKey apiKey7 = (ApiKey) it.next();
                        zabq zabqVar2 = (zabq) this.zan.get(apiKey7);
                        if (zabqVar2 == null) {
                            zalVar.zac(apiKey7, new ConnectionResult(13), null);
                        } else if (zabqVar2.zaz()) {
                            zalVar.zac(apiKey7, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zad2 = zabqVar2.zad();
                            if (zad2 != null) {
                                zalVar.zac(apiKey7, zad2, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : this.zan.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVar4 = (zabq) this.zan.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = zaG(zachVar.zac);
                }
                if (!zabqVar4.zaA() || this.zam.get() == zachVar.zab) {
                    zabqVar4.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                }
                return true;
            case 5:
                int i5 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.zan.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq zabqVar5 = (zabq) it2.next();
                        if (zabqVar5.zab() == i5) {
                            zabqVar = zabqVar5;
                        }
                    }
                }
                if (zabqVar == null) {
                    Log.wtf(ProtectedSandApp.s("짨"), r2.a(ProtectedSandApp.s("짦"), i5, ProtectedSandApp.s("짧")), new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    zabqVar.zaE(new Status(17, y.a(ProtectedSandApp.s("짤"), this.zaj.getErrorString(connectionResult.getErrorCode()), ProtectedSandApp.s("짥"), connectionResult.getErrorMessage())));
                } else {
                    apiKey = zabqVar.zad;
                    zabqVar.zaE(zaF(apiKey, connectionResult));
                }
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zai.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabl(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = z.f36621h;
                    }
                }
                return true;
            case 7:
                zaG((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                Iterator it3 = this.zaq.iterator();
                while (it3.hasNext()) {
                    zabq zabqVar6 = (zabq) this.zan.remove((ApiKey) it3.next());
                    if (zabqVar6 != null) {
                        zabqVar6.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaB();
                }
                return true;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey zaa2 = zaafVar.zaa();
                if (this.zan.containsKey(zaa2)) {
                    zaO = ((zabq) this.zan.get(zaa2)).zaO(false);
                    zaafVar.zab().setResult(Boolean.valueOf(zaO));
                } else {
                    zaafVar.zab().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                Map map = this.zan;
                apiKey2 = zabsVar.zaa;
                if (map.containsKey(apiKey2)) {
                    Map map2 = this.zan;
                    apiKey3 = zabsVar.zaa;
                    zabq.zal((zabq) map2.get(apiKey3), zabsVar);
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                Map map3 = this.zan;
                apiKey4 = zabsVar2.zaa;
                if (map3.containsKey(apiKey4)) {
                    Map map4 = this.zan;
                    apiKey5 = zabsVar2.zaa;
                    zabq.zam((zabq) map4.get(apiKey5), zabsVar2);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaH().log(new TelemetryData(zaceVar.zab, Arrays.asList(zaceVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zag;
                    if (telemetryData != null) {
                        List zab2 = telemetryData.zab();
                        if (telemetryData.zaa() != zaceVar.zab || (zab2 != null && zab2.size() >= zaceVar.zad)) {
                            this.zar.removeMessages(17);
                            zaI();
                        } else {
                            this.zag.zac(zaceVar.zaa);
                        }
                    }
                    if (this.zag == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zag = new TelemetryData(zaceVar.zab, arrayList);
                        Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                return false;
        }
    }

    public final void zaA(@o0 zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao != zaaeVar) {
                    this.zao = zaaeVar;
                    this.zap.clear();
                }
                this.zap.addAll(zaaeVar.zaa());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void zaB(@o0 zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao == zaaeVar) {
                    this.zao = null;
                    this.zap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @n1
    final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zak.zaa(this.zai, 203400000);
        return zaa2 == -1 || zaa2 == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean zaE(ConnectionResult connectionResult, int i4) {
        return this.zaj.zah(this.zai, connectionResult, i4);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    @q0
    final zabq zai(ApiKey apiKey) {
        return (zabq) this.zan.get(apiKey);
    }

    @o0
    public final Task zam(@o0 Iterable iterable) {
        zal zalVar = new zal(iterable);
        this.zar.sendMessage(this.zar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @ResultIgnorabilityUnspecified
    @o0
    public final Task zan(@o0 GoogleApi googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        this.zar.sendMessage(this.zar.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    @o0
    public final Task zao(@o0 GoogleApi googleApi, @o0 RegisterListenerMethod registerListenerMethod, @o0 UnregisterListenerMethod unregisterListenerMethod, @o0 Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaJ(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(8, new zach(new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @o0
    public final Task zap(@o0 GoogleApi googleApi, @o0 ListenerHolder.ListenerKey listenerKey, int i4) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaJ(taskCompletionSource, i4, googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(13, new zach(new zah(listenerKey, taskCompletionSource), this.zam.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final void zau(@o0 GoogleApi googleApi, int i4, @o0 BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zae(i4, apiMethodImpl), this.zam.get(), googleApi)));
    }

    public final void zav(@o0 GoogleApi googleApi, int i4, @o0 TaskApiCall taskApiCall, @o0 TaskCompletionSource taskCompletionSource, @o0 StatusExceptionMapper statusExceptionMapper) {
        zaJ(taskCompletionSource, taskApiCall.zaa(), googleApi);
        this.zar.sendMessage(this.zar.obtainMessage(4, new zach(new zag(i4, taskApiCall, taskCompletionSource, statusExceptionMapper), this.zam.get(), googleApi)));
    }

    final void zaw(MethodInvocation methodInvocation, int i4, long j4, int i5) {
        this.zar.sendMessage(this.zar.obtainMessage(18, new zace(methodInvocation, i4, j4, i5)));
    }

    public final void zax(@o0 ConnectionResult connectionResult, int i4) {
        if (zaE(connectionResult, i4)) {
            return;
        }
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i4, 0, connectionResult));
    }

    public final void zay() {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(@o0 GoogleApi googleApi) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}
