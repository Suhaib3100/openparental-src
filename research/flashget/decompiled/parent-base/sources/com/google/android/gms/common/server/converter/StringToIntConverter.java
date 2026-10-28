package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import f9.a;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
/* loaded from: classes5.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @o0
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    @KeepForSdk
    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = new SparseArray();
    }

    @o0
    @KeepForSdk
    @a
    public StringToIntConverter add(@o0 String str, int i4) {
        this.zab.put(str, Integer.valueOf(i4));
        this.zac.put(i4, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.zab.get(str)).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @q0
    public final /* bridge */ /* synthetic */ Object zac(@o0 Object obj) {
        Integer num = (Integer) this.zab.get((String) obj);
        return num == null ? (Integer) this.zab.get(ProtectedSandApp.s("쭺")) : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @o0
    public final /* bridge */ /* synthetic */ Object zad(@o0 Object obj) {
        String str = (String) this.zac.get(((Integer) obj).intValue());
        if (str == null) {
            HashMap hashMap = this.zab;
            String s4 = ProtectedSandApp.s("쭺");
            if (hashMap.containsKey(s4)) {
                return s4;
            }
        }
        return str;
    }

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) ArrayList arrayList) {
        this.zaa = i4;
        this.zab = new HashMap();
        this.zac = new SparseArray();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zac zacVar = (zac) arrayList.get(i5);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
