package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.r;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: LazyJavaStaticScope.kt */
/* loaded from: classes6.dex */
public abstract class m extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, null, 2, 0 == true ? 1 : 0);
        l0.p(gVar, ProtectedSandApp.s("蔢"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.e
    protected x0 A() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @d5.d
    protected j.a I(@d5.d r rVar, @d5.d List<? extends f1> list, @d5.d h0 h0Var, @d5.d List<? extends j1> list2) {
        l0.p(rVar, ProtectedSandApp.s("蔣"));
        l0.p(list, ProtectedSandApp.s("蔤"));
        l0.p(h0Var, ProtectedSandApp.s("蔥"));
        l0.p(list2, ProtectedSandApp.s("蔦"));
        return new j.a(h0Var, null, list2, list, false, EmptyList.f23167o);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void t(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<u0> collection) {
        l0.p(fVar, ProtectedSandApp.s("蔧"));
        l0.p(collection, ProtectedSandApp.s("蔨"));
    }
}
