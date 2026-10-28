package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.y;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.s1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* loaded from: classes6.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.descriptors.impl.b {

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.g f24761y;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private final y f24762z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar, @d5.d y yVar, int i5, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        super(gVar.e(), mVar, new kotlin.reflect.jvm.internal.impl.load.java.lazy.d(gVar, yVar, false, 4, null), yVar.getName(), x1.INVARIANT, false, i5, a1.f24103a, gVar.a().v());
        l0.p(gVar, ProtectedSandApp.s("蕙"));
        l0.p(yVar, ProtectedSandApp.s("蕚"));
        l0.p(mVar, ProtectedSandApp.s("蕛"));
        this.f24761y = gVar;
        this.f24762z = yVar;
    }

    private final List<h0> T0() {
        int b02;
        List<h0> k5;
        Collection<b4.j> upperBounds = this.f24762z.getUpperBounds();
        if (upperBounds.isEmpty()) {
            p0 i5 = this.f24761y.d().A().i();
            l0.o(i5, ProtectedSandApp.s("蕜"));
            p0 I = this.f24761y.d().A().I();
            l0.o(I, ProtectedSandApp.s("蕝"));
            k5 = z.k(i0.d(i5, I));
            return k5;
        }
        b02 = b0.b0(upperBounds, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f24761y.g().o((b4.j) it.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(s1.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @d5.d
    protected List<h0> M0(@d5.d List<? extends h0> list) {
        l0.p(list, ProtectedSandApp.s("蕞"));
        return this.f24761y.a().r().i(this, list, this.f24761y);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    protected void R0(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("蕟"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.e
    @d5.d
    protected List<h0> S0() {
        return T0();
    }
}
