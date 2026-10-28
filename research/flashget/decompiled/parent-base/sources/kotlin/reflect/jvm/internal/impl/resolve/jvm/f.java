package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import fg.l;
import java.util.Collection;
import java.util.List;
import kotlin.collections.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes7.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f77925a = a.f77926a;

    /* compiled from: SyntheticJavaPartsProvider.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f77926a = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        private static final kotlin.reflect.jvm.internal.impl.resolve.jvm.a f77927b = new kotlin.reflect.jvm.internal.impl.resolve.jvm.a(j0.f74919b);

        private a() {
        }

        @l
        public final kotlin.reflect.jvm.internal.impl.resolve.jvm.a a() {
            return f77927b;
        }
    }

    void a(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l List<kotlin.reflect.jvm.internal.impl.descriptors.d> list);

    void b(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l Collection<z0> collection);

    void c(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l Collection<z0> collection);

    void d(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l List<kotlin.reflect.jvm.internal.impl.descriptors.e> list);

    @l
    List<kotlin.reflect.jvm.internal.impl.name.f> e(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @l
    List<kotlin.reflect.jvm.internal.impl.name.f> f(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @l
    List<kotlin.reflect.jvm.internal.impl.name.f> g(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar);

    @l
    c0 h(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l c0 c0Var);
}
