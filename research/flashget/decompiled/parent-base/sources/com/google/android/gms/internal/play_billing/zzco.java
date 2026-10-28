package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzco extends zzcd {
    static final zzcd zza = new zzco(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzco(Object obj, Object[] objArr, int i4) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzco zzg(int i4, Object[] objArr, zzcc zzccVar) {
        short[] sArr;
        char c5;
        char c6;
        Object[] objArr2;
        int i5 = i4;
        Object[] objArr3 = objArr;
        if (i5 == 0) {
            return (zzco) zza;
        }
        Object obj = null;
        int i6 = 1;
        if (i5 == 1) {
            Object obj2 = objArr3[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr3[1];
            Objects.requireNonNull(obj3);
            zzbt.zza(obj2, obj3);
            return new zzco(null, objArr3, 1);
        }
        zzbl.zzb(i5, objArr3.length >> 1, ProtectedSandApp.s("휀"));
        int zzh = zzcf.zzh(i4);
        if (i5 == 1) {
            Object obj4 = objArr3[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr3[1];
            Objects.requireNonNull(obj5);
            zzbt.zza(obj4, obj5);
            i5 = 1;
            c5 = 1;
            c6 = 2;
        } else {
            int i7 = zzh - 1;
            char c7 = 65535;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i10 = 0;
                int i11 = 0;
                while (i10 < i5) {
                    int i12 = i11 + i11;
                    int i13 = i10 + i10;
                    Object obj6 = objArr3[i13];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr3[i13 ^ i6];
                    Objects.requireNonNull(obj7);
                    zzbt.zza(obj6, obj7);
                    int zza2 = zzbu.zza(obj6.hashCode());
                    while (true) {
                        int i14 = zza2 & i7;
                        int i15 = bArr[i14] & 255;
                        if (i15 == 255) {
                            bArr[i14] = (byte) i12;
                            if (i11 < i10) {
                                objArr3[i12] = obj6;
                                objArr3[i12 ^ 1] = obj7;
                            }
                            i11++;
                        } else {
                            if (obj6.equals(objArr3[i15])) {
                                int i16 = i15 ^ 1;
                                Object obj8 = objArr3[i16];
                                Objects.requireNonNull(obj8);
                                zzcb zzcbVar = new zzcb(obj6, obj7, obj8);
                                objArr3[i16] = obj7;
                                obj = zzcbVar;
                                break;
                            }
                            zza2 = i14 + 1;
                        }
                    }
                    i10++;
                    i6 = 1;
                }
                if (i11 == i5) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i11), obj};
                    c6 = 2;
                    c5 = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i17 = 0;
                    for (int i18 = 0; i18 < i5; i18++) {
                        int i19 = i17 + i17;
                        int i20 = i18 + i18;
                        Object obj9 = objArr3[i20];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArr3[i20 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbt.zza(obj9, obj10);
                        int zza3 = zzbu.zza(obj9.hashCode());
                        while (true) {
                            int i21 = zza3 & i7;
                            char c10 = (char) sArr[i21];
                            if (c10 == 65535) {
                                sArr[i21] = (short) i19;
                                if (i17 < i18) {
                                    objArr3[i19] = obj9;
                                    objArr3[i19 ^ 1] = obj10;
                                }
                                i17++;
                            } else {
                                if (obj9.equals(objArr3[c10])) {
                                    int i22 = c10 ^ 1;
                                    Object obj11 = objArr3[i22];
                                    Objects.requireNonNull(obj11);
                                    zzcb zzcbVar2 = new zzcb(obj9, obj10, obj11);
                                    objArr3[i22] = obj10;
                                    obj = zzcbVar2;
                                    break;
                                }
                                zza3 = i21 + 1;
                            }
                        }
                    }
                    if (i17 != i5) {
                        Integer valueOf = Integer.valueOf(i17);
                        c5 = 1;
                        c6 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i23 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < i5) {
                        int i26 = i25 + i25;
                        int i27 = i24 + i24;
                        Object obj12 = objArr3[i27];
                        Objects.requireNonNull(obj12);
                        Object obj13 = objArr3[i27 ^ i23];
                        Objects.requireNonNull(obj13);
                        zzbt.zza(obj12, obj13);
                        int zza4 = zzbu.zza(obj12.hashCode());
                        while (true) {
                            int i28 = zza4 & i7;
                            ?? r15 = sArr[i28];
                            if (r15 == c7) {
                                sArr[i28] = i26;
                                if (i25 < i24) {
                                    objArr3[i26] = obj12;
                                    objArr3[i26 ^ 1] = obj13;
                                }
                                i25++;
                            } else {
                                if (obj12.equals(objArr3[r15])) {
                                    int i29 = r15 ^ 1;
                                    Object obj14 = objArr3[i29];
                                    Objects.requireNonNull(obj14);
                                    zzcb zzcbVar3 = new zzcb(obj12, obj13, obj14);
                                    objArr3[i29] = obj13;
                                    obj = zzcbVar3;
                                    break;
                                }
                                zza4 = i28 + 1;
                                c7 = 65535;
                            }
                        }
                        i24++;
                        i23 = 1;
                        c7 = 65535;
                    }
                    if (i25 != i5) {
                        c5 = 1;
                        c6 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i25), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c5 = 1;
            }
            c6 = 2;
            c5 = 1;
        }
        boolean z4 = obj instanceof Object[];
        Object obj15 = obj;
        if (z4) {
            Object[] objArr4 = (Object[]) obj;
            zzcb zzcbVar4 = (zzcb) objArr4[c6];
            if (zzccVar == null) {
                throw zzcbVar4.zza();
            }
            zzccVar.zzc = zzcbVar4;
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[c5]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i5 = intValue;
        }
        return new zzco(obj15, objArr3, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.zzcd, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzbu.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.zzbu.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.zzbu.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzco.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcd
    final zzbx zza() {
        return new zzcn(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcd
    final zzcf zzd() {
        return new zzcl(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcd
    final zzcf zze() {
        return new zzcm(this, new zzcn(this.zzb, 0, this.zzd));
    }
}
