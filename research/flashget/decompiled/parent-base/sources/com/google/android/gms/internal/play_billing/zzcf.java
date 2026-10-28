package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzcf extends zzbx implements Set {
    private transient zzca zza;

    zzcf() {
    }

    static int zzh(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("훻"));
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzcf zzk() {
        return zzcp.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzcf zzm(int i4, Object... objArr) {
        if (i4 == 0) {
            return zzcp.zza;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzcr(obj);
        }
        int zzh = zzh(i4);
        Object[] objArr2 = new Object[zzh];
        int i5 = zzh - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj2 = objArr[i10];
            zzci.zza(obj2, i10);
            int hashCode = obj2.hashCode();
            int zza = zzbu.zza(hashCode);
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
            return new zzcr(obj4);
        }
        if (zzh(i7) < zzh / 2) {
            return zzm(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new zzcp(objArr, i6, objArr2, i5, i7);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcf) && zzl() && ((zzcf) obj).zzl() && hashCode() != obj.hashCode()) {
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
        return zzcq.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public zzca zzd() {
        zzca zzcaVar = this.zza;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzca zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzcs iterator();

    zzca zzi() {
        Object[] array = toArray();
        int i4 = zzca.zzd;
        return zzca.zzi(array, array.length);
    }

    boolean zzl() {
        return false;
    }
}
