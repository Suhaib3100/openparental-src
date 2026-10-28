package com.google.android.libraries.places.internal;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzhm extends zzhn {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhm(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        return k0.a(new StringBuilder(obj.length() + 2), ProtectedSandApp.s("\ue9d7"), obj, ProtectedSandApp.s("\ue9d8"));
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    final void zzc(StringBuilder sb) {
        sb.append('[');
        sb.append(this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    final void zzd(StringBuilder sb) {
        sb.append(this.zza);
        sb.append(')');
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    final boolean zze(Comparable comparable) {
        return zzie.zza(this.zza, comparable) <= 0;
    }
}
