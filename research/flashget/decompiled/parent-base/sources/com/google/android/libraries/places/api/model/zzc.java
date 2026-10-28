package com.google.android.libraries.places.api.model;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzc extends AddressComponents {
    private final List zza;

    zzc(List list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue5f1"));
        }
        this.zza = list;
    }

    @Override // com.google.android.libraries.places.api.model.AddressComponents
    public final List<AddressComponent> asList() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponents) {
            return this.zza.equals(((AddressComponents) obj).asList());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return k0.a(new StringBuilder(obj.length() + 26), ProtectedSandApp.s("\ue5f2"), obj, ProtectedSandApp.s("\ue5f3"));
    }
}
