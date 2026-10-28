package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzhj extends zzhn {
    private static final zzhj zzb = new zzhj();

    private zzhj() {
        super("");
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return ProtectedSandApp.s("\ue9d1");
    }

    @Override // com.google.android.libraries.places.internal.zzhn, java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzhn zzhnVar) {
        return zzhnVar == this ? 0 : 1;
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    final void zzc(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    final void zzd(StringBuilder sb) {
        sb.append(ProtectedSandApp.s("\ue9d2"));
    }

    @Override // com.google.android.libraries.places.internal.zzhn
    final boolean zze(Comparable comparable) {
        return false;
    }
}
