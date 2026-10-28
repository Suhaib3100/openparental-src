package com.google.android.gms.internal.maps;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import zc.a;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public abstract class zzba extends zzaw implements Set {

    @a
    private transient zzaz zza;

    zzba() {
    }

    static int zzf(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("톲"));
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static zzba zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = {ProtectedSandApp.s("통"), ProtectedSandApp.s("톶"), ProtectedSandApp.s("톷"), ProtectedSandApp.s("톸"), ProtectedSandApp.s("톳"), ProtectedSandApp.s("톴")};
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        return zzk(6, objArr2);
    }

    private static zzba zzk(int i4, Object... objArr) {
        if (i4 == 0) {
            return zzbd.zza;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzbe(obj);
        }
        int zzf = zzf(i4);
        Object[] objArr2 = new Object[zzf];
        int i5 = zzf - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                throw new NullPointerException(android.support.v4.media.a.a(ProtectedSandApp.s("톹"), i10));
            }
            int hashCode = obj2.hashCode();
            int zza = zzav.zza(hashCode);
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
            obj4.getClass();
            return new zzbe(obj4);
        }
        if (zzf(i7) < zzf / 2) {
            return zzk(i7, objArr);
        }
        if (i7 < 4) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzbd(objArr, i6, objArr2, i5, i7);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzba) && zzj() && ((zzba) obj).zzj() && hashCode() != obj.hashCode()) {
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
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 += next != null ? next.hashCode() : 0;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbf iterator();

    public final zzaz zzg() {
        zzaz zzazVar = this.zza;
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    zzaz zzh() {
        Object[] array = toArray();
        int i4 = zzaz.zzd;
        return zzaz.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }
}
