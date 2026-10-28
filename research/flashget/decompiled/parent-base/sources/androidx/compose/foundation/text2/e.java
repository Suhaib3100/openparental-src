package androidx.compose.foundation.text2;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.focus.j0;
import androidx.compose.ui.q;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: BasicSecureTextField.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text2/e;", "", "Lkotlinx/coroutines/r0;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Lkotlin/k2;", "h", "()V", "Landroidx/compose/foundation/text2/c;", "a", "Landroidx/compose/foundation/text2/c;", "g", "()Landroidx/compose/foundation/text2/c;", "passwordRevealFilter", "Landroidx/compose/foundation/text2/input/c;", "b", "Landroidx/compose/foundation/text2/input/c;", "e", "()Landroidx/compose/foundation/text2/input/c;", "codepointTransformation", "Landroidx/compose/ui/q;", "c", "Landroidx/compose/ui/q;", "f", "()Landroidx/compose/ui/q;", "focusChangeModifier", "Lkotlinx/coroutines/channels/l;", "d", "Lkotlinx/coroutines/channels/l;", "resetTimerSignal", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8503e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.foundation.text2.c passwordRevealFilter = new androidx.compose.foundation.text2.c(new c(this));

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.foundation.text2.input.c codepointTransformation = new androidx.compose.foundation.text2.input.c() { // from class: androidx.compose.foundation.text2.d
        @Override // androidx.compose.foundation.text2.input.c
        public final int a(int i4, int i5) {
            int d5;
            d5 = e.d(e.this, i4, i5);
            return d5;
        }
    };

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final q focusChangeModifier = androidx.compose.ui.focus.d.a(q.INSTANCE, new b());

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlinx.coroutines.channels.l<k2> resetTimerSignal = o.d(Integer.MAX_VALUE, null, null, 6, null);

    /* compiled from: BasicSecureTextField.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.SecureTextFieldController$1", f = "BasicSecureTextField.kt", i = {}, l = {384}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8508b;

        /* compiled from: BasicSecureTextField.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.SecureTextFieldController$1$1", f = "BasicSecureTextField.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/k2;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.e$a$a, reason: collision with other inner class name */
        static final class C0177a extends kotlin.coroutines.jvm.internal.o implements p<k2, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8510b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f8511c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0177a(e eVar, kotlin.coroutines.d<? super C0177a> dVar) {
                super(2, dVar);
                this.f8511c = eVar;
            }

            @Override // ld.p
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@l k2 k2Var, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0177a) create(k2Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                return new C0177a(this.f8511c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8510b;
                if (i4 == 0) {
                    a1.n(obj);
                    this.f8510b = 1;
                    if (c1.b(1500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                this.f8511c.getPasswordRevealFilter().e();
                return k2.f75408a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8508b;
            if (i4 == 0) {
                a1.n(obj);
                i X = k.X(e.this.resetTimerSignal);
                C0177a c0177a = new C0177a(e.this, null);
                this.f8508b = 1;
                if (k.A(X, c0177a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/j0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<j0, k2> {
        b() {
            super(1);
        }

        public final void a(@l j0 j0Var) {
            if (j0Var.isFocused()) {
                return;
            }
            e.this.getPasswordRevealFilter().e();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(j0 j0Var) {
            a(j0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends h0 implements ld.a<k2> {
        c(Object obj) {
            super(0, obj, e.class, "scheduleHide", "scheduleHide()V", 0);
        }

        public final void Z() {
            ((e) this.receiver).h();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            Z();
            return k2.f75408a;
        }
    }

    public e(@l r0 r0Var) {
        kotlinx.coroutines.k.f(r0Var, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(e eVar, int i4, int i5) {
        if (i4 == eVar.passwordRevealFilter.c()) {
            return i5;
        }
        return 8226;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (kotlinx.coroutines.channels.p.m(this.resetTimerSignal.M(k2.f75408a))) {
            return;
        }
        this.passwordRevealFilter.e();
    }

    @l
    /* renamed from: e, reason: from getter */
    public final androidx.compose.foundation.text2.input.c getCodepointTransformation() {
        return this.codepointTransformation;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final q getFocusChangeModifier() {
        return this.focusChangeModifier;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final androidx.compose.foundation.text2.c getPasswordRevealFilter() {
        return this.passwordRevealFilter;
    }
}
