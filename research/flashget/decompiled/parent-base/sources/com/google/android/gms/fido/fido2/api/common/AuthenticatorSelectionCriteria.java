package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();

    @q0
    @SafeParcelable.Field(getter = "getAttachmentAsString", id = 2, type = "java.lang.String")
    private final Attachment zza;

    @q0
    @SafeParcelable.Field(getter = "getRequireResidentKey", id = 3)
    private final Boolean zzb;

    @q0
    @SafeParcelable.Field(getter = "getRequireUserVerificationAsString", id = 4, type = "java.lang.String")
    private final UserVerificationRequirement zzc;

    @q0
    @SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", id = 5, type = "java.lang.String")
    private final ResidentKeyRequirement zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class Builder {

        @q0
        private Attachment zza;

        @q0
        private Boolean zzb;

        @q0
        private ResidentKeyRequirement zzc;

        @o0
        public AuthenticatorSelectionCriteria build() {
            Attachment attachment = this.zza;
            String attachment2 = attachment == null ? null : attachment.toString();
            Boolean bool = this.zzb;
            ResidentKeyRequirement residentKeyRequirement = this.zzc;
            return new AuthenticatorSelectionCriteria(attachment2, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        @o0
        public Builder setAttachment(@q0 Attachment attachment) {
            this.zza = attachment;
            return this;
        }

        @o0
        public Builder setRequireResidentKey(@q0 Boolean bool) {
            this.zzb = bool;
            return this;
        }

        @o0
        public Builder setResidentKeyRequirement(@q0 ResidentKeyRequirement residentKeyRequirement) {
            this.zzc = residentKeyRequirement;
            return this;
        }
    }

    @SafeParcelable.Constructor
    AuthenticatorSelectionCriteria(@q0 @SafeParcelable.Param(id = 2) String str, @q0 @SafeParcelable.Param(id = 3) Boolean bool, @q0 @SafeParcelable.Param(id = 4) String str2, @q0 @SafeParcelable.Param(id = 5) String str3) {
        Attachment fromString;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e4) {
                throw new IllegalArgumentException(e4);
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        this.zzc = str2 == null ? null : UserVerificationRequirement.fromString(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.fromString(str3);
        }
        this.zzd = residentKeyRequirement;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return Objects.equal(this.zza, authenticatorSelectionCriteria.zza) && Objects.equal(this.zzb, authenticatorSelectionCriteria.zzb) && Objects.equal(this.zzc, authenticatorSelectionCriteria.zzc) && Objects.equal(getResidentKeyRequirement(), authenticatorSelectionCriteria.getResidentKeyRequirement());
    }

    @q0
    public Attachment getAttachment() {
        return this.zza;
    }

    @q0
    public String getAttachmentAsString() {
        Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    @q0
    public Boolean getRequireResidentKey() {
        return this.zzb;
    }

    @q0
    public ResidentKeyRequirement getResidentKeyRequirement() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    @q0
    public String getResidentKeyRequirementAsString() {
        ResidentKeyRequirement residentKeyRequirement = getResidentKeyRequirement();
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, getResidentKeyRequirement());
    }

    @o0
    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(userVerificationRequirement);
        String valueOf3 = String.valueOf(residentKeyRequirement);
        StringBuilder a5 = g.a(ProtectedSandApp.s("쳽"), valueOf, ProtectedSandApp.s("쳾"));
        a5.append(this.zzb);
        a5.append(ProtectedSandApp.s("쳿"));
        a5.append(valueOf2);
        a5.append(ProtectedSandApp.s("촀"));
        return c.a(a5, valueOf3, ProtectedSandApp.s("촁"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        SafeParcelWriter.writeString(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
