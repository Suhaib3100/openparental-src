package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.a1;

/* compiled from: KotlinJvmBinaryClass.kt */
/* loaded from: classes5.dex */
public interface r {

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface a {
        void a();

        void b(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar2);

        void c(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.e Object obj);

        void d(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar2);

        @d5.e
        a e(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar);

        @d5.e
        b f(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface b {
        void a();

        void b(@d5.e Object obj);

        void c(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);

        @d5.e
        a d(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar);

        void e(@d5.d kotlin.reflect.jvm.internal.impl.resolve.constants.f fVar);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface c {
        void a();

        @d5.e
        a b(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface d {
        @d5.e
        c a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d String str, @d5.e Object obj);

        @d5.e
        e b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d String str);
    }

    /* compiled from: KotlinJvmBinaryClass.kt */
    public interface e extends c {
        @d5.e
        a c(int i5, @d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, @d5.d a1 a1Var);
    }

    @d5.d
    kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a();

    void b(@d5.d c cVar, @d5.e byte[] bArr);

    void c(@d5.d d dVar, @d5.e byte[] bArr);

    @d5.d
    String getLocation();

    @d5.d
    kotlin.reflect.jvm.internal.impl.name.b h();
}
