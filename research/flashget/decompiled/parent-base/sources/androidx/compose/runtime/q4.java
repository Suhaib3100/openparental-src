package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: ProduceState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001af\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ap\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aj\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0015\"\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "initialValue", "Lkotlin/Function2;", "Landroidx/compose/runtime/y2;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "producer", "Landroidx/compose/runtime/b5;", "d", "(Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "key1", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "", "keys", "e", "(Ljava/lang/Object;[Ljava/lang/Object;Lld/p;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@kotlin.jvm.internal.r1({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,223:1\n25#2:224\n25#2:231\n25#2:238\n25#2:245\n25#2:252\n1116#3,6:225\n1116#3,6:232\n1116#3,6:239\n1116#3,6:246\n1116#3,6:253\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n81#1:224\n114#1:231\n148#1:238\n183#1:245\n216#1:252\n81#1:225,6\n114#1:232,6\n148#1:239,6\n183#1:246,6\n216#1:253,6\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class q4 {

    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", f = "ProduceState.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16899b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16900c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f16901d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k2<T> f16902e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, k2<T> k2Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f16901d = pVar;
            this.f16902e = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f16901d, this.f16902e, dVar);
            aVar.f16900c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16899b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16900c;
                ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f16901d;
                z2 z2Var = new z2(this.f16902e, r0Var.getCoroutineContext());
                this.f16899b = 1;
                if (pVar.invoke(z2Var, this) == obj2) {
                    return obj2;
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

    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$2", f = "ProduceState.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16903b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16904c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f16905d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k2<T> f16906e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, k2<T> k2Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f16905d = pVar;
            this.f16906e = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f16905d, this.f16906e, dVar);
            bVar.f16904c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16903b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16904c;
                ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f16905d;
                z2 z2Var = new z2(this.f16906e, r0Var.getCoroutineContext());
                this.f16903b = 1;
                if (pVar.invoke(z2Var, this) == obj2) {
                    return obj2;
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
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16907b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16908c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f16909d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k2<T> f16910e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, k2<T> k2Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f16909d = pVar;
            this.f16910e = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f16909d, this.f16910e, dVar);
            cVar.f16908c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16907b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16908c;
                ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f16909d;
                z2 z2Var = new z2(this.f16910e, r0Var.getCoroutineContext());
                this.f16907b = 1;
                if (pVar.invoke(z2Var, this) == obj2) {
                    return obj2;
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
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4", f = "ProduceState.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16911b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16912c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f16913d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k2<T> f16914e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, k2<T> k2Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f16913d = pVar;
            this.f16914e = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f16913d, this.f16914e, dVar);
            dVar2.f16912c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16911b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16912c;
                ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f16913d;
                z2 z2Var = new z2(this.f16914e, r0Var.getCoroutineContext());
                this.f16911b = 1;
                if (pVar.invoke(z2Var, this) == obj2) {
                    return obj2;
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

    /* compiled from: ProduceState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5", f = "ProduceState.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16915b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16916c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> f16917d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k2<T> f16918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, k2<T> k2Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f16917d = pVar;
            this.f16918e = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f16917d, this.f16918e, dVar);
            eVar.f16916c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            Object obj2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16915b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16916c;
                ld.p<y2<T>, kotlin.coroutines.d<? super kotlin.k2>, Object> pVar = this.f16917d;
                z2 z2Var = new z2(this.f16918e, r0Var.getCoroutineContext());
                this.f16915b = 1;
                if (pVar.invoke(z2Var, this) == obj2) {
                    return obj2;
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
            return ((e) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    @fg.l
    @i
    public static final <T> b5<T> a(T t4, @fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(1807205155);
        if (x.b0()) {
            x.r0(1807205155, i4, -1, "androidx.compose.runtime.produceState (ProduceState.kt:181)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = t4.g(t4, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        a1.f(obj, obj2, obj3, new d(pVar, k2Var, null), tVar, 4680);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    @fg.l
    @i
    public static final <T> b5<T> b(T t4, @fg.m Object obj, @fg.m Object obj2, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(-1703169085);
        if (x.b0()) {
            x.r0(-1703169085, i4, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = t4.g(t4, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        a1.g(obj, obj2, new c(pVar, k2Var, null), tVar, 584);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    @fg.l
    @i
    public static final <T> b5<T> c(T t4, @fg.m Object obj, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(-1928268701);
        if (x.b0()) {
            x.r0(-1928268701, i4, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = t4.g(t4, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        a1.h(obj, new b(pVar, k2Var, null), tVar, 72);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    @fg.l
    @i
    public static final <T> b5<T> d(T t4, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(10454275);
        if (x.b0()) {
            x.r0(10454275, i4, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = t4.g(t4, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        a1.h(kotlin.k2.f75408a, new a(pVar, k2Var, null), tVar, 70);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    @fg.l
    @i
    public static final <T> b5<T> e(T t4, @fg.l Object[] objArr, @fg.l ld.p<? super y2<T>, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar, @fg.m t tVar, int i4) {
        tVar.P(490154582);
        if (x.b0()) {
            x.r0(490154582, i4, -1, "androidx.compose.runtime.produceState (ProduceState.kt:214)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = t4.g(t4, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        a1.j(Arrays.copyOf(objArr, objArr.length), new e(pVar, k2Var, null), tVar, 72);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }
}
