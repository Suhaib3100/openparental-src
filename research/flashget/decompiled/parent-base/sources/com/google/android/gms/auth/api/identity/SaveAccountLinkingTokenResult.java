package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "SaveAccountLinkingTokenResultCreator")
/* loaded from: classes5.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new zbr();

    @q0
    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zba;

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenResult(@q0 @SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zba = pendingIntent;
    }

    public boolean equals(@q0 Object obj) {
        if (obj instanceof SaveAccountLinkingTokenResult) {
            return Objects.equal(this.zba, ((SaveAccountLinkingTokenResult) obj).zba);
        }
        return false;
    }

    @q0
    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public boolean hasResolution() {
        return this.zba != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
