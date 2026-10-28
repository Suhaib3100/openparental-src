package com.google.android.libraries.places.internal;

import android.content.Context;
import com.android.volley.o;
import com.android.volley.toolbox.d0;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.libraries.places.api.net.PlacesClient;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzei implements zzek {
    private final zzem zza;
    private final Context zzb;
    private final zzet zzc;
    private final zzei zzd = this;
    private final zzagm zze = zzagl.zza(zzau.zza());

    /* synthetic */ zzei(Context context, zzem zzemVar, zzet zzetVar, zzeh zzehVar) {
        this.zza = zzemVar;
        this.zzb = context;
        this.zzc = zzetVar;
    }

    public static zzej zza() {
        return new zzeg(null);
    }

    private final zzbk zzc() {
        return zzbl.zza(new zzex(this.zzb), this.zzc, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final PlacesClient zzb() {
        zzem zzemVar = this.zza;
        zzez zzezVar = new zzez(this.zzb);
        Context applicationContext = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext);
        o c5 = d0.c(applicationContext, null);
        zzagk.zza(c5);
        zzbs zza = zzbt.zza(c5, new zzde());
        Context applicationContext2 = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext2);
        o c6 = d0.c(applicationContext2, null);
        zzagk.zza(c6);
        zzdp zza2 = zzdq.zza(zzemVar, zzezVar, zza, zzbz.zza(c6), zzc(), (zzas) this.zze.zzb(), zzcr.zza(), zzcv.zza(zzdt.zza()), zzcz.zza(), zzdd.zza(zzdt.zza()));
        Context applicationContext3 = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext3);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext3);
        zzagk.zza(fusedLocationProviderClient);
        zzbd zza3 = zzbe.zza(fusedLocationProviderClient, new zzee(new zzea()));
        Context applicationContext4 = this.zzb.getApplicationContext();
        zzagk.zza(applicationContext4);
        return zzck.zza(zza2, zza3, zzbj.zza(applicationContext4, (zzas) this.zze.zzb()), zzc(), (zzas) this.zze.zzb());
    }
}
