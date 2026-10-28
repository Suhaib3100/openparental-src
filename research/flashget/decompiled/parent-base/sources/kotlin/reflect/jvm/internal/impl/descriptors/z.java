package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: FunctionDescriptor.java */
/* loaded from: classes7.dex */
public interface z extends b {

    /* compiled from: FunctionDescriptor.java */
    public interface a<D extends z> {
        @fg.m
        D a();

        @fg.l
        a<D> b();

        @fg.l
        a<D> c(@fg.l List<j1> list);

        @fg.l
        a<D> d(@fg.m x0 x0Var);

        @fg.l
        a<D> e();

        @fg.l
        a<D> f(@fg.m x0 x0Var);

        @fg.l
        a<D> g(@fg.l kotlin.reflect.jvm.internal.impl.types.o1 o1Var);

        @fg.l
        <V> a<D> h(@fg.l a.InterfaceC1077a<V> interfaceC1077a, V v4);

        @fg.l
        a<D> i(@fg.l u uVar);

        @fg.l
        a<D> j();

        @fg.l
        a<D> k(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

        @fg.l
        a<D> l(@fg.l e0 e0Var);

        @fg.l
        a<D> m();

        @fg.l
        a<D> n(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var);

        @fg.l
        a<D> o(@fg.m b bVar);

        @fg.l
        a<D> p(boolean z4);

        @fg.l
        a<D> q(@fg.l List<f1> list);

        @fg.l
        a<D> r(@fg.l m mVar);

        @fg.l
        a<D> s(@fg.l b.a aVar);

        @fg.l
        a<D> t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar);

        @fg.l
        a<D> u();
    }

    @fg.l
    a<? extends z> A();

    boolean B();

    boolean E0();

    boolean G();

    boolean H0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    z a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    m c();

    @fg.m
    z d(@fg.l q1 q1Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    Collection<? extends z> e();

    boolean isSuspend();

    boolean k();

    @fg.m
    z u0();

    boolean x();
}
