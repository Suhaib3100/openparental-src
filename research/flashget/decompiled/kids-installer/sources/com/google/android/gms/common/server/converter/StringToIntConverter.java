package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
/* loaded from: classes3.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @o0
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap<String, Integer> zab;
    private final SparseArray<String> zac;

    @KeepForSdk
    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap<>();
        this.zac = new SparseArray<>();
    }

    @o0
    @KeepForSdk
    public StringToIntConverter add(@o0 String str, int i5) {
        this.zab.put(str, Integer.valueOf(i5));
        this.zac.put(i5, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i5) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, this.zab.get(str).intValue()));
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
    public final /* bridge */ /* synthetic */ Integer zac(@o0 String str) {
        Integer num = this.zab.get(str);
        return num == null ? this.zab.get(ProtectedSandApp.s("≰")) : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @o0
    public final /* bridge */ /* synthetic */ String zad(@o0 Integer num) {
        String str = this.zac.get(num.intValue());
        if (str == null) {
            HashMap<String, Integer> hashMap = this.zab;
            String s5 = ProtectedSandApp.s("≱");
            if (hashMap.containsKey(s5)) {
                return s5;
            }
        }
        return str;
    }

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(id = 1) int i5, @SafeParcelable.Param(id = 2) ArrayList<zac> arrayList) {
        this.zaa = i5;
        this.zab = new HashMap<>();
        this.zac = new SparseArray<>();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            zac zacVar = arrayList.get(i6);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
