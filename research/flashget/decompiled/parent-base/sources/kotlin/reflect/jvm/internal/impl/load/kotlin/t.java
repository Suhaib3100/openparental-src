package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: KotlinJvmBinaryClass.kt */
/* loaded from: classes7.dex */
public interface t {

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface a {
        void a();

        void b(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar2);

        @fg.m
        a c(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar);

        void d(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2);

        void e(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.m Object obj);

        @fg.m
        b f(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface b {
        void a();

        @fg.m
        a b(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar);

        void c(@fg.m Object obj);

        void d(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

        void e(@fg.l kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface c {
        void a();

        @fg.m
        a c(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface d {
        @fg.m
        c a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l String str, @fg.m Object obj);

        @fg.m
        e b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l String str);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface e extends c {
        @fg.m
        a b(int i4, @fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, @fg.l a1 a1Var);
    }

    @fg.l
    String getLocation();

    @fg.l
    kotlin.reflect.jvm.internal.impl.name.b m();

    void n(@fg.l d dVar, @fg.m byte[] bArr);

    @fg.l
    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o();

    void p(@fg.l c cVar, @fg.m byte[] bArr);
}
