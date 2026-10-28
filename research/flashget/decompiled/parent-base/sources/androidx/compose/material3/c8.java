package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/material3/c8;", "", "Landroidx/compose/material3/d8;", "state", "Landroidx/compose/foundation/interaction/k;", "startInteractionSource", "endInteractionSource", "<init>", "(Landroidx/compose/material3/d8;Landroidx/compose/foundation/interaction/k;Landroidx/compose/foundation/interaction/k;)V", "", "draggingStart", "a", "(Z)Landroidx/compose/foundation/interaction/k;", "", "eventX", "", "c", "(F)I", "posX", "Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlinx/coroutines/r0;", "scope", "Lkotlin/k2;", "b", "(ZFLandroidx/compose/foundation/interaction/h;Lkotlinx/coroutines/r0;)V", "Landroidx/compose/material3/d8;", "f", "()Landroidx/compose/material3/d8;", "Landroidx/compose/foundation/interaction/k;", "e", "()Landroidx/compose/foundation/interaction/k;", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class c8 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d8 state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k startInteractionSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.interaction.k endInteractionSource;

    /* compiled from: Slider.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", i = {}, l = {1580}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f10288b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10290d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f10291e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, androidx.compose.foundation.interaction.h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f10290d = z4;
            this.f10291e = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return c8.this.new a(this.f10290d, this.f10291e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f10288b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.foundation.interaction.k a5 = c8.this.a(this.f10290d);
                androidx.compose.foundation.interaction.h hVar = this.f10291e;
                this.f10288b = 1;
                if (a5.a(hVar, this) == aVar) {
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

    public c8(@fg.l d8 d8Var, @fg.l androidx.compose.foundation.interaction.k kVar, @fg.l androidx.compose.foundation.interaction.k kVar2) {
        this.state = d8Var;
        this.startInteractionSource = kVar;
        this.endInteractionSource = kVar2;
    }

    @fg.l
    public final androidx.compose.foundation.interaction.k a(boolean draggingStart) {
        return draggingStart ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void b(boolean draggingStart, float posX, @fg.l androidx.compose.foundation.interaction.h interaction, @fg.l kotlinx.coroutines.r0 scope) {
        d8 d8Var = this.state;
        d8Var.w(draggingStart, posX - (draggingStart ? d8Var.o() : d8Var.n()));
        kotlinx.coroutines.k.f(scope, null, null, new a(draggingStart, interaction, null), 3, null);
    }

    public final int c(float eventX) {
        return Float.compare(Math.abs(this.state.o() - eventX), Math.abs(this.state.n() - eventX));
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.foundation.interaction.k getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final androidx.compose.foundation.interaction.k getStartInteractionSource() {
        return this.startInteractionSource;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final d8 getState() {
        return this.state;
    }
}
