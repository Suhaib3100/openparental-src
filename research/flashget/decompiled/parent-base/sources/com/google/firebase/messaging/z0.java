package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes6.dex */
public class z0 implements Parcelable.Creator<RemoteMessage> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60341a = 0;

    static void c(RemoteMessage remoteMessage, Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, remoteMessage.f59923b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    @androidx.annotation.q0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @androidx.annotation.q0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i4) {
        return new RemoteMessage[i4];
    }
}
