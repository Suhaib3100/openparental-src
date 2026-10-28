package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j;
import kotlin.reflect.jvm.internal.impl.types.h0;
import wd.r;

/* compiled from: LazyJavaStaticScope.kt */
/* loaded from: classes7.dex */
public abstract class m extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(@fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar) {
        super(gVar, null, 2, 0 == true ? 1 : 0);
        l0.p(gVar, ProtectedSandApp.s("熾\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.m
    protected x0 A() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    @fg.l
    protected j.a I(@fg.l r rVar, @fg.l List<? extends f1> list, @fg.l h0 h0Var, @fg.l List<? extends j1> list2) {
        l0.p(rVar, ProtectedSandApp.s("熿\u0001"));
        l0.p(list, ProtectedSandApp.s("燀\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("燁\u0001"));
        l0.p(list2, ProtectedSandApp.s("燂\u0001"));
        return new j.a(h0Var, null, list2, list, false, j0.f74919b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
    protected void t(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Collection<u0> collection) {
        l0.p(fVar, ProtectedSandApp.s("燃\u0001"));
        l0.p(collection, ProtectedSandApp.s("燄\u0001"));
    }
}
