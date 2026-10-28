package com.google.android.libraries.places.internal;

import androidx.annotation.q0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzfh extends zzfn {
    private final String zza;
    private final zzhs zzb;
    private final Place zzc;
    private final AutocompletePrediction zzd;
    private final Status zze;
    private final int zzf;

    /* synthetic */ zzfh(int i4, String str, zzhs zzhsVar, Place place, AutocompletePrediction autocompletePrediction, Status status, zzfg zzfgVar) {
        this.zzf = i4;
        this.zza = str;
        this.zzb = zzhsVar;
        this.zzc = place;
        this.zzd = autocompletePrediction;
        this.zze = status;
    }

    public final boolean equals(Object obj) {
        String str;
        zzhs zzhsVar;
        Place place;
        AutocompletePrediction autocompletePrediction;
        Status status;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfn) {
            zzfn zzfnVar = (zzfn) obj;
            if (this.zzf == zzfnVar.zzf() && ((str = this.zza) != null ? str.equals(zzfnVar.zze()) : zzfnVar.zze() == null) && ((zzhsVar = this.zzb) != null ? zzhsVar.equals(zzfnVar.zzd()) : zzfnVar.zzd() == null) && ((place = this.zzc) != null ? place.equals(zzfnVar.zzc()) : zzfnVar.zzc() == null) && ((autocompletePrediction = this.zzd) != null ? autocompletePrediction.equals(zzfnVar.zzb()) : zzfnVar.zzb() == null) && ((status = this.zze) != null ? status.equals(zzfnVar.zza()) : zzfnVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (this.zzf ^ 1000003) * 1000003;
        String str = this.zza;
        int hashCode = (i4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        zzhs zzhsVar = this.zzb;
        int hashCode2 = (hashCode ^ (zzhsVar == null ? 0 : zzhsVar.hashCode())) * 1000003;
        Place place = this.zzc;
        int hashCode3 = (hashCode2 ^ (place == null ? 0 : place.hashCode())) * 1000003;
        AutocompletePrediction autocompletePrediction = this.zzd;
        int hashCode4 = (hashCode3 ^ (autocompletePrediction == null ? 0 : autocompletePrediction.hashCode())) * 1000003;
        Status status = this.zze;
        return hashCode4 ^ (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        String s4;
        switch (this.zzf) {
            case 1:
                s4 = ProtectedSandApp.s("\ue98d");
                break;
            case 2:
                s4 = ProtectedSandApp.s("\ue98c");
                break;
            case 3:
                s4 = ProtectedSandApp.s("\ue98b");
                break;
            case 4:
                s4 = ProtectedSandApp.s("\ue98a");
                break;
            case 5:
                s4 = ProtectedSandApp.s("\ue989");
                break;
            case 6:
                s4 = ProtectedSandApp.s("\ue988");
                break;
            case 7:
                s4 = ProtectedSandApp.s("\ue987");
                break;
            case 8:
                s4 = ProtectedSandApp.s("\ue986");
                break;
            case 9:
                s4 = ProtectedSandApp.s("\ue985");
                break;
            default:
                s4 = ProtectedSandApp.s("\ue984");
                break;
        }
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String valueOf4 = String.valueOf(this.zze);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(s4.length() + 76 + length + length2 + length3 + length4 + valueOf4.length());
        l0.a(sb, ProtectedSandApp.s("\ue98e"), s4, ProtectedSandApp.s("\ue98f"), str);
        l0.a(sb, ProtectedSandApp.s("\ue990"), valueOf, ProtectedSandApp.s("\ue991"), valueOf2);
        l0.a(sb, ProtectedSandApp.s("\ue992"), valueOf3, ProtectedSandApp.s("\ue993"), valueOf4);
        sb.append(ProtectedSandApp.s("\ue994"));
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzfn
    @q0
    public final Status zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzfn
    @q0
    public final AutocompletePrediction zzb() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzfn
    @q0
    public final Place zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzfn
    @q0
    public final zzhs zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzfn
    @q0
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzfn
    public final int zzf() {
        return this.zzf;
    }
}
