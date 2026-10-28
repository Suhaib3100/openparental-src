package androidx.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavBackStackEntryState.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010(\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b$\u0010'¨\u0006+"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroidx/navigation/s;", "entry", "<init>", "(Landroidx/navigation/s;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Landroidx/navigation/f0;", "destination", "Landroidx/lifecycle/w$b;", "hostLifecycleState", "Landroidx/navigation/w;", "viewModel", "e", "(Landroid/content/Context;Landroidx/navigation/f0;Landroidx/lifecycle/w$b;Landroidx/navigation/w;)Landroidx/navigation/s;", "", "describeContents", "()I", "parcel", "i", "Lkotlin/k2;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "I", "destinationId", "Landroid/os/Bundle;", "d", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "args", "savedState", "f", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class NavBackStackEntryState implements Parcelable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final Bundle args;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final Bundle savedState;

    @l
    @f
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();

    /* compiled from: NavBackStackEntryState.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/navigation/NavBackStackEntryState$a", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Landroidx/navigation/NavBackStackEntryState;", "", "size", "", "b", "(I)[Landroidx/navigation/NavBackStackEntryState;", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavBackStackEntryState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavBackStackEntryState createFromParcel(@l Parcel inParcel) {
            l0.p(inParcel, "inParcel");
            return new NavBackStackEntryState(inParcel);
        }

        @l
        public NavBackStackEntryState[] b(int size) {
            return new NavBackStackEntryState[size];
        }

        @Override // android.os.Parcelable.Creator
        public NavBackStackEntryState[] newArray(int i4) {
            return new NavBackStackEntryState[i4];
        }
    }

    public NavBackStackEntryState(@l s entry) {
        l0.p(entry, "entry");
        this.id = entry.getId();
        this.destinationId = entry.getDestination().getId();
        this.args = entry.getArguments();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.k(bundle);
    }

    @m
    /* renamed from: a, reason: from getter */
    public final Bundle getArgs() {
        return this.args;
    }

    /* renamed from: b, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final s e(@l Context context, @l f0 destination, @l AbstractC1450w.b hostLifecycleState, @m w viewModel) {
        l0.p(context, "context");
        l0.p(destination, "destination");
        l0.p(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle == null) {
            bundle = null;
        } else {
            bundle.setClassLoader(context.getClassLoader());
        }
        return s.INSTANCE.a(context, destination, bundle, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i4) {
        l0.p(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public NavBackStackEntryState(@l Parcel inParcel) {
        l0.p(inParcel, "inParcel");
        String readString = inParcel.readString();
        l0.m(readString);
        l0.o(readString, "inParcel.readString()!!");
        this.id = readString;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        l0.m(readBundle);
        l0.o(readBundle, "inParcel.readBundle(javaClass.classLoader)!!");
        this.savedState = readBundle;
    }
}
