package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzfh extends zzfl {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ zzfh(zzfg zzfgVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) zzhj.zzf(obj, j4);
        if (list instanceof zzff) {
            unmodifiableList = ((zzff) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzge) && (list instanceof zzez)) {
                zzez zzezVar = (zzez) list;
                if (zzezVar.zzc()) {
                    zzezVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhj.zzp(obj, j4, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(Object obj, Object obj2, long j4) {
        zzfe zzfeVar;
        List list = (List) zzhj.zzf(obj2, j4);
        int size = list.size();
        List list2 = (List) zzhj.zzf(obj, j4);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzff ? new zzfe(size) : ((list2 instanceof zzge) && (list2 instanceof zzez)) ? ((zzez) list2).zzd(size) : new ArrayList(size);
            zzhj.zzp(obj, j4, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzhj.zzp(obj, j4, arrayList);
                zzfeVar = arrayList;
            } else if (list2 instanceof zzhe) {
                zzfe zzfeVar2 = new zzfe(list2.size() + size);
                zzfeVar2.addAll(zzfeVar2.size(), (zzhe) list2);
                zzhj.zzp(obj, j4, zzfeVar2);
                zzfeVar = zzfeVar2;
            } else if ((list2 instanceof zzge) && (list2 instanceof zzez)) {
                zzez zzezVar = (zzez) list2;
                if (!zzezVar.zzc()) {
                    list2 = zzezVar.zzd(list2.size() + size);
                    zzhj.zzp(obj, j4, list2);
                }
            }
            list2 = zzfeVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzhj.zzp(obj, j4, list);
    }

    private zzfh() {
        super(null);
    }
}
