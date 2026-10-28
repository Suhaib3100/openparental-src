package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzade {
    private static final zzade zzb = new zzade(true);
    final zzafp zza = new zzaff(16);
    private boolean zzc;
    private boolean zzd;

    private zzade() {
    }

    public static zzade zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzd(com.google.android.libraries.places.internal.zzadd r2, java.lang.Object r3) {
        /*
            com.google.android.libraries.places.internal.zzagi r0 = r2.zzb()
            com.google.android.libraries.places.internal.zzads.zze(r3)
            com.google.android.libraries.places.internal.zzagi r1 = com.google.android.libraries.places.internal.zzagi.zza
            com.google.android.libraries.places.internal.zzagj r1 = com.google.android.libraries.places.internal.zzagj.zza
            com.google.android.libraries.places.internal.zzagj r0 = r0.zza()
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
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzaer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzadw
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzadm
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r3 instanceof com.google.android.libraries.places.internal.zzacp
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
            com.google.android.libraries.places.internal.zzagi r2 = r2.zzb()
            com.google.android.libraries.places.internal.zzagj r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "\ue750"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzade.zzd(com.google.android.libraries.places.internal.zzadd, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzade zzadeVar = new zzade();
        for (int i4 = 0; i4 < this.zza.zzb(); i4++) {
            Map.Entry zzg = this.zza.zzg(i4);
            zzadeVar.zzc((zzadd) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzadeVar.zzc((zzadd) entry.getKey(), entry.getValue());
        }
        zzadeVar.zzd = this.zzd;
        return zzadeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzade) {
            return this.zza.equals(((zzade) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzadd zzaddVar, Object obj) {
        if (!zzaddVar.zzc()) {
            zzd(zzaddVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\ue751"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                zzd(zzaddVar, arrayList.get(i4));
            }
            obj = arrayList;
        }
        if (obj instanceof zzadw) {
            this.zzd = true;
        }
        this.zza.put(zzaddVar, obj);
    }

    private zzade(boolean z4) {
        zzb();
        zzb();
    }
}
