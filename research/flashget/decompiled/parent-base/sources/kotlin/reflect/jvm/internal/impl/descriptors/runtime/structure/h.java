package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* loaded from: classes7.dex */
public interface h extends wd.d {
    @Override // wd.d
    @fg.l
    List<e> getAnnotations();

    @fg.m
    AnnotatedElement getElement();

    @Override // wd.d
    @fg.m
    e k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);
}
