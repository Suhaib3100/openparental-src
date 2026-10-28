package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeParameterDescriptor.java */
/* loaded from: classes7.dex */
public interface f1 extends h, ce.o {
    @fg.l
    kotlin.reflect.jvm.internal.impl.storage.n P();

    boolean U();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h, kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    f1 a();

    int getIndex();

    @fg.l
    List<kotlin.reflect.jvm.internal.impl.types.h0> getUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h
    @fg.l
    kotlin.reflect.jvm.internal.impl.types.h1 j();

    boolean l();

    @fg.l
    x1 o();
}
