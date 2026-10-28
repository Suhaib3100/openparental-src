package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import wd.y;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
@r1({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1549#2:76\n1620#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
/* loaded from: classes7.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f76636l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private final y f76637m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @fg.l y yVar, int i4, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        super(gVar.e(), mVar, new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(gVar, yVar, false, 4, null), yVar.getName(), x1.INVARIANT, false, i4, a1.f75900a, gVar.a().v());
        l0.p(gVar, ProtectedSandApp.s("燰\u0001"));
        l0.p(yVar, ProtectedSandApp.s("燱\u0001"));
        l0.p(mVar, ProtectedSandApp.s("燲\u0001"));
        this.f76636l = gVar;
        this.f76637m = yVar;
    }

    private final List<h0> N0() {
        Collection<wd.j> upperBounds = this.f76637m.getUpperBounds();
        if (upperBounds.isEmpty()) {
            p0 i4 = this.f76636l.d().p().i();
            l0.o(i4, ProtectedSandApp.s("燳\u0001"));
            p0 I = this.f76636l.d().p().I();
            l0.o(I, ProtectedSandApp.s("燴\u0001"));
            return w.k(i0.d(i4, I));
        }
        Collection<wd.j> collection = upperBounds;
        ArrayList arrayList = new ArrayList(w.b0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f76636l.g().o((wd.j) it.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @fg.l
    protected List<h0> I0(@fg.l List<? extends h0> list) {
        l0.p(list, ProtectedSandApp.s("燵\u0001"));
        return this.f76636l.a().r().i(this, list, this.f76636l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    protected void L0(@fg.l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("燶\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @fg.l
    protected List<h0> M0() {
        return N0();
    }
}
