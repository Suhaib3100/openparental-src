package com.google.android.libraries.places.internal;

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
/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzadv {
    public static final zzadv zza;
    public static final zzadv zzb;
    public static final zzadv zzc;
    public static final zzadv zzd;
    public static final zzadv zze;
    public static final zzadv zzf;
    public static final zzadv zzg;
    public static final zzadv zzh;
    public static final zzadv zzi;
    public static final zzadv zzj;
    private static final /* synthetic */ zzadv[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzadv zzadvVar = new zzadv(ProtectedSandApp.s("\ue78f"), 0, Void.class, Void.class, null);
        zza = zzadvVar;
        Class cls = Integer.TYPE;
        zzadv zzadvVar2 = new zzadv(ProtectedSandApp.s("\ue790"), 1, cls, Integer.class, 0);
        zzb = zzadvVar2;
        zzadv zzadvVar3 = new zzadv(ProtectedSandApp.s("\ue791"), 2, Long.TYPE, Long.class, 0L);
        zzc = zzadvVar3;
        zzadv zzadvVar4 = new zzadv(ProtectedSandApp.s("\ue792"), 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzadvVar4;
        zzadv zzadvVar5 = new zzadv(ProtectedSandApp.s("\ue793"), 4, Double.TYPE, Double.class, Double.valueOf(p.f60679p));
        zze = zzadvVar5;
        zzadv zzadvVar6 = new zzadv(ProtectedSandApp.s("\ue794"), 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzadvVar6;
        zzadv zzadvVar7 = new zzadv(ProtectedSandApp.s("\ue795"), 6, String.class, String.class, "");
        zzg = zzadvVar7;
        zzadv zzadvVar8 = new zzadv(ProtectedSandApp.s("\ue796"), 7, zzacp.class, zzacp.class, zzacp.zzb);
        zzh = zzadvVar8;
        zzadv zzadvVar9 = new zzadv(ProtectedSandApp.s("\ue797"), 8, cls, Integer.class, null);
        zzi = zzadvVar9;
        zzadv zzadvVar10 = new zzadv(ProtectedSandApp.s("\ue798"), 9, Object.class, Object.class, null);
        zzj = zzadvVar10;
        zzk = new zzadv[]{zzadvVar, zzadvVar2, zzadvVar3, zzadvVar4, zzadvVar5, zzadvVar6, zzadvVar7, zzadvVar8, zzadvVar9, zzadvVar10};
    }

    private zzadv(String str, int i4, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzadv[] values() {
        return (zzadv[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
