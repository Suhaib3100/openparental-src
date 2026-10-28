package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzir {
    private static final zzir zza = new zzir(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzir(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i4;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzir zzc() {
        return zza;
    }

    static zzir zze(zzir zzirVar, zzir zzirVar2) {
        int i4 = zzirVar.zzb + zzirVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzirVar.zzc, i4);
        System.arraycopy(zzirVar2.zzc, 0, copyOf, zzirVar.zzb, zzirVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzirVar.zzd, i4);
        System.arraycopy(zzirVar2.zzd, 0, copyOf2, zzirVar.zzb, zzirVar2.zzb);
        return new zzir(i4, copyOf, copyOf2, true);
    }

    static zzir zzf() {
        return new zzir(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i4) {
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
        if (obj == null || !(obj instanceof zzir)) {
            return false;
        }
        zzir zzirVar = (zzir) obj;
        int i4 = this.zzb;
        if (i4 == zzirVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzirVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzirVar.zzd;
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
        int i11 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.zzd;
        int i12 = this.zzb;
        for (int i13 = 0; i13 < i12; i13++) {
            i6 = (i6 * 31) + objArr[i13].hashCode();
        }
        return i11 + i6;
    }

    public final int zza() {
        int zzy;
        int zzz;
        int zzy2;
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i10 = i7 >>> 3;
            int i11 = i7 & 7;
            if (i11 != 0) {
                if (i11 == 1) {
                    ((Long) this.zzd[i6]).getClass();
                    zzy2 = zzfx.zzy(i10 << 3) + 8;
                } else if (i11 == 2) {
                    int i12 = i10 << 3;
                    zzfp zzfpVar = (zzfp) this.zzd[i6];
                    int zzy3 = zzfx.zzy(i12);
                    int zzd = zzfpVar.zzd();
                    i5 = c.a(zzd, zzd, zzy3, i5);
                } else if (i11 == 3) {
                    int zzy4 = zzfx.zzy(i10 << 3);
                    zzy = zzy4 + zzy4;
                    zzz = ((zzir) this.zzd[i6]).zza();
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException(new zzha(ProtectedSandApp.s("\ud82e")));
                    }
                    ((Integer) this.zzd[i6]).getClass();
                    zzy2 = zzfx.zzy(i10 << 3) + 4;
                }
                i5 = zzy2 + i5;
            } else {
                int i13 = i10 << 3;
                long longValue = ((Long) this.zzd[i6]).longValue();
                zzy = zzfx.zzy(i13);
                zzz = zzfx.zzz(longValue);
            }
            i5 = zzz + zzy + i5;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6] >>> 3;
            zzfp zzfpVar = (zzfp) this.zzd[i6];
            int zzy = zzfx.zzy(8);
            int zzy2 = zzfx.zzy(i7) + zzfx.zzy(16);
            int zzy3 = zzfx.zzy(24);
            int zzd = zzfpVar.zzd();
            i5 += zzy + zzy + zzy2 + b.a(zzd, zzd, zzy3);
        }
        this.zze = i5;
        return i5;
    }

    final zzir zzd(zzir zzirVar) {
        if (zzirVar.equals(zza)) {
            return this;
        }
        zzg();
        int i4 = this.zzb + zzirVar.zzb;
        zzm(i4);
        System.arraycopy(zzirVar.zzc, 0, this.zzc, this.zzb, zzirVar.zzb);
        System.arraycopy(zzirVar.zzd, 0, this.zzd, this.zzb, zzirVar.zzb);
        this.zzb = i4;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzht.zzb(sb, i4, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    final void zzj(int i4, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i4;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    final void zzk(zzji zzjiVar) throws IOException {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzjiVar.zzx(this.zzc[i4] >>> 3, this.zzd[i4]);
        }
    }

    public final void zzl(zzji zzjiVar) throws IOException {
        if (this.zzb != 0) {
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                Object obj = this.zzd[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 == 0) {
                    zzjiVar.zzt(i6, ((Long) obj).longValue());
                } else if (i7 == 1) {
                    zzjiVar.zzm(i6, ((Long) obj).longValue());
                } else if (i7 == 2) {
                    zzjiVar.zzd(i6, (zzfp) obj);
                } else if (i7 == 3) {
                    zzjiVar.zzG(i6);
                    ((zzir) obj).zzl(zzjiVar);
                    zzjiVar.zzh(i6);
                } else {
                    if (i7 != 5) {
                        throw new RuntimeException(new zzha(ProtectedSandApp.s("\ud82e")));
                    }
                    zzjiVar.zzk(i6, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzir() {
        this(0, new int[8], new Object[8], true);
    }
}
