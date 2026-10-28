package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes5.dex */
final class zzdx extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdy zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdx(zzdy zzdyVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        zzdj zzdjVar;
        zzdj zzdjVar2;
        String str4;
        String unused;
        String s4 = ProtectedSandApp.s("틵");
        try {
            zzc = this.zzg.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str5 = this.zzd;
                String str6 = this.zzc;
                str4 = this.zzg.zzc;
                str3 = str5;
                str2 = str6;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzdy zzdyVar = this.zzg;
            zzdyVar.zzj = zzdyVar.zza(this.zze, true);
            zzdjVar = this.zzg.zzj;
            if (zzdjVar == null) {
                unused = this.zzg.zzc;
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zze, s4);
            zzdw zzdwVar = new zzdw(106000L, Math.max(localVersion, r0), DynamiteModule.getRemoteVersion(this.zze, s4) < localVersion, str, str2, str3, this.zzf, com.google.android.gms.measurement.internal.zzhs.zza(this.zze));
            zzdjVar2 = this.zzg.zzj;
            ((zzdj) Preconditions.checkNotNull(zzdjVar2)).initialize(ObjectWrapper.wrap(this.zze), zzdwVar, this.zza);
        } catch (Exception e4) {
            this.zzg.zza(e4, true, false);
        }
    }
}
