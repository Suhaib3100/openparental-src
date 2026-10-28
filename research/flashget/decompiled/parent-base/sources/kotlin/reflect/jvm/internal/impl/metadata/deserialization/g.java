package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: TypeTable.kt */
@r1({"SMAP\nTypeTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1559#2:37\n1590#2,4:38\n*S KotlinDebug\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n*L\n26#1:37\n26#1:38,4\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final List<a.q> f77443a;

    public g(@l a.t tVar) {
        l0.p(tVar, ProtectedSandApp.s("町\u0001"));
        List<a.q> C = tVar.C();
        if (tVar.D()) {
            int x4 = tVar.x();
            List<a.q> C2 = tVar.C();
            l0.o(C2, ProtectedSandApp.s("画\u0001"));
            List<a.q> list = C2;
            ArrayList arrayList = new ArrayList(w.b0(list, 10));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    w.Z();
                }
                a.q qVar = (a.q) obj;
                if (i4 >= x4) {
                    qVar.getClass();
                    qVar = a.q.A0(qVar).c0(true).a();
                }
                arrayList.add(qVar);
                i4 = i5;
            }
            C = arrayList;
        }
        l0.o(C, ProtectedSandApp.s("甼\u0001"));
        this.f77443a = C;
    }

    @l
    public final a.q a(int i4) {
        return this.f77443a.get(i4);
    }
}
