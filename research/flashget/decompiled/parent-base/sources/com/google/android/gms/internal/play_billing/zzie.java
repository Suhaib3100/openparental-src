package com.google.android.gms.internal.play_billing;

import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzie implements Map.Entry, Comparable {
    final /* synthetic */ zzii zza;
    private final zzgg zzb;
    private Object zzc;

    zzie(zzii zziiVar, zzgg zzggVar, Object obj) {
        Objects.requireNonNull(zziiVar);
        this.zza = zziiVar;
        this.zzb = zzggVar;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzie) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        zzgg zzggVar = this.zzb;
        int hashCode = zzggVar == null ? 0 : zzggVar.hashCode();
        Object obj = this.zzc;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zza.zzo();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        return z3.a(String.valueOf(this.zzb), ProtectedSandApp.s("\ud81f"), String.valueOf(this.zzc));
    }

    public final zzgg zza() {
        return this.zzb;
    }
}
