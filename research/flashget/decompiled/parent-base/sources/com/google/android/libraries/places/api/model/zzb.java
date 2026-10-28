package com.google.android.libraries.places.api.model;

import androidx.annotation.q0;
import androidx.fragment.app.k0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.a;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzb extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List zzc;

    zzb(String str, @q0 String str2, List list) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue640"));
        }
        this.zza = str;
        this.zzb = str2;
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue63f"));
        }
        this.zzc = list;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            if (this.zza.equals(addressComponent.getName()) && ((str = this.zzb) != null ? str.equals(addressComponent.getShortName()) : addressComponent.getShortName() == null) && this.zzc.equals(addressComponent.getTypes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final String getName() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    @q0
    public final String getShortName() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponent
    public final List<String> getTypes() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(obj.length() + a.a(str, 43, String.valueOf(str2).length()));
        l0.a(sb, ProtectedSandApp.s("\ue641"), str, ProtectedSandApp.s("\ue642"), str2);
        return k0.a(sb, ProtectedSandApp.s("\ue643"), obj, ProtectedSandApp.s("\ue644"));
    }
}
