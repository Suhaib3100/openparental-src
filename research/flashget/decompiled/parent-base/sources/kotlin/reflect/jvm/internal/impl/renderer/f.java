package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Set;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public interface f {

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public static boolean a(@fg.l f fVar) {
            return fVar.k().getIncludeAnnotationArguments();
        }

        public static boolean b(@fg.l f fVar) {
            return fVar.k().getIncludeEmptyAnnotationArguments();
        }
    }

    void a(boolean z4);

    void b(@fg.l k kVar);

    void c(boolean z4);

    boolean d();

    void e(boolean z4);

    void f(boolean z4);

    void g(@fg.l m mVar);

    void h(@fg.l kotlin.reflect.jvm.internal.impl.renderer.a aVar);

    @fg.l
    Set<kotlin.reflect.jvm.internal.impl.name.c> i();

    boolean j();

    @fg.l
    kotlin.reflect.jvm.internal.impl.renderer.a k();

    void l(@fg.l Set<kotlin.reflect.jvm.internal.impl.name.c> set);

    void m(@fg.l Set<? extends e> set);

    void n(boolean z4);

    void o(@fg.l b bVar);

    void p(boolean z4);

    void q(boolean z4);

    void r(boolean z4);
}
