package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzfc extends zzfl {
    private final AutocompleteActivityMode zza;
    private final zzhs zzb;
    private final zzfj zzc;
    private final String zzd;
    private final String zze;
    private final LocationBias zzf;
    private final LocationRestriction zzg;
    private final zzhs zzh;
    private final TypeFilter zzi;
    private final int zzj;
    private final int zzk;

    zzfc(AutocompleteActivityMode autocompleteActivityMode, zzhs zzhsVar, zzfj zzfjVar, @q0 String str, @q0 String str2, @q0 LocationBias locationBias, @q0 LocationRestriction locationRestriction, zzhs zzhsVar2, @q0 TypeFilter typeFilter, int i4, int i5) {
        if (autocompleteActivityMode == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue976"));
        }
        this.zza = autocompleteActivityMode;
        if (zzhsVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue975"));
        }
        this.zzb = zzhsVar;
        if (zzfjVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue974"));
        }
        this.zzc = zzfjVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = locationBias;
        this.zzg = locationRestriction;
        if (zzhsVar2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue973"));
        }
        this.zzh = zzhsVar2;
        this.zzi = typeFilter;
        this.zzj = i4;
        this.zzk = i5;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        LocationBias locationBias;
        LocationRestriction locationRestriction;
        TypeFilter typeFilter;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfl) {
            zzfl zzflVar = (zzfl) obj;
            if (this.zza.equals(zzflVar.zzh()) && this.zzb.equals(zzflVar.zzj()) && this.zzc.equals(zzflVar.zzf()) && ((str = this.zzd) != null ? str.equals(zzflVar.zzl()) : zzflVar.zzl() == null) && ((str2 = this.zze) != null ? str2.equals(zzflVar.zzk()) : zzflVar.zzk() == null) && ((locationBias = this.zzf) != null ? locationBias.equals(zzflVar.zzc()) : zzflVar.zzc() == null) && ((locationRestriction = this.zzg) != null ? locationRestriction.equals(zzflVar.zzd()) : zzflVar.zzd() == null) && this.zzh.equals(zzflVar.zzi()) && ((typeFilter = this.zzi) != null ? typeFilter.equals(zzflVar.zze()) : zzflVar.zze() == null) && this.zzj == zzflVar.zza() && this.zzk == zzflVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        String str = this.zzd;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        LocationBias locationBias = this.zzf;
        int hashCode4 = (hashCode3 ^ (locationBias == null ? 0 : locationBias.hashCode())) * 1000003;
        LocationRestriction locationRestriction = this.zzg;
        int hashCode5 = (((hashCode4 ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        TypeFilter typeFilter = this.zzi;
        return ((((hashCode5 ^ (typeFilter != null ? typeFilter.hashCode() : 0)) * 1000003) ^ this.zzj) * 1000003) ^ this.zzk;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        String obj3 = this.zzc.toString();
        String str = this.zzd;
        String str2 = this.zze;
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String obj4 = this.zzh.toString();
        String valueOf3 = String.valueOf(this.zzi);
        int i4 = this.zzj;
        int i5 = this.zzk;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.stats.a.a(obj4, obj3.length() + obj2.length() + obj.length() + 189 + length + length2 + length3 + length4, valueOf3.length()));
        l0.a(sb, ProtectedSandApp.s("\ue977"), obj, ProtectedSandApp.s("\ue978"), obj2);
        l0.a(sb, ProtectedSandApp.s("\ue979"), obj3, ProtectedSandApp.s("\ue97a"), str);
        l0.a(sb, ProtectedSandApp.s("\ue97b"), str2, ProtectedSandApp.s("\ue97c"), valueOf);
        l0.a(sb, ProtectedSandApp.s("\ue97d"), valueOf2, ProtectedSandApp.s("\ue97e"), obj4);
        sb.append(ProtectedSandApp.s("\ue97f"));
        sb.append(valueOf3);
        sb.append(ProtectedSandApp.s("\ue980"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue981"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\ue982"));
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final int zza() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final int zzb() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    @q0
    public final LocationBias zzc() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    @q0
    public final LocationRestriction zzd() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    @q0
    public final TypeFilter zze() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final zzfj zzf() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final zzfk zzg() {
        return new zzfb(this, null);
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final AutocompleteActivityMode zzh() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final zzhs zzi() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    public final zzhs zzj() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    @q0
    public final String zzk() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzfl
    @q0
    public final String zzl() {
        return this.zzd;
    }
}
