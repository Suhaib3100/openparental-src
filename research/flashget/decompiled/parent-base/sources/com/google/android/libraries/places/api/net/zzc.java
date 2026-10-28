package com.google.android.libraries.places.api.net;

import androidx.annotation.g0;
import androidx.annotation.q0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.PhotoMetadata;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzc extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final CancellationToken zzd;

    /* synthetic */ zzc(Integer num, Integer num2, PhotoMetadata photoMetadata, CancellationToken cancellationToken, zzb zzbVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = cancellationToken;
    }

    public final boolean equals(Object obj) {
        CancellationToken cancellationToken;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoRequest) {
            FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(fetchPhotoRequest.getMaxWidth()) : fetchPhotoRequest.getMaxWidth() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(fetchPhotoRequest.getMaxHeight()) : fetchPhotoRequest.getMaxHeight() == null) {
                    if (this.zzc.equals(fetchPhotoRequest.getPhotoMetadata()) && ((cancellationToken = this.zzd) != null ? cancellationToken.equals(fetchPhotoRequest.getCancellationToken()) : fetchPhotoRequest.getCancellationToken() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest, com.google.android.libraries.places.internal.zzen
    @q0
    public final CancellationToken getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    @q0
    @g0(from = 1, to = 1600)
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    @q0
    @g0(from = 1, to = 1600)
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Integer num2 = this.zzb;
        int hashCode2 = (((hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        CancellationToken cancellationToken = this.zzd;
        return hashCode2 ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String obj = this.zzc.toString();
        String valueOf3 = String.valueOf(this.zzd);
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(a.a(obj, length + 76 + valueOf2.length(), valueOf3.length()));
        l0.a(sb, ProtectedSandApp.s("\ue679"), valueOf, ProtectedSandApp.s("\ue67a"), valueOf2);
        l0.a(sb, ProtectedSandApp.s("\ue67b"), obj, ProtectedSandApp.s("\ue67c"), valueOf3);
        sb.append(ProtectedSandApp.s("\ue67d"));
        return sb.toString();
    }
}
