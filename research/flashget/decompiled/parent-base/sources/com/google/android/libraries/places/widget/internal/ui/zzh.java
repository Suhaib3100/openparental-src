package com.google.android.libraries.places.widget.internal.ui;

import android.content.Context;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzas;
import com.google.android.libraries.places.internal.zzav;
import com.google.android.libraries.places.internal.zzes;
import com.google.android.libraries.places.internal.zzet;
import com.google.android.libraries.places.internal.zzex;
import com.google.android.libraries.places.internal.zzfl;
import com.google.android.libraries.places.internal.zzgj;
import com.google.android.libraries.places.internal.zzgk;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzh extends n {
    private final int zza;
    private final PlacesClient zzb;
    private final zzfl zzc;
    private final zzgj zzd;
    private final zzas zze;

    public zzh(@j0 int i4, Context context, zzfl zzflVar) {
        this.zza = i4;
        Context applicationContext = context.getApplicationContext();
        zzes zzd = zzet.zzd(applicationContext);
        zzd.zzd(2);
        zzet zze = zzd.zze();
        zzex zzexVar = new zzex(applicationContext);
        this.zzb = Places.zza(applicationContext, zze);
        this.zzc = zzflVar;
        this.zzd = new zzgk(zzexVar, zze, null);
        this.zze = new zzav();
    }

    @Override // androidx.fragment.app.n
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        return n.loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class ? new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze) : super.instantiate(classLoader, str);
    }
}
