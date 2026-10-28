package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;

/* compiled from: CallableDescriptor.java */
/* loaded from: classes7.dex */
public interface a extends n, q, c1<a> {

    /* compiled from: CallableDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a$a, reason: collision with other inner class name */
    public interface InterfaceC1077a<V> {
    }

    @fg.m
    x0 O();

    @fg.m
    x0 S();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    a a();

    @fg.l
    Collection<? extends a> e();

    @fg.m
    kotlin.reflect.jvm.internal.impl.types.h0 getReturnType();

    @fg.l
    List<f1> getTypeParameters();

    @fg.l
    List<j1> i();

    boolean i0();

    @fg.m
    <V> V w0(InterfaceC1077a<V> interfaceC1077a);

    @fg.l
    List<x0> z0();
}
