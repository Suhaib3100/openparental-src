package com.google.android.libraries.places.internal;

import android.os.Parcelable;
import androidx.annotation.q0;
import b9.c;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class zzfl implements Parcelable {
    public static zzfk zzm(AutocompleteActivityMode autocompleteActivityMode, List list, zzfj zzfjVar) {
        zzfb zzfbVar = new zzfb();
        zzfbVar.zza(new ArrayList());
        zzfbVar.zzf(autocompleteActivityMode);
        zzfbVar.zzh(list);
        zzfbVar.zzg(zzfjVar);
        zzfbVar.zzi(0);
        zzfbVar.zzj(0);
        return zzfbVar;
    }

    public abstract int zza();

    public abstract int zzb();

    @q0
    public abstract LocationBias zzc();

    @q0
    public abstract LocationRestriction zzd();

    @q0
    public abstract TypeFilter zze();

    public abstract zzfj zzf();

    public abstract zzfk zzg();

    public abstract AutocompleteActivityMode zzh();

    public abstract zzhs zzi();

    public abstract zzhs zzj();

    @q0
    public abstract String zzk();

    @q0
    public abstract String zzl();
}
