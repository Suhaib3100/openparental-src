package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;

/* compiled from: JvmNameResolver.kt */
/* loaded from: classes7.dex */
public final class h {
    @l
    public static final List<a.e.c> a(@l List<a.e.c> list) {
        l0.p(list, ProtectedSandApp.s("病\u0001"));
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (a.e.c cVar : list) {
            int H = cVar.H();
            for (int i4 = 0; i4 < H; i4++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
