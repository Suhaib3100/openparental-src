package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;

/* compiled from: JvmNameResolver.kt */
/* loaded from: classes5.dex */
public final class h {
    @d5.d
    public static final List<a.e.c> a(@d5.d List<a.e.c> list) {
        l0.p(list, ProtectedSandApp.s("丐"));
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (a.e.c cVar : list) {
            int G = cVar.G();
            for (int i5 = 0; i5 < G; i5++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
