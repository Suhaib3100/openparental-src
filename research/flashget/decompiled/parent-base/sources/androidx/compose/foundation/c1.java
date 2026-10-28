package androidx.compose.foundation;

import androidx.compose.foundation.interaction.d;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/c1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/k;)V", "Lkotlin/k2;", "y7", "()V", "Landroidx/compose/foundation/interaction/h;", "interaction", "z7", "(Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/interaction/h;)V", "", "isFocused", "A7", "(Z)V", "B7", "p", "Landroidx/compose/foundation/interaction/k;", "Landroidx/compose/foundation/interaction/d$a;", "q", "Landroidx/compose/foundation/interaction/d$a;", "focusedInteraction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c1 extends q.d {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.interaction.k interactionSource;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d.a focusedInteraction;

    /* compiled from: Focusable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f3544c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f3545d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3544c = kVar;
            this.f3545d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f3544c, this.f3545d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3543b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.interaction.k kVar = this.f3544c;
                androidx.compose.foundation.interaction.h hVar = this.f3545d;
                this.f3543b = 1;
                if (kVar.a(hVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public c1(@fg.m androidx.compose.foundation.interaction.k kVar) {
        this.interactionSource = kVar;
    }

    private final void y7() {
        d.a aVar;
        androidx.compose.foundation.interaction.k kVar = this.interactionSource;
        if (kVar != null && (aVar = this.focusedInteraction) != null) {
            kVar.b(new d.b(aVar));
        }
        this.focusedInteraction = null;
    }

    private final void z7(androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.h hVar) {
        if (getIsAttached()) {
            kotlinx.coroutines.k.f(V6(), null, null, new a(kVar, hVar, null), 3, null);
        } else {
            kVar.b(hVar);
        }
    }

    public final void A7(boolean isFocused) {
        androidx.compose.foundation.interaction.k kVar = this.interactionSource;
        if (kVar != null) {
            if (!isFocused) {
                d.a aVar = this.focusedInteraction;
                if (aVar != null) {
                    z7(kVar, new d.b(aVar));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            d.a aVar2 = this.focusedInteraction;
            if (aVar2 != null) {
                z7(kVar, new d.b(aVar2));
                this.focusedInteraction = null;
            }
            d.a aVar3 = new d.a();
            z7(kVar, aVar3);
            this.focusedInteraction = aVar3;
        }
    }

    public final void B7(@fg.m androidx.compose.foundation.interaction.k interactionSource) {
        if (kotlin.jvm.internal.l0.g(this.interactionSource, interactionSource)) {
            return;
        }
        y7();
        this.interactionSource = interactionSource;
    }
}
