package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: FunctionDescriptor.java */
/* loaded from: classes6.dex */
public interface z extends b {

    /* compiled from: FunctionDescriptor.java */
    /* loaded from: classes5.dex */
    public interface a<D extends z> {
        @d5.d
        a<D> a();

        @d5.d
        a<D> b(@d5.d List<j1> list);

        @d5.e
        D build();

        @d5.d
        a<D> c(@d5.d e0 e0Var);

        @d5.d
        a<D> d(@d5.e x0 x0Var);

        @d5.d
        a<D> e();

        @d5.d
        a<D> f(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var);

        @d5.d
        a<D> g(@d5.e b bVar);

        @d5.d
        a<D> h();

        @d5.d
        a<D> i(boolean z5);

        @d5.d
        a<D> j(@d5.e x0 x0Var);

        @d5.d
        a<D> k(@d5.d kotlin.reflect.jvm.internal.impl.types.o1 o1Var);

        @d5.d
        a<D> l(@d5.d List<f1> list);

        @d5.d
        <V> a<D> m(@d5.d a.InterfaceC0274a<V> interfaceC0274a, V v5);

        @d5.d
        a<D> n(@d5.d u uVar);

        @d5.d
        a<D> o(@d5.d m mVar);

        @d5.d
        a<D> p();

        @d5.d
        a<D> q(@d5.d b.a aVar);

        @d5.d
        a<D> r(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar);

        @d5.d
        a<D> s(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);

        @d5.d
        a<D> t();
    }

    boolean B();

    boolean D0();

    @d5.d
    a<? extends z> F();

    boolean H();

    boolean J0();

    boolean X();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    z a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    m b();

    @d5.e
    z d(@d5.d q1 q1Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    Collection<? extends z> g();

    @d5.e
    z k0();

    boolean o();

    boolean p();
}
