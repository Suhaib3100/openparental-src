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
import androidx.core.app.d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.h;
import com.flashget.kid.common.ui.notification.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
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
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes5.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    @b0("lock")
    private String zac;

    @o0
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = ProtectedSandApp.s("쥠");
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @o0
    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @o0
    public static final Task zai(@o0 HasApiKey hasApiKey, @o0 HasApiKey... hasApiKeyArr) {
        String s4 = ProtectedSandApp.s("쥡");
        Preconditions.checkNotNull(hasApiKey, s4);
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, s4);
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zaj().zam(arrayList);
    }

    @o0
    public Task<Void> checkApiAvailability(@o0 GoogleApi<?> googleApi, @o0 GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i4 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
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
    public Dialog getErrorDialog(@o0 Activity activity, int i4, int i5) {
        return getErrorDialog(activity, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @q0
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@q0 Context context, int i4, @q0 String str) {
        return super.getErrorResolutionIntent(context, i4, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @q0
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, int i4, int i5) {
        return super.getErrorResolutionPendingIntent(context, i4, i5);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @o0
    public final String getErrorString(int i4) {
        return super.getErrorString(i4);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ResultIgnorabilityUnspecified
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@o0 Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i4) {
        return super.isUserResolvableError(i4);
    }

    @o0
    @l0
    public Task<Void> makeGooglePlayServicesAvailable(@o0 Activity activity) {
        int i4 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread(ProtectedSandApp.s("쥣"));
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i4);
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
            notificationChannel = ((NotificationManager) Preconditions.checkNotNull(context.getSystemService(ProtectedSandApp.s("쥤")))).getNotificationChannel(str);
            Preconditions.checkNotNull(notificationChannel);
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(@o0 Activity activity, int i4, int i5) {
        return showErrorDialogFragment(activity, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(@o0 Context context, int i4) {
        zae(context, i4, null, getErrorResolutionPendingIntent(context, i4, 0, ProtectedSandApp.s("쥦")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    final Dialog zaa(@o0 Context context, int i4, @q0 zag zagVar, @q0 DialogInterface.OnCancelListener onCancelListener, @q0 DialogInterface.OnClickListener onClickListener) {
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = ProtectedSandApp.s("쥧").equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(context, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zab2 = com.google.android.gms.common.internal.zac.zab(context, i4);
        if (zab2 != null) {
            if (zagVar == null) {
                zagVar = onClickListener;
            }
            builder.setPositiveButton(zab2, zagVar);
        }
        String zaf = com.google.android.gms.common.internal.zac.zaf(context, i4);
        if (zaf != null) {
            builder.setTitle(zaf);
        }
        String.format(ProtectedSandApp.s("쥨"), Integer.valueOf(i4));
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
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, ProtectedSandApp.s("쥩"), onCancelListener);
        return create;
    }

    @q0
    @ResultIgnorabilityUnspecified
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter(ProtectedSandApp.s("쥪"));
        intentFilter.addDataScheme(ProtectedSandApp.s("쥫"));
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, ProtectedSandApp.s("쥠"))) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    final void zad(Activity activity, Dialog dialog, String str, @q0 DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void zae(Context context, int i4, @q0 String str, @q0 PendingIntent pendingIntent) {
        int i5;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        String.format(ProtectedSandApp.s("쥬"), Integer.valueOf(i4), null);
        new IllegalArgumentException();
        if (i4 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String zae = com.google.android.gms.common.internal.zac.zae(context, i4);
        String zad = com.google.android.gms.common.internal.zac.zad(context, i4);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService(ProtectedSandApp.s("쥤")));
        d0.n z02 = new d0.n(context, (String) null).e0(true).C(true).O(zae).z0(new d0.l().A(zad));
        if (DeviceProperties.isWearable(context)) {
            Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
            z02.t0(context.getApplicationInfo().icon).k0(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                z02.a(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
            } else {
                z02.M(pendingIntent);
            }
        } else {
            z02.t0(android.R.drawable.stat_sys_warning).B0(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).H0(System.currentTimeMillis()).M(pendingIntent).N(zad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = ProtectedSandApp.s("쥭");
                notificationChannel = notificationManager.getNotificationChannel(str2);
                String string = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    com.flashget.kid.common.ui.notification.c.a(notificationManager, g.a(str2, string, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        com.flashget.kid.common.ui.notification.c.a(notificationManager, notificationChannel);
                    }
                }
            }
            z02.G(str2);
        }
        Notification h4 = z02.h();
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, h4);
    }

    final void zaf(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(@o0 Activity activity, @o0 LifecycleFragment lifecycleFragment, int i4, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i4, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i4, ProtectedSandApp.s("쥢")), 2), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, ProtectedSandApp.s("쥥"), onCancelListener);
        return true;
    }

    public final boolean zah(@o0 Context context, @o0 ConnectionResult connectionResult, int i4) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i4, true), zap.zaa | 134217728));
        return true;
    }

    @q0
    public Dialog getErrorDialog(@o0 Activity activity, int i4, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i4, zag.zab(activity, getErrorResolutionIntent(activity, i4, ProtectedSandApp.s("쥢")), i5), onCancelListener, null);
    }

    @q0
    public PendingIntent getErrorResolutionPendingIntent(@o0 Context context, @o0 ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@o0 Context context, int i4) {
        return super.isGooglePlayServicesAvailable(context, i4);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(@o0 Activity activity, int i4, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i4, i5, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, ProtectedSandApp.s("쥥"), onCancelListener);
        return true;
    }

    @o0
    public Task<Void> checkApiAvailability(@o0 HasApiKey<?> hasApiKey, @o0 HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                int i4 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(@o0 Context context, @o0 ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    @q0
    public Dialog getErrorDialog(@o0 Fragment fragment, int i4, int i5) {
        return getErrorDialog(fragment, i4, i5, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(@o0 Activity activity, int i4, @o0 h<IntentSenderRequest> hVar, @q0 DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i4, null, onCancelListener, new zac(this, activity, i4, hVar));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, ProtectedSandApp.s("쥥"), onCancelListener);
        return true;
    }

    @q0
    public Dialog getErrorDialog(@o0 Fragment fragment, int i4, int i5, @q0 DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i4, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i4, ProtectedSandApp.s("쥢")), i5), onCancelListener, null);
    }
}
