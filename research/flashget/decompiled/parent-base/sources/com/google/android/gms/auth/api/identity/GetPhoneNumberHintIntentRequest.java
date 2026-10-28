package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "GetPhoneNumberHintIntentRequestCreator")
/* loaded from: classes5.dex */
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new zbk();

    @SafeParcelable.Field(getter = "getTheme", id = 1)
    private final int zba;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class Builder {
        private Builder() {
            throw null;
        }

        @o0
        public GetPhoneNumberHintIntentRequest build() {
            return new GetPhoneNumberHintIntentRequest(0);
        }

        /* synthetic */ Builder(zbj zbjVar) {
        }
    }

    @SafeParcelable.Constructor
    GetPhoneNumberHintIntentRequest(@SafeParcelable.Param(id = 1) int i4) {
        this.zba = i4;
    }

    @o0
    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(@q0 Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return Objects.equal(Integer.valueOf(this.zba), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).zba));
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zba));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
