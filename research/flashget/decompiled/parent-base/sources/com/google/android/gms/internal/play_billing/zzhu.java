package com.google.android.gms.internal.play_billing;

import androidx.core.app.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzhu<T> implements zzib<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzix.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhr zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zziq zzl;
    private final zzgd zzm;

    private zzhu(int[] iArr, Object[] objArr, int i4, int i5, zzhr zzhrVar, boolean z4, int[] iArr2, int i6, int i7, zzhw zzhwVar, zzhe zzheVar, zziq zziqVar, zzgd zzgdVar, zzhn zzhnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        boolean z5 = false;
        if (zzgdVar != null && (zzhrVar instanceof zzgm)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i7;
        this.zzl = zziqVar;
        this.zzm = zzgdVar;
        this.zzg = zzhrVar;
    }

    private final void zzA(Object obj, Object obj2, int i4) {
        if (zzH(obj2, i4)) {
            int zzq = zzq(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzq;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException(i0.a(ProtectedSandApp.s("\ud80e"), this.zzc[i4], ProtectedSandApp.s("\ud80f"), obj2.toString()));
            }
            zzib zzt = zzt(i4);
            if (!zzH(obj, i4)) {
                if (zzK(object)) {
                    Object zze = zzt.zze();
                    zzt.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzC(obj, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzK(object2)) {
                Object zze2 = zzt.zze();
                zzt.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzt.zzg(object2, object);
        }
    }

    private final void zzB(Object obj, Object obj2, int i4) {
        int[] iArr = this.zzc;
        int i5 = iArr[i4];
        if (zzM(obj2, i5, i4)) {
            int zzq = zzq(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzq;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException(i0.a(ProtectedSandApp.s("\ud80e"), iArr[i4], ProtectedSandApp.s("\ud80f"), obj2.toString()));
            }
            zzib zzt = zzt(i4);
            if (!zzM(obj, i5, i4)) {
                if (zzK(object)) {
                    Object zze = zzt.zze();
                    zzt.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzD(obj, i5, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzK(object2)) {
                Object zze2 = zzt.zze();
                zzt.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzt.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, int i4) {
        int zzn = zzn(i4);
        long j4 = 1048575 & zzn;
        if (j4 == 1048575) {
            return;
        }
        zzix.zzn(obj, j4, (1 << (zzn >>> 20)) | zzix.zzc(obj, j4));
    }

    private final void zzD(Object obj, int i4, int i5) {
        zzix.zzn(obj, zzn(i5) & 1048575, i4);
    }

    private final void zzE(Object obj, int i4, Object obj2) {
        zzb.putObject(obj, zzq(i4) & 1048575, obj2);
        zzC(obj, i4);
    }

    private final void zzF(Object obj, int i4, int i5, Object obj2) {
        zzb.putObject(obj, zzq(i5) & 1048575, obj2);
        zzD(obj, i4, i5);
    }

    private final boolean zzG(Object obj, Object obj2, int i4) {
        return zzH(obj, i4) == zzH(obj2, i4);
    }

    private final boolean zzH(Object obj, int i4) {
        int zzn = zzn(i4);
        long j4 = zzn & 1048575;
        if (j4 != 1048575) {
            return (zzix.zzc(obj, j4) & (1 << (zzn >>> 20))) != 0;
        }
        int zzq = zzq(i4);
        long j5 = zzq & 1048575;
        switch (zzp(zzq)) {
            case 0:
                return Double.doubleToRawLongBits(zzix.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzix.zzb(obj, j5)) != 0;
            case 2:
                return zzix.zzd(obj, j5) != 0;
            case 3:
                return zzix.zzd(obj, j5) != 0;
            case 4:
                return zzix.zzc(obj, j5) != 0;
            case 5:
                return zzix.zzd(obj, j5) != 0;
            case 6:
                return zzix.zzc(obj, j5) != 0;
            case 7:
                return zzix.zzt(obj, j5);
            case 8:
                Object zzf = zzix.zzf(obj, j5);
                return zzf instanceof String ? !((String) zzf).isEmpty() : zzf instanceof zzfp ? !zzfp.zza.equals(zzf) : zzN();
            case 9:
                return zzix.zzf(obj, j5) != null;
            case 10:
                return !zzfp.zza.equals(zzix.zzf(obj, j5));
            case 11:
                return zzix.zzc(obj, j5) != 0;
            case 12:
                return zzix.zzc(obj, j5) != 0;
            case 13:
                return zzix.zzc(obj, j5) != 0;
            case 14:
                return zzix.zzd(obj, j5) != 0;
            case 15:
                return zzix.zzc(obj, j5) != 0;
            case 16:
                return zzix.zzd(obj, j5) != 0;
            case 17:
                return zzix.zzf(obj, j5) != null;
            default:
                return zzN();
        }
    }

    private final boolean zzI(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzH(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzJ(Object obj, int i4, zzib zzibVar) {
        return zzibVar.zzk(zzix.zzf(obj, i4 & 1048575));
    }

    private static boolean zzK(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgp) {
            return ((zzgp) obj).zzF();
        }
        return true;
    }

    private final boolean zzL(Object obj, Object obj2, int i4) {
        long zzn = zzn(i4) & 1048575;
        return zzix.zzc(obj, zzn) == zzix.zzc(obj2, zzn);
    }

    private final boolean zzM(Object obj, int i4, int i5) {
        return zzix.zzc(obj, (long) (zzn(i5) & 1048575)) == i4;
    }

    private boolean zzN() {
        throw new IllegalArgumentException();
    }

    private static final int zzO(byte[] bArr, int i4, int i5, zzjg zzjgVar, Class cls, zzfd zzfdVar) throws IOException {
        int i6;
        zzjg zzjgVar2 = zzjg.zza;
        switch (zzjgVar.ordinal()) {
            case 0:
                i6 = i4 + 8;
                zzfdVar.zzc = Double.valueOf(Double.longBitsToDouble(zzfe.zzp(bArr, i4)));
                break;
            case 1:
                i6 = i4 + 4;
                zzfdVar.zzc = Float.valueOf(Float.intBitsToFloat(zzfe.zzb(bArr, i4)));
                break;
            case 2:
            case 3:
                int zzl = zzfe.zzl(bArr, i4, zzfdVar);
                zzfdVar.zzc = Long.valueOf(zzfdVar.zzb);
                return zzl;
            case 4:
            case 12:
            case 13:
                int zzi = zzfe.zzi(bArr, i4, zzfdVar);
                zzfdVar.zzc = Integer.valueOf(zzfdVar.zza);
                return zzi;
            case 5:
            case 15:
                i6 = i4 + 8;
                zzfdVar.zzc = Long.valueOf(zzfe.zzp(bArr, i4));
                break;
            case 6:
            case 14:
                i6 = i4 + 4;
                zzfdVar.zzc = Integer.valueOf(zzfe.zzb(bArr, i4));
                break;
            case 7:
                int zzl2 = zzfe.zzl(bArr, i4, zzfdVar);
                zzfdVar.zzc = Boolean.valueOf(zzfdVar.zzb != 0);
                return zzl2;
            case 8:
                return zzfe.zzg(bArr, i4, zzfdVar);
            case 9:
            default:
                throw new RuntimeException(ProtectedSandApp.s("\ud810"));
            case 10:
                return zzfe.zzd(zzhy.zza().zzb(cls), bArr, i4, i5, zzfdVar);
            case 11:
                return zzfe.zza(bArr, i4, zzfdVar);
            case 16:
                int zzi2 = zzfe.zzi(bArr, i4, zzfdVar);
                zzfdVar.zzc = Integer.valueOf(zzft.zzb(zzfdVar.zza));
                return zzi2;
            case 17:
                int zzl3 = zzfe.zzl(bArr, i4, zzfdVar);
                zzfdVar.zzc = Long.valueOf(zzft.zzc(zzfdVar.zzb));
                return zzl3;
        }
        return i6;
    }

    private static final void zzP(int i4, Object obj, zzji zzjiVar) throws IOException {
        if (obj instanceof String) {
            zzjiVar.zzH(i4, (String) obj);
        } else {
            zzjiVar.zzd(i4, (zzfp) obj);
        }
    }

    static zzir zzd(Object obj) {
        zzgp zzgpVar = (zzgp) obj;
        zzir zzirVar = zzgpVar.zzc;
        if (zzirVar != zzir.zzc()) {
            return zzirVar;
        }
        zzir zzf = zzir.zzf();
        zzgpVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.play_billing.zzhu zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzhp r34, com.google.android.gms.internal.play_billing.zzhw r35, com.google.android.gms.internal.play_billing.zzhe r36, com.google.android.gms.internal.play_billing.zziq r37, com.google.android.gms.internal.play_billing.zzgd r38, com.google.android.gms.internal.play_billing.zzhn r39) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhu.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzhp, com.google.android.gms.internal.play_billing.zzhw, com.google.android.gms.internal.play_billing.zzhe, com.google.android.gms.internal.play_billing.zziq, com.google.android.gms.internal.play_billing.zzgd, com.google.android.gms.internal.play_billing.zzhn):com.google.android.gms.internal.play_billing.zzhu");
    }

    private static int zzm(Object obj, long j4) {
        return ((Integer) zzix.zzf(obj, j4)).intValue();
    }

    private final int zzn(int i4) {
        return this.zzc[i4 + 2];
    }

    private final int zzo(int i4, int i5) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i10 = iArr[i7];
            if (i4 == i10) {
                return i7;
            }
            if (i4 < i10) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzp(int i4) {
        return (i4 >>> 20) & 255;
    }

    private final int zzq(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzr(Object obj, long j4) {
        return ((Long) zzix.zzf(obj, j4)).longValue();
    }

    private final zzgs zzs(int i4) {
        int i5 = i4 / 3;
        return (zzgs) this.zzd[i5 + i5 + 1];
    }

    private final zzib zzt(int i4) {
        Object[] objArr = this.zzd;
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzib zzibVar = (zzib) objArr[i6];
        if (zzibVar != null) {
            return zzibVar;
        }
        zzib zzb2 = zzhy.zza().zzb((Class) objArr[i6 + 1]);
        objArr[i6] = zzb2;
        return zzb2;
    }

    private final Object zzu(Object obj, int i4, Object obj2, zziq zziqVar, Object obj3) {
        int i5 = this.zzc[i4];
        Object zzf = zzix.zzf(obj, zzq(i4) & 1048575);
        if (zzf == null) {
            return obj2;
        }
        zzgs zzs = zzs(i4);
        if (zzs == null) {
            return obj2;
        }
        zzhk zzc = ((zzhl) zzv(i4)).zzc();
        Iterator it = ((zzhm) zzf).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzis.zza(obj3);
                }
                int zzb2 = zzhl.zzb(zzc, entry.getKey(), entry.getValue());
                zzfp zzfpVar = zzfp.zza;
                byte[] bArr = new byte[zzb2];
                zzfu zzfuVar = new zzfu(bArr, 0, zzb2);
                try {
                    zzhl.zze(zzfuVar, zzc, entry.getKey(), entry.getValue());
                    ((zzir) obj2).zzj((i5 << 3) | 2, zzfl.zza(zzfuVar, bArr));
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return obj2;
    }

    private final Object zzv(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    private final Object zzw(Object obj, int i4) {
        zzib zzt = zzt(i4);
        int zzq = zzq(i4) & 1048575;
        if (!zzH(obj, i4)) {
            return zzt.zze();
        }
        Object object = zzb.getObject(obj, zzq);
        if (zzK(object)) {
            return object;
        }
        Object zze = zzt.zze();
        if (object != null) {
            zzt.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzx(Object obj, int i4, int i5) {
        zzib zzt = zzt(i5);
        if (!zzM(obj, i4, i5)) {
            return zzt.zze();
        }
        Object object = zzb.getObject(obj, zzq(i5) & 1048575);
        if (zzK(object)) {
            return object;
        }
        Object zze = zzt.zze();
        if (object != null) {
            zzt.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzy(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("\ud812"), str, ProtectedSandApp.s("\ud813"), name, ProtectedSandApp.s("\ud814"));
            a5.append(arrays);
            throw new RuntimeException(a5.toString(), e4);
        }
    }

    private static void zzz(Object obj) {
        if (zzK(obj)) {
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\ud815").concat(String.valueOf(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v170, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v223, types: [int] */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v172 */
    /* JADX WARN: Type inference failed for: r1v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v62, types: [int] */
    /* JADX WARN: Type inference failed for: r2v67, types: [int] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71, types: [int] */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [int] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v47, types: [int] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzib
    public final int zza(Object obj) {
        int i4;
        boolean z4;
        ?? r5;
        int zzy;
        int zzz;
        int zza2;
        int size;
        int zzl;
        int zzy2;
        ?? r12;
        ?? r22;
        int a5;
        int a6;
        ?? r32;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z5 = false;
        int i5 = 1048575;
        boolean z6 = false;
        int i6 = 0;
        int i7 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i6 >= iArr.length) {
                int zza3 = ((zzgp) obj).zzc.zza() + i7;
                if (!this.zzh) {
                    return zza3;
                }
                zzii zziiVar = ((zzgm) obj).zzb.zza;
                int zzc = zziiVar.zzc();
                int i11 = 0;
                for (int i12 = 0; i12 < zzc; i12++) {
                    Map.Entry zzg = zziiVar.zzg(i12);
                    i11 += zzgh.zzc(((zzie) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zziiVar.zzd()) {
                    i11 += zzgh.zzc((zzgg) entry.getKey(), entry.getValue());
                }
                return zza3 + i11;
            }
            int zzq = zzq(i6);
            int zzp = zzp(zzq);
            int i13 = iArr[i6];
            int i14 = iArr[i6 + 2];
            int i15 = i14 & i5;
            if (zzp <= 17) {
                if (i15 != i10) {
                    z6 = i15 == i5 ? z5 : unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i4 = i10;
                z4 = z6;
                r5 = 1 << (i14 >>> 20);
            } else {
                i4 = i10;
                z4 = z6;
                r5 = z5;
            }
            int i16 = zzq & i5;
            if (zzp >= zzgi.zzJ.zza()) {
                zzgi.zzW.zza();
            }
            long j4 = i16;
            switch (zzp) {
                case 0:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        long j5 = unsafe.getLong(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(j5);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        long j6 = unsafe.getLong(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(j6);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        long j7 = unsafe.getInt(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(j7);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzfp) {
                            int zzy3 = zzfx.zzy(i17);
                            int zzd = ((zzfp) object).zzd();
                            i7 = c.a(zzd, zzd, zzy3, i7);
                            break;
                        } else {
                            int zzy4 = zzfx.zzy(i17);
                            int i18 = zzjc.zza;
                            int zzb2 = zziz.zzb((String) object);
                            i7 = c.a(zzb2, zzb2, zzy4, i7);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        zzib zzt = zzt(i6);
                        int i19 = zzic.zza;
                        int zzy5 = zzfx.zzy(i13 << 3);
                        int zzi = ((zzfa) object2).zzi(zzt);
                        i7 = c.a(zzi, zzi, zzy5, i7);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        zzfp zzfpVar = (zzfp) unsafe.getObject(obj, j4);
                        int zzy6 = zzfx.zzy(i13 << 3);
                        int zzd2 = zzfpVar.zzd();
                        i7 = c.a(zzd2, zzd2, zzy6, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(unsafe.getInt(obj, j4), zzfx.zzy(i13 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        long j10 = unsafe.getInt(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(j10);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        i7 = b.a(i13 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        int i20 = unsafe.getInt(obj, j4);
                        i7 = b.a((i20 >> 31) ^ (i20 + i20), zzfx.zzy(i13 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        long j11 = unsafe.getLong(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz((j11 >> 63) ^ (j11 + j11));
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzI(obj, i6, i4, z4 ? 1 : 0, r5)) {
                        zza2 = zzic.zza(i13, (zzhr) unsafe.getObject(obj, j4), zzt(i6));
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zza2 = zzic.zze(i13, (List) unsafe.getObject(obj, j4), z5);
                    i7 += zza2;
                    break;
                case 19:
                    zza2 = zzic.zzc(i13, (List) unsafe.getObject(obj, j4), z5);
                    i7 += zza2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j4);
                    int i21 = zzic.zza;
                    if (list.size() != 0) {
                        r12 = (zzfx.zzy(i13 << 3) * list.size()) + zzic.zzh(list);
                        i7 += r12;
                        break;
                    }
                    r12 = z5;
                    i7 += r12;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j4);
                    int i22 = zzic.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzic.zzl(list2);
                        zzy2 = zzfx.zzy(i13 << 3);
                        r22 = (zzy2 * size) + zzl;
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j4);
                    int i23 = zzic.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzic.zzg(list3);
                        zzy2 = zzfx.zzy(i13 << 3);
                        r22 = (zzy2 * size) + zzl;
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 23:
                    zza2 = zzic.zze(i13, (List) unsafe.getObject(obj, j4), z5);
                    i7 += zza2;
                    break;
                case 24:
                    zza2 = zzic.zzc(i13, (List) unsafe.getObject(obj, j4), z5);
                    i7 += zza2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j4);
                    int i24 = zzic.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r12 = (zzfx.zzy(i13 << 3) + 1) * size2;
                        i7 += r12;
                        break;
                    }
                    r12 = z5;
                    i7 += r12;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j4);
                    int i25 = zzic.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzy7 = zzfx.zzy(i13 << 3) * size3;
                        if (r02 instanceof zzhd) {
                            zzhd zzhdVar = (zzhd) r02;
                            r22 = zzy7;
                            for (?? r33 = z5; r33 < size3; r33++) {
                                Object zza4 = zzhdVar.zza();
                                if (zza4 instanceof zzfp) {
                                    int zzd3 = ((zzfp) zza4).zzd();
                                    a6 = b.a(zzd3, zzd3, r22);
                                } else {
                                    int i26 = zzjc.zza;
                                    int zzb3 = zziz.zzb((String) zza4);
                                    a6 = b.a(zzb3, zzb3, r22);
                                }
                                r22 = a6;
                            }
                        } else {
                            r22 = zzy7;
                            for (?? r34 = z5; r34 < size3; r34++) {
                                Object obj2 = r02.get(r34);
                                if (obj2 instanceof zzfp) {
                                    int zzd4 = ((zzfp) obj2).zzd();
                                    a5 = b.a(zzd4, zzd4, r22);
                                } else {
                                    int i27 = zzjc.zza;
                                    int zzb4 = zziz.zzb((String) obj2);
                                    a5 = b.a(zzb4, zzb4, r22);
                                }
                                r22 = a5;
                            }
                        }
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j4);
                    zzib zzt2 = zzt(i6);
                    int i28 = zzic.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r32 = z5;
                    } else {
                        r32 = zzfx.zzy(i13 << 3) * size4;
                        for (?? r42 = z5; r42 < size4; r42++) {
                            int zzi2 = ((zzfa) r03.get(r42)).zzi(zzt2);
                            r32 = b.a(zzi2, zzi2, r32 == true ? 1 : 0);
                        }
                    }
                    i7 += r32;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j4);
                    int i29 = zzic.zza;
                    int size5 = r04.size();
                    if (size5 != 0) {
                        int zzy8 = zzfx.zzy(i13 << 3) * size5;
                        ?? r13 = z5;
                        r22 = zzy8;
                        while (r13 < r04.size()) {
                            int zzd5 = ((zzfp) r04.get(r13)).zzd();
                            r13++;
                            r22 = b.a(zzd5, zzd5, r22);
                        }
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j4);
                    int i30 = zzic.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzl = zzic.zzk(list5);
                        zzy2 = zzfx.zzy(i13 << 3);
                        r22 = (zzy2 * size) + zzl;
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j4);
                    int i31 = zzic.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzl = zzic.zzb(list6);
                        zzy2 = zzfx.zzy(i13 << 3);
                        r22 = (zzy2 * size) + zzl;
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 31:
                    zza2 = zzic.zzc(i13, (List) unsafe.getObject(obj, j4), z5);
                    i7 += zza2;
                    break;
                case 32:
                    zza2 = zzic.zze(i13, (List) unsafe.getObject(obj, j4), z5);
                    i7 += zza2;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j4);
                    int i32 = zzic.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzl = zzic.zzi(list7);
                        zzy2 = zzfx.zzy(i13 << 3);
                        r22 = (zzy2 * size) + zzl;
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j4);
                    int i33 = zzic.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzic.zzj(list8);
                        zzy2 = zzfx.zzy(i13 << 3);
                        r22 = (zzy2 * size) + zzl;
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 35:
                    int zzf = zzic.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf > 0) {
                        i7 = c.a(zzf, zzfx.zzy(i13 << 3), zzf, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzd6 = zzic.zzd((List) unsafe.getObject(obj, j4));
                    if (zzd6 > 0) {
                        i7 = c.a(zzd6, zzfx.zzy(i13 << 3), zzd6, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzh = zzic.zzh((List) unsafe.getObject(obj, j4));
                    if (zzh > 0) {
                        i7 = c.a(zzh, zzfx.zzy(i13 << 3), zzh, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzl2 = zzic.zzl((List) unsafe.getObject(obj, j4));
                    if (zzl2 > 0) {
                        i7 = c.a(zzl2, zzfx.zzy(i13 << 3), zzl2, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzg2 = zzic.zzg((List) unsafe.getObject(obj, j4));
                    if (zzg2 > 0) {
                        i7 = c.a(zzg2, zzfx.zzy(i13 << 3), zzg2, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzf2 = zzic.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf2 > 0) {
                        i7 = c.a(zzf2, zzfx.zzy(i13 << 3), zzf2, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzd7 = zzic.zzd((List) unsafe.getObject(obj, j4));
                    if (zzd7 > 0) {
                        i7 = c.a(zzd7, zzfx.zzy(i13 << 3), zzd7, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j4);
                    int i34 = zzic.zza;
                    int size6 = list9.size();
                    if (size6 > 0) {
                        i7 = c.a(size6, zzfx.zzy(i13 << 3), size6, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzk = zzic.zzk((List) unsafe.getObject(obj, j4));
                    if (zzk > 0) {
                        i7 = c.a(zzk, zzfx.zzy(i13 << 3), zzk, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zzb5 = zzic.zzb((List) unsafe.getObject(obj, j4));
                    if (zzb5 > 0) {
                        i7 = c.a(zzb5, zzfx.zzy(i13 << 3), zzb5, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzd8 = zzic.zzd((List) unsafe.getObject(obj, j4));
                    if (zzd8 > 0) {
                        i7 = c.a(zzd8, zzfx.zzy(i13 << 3), zzd8, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzf3 = zzic.zzf((List) unsafe.getObject(obj, j4));
                    if (zzf3 > 0) {
                        i7 = c.a(zzf3, zzfx.zzy(i13 << 3), zzf3, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzi3 = zzic.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi3 > 0) {
                        i7 = c.a(zzi3, zzfx.zzy(i13 << 3), zzi3, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzj = zzic.zzj((List) unsafe.getObject(obj, j4));
                    if (zzj > 0) {
                        i7 = c.a(zzj, zzfx.zzy(i13 << 3), zzj, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j4);
                    zzib zzt3 = zzt(i6);
                    int i35 = zzic.zza;
                    int size7 = r05.size();
                    if (size7 == 0) {
                        r4 = z5;
                    } else {
                        boolean z7 = z5;
                        r4 = z7;
                        ?? r35 = z7;
                        while (r35 < size7) {
                            int zza5 = zzic.zza(i13, (zzhr) r05.get(r35), zzt3);
                            r35++;
                            r4 = (r4 == true ? 1 : 0) + zza5;
                        }
                    }
                    i7 += r4;
                    break;
                case 50:
                    zzhm zzhmVar = (zzhm) unsafe.getObject(obj, j4);
                    zzhl zzhlVar = (zzhl) zzv(i6);
                    if (!zzhmVar.isEmpty()) {
                        r22 = z5;
                        for (Map.Entry entry2 : zzhmVar.entrySet()) {
                            r22 += zzhlVar.zza(i13, entry2.getKey(), entry2.getValue());
                        }
                        i7 += r22;
                        break;
                    }
                    r22 = z5;
                    i7 += r22;
                case 51:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i13, i6)) {
                        long zzr = zzr(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(zzr);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i13, i6)) {
                        long zzr2 = zzr(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(zzr2);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i13, i6)) {
                        long zzm = zzm(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(zzm);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i13, i6)) {
                        int i36 = i13 << 3;
                        Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof zzfp) {
                            int zzy9 = zzfx.zzy(i36);
                            int zzd9 = ((zzfp) object3).zzd();
                            i7 = c.a(zzd9, zzd9, zzy9, i7);
                            break;
                        } else {
                            int zzy10 = zzfx.zzy(i36);
                            int i37 = zzjc.zza;
                            int zzb6 = zziz.zzb((String) object3);
                            i7 = c.a(zzb6, zzb6, zzy10, i7);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i13, i6)) {
                        Object object4 = unsafe.getObject(obj, j4);
                        zzib zzt4 = zzt(i6);
                        int i38 = zzic.zza;
                        int zzy11 = zzfx.zzy(i13 << 3);
                        int zzi4 = ((zzfa) object4).zzi(zzt4);
                        i7 = c.a(zzi4, zzi4, zzy11, i7);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i13, i6)) {
                        zzfp zzfpVar2 = (zzfp) unsafe.getObject(obj, j4);
                        int zzy12 = zzfx.zzy(i13 << 3);
                        int zzd10 = zzfpVar2.zzd();
                        i7 = c.a(zzd10, zzd10, zzy12, i7);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(zzm(obj, j4), zzfx.zzy(i13 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i13, i6)) {
                        long zzm2 = zzm(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz(zzm2);
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i13, i6)) {
                        i7 = b.a(i13 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i13, i6)) {
                        int zzm3 = zzm(obj, j4);
                        i7 = b.a((zzm3 >> 31) ^ (zzm3 + zzm3), zzfx.zzy(i13 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i13, i6)) {
                        long zzr3 = zzr(obj, j4);
                        zzy = zzfx.zzy(i13 << 3);
                        zzz = zzfx.zzz((zzr3 >> 63) ^ (zzr3 + zzr3));
                        i7 += zzz + zzy;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i13, i6)) {
                        zza2 = zzic.zza(i13, (zzhr) unsafe.getObject(obj, j4), zzt(i6));
                        i7 += zza2;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
            i10 = i4;
            z6 = z4;
            z5 = false;
            i5 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final int zzb(Object obj) {
        int i4;
        long doubleToLongBits;
        int i5;
        int floatToIntBits;
        int zzc;
        int i6;
        int i7 = 0;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzq = zzq(i10);
            int zzp = zzp(zzq);
            if (zzp <= 50 || zzp >= 69) {
                long j4 = zzq & 1048575;
                int i11 = 37;
                switch (zzp) {
                    case 0:
                        i4 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzix.zza(obj, j4));
                        byte[] bArr = zzgv.zza;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + zzc;
                        break;
                    case 1:
                        i5 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(zzix.zzb(obj, j4));
                        i7 = i5 + floatToIntBits;
                        break;
                    case 2:
                        i4 = i7 * 53;
                        doubleToLongBits = zzix.zzd(obj, j4);
                        byte[] bArr2 = zzgv.zza;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + zzc;
                        break;
                    case 3:
                        i4 = i7 * 53;
                        doubleToLongBits = zzix.zzd(obj, j4);
                        byte[] bArr3 = zzgv.zza;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + zzc;
                        break;
                    case 4:
                        i4 = i7 * 53;
                        zzc = zzix.zzc(obj, j4);
                        i7 = i4 + zzc;
                        break;
                    case 5:
                        i4 = i7 * 53;
                        doubleToLongBits = zzix.zzd(obj, j4);
                        byte[] bArr4 = zzgv.zza;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + zzc;
                        break;
                    case 6:
                        i4 = i7 * 53;
                        zzc = zzix.zzc(obj, j4);
                        i7 = i4 + zzc;
                        break;
                    case 7:
                        i5 = i7 * 53;
                        floatToIntBits = zzgv.zza(zzix.zzt(obj, j4));
                        i7 = i5 + floatToIntBits;
                        break;
                    case 8:
                        i5 = i7 * 53;
                        floatToIntBits = ((String) zzix.zzf(obj, j4)).hashCode();
                        i7 = i5 + floatToIntBits;
                        break;
                    case 9:
                        i6 = i7 * 53;
                        Object zzf = zzix.zzf(obj, j4);
                        if (zzf != null) {
                            i11 = zzf.hashCode();
                        }
                        i7 = i6 + i11;
                        break;
                    case 10:
                        i5 = i7 * 53;
                        floatToIntBits = zzix.zzf(obj, j4).hashCode();
                        i7 = i5 + floatToIntBits;
                        break;
                    case 11:
                        i4 = i7 * 53;
                        zzc = zzix.zzc(obj, j4);
                        i7 = i4 + zzc;
                        break;
                    case 12:
                        i4 = i7 * 53;
                        zzc = zzix.zzc(obj, j4);
                        i7 = i4 + zzc;
                        break;
                    case 13:
                        i4 = i7 * 53;
                        zzc = zzix.zzc(obj, j4);
                        i7 = i4 + zzc;
                        break;
                    case 14:
                        i4 = i7 * 53;
                        doubleToLongBits = zzix.zzd(obj, j4);
                        byte[] bArr5 = zzgv.zza;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + zzc;
                        break;
                    case 15:
                        i4 = i7 * 53;
                        zzc = zzix.zzc(obj, j4);
                        i7 = i4 + zzc;
                        break;
                    case 16:
                        i4 = i7 * 53;
                        doubleToLongBits = zzix.zzd(obj, j4);
                        byte[] bArr6 = zzgv.zza;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + zzc;
                        break;
                    case 17:
                        i6 = i7 * 53;
                        Object zzf2 = zzix.zzf(obj, j4);
                        if (zzf2 != null) {
                            i11 = zzf2.hashCode();
                        }
                        i7 = i6 + i11;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i5 = i7 * 53;
                        floatToIntBits = zzix.zzf(obj, j4).hashCode();
                        i7 = i5 + floatToIntBits;
                        break;
                    case 50:
                        i5 = i7 * 53;
                        floatToIntBits = zzix.zzf(obj, j4).hashCode();
                        i7 = i5 + floatToIntBits;
                        break;
                }
            }
        }
        int i12 = this.zzk;
        while (true) {
            int[] iArr = this.zzi;
            if (i12 >= iArr.length) {
                int hashCode = ((zzgp) obj).zzc.hashCode() + (i7 * 53);
                return this.zzh ? (hashCode * 53) + ((zzgm) obj).zzb.zza.hashCode() : hashCode;
            }
            if (!zzM(obj, 0, iArr[i12])) {
                i7 = zzix.zzf(obj, zzq(r3) & 1048575).hashCode() + (i7 * 53);
            }
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x102e, code lost:
    
        if (r13 == 1048575) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x1030, code lost:
    
        r14.putInt(r10, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x1034, code lost:
    
        r6 = r9.zzj;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x103b, code lost:
    
        if (r6 >= r9.zzk) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x103d, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzir) zzu(r37, r9.zzi[r6], r3, r9.zzl, r37);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x1055, code lost:
    
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x1057, code lost:
    
        if (r3 == null) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x1059, code lost:
    
        ((com.google.android.gms.internal.play_billing.zzgp) r10).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x105e, code lost:
    
        if (r7 != 0) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x1062, code lost:
    
        if (r8 != r40) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x106a, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhb(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x1071, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x106d, code lost:
    
        if (r8 > r40) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x106f, code lost:
    
        if (r11 != r7) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x1077, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhb(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0cf0, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhb(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0fa4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0fbd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0b93 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int zzc(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.play_billing.zzfd r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhu.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzfd):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final Object zze() {
        return ((zzgp) this.zzg).zzs();
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzf(Object obj) {
        if (zzK(obj)) {
            if (obj instanceof zzgp) {
                zzgp zzgpVar = (zzgp) obj;
                zzgpVar.zzC(Integer.MAX_VALUE);
                zzgpVar.zza = 0;
                zzgpVar.zzA();
            }
            int[] iArr = this.zzc;
            for (int i4 = 0; i4 < iArr.length; i4 += 3) {
                int zzq = zzq(i4);
                int i5 = 1048575 & zzq;
                int zzp = zzp(zzq);
                long j4 = i5;
                if (zzp != 9) {
                    if (zzp != 60 && zzp != 68) {
                        switch (zzp) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzgu) zzix.zzf(obj, j4)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzhm) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i4], i4)) {
                        zzt(i4).zzf(zzb.getObject(obj, j4));
                    }
                }
                if (zzH(obj, i4)) {
                    zzt(i4).zzf(zzb.getObject(obj, j4));
                }
            }
            ((zzgp) obj).zzc.zzh();
            if (this.zzh) {
                ((zzgm) obj).zzb.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzg(Object obj, Object obj2) {
        zzz(obj);
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                zzic.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzic.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzq = zzq(i4);
            int i5 = 1048575 & zzq;
            int zzp = zzp(zzq);
            int i6 = iArr[i4];
            long j4 = i5;
            switch (zzp) {
                case 0:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzl(obj, j4, zzix.zza(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 1:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzm(obj, j4, zzix.zzb(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 2:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzo(obj, j4, zzix.zzd(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 3:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzo(obj, j4, zzix.zzd(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 4:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzn(obj, j4, zzix.zzc(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 5:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzo(obj, j4, zzix.zzd(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 6:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzn(obj, j4, zzix.zzc(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 7:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzk(obj, j4, zzix.zzt(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 8:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzp(obj, j4, zzix.zzf(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 9:
                    zzA(obj, obj2, i4);
                    break;
                case 10:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzp(obj, j4, zzix.zzf(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 11:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzn(obj, j4, zzix.zzc(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 12:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzn(obj, j4, zzix.zzc(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 13:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzn(obj, j4, zzix.zzc(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 14:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzo(obj, j4, zzix.zzd(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 15:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzn(obj, j4, zzix.zzc(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 16:
                    if (!zzH(obj2, i4)) {
                        break;
                    } else {
                        zzix.zzo(obj, j4, zzix.zzd(obj2, j4));
                        zzC(obj, i4);
                        break;
                    }
                case 17:
                    zzA(obj, obj2, i4);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzgu zzguVar = (zzgu) zzix.zzf(obj, j4);
                    zzgu zzguVar2 = (zzgu) zzix.zzf(obj2, j4);
                    int size = zzguVar.size();
                    int size2 = zzguVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzguVar.zzc()) {
                            zzguVar = zzguVar.zzd(size2 + size);
                        }
                        zzguVar.addAll(zzguVar2);
                    }
                    if (size > 0) {
                        zzguVar2 = zzguVar;
                    }
                    zzix.zzp(obj, j4, zzguVar2);
                    break;
                case 50:
                    int i7 = zzic.zza;
                    zzix.zzp(obj, j4, zzhn.zza(zzix.zzf(obj, j4), zzix.zzf(obj2, j4)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzM(obj2, i6, i4)) {
                        break;
                    } else {
                        zzix.zzp(obj, j4, zzix.zzf(obj2, j4));
                        zzD(obj, i6, i4);
                        break;
                    }
                case 60:
                    zzB(obj, obj2, i4);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i6, i4)) {
                        break;
                    } else {
                        zzix.zzp(obj, j4, zzix.zzf(obj2, j4));
                        zzD(obj, i6, i4);
                        break;
                    }
                case 68:
                    zzB(obj, obj2, i4);
                    break;
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzh(Object obj, byte[] bArr, int i4, int i5, zzfd zzfdVar) throws IOException {
        zzc(obj, bArr, i4, i5, 0, zzfdVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.play_billing.zzib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r20, com.google.android.gms.internal.play_billing.zzji r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhu.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzji):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bf, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.play_billing.zzib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzj(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhu.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final boolean zzk(Object obj) {
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i10 = 1048575;
        while (i7 < this.zzj) {
            int i11 = this.zzi[i7];
            int zzq = zzq(i11);
            int[] iArr = this.zzc;
            int i12 = iArr[i11 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i10) {
                if (i13 != 1048575) {
                    i6 = zzb.getInt(obj, i13);
                }
                i5 = i6;
                i4 = i13;
            } else {
                i4 = i10;
                i5 = i6;
            }
            if ((268435456 & zzq) != 0 && !zzI(obj, i11, i4, i5, i14)) {
                return false;
            }
            int zzp = zzp(zzq);
            if (zzp != 9 && zzp != 17) {
                if (zzp != 27) {
                    if (zzp == 60 || zzp == 68) {
                        if (zzM(obj, iArr[i11], i11) && !zzJ(obj, zzq, zzt(i11))) {
                            return false;
                        }
                    } else if (zzp != 49) {
                        if (zzp != 50) {
                            continue;
                        } else {
                            zzhm zzhmVar = (zzhm) zzix.zzf(obj, zzq & 1048575);
                            if (!zzhmVar.isEmpty() && ((zzhl) zzv(i11)).zzc().zzc.zzb() == zzjh.zzi) {
                                zzib zzibVar = null;
                                for (Object obj2 : zzhmVar.values()) {
                                    if (zzibVar == null) {
                                        zzibVar = zzhy.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzibVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzix.zzf(obj, zzq & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzib zzt = zzt(i11);
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        if (!zzt.zzk(list.get(i15))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i11, i4, i5, i14) && !zzJ(obj, zzq, zzt(i11))) {
                return false;
            }
            i7++;
            i10 = i4;
            i6 = i5;
        }
        return !this.zzh || ((zzgm) obj).zzb.zzj();
    }
}
