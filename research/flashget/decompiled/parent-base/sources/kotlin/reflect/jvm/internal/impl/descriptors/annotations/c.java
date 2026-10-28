package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AnnotationDescriptor.kt */
/* loaded from: classes7.dex */
public interface c {

    /* compiled from: AnnotationDescriptor.kt */
    @r1({"SMAP\nAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDescriptor.kt\norg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    public static final class a {
        @fg.m
        public static kotlin.reflect.jvm.internal.impl.name.c a(@fg.l c cVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.e i4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
            if (i4 == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.types.error.k.m(i4)) {
                i4 = null;
            }
            if (i4 != null) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(i4);
            }
            return null;
        }
    }

    @fg.l
    Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a();

    @fg.l
    a1 f();

    @fg.m
    kotlin.reflect.jvm.internal.impl.name.c g();

    @fg.l
    h0 getType();
}
