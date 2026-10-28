package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzao;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class AccountTransfer {

    @o0
    public static final Api zza;

    @Deprecated
    public static final zzao zzb;

    @Deprecated
    public static final zzao zzc;
    private static final Api.ClientKey zzd;
    private static final Api.AbstractClientBuilder zze;

    @o0
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = ProtectedSandApp.s("읒");

    @o0
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = ProtectedSandApp.s("읓");

    @o0
    public static final String ACTION_START_ACCOUNT_EXPORT = ProtectedSandApp.s("읔");

    @o0
    public static final String KEY_EXTRA_ACCOUNT_TYPE = ProtectedSandApp.s("읕");

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzd = clientKey;
        zza zzaVar = new zza();
        zze = zzaVar;
        zza = new Api(ProtectedSandApp.s("읖"), zzaVar, clientKey);
        zzb = new zzao();
        zzc = new zzao();
    }

    private AccountTransfer() {
    }

    @o0
    public static AccountTransferClient getAccountTransferClient(@o0 Activity activity) {
        return new AccountTransferClient(activity, (zzr) null);
    }

    @o0
    public static AccountTransferClient getAccountTransferClient(@o0 Context context) {
        return new AccountTransferClient(context, (zzr) null);
    }
}
