package kotlin.reflect.jvm.internal.impl.utils;

import fg.l;
import fg.m;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.p;
import ld.q;

/* compiled from: functions.kt */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final ld.l<Object, Object> f78669a = f.f78680b;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final ld.l<Object, Boolean> f78670b = b.f78676b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final ld.l<Object, Object> f78671c = a.f78675b;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final ld.l<Object, k2> f78672d = c.f78677b;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final p<Object, Object, k2> f78673e = d.f78678b;

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final q<Object, Object, Object, k2> f78674f = C1201e.f78679b;

    /* compiled from: functions.kt */
    static final class a extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final a f78675b = new a(1);

        a() {
            super(1);
        }

        @m
        public final Void a(@m Object obj) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: functions.kt */
    static final class b extends n0 implements ld.l<Object, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f78676b = new b(1);

        b() {
            super(1);
        }

        @l
        public final Boolean a(@m Object obj) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: functions.kt */
    static final class c extends n0 implements ld.l<Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f78677b = new c(1);

        c() {
            super(1);
        }

        public final void a(@m Object obj) {
        }

        @Override // ld.l
        public k2 invoke(Object obj) {
            return k2.f75408a;
        }
    }

    /* compiled from: functions.kt */
    static final class d extends n0 implements p<Object, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78678b = new d(2);

        d() {
            super(2);
        }

        public final void a(@m Object obj, @m Object obj2) {
        }

        @Override // ld.p
        public k2 invoke(Object obj, Object obj2) {
            return k2.f75408a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.e$e, reason: collision with other inner class name */
    static final class C1201e extends n0 implements q<Object, Object, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1201e f78679b = new C1201e(3);

        C1201e() {
            super(3);
        }

        @Override // ld.q
        public k2 R(Object obj, Object obj2, Object obj3) {
            return k2.f75408a;
        }

        public final void a(@m Object obj, @m Object obj2, @m Object obj3) {
        }
    }

    /* compiled from: functions.kt */
    static final class f extends n0 implements ld.l<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f78680b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        @m
        public final Object invoke(@m Object obj) {
            return obj;
        }
    }

    @l
    public static final <T> ld.l<T, Boolean> a() {
        return (ld.l<T, Boolean>) f78670b;
    }

    @l
    public static final q<Object, Object, Object, k2> b() {
        return f78674f;
    }
}
