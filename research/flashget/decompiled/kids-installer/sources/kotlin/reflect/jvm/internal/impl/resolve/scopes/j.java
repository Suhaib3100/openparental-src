package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.jvm.internal.l0;

/* compiled from: MemberScope.kt */
/* loaded from: classes5.dex */
public final class j {
    @d5.e
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> a(@d5.d Iterable<? extends h> iterable) {
        l0.p(iterable, ProtectedSandApp.s("卌"));
        HashSet hashSet = new HashSet();
        Iterator<? extends h> it = iterable.iterator();
        while (it.hasNext()) {
            Set<kotlin.reflect.jvm.internal.impl.name.f> f6 = it.next().f();
            if (f6 == null) {
                return null;
            }
            f0.q0(hashSet, f6);
        }
        return hashSet;
    }
}
