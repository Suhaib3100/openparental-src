package com.google.android.libraries.places.api.model;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzd extends AutocompletePrediction.Builder {
    private String zza;
    private Integer zzb;
    private List zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private List zzg;
    private List zzh;
    private List zzi;

    zzd() {
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    @q0
    public final Integer getDistanceMeters() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getFullText() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue646"));
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final List<Place.Type> getPlaceTypes() {
        List<Place.Type> list = this.zzc;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue647"));
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getPrimaryText() {
        String str = this.zze;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue648"));
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final String getSecondaryText() {
        String str = this.zzf;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue649"));
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setDistanceMeters(@q0 Integer num) {
        this.zzb = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setFullText(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue64a"));
        }
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPlaceTypes(List<Place.Type> list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue64b"));
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setPrimaryText(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue64c"));
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder setSecondaryText(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue64d"));
        }
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zza(@q0 List list) {
        this.zzg = list;
        return this;
    }

    final AutocompletePrediction.Builder zzb(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue64e"));
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzc(@q0 List list) {
        this.zzh = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    public final AutocompletePrediction.Builder zzd(@q0 List list) {
        this.zzi = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AutocompletePrediction.Builder
    final AutocompletePrediction zze() {
        List list;
        String str;
        String str2;
        String str3;
        String str4 = this.zza;
        if (str4 != null && (list = this.zzc) != null && (str = this.zzd) != null && (str2 = this.zze) != null && (str3 = this.zzf) != null) {
            return new zzad(str4, this.zzb, list, str, str2, str3, this.zzg, this.zzh, this.zzi);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue64f"));
        }
        if (this.zzc == null) {
            sb.append(ProtectedSandApp.s("\ue650"));
        }
        if (this.zzd == null) {
            sb.append(ProtectedSandApp.s("\ue651"));
        }
        if (this.zze == null) {
            sb.append(ProtectedSandApp.s("\ue652"));
        }
        if (this.zzf == null) {
            sb.append(ProtectedSandApp.s("\ue653"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue654").concat(sb.toString()));
    }
}
