package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaeb extends zzaef {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ zzaeb(zzaea zzaeaVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzaef
    final void zza(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) zzagd.zzf(obj, j4);
        if (list instanceof zzadz) {
            unmodifiableList = ((zzadz) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzaey) && (list instanceof zzadr)) {
                zzadr zzadrVar = (zzadr) list;
                if (zzadrVar.zzc()) {
                    zzadrVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzagd.zzs(obj, j4, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzaef
    final void zzb(Object obj, Object obj2, long j4) {
        zzady zzadyVar;
        List list = (List) zzagd.zzf(obj2, j4);
        int size = list.size();
        List list2 = (List) zzagd.zzf(obj, j4);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzadz ? new zzady(size) : ((list2 instanceof zzaey) && (list2 instanceof zzadr)) ? ((zzadr) list2).zzf(size) : new ArrayList(size);
            zzagd.zzs(obj, j4, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzagd.zzs(obj, j4, arrayList);
                zzadyVar = arrayList;
            } else if (list2 instanceof zzafy) {
                zzady zzadyVar2 = new zzady(list2.size() + size);
                zzadyVar2.addAll(zzadyVar2.size(), (zzafy) list2);
                zzagd.zzs(obj, j4, zzadyVar2);
                zzadyVar = zzadyVar2;
            } else if ((list2 instanceof zzaey) && (list2 instanceof zzadr)) {
                zzadr zzadrVar = (zzadr) list2;
                if (!zzadrVar.zzc()) {
                    list2 = zzadrVar.zzf(list2.size() + size);
                    zzagd.zzs(obj, j4, list2);
                }
            }
            list2 = zzadyVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzagd.zzs(obj, j4, list);
    }

    private zzaeb() {
        super(null);
    }
}
