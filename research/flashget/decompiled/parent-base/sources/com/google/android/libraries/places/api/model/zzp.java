package com.google.android.libraries.places.api.model;

import androidx.annotation.g0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzp extends PhotoMetadata {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;

    zzp(String str, int i4, int i5, String str2) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue613"));
        }
        this.zza = str;
        this.zzb = i4;
        this.zzc = i5;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue612"));
        }
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoMetadata) {
            PhotoMetadata photoMetadata = (PhotoMetadata) obj;
            if (this.zza.equals(photoMetadata.getAttributions()) && this.zzb == photoMetadata.getHeight() && this.zzc == photoMetadata.getWidth() && this.zzd.equals(photoMetadata.zza())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public String getAttributions() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    @g0(from = 0)
    public int getHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    @g0(from = 0)
    public int getWidth() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int i4 = this.zzb;
        int i5 = this.zzc;
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 84);
        sb.append(ProtectedSandApp.s("\ue614"));
        sb.append(str);
        sb.append(ProtectedSandApp.s("\ue615"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue616"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\ue617"));
        sb.append(str2);
        sb.append(ProtectedSandApp.s("\ue618"));
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final String zza() {
        return this.zzd;
    }
}
