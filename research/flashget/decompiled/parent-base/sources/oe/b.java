package oe;

import android.os.Parcelable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

/* compiled from: parcelableCreator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/os/Parcelable;", "T", "Landroid/os/Parcelable$Creator;", "a", "()Landroid/os/Parcelable$Creator;", "parcelize-runtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    public static final <T extends Parcelable> Parcelable.Creator<T> a() {
        l0.P();
        Object obj = Parcelable.class.getDeclaredField(ProtectedSandApp.s("鸝\u0001")).get(null);
        Parcelable.Creator<T> creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : null;
        if (creator != null) {
            return creator;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鸞\u0001"));
        l0.P();
        sb.append(l1.d(Parcelable.class).W());
        throw new IllegalArgumentException(sb.toString());
    }
}
