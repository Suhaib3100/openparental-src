package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "UvmEntriesCreator")
/* loaded from: classes5.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<UvmEntries> CREATOR = new zzbd();

    @q0
    @SafeParcelable.Field(getter = "getUvmEntryList", id = 1)
    private final List zza;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {
        private final List zza = new ArrayList();

        @o0
        public Builder addAll(@o0 List<UvmEntry> list) {
            zzbm.zzc(list.size() + this.zza.size() <= 3);
            this.zza.addAll(list);
            return this;
        }

        @o0
        public Builder addUvmEntry(@q0 UvmEntry uvmEntry) {
            if (this.zza.size() >= 3) {
                throw new IllegalStateException();
            }
            if (uvmEntry != null) {
                this.zza.add(uvmEntry);
            }
            return this;
        }

        @o0
        public UvmEntries build() {
            return new UvmEntries(this.zza);
        }
    }

    @SafeParcelable.Constructor
    UvmEntries(@q0 @SafeParcelable.Param(id = 1) List list) {
        this.zza = list;
    }

    public boolean equals(@q0 Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.zza;
        return (list2 == null && uvmEntries.zza == null) || (list2 != null && (list = uvmEntries.zza) != null && list2.containsAll(list) && uvmEntries.zza.containsAll(this.zza));
    }

    @q0
    public List<UvmEntry> getUvmEntryList() {
        return this.zza;
    }

    public int hashCode() {
        List list = this.zza;
        return Objects.hashCode(list == null ? null : new HashSet(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getUvmEntryList(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final JSONArray zza() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.zza != null) {
                for (int i4 = 0; i4 < this.zza.size(); i4++) {
                    UvmEntry uvmEntry = (UvmEntry) this.zza.get(i4);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray2.put((int) uvmEntry.getKeyProtectionType());
                    jSONArray2.put((int) uvmEntry.getMatcherProtectionType());
                    jSONArray.put(i4, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e4) {
            throw new RuntimeException(ProtectedSandApp.s("춬"), e4);
        }
    }
}
