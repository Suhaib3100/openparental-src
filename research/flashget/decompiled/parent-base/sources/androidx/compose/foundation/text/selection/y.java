package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.h0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.i5;
import com.android.internal.telephony.SmsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: SelectionContainer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00030\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "c", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "a", "(Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/foundation/text/selection/q;", "selection", "Lkotlin/Function1;", "onSelectionChange", "children", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/selection/q;Lld/l;Lld/p;Landroidx/compose/runtime/t;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,151:1\n25#2:152\n25#2:165\n1116#3,6:153\n1116#3,6:159\n1116#3,6:166\n74#4:172\n74#4:173\n74#4:174\n38#5,2:175\n81#6:177\n107#6,2:178\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n44#1:152\n90#1:165\n44#1:153,6\n48#1:159,6\n90#1:166,6\n92#1:172\n93#1:173\n94#1:174\n98#1:175,2\n44#1:177\n44#1:178,2\n*E\n"})
/* loaded from: classes.dex */
public final class y {

    /* compiled from: SelectionContainer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f8185b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f8185b = pVar;
            this.f8186c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            y.a(this.f8185b, tVar, g3.b(this.f8186c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/q;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/selection/q;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<q, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<q> f8187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.k2<q> k2Var) {
            super(1);
            this.f8187b = k2Var;
        }

        public final void a(@fg.m q qVar) {
            this.f8187b.setValue(qVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(q qVar) {
            a(qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f8188b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f8189c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8190d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8191e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f8188b = qVar;
            this.f8189c = pVar;
            this.f8190d = i4;
            this.f8191e = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            y.c(this.f8188b, this.f8189c, tVar, g3.b(this.f8190d | 1), this.f8191e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f8192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0 f8193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f8194d;

        /* compiled from: SelectionContainer.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,151:1\n33#2,4:152\n38#2:170\n36#3:156\n36#3:163\n1116#4,6:157\n1116#4,6:164\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$3$1$1\n*L\n109#1:152,4\n109#1:170\n110#1:156\n114#1:163\n110#1:157,6\n114#1:164,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f8195b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f8196c;

            /* compiled from: SelectionContainer.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1", f = "SelectionContainer.kt", i = {}, l = {SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.selection.y$d$a$a, reason: collision with other inner class name */
            static final class C0163a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f8197b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f8198c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.text.o0 f8199d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0163a(androidx.compose.foundation.text.o0 o0Var, kotlin.coroutines.d<? super C0163a> dVar) {
                    super(2, dVar);
                    this.f8199d = o0Var;
                }

                @Override // ld.p
                @fg.m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0163a) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    C0163a c0163a = new C0163a(this.f8199d, dVar);
                    c0163a.f8198c = obj;
                    return c0163a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f8197b;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8198c;
                        androidx.compose.foundation.text.o0 o0Var = this.f8199d;
                        this.f8197b = 1;
                        if (androidx.compose.foundation.text.g0.c(k0Var, o0Var, this) == aVar) {
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
            }

            /* compiled from: SelectionContainer.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<i0.f> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h0 f8200b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(h0 h0Var) {
                    super(0);
                    this.f8200b = h0Var;
                }

                public final long a() {
                    i0.f M = this.f8200b.M();
                    if (M != null) {
                        return M.getPackedValue();
                    }
                    i0.f.INSTANCE.getClass();
                    return i0.f.f74149e;
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ i0.f invoke() {
                    return i0.f.d(a());
                }
            }

            /* compiled from: SelectionContainer.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
            static final class c extends kotlin.jvm.internal.n0 implements ld.a<i0.f> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h0 f8201b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(h0 h0Var) {
                    super(0);
                    this.f8201b = h0Var;
                }

                public final long a() {
                    i0.f z4 = this.f8201b.z();
                    if (z4 != null) {
                        return z4.getPackedValue();
                    }
                    i0.f.INSTANCE.getClass();
                    return i0.f.f74149e;
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ i0.f invoke() {
                    return i0.f.d(a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, h0 h0Var) {
                super(2);
                this.f8195b = pVar;
                this.f8196c = h0Var;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                q I;
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1375295262, i4, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:102)");
                }
                this.f8195b.invoke(tVar, 0);
                if (this.f8196c.P() && this.f8196c.C() && !this.f8196c.R() && (I = this.f8196c.I()) != null) {
                    h0 h0Var = this.f8196c;
                    List O = kotlin.collections.w.O(Boolean.TRUE, Boolean.FALSE);
                    int size = O.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Boolean bool = (Boolean) O.get(i5);
                        boolean booleanValue = bool.booleanValue();
                        tVar.P(1157296644);
                        boolean q02 = tVar.q0(bool);
                        Object Q = tVar.Q();
                        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                            h0Var.getClass();
                            Q = new h0.j(booleanValue, h0Var);
                            tVar.E(Q);
                        }
                        tVar.p0();
                        androidx.compose.foundation.text.o0 o0Var = (androidx.compose.foundation.text.o0) Q;
                        tVar.P(1157296644);
                        boolean q03 = tVar.q0(bool);
                        Object Q2 = tVar.Q();
                        if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                            Q2 = booleanValue ? new b(h0Var) : new c(h0Var);
                            tVar.E(Q2);
                        }
                        tVar.p0();
                        androidx.compose.foundation.text.selection.a.b(new h((ld.a) Q2), booleanValue, booleanValue ? I.h().f() : I.f().f(), I.g(), androidx.compose.ui.input.pointer.u0.e(androidx.compose.ui.q.INSTANCE, o0Var, new C0163a(o0Var, null)), tVar, 0);
                    }
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.q qVar, h0 h0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            super(2);
            this.f8192b = qVar;
            this.f8193c = h0Var;
            this.f8194d = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(935424596, i4, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:101)");
            }
            p0.a(this.f8192b.w3(this.f8193c.D()), androidx.compose.runtime.internal.c.b(tVar, 1375295262, true, new a(this.f8194d, this.f8193c)), tVar, 48, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,151:1\n64#2,5:152\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n*L\n145#1:152,5\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f8202b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n*L\n1#1,497:1\n146#2,3:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f8203a;

            public a(h0 h0Var) {
                this.f8203a = h0Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f8203a.T();
                this.f8203a.g0(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h0 h0Var) {
            super(1);
            this.f8202b = h0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f8202b);
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f8204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f8205c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<q, k2> f8206d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f8207e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8208f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.q qVar, q qVar2, ld.l<? super q, k2> lVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f8204b = qVar;
            this.f8205c = qVar2;
            this.f8206d = lVar;
            this.f8207e = pVar;
            this.f8208f = i4;
            this.f8209g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            y.b(this.f8204b, this.f8205c, this.f8206d, this.f8207e, tVar, g3.b(this.f8208f | 1), this.f8209g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/n0;", "a", "()Landroidx/compose/foundation/text/selection/n0;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<n0> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f8210b = new g(0);

        g() {
            super(0);
        }

        @fg.l
        public final n0 a() {
            return new n0();
        }

        @Override // ld.a
        public n0 invoke() {
            return new n0();
        }
    }

    /* compiled from: SelectionContainer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h implements n, kotlin.jvm.internal.d0 {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ ld.a f8211b;

        h(ld.a aVar) {
            this.f8211b = aVar;
        }

        @Override // androidx.compose.foundation.text.selection.n
        public final /* synthetic */ long a() {
            return ((i0.f) this.f8211b.invoke()).getPackedValue();
        }

        @Override // kotlin.jvm.internal.d0
        @fg.l
        public final kotlin.v<?> d() {
            return this.f8211b;
        }

        public final boolean equals(@fg.m Object obj) {
            if ((obj instanceof n) && (obj instanceof kotlin.jvm.internal.d0)) {
                return kotlin.jvm.internal.l0.g(this.f8211b, ((kotlin.jvm.internal.d0) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return this.f8211b.hashCode();
        }
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(336063542);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(336063542, i5, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:61)");
            }
            androidx.compose.runtime.f0.b(o0.a().e(null), pVar, o4, (i5 << 3) & 112);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(pVar, i4));
        }
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(@fg.m androidx.compose.ui.q qVar, @fg.m q qVar2, @fg.l ld.l<? super q, k2> lVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(2078139907);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(qVar2) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.S(lVar) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= o4.S(pVar) ? 2048 : 1024;
        }
        if ((i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2078139907, i6, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:84)");
            }
            n0.INSTANCE.getClass();
            n0 n0Var = (n0) androidx.compose.runtime.saveable.d.d(new Object[0], n0.f8063q, null, g.f8210b, o4, 3144, 4);
            o4.P(-492369756);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new h0(n0Var);
                o4.E(Q);
            }
            o4.p0();
            h0 h0Var = (h0) Q;
            h0Var.f0((k0.a) o4.x(h1.n()));
            h0Var.X((f1) o4.x(h1.h()));
            h0Var.n0((i5) o4.x(h1.t()));
            h0Var.i0(lVar);
            h0Var.k0(qVar2);
            o4.P(605522716);
            androidx.compose.runtime.f0.b(o0.a().e(n0Var), androidx.compose.runtime.internal.c.b(o4, 935424596, true, new d(qVar, h0Var, pVar)), o4, 48);
            o4.p0();
            androidx.compose.runtime.a1.c(h0Var, new e(h0Var), o4, 8);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar3 = qVar;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(qVar3, qVar2, lVar, pVar, i4, i5));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(@fg.m androidx.compose.ui.q qVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-1075498320);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1075498320, i6, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:42)");
            }
            o4.P(-492369756);
            Object Q = o4.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (Q == companion.a()) {
                Q = t4.g(null, null, 2, null);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
            q qVar2 = (q) k2Var.getValue();
            o4.P(-1349159852);
            boolean q02 = o4.q0(k2Var);
            Object Q2 = o4.Q();
            if (q02 || Q2 == companion.a()) {
                Q2 = new b(k2Var);
                o4.E(Q2);
            }
            o4.p0();
            b(qVar, qVar2, (ld.l) Q2, pVar, o4, (i6 & 14) | ((i6 << 6) & 7168), 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(qVar, pVar, i4, i5));
        }
    }

    private static final q d(androidx.compose.runtime.k2<q> k2Var) {
        return k2Var.getValue();
    }

    private static final void e(androidx.compose.runtime.k2<q> k2Var, q qVar) {
        k2Var.setValue(qVar);
    }

    public static final void f(androidx.compose.runtime.k2 k2Var, q qVar) {
        k2Var.setValue(qVar);
    }
}
