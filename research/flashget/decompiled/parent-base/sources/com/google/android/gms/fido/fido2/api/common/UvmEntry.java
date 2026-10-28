package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "UvmEntryCreator")
/* loaded from: classes5.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<UvmEntry> CREATOR = new zzbe();

    @SafeParcelable.Field(getter = "getUserVerificationMethod", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getKeyProtectionType", id = 2)
    private final short zzb;

    @SafeParcelable.Field(getter = "getMatcherProtectionType", id = 3)
    private final short zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {
        private int zza;
        private short zzb;
        private short zzc;

        @o0
        public UvmEntry build() {
            return new UvmEntry(this.zza, this.zzb, this.zzc);
        }

        @o0
        public Builder setKeyProtectionType(short s4) {
            this.zzb = s4;
            return this;
        }

        @o0
        public Builder setMatcherProtectionType(short s4) {
            this.zzc = s4;
            return this;
        }

        @o0
        public Builder setUserVerificationMethod(int i4) {
            this.zza = i4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    UvmEntry(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) short s4, @SafeParcelable.Param(id = 3) short s5) {
        this.zza = i4;
        this.zzb = s4;
        this.zzc = s5;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.zza == uvmEntry.zza && this.zzb == uvmEntry.zzb && this.zzc == uvmEntry.zzc;
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getUserVerificationMethod());
        SafeParcelWriter.writeShort(parcel, 2, getKeyProtectionType());
        SafeParcelWriter.writeShort(parcel, 3, getMatcherProtectionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
