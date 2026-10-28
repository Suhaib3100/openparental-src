package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.i;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: SnapshotFlow.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", "context", "Landroidx/compose/runtime/b5;", "c", "(Lkotlinx/coroutines/flow/t0;Lkotlin/coroutines/g;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "R", "Lkotlinx/coroutines/flow/i;", "initial", "b", "(Lkotlinx/coroutines/flow/i;Ljava/lang/Object;Lkotlin/coroutines/g;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/b5;", "Lkotlin/Function0;", "block", "e", "(Lld/a;)Lkotlinx/coroutines/flow/i;", "Landroidx/collection/k2;", "", "", "set", "", "d", "(Landroidx/collection/k2;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@kotlin.jvm.internal.r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,181:1\n296#2,2:182\n267#2,4:184\n237#2,7:188\n248#2,3:196\n251#2,2:200\n272#2:202\n298#2,2:203\n273#2:205\n254#2,6:206\n274#2:212\n300#2:213\n1810#3:195\n1672#3:199\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n180#1:182,2\n180#1:184,4\n180#1:188,7\n180#1:196,3\n180#1:200,2\n180#1:202\n180#1:203,2\n180#1:205\n180#1:206,6\n180#1:212\n180#1:213\n180#1:195\n180#1:199\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class r4 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SnapshotFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", i = {}, l = {64, 65}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Landroidx/compose/runtime/y2;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/runtime/y2;)V"}, k = 3, mv = {1, 8, 0})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<y2<R>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16930b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16931c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.g f16932d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f16933e;

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.runtime.r4$a$a, reason: collision with other inner class name */
        static final class C0318a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y2<R> f16934b;

            C0318a(y2<R> y2Var) {
                this.f16934b = y2Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                this.f16934b.setValue(t4);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: SnapshotFlow.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f16935b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f16936c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ y2<R> f16937d;

            /* compiled from: SnapshotFlow.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.runtime.r4$a$b$a, reason: collision with other inner class name */
            static final class C0319a<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ y2<R> f16938b;

                C0319a(y2<R> y2Var) {
                    this.f16938b = y2Var;
                }

                @Override // kotlinx.coroutines.flow.j
                @fg.m
                public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    this.f16938b.setValue(t4);
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.flow.i<? extends T> iVar, y2<R> y2Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f16936c = iVar;
                this.f16937d = y2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new b(this.f16936c, this.f16937d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f16935b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.flow.i<T> iVar = this.f16936c;
                    C0319a c0319a = new C0319a(this.f16937d);
                    this.f16935b = 1;
                    if (iVar.a(c0319a, this) == aVar) {
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
                return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.coroutines.g gVar, kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f16932d = gVar;
            this.f16933e = iVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l y2<R> y2Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(y2Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f16932d, this.f16933e, dVar);
            aVar.f16931c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16930b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                y2 y2Var = (y2) this.f16931c;
                if (kotlin.jvm.internal.l0.g(this.f16932d, kotlin.coroutines.i.f75057b)) {
                    kotlinx.coroutines.flow.i<T> iVar = this.f16933e;
                    C0318a c0318a = new C0318a(y2Var);
                    this.f16930b = 1;
                    if (iVar.a(c0318a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    kotlin.coroutines.g gVar = this.f16932d;
                    b bVar = new b(this.f16933e, y2Var, null);
                    this.f16930b = 2;
                    if (kotlinx.coroutines.i.h(gVar, bVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SnapshotFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {144, 148, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,181:1\n129#2,5:182\n129#2,5:187\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n139#1:182,5\n162#1:187,5\n*E\n"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f16939b;

        /* renamed from: c, reason: collision with root package name */
        Object f16940c;

        /* renamed from: d, reason: collision with root package name */
        Object f16941d;

        /* renamed from: e, reason: collision with root package name */
        Object f16942e;

        /* renamed from: f, reason: collision with root package name */
        Object f16943f;

        /* renamed from: g, reason: collision with root package name */
        int f16944g;

        /* renamed from: h, reason: collision with root package name */
        int f16945h;

        /* renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f16946i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.a<T> f16947j;

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n+ 2 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n*L\n1#1,181:1\n52#2:182\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1\n*L\n116#1:182\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Object, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.collection.k2<Object> f16948b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.collection.k2<Object> k2Var) {
                super(1);
                this.f16948b = k2Var;
            }

            public final void a(@fg.l Object obj) {
                if (obj instanceof androidx.compose.runtime.snapshots.q0) {
                    i.Companion companion = androidx.compose.runtime.snapshots.i.INSTANCE;
                    ((androidx.compose.runtime.snapshots.q0) obj).y(4);
                }
                this.f16948b.C(obj);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Object obj) {
                a(obj);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/m;", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/m;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n*L\n1#1,181:1\n1747#2,2:182\n1749#2:185\n52#3:184\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1\n*L\n127#1:182,2\n127#1:185\n128#1:184\n*E\n"})
        /* renamed from: androidx.compose.runtime.r4$b$b, reason: collision with other inner class name */
        static final class C0320b extends kotlin.jvm.internal.n0 implements ld.p<Set<? extends Object>, androidx.compose.runtime.snapshots.m, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.l<Set<Object>> f16949b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0320b(kotlinx.coroutines.channels.l<Set<Object>> lVar) {
                super(2);
                this.f16949b = lVar;
            }

            public final void a(@fg.l Set<? extends Object> set, @fg.l androidx.compose.runtime.snapshots.m mVar) {
                Set<? extends Object> set2 = set;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    return;
                }
                for (T t4 : set2) {
                    if (t4 instanceof androidx.compose.runtime.snapshots.q0) {
                        i.Companion companion = androidx.compose.runtime.snapshots.i.INSTANCE;
                        if (((androidx.compose.runtime.snapshots.q0) t4).a(4)) {
                        }
                    }
                    this.f16949b.M(set);
                    return;
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.m mVar) {
                a(set, mVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.a<? extends T> aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f16947j = aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f16947j, dVar);
            bVar.f16946i = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00f7 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:14:0x00db, B:16:0x00df, B:20:0x00e9, B:24:0x00f7, B:30:0x010d, B:32:0x0116, B:42:0x0132, B:43:0x0135, B:56:0x004e, B:26:0x0102, B:29:0x010a, B:38:0x012e, B:39:0x0131), top: B:55:0x004e, inners: #1 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 332
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.r4.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @fg.l
    @i
    public static final <T extends R, R> b5<R> b(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, R r4, @fg.m kotlin.coroutines.g gVar, @fg.m t tVar, int i4, int i5) {
        tVar.P(-606625098);
        if ((i5 & 2) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if (x.b0()) {
            x.r0(-606625098, i4, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i6 = i4 >> 3;
        b5<R> b5 = q4.b(r4, iVar, gVar2, new a(gVar2, iVar, null), tVar, (i6 & 8) | 4672 | (i6 & 14));
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return b5;
    }

    @fg.l
    @i
    public static final <T> b5<T> c(@fg.l kotlinx.coroutines.flow.t0<? extends T> t0Var, @fg.m kotlin.coroutines.g gVar, @fg.m t tVar, int i4, int i5) {
        tVar.P(-1439883919);
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if (x.b0()) {
            x.r0(-1439883919, i4, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        b5<T> b5 = b(t0Var, t0Var.getValue(), gVar2, tVar, 520, 0);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return b5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.collection.k2<Object> k2Var, Set<? extends Object> set) {
        Object[] objArr = k2Var.elements;
        long[] jArr = k2Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                for (int i6 = 0; i6 < i5; i6++) {
                    if ((255 & j4) < 128 && set.contains(objArr[(i4 << 3) + i6])) {
                        return true;
                    }
                    j4 >>= 8;
                }
                if (i5 != 8) {
                    return false;
                }
            }
            if (i4 == length) {
                return false;
            }
            i4++;
        }
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@fg.l ld.a<? extends T> aVar) {
        return kotlinx.coroutines.flow.k.J0(new b(aVar, null));
    }
}
