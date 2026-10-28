package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractMap;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzih extends zzhs {
    final /* synthetic */ zzii zza;

    zzih(zzii zziiVar) {
        this.zza = zziiVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        int i5;
        Object[] objArr;
        Object[] objArr2;
        i5 = this.zza.zzc;
        zzha.zza(i4, i5, ProtectedSandApp.s("\ue9e4"));
        zzii zziiVar = this.zza;
        int i6 = i4 + i4;
        objArr = zziiVar.zzb;
        Object obj = objArr[i6];
        obj.getClass();
        objArr2 = zziiVar.zzb;
        Object obj2 = objArr2[i6 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i4;
        i4 = this.zza.zzc;
        return i4;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final boolean zzf() {
        return true;
    }
}
