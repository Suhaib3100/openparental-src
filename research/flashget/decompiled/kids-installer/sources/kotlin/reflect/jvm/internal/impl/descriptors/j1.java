package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: ValueParameterDescriptor.kt */
/* loaded from: classes6.dex */
public interface j1 extends r0, l1 {

    /* compiled from: ValueParameterDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static boolean a(@d5.d j1 j1Var) {
            return false;
        }
    }

    boolean B0();

    @d5.d
    j1 O0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, int i5);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    j1 a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    kotlin.reflect.jvm.internal.impl.descriptors.a b();

    boolean f0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @d5.d
    Collection<j1> g();

    int getIndex();

    boolean i0();

    @d5.e
    kotlin.reflect.jvm.internal.impl.types.h0 s0();
}
