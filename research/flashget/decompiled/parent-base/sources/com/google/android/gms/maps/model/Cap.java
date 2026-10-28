package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.b;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class Cap extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @q0
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @q0
    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;
    private static final String zza = ProtectedSandApp.s("\udabc");

    @o0
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();

    protected Cap(int i4) {
        this(i4, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @o0
    public String toString() {
        return b.a(new StringBuilder(ProtectedSandApp.s("\udabe")), this.zzb, ProtectedSandApp.s("\udabf"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i5);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final Cap zza() {
        int i4 = this.zzb;
        if (i4 == 0) {
            return new ButtCap();
        }
        if (i4 == 1) {
            return new SquareCap();
        }
        if (i4 == 2) {
            return new RoundCap();
        }
        if (i4 != 3) {
            return this;
        }
        Preconditions.checkState(this.zzc != null, ProtectedSandApp.s("\udac0"));
        Preconditions.checkState(this.zzd != null, ProtectedSandApp.s("\udac1"));
        return new CustomCap(this.zzc, this.zzd.floatValue());
    }

    @SafeParcelable.Constructor
    Cap(@SafeParcelable.Param(id = 2) int i4, @q0 @SafeParcelable.Param(id = 3) IBinder iBinder, @q0 @SafeParcelable.Param(id = 4) Float f4) {
        this(i4, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f4);
    }

    private Cap(int i4, @q0 BitmapDescriptor bitmapDescriptor, @q0 Float f4) {
        boolean z4 = f4 != null && f4.floatValue() > 0.0f;
        if (i4 == 3) {
            r0 = bitmapDescriptor != null && z4;
            i4 = 3;
        }
        Preconditions.checkArgument(r0, String.format(ProtectedSandApp.s("\udabd"), Integer.valueOf(i4), bitmapDescriptor, f4));
        this.zzb = i4;
        this.zzc = bitmapDescriptor;
        this.zzd = f4;
    }

    protected Cap(@o0 BitmapDescriptor bitmapDescriptor, float f4) {
        this(3, bitmapDescriptor, Float.valueOf(f4));
    }
}
