package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.q1;

/* compiled from: PropertyDescriptor.java */
/* loaded from: classes7.dex */
public interface u0 extends b, m1 {
    @fg.l
    List<t0> D();

    @fg.m
    x T();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    u0 a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c1
    u0 d(@fg.l q1 q1Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    @fg.l
    Collection<? extends u0> e();

    @fg.m
    v0 getGetter();

    @fg.m
    w0 getSetter();

    @fg.m
    x y0();
}
