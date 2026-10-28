package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldPressGestureFilter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "Li0/f;", "Lkotlin/k2;", "onTap", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/interaction/k;ZLld/l;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x0 {

    /* compiled from: TextFieldPressGestureFilter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,85:1\n487#2,4:86\n491#2,2:94\n495#2:100\n25#3:90\n25#3:101\n1116#4,3:91\n1119#4,3:97\n1116#4,6:102\n1116#4,6:108\n487#5:96\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n41#1:86,4\n41#1:94,2\n41#1:100\n41#1:90\n42#1:101\n41#1:91,3\n41#1:97,3\n42#1:102,6\n44#1:108,6\n41#1:96\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<i0.f, k2> f8290b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8291c;

        /* compiled from: TextFieldPressGestureFilter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,85:1\n64#2,5:86\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n45#1:86,5\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.x0$a$a, reason: collision with other inner class name */
        static final class C0165a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<m.b> f8292b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f8293c;

            /* compiled from: Effects.kt */
            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1\n*L\n1#1,497:1\n46#2,6:498\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.x0$a$a$a, reason: collision with other inner class name */
            public static final class C0166a implements androidx.compose.runtime.v0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.k2 f8294a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.k f8295b;

                public C0166a(androidx.compose.runtime.k2 k2Var, androidx.compose.foundation.interaction.k kVar) {
                    this.f8294a = k2Var;
                    this.f8295b = kVar;
                }

                @Override // androidx.compose.runtime.v0
                public void dispose() {
                    m.b bVar = (m.b) this.f8294a.getValue();
                    if (bVar != null) {
                        m.a aVar = new m.a(bVar);
                        androidx.compose.foundation.interaction.k kVar = this.f8295b;
                        if (kVar != null) {
                            kVar.b(aVar);
                        }
                        this.f8294a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0165a(androidx.compose.runtime.k2<m.b> k2Var, androidx.compose.foundation.interaction.k kVar) {
                super(1);
                this.f8292b = k2Var;
                this.f8293c = kVar;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
                return new C0166a(this.f8292b, this.f8293c);
            }
        }

        /* compiled from: TextFieldPressGestureFilter.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f8296b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f8297c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f8298d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<m.b> f8299e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.interaction.k f8300f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b5<ld.l<i0.f, k2>> f8301g;

            /* compiled from: TextFieldPressGestureFilter.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/l0;", "Li0/f;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/l0;Li0/f;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.x0$a$b$a, reason: collision with other inner class name */
            static final class C0167a extends kotlin.coroutines.jvm.internal.o implements ld.q<androidx.compose.foundation.gestures.l0, i0.f, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f8302b;

                /* renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f8303c;

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ long f8304d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f8305e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.k2<m.b> f8306f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.interaction.k f8307g;

                /* compiled from: TextFieldPressGestureFilter.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.text.x0$a$b$a$a, reason: collision with other inner class name */
                static final class C0168a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    Object f8308b;

                    /* renamed from: c, reason: collision with root package name */
                    int f8309c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.k2<m.b> f8310d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ long f8311e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.k f8312f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0168a(androidx.compose.runtime.k2<m.b> k2Var, long j4, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d<? super C0168a> dVar) {
                        super(2, dVar);
                        this.f8310d = k2Var;
                        this.f8311e = j4;
                        this.f8312f = kVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0168a(this.f8310d, this.f8311e, this.f8312f, dVar);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
                        /*
                            r7 = this;
                            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                            int r1 = r7.f8309c
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L25
                            if (r1 == r4) goto L1d
                            if (r1 != r3) goto L15
                            java.lang.Object r0 = r7.f8308b
                            androidx.compose.foundation.interaction.m$b r0 = (androidx.compose.foundation.interaction.m.b) r0
                            kotlin.a1.n(r8)
                            goto L64
                        L15:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1d:
                            java.lang.Object r1 = r7.f8308b
                            androidx.compose.runtime.k2 r1 = (androidx.compose.runtime.k2) r1
                            kotlin.a1.n(r8)
                            goto L49
                        L25:
                            kotlin.a1.n(r8)
                            androidx.compose.runtime.k2<androidx.compose.foundation.interaction.m$b> r8 = r7.f8310d
                            java.lang.Object r8 = r8.getValue()
                            androidx.compose.foundation.interaction.m$b r8 = (androidx.compose.foundation.interaction.m.b) r8
                            if (r8 == 0) goto L4d
                            androidx.compose.foundation.interaction.k r1 = r7.f8312f
                            androidx.compose.runtime.k2<androidx.compose.foundation.interaction.m$b> r5 = r7.f8310d
                            androidx.compose.foundation.interaction.m$a r6 = new androidx.compose.foundation.interaction.m$a
                            r6.<init>(r8)
                            if (r1 == 0) goto L4a
                            r7.f8308b = r5
                            r7.f8309c = r4
                            java.lang.Object r8 = r1.a(r6, r7)
                            if (r8 != r0) goto L48
                            return r0
                        L48:
                            r1 = r5
                        L49:
                            r5 = r1
                        L4a:
                            r5.setValue(r2)
                        L4d:
                            androidx.compose.foundation.interaction.m$b r8 = new androidx.compose.foundation.interaction.m$b
                            long r4 = r7.f8311e
                            r8.<init>(r4, r2)
                            androidx.compose.foundation.interaction.k r1 = r7.f8312f
                            if (r1 == 0) goto L65
                            r7.f8308b = r8
                            r7.f8309c = r3
                            java.lang.Object r1 = r1.a(r8, r7)
                            if (r1 != r0) goto L63
                            return r0
                        L63:
                            r0 = r8
                        L64:
                            r8 = r0
                        L65:
                            androidx.compose.runtime.k2<androidx.compose.foundation.interaction.m$b> r0 = r7.f8310d
                            r0.setValue(r8)
                            kotlin.k2 r8 = kotlin.k2.f75408a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.x0.a.b.C0167a.C0168a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((C0168a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                    }
                }

                /* compiled from: TextFieldPressGestureFilter.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.text.x0$a$b$a$b, reason: collision with other inner class name */
                static final class C0169b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    Object f8313b;

                    /* renamed from: c, reason: collision with root package name */
                    int f8314c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.k2<m.b> f8315d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ boolean f8316e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.interaction.k f8317f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0169b(androidx.compose.runtime.k2<m.b> k2Var, boolean z4, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d<? super C0169b> dVar) {
                        super(2, dVar);
                        this.f8315d = k2Var;
                        this.f8316e = z4;
                        this.f8317f = kVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        return new C0169b(this.f8315d, this.f8316e, this.f8317f, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    public final Object invokeSuspend(@fg.l Object obj) {
                        androidx.compose.runtime.k2<m.b> k2Var;
                        androidx.compose.runtime.k2<m.b> k2Var2;
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                        int i4 = this.f8314c;
                        if (i4 == 0) {
                            kotlin.a1.n(obj);
                            m.b value = this.f8315d.getValue();
                            if (value != null) {
                                boolean z4 = this.f8316e;
                                androidx.compose.foundation.interaction.k kVar = this.f8317f;
                                k2Var = this.f8315d;
                                androidx.compose.foundation.interaction.h cVar = z4 ? new m.c(value) : new m.a(value);
                                if (kVar != null) {
                                    this.f8313b = k2Var;
                                    this.f8314c = 1;
                                    if (kVar.a(cVar, this) == aVar) {
                                        return aVar;
                                    }
                                    k2Var2 = k2Var;
                                }
                                k2Var.setValue(null);
                            }
                            return k2.f75408a;
                        }
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k2Var2 = (androidx.compose.runtime.k2) this.f8313b;
                        kotlin.a1.n(obj);
                        k2Var = k2Var2;
                        k2Var.setValue(null);
                        return k2.f75408a;
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                        return ((C0169b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0167a(kotlinx.coroutines.r0 r0Var, androidx.compose.runtime.k2<m.b> k2Var, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.d<? super C0167a> dVar) {
                    super(3, dVar);
                    this.f8305e = r0Var;
                    this.f8306f = k2Var;
                    this.f8307g = kVar;
                }

                @Override // ld.q
                public /* bridge */ /* synthetic */ Object R(androidx.compose.foundation.gestures.l0 l0Var, i0.f fVar, kotlin.coroutines.d<? super k2> dVar) {
                    return a(l0Var, fVar.getPackedValue(), dVar);
                }

                @fg.m
                public final Object a(@fg.l androidx.compose.foundation.gestures.l0 l0Var, long j4, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    C0167a c0167a = new C0167a(this.f8305e, this.f8306f, this.f8307g, dVar);
                    c0167a.f8303c = l0Var;
                    c0167a.f8304d = j4;
                    return c0167a.invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f8302b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.foundation.gestures.l0 l0Var = (androidx.compose.foundation.gestures.l0) this.f8303c;
                        kotlinx.coroutines.k.f(this.f8305e, null, null, new C0168a(this.f8306f, this.f8304d, this.f8307g, null), 3, null);
                        this.f8302b = 1;
                        obj = l0Var.A2(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    kotlinx.coroutines.k.f(this.f8305e, null, null, new C0169b(this.f8306f, ((Boolean) obj).booleanValue(), this.f8307g, null), 3, null);
                    return k2.f75408a;
                }
            }

            /* compiled from: TextFieldPressGestureFilter.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.x0$a$b$b, reason: collision with other inner class name */
            static final class C0170b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ b5<ld.l<i0.f, k2>> f8318b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0170b(b5<? extends ld.l<? super i0.f, k2>> b5Var) {
                    super(1);
                    this.f8318b = b5Var;
                }

                public final void a(long j4) {
                    this.f8318b.getValue().invoke(i0.f.d(j4));
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
                    a(fVar.getPackedValue());
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.r0 r0Var, androidx.compose.runtime.k2<m.b> k2Var, androidx.compose.foundation.interaction.k kVar, b5<? extends ld.l<? super i0.f, k2>> b5Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f8298d = r0Var;
                this.f8299e = k2Var;
                this.f8300f = kVar;
                this.f8301g = b5Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((b) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f8298d, this.f8299e, this.f8300f, this.f8301g, dVar);
                bVar.f8297c = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8296b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8297c;
                    C0167a c0167a = new C0167a(this.f8298d, this.f8299e, this.f8300f, null);
                    C0170b c0170b = new C0170b(this.f8301g);
                    this.f8296b = 1;
                    if (androidx.compose.foundation.gestures.z0.j(k0Var, c0167a, c0170b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super i0.f, k2> lVar, androidx.compose.foundation.interaction.k kVar) {
            super(3);
            this.f8290b = lVar;
            this.f8291c = kVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-102778667);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-102778667, i4, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object a5 = androidx.compose.foundation.j.a(tVar, 773894976, -492369756);
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            if (a5 == companion.a()) {
                a5 = androidx.view.compose.l.a(androidx.compose.runtime.a1.m(kotlin.coroutines.i.f75057b, tVar), tVar);
            }
            tVar.p0();
            kotlinx.coroutines.r0 coroutineScope = ((androidx.compose.runtime.j0) a5).getCoroutineScope();
            tVar.p0();
            tVar.P(-492369756);
            Object Q = tVar.Q();
            if (Q == companion.a()) {
                Q = t4.g(null, null, 2, null);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
            b5 u4 = o4.u(this.f8290b, tVar, 0);
            androidx.compose.foundation.interaction.k kVar = this.f8291c;
            tVar.P(922652220);
            boolean q02 = tVar.q0(k2Var) | tVar.q0(this.f8291c);
            androidx.compose.foundation.interaction.k kVar2 = this.f8291c;
            Object Q2 = tVar.Q();
            if (q02 || Q2 == companion.a()) {
                Q2 = new C0165a(k2Var, kVar2);
                tVar.E(Q2);
            }
            tVar.p0();
            androidx.compose.runtime.a1.c(kVar, (ld.l) Q2, tVar, 0);
            q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
            androidx.compose.foundation.interaction.k kVar3 = this.f8291c;
            androidx.compose.ui.q e4 = androidx.compose.ui.input.pointer.u0.e(companion2, kVar3, new b(coroutineScope, k2Var, kVar3, u4, null));
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return e4;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.foundation.interaction.k kVar, boolean z4, @fg.l ld.l<? super i0.f, k2> lVar) {
        return z4 ? androidx.compose.ui.i.j(qVar, null, new a(lVar, kVar), 1, null) : qVar;
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, androidx.compose.foundation.interaction.k kVar, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return a(qVar, kVar, z4, lVar);
    }
}
