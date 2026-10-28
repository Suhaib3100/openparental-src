package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.Class(creator = "BeginSignInResultCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zbh();

    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zba;

    @SafeParcelable.Constructor
    public BeginSignInResult(@SafeParcelable.Param(id = 1) @o0 PendingIntent pendingIntent) {
        this.zba = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    @o0
    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
