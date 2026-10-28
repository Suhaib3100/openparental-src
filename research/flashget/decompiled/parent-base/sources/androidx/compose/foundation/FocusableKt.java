package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\r\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0006\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/q;", "", "enabled", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "b", "(Landroidx/compose/ui/q;ZLandroidx/compose/foundation/interaction/k;)Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "d", "Landroidx/compose/ui/platform/w1;", "Landroidx/compose/ui/platform/w1;", "focusGroupInspectorInfo", "androidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1", "Landroidx/compose/foundation/FocusableKt$FocusableInNonTouchModeElement$1;", "FocusableInNonTouchModeElement", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,374:1\n146#2:375\n135#2:376\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n126#1:375\n114#1:376\n*E\n"})
/* loaded from: classes.dex */
public final class FocusableKt {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.platform.w1 f3459a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final FocusableKt$FocusableInNonTouchModeElement$1 f3460b;

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/t;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.focus.t, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3461b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.focus.t tVar) {
            tVar.m(false);
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.focus.t tVar) {
            tVar.m(false);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3462b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f3463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, androidx.compose.foundation.interaction.k kVar) {
            super(1);
            this.f3462b = z4;
            this.f3463c = kVar;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("focusableInNonTouchMode");
            h0.a(this.f3462b, a2Var.getProperties(), "enabled", a2Var).c("interactionSource", this.f3463c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n114#2:171\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {
        public c() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("focusGroup");
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f3459a = new androidx.compose.ui.platform.w1(androidx.compose.ui.platform.y1.e() ? new c(1) : androidx.compose.ui.platform.y1.b());
        f3460b = new androidx.compose.ui.node.y0<b1>() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            @Override // androidx.compose.ui.node.y0
            public boolean equals(@fg.m Object other) {
                return this == other;
            }

            @Override // androidx.compose.ui.node.y0
            public int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // androidx.compose.ui.node.y0
            public b1 i() {
                return new b1();
            }

            @Override // androidx.compose.ui.node.y0
            public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
                a2Var.d("focusableInNonTouchMode");
            }

            @Override // androidx.compose.ui.node.y0
            public void m(b1 b1Var) {
            }

            @fg.l
            public b1 n() {
                return new b1();
            }

            public void o(@fg.l b1 node) {
            }
        };
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar) {
        return androidx.compose.ui.focus.v.a(qVar.w3(f3459a), a.f3461b).w3(FocusTargetNode.FocusTargetElement.f17508d);
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar) {
        return qVar.w3(z4 ? new FocusableElement(kVar).w3(FocusTargetNode.FocusTargetElement.f17508d) : androidx.compose.ui.q.INSTANCE);
    }

    public static /* synthetic */ androidx.compose.ui.q c(androidx.compose.ui.q qVar, boolean z4, androidx.compose.foundation.interaction.k kVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            kVar = null;
        }
        return b(qVar, z4, kVar);
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.m androidx.compose.foundation.interaction.k kVar) {
        b bVar = new b(z4, kVar);
        q.Companion companion = androidx.compose.ui.q.INSTANCE;
        FocusableKt$FocusableInNonTouchModeElement$1 focusableKt$FocusableInNonTouchModeElement$1 = f3460b;
        companion.getClass();
        return androidx.compose.ui.platform.y1.d(qVar, bVar, b(focusableKt$FocusableInNonTouchModeElement$1, z4, kVar));
    }
}
