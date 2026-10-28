package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.b1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@ShowFirstParty
/* loaded from: classes5.dex */
public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = ProtectedSandApp.s("윌");

    @ShowFirstParty
    public static final String WORK_ACCOUNT_TYPE = ProtectedSandApp.s("윍");
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = ProtectedSandApp.s("윎");

    @ShowFirstParty
    public static final String[] zza = {ProtectedSandApp.s("윌"), ProtectedSandApp.s("윍"), ProtectedSandApp.s("윏")};

    @ShowFirstParty
    @SuppressLint({"InlinedApi"})
    public static final String zzb = ProtectedSandApp.s("윐");
    private static final ComponentName zzc = new ComponentName(ProtectedSandApp.s("윑"), ProtectedSandApp.s("윒"));
    private static final Logger zzd = zzd.zza(ProtectedSandApp.s("윓"));

    zzl() {
    }

    public static void clearToken(Context context, String str) throws GoogleAuthException, IOException {
        zze(context, str, 0L);
    }

    public static List<AccountChangeEvent> getAccountChangeEvents(Context context, int i4, String str) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("윔"));
        Preconditions.checkNotMainThread(ProtectedSandApp.s("윕"));
        zzk(context, 8400000);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.setAccountName(str);
        accountChangeEventsRequest.setEventIndex(i4);
        zzdc.zzd(context);
        if (zzhw.zzd() && zzp(context)) {
            Task zzb2 = com.google.android.gms.internal.auth.zzh.zza(context).zzb(accountChangeEventsRequest);
            String s4 = ProtectedSandApp.s("윖");
            try {
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) zzi(zzb2, s4);
                zzj(accountChangeEventsResponse);
                return accountChangeEventsResponse.getEvents();
            } catch (ApiException e4) {
                zzl(e4, s4);
            }
        }
        return (List) zzh(context, zzc, new zzi(accountChangeEventsRequest), 0L, null);
    }

    public static String getAccountId(Context context, String str) throws GoogleAuthException, IOException {
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("윔"));
        Preconditions.checkNotMainThread(ProtectedSandApp.s("윕"));
        zzk(context, 8400000);
        return getToken(context, str, ProtectedSandApp.s("윗"), new Bundle());
    }

    public static String getToken(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, account, str, new Bundle());
    }

    @b1("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken(ProtectedSandApp.s("윌"), str);
    }

    @ShowFirstParty
    @TargetApi(23)
    public static Bundle removeAccount(Context context, final Account account) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(context);
        zzo(account);
        zzk(context, 8400000);
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            Task zzd2 = com.google.android.gms.internal.auth.zzh.zza(context).zzd(account);
            String s4 = ProtectedSandApp.s("윘");
            try {
                Bundle bundle = (Bundle) zzi(zzd2, s4);
                zzj(bundle);
                return bundle;
            } catch (ApiException e4) {
                zzl(e4, s4);
            }
        }
        return (Bundle) zzh(context, zzc, new zzk() { // from class: com.google.android.gms.auth.zzf
            @Override // com.google.android.gms.auth.zzk
            public final Object zza(IBinder iBinder) {
                Bundle zzf = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzf(account);
                if (zzf != null) {
                    return zzf;
                }
                throw new IOException(ProtectedSandApp.s("좘"));
            }
        }, 0L, null);
    }

    @TargetApi(26)
    public static Boolean requestGoogleAccountsAccess(Context context) throws GoogleAuthException, IOException {
        Preconditions.checkNotNull(context);
        zzk(context, 11400000);
        String str = context.getApplicationInfo().packageName;
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            Task zze = com.google.android.gms.internal.auth.zzh.zza(context).zze(str);
            String s4 = ProtectedSandApp.s("윙");
            try {
                Bundle bundle = (Bundle) zzi(zze, s4);
                String string = bundle.getString(ProtectedSandApp.s("윚"));
                Intent intent = (Intent) bundle.getParcelable(ProtectedSandApp.s("윛"));
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("윜"));
                if (zzby.zzc.equals(zzby.zza(string))) {
                    return Boolean.TRUE;
                }
                zzn(context, ProtectedSandApp.s("윝"), string, intent, pendingIntent);
                throw new GoogleAuthException(ProtectedSandApp.s("윞"));
            } catch (ApiException e4) {
                zzl(e4, s4);
            }
        }
        return (Boolean) zzh(context, zzc, new zzj(str, context), 0L, null);
    }

    @ShowFirstParty
    public static TokenData zza(final Context context, final Account account, final String str, Bundle bundle, long j4, @q0 Executor executor) throws IOException, GoogleAuthException {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("윕"));
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("윟"));
        zzo(account);
        zzk(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzm(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            Task zzc2 = com.google.android.gms.internal.auth.zzh.zza(context).zzc(account, str, bundle2);
            String s4 = ProtectedSandApp.s("유");
            try {
                Bundle bundle3 = (Bundle) zzi(zzc2, s4);
                zzj(bundle3);
                return zzg(context, ProtectedSandApp.s("육"), bundle3);
            } catch (ApiException e4) {
                zzl(e4, s4);
            }
        }
        return (TokenData) zzh(context, zzc, new zzk() { // from class: com.google.android.gms.auth.zzg
            @Override // com.google.android.gms.auth.zzk
            public final Object zza(IBinder iBinder) {
                return zzl.zzb(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData zzb(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle zze = com.google.android.gms.internal.auth.zze.zzb(iBinder).zze(account, str, bundle);
        if (zze != null) {
            return zzg(context, ProtectedSandApp.s("육"), zze);
        }
        throw new IOException(ProtectedSandApp.s("윢"));
    }

    static /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzj(obj);
        return obj;
    }

    @ShowFirstParty
    public static void zze(Context context, String str, long j4) throws GoogleAuthException, IOException {
        Preconditions.checkNotMainThread(ProtectedSandApp.s("윕"));
        zzk(context, 8400000);
        Bundle bundle = new Bundle();
        zzm(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && zzp(context)) {
            com.google.android.gms.internal.auth.zzg zza2 = com.google.android.gms.internal.auth.zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            Task zza3 = zza2.zza(zzbwVar);
            String s4 = ProtectedSandApp.s("윣");
            try {
                zzi(zza3, s4);
                return;
            } catch (ApiException e4) {
                zzl(e4, s4);
            }
        }
        zzh(context, zzc, new zzh(str, bundle), 0L, null);
    }

    static void zzf(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("윥"));
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException(ProtectedSandApp.s("윤"));
        }
    }

    private static TokenData zzg(Context context, String str, Bundle bundle) throws GoogleAuthException, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("윦"));
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable(ProtectedSandApp.s("윧"));
        }
        if (tokenData != null) {
            return tokenData;
        }
        zzn(context, ProtectedSandApp.s("육"), bundle.getString(ProtectedSandApp.s("윚")), (Intent) bundle.getParcelable(ProtectedSandApp.s("윛")), (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("윜")));
        throw new GoogleAuthException(ProtectedSandApp.s("윞"));
    }

    private static Object zzh(Context context, ComponentName componentName, zzk zzkVar, long j4, @q0 Executor executor) throws IOException, GoogleAuthException {
        String s4 = ProtectedSandApp.s("윓");
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor gmsClientSupervisor = GmsClientSupervisor.getInstance(context);
        try {
            try {
                if (!gmsClientSupervisor.bindService(componentName, blockingServiceConnection, s4, null)) {
                    throw new IOException(ProtectedSandApp.s("윩"));
                }
                try {
                    return zzkVar.zza(blockingServiceConnection.getService());
                } catch (RemoteException | InterruptedException | TimeoutException e4) {
                    throw new IOException(ProtectedSandApp.s("율"), e4);
                }
            } finally {
                gmsClientSupervisor.unbindService(componentName, blockingServiceConnection, s4);
            }
        } catch (SecurityException e5) {
            String.format(ProtectedSandApp.s("윪"), e5.getMessage());
            throw new IOException(ProtectedSandApp.s("윫"), e5);
        }
    }

    private static Object zzi(Task task, String str) throws IOException, ApiException {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e4) {
            String format = String.format(ProtectedSandApp.s("윭"), str);
            zzd.w(format, new Object[0]);
            throw new IOException(format, e4);
        } catch (CancellationException e5) {
            String format2 = String.format(ProtectedSandApp.s("윬"), str);
            zzd.w(format2, new Object[0]);
            throw new IOException(format2, e5);
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof ApiException) {
                throw ((ApiException) cause);
            }
            String format3 = String.format(ProtectedSandApp.s("윮"), str);
            zzd.w(format3, new Object[0]);
            throw new IOException(format3, e6);
        }
    }

    private static Object zzj(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        zzd.w(ProtectedSandApp.s("윯"), new Object[0]);
        throw new IOException(ProtectedSandApp.s("윰"));
    }

    private static void zzk(Context context, int i4) throws GoogleAuthException {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i4);
        } catch (GooglePlayServicesIncorrectManifestValueException e4) {
            e = e4;
            throw new GoogleAuthException(e.getMessage(), e);
        } catch (GooglePlayServicesNotAvailableException e5) {
            e = e5;
            throw new GoogleAuthException(e.getMessage(), e);
        } catch (GooglePlayServicesRepairableException e6) {
            throw new GooglePlayServicesAvailabilityException(e6.getConnectionStatusCode(), e6.getMessage(), e6.getIntent());
        }
    }

    private static void zzl(ApiException apiException, String str) {
        zzd.w(ProtectedSandApp.s("윱"), str, Log.getStackTraceString(apiException));
    }

    private static void zzm(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString(ProtectedSandApp.s("윲"), str);
        String str2 = zzb;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong(ProtectedSandApp.s("윳"), SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(Context context, String str, @q0 String str2, @q0 Intent intent, @q0 PendingIntent pendingIntent) throws GoogleAuthException, IOException {
        zzby zza2 = zzby.zza(str2);
        Logger logger = zzd;
        logger.w(String.format(ProtectedSandApp.s("윴"), zza2, str), new Object[0]);
        if (!zzby.zzi.equals(zza2) && !zzby.zzs.equals(zza2) && !zzby.zzw.equals(zza2) && !zzby.zzx.equals(zza2) && !zzby.zzn.equals(zza2) && !zzby.zzz.equals(zza2) && !zzby.zzN.equals(zza2) && !zzby.zzF.equals(zza2) && !zzby.zzG.equals(zza2) && !zzby.zzH.equals(zza2) && !zzby.zzI.equals(zza2) && !zzby.zzJ.equals(zza2) && !zzby.zzK.equals(zza2) && !zzby.zzM.equals(zza2) && !zzby.zzE.equals(zza2) && !zzby.zzL.equals(zza2)) {
            if (!zzby.zze.equals(zza2) && !zzby.zzf.equals(zza2) && !zzby.zzg.equals(zza2) && !zzby.zzaf.equals(zza2) && !zzby.zzah.equals(zza2)) {
                throw new GoogleAuthException(str2);
            }
            throw new IOException(str2);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.zza(str2, intent, pendingIntent);
        }
        if (GoogleApiAvailability.getInstance().getApkVersion(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            logger.e(String.format(ProtectedSandApp.s("융"), Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            logger.e(String.format(ProtectedSandApp.s("윶"), str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void zzo(Account account) {
        if (account == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("윹"));
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("윸"));
        }
        String[] strArr = zza;
        for (int i4 = 0; i4 < 3; i4++) {
            if (strArr[i4].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("윷"));
    }

    private static boolean zzp(Context context) {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 17895000) != 0) {
            return false;
        }
        List zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = zzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        zzo(account);
        return zza(context, account, str, bundle, 0L, null).zza();
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, new Account(str, ProtectedSandApp.s("윌")), str2);
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, new Account(str, ProtectedSandApp.s("윌")), str2, bundle);
    }
}
