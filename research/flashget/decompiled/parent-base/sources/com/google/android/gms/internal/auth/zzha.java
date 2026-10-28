package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzha {
    private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzha(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.zzb = i4;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z4;
    }

    public static zzha zza() {
        return zza;
    }

    static zzha zzc(zzha zzhaVar, zzha zzhaVar2) {
        int i4 = zzhaVar.zzb + zzhaVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhaVar.zzc, i4);
        System.arraycopy(zzhaVar2.zzc, 0, copyOf, zzhaVar.zzb, zzhaVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhaVar.zzd, i4);
        System.arraycopy(zzhaVar2.zzd, 0, copyOf2, zzhaVar.zzb, zzhaVar2.zzb);
        return new zzha(i4, copyOf, copyOf2, true);
    }

    static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i4) {
        int[] iArr = this.zzc;
        if (i4 > iArr.length) {
            int i5 = this.zzb;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i4);
            this.zzd = Arrays.copyOf(this.zzd, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i4 = this.zzb;
        if (i4 == zzhaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhaVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhaVar.zzd;
                    int i6 = this.zzb;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.zzb;
        int i5 = i4 + 527;
        int[] iArr = this.zzc;
        int i6 = 17;
        int i7 = 17;
        for (int i10 = 0; i10 < i4; i10++) {
            i7 = (i7 * 31) + iArr[i10];
        }
        int i11 = (i5 * 31) + i7;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            i6 = (i6 * 31) + objArr[i13].hashCode();
        }
        return (i11 * 31) + i6;
    }

    final zzha zzb(zzha zzhaVar) {
        if (zzhaVar.equals(zza)) {
            return this;
        }
        zze();
        int i4 = this.zzb + zzhaVar.zzb;
        zzi(i4);
        System.arraycopy(zzhaVar.zzc, 0, this.zzc, this.zzb, zzhaVar.zzb);
        System.arraycopy(zzhaVar.zzd, 0, this.zzd, this.zzb, zzhaVar.zzb);
        this.zzb = i4;
        return this;
    }

    final void zze() {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    final void zzg(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzfz.zzb(sb, i4, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    final void zzh(int i4, Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i4;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
