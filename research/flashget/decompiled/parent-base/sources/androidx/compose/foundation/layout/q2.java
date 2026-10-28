package androidx.compose.foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.t;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 12\u00020\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010 \u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010#\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u0010-\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107R\u0017\u0010:\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b9\u00107R\u0017\u0010=\u001a\u0002048\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u00107R\u0017\u0010>\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b!\u00102R\u0017\u0010?\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b;\u00102R\u0017\u0010A\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b@\u00102R\u0017\u0010C\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\bB\u00102R\u0017\u0010E\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b@\u00100\u001a\u0004\bD\u00102R\u0017\u0010F\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b/\u00102R\u0017\u0010G\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\b+\u00102R\u0017\u0010K\u001a\u00020H8\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\b$\u0010JR\u0016\u0010M\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010LR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010O¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/layout/q2;", "", "Landroidx/core/view/j3;", "insets", "Landroid/view/View;", "view", "<init>", "(Landroidx/core/view/j3;Landroid/view/View;)V", "Lkotlin/k2;", "y", "(Landroid/view/View;)V", "c", "windowInsets", "", "types", "z", "(Landroidx/core/view/j3;I)V", "B", "(Landroidx/core/view/j3;)V", "C", "Landroidx/compose/foundation/layout/h;", "a", "Landroidx/compose/foundation/layout/h;", "d", "()Landroidx/compose/foundation/layout/h;", "captionBar", "b", "g", "displayCutout", "h", "ime", "k", "mandatorySystemGestures", "e", "l", "navigationBars", "f", "q", "statusBars", "s", "systemBars", "u", "systemGestures", "i", "v", "tappableElement", "Landroidx/compose/foundation/layout/l2;", "j", "Landroidx/compose/foundation/layout/l2;", "x", "()Landroidx/compose/foundation/layout/l2;", "waterfall", "Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/foundation/layout/n2;", "o", "()Landroidx/compose/foundation/layout/n2;", "safeDrawing", "p", "safeGestures", "m", "n", "safeContent", "captionBarIgnoringVisibility", "navigationBarsIgnoringVisibility", "r", "statusBarsIgnoringVisibility", "t", "systemBarsIgnoringVisibility", "w", "tappableElementIgnoringVisibility", "imeAnimationTarget", "imeAnimationSource", "", "Z", "()Z", "consumes", "I", "accessCount", "Landroidx/compose/foundation/layout/q0;", "Landroidx/compose/foundation/layout/q0;", "insetsListener", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q2 {
    private static boolean A = false;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5271y = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h captionBar;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h displayCutout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h ime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h mandatorySystemGestures;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h navigationBars;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h statusBars;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h systemBars;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h systemGestures;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h tappableElement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 waterfall;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 safeDrawing;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 safeGestures;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 safeContent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 captionBarIgnoringVisibility;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 navigationBarsIgnoringVisibility;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 statusBarsIgnoringVisibility;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 systemBarsIgnoringVisibility;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 tappableElementIgnoringVisibility;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 imeAnimationTarget;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 imeAnimationSource;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean consumes;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int accessCount;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q0 insetsListener;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    private static final WeakHashMap<View, q2> f5272z = new WeakHashMap<>();

    /* compiled from: WindowInsets.android.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/q2$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/foundation/layout/q2;", "d", "(Landroid/view/View;)Landroidx/compose/foundation/layout/q2;", "Landroidx/core/view/j3;", "windowInsets", "", "type", "", "name", "Landroidx/compose/foundation/layout/h;", "f", "(Landroidx/core/view/j3;ILjava/lang/String;)Landroidx/compose/foundation/layout/h;", "Landroidx/compose/foundation/layout/l2;", "g", "(Landroidx/core/view/j3;ILjava/lang/String;)Landroidx/compose/foundation/layout/l2;", "", "testInsets", "Lkotlin/k2;", "e", "(Z)V", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/layout/q2;", "Z", "Ljava/util/WeakHashMap;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,785:1\n74#2:786\n361#3,7:787\n1#4:794\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n628#1:786\n646#1:787,7\n*E\n"})
    /* renamed from: androidx.compose.foundation.layout.q2$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: WindowInsets.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,785:1\n64#2,5:786\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n633#1:786,5\n*E\n"})
        /* renamed from: androidx.compose.foundation.layout.q2$a$a, reason: collision with other inner class name */
        static final class C0097a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q2 f5296b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f5297c;

            /* compiled from: Effects.kt */
            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n1#1,497:1\n634#2,2:498\n*E\n"})
            /* renamed from: androidx.compose.foundation.layout.q2$a$a$a, reason: collision with other inner class name */
            public static final class C0098a implements androidx.compose.runtime.v0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ q2 f5298a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f5299b;

                public C0098a(q2 q2Var, View view) {
                    this.f5298a = q2Var;
                    this.f5299b = view;
                }

                @Override // androidx.compose.runtime.v0
                public void dispose() {
                    this.f5298a.c(this.f5299b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0097a(q2 q2Var, View view) {
                super(1);
                this.f5296b = q2Var;
                this.f5297c = view;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
                this.f5296b.y(this.f5297c);
                return new C0098a(this.f5296b, this.f5297c);
            }
        }

        private Companion() {
        }

        private final q2 d(View view) {
            q2 q2Var;
            synchronized (q2.f5272z) {
                try {
                    WeakHashMap weakHashMap = q2.f5272z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        q2 q2Var2 = new q2(null, view, false ? 1 : 0);
                        weakHashMap.put(view, q2Var2);
                        obj2 = q2Var2;
                    }
                    q2Var = (q2) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return q2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h f(androidx.core.view.j3 windowInsets, int type, String name) {
            h hVar = new h(type, name);
            if (windowInsets != null) {
                hVar.j(windowInsets, type);
            }
            return hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l2 g(androidx.core.view.j3 windowInsets, int type, String name) {
            androidx.core.graphics.e0 e0Var;
            if (windowInsets == null || (e0Var = windowInsets.g(type)) == null) {
                e0Var = androidx.core.graphics.e0.f26244e;
            }
            return i3.a(e0Var, name);
        }

        @fg.l
        @androidx.compose.runtime.i
        public final q2 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-1366542614);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1366542614, i4, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) tVar.x(androidx.compose.ui.platform.o0.k());
            q2 d5 = d(view);
            androidx.compose.runtime.a1.c(d5, new C0097a(d5, view), tVar, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return d5;
        }

        @fg.p
        public final void e(boolean testInsets) {
            q2.A = testInsets;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ q2(androidx.core.view.j3 j3Var, View view, kotlin.jvm.internal.w wVar) {
        this(j3Var, view);
    }

    public static /* synthetic */ void A(q2 q2Var, androidx.core.view.j3 j3Var, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        q2Var.z(j3Var, i4);
    }

    public final void B(@fg.l androidx.core.view.j3 windowInsets) {
        this.imeAnimationSource.g(i3.T(windowInsets.f(8)));
    }

    public final void C(@fg.l androidx.core.view.j3 windowInsets) {
        this.imeAnimationTarget.g(i3.T(windowInsets.f(8)));
    }

    public final void c(@fg.l View view) {
        int i4 = this.accessCount - 1;
        this.accessCount = i4;
        if (i4 == 0) {
            androidx.core.view.x1.k2(view, null);
            androidx.core.view.x1.H2(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final h getCaptionBar() {
        return this.captionBar;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final l2 getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getConsumes() {
        return this.consumes;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final h getDisplayCutout() {
        return this.displayCutout;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final h getIme() {
        return this.ime;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final l2 getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final l2 getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final h getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final h getNavigationBars() {
        return this.navigationBars;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final l2 getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final n2 getSafeContent() {
        return this.safeContent;
    }

    @fg.l
    /* renamed from: o, reason: from getter */
    public final n2 getSafeDrawing() {
        return this.safeDrawing;
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final n2 getSafeGestures() {
        return this.safeGestures;
    }

    @fg.l
    /* renamed from: q, reason: from getter */
    public final h getStatusBars() {
        return this.statusBars;
    }

    @fg.l
    /* renamed from: r, reason: from getter */
    public final l2 getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final h getSystemBars() {
        return this.systemBars;
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final l2 getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @fg.l
    /* renamed from: u, reason: from getter */
    public final h getSystemGestures() {
        return this.systemGestures;
    }

    @fg.l
    /* renamed from: v, reason: from getter */
    public final h getTappableElement() {
        return this.tappableElement;
    }

    @fg.l
    /* renamed from: w, reason: from getter */
    public final l2 getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @fg.l
    /* renamed from: x, reason: from getter */
    public final l2 getWaterfall() {
        return this.waterfall;
    }

    public final void y(@fg.l View view) {
        if (this.accessCount == 0) {
            androidx.core.view.x1.k2(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            androidx.core.view.x1.H2(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void z(@fg.l androidx.core.view.j3 windowInsets, int types) {
        if (A) {
            WindowInsets J = windowInsets.J();
            kotlin.jvm.internal.l0.m(J);
            windowInsets = androidx.core.view.j3.L(J, null);
        }
        this.captionBar.j(windowInsets, types);
        this.ime.j(windowInsets, types);
        this.displayCutout.j(windowInsets, types);
        this.navigationBars.j(windowInsets, types);
        this.statusBars.j(windowInsets, types);
        this.systemBars.j(windowInsets, types);
        this.systemGestures.j(windowInsets, types);
        this.tappableElement.j(windowInsets, types);
        this.mandatorySystemGestures.j(windowInsets, types);
        if (types == 0) {
            this.captionBarIgnoringVisibility.g(i3.T(windowInsets.g(4)));
            this.navigationBarsIgnoringVisibility.g(i3.T(windowInsets.g(2)));
            this.statusBarsIgnoringVisibility.g(i3.T(windowInsets.g(1)));
            this.systemBarsIgnoringVisibility.g(i3.T(windowInsets.g(7)));
            this.tappableElementIgnoringVisibility.g(i3.T(windowInsets.g(64)));
            androidx.core.view.z e4 = windowInsets.e();
            if (e4 != null) {
                this.waterfall.g(i3.T(e4.h()));
            }
        }
        androidx.compose.runtime.snapshots.m.INSTANCE.q();
    }

    private q2(androidx.core.view.j3 j3Var, View view) {
        androidx.core.view.z e4;
        androidx.core.graphics.e0 h4;
        Companion companion = INSTANCE;
        this.captionBar = companion.f(j3Var, 4, "captionBar");
        h f4 = companion.f(j3Var, 128, "displayCutout");
        this.displayCutout = f4;
        h f5 = companion.f(j3Var, 8, "ime");
        this.ime = f5;
        h f6 = companion.f(j3Var, 32, "mandatorySystemGestures");
        this.mandatorySystemGestures = f6;
        this.navigationBars = companion.f(j3Var, 2, "navigationBars");
        this.statusBars = companion.f(j3Var, 1, "statusBars");
        h f7 = companion.f(j3Var, 7, "systemBars");
        this.systemBars = f7;
        h f10 = companion.f(j3Var, 16, "systemGestures");
        this.systemGestures = f10;
        h f11 = companion.f(j3Var, 64, "tappableElement");
        this.tappableElement = f11;
        l2 a5 = i3.a((j3Var == null || (e4 = j3Var.e()) == null || (h4 = e4.h()) == null) ? androidx.core.graphics.e0.f26244e : h4, "waterfall");
        this.waterfall = a5;
        i2 i2Var = new i2(new i2(f7, f5), f4);
        this.safeDrawing = i2Var;
        i2 i2Var2 = new i2(new i2(new i2(f11, f6), f10), a5);
        this.safeGestures = i2Var2;
        this.safeContent = new i2(i2Var, i2Var2);
        this.captionBarIgnoringVisibility = companion.g(j3Var, 4, "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.g(j3Var, 2, "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.g(j3Var, 1, "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.g(j3Var, 7, "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.g(j3Var, 64, "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.g(j3Var, 8, "imeAnimationTarget");
        this.imeAnimationSource = companion.g(j3Var, 8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(t.b.I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new q0(this);
    }
}
