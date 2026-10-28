package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzjo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzjm<T extends zzjo<T>> {
    private static final zzjm<?> zzb = new zzjm<>(true);
    final zzlv<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzjm() {
        this.zza = new zzly();
    }

    static int zza(zzms zzmsVar, int i4, Object obj) {
        int zzi = zzjc.zzi(i4);
        if (zzmsVar == zzms.zzj) {
            zzjv.zza((zzlc) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmsVar, obj);
    }

    public static <T extends zzjo<T>> zzjm<T> zzb() {
        return (zzjm<T>) zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjm zzjmVar = new zzjm();
        int zza = this.zza.zza();
        for (int i4 = 0; i4 < zza; i4++) {
            Map.Entry<T, Object> zza2 = this.zza.zza(i4);
            zzjmVar.zzb(zza2.getKey(), zza2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzjmVar.zzb(entry.getKey(), entry.getValue());
        }
        zzjmVar.zzd = this.zzd;
        return zzjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjm) {
            return this.zza.equals(((zzjm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzki(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzki(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zza = this.zza.zza();
        for (int i4 = 0; i4 < zza; i4++) {
            Object value = this.zza.zza(i4).getValue();
            if (value instanceof zzjt) {
                ((zzjt) value).zzcl();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzjt) {
                ((zzjt) value2).zzcl();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zza = this.zza.zza();
        for (int i4 = 0; i4 < zza; i4++) {
            if (!zzc(this.zza.zza(i4))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z4 = value instanceof zzkg;
        if (key.zze()) {
            if (z4) {
                throw new IllegalStateException(ProtectedSandApp.s("풿"));
            }
            Object zza = zza((zzjm<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i4 = 0; i4 < size; i4++) {
                list2.add(zza(list.get(i4)));
            }
            this.zza.zza((zzlv<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzmz.zzi) {
            if (z4) {
                throw new IllegalStateException(ProtectedSandApp.s("퓀"));
            }
            this.zza.zza((zzlv<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzjm<T>) key);
        if (zza2 != null) {
            if (z4) {
                throw new NoSuchMethodError();
            }
            this.zza.zza((zzlv<T, Object>) key, (T) (zza2 instanceof zzlh ? key.zza((zzlh) zza2, (zzlh) value) : key.zza(((zzlc) zza2).zzcj(), (zzlc) value).zzai()));
        } else {
            this.zza.zza((zzlv<T, Object>) key, (T) zza(value));
            if (z4) {
                this.zzd = true;
            }
        }
    }

    private zzjm(zzlv<T, Object> zzlvVar) {
        this.zza = zzlvVar;
        zze();
    }

    private static int zza(zzms zzmsVar, Object obj) {
        switch (zzjl.zzb[zzmsVar.ordinal()]) {
            case 1:
                return zzjc.zza(((Double) obj).doubleValue());
            case 2:
                return zzjc.zza(((Float) obj).floatValue());
            case 3:
                return zzjc.zzd(((Long) obj).longValue());
            case 4:
                return zzjc.zzg(((Long) obj).longValue());
            case 5:
                return zzjc.zzf(((Integer) obj).intValue());
            case 6:
                return zzjc.zzc(((Long) obj).longValue());
            case 7:
                return zzjc.zze(((Integer) obj).intValue());
            case 8:
                return zzjc.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzjc.zzb((zzlc) obj);
            case 10:
                if (obj instanceof zzkg) {
                    return zzjc.zza((zzkg) obj);
                }
                return zzjc.zzc((zzlc) obj);
            case 11:
                if (obj instanceof zzik) {
                    return zzjc.zzb((zzik) obj);
                }
                return zzjc.zzb((String) obj);
            case 12:
                if (obj instanceof zzik) {
                    return zzjc.zzb((zzik) obj);
                }
                return zzjc.zza((byte[]) obj);
            case 13:
                return zzjc.zzj(((Integer) obj).intValue());
            case 14:
                return zzjc.zzg(((Integer) obj).intValue());
            case 15:
                return zzjc.zze(((Long) obj).longValue());
            case 16:
                return zzjc.zzh(((Integer) obj).intValue());
            case 17:
                return zzjc.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjy) {
                    return zzjc.zzd(((zzjy) obj).zza());
                }
                return zzjc.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException(ProtectedSandApp.s("풽"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzkg) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjy) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzc(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.zzms r0 = r3.zzb()
            com.google.android.gms.internal.measurement.zzjv.zza(r4)
            int[] r1 = com.google.android.gms.internal.measurement.zzjl.zza
            com.google.android.gms.internal.measurement.zzmz r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzlc
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzkg
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjy
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzik
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zzms r3 = r3.zzb()
            com.google.android.gms.internal.measurement.zzmz r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "퓁"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjm.zzc(com.google.android.gms.internal.measurement.zzjo, java.lang.Object):void");
    }

    private zzjm(boolean z4) {
        this(new zzly());
        zze();
    }

    private static <T extends zzjo<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmz.zzi) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!zzb(list.get(i4))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t4, Object obj) {
        if (t4.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj2 = list.get(i4);
                    zzc(t4, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException(ProtectedSandApp.s("풾"));
            }
        } else {
            zzc(t4, obj);
        }
        if (obj instanceof zzkg) {
            this.zzd = true;
        }
        this.zza.zza((zzlv<T, Object>) t4, (T) obj);
    }

    public static int zza(zzjo<?> zzjoVar, Object obj) {
        zzms zzb2 = zzjoVar.zzb();
        int zza = zzjoVar.zza();
        if (zzjoVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i4 = 0;
            if (!zzjoVar.zzd()) {
                int i5 = 0;
                while (i4 < size) {
                    i5 += zza(zzb2, zza, list.get(i4));
                    i4++;
                }
                return i5;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int i6 = 0;
            while (i4 < size) {
                i6 += zza(zzb2, list.get(i4));
                i4++;
            }
            return zzjc.zzj(i6) + zzjc.zzi(zza) + i6;
        }
        return zza(zzb2, zza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzle) {
            return ((zzle) obj).zzcn();
        }
        if (obj instanceof zzkg) {
            return true;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("풾"));
    }

    public final int zza() {
        int zza = this.zza.zza();
        int i4 = 0;
        for (int i5 = 0; i5 < zza; i5++) {
            i4 += zza((Map.Entry) this.zza.zza(i5));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            i4 += zza((Map.Entry) it.next());
        }
        return i4;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzmz.zzi && !key.zze() && !key.zzd()) {
            if (value instanceof zzkg) {
                return zzjc.zza(entry.getKey().zza(), (zzkg) value);
            }
            return zzjc.zzb(entry.getKey().zza(), (zzlc) value);
        }
        return zza((zzjo<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzlh) {
            return ((zzlh) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t4) {
        Object obj = this.zza.get(t4);
        if (obj instanceof zzkg) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzjm<T> zzjmVar) {
        int zza = zzjmVar.zza.zza();
        for (int i4 = 0; i4 < zza; i4++) {
            zzb((Map.Entry) zzjmVar.zza.zza(i4));
        }
        Iterator<Map.Entry<T, Object>> it = zzjmVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    static void zza(zzjc zzjcVar, zzms zzmsVar, int i4, Object obj) throws IOException {
        if (zzmsVar == zzms.zzj) {
            zzlc zzlcVar = (zzlc) obj;
            zzjv.zza(zzlcVar);
            zzjcVar.zzc(i4, 3);
            zzlcVar.zza(zzjcVar);
            zzjcVar.zzc(i4, 4);
        }
        zzjcVar.zzc(i4, zzmsVar.zza());
        switch (zzjl.zzb[zzmsVar.ordinal()]) {
            case 1:
                zzjcVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzjcVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzjcVar.zzb(((Long) obj).longValue());
                break;
            case 4:
                zzjcVar.zzb(((Long) obj).longValue());
                break;
            case 5:
                zzjcVar.zzb(((Integer) obj).intValue());
                break;
            case 6:
                zzjcVar.zza(((Long) obj).longValue());
                break;
            case 7:
                zzjcVar.zza(((Integer) obj).intValue());
                break;
            case 8:
                zzjcVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzlc) obj).zza(zzjcVar);
                break;
            case 10:
                zzjcVar.zza((zzlc) obj);
                break;
            case 11:
                if (obj instanceof zzik) {
                    zzjcVar.zza((zzik) obj);
                    break;
                } else {
                    zzjcVar.zza((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzik) {
                    zzjcVar.zza((zzik) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzjcVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzjcVar.zzc(((Integer) obj).intValue());
                break;
            case 14:
                zzjcVar.zza(((Integer) obj).intValue());
                break;
            case 15:
                zzjcVar.zza(((Long) obj).longValue());
                break;
            case 16:
                zzjcVar.zzk(((Integer) obj).intValue());
                break;
            case 17:
                zzjcVar.zzh(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzjy) {
                    zzjcVar.zzb(((zzjy) obj).zza());
                    break;
                } else {
                    zzjcVar.zzb(((Integer) obj).intValue());
                    break;
                }
        }
    }
}
