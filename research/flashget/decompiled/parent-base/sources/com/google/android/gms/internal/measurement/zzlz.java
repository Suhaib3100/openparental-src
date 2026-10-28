package com.google.android.gms.internal.measurement;

import androidx.compose.material3.z3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlz implements Comparable<zzlz>, Map.Entry<Object, Object> {
    private final Object zza;
    private Object zzb;
    private final /* synthetic */ zzlv zzc;

    zzlz(zzlv zzlvVar, Map.Entry<Object, Object> entry) {
        this(zzlvVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzlz zzlzVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzlzVar.getKey());
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
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zzc.zzg();
        Object obj2 = this.zzb;
        this.zzb = obj;
        return obj2;
    }

    public final String toString() {
        return z3.a(String.valueOf(this.zza), ProtectedSandApp.s("핅"), String.valueOf(this.zzb));
    }

    zzlz(zzlv zzlvVar, Object obj, Object obj2) {
        this.zzc = zzlvVar;
        this.zza = obj;
        this.zzb = obj2;
    }
}
