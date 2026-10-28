package androidx.compose.foundation;

import androidx.compose.runtime.b5;
import kotlin.Metadata;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/s0;", "Landroidx/compose/foundation/n1;", "<init>", "()V", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/foundation/o1;", "a", "(Landroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/o1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,187:1\n36#2:188\n1116#3,6:189\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:188\n171#1:189,6\n*E\n"})
/* loaded from: classes.dex */
final class s0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final s0 f7002a = new s0();

    /* compiled from: Indication.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/s0$a;", "Landroidx/compose/foundation/o1;", "Landroidx/compose/runtime/b5;", "", "isPressed", "isHovered", "isFocused", "<init>", "(Landroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "b", "Landroidx/compose/runtime/b5;", "c", "d", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements o1 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b5<Boolean> isPressed;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b5<Boolean> isHovered;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b5<Boolean> isFocused;

        public a(@fg.l b5<Boolean> b5Var, @fg.l b5<Boolean> b5Var2, @fg.l b5<Boolean> b5Var3) {
            this.isPressed = b5Var;
            this.isHovered = b5Var2;
            this.isFocused = b5Var3;
        }

        @Override // androidx.compose.foundation.o1
        public void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            cVar.G6();
            if (this.isPressed.getValue().booleanValue()) {
                androidx.compose.ui.graphics.d2.INSTANCE.getClass();
                androidx.compose.ui.graphics.drawscope.f.t5(cVar, androidx.compose.ui.graphics.d2.w(androidx.compose.ui.graphics.d2.f17766c, 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.e(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                androidx.compose.ui.graphics.d2.INSTANCE.getClass();
                androidx.compose.ui.graphics.drawscope.f.t5(cVar, androidx.compose.ui.graphics.d2.w(androidx.compose.ui.graphics.d2.f17766c, 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.e(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private s0() {
    }

    @Override // androidx.compose.foundation.n1
    @fg.l
    @androidx.compose.runtime.i
    public o1 a(@fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1683566979);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1683566979, i4, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i5 = i4 & 14;
        b5<Boolean> a5 = androidx.compose.foundation.interaction.n.a(iVar, tVar, i5);
        b5<Boolean> a6 = androidx.compose.foundation.interaction.g.a(iVar, tVar, i5);
        b5<Boolean> a7 = androidx.compose.foundation.interaction.e.a(iVar, tVar, i5);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(iVar);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(a5, a6, a7);
            tVar.E(Q);
        }
        tVar.p0();
        a aVar = (a) Q;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }
}
