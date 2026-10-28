package androidx.compose.ui.platform;

import androidx.annotation.c1;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: CompositionLocals.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"(\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0013\"&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0013\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u000f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b#\u0010\u0013\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u000f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b&\u0010\u0013\"&\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u0012\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u0013\"\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b-\u0010\u0013\"\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020/0\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b3\u0010\u0013\"\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002050\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b6\u0010\u0013\"\u001f\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b9\u0010\u0013\"\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b<\u0010\u0013\"\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u000f8\u0006¢\u0006\f\n\u0004\b0\u0010\u0011\u001a\u0004\b?\u0010\u0013\"\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010\u0011\u001a\u0004\bA\u0010\u0013\"\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010\u0011\u001a\u0004\bD\u0010\u0013\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u000f8\u0006¢\u0006\f\n\u0004\bG\u0010\u0011\u001a\u0004\bH\u0010\u0013\"\"\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010\u0011\u001a\u0004\bG\u0010\u0013¨\u0006L"}, d2 = {"Landroidx/compose/ui/node/p1;", "owner", "Landroidx/compose/ui/platform/l5;", "uriHandler", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/ui/node/p1;Landroidx/compose/ui/platform/l5;Lld/p;Landroidx/compose/runtime/t;I)V", "", "name", "", "x", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/ui/platform/b;", "Landroidx/compose/runtime/a3;", "c", "()Landroidx/compose/runtime/a3;", "LocalAccessibilityManager", "Lh0/j;", "b", "d", "e", "()V", "LocalAutofill", "Lh0/a0;", "f", "g", "LocalAutofillTree", "Landroidx/compose/ui/platform/f1;", "h", "LocalClipboardManager", "Landroidx/compose/ui/unit/d;", "i", "LocalDensity", "Landroidx/compose/ui/focus/m;", "j", "LocalFocusManager", "Landroidx/compose/ui/text/font/x$b;", "l", "m", "LocalFontLoader", "Landroidx/compose/ui/text/font/y$b;", "k", "LocalFontFamilyResolver", "Lk0/a;", "n", "LocalHapticFeedback", "Ll0/b;", "o", "LocalInputModeManager", "Landroidx/compose/ui/unit/w;", "p", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/b1;", "s", "LocalTextInputService", "Landroidx/compose/ui/platform/g5;", "r", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/i5;", "t", "LocalTextToolbar", "u", "LocalUriHandler", "Landroidx/compose/ui/platform/s5;", "v", "LocalViewConfiguration", "Landroidx/compose/ui/platform/d6;", "q", "w", "LocalWindowInfo", "Landroidx/compose/ui/input/pointer/y;", "LocalPointerIconService", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.platform.b> f19877a = androidx.compose.runtime.f0.f(a.f19895b);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<h0.j> f19878b = androidx.compose.runtime.f0.f(b.f19896b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<h0.a0> f19879c = androidx.compose.runtime.f0.f(c.f19897b);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<f1> f19880d = androidx.compose.runtime.f0.f(d.f19898b);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.unit.d> f19881e = androidx.compose.runtime.f0.f(e.f19899b);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.focus.m> f19882f = androidx.compose.runtime.f0.f(f.f19900b);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<x.b> f19883g = androidx.compose.runtime.f0.f(h.f19902b);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<y.b> f19884h = androidx.compose.runtime.f0.f(g.f19901b);

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<k0.a> f19885i = androidx.compose.runtime.f0.f(i.f19903b);

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<l0.b> f19886j = androidx.compose.runtime.f0.f(j.f19904b);

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.unit.w> f19887k = androidx.compose.runtime.f0.f(k.f19905b);

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.text.input.b1> f19888l = androidx.compose.runtime.f0.f(n.f19908b);

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<g5> f19889m = androidx.compose.runtime.f0.f(m.f19907b);

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<i5> f19890n = androidx.compose.runtime.f0.f(o.f19909b);

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<l5> f19891o = androidx.compose.runtime.f0.f(p.f19910b);

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<s5> f19892p = androidx.compose.runtime.f0.f(q.f19911b);

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<d6> f19893q = androidx.compose.runtime.f0.f(r.f19912b);

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.input.pointer.y> f19894r = androidx.compose.runtime.f0.f(l.f19906b);

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/b;", "a", "()Landroidx/compose/ui/platform/b;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.platform.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19895b = new a(0);

        a() {
            super(0);
        }

        @fg.m
        public final androidx.compose.ui.platform.b a() {
            return null;
        }

        @Override // ld.a
        public androidx.compose.ui.platform.b invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh0/j;", "a", "()Lh0/j;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<h0.j> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19896b = new b(0);

        b() {
            super(0);
        }

        @fg.m
        public final h0.j a() {
            return null;
        }

        @Override // ld.a
        public h0.j invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh0/a0;", "a", "()Lh0/a0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<h0.a0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f19897b = new c(0);

        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0.a0 invoke() {
            h1.x("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/f1;", "a", "()Landroidx/compose/ui/platform/f1;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<f1> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f19898b = new d(0);

        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f1 invoke() {
            h1.x("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/d;", "a", "()Landroidx/compose/ui/unit/d;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.unit.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f19899b = new e(0);

        e() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.unit.d invoke() {
            h1.x("LocalDensity");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/focus/m;", "a", "()Landroidx/compose/ui/focus/m;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.focus.m> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f19900b = new f(0);

        f() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.focus.m invoke() {
            h1.x("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/font/y$b;", "a", "()Landroidx/compose/ui/text/font/y$b;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<y.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f19901b = new g(0);

        g() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.b invoke() {
            h1.x("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/font/x$b;", "a", "()Landroidx/compose/ui/text/font/x$b;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<x.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f19902b = new h(0);

        h() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x.b invoke() {
            h1.x("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk0/a;", "a", "()Lk0/a;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<k0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f19903b = new i(0);

        i() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0.a invoke() {
            h1.x("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/b;", "a", "()Ll0/b;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<l0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f19904b = new j(0);

        j() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l0.b invoke() {
            h1.x("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/w;", "a", "()Landroidx/compose/ui/unit/w;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.unit.w> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f19905b = new k(0);

        k() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.unit.w invoke() {
            h1.x("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/y;", "a", "()Landroidx/compose/ui/input/pointer/y;"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.input.pointer.y> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f19906b = new l(0);

        l() {
            super(0);
        }

        @fg.m
        public final androidx.compose.ui.input.pointer.y a() {
            return null;
        }

        @Override // ld.a
        public androidx.compose.ui.input.pointer.y invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/g5;", "a", "()Landroidx/compose/ui/platform/g5;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<g5> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f19907b = new m(0);

        m() {
            super(0);
        }

        @fg.m
        public final g5 a() {
            return null;
        }

        @Override // ld.a
        public g5 invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/input/b1;", "a", "()Landroidx/compose/ui/text/input/b1;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.text.input.b1> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f19908b = new n(0);

        n() {
            super(0);
        }

        @fg.m
        public final androidx.compose.ui.text.input.b1 a() {
            return null;
        }

        @Override // ld.a
        public androidx.compose.ui.text.input.b1 invoke() {
            return null;
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/i5;", "a", "()Landroidx/compose/ui/platform/i5;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.a<i5> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f19909b = new o(0);

        o() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i5 invoke() {
            h1.x("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/l5;", "a", "()Landroidx/compose/ui/platform/l5;"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.a<l5> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f19910b = new p(0);

        p() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l5 invoke() {
            h1.x("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/s5;", "a", "()Landroidx/compose/ui/platform/s5;"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.a<s5> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f19911b = new q(0);

        q() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s5 invoke() {
            h1.x("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/d6;", "a", "()Landroidx/compose/ui/platform/d6;"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.a<d6> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f19912b = new r(0);

        r() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d6 invoke() {
            h1.x("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: CompositionLocals.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.p1 f19913b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l5 f19914c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f19915d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19916e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(androidx.compose.ui.node.p1 p1Var, l5 l5Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f19913b = p1Var;
            this.f19914c = l5Var;
            this.f19915d = pVar;
            this.f19916e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            h1.a(this.f19913b, this.f19914c, this.f19915d, tVar, androidx.compose.runtime.g3.b(this.f19916e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.ui.k
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.node.p1 p1Var, @fg.l l5 l5Var, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(874662829);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(p1Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.q0(l5Var) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i5 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(874662829, i5, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:184)");
            }
            androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{f19877a.e(p1Var.D()), f19878b.e(p1Var.H()), f19879c.e(p1Var.getAutofillTree()), f19880d.e(p1Var.c0()), f19881e.e(p1Var.getDensity()), f19882f.e(p1Var.getFocusOwner()), f19883g.f(p1Var.getFontLoader()), f19884h.f(p1Var.K()), f19885i.e(p1Var.getHapticFeedBack()), f19886j.e(p1Var.I()), f19887k.e(p1Var.getLayoutDirection()), f19888l.e(p1Var.getTextInputService()), f19889m.e(p1Var.getSoftwareKeyboardController()), f19890n.e(p1Var.getTextToolbar()), f19891o.e(l5Var), f19892p.e(p1Var.getViewConfiguration()), f19893q.e(p1Var.d0()), f19894r.e(p1Var.getPointerIconService())}, pVar, o4, ((i5 >> 3) & 112) | 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new s(p1Var, l5Var, pVar, i4));
        }
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.platform.b> c() {
        return f19877a;
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.runtime.a3<h0.j> d() {
        return f19878b;
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void e() {
    }

    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.runtime.a3<h0.a0> f() {
        return f19879c;
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void g() {
    }

    @fg.l
    public static final androidx.compose.runtime.a3<f1> h() {
        return f19880d;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.unit.d> i() {
        return f19881e;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.focus.m> j() {
        return f19882f;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<y.b> k() {
        return f19884h;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public static final androidx.compose.runtime.a3<x.b> l() {
        return f19883g;
    }

    @kotlin.k(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @kotlin.x0(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void m() {
    }

    @fg.l
    public static final androidx.compose.runtime.a3<k0.a> n() {
        return f19885i;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<l0.b> o() {
        return f19886j;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.unit.w> p() {
        return f19887k;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.input.pointer.y> q() {
        return f19894r;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<g5> r() {
        return f19889m;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.text.input.b1> s() {
        return f19888l;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<i5> t() {
        return f19890n;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<l5> u() {
        return f19891o;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<s5> v() {
        return f19892p;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<d6> w() {
        return f19893q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void x(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
