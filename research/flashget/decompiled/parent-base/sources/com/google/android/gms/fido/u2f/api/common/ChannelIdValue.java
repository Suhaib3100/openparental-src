package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "ChannelIdValueCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes5.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getTypeAsInt", id = 2, type = "int")
    private final ChannelIdValueType zza;

    @SafeParcelable.Field(getter = "getStringValue", id = 3)
    private final String zzb;

    @SafeParcelable.Field(getter = "getObjectValueAsString", id = 4)
    private final String zzc;

    @o0
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();

    @o0
    public static final ChannelIdValue ABSENT = new ChannelIdValue();

    @o0
    public static final ChannelIdValue UNAVAILABLE = new ChannelIdValue(ProtectedSandApp.s("췎"));

    @o0
    public static final ChannelIdValue UNUSED = new ChannelIdValue(ProtectedSandApp.s("췏"));

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @o0
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new zza();
        private final int zzb;

        ChannelIdValueType(int i4) {
            this.zzb = i4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            parcel.writeInt(this.zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedChannelIdValueTypeException extends Exception {
        public UnsupportedChannelIdValueTypeException(int i4) {
            super(String.format(ProtectedSandApp.s("췍"), Integer.valueOf(i4)));
        }
    }

    private ChannelIdValue() {
        this.zza = ChannelIdValueType.ABSENT;
        this.zzc = null;
        this.zzb = null;
    }

    @o0
    public static ChannelIdValueType toChannelIdValueType(int i4) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i4 == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(i4);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        if (!this.zza.equals(channelIdValue.zza)) {
            return false;
        }
        int ordinal = this.zza.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.zzb.equals(channelIdValue.zzb);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.zzc.equals(channelIdValue.zzc);
    }

    @o0
    public JSONObject getObjectValue() {
        if (this.zzc == null) {
            return null;
        }
        try {
            return new JSONObject(this.zzc);
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public String getObjectValueAsString() {
        return this.zzc;
    }

    @o0
    public String getStringValue() {
        return this.zzb;
    }

    @o0
    public ChannelIdValueType getType() {
        return this.zza;
    }

    public int getTypeAsInt() {
        return this.zza.zzb;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = this.zza.hashCode() + 31;
        int ordinal = this.zza.ordinal();
        if (ordinal == 1) {
            i4 = hashCode2 * 31;
            hashCode = this.zzb.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i4 = hashCode2 * 31;
            hashCode = this.zzc.hashCode();
        }
        return hashCode + i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getTypeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getStringValue(), false);
        SafeParcelWriter.writeString(parcel, 4, getObjectValueAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    ChannelIdValue(@SafeParcelable.Param(id = 2) int i4, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2) {
        try {
            this.zza = toChannelIdValueType(i4);
            this.zzb = str;
            this.zzc = str2;
        } catch (UnsupportedChannelIdValueTypeException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    private ChannelIdValue(String str) {
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zza = ChannelIdValueType.STRING;
        this.zzc = null;
    }

    public ChannelIdValue(@o0 JSONObject jSONObject) {
        this.zzc = (String) Preconditions.checkNotNull(jSONObject.toString());
        this.zza = ChannelIdValueType.OBJECT;
        this.zzb = null;
    }
}
