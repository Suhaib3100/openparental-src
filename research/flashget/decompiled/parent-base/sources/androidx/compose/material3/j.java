package androidx.compose.material3;

import com.luck.picture.lib.config.Crop;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\u0014\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0081@¢\u0006\u0004\b\u0017\u0010\u0018\u001a2\u0010\u001b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0081@¢\u0006\u0004\b\u001b\u0010\u001c\u001aH\u0010#\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!\u0012\u0006\u0012\u0004\u0018\u00010\u00000 H\u0082@¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/material3/u4;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "Landroidx/compose/material3/t4;", "a", "(Lld/l;)Landroidx/compose/material3/t4;", "Landroidx/compose/ui/q;", "Landroidx/compose/material3/k;", "state", "Landroidx/compose/foundation/gestures/j0;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "d", "(Landroidx/compose/ui/q;Landroidx/compose/material3/k;Landroidx/compose/foundation/gestures/j0;ZZLandroidx/compose/foundation/interaction/k;)Landroidx/compose/ui/q;", "targetValue", "j", "(Landroidx/compose/material3/k;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "velocity", "f", "(Landroidx/compose/material3/k;Ljava/lang/Object;FLkotlin/coroutines/d;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "i", "(Lld/a;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/material3/m6;", "h", "()Landroidx/compose/material3/m6;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "", "velocity", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11722b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11723c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ float f11724d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k<T> f11725e;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {SyslogAppender.LOG_LOCAL6}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.j$a$a, reason: collision with other inner class name */
        static final class C0257a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f11726b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k<T> f11727c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f11728d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0257a(k<T> kVar, float f4, kotlin.coroutines.d<? super C0257a> dVar) {
                super(2, dVar);
                this.f11727c = kVar;
                this.f11728d = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0257a(this.f11727c, this.f11728d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f11726b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    k<T> kVar = this.f11727c;
                    float f4 = this.f11728d;
                    this.f11726b = 1;
                    if (kVar.K(f4, this) == aVar) {
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
                return ((C0257a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k<T> kVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f11725e = kVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return a(r0Var, f4.floatValue(), dVar);
        }

        @fg.m
        public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            a aVar = new a(this.f11725e, dVar);
            aVar.f11723c = r0Var;
            aVar.f11724d = f4;
            return aVar.invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f11722b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            kotlinx.coroutines.k.f((kotlinx.coroutines.r0) this.f11723c, null, null, new C0257a(this.f11725e, this.f11724d, null), 3, null);
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {Crop.REQUEST_EDIT_CROP}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/h;", "Landroidx/compose/material3/t4;", "anchors", "latestTarget", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.r<h, t4<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11729b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11730c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f11731d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f11732e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k<T> f11733f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f11734g;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "Lkotlin/k2;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<Float, Float, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11735b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.e f11736c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, k1.e eVar) {
                super(2);
                this.f11735b = hVar;
                this.f11736c = eVar;
            }

            public final void a(float f4, float f5) {
                this.f11735b.a(f4, f5);
                this.f11736c.f75326b = f4;
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4, Float f5) {
                a(f4.floatValue(), f5.floatValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k<T> kVar, float f4, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f11733f = kVar;
            this.f11734g = f4;
        }

        @Override // ld.r
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(@fg.l h hVar, @fg.l t4<T> t4Var, T t4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            b bVar = new b(this.f11733f, this.f11734g, dVar);
            bVar.f11730c = hVar;
            bVar.f11731d = t4Var;
            bVar.f11732e = t4;
            return bVar.invokeSuspend(kotlin.k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11729b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                h hVar = (h) this.f11730c;
                float e4 = ((t4) this.f11731d).e(this.f11732e);
                if (!Float.isNaN(e4)) {
                    k1.e eVar = new k1.e();
                    float x4 = Float.isNaN(this.f11733f.x()) ? 0.0f : this.f11733f.x();
                    eVar.f75326b = x4;
                    float f4 = this.f11734g;
                    androidx.compose.animation.core.k<Float> q4 = this.f11733f.q();
                    a aVar2 = new a(hVar, eVar);
                    this.f11730c = null;
                    this.f11731d = null;
                    this.f11729b = 1;
                    if (androidx.compose.animation.core.c2.c(x4, e4, f4, q4, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {732}, m = "restartable", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11737b;

        /* renamed from: c, reason: collision with root package name */
        int f11738c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f11737b = obj;
            this.f11738c |= Integer.MIN_VALUE;
            return j.i(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {735}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11739b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11740c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<I> f11741d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<I, kotlin.coroutines.d<? super kotlin.k2>, Object> f11742e;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h<kotlinx.coroutines.k2> f11743b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f11744c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<I, kotlin.coroutines.d<? super kotlin.k2>, Object> f11745d;

            /* compiled from: AnchoredDraggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {741}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.j$d$a$a, reason: collision with other inner class name */
            static final class C0258a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f11746b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.p<I, kotlin.coroutines.d<? super kotlin.k2>, Object> f11747c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ I f11748d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f11749e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0258a(ld.p<? super I, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, I i4, kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super C0258a> dVar) {
                    super(2, dVar);
                    this.f11747c = pVar;
                    this.f11748d = i4;
                    this.f11749e = r0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0258a(this.f11747c, this.f11748d, this.f11749e, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f11746b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        ld.p<I, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f11747c;
                        I i5 = this.f11748d;
                        this.f11746b = 1;
                        if (pVar.invoke(i5, this) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    kotlinx.coroutines.s0.d(this.f11749e, new g());
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((C0258a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            /* compiled from: AnchoredDraggable.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {738}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                Object f11750b;

                /* renamed from: c, reason: collision with root package name */
                Object f11751c;

                /* renamed from: d, reason: collision with root package name */
                Object f11752d;

                /* renamed from: e, reason: collision with root package name */
                /* synthetic */ Object f11753e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ a<T> f11754f;

                /* renamed from: g, reason: collision with root package name */
                int f11755g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f11754f = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f11753e = obj;
                    this.f11755g |= Integer.MIN_VALUE;
                    return this.f11754f.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(k1.h<kotlinx.coroutines.k2> hVar, kotlinx.coroutines.r0 r0Var, ld.p<? super I, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar) {
                this.f11743b = hVar;
                this.f11744c = r0Var;
                this.f11745d = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(I r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.compose.material3.j.d.a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.compose.material3.j$d$a$b r0 = (androidx.compose.material3.j.d.a.b) r0
                    int r1 = r0.f11755g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f11755g = r1
                    goto L18
                L13:
                    androidx.compose.material3.j$d$a$b r0 = new androidx.compose.material3.j$d$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f11753e
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f11755g
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r8 = r0.f11752d
                    kotlinx.coroutines.k2 r8 = (kotlinx.coroutines.k2) r8
                    java.lang.Object r8 = r0.f11751c
                    java.lang.Object r0 = r0.f11750b
                    androidx.compose.material3.j$d$a r0 = (androidx.compose.material3.j.d.a) r0
                    kotlin.a1.n(r9)
                    goto L5c
                L31:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L39:
                    kotlin.a1.n(r9)
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.k2> r9 = r7.f11743b
                    T r9 = r9.f75329b
                    kotlinx.coroutines.k2 r9 = (kotlinx.coroutines.k2) r9
                    if (r9 == 0) goto L5b
                    androidx.compose.material3.g r2 = new androidx.compose.material3.g
                    r2.<init>()
                    r9.b(r2)
                    r0.f11750b = r7
                    r0.f11751c = r8
                    r0.f11752d = r9
                    r0.f11755g = r3
                    java.lang.Object r9 = r9.j0(r0)
                    if (r9 != r1) goto L5b
                    return r1
                L5b:
                    r0 = r7
                L5c:
                    kotlin.jvm.internal.k1$h<kotlinx.coroutines.k2> r9 = r0.f11743b
                    kotlinx.coroutines.r0 r1 = r0.f11744c
                    kotlinx.coroutines.t0 r3 = kotlinx.coroutines.t0.UNDISPATCHED
                    androidx.compose.material3.j$d$a$a r4 = new androidx.compose.material3.j$d$a$a
                    ld.p<I, kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object> r0 = r0.f11745d
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    kotlinx.coroutines.k2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                    r9.f75329b = r8
                    kotlin.k2 r8 = kotlin.k2.f75408a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.j.d.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.a<? extends I> aVar, ld.p<? super I, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f11741d = aVar;
            this.f11742e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f11741d, this.f11742e, dVar);
            dVar2.f11740c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11739b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f11740c;
                k1.h hVar = new k1.h();
                kotlinx.coroutines.flow.i w4 = androidx.compose.runtime.o4.w(this.f11741d);
                a aVar2 = new a(hVar, r0Var, this.f11742e);
                this.f11739b = 1;
                if (w4.a(aVar2, this) == aVar) {
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
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/h;", "Landroidx/compose/material3/t4;", "anchors", "latestTarget", "Lkotlin/k2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class e<T> extends kotlin.coroutines.jvm.internal.o implements ld.r<h, t4<T>, T, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11756b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f11757c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f11758d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f11759e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // ld.r
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object i(@fg.l h hVar, @fg.l t4<T> t4Var, T t4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            e eVar = new e(4, dVar);
            eVar.f11757c = hVar;
            eVar.f11758d = t4Var;
            eVar.f11759e = t4;
            return eVar.invokeSuspend(kotlin.k2.f75408a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f11756b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a1.n(obj);
            h hVar = (h) this.f11757c;
            float e4 = ((t4) this.f11758d).e(this.f11759e);
            if (!Float.isNaN(e4)) {
                h.b(hVar, e4, 0.0f, 2, null);
            }
            return kotlin.k2.f75408a;
        }
    }

    @fg.l
    @f5
    public static final <T> t4<T> a(@fg.l ld.l<? super u4<T>, kotlin.k2> lVar) {
        u4 u4Var = new u4();
        lVar.invoke(u4Var);
        return new m6(u4Var.b());
    }

    @fg.l
    @f5
    public static final <T> androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l k<T> kVar, @fg.l androidx.compose.foundation.gestures.j0 j0Var, boolean z4, boolean z5, @fg.m androidx.compose.foundation.interaction.k kVar2) {
        return androidx.compose.foundation.gestures.b0.k(qVar, kVar.getDraggableState(), j0Var, z4, kVar2, kVar.C(), null, new a(kVar, null), z5, 32, null);
    }

    public static /* synthetic */ androidx.compose.ui.q e(androidx.compose.ui.q qVar, k kVar, androidx.compose.foundation.gestures.j0 j0Var, boolean z4, boolean z5, androidx.compose.foundation.interaction.k kVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i4 & 8) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        if ((i4 & 16) != 0) {
            kVar2 = null;
        }
        return d(qVar, kVar, j0Var, z6, z7, kVar2);
    }

    @f5
    @fg.m
    public static final <T> Object f(@fg.l k<T> kVar, T t4, float f4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object l4 = k.l(kVar, t4, null, new b(kVar, f4, null), dVar, 2, null);
        return l4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? l4 : kotlin.k2.f75408a;
    }

    public static /* synthetic */ Object g(k kVar, Object obj, float f4, kotlin.coroutines.d dVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            f4 = kVar.w();
        }
        return f(kVar, obj, f4, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> m6<T> h() {
        return new m6<>(kotlin.collections.z0.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object i(ld.a<? extends I> r4, ld.p<? super I, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends java.lang.Object> r5, kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.j.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.j$c r0 = (androidx.compose.material3.j.c) r0
            int r1 = r0.f11738c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11738c = r1
            goto L18
        L13:
            androidx.compose.material3.j$c r0 = new androidx.compose.material3.j$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11737b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f11738c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.a1.n(r6)     // Catch: androidx.compose.material3.g -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.a1.n(r6)
            androidx.compose.material3.j$d r6 = new androidx.compose.material3.j$d     // Catch: androidx.compose.material3.g -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.g -> L41
            r0.f11738c = r3     // Catch: androidx.compose.material3.g -> L41
            java.lang.Object r4 = kotlinx.coroutines.s0.g(r6, r0)     // Catch: androidx.compose.material3.g -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.j.i(ld.a, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    @f5
    @fg.m
    public static final <T> Object j(@fg.l k<T> kVar, T t4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        Object l4 = k.l(kVar, t4, null, new e(4, null), dVar, 2, null);
        return l4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? l4 : kotlin.k2.f75408a;
    }
}
