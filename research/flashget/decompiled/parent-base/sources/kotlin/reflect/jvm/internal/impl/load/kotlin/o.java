package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes7.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final b f76935a = new b();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final d f76936b = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final d f76937c = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.CHAR);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final d f76938d = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BYTE);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final d f76939e = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.SHORT);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final d f76940f = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final d f76941g = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final d f76942h = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.LONG);

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final d f76943i = new d(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    public static final class a extends o {

        /* renamed from: j, reason: collision with root package name */
        @fg.l
        private final o f76944j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l o oVar) {
            super(null);
            l0.p(oVar, ProtectedSandApp.s("璖\u0001"));
            this.f76944j = oVar;
        }

        @fg.l
        public final o i() {
            return this.f76944j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class b {
        private b() {
        }

        @fg.l
        public final d a() {
            return o.f76936b;
        }

        @fg.l
        public final d b() {
            return o.f76938d;
        }

        @fg.l
        public final d c() {
            return o.f76937c;
        }

        @fg.l
        public final d d() {
            return o.f76943i;
        }

        @fg.l
        public final d e() {
            return o.f76941g;
        }

        @fg.l
        public final d f() {
            return o.f76940f;
        }

        @fg.l
        public final d g() {
            return o.f76942h;
        }

        @fg.l
        public final d h() {
            return o.f76939e;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class c extends o {

        /* renamed from: j, reason: collision with root package name */
        @fg.l
        private final String f76945j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@fg.l String str) {
            super(null);
            l0.p(str, ProtectedSandApp.s("璗\u0001"));
            this.f76945j = str;
        }

        @fg.l
        public final String i() {
            return this.f76945j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class d extends o {

        /* renamed from: j, reason: collision with root package name */
        @fg.m
        private final kotlin.reflect.jvm.internal.impl.resolve.jvm.e f76946j;

        public d(@fg.m kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar) {
            super(null);
            this.f76946j = eVar;
        }

        @fg.m
        public final kotlin.reflect.jvm.internal.impl.resolve.jvm.e i() {
            return this.f76946j;
        }
    }

    public /* synthetic */ o(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    public String toString() {
        return q.f76947a.l(this);
    }

    private o() {
    }
}
