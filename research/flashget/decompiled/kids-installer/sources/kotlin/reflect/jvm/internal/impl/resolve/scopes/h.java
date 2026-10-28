package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;

/* compiled from: MemberScope.kt */
/* loaded from: classes5.dex */
public interface h extends k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f26014a = a.f26015a;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26015a = new a();

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private static final q3.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> f26016b = C0376a.f26017p;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0376a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> {

            /* renamed from: p, reason: collision with root package name */
            public static final C0376a f26017p = new C0376a();

            C0376a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
                l0.p(fVar, ProtectedSandApp.s("蛔"));
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        @d5.d
        public final q3.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> a() {
            return f26016b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b {
        public static void a(@d5.d h hVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("半"));
            l0.p(bVar, ProtectedSandApp.s("卋"));
            k.a.b(hVar, fVar, bVar);
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes6.dex */
    public static final class c extends i {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final c f26018b = new c();

        private c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return EmptySet.f23181o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return EmptySet.f23181o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
            return EmptySet.f23181o;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    Collection<? extends z0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);

    @d5.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> b();

    @d5.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> c();

    @d5.d
    Collection<? extends u0> d(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);

    @d5.e
    Set<kotlin.reflect.jvm.internal.impl.name.f> f();
}
