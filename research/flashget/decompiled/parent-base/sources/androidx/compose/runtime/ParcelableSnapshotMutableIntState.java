package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ParcelableSnapshotMutableIntState.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroidx/compose/runtime/j4;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "f", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableIntState extends j4 implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    public static final int f15887g = 0;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    @kd.f
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableIntState.android.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableIntState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "", "size", "", "b", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableIntState createFromParcel(@fg.l Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        @fg.l
        public ParcelableSnapshotMutableIntState[] b(int size) {
            return new ParcelableSnapshotMutableIntState[size];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableIntState[] newArray(int i4) {
            return new ParcelableSnapshotMutableIntState[i4];
        }
    }

    /* compiled from: ParcelableSnapshotMutableIntState.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableIntState$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void a() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public ParcelableSnapshotMutableIntState(int i4) {
        super(i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@fg.l Parcel parcel, int flags) {
        parcel.writeInt(f());
    }
}
