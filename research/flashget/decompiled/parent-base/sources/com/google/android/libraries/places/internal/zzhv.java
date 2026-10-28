package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhv implements Map, Serializable {

    @zc.a
    private transient zzhw zza;

    @zc.a
    private transient zzhw zzb;

    @zc.a
    private transient zzhp zzc;

    zzhv() {
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@zc.a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@zc.a Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@zc.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @zc.a
    public abstract Object get(@zc.a Object obj);

    @Override // java.util.Map
    @zc.a
    public final Object getOrDefault(@zc.a Object obj, @zc.a Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzim.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzhw zzhwVar = this.zzb;
        if (zzhwVar != null) {
            return zzhwVar;
        }
        zzhw zzd = zzd();
        this.zzb = zzd;
        return zzd;
    }

    @Override // java.util.Map
    @zc.a
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @zc.a
    @Deprecated
    public final Object remove(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(44, ProtectedSandApp.s("\ue9df"), size));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z4 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z4) {
                sb.append(ProtectedSandApp.s("\ue9de"));
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    abstract zzhp zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzhp values() {
        zzhp zzhpVar = this.zzc;
        if (zzhpVar != null) {
            return zzhpVar;
        }
        zzhp zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzhw zzc();

    abstract zzhw zzd();

    @Override // java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhw entrySet() {
        zzhw zzhwVar = this.zza;
        if (zzhwVar != null) {
            return zzhwVar;
        }
        zzhw zzc = zzc();
        this.zza = zzc;
        return zzc;
    }
}
