package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: ValueParameterDescriptor.kt */
/* loaded from: classes7.dex */
public interface j1 extends r0, l1 {

    /* compiled from: ValueParameterDescriptor.kt */
    public static final class a {
        public static boolean a(@fg.l j1 j1Var) {
            return false;
        }
    }

    boolean C0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    j1 a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i1, kotlin.reflect.jvm.internal.impl.descriptors.n, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    kotlin.reflect.jvm.internal.impl.descriptors.a c();

    @fg.l
    j1 c0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, int i4);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    Collection<j1> e();

    int getIndex();

    boolean r0();

    boolean t0();

    @fg.m
    kotlin.reflect.jvm.internal.impl.types.h0 x0();
}
