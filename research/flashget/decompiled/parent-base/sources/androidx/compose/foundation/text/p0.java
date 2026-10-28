package androidx.compose.foundation.text;

import androidx.compose.animation.core.c1;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldCursor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0016\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/text/c1;", "state", "Landroidx/compose/ui/text/input/z0;", "value", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "", "enabled", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/c1;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/graphics/t1;Z)Landroidx/compose/ui/q;", "Landroidx/compose/animation/core/k;", "", "a", "Landroidx/compose/animation/core/k;", "cursorAnimationSpec", "Landroidx/compose/ui/unit/h;", "F", "c", "()F", "DefaultCursorThickness", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n154#2:104\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n97#1:104\n*E\n"})
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.k<Float> f7844a = androidx.compose.animation.core.l.f(androidx.compose.animation.core.l.g(b.f7859b), null, 0, 6, null);

    /* renamed from: b, reason: collision with root package name */
    private static final float f7845b = androidx.compose.ui.unit.h.g(2);

    /* compiled from: TextFieldCursor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,103:1\n25#2:104\n1116#3,6:105\n652#4:111\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n46#1:104\n46#1:105,6\n47#1:111\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t1 f7846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f7847c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7848d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7849e;

        /* compiled from: TextFieldCursor.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.p0$a$a, reason: collision with other inner class name */
        static final class C0146a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f7850b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f7851c;

            /* compiled from: TextFieldCursor.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", i = {}, l = {53, 55}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.p0$a$a$a, reason: collision with other inner class name */
            static final class C0147a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f7852b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f7853c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0147a(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, kotlin.coroutines.d<? super C0147a> dVar) {
                    super(2, dVar);
                    this.f7853c = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0147a(this.f7853c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f7852b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar = this.f7853c;
                        Float f4 = new Float(1.0f);
                        this.f7852b = 1;
                        if (bVar.C(f4, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a1.n(obj);
                            return k2.f75408a;
                        }
                        kotlin.a1.n(obj);
                    }
                    androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar2 = this.f7853c;
                    Float f5 = new Float(0.0f);
                    androidx.compose.animation.core.k kVar = p0.f7844a;
                    this.f7852b = 2;
                    if (androidx.compose.animation.core.b.i(bVar2, f5, kVar, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0147a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0146a(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, kotlin.coroutines.d<? super C0146a> dVar) {
                super(2, dVar);
                this.f7851c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0146a(this.f7851c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f7850b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    n nVar = n.f7834b;
                    C0147a c0147a = new C0147a(this.f7851c, null);
                    this.f7850b = 1;
                    if (kotlinx.coroutines.i.h(nVar, c0147a, this) == aVar) {
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

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0146a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* compiled from: TextFieldCursor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f7854b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.p0 f7855c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f7856d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c1 f7857e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ t1 f7858f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.ui.text.input.z0 z0Var, c1 c1Var, t1 t1Var) {
                super(1);
                this.f7854b = bVar;
                this.f7855c = p0Var;
                this.f7856d = z0Var;
                this.f7857e = c1Var;
                this.f7858f = t1Var;
            }

            public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
                i0.i iVar;
                androidx.compose.ui.text.n0 value;
                cVar.G6();
                float H = kotlin.ranges.s.H(this.f7854b.v().floatValue(), 0.0f, 1.0f);
                if (H == 0.0f) {
                    return;
                }
                int b5 = this.f7855c.b(androidx.compose.ui.text.t0.n(this.f7856d.getSelection()));
                e1 h4 = this.f7857e.h();
                if (h4 == null || (value = h4.getValue()) == null || (iVar = value.e(b5)) == null) {
                    iVar = new i0.i(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float v5 = cVar.v5(p0.c());
                float f4 = v5 / 2;
                float t4 = kotlin.ranges.s.t(kotlin.ranges.s.A(iVar.t() + f4, i0.n.t(cVar.e()) - f4), f4);
                androidx.compose.ui.graphics.drawscope.f.F6(cVar, this.f7858f, i0.g.a(t4, iVar.getTop()), i0.g.a(t4, iVar.j()), v5, 0, null, H, null, 0, 432, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
                a(cVar);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t1 t1Var, c1 c1Var, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var) {
            super(3);
            this.f7846b = t1Var;
            this.f7847c = c1Var;
            this.f7848d = z0Var;
            this.f7849e = p0Var;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return a(qVar, tVar, num.intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
        @fg.l
        @androidx.compose.runtime.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q r9, @fg.m androidx.compose.runtime.t r10, int r11) {
            /*
                r8 = this;
                r0 = 1634330012(0x6169e59c, float:2.6966478E20)
                r10.P(r0)
                boolean r1 = androidx.compose.runtime.x.b0()
                if (r1 == 0) goto L12
                r1 = -1
                java.lang.String r2 = "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)"
                androidx.compose.runtime.x.r0(r0, r11, r1, r2)
            L12:
                r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
                r10.P(r11)
                java.lang.Object r11 = r10.Q()
                androidx.compose.runtime.t$a r0 = androidx.compose.runtime.t.INSTANCE
                java.lang.Object r0 = r0.a()
                r1 = 0
                if (r11 != r0) goto L30
                r11 = 0
                r0 = 2
                r2 = 1065353216(0x3f800000, float:1.0)
                androidx.compose.animation.core.b r11 = androidx.compose.animation.core.c.b(r2, r11, r0, r1)
                r10.E(r11)
            L30:
                r10.p0()
                r3 = r11
                androidx.compose.animation.core.b r3 = (androidx.compose.animation.core.b) r3
                androidx.compose.ui.graphics.t1 r11 = r8.f7846b
                boolean r0 = r11 instanceof androidx.compose.ui.graphics.g6
                if (r0 == 0) goto L51
                androidx.compose.ui.graphics.g6 r11 = (androidx.compose.ui.graphics.g6) r11
                long r4 = r11.getValue()
                androidx.compose.ui.graphics.d2$a r11 = androidx.compose.ui.graphics.d2.INSTANCE
                r11.getClass()
                long r6 = androidx.compose.ui.graphics.d2.k()
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 != 0) goto L51
                r11 = 0
                goto L52
            L51:
                r11 = 1
            L52:
                androidx.compose.foundation.text.c1 r0 = r8.f7847c
                boolean r0 = r0.d()
                if (r0 == 0) goto L95
                androidx.compose.ui.text.input.z0 r0 = r8.f7848d
                long r4 = r0.getSelection()
                boolean r0 = androidx.compose.ui.text.t0.h(r4)
                if (r0 == 0) goto L95
                if (r11 == 0) goto L95
                androidx.compose.ui.text.input.z0 r11 = r8.f7848d
                androidx.compose.ui.text.e r11 = r11.getAnnotatedString()
                androidx.compose.ui.text.input.z0 r0 = r8.f7848d
                long r4 = r0.getSelection()
                androidx.compose.ui.text.t0 r0 = androidx.compose.ui.text.t0.b(r4)
                androidx.compose.foundation.text.p0$a$a r2 = new androidx.compose.foundation.text.p0$a$a
                r2.<init>(r3, r1)
                r1 = 512(0x200, float:7.17E-43)
                androidx.compose.runtime.a1.g(r11, r0, r2, r10, r1)
                androidx.compose.foundation.text.p0$a$b r11 = new androidx.compose.foundation.text.p0$a$b
                androidx.compose.ui.text.input.p0 r4 = r8.f7849e
                androidx.compose.ui.text.input.z0 r5 = r8.f7848d
                androidx.compose.foundation.text.c1 r6 = r8.f7847c
                androidx.compose.ui.graphics.t1 r7 = r8.f7846b
                r2 = r11
                r2.<init>(r3, r4, r5, r6, r7)
                androidx.compose.ui.q r9 = androidx.compose.ui.draw.l.d(r9, r11)
                goto L97
            L95:
                androidx.compose.ui.q$a r9 = androidx.compose.ui.q.INSTANCE
            L97:
                boolean r11 = androidx.compose.runtime.x.b0()
                if (r11 == 0) goto La0
                androidx.compose.runtime.x.q0()
            La0:
                r10.p0()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.p0.a.a(androidx.compose.ui.q, androidx.compose.runtime.t, int):androidx.compose.ui.q");
        }
    }

    /* compiled from: TextFieldCursor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<c1.b<Float>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f7859b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.a(valueOf, 0);
            bVar.a(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.a(valueOf2, 500);
            bVar.a(valueOf2, 999);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return k2.f75408a;
        }
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l c1 c1Var, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.l t1 t1Var, boolean z4) {
        return z4 ? androidx.compose.ui.i.j(qVar, null, new a(t1Var, c1Var, z0Var, p0Var), 1, null) : qVar;
    }

    public static final float c() {
        return f7845b;
    }
}
