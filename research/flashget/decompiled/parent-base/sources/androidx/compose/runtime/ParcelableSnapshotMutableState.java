package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ParcelableSnapshotMutableState.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/l4;", "Landroid/os/Parcelable;", "value", "Landroidx/compose/runtime/m4;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/m4;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
@androidx.compose.runtime.internal.u(parameters = 2)
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends l4<T> implements Parcelable {

    /* renamed from: h, reason: collision with root package name */
    public static final int f15891h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static final int f15892i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f15893j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f15894k = 2;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    @kd.f
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableState.android.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "Landroid/os/Parcel;", "parcel", "Ljava/lang/ClassLoader;", "loader", "b", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "a", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "size", "", "c", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        a() {
        }

        @fg.l
        public ParcelableSnapshotMutableState<Object> a(@fg.l Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState<Object> createFromParcel(@fg.l Parcel parcel, @fg.m ClassLoader loader) {
            m4 a5;
            if (loader == null) {
                loader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(loader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                a5 = s4.a();
            } else if (readInt == 1) {
                a5 = s4.c();
            } else {
                if (readInt != 2) {
                    throw new IllegalStateException(androidx.collection.r2.a("Unsupported MutableState policy ", readInt, " was restored"));
                }
                a5 = s4.b();
            }
            return new ParcelableSnapshotMutableState<>(readValue, a5);
        }

        @fg.l
        public ParcelableSnapshotMutableState<Object>[] c(int size) {
            return new ParcelableSnapshotMutableState[size];
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i4) {
            return new ParcelableSnapshotMutableState[i4];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }
    }

    /* compiled from: ParcelableSnapshotMutableState.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "a", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void a() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public ParcelableSnapshotMutableState(T t4, @fg.l m4<T> m4Var) {
        super(t4, m4Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@fg.l Parcel parcel, int flags) {
        int i4;
        parcel.writeValue(getValue());
        m4<T> e4 = e();
        if (kotlin.jvm.internal.l0.g(e4, s4.a())) {
            i4 = 0;
        } else if (kotlin.jvm.internal.l0.g(e4, s4.c())) {
            i4 = 1;
        } else {
            if (!kotlin.jvm.internal.l0.g(e4, s4.b())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i4 = 2;
        }
        parcel.writeInt(i4);
    }
}
