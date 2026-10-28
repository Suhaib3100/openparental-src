package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzkd {
    public static final zzkd zza;
    public static final zzkd zzb;
    public static final zzkd zzc;
    public static final zzkd zzd;
    public static final zzkd zze;
    public static final zzkd zzf;
    public static final zzkd zzg;
    public static final zzkd zzh;
    public static final zzkd zzi;
    public static final zzkd zzj;
    private static final /* synthetic */ zzkd[] zzk;
    private final Class<?> zzl;

    static {
        zzkd zzkdVar = new zzkd(ProtectedSandApp.s("픔"), 0, Void.class, Void.class, null);
        zza = zzkdVar;
        Class cls = Integer.TYPE;
        zzkd zzkdVar2 = new zzkd(ProtectedSandApp.s("픕"), 1, cls, Integer.class, 0);
        zzb = zzkdVar2;
        zzkd zzkdVar3 = new zzkd(ProtectedSandApp.s("픖"), 2, Long.TYPE, Long.class, 0L);
        zzc = zzkdVar3;
        zzkd zzkdVar4 = new zzkd(ProtectedSandApp.s("픗"), 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzkdVar4;
        zzkd zzkdVar5 = new zzkd(ProtectedSandApp.s("픘"), 4, Double.TYPE, Double.class, Double.valueOf(p.f60679p));
        zze = zzkdVar5;
        zzkd zzkdVar6 = new zzkd(ProtectedSandApp.s("픙"), 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzkdVar6;
        zzkd zzkdVar7 = new zzkd(ProtectedSandApp.s("픚"), 6, String.class, String.class, "");
        zzg = zzkdVar7;
        zzkd zzkdVar8 = new zzkd(ProtectedSandApp.s("픛"), 7, zzik.class, zzik.class, zzik.zza);
        zzh = zzkdVar8;
        zzkd zzkdVar9 = new zzkd(ProtectedSandApp.s("픜"), 8, cls, Integer.class, null);
        zzi = zzkdVar9;
        zzkd zzkdVar10 = new zzkd(ProtectedSandApp.s("픝"), 9, Object.class, Object.class, null);
        zzj = zzkdVar10;
        zzk = new zzkd[]{zzkdVar, zzkdVar2, zzkdVar3, zzkdVar4, zzkdVar5, zzkdVar6, zzkdVar7, zzkdVar8, zzkdVar9, zzkdVar10};
    }

    private zzkd(String str, int i4, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzkd[] values() {
        return (zzkd[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
