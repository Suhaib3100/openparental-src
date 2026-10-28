package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzgh {
    private static final zzgh zzd = new zzgh(true);
    final zzii zza = new zzid();
    boolean zzb;
    boolean zzc;

    private zzgh() {
    }

    static int zza(zzjg zzjgVar, int i4, Object obj) {
        int zzy = zzfx.zzy(i4 << 3);
        if (zzjgVar == zzjg.zzj) {
            zzy += zzy;
        }
        return zzy + zzb(zzjgVar, obj);
    }

    static int zzb(zzjg zzjgVar, Object obj) {
        int zzb;
        int zzy;
        zzjg zzjgVar2 = zzjg.zza;
        zzjh zzjhVar = zzjh.zza;
        switch (zzjgVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return zzfx.zzz(((Long) obj).longValue());
            case 3:
                return zzfx.zzz(((Long) obj).longValue());
            case 4:
                return zzfx.zzz(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                if (!(obj instanceof zzfp)) {
                    int i4 = zzjc.zza;
                    zzb = zziz.zzb((String) obj);
                    zzy = zzfx.zzy(zzb);
                    break;
                } else {
                    zzb = ((zzfp) obj).zzd();
                    zzy = zzfx.zzy(zzb);
                    break;
                }
            case 9:
                return ((zzhr) obj).zzn();
            case 10:
                if (!(obj instanceof zzgz)) {
                    return zzfx.zzx((zzhr) obj);
                }
                zzb = ((zzgz) obj).zza();
                zzy = zzfx.zzy(zzb);
                break;
            case 11:
                if (!(obj instanceof zzfp)) {
                    zzb = ((byte[]) obj).length;
                    zzy = zzfx.zzy(zzb);
                    break;
                } else {
                    zzb = ((zzfp) obj).zzd();
                    zzy = zzfx.zzy(zzb);
                    break;
                }
            case 12:
                return zzfx.zzy(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgr ? zzfx.zzz(((zzgr) obj).zza()) : zzfx.zzz(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzfx.zzy((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzfx.zzz((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException(ProtectedSandApp.s("\ud7aa"));
        }
        return zzy + zzb;
    }

    public static int zzc(zzgg zzggVar, Object obj) {
        zzjg zzb = zzggVar.zzb();
        int zza = zzggVar.zza();
        if (!zzggVar.zze()) {
            return zza(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i4 = 0;
        if (!zzggVar.zzd()) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zza(zzb, zza, list.get(i4));
                i4++;
            }
            return i5;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i6 = 0;
        while (i4 < size) {
            i6 += zzb(zzb, list.get(i4));
            i4++;
        }
        return zzfx.zzy(i6) + zzfx.zzy(zza << 3) + i6;
    }

    public static zzgh zze() {
        return zzd;
    }

    static void zzi(zzfx zzfxVar, zzjg zzjgVar, int i4, Object obj) throws IOException {
        if (zzjgVar == zzjg.zzj) {
            zzfxVar.zzs(i4, 3);
            ((zzhr) obj).zzD(zzfxVar);
            zzfxVar.zzs(i4, 4);
            return;
        }
        zzfxVar.zzs(i4, zzjgVar.zza());
        zzjh zzjhVar = zzjh.zza;
        switch (zzjgVar.ordinal()) {
            case 0:
                zzfxVar.zzk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzfxVar.zzi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzfxVar.zzw(((Long) obj).longValue());
                break;
            case 3:
                zzfxVar.zzw(((Long) obj).longValue());
                break;
            case 4:
                zzfxVar.zzm(((Integer) obj).intValue());
                break;
            case 5:
                zzfxVar.zzk(((Long) obj).longValue());
                break;
            case 6:
                zzfxVar.zzi(((Integer) obj).intValue());
                break;
            case 7:
                zzfxVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzfp)) {
                    zzfxVar.zzr((String) obj);
                    break;
                } else {
                    zzfxVar.zzg((zzfp) obj);
                    break;
                }
            case 9:
                ((zzhr) obj).zzD(zzfxVar);
                break;
            case 10:
                zzfxVar.zzn((zzhr) obj);
                break;
            case 11:
                if (!(obj instanceof zzfp)) {
                    byte[] bArr = (byte[]) obj;
                    zzfxVar.zze(bArr, 0, bArr.length);
                    break;
                } else {
                    zzfxVar.zzg((zzfp) obj);
                    break;
                }
            case 12:
                zzfxVar.zzu(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzgr)) {
                    zzfxVar.zzm(((Integer) obj).intValue());
                    break;
                } else {
                    zzfxVar.zzm(((zzgr) obj).zza());
                    break;
                }
            case 14:
                zzfxVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzfxVar.zzk(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzfxVar.zzu((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzfxVar.zzw((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzgg zzggVar = (zzgg) entry.getKey();
        if (zzggVar.zzc() != zzjh.zzi) {
            return true;
        }
        if (!zzggVar.zze()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!zzl(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzhs) {
            return ((zzhs) obj).zzo();
        }
        if (obj instanceof zzgz) {
            return true;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\ud7ab"));
    }

    private static final int zzm(Map.Entry entry) {
        int i4;
        int zzy;
        int zzx;
        zzgg zzggVar = (zzgg) entry.getKey();
        Object value = entry.getValue();
        if (zzggVar.zzc() != zzjh.zzi || zzggVar.zze() || zzggVar.zzd()) {
            return zzc(zzggVar, value);
        }
        if (value instanceof zzgz) {
            int zza = ((zzgg) entry.getKey()).zza();
            int zzy2 = zzfx.zzy(8);
            i4 = zzy2 + zzy2;
            zzy = zzfx.zzy(zza) + zzfx.zzy(16);
            int zzy3 = zzfx.zzy(24);
            int zza2 = ((zzgz) value).zza();
            zzx = b.a(zza2, zza2, zzy3);
        } else {
            int zza3 = ((zzgg) entry.getKey()).zza();
            int zzy4 = zzfx.zzy(8);
            i4 = zzy4 + zzy4;
            zzy = zzfx.zzy(zza3) + zzfx.zzy(16);
            zzx = zzfx.zzx((zzhr) value) + zzfx.zzy(24);
        }
        return i4 + zzy + zzx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzn(com.google.android.gms.internal.play_billing.zzgg r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.play_billing.zzjg r0 = r2.zzb()
            r3.getClass()
            com.google.android.gms.internal.play_billing.zzjg r1 = com.google.android.gms.internal.play_billing.zzjg.zza
            com.google.android.gms.internal.play_billing.zzjh r1 = com.google.android.gms.internal.play_billing.zzjh.zza
            com.google.android.gms.internal.play_billing.zzjh r0 = r0.zzb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzhr
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzgz
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzgr
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r3 instanceof com.google.android.gms.internal.play_billing.zzfp
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.play_billing.zzjg r2 = r2.zzb()
            com.google.android.gms.internal.play_billing.zzjh r2 = r2.zzb()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "\ud7ac"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgh.zzn(com.google.android.gms.internal.play_billing.zzgg, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgh zzghVar = new zzgh();
        zzii zziiVar = this.zza;
        int zzc = zziiVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            Map.Entry zzg = zziiVar.zzg(i4);
            zzghVar.zzh(((zzie) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : zziiVar.zzd()) {
            zzghVar.zzh((zzgg) entry.getKey(), entry.getValue());
        }
        zzghVar.zzc = this.zzc;
        return zzghVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgh)) {
            return false;
        }
        zzii zziiVar = this.zza;
        zzii zziiVar2 = ((zzgh) obj).zza;
        if (zziiVar.size() == zziiVar2.size() && zziiVar.keySet().equals(zziiVar2.keySet())) {
            for (Map.Entry entry : zziiVar.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = zziiVar2.get(key);
                if (!(value == obj2 ? true : (value == null || obj2 == null) ? false : value instanceof zzgz ? value.equals(obj2) : obj2 instanceof zzgz ? obj2.equals(value) : value.equals(obj2))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzii zziiVar = this.zza;
        int zzc = zziiVar.zzc();
        int i4 = 0;
        for (int i5 = 0; i5 < zzc; i5++) {
            i4 += zzm(zziiVar.zzg(i5));
        }
        Iterator it = zziiVar.zzd().iterator();
        while (it.hasNext()) {
            i4 += zzm((Map.Entry) it.next());
        }
        return i4;
    }

    public final Iterator zzf() {
        zzii zziiVar = this.zza;
        return zziiVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzgx(zziiVar.entrySet().iterator()) : zziiVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        zzii zziiVar = this.zza;
        int zzc = zziiVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            Object value = zziiVar.zzg(i4).getValue();
            if (value instanceof zzgp) {
                ((zzgp) value).zzz();
            }
        }
        Iterator it = zziiVar.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgp) {
                ((zzgp) value2).zzz();
            }
        }
        zziiVar.zza();
        this.zzb = true;
    }

    public final void zzh(zzgg zzggVar, Object obj) {
        if (!zzggVar.zze()) {
            zzn(zzggVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ud7ab"));
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = list.get(i4);
                zzn(zzggVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgz) {
            this.zzc = true;
        }
        this.zza.put(zzggVar, obj);
    }

    public final boolean zzj() {
        zzii zziiVar = this.zza;
        int zzc = zziiVar.zzc();
        for (int i4 = 0; i4 < zzc; i4++) {
            if (!zzk(zziiVar.zzg(i4))) {
                return false;
            }
        }
        Iterator it = zziiVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgh(boolean z4) {
        zzg();
        zzg();
    }
}
