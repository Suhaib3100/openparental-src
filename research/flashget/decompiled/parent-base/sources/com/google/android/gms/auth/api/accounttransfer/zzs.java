package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.q0;
import androidx.collection.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes5.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    private static final a zzb;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List zzc;

    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List zzd;

    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List zze;

    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List zzf;

    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List zzg;

    static {
        a aVar = new a();
        zzb = aVar;
        String s4 = ProtectedSandApp.s("잟");
        aVar.put(s4, FastJsonResponse.Field.forStrings(s4, 2));
        String s5 = ProtectedSandApp.s("잠");
        aVar.put(s5, FastJsonResponse.Field.forStrings(s5, 3));
        String s6 = ProtectedSandApp.s("잡");
        aVar.put(s6, FastJsonResponse.Field.forStrings(s6, 4));
        String s7 = ProtectedSandApp.s("잢");
        aVar.put(s7, FastJsonResponse.Field.forStrings(s7, 5));
        String s10 = ProtectedSandApp.s("잣");
        aVar.put(s10, FastJsonResponse.Field.forStrings(s10, 6));
    }

    public zzs() {
        this.zza = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException(android.support.v4.media.a.a(ProtectedSandApp.s("잤"), field.getSafeParcelableFieldId()));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzc = arrayList;
            return;
        }
        if (safeParcelableFieldId == 3) {
            this.zzd = arrayList;
            return;
        }
        if (safeParcelableFieldId == 4) {
            this.zze = arrayList;
            return;
        }
        if (safeParcelableFieldId == 5) {
            this.zzf = arrayList;
        } else if (safeParcelableFieldId == 6) {
            this.zzg = arrayList;
        } else {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("장"), Integer.valueOf(safeParcelableFieldId)));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    zzs(@SafeParcelable.Param(id = 1) int i4, @q0 @SafeParcelable.Param(id = 2) List list, @q0 @SafeParcelable.Param(id = 3) List list2, @q0 @SafeParcelable.Param(id = 4) List list3, @q0 @SafeParcelable.Param(id = 5) List list4, @q0 @SafeParcelable.Param(id = 6) List list5) {
        this.zza = i4;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }
}
