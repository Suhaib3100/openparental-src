package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.o0;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public interface zzg extends HasApiKey {
    Task zza(zzbw zzbwVar);

    Task zzb(@o0 AccountChangeEventsRequest accountChangeEventsRequest);

    Task zzc(@o0 Account account, @o0 String str, Bundle bundle);

    Task zzd(@o0 Account account);

    Task zze(@o0 String str);
}
