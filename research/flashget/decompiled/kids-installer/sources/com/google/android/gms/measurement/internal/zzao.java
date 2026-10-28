package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.annotation.n1;
import androidx.core.content.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzao extends zzgx {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    zzao(zzgd zzgdVar) {
        super(zzgdVar);
    }

    @n1
    final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzv();
        return this.zza;
    }

    public final String zzc() {
        zzv();
        return this.zzb;
    }

    @n1
    final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    @n1
    final boolean zze() {
        Account[] result;
        String s5 = ProtectedSandApp.s("〤");
        zzg();
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (d.a(this.zzt.zzaw(), ProtectedSandApp.s("〥")) != 0) {
            this.zzt.zzaA().zzm().zza(ProtectedSandApp.s("〦"));
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        if (this.zzc == null) {
            this.zzc = AccountManager.get(this.zzt.zzaw());
        }
        try {
            result = this.zzc.getAccountsByTypeAndFeatures(s5, new String[]{ProtectedSandApp.s("〧")}, null, null).getResult();
        } catch (AuthenticatorException | OperationCanceledException | IOException e6) {
            this.zzt.zzaA().zzh().zzb(ProtectedSandApp.s("〩"), e6);
        }
        if (result != null && result.length > 0) {
            this.zzd = Boolean.TRUE;
            this.zze = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.zzc.getAccountsByTypeAndFeatures(s5, new String[]{ProtectedSandApp.s("〨")}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.zzd = Boolean.TRUE;
            this.zze = currentTimeMillis;
            return true;
        }
        this.zze = currentTimeMillis;
        this.zzd = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = language.toLowerCase(locale2) + ProtectedSandApp.s("〪") + locale.getCountry().toLowerCase(locale2);
        return false;
    }
}
