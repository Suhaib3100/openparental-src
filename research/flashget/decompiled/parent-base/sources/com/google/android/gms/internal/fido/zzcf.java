package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzcf extends zzby implements Set {

    @a
    private transient zzcc zza;

    zzcf() {
    }

    private static zzcf zzf(int i4, Object... objArr) {
        if (i4 == 0) {
            return zzcu.zza;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzcz(obj);
        }
        int zzh = zzh(i4);
        Object[] objArr2 = new Object[zzh];
        int i5 = zzh - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj2 = objArr[i10];
            zzcr.zza(obj2, i10);
            int hashCode = obj2.hashCode();
            int zza = zzbx.zza(hashCode);
            while (true) {
                int i11 = zza & i5;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i11] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i7, i4, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzcz(obj4);
        }
        if (zzh(i7) < zzh / 2) {
            return zzf(i7, objArr);
        }
        if (i7 <= 0) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzcu(objArr, i6, objArr2, i5, i7);
    }

    static int zzh(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("퀨"));
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzcf zzk() {
        return zzcu.zza;
    }

    public static zzcf zzl(Object obj) {
        return new zzcz(ProtectedSandApp.s("퀩"));
    }

    public static zzcf zzm(Object obj, Object obj2) {
        return zzf(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcf) && zzg() && ((zzcf) obj).zzg() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzcy.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdc iterator();

    boolean zzg() {
        return false;
    }

    public zzcc zzi() {
        zzcc zzccVar = this.zza;
        if (zzccVar != null) {
            return zzccVar;
        }
        zzcc zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    zzcc zzj() {
        Object[] array = toArray();
        int i4 = zzcc.zzd;
        return zzcc.zzh(array, array.length);
    }
}
