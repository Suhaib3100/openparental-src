package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: mappingUtil.kt */
/* loaded from: classes5.dex */
public final class l {
    @d5.d
    public static final i1 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        int b02;
        int b03;
        List i6;
        Map B0;
        l0.p(eVar, ProtectedSandApp.s("䘕"));
        l0.p(eVar2, ProtectedSandApp.s("䘖"));
        eVar.G().size();
        eVar2.G().size();
        i1.a aVar = i1.f26482c;
        List<f1> G = eVar.G();
        l0.o(G, ProtectedSandApp.s("䘗"));
        b02 = b0.b0(G, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = G.iterator();
        while (it.hasNext()) {
            arrayList.add(((f1) it.next()).m());
        }
        List<f1> G2 = eVar2.G();
        l0.o(G2, ProtectedSandApp.s("䘘"));
        b03 = b0.b0(G2, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator<T> it2 = G2.iterator();
        while (it2.hasNext()) {
            p0 E = ((f1) it2.next()).E();
            l0.o(E, ProtectedSandApp.s("䘙"));
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(E));
        }
        i6 = j0.i6(arrayList, arrayList2);
        B0 = kotlin.collections.f1.B0(i6);
        return i1.a.e(aVar, B0, false, 2, null);
    }
}
