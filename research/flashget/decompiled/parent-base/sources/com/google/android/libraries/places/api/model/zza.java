package com.google.android.libraries.places.api.model;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.AddressComponent;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zza extends AddressComponent.Builder {
    private String zza;
    private String zzb;
    private List zzc;

    zza() {
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    @q0
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    public final AddressComponent.Builder setShortName(@q0 String str) {
        this.zzb = str;
        return this;
    }

    final AddressComponent.Builder zza(String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue5ec"));
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    final AddressComponent.Builder zzb(List list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue5ed"));
        }
        this.zzc = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent.Builder
    final AddressComponent zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzc) != null) {
            return new zzz(str, this.zzb, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue5ee"));
        }
        if (this.zzc == null) {
            sb.append(ProtectedSandApp.s("\ue5ef"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue5f0").concat(sb.toString()));
    }
}
