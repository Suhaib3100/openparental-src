package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public static boolean a(@d5.d f fVar) {
            return fVar.q().getIncludeAnnotationArguments();
        }

        public static boolean b(@d5.d f fVar) {
            return fVar.q().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(@d5.d Set<kotlin.reflect.jvm.internal.impl.name.c> set);

    void b(boolean z5);

    void c(@d5.d Set<? extends e> set);

    void d(@d5.d k kVar);

    void e(boolean z5);

    void f(boolean z5);

    boolean g();

    void h(@d5.d b bVar);

    void i(boolean z5);

    void j(boolean z5);

    void k(boolean z5);

    void l(boolean z5);

    void m(@d5.d m mVar);

    void n(@d5.d kotlin.reflect.jvm.internal.impl.renderer.a aVar);

    @d5.d
    Set<kotlin.reflect.jvm.internal.impl.name.c> o();

    boolean p();

    @d5.d
    kotlin.reflect.jvm.internal.impl.renderer.a q();

    void r(boolean z5);
}
