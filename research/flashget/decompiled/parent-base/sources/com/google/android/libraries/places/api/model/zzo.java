package com.google.android.libraries.places.api.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.PhotoMetadata;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzo extends PhotoMetadata.Builder {
    private String zza;
    private int zzb;
    private int zzc;
    private String zzd;
    private byte zze;

    zzo() {
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final String getAttributions() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue662"));
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getHeight() {
        if ((this.zze & 1) != 0) {
            return this.zzb;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue663"));
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getWidth() {
        if ((this.zze & 2) != 0) {
            return this.zzc;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue664"));
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAttributions(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue665"));
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setHeight(int i4) {
        this.zzb = i4;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setWidth(int i4) {
        this.zzc = i4;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    final PhotoMetadata.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue666"));
        }
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    final PhotoMetadata zzb() {
        String str;
        String str2;
        if (this.zze == 3 && (str = this.zza) != null && (str2 = this.zzd) != null) {
            return new zzap(str, this.zzb, this.zzc, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue667"));
        }
        if ((this.zze & 1) == 0) {
            sb.append(ProtectedSandApp.s("\ue668"));
        }
        if ((this.zze & 2) == 0) {
            sb.append(ProtectedSandApp.s("\ue669"));
        }
        if (this.zzd == null) {
            sb.append(ProtectedSandApp.s("\ue66a"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue66b").concat(sb.toString()));
    }
}
