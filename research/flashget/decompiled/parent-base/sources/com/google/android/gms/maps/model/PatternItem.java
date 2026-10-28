package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PatternItem extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @q0
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;
    private static final String zza = ProtectedSandApp.s("\udad2");

    @o0
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzm();

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i4, @q0 @SafeParcelable.Param(id = 3) Float f4) {
        boolean z4 = true;
        if (i4 != 1 && (f4 == null || f4.floatValue() < 0.0f)) {
            z4 = false;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("\udad3") + i4 + ProtectedSandApp.s("\udad4") + f4);
        this.zzb = i4;
        this.zzc = f4;
    }

    @q0
    static List zza(@q0 List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem patternItem = (PatternItem) it.next();
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i4 = patternItem.zzb;
                String s4 = ProtectedSandApp.s("\udad5");
                if (i4 == 0) {
                    Preconditions.checkState(patternItem.zzc != null, s4);
                    dash = new Dash(patternItem.zzc.floatValue());
                } else if (i4 == 1) {
                    patternItem = new Dot();
                } else if (i4 == 2) {
                    Preconditions.checkState(patternItem.zzc != null, s4);
                    dash = new Gap(patternItem.zzc.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("\udad6") + this.zzb + ProtectedSandApp.s("\udad4") + this.zzc + ProtectedSandApp.s("\udad7");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i5);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
