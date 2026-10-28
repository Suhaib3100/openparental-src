package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import q3.l;
import q3.p;
import q3.q;

/* compiled from: functions.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final l<Object, Object> f26661a = f.f26672p;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final l<Object, Boolean> f26662b = b.f26668p;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final l<Object, Object> f26663c = a.f26667p;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final l<Object, m2> f26664d = c.f26669p;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final p<Object, Object, m2> f26665e = C0397d.f26670p;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final q<Object, Object, Object, m2> f26666f = e.f26671p;

    /* compiled from: functions.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements l {

        /* renamed from: p, reason: collision with root package name */
        public static final a f26667p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        public Object N(Object obj) {
            return null;
        }

        @d5.e
        public final Void a(@d5.e Object obj) {
            return null;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements l<Object, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f26668p = new b();

        b() {
            super(1);
        }

        @Override // q3.l
        public Boolean N(Object obj) {
            return Boolean.TRUE;
        }

        @d5.d
        public final Boolean a(@d5.e Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements l<Object, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f26669p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        public m2 N(Object obj) {
            return m2.f23662a;
        }

        public final void a(@d5.e Object obj) {
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$d, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0397d extends Lambda implements p<Object, Object, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0397d f26670p = new C0397d();

        C0397d() {
            super(2);
        }

        public final void a(@d5.e Object obj, @d5.e Object obj2) {
        }

        @Override // q3.p
        public m2 g0(Object obj, Object obj2) {
            return m2.f23662a;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q<Object, Object, Object, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f26671p = new e();

        e() {
            super(3);
        }

        @Override // q3.q
        public m2 G(Object obj, Object obj2, Object obj3) {
            return m2.f23662a;
        }

        public final void a(@d5.e Object obj, @d5.e Object obj2, @d5.e Object obj3) {
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements l<Object, Object> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f26672p = new f();

        f() {
            super(1);
        }

        @Override // q3.l
        @d5.e
        public final Object N(@d5.e Object obj) {
            return obj;
        }
    }

    @d5.d
    public static final <T> l<T, Boolean> a() {
        return (l<T, Boolean>) f26662b;
    }

    @d5.d
    public static final q<Object, Object, Object, m2> b() {
        return f26666f;
    }
}
