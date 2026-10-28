package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.solver.widgets.analyzer.b;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzjb extends zziw implements Set {

    @CheckForNull
    private transient zzja zza;

    zzjb() {
    }

    static int zzf(int i5) {
        int max = Math.max(i5, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return b.f2366g;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("⍨"));
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static zzjb zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = ProtectedSandApp.s("⍩");
        objArr2[1] = ProtectedSandApp.s("⍪");
        objArr2[2] = ProtectedSandApp.s("⍫");
        objArr2[3] = ProtectedSandApp.s("⍬");
        objArr2[4] = ProtectedSandApp.s("⍭");
        objArr2[5] = ProtectedSandApp.s("⍮");
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return zzk(15, objArr2);
    }

    private static zzjb zzk(int i5, Object... objArr) {
        if (i5 == 0) {
            return zzjf.zza;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzjg(obj);
        }
        int zzf = zzf(i5);
        Object[] objArr2 = new Object[zzf];
        int i6 = zzf - 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            Object obj2 = objArr[i9];
            zzjd.zza(obj2, i9);
            int hashCode = obj2.hashCode();
            int zza = zzit.zza(hashCode);
            while (true) {
                int i10 = zza & i6;
                Object obj3 = objArr2[i10];
                if (obj3 == null) {
                    objArr[i8] = obj2;
                    objArr2[i10] = obj2;
                    i7 += hashCode;
                    i8++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i8, i5, (Object) null);
        if (i8 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzjg(obj4);
        }
        if (zzf(i8) < zzf / 2) {
            return zzk(i8, objArr);
        }
        if (i8 < 10) {
            objArr = Arrays.copyOf(objArr, i8);
        }
        return new zzjf(objArr, i7, objArr2, i6, i8);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzj() && ((zzjb) obj).zzj() && hashCode() != obj.hashCode()) {
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
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 += next != null ? next.hashCode() : 0;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzjh iterator();

    public final zzja zzg() {
        zzja zzjaVar = this.zza;
        if (zzjaVar != null) {
            return zzjaVar;
        }
        zzja zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    zzja zzh() {
        Object[] array = toArray();
        int i5 = zzja.zzd;
        return zzja.zzg(array, array.length);
    }

    boolean zzj() {
        return false;
    }
}
