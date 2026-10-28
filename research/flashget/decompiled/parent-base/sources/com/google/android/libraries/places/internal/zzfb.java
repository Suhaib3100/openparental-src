package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzfb extends zzfk {
    private AutocompleteActivityMode zza;
    private zzhs zzb;
    private zzfj zzc;
    private String zzd;
    private String zze;
    private LocationBias zzf;
    private LocationRestriction zzg;
    private zzhs zzh;
    private TypeFilter zzi;
    private int zzj;
    private int zzk;
    private byte zzl;

    zzfb() {
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zza(List list) {
        this.zzh = zzhs.zzk(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzb(@q0 String str) {
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzc(@q0 String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzd(@q0 LocationBias locationBias) {
        this.zzf = locationBias;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zze(@q0 LocationRestriction locationRestriction) {
        this.zzg = locationRestriction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzf(AutocompleteActivityMode autocompleteActivityMode) {
        if (autocompleteActivityMode == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue96a"));
        }
        this.zza = autocompleteActivityMode;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzg(zzfj zzfjVar) {
        if (zzfjVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue96b"));
        }
        this.zzc = zzfjVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzh(List list) {
        this.zzb = zzhs.zzk(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzi(int i4) {
        this.zzj = i4;
        this.zzl = (byte) (this.zzl | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzj(int i4) {
        this.zzk = i4;
        this.zzl = (byte) (this.zzl | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfk zzk(@q0 TypeFilter typeFilter) {
        this.zzi = typeFilter;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfk
    public final zzfl zzl() {
        AutocompleteActivityMode autocompleteActivityMode;
        zzhs zzhsVar;
        zzfj zzfjVar;
        zzhs zzhsVar2;
        if (this.zzl == 3 && (autocompleteActivityMode = this.zza) != null && (zzhsVar = this.zzb) != null && (zzfjVar = this.zzc) != null && (zzhsVar2 = this.zzh) != null) {
            return new zzfe(autocompleteActivityMode, zzhsVar, zzfjVar, this.zzd, this.zze, this.zzf, this.zzg, zzhsVar2, this.zzi, this.zzj, this.zzk);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue96c"));
        }
        if (this.zzb == null) {
            sb.append(ProtectedSandApp.s("\ue96d"));
        }
        if (this.zzc == null) {
            sb.append(ProtectedSandApp.s("\ue96e"));
        }
        if (this.zzh == null) {
            sb.append(ProtectedSandApp.s("\ue96f"));
        }
        if ((this.zzl & 1) == 0) {
            sb.append(ProtectedSandApp.s("\ue970"));
        }
        if ((this.zzl & 2) == 0) {
            sb.append(ProtectedSandApp.s("\ue971"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue972").concat(sb.toString()));
    }

    /* synthetic */ zzfb(zzfl zzflVar, zzfa zzfaVar) {
        this.zza = zzflVar.zzh();
        this.zzb = zzflVar.zzj();
        this.zzc = zzflVar.zzf();
        this.zzd = zzflVar.zzl();
        this.zze = zzflVar.zzk();
        this.zzf = zzflVar.zzc();
        this.zzg = zzflVar.zzd();
        this.zzh = zzflVar.zzi();
        this.zzi = zzflVar.zze();
        this.zzj = zzflVar.zza();
        this.zzk = zzflVar.zzb();
        this.zzl = (byte) 3;
    }
}
