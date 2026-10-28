package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.b0;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.x1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    @b0("mLock")
    private String zac;

    @o0
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("⅖");
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @o0
    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @o0
    public static final Task<Map<ApiKey<?>, String>> zai(@o0 HasApiKey<?> hasApiKey, @o0 HasApiKey<?>... hasApiKeyArr) {
        String s5 = ProtectedSandApp.s("⅗");
        Preconditions.checkNotNull(hasApiKey, s5);
        for (HasApiKey<?> hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, s5);
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zal().zao(arrayList);
    }

    @o0
    public Task<Void> checkApiAvailability(@o0 GoogleApi<?> googleApi, @o0 GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i5 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@o0 Context context) {
        return super.getClientVersion(context);
    }

    @q0
    public Dialog getErrorDialog(@o0 Activity activity, int i5, int i6) {
        return getErrorDialog(activity, i5, i6, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @q0
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@q0 Context context, int i5, @q0 String str) {
        return super.getErrorResolutionIntent(context, i5, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @q0
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, int i5, int i6) {
        return super.getErrorResolutionPendingIntent(context, i5, i6);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @o0
    public final String getErrorString(int i5) {
        return super.getErrorString(i5);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@o0 Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i5) {
        return super.isUserResolvableError(i5);
    }

    @o0
    @l0
    public Task<Void> makeGooglePlayServicesAvailable(@o0 Activity activity) {
        int i5 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread(ProtectedSandApp.s("⅚"));
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i5);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaa2 = zacc.zaa(activity);
        zaa2.zah(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@o0 Context context, @o0 String str) {
        NotificationChannel notificationChannel;
        if (PlatformVersion.isAtLeastO()) {
            notificationChannel = ((NotificationManager) Preconditions.checkNotNull(context.getSystemService(ProtectedSandApp.s("⅛")))).getNotificationChannel(str);
            Preconditions.checkNotNull(notificationChannel);
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(@o0 Activity activity, int i5, int i6) {
        return showErrorDialogFragment(activity, i5, i6, null);
    }

    public void showErrorNotification(@o0 Context context, int i5) {
        zae(context, i5, null, getErrorResolutionPendingIntent(context, i5, 0, ProtectedSandApp.s("⅝")));
    }

    @q0
    final Dialog zaa(@o0 Context context, int i5, zag zagVar, @q0 DialogInterface.OnCancelListener onCancelListener) {
        if (i5 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = ProtectedSandApp.s("⅞").equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(context, i5));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zac = com.google.android.gms.common.internal.zac.zac(context, i5);
        if (zac != null) {
            builder.setPositiveButton(zac, zagVar);
        }
        String zag = com.google.android.gms.common.internal.zac.zag(context, i5);
        if (zag != null) {
            builder.setTitle(zag);
        }
        String.format(ProtectedSandApp.s("⅟"), Integer.valueOf(i5));
        new IllegalArgumentException();
        return builder.create();
    }

    @o0
    public final Dialog zab(@o0 Activity activity, @o0 DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, ProtectedSandApp.s("Ⅰ"), onCancelListener);
        return create;
    }

    @q0
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter(ProtectedSandApp.s("Ⅱ"));
        intentFilter.addDataScheme(ProtectedSandApp.s("Ⅲ"));
        zabx zabxVar = new zabx(zabwVar);
        context.registerReceiver(zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, ProtectedSandApp.s("Ⅳ"))) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    final void zad(Activity activity, Dialog dialog, String str, @q0 DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).Y(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void zae(Context context, int i5, @q0 String str, @q0 PendingIntent pendingIntent) {
        int i6;
        String str2;
        String.format(ProtectedSandApp.s("Ⅴ"), Integer.valueOf(i5), null);
        new IllegalArgumentException();
        if (i5 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String zaf = com.google.android.gms.common.internal.zac.zaf(context, i5);
        String zae = com.google.android.gms.common.internal.zac.zae(context, i5);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService(ProtectedSandApp.s("Ⅵ")));
        x1.g z02 = new x1.g(context, (String) null).e0(true).D(true).P(zaf).z0(new x1.e().A(zae));
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            z02.t0(context.getApplicationInfo().icon).k0(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                z02.a(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
            } else {
                z02.N(pendingIntent);
            }
        } else {
            z02.t0(android.R.drawable.stat_sys_warning).B0(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).H0(System.currentTimeMillis()).N(pendingIntent).O(zae);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = ProtectedSandApp.s("Ⅶ");
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                String zab2 = com.google.android.gms.common.internal.zac.zab(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel(str2, zab2, 4));
                } else if (!zab2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(zab2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            z02.H(str2);
        }
        Notification h5 = z02.h();
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i6 = 10436;
        } else {
            i6 = 39789;
        }
        notificationManager.notify(i6, h5);
    }

    final void zaf(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zag(@o0 Activity activity, @o0 LifecycleFragment lifecycleFragment, int i5, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i5, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i5, ProtectedSandApp.s("Ⅷ")), 2), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, ProtectedSandApp.s("Ⅸ"), onCancelListener);
        return true;
    }

    public final boolean zah(@o0 Context context, @o0 ConnectionResult connectionResult, int i5) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, zal.zaa(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i5, true), zal.zaa | 134217728));
        return true;
    }

    @q0
    public Dialog getErrorDialog(@o0 Activity activity, int i5, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i5, zag.zab(activity, getErrorResolutionIntent(activity, i5, ProtectedSandApp.s("⅘")), i6), onCancelListener);
    }

    @q0
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, @o0 ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@o0 Context context, int i5) {
        return super.isGooglePlayServicesAvailable(context, i5);
    }

    public boolean showErrorDialogFragment(@o0 Activity activity, int i5, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i5, i6, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, ProtectedSandApp.s("⅜"), onCancelListener);
        return true;
    }

    @o0
    public Task<Void> checkApiAvailability(@o0 HasApiKey<?> hasApiKey, @o0 HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i5 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(@o0 Context context, @o0 ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    @q0
    public Dialog getErrorDialog(@o0 Fragment fragment, int i5, int i6) {
        return getErrorDialog(fragment, i5, i6, (DialogInterface.OnCancelListener) null);
    }

    @q0
    public Dialog getErrorDialog(@o0 Fragment fragment, int i5, int i6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i5, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i5, ProtectedSandApp.s("⅙")), i6), onCancelListener);
    }
}
