package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: DeprecationInfo.kt */
/* loaded from: classes5.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(@d5.d a aVar) {
        l0.p(aVar, ProtectedSandApp.s("凂"));
        int compareTo = h().compareTo(aVar.h());
        if (compareTo == 0 && !j() && aVar.j()) {
            return 1;
        }
        return compareTo;
    }

    @d5.d
    public abstract b h();

    public abstract boolean j();
}
