package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: AnnotationDescriptor.kt */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: AnnotationDescriptor.kt */
    public static final class a {
        @d5.e
        public static kotlin.reflect.jvm.internal.impl.name.c a(@d5.d c cVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.e i5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
            if (i5 == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.types.error.k.m(i5)) {
                i5 = null;
            }
            if (i5 != null) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(i5);
            }
            return null;
        }
    }

    @d5.d
    Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a();

    @d5.e
    kotlin.reflect.jvm.internal.impl.name.c f();

    @d5.d
    h0 getType();

    @d5.d
    a1 k();
}
