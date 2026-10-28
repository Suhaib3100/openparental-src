package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzje {
    public static final zzje zza = new zzje(null, null, 100);
    private final EnumMap<zza, zzjh> zzb;
    private final int zzc;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
    public enum zza {
        zza(ProtectedSandApp.s("\udf8b")),
        zzb(ProtectedSandApp.s("\udf8d")),
        zzc(ProtectedSandApp.s("\udf8f")),
        zzd(ProtectedSandApp.s("\udf91"));

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    private zzje(EnumMap<zza, zzjh> enumMap, int i4) {
        EnumMap<zza, zzjh> enumMap2 = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i4;
    }

    public static boolean zza(int i4, int i5) {
        if (i4 == -20 && i5 == -30) {
            return true;
        }
        return (i4 == -30 && i5 == -20) || i4 == i5 || i4 < i5;
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (!(obj instanceof zzje)) {
            return false;
        }
        zzje zzjeVar = (zzje) obj;
        zzaVarArr = zzjg.zza.zzd;
        for (zza zzaVar : zzaVarArr) {
            if (this.zzb.get(zzaVar) != zzjeVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zzjeVar.zzc;
    }

    public final int hashCode() {
        int i4 = this.zzc * 17;
        Iterator<zzjh> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i4 = (i4 * 31) + it.next().hashCode();
        }
        return i4;
    }

    public final String toString() {
        zza[] zzaVarArr;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udf9d"));
        sb.append(zza(this.zzc));
        zzaVarArr = zzjg.zza.zzd;
        for (zza zzaVar : zzaVarArr) {
            sb.append(ProtectedSandApp.s("\udf9e"));
            sb.append(zzaVar.zze);
            sb.append(ProtectedSandApp.s("\udf9f"));
            zzjh zzjhVar = this.zzb.get(zzaVar);
            if (zzjhVar == null) {
                zzjhVar = zzjh.zza;
            }
            sb.append(zzjhVar);
        }
        return sb.toString();
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, zzjh> entry : this.zzb.entrySet()) {
            String zzb = zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        return bundle;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzb.get(zza.zza);
        return zzjhVar == null ? zzjh.zza : zzjhVar;
    }

    public final zzjh zzd() {
        zzjh zzjhVar = this.zzb.get(zza.zzb);
        return zzjhVar == null ? zzjh.zza : zzjhVar;
    }

    public final String zze() {
        int ordinal;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udfa0"));
        for (zza zzaVar : zzjg.zza.zza()) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            char c5 = '-';
            if (zzjhVar != null && (ordinal = zzjhVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c5 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c5 = '1';
            }
            sb.append(c5);
        }
        return sb.toString();
    }

    public final String zzf() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udfa0"));
        for (zza zzaVar : zzjg.zza.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean zzg() {
        return zza(zza.zza);
    }

    public final boolean zzh() {
        return zza(zza.zzb);
    }

    public final boolean zzi() {
        Iterator<zzjh> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.zza) {
                return true;
            }
        }
        return false;
    }

    static char zza(zzjh zzjhVar) {
        if (zzjhVar == null) {
            return '-';
        }
        int ordinal = zzjhVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public final int zza() {
        return this.zzc;
    }

    public final boolean zzc(zzje zzjeVar) {
        return zzb(zzjeVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    static zzjh zza(String str) {
        if (str == null) {
            return zzjh.zza;
        }
        if (str.equals(ProtectedSandApp.s("\udf93"))) {
            return zzjh.zzd;
        }
        if (str.equals(ProtectedSandApp.s("\udf94"))) {
            return zzjh.zzc;
        }
        return zzjh.zza;
    }

    public zzje(Boolean bool, Boolean bool2, int i4) {
        EnumMap<zza, zzjh> enumMap = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzjh>) zza.zza, (zza) zza((Boolean) null));
        enumMap.put((EnumMap<zza, zzjh>) zza.zzb, (zza) zza((Boolean) null));
        this.zzc = i4;
    }

    public static zzje zzb(String str) {
        return zza(str, 100);
    }

    public final zzje zzb(zzje zzjeVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzjg.zza.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            if (zzjhVar == zzjh.zza) {
                zzjhVar = zzjeVar.zzb.get(zzaVar);
            }
            if (zzjhVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzjhVar);
            }
        }
        return new zzje(enumMap, this.zzc);
    }

    static zzjh zza(char c5) {
        if (c5 == '+') {
            return zzjh.zzb;
        }
        if (c5 == '0') {
            return zzjh.zzc;
        }
        if (c5 != '1') {
            return zzjh.zza;
        }
        return zzjh.zzd;
    }

    static String zzb(zzjh zzjhVar) {
        int ordinal = zzjhVar.ordinal();
        if (ordinal == 2) {
            return ProtectedSandApp.s("\udf94");
        }
        if (ordinal != 3) {
            return null;
        }
        return ProtectedSandApp.s("\udf93");
    }

    static zzjh zza(Boolean bool) {
        if (bool == null) {
            return zzjh.zza;
        }
        if (bool.booleanValue()) {
            return zzjh.zzd;
        }
        return zzjh.zzc;
    }

    public final boolean zzb(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzjh zzjhVar = this.zzb.get(zzaVar);
            zzjh zzjhVar2 = zzjeVar.zzb.get(zzaVar);
            zzjh zzjhVar3 = zzjh.zzc;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }

    public static zzje zza(Bundle bundle, int i4) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zzje(null, null, i4);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzjg.zza.zzd;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zzje(enumMap, i4);
    }

    public static zzje zza(zzjh zzjhVar, zzjh zzjhVar2, int i4) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.zza, (zza) zzjhVar);
        enumMap.put((EnumMap) zza.zzb, (zza) zzjhVar2);
        return new zzje(enumMap, -10);
    }

    public static zzje zza(String str, int i4) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zza2 = zzjg.zza.zza();
        for (int i5 = 0; i5 < zza2.length; i5++) {
            zza zzaVar = zza2[i5];
            int i6 = i5 + 2;
            if (i6 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i6)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzjh.zza);
            }
        }
        return new zzje(enumMap, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzje zza(com.google.android.gms.measurement.internal.zzje r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzje$zza> r1 = com.google.android.gms.measurement.internal.zzje.zza.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjg r1 = com.google.android.gms.measurement.internal.zzjg.zza
            com.google.android.gms.measurement.internal.zzje$zza[] r1 = com.google.android.gms.measurement.internal.zzjg.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzje$zza, com.google.android.gms.measurement.internal.zzjh> r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzjh r5 = (com.google.android.gms.measurement.internal.zzjh) r5
            java.util.EnumMap<com.google.android.gms.measurement.internal.zzje$zza, com.google.android.gms.measurement.internal.zzjh> r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzjh r6 = (com.google.android.gms.measurement.internal.zzjh) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.zza
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.zzb
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            com.google.android.gms.measurement.internal.zzjh r7 = com.google.android.gms.measurement.internal.zzjh.zzc
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            com.google.android.gms.measurement.internal.zzjh r5 = com.google.android.gms.measurement.internal.zzjh.zzd
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.zzje r9 = new com.google.android.gms.measurement.internal.zzje
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzje.zza(com.google.android.gms.measurement.internal.zzje):com.google.android.gms.measurement.internal.zzje");
    }

    static String zza(int i4) {
        if (i4 == -30) {
            return ProtectedSandApp.s("\udf9c");
        }
        if (i4 == -20) {
            return ProtectedSandApp.s("\udf9b");
        }
        if (i4 == -10) {
            return ProtectedSandApp.s("\udf9a");
        }
        if (i4 == 0) {
            return ProtectedSandApp.s("\udf99");
        }
        if (i4 == 30) {
            return ProtectedSandApp.s("\udf98");
        }
        if (i4 == 90) {
            return ProtectedSandApp.s("\udf97");
        }
        if (i4 != 100) {
            return ProtectedSandApp.s("\udf95");
        }
        return ProtectedSandApp.s("\udf96");
    }

    public static String zza(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzjg.zza.zzd;
        int length = zzaVarArr.length;
        int i4 = 0;
        while (true) {
            Boolean bool = null;
            if (i4 >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i4];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals(ProtectedSandApp.s("\udf93"))) {
                    bool = Boolean.TRUE;
                } else if (string.equals(ProtectedSandApp.s("\udf94"))) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i4++;
        }
    }

    public final boolean zza(zzje zzjeVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzjeVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzjh.zzc;
    }
}
