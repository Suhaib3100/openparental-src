package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import b9.c;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c.a
/* loaded from: classes5.dex */
public abstract class zzfk {
    public abstract zzfk zza(List list);

    public abstract zzfk zzb(@q0 String str);

    public abstract zzfk zzc(@q0 String str);

    public abstract zzfk zzd(@q0 LocationBias locationBias);

    public abstract zzfk zze(@q0 LocationRestriction locationRestriction);

    public abstract zzfk zzf(AutocompleteActivityMode autocompleteActivityMode);

    public abstract zzfk zzg(zzfj zzfjVar);

    public abstract zzfk zzh(List list);

    public abstract zzfk zzi(int i4);

    public abstract zzfk zzj(int i4);

    public abstract zzfk zzk(@q0 TypeFilter typeFilter);

    public abstract zzfl zzl();

    public final zzfk zzm(@q0 String str) {
        return zza(str == null ? zzhs.zzm() : zzhs.zzn(str));
    }
}
