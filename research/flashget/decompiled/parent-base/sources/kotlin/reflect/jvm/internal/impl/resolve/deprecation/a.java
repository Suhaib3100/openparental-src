package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;

/* compiled from: DeprecationInfo.kt */
/* loaded from: classes7.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@l a aVar) {
        l0.p(aVar, ProtectedSandApp.s("烿\u0001"));
        int compareTo = b().compareTo(aVar.b());
        if (compareTo == 0 && !c() && aVar.c()) {
            return 1;
        }
        return compareTo;
    }

    @l
    public abstract b b();

    public abstract boolean c();
}
