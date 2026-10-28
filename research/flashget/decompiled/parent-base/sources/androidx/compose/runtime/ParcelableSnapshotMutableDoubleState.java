package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ParcelableSnapshotMutableDoubleState.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Landroidx/compose/runtime/h4;", "Landroid/os/Parcelable;", "", "value", "<init>", "(D)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "f", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableDoubleState extends h4 implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    public static final int f15883g = 0;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    @kd.f
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableDoubleState.android.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableDoubleState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "", "size", "", "b", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableDoubleState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableDoubleState createFromParcel(@fg.l Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        @fg.l
        public ParcelableSnapshotMutableDoubleState[] b(int size) {
            return new ParcelableSnapshotMutableDoubleState[size];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableDoubleState[] newArray(int i4) {
            return new ParcelableSnapshotMutableDoubleState[i4];
        }
    }

    /* compiled from: ParcelableSnapshotMutableDoubleState.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void a() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public ParcelableSnapshotMutableDoubleState(double d5) {
        super(d5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@fg.l Parcel parcel, int flags) {
        parcel.writeDouble(d());
    }
}
