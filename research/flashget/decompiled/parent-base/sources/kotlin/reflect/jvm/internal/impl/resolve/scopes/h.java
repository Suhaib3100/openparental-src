package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;

/* compiled from: MemberScope.kt */
/* loaded from: classes7.dex */
public interface h extends k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a f77998a = a.f77999a;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f77999a = new a();

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private static final ld.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> f78000b = C1180a.f78001b;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h$a$a, reason: collision with other inner class name */
        static final class C1180a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1180a f78001b = new C1180a(1);

            C1180a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("窜\u0001"));
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        @fg.l
        public final ld.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> a() {
            return f78000b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b {
        public static void a(@fg.l h hVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("窝\u0001"));
            l0.p(bVar, ProtectedSandApp.s("窞\u0001"));
            k.a.b(hVar, fVar, bVar);
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class c extends i {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final c f78002b = new c();

        private c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return kotlin.collections.l0.f74939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return kotlin.collections.l0.f74939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
            return kotlin.collections.l0.f74939b;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    Collection<? extends z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

    @fg.l
    Collection<? extends u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar);

    @fg.l
    Set<kotlin.reflect.jvm.internal.impl.name.f> c();

    @fg.l
    Set<kotlin.reflect.jvm.internal.impl.name.f> d();

    @fg.m
    Set<kotlin.reflect.jvm.internal.impl.name.f> h();
}
