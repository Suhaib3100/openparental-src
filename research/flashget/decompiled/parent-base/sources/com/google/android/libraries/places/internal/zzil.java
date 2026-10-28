package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzil extends zzhv {
    static final zzhv zza = new zzil(null, new Object[0], 0);
    final transient Object[] zzb;

    @zc.a
    private final transient Object zzc;
    private final transient int zzd;

    private zzil(@zc.a Object obj, Object[] objArr, int i4) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object[]] */
    static zzil zzf(int i4, Object[] objArr, zzhu zzhuVar) {
        int i5;
        short[] sArr;
        Object[] objArr2;
        int i6 = i4;
        Object[] objArr3 = objArr;
        if (i6 == 0) {
            return (zzil) zza;
        }
        Object obj = null;
        if (i6 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            zzhh.zza(obj2, obj3);
            return new zzil(null, objArr3, 1);
        }
        zzha.zzb(i6, objArr3.length >> 1, ProtectedSandApp.s("\ue9e6"));
        char c5 = 2;
        int max = Math.max(i6, 2);
        if (max < 751619276) {
            i5 = Integer.highestOneBit(max - 1);
            do {
                i5 += i5;
            } while (i5 * 0.7d < max);
        } else {
            i5 = 1073741824;
            zzha.zze(max < 1073741824, ProtectedSandApp.s("\ue9e7"));
        }
        if (i6 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            zzhh.zza(obj4, obj5);
        } else {
            int i7 = i5 - 1;
            char c6 = 65535;
            if (i5 <= 128) {
                byte[] bArr = new byte[i5];
                Arrays.fill(bArr, (byte) -1);
                int i10 = 0;
                for (int i11 = 0; i11 < i6; i11++) {
                    int i12 = i11 + i11;
                    int i13 = i10 + i10;
                    Object obj6 = objArr3[i12];
                    obj6.getClass();
                    Object obj7 = objArr3[i12 ^ 1];
                    obj7.getClass();
                    zzhh.zza(obj6, obj7);
                    int zza2 = zzho.zza(obj6.hashCode());
                    while (true) {
                        int i14 = zza2 & i7;
                        int i15 = bArr[i14] & 255;
                        if (i15 == 255) {
                            bArr[i14] = (byte) i13;
                            if (i10 < i11) {
                                objArr3[i13] = obj6;
                                objArr3[i13 ^ 1] = obj7;
                            }
                            i10++;
                        } else {
                            if (obj6.equals(objArr3[i15])) {
                                int i16 = i15 ^ 1;
                                Object obj8 = objArr3[i16];
                                obj8.getClass();
                                zzht zzhtVar = new zzht(obj6, obj7, obj8);
                                objArr3[i16] = obj7;
                                obj = zzhtVar;
                                break;
                            }
                            zza2 = i14 + 1;
                        }
                    }
                }
                if (i10 == i6) {
                    obj = bArr;
                    c5 = 2;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i10), obj};
                    c5 = 2;
                }
            } else if (i5 <= 32768) {
                sArr = new short[i5];
                Arrays.fill(sArr, (short) -1);
                int i17 = 0;
                for (int i18 = 0; i18 < i6; i18++) {
                    int i19 = i18 + i18;
                    int i20 = i17 + i17;
                    Object obj9 = objArr3[i19];
                    obj9.getClass();
                    Object obj10 = objArr3[i19 ^ 1];
                    obj10.getClass();
                    zzhh.zza(obj9, obj10);
                    int zza3 = zzho.zza(obj9.hashCode());
                    while (true) {
                        int i21 = zza3 & i7;
                        char c7 = (char) sArr[i21];
                        if (c7 == 65535) {
                            sArr[i21] = (short) i20;
                            if (i17 < i18) {
                                objArr3[i20] = obj9;
                                objArr3[i20 ^ 1] = obj10;
                            }
                            i17++;
                        } else {
                            if (obj9.equals(objArr3[c7])) {
                                int i22 = c7 ^ 1;
                                Object obj11 = objArr3[i22];
                                obj11.getClass();
                                zzht zzhtVar2 = new zzht(obj9, obj10, obj11);
                                objArr3[i22] = obj10;
                                obj = zzhtVar2;
                                break;
                            }
                            zza3 = i21 + 1;
                        }
                    }
                }
                if (i17 != i6) {
                    c5 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i17), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c5 = 2;
            } else {
                sArr = new int[i5];
                Arrays.fill((int[]) sArr, -1);
                int i23 = 0;
                int i24 = 0;
                while (i23 < i6) {
                    int i25 = i23 + i23;
                    int i26 = i24 + i24;
                    Object obj12 = objArr3[i25];
                    obj12.getClass();
                    Object obj13 = objArr3[i25 ^ 1];
                    obj13.getClass();
                    zzhh.zza(obj12, obj13);
                    int zza4 = zzho.zza(obj12.hashCode());
                    while (true) {
                        int i27 = zza4 & i7;
                        ?? r15 = sArr[i27];
                        if (r15 == c6) {
                            sArr[i27] = i26;
                            if (i24 < i23) {
                                objArr3[i26] = obj12;
                                objArr3[i26 ^ 1] = obj13;
                            }
                            i24++;
                        } else {
                            if (obj12.equals(objArr3[r15])) {
                                int i28 = r15 ^ 1;
                                Object obj14 = objArr3[i28];
                                obj14.getClass();
                                zzht zzhtVar3 = new zzht(obj12, obj13, obj14);
                                objArr3[i28] = obj13;
                                obj = zzhtVar3;
                                break;
                            }
                            zza4 = i27 + 1;
                            c6 = 65535;
                        }
                    }
                    i23++;
                    c6 = 65535;
                }
                if (i24 != i6) {
                    c5 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i24), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c5 = 2;
            }
        }
        boolean z4 = obj instanceof Object[];
        Object obj15 = obj;
        if (z4) {
            Object[] objArr4 = (Object[]) obj;
            zzhuVar.zzc = (zzht) objArr4[c5];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i6 = intValue;
        }
        return new zzil(obj15, objArr3, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.libraries.places.internal.zzhv, java.util.Map
    @zc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@zc.a java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.zzc
            java.lang.Object[] r1 = r9.zzb
            int r2 = r9.zzd
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.libraries.places.internal.zzho.zza(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = com.google.android.libraries.places.internal.zzho.zza(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.libraries.places.internal.zzho.zza(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzil.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzhv
    final zzhp zza() {
        return new zzik(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzhv
    final zzhw zzc() {
        return new zzii(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzhv
    final zzhw zzd() {
        return new zzij(this, new zzik(this.zzb, 0, this.zzd));
    }
}
