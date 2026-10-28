package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: mappingUtil.kt */
@r1({"SMAP\nmappingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1549#2:25\n1620#2,3:26\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n*L\n20#1:25\n20#1:26,3\n21#1:29\n21#1:30,3\n*E\n"})
/* loaded from: classes7.dex */
public final class m {
    @fg.l
    public static final i1 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        l0.p(eVar, ProtectedSandApp.s("樳\u0001"));
        l0.p(eVar2, ProtectedSandApp.s("樴\u0001"));
        eVar.s().size();
        eVar2.s().size();
        i1.a aVar = i1.f78491c;
        List<f1> s4 = eVar.s();
        String s5 = ProtectedSandApp.s("樵\u0001");
        l0.o(s4, s5);
        List<f1> list = s4;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((f1) it.next()).j());
        }
        List<f1> s6 = eVar2.s();
        l0.o(s6, s5);
        List<f1> list2 = s6;
        ArrayList arrayList2 = new ArrayList(w.b0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            p0 r4 = ((f1) it2.next()).r();
            l0.o(r4, ProtectedSandApp.s("樶\u0001"));
            arrayList2.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.a(r4));
        }
        return i1.a.e(aVar, z0.B0(w.i6(arrayList, arrayList2)), false, 2, null);
    }
}
