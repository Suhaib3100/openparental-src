package android.content.core;

import d5.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import q3.l;
import q3.p;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/datastore/core/d;", "T", "", "<init>", "()V", "a", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\t\u001a\u00020\b\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ[\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/d$a;", "", "T", "", "Landroidx/datastore/core/c;", "migrations", "Landroidx/datastore/core/h;", "api", "Lkotlin/m2;", "c", "(Ljava/util/List;Landroidx/datastore/core/h;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "Lkotlin/coroutines/d;", "b", "(Ljava/util/List;)Lq3/p;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.core.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@"}, d2 = {"T", "Landroidx/datastore/core/h;", "api", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.datastore.core.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0072a extends SuspendLambda implements p<h<T>, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f6940s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f6941t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ List<android.content.core.c<T>> f6942u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0072a(List<? extends android.content.core.c<T>> list, Continuation<? super C0072a> continuation) {
                super(2, continuation);
                this.f6942u = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f6940s;
                if (i5 == 0) {
                    a1.n(obj);
                    h hVar = (h) this.f6941t;
                    Companion companion = d.INSTANCE;
                    List<android.content.core.c<T>> list = this.f6942u;
                    this.f6940s = 1;
                    if (companion.c(list, hVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d h<T> hVar, @e Continuation<? super m2> continuation) {
                return ((C0072a) c(hVar, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@e Object obj, @d5.d Continuation<?> continuation) {
                C0072a c0072a = new C0072a(this.f6942u, continuation);
                c0072a.f6941t = obj;
                return c0072a;
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.datastore.core.d$a$b */
        /* loaded from: classes3.dex */
        static final class b<T> extends ContinuationImpl {

            /* renamed from: r, reason: collision with root package name */
            Object f6943r;

            /* renamed from: s, reason: collision with root package name */
            Object f6944s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f6945t;

            /* renamed from: v, reason: collision with root package name */
            int f6947v;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            public final Object A(@d5.d Object obj) {
                this.f6945t = obj;
                this.f6947v |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H\u008a@"}, d2 = {"T", "startingData", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.datastore.core.d$a$c */
        /* loaded from: classes4.dex */
        static final class c extends SuspendLambda implements p<T, Continuation<? super T>, Object> {

            /* renamed from: s, reason: collision with root package name */
            Object f6948s;

            /* renamed from: t, reason: collision with root package name */
            Object f6949t;

            /* renamed from: u, reason: collision with root package name */
            Object f6950u;

            /* renamed from: v, reason: collision with root package name */
            int f6951v;

            /* renamed from: w, reason: collision with root package name */
            /* synthetic */ Object f6952w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ List<android.content.core.c<T>> f6953x;

            /* renamed from: y, reason: collision with root package name */
            final /* synthetic */ List<l<Continuation<? super m2>, Object>> f6954y;

            /* compiled from: DataMigrationInitializer.kt */
            @DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.datastore.core.d$a$c$a, reason: collision with other inner class name */
            static final class C0073a extends SuspendLambda implements l<Continuation<? super m2>, Object> {

                /* renamed from: s, reason: collision with root package name */
                int f6955s;

                /* renamed from: t, reason: collision with root package name */
                final /* synthetic */ android.content.core.c<T> f6956t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0073a(android.content.core.c<T> cVar, Continuation<? super C0073a> continuation) {
                    super(1, continuation);
                    this.f6956t = cVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @e
                public final Object A(@d5.d Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.f6955s;
                    if (i5 == 0) {
                        a1.n(obj);
                        android.content.core.c<T> cVar = this.f6956t;
                        this.f6955s = 1;
                        if (cVar.a(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                    }
                    return m2.f23662a;
                }

                @Override // q3.l
                @e
                /* renamed from: R, reason: merged with bridge method [inline-methods] */
                public final Object N(@e Continuation<? super m2> continuation) {
                    return ((C0073a) w(continuation)).A(m2.f23662a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.d
                public final Continuation<m2> w(@d5.d Continuation<?> continuation) {
                    return new C0073a(this.f6956t, continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends android.content.core.c<T>> list, List<l<Continuation<? super m2>, Object>> list2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f6953x = list;
                this.f6954y = list2;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object A(@d5.d java.lang.Object r11) {
                /*
                    r10 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r10.f6951v
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L38
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r10.f6948s
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f6952w
                    java.util.List r4 = (java.util.List) r4
                    kotlin.a1.n(r11)
                    r7 = r10
                    goto L8a
                L1a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L22:
                    java.lang.Object r1 = r10.f6950u
                    java.lang.Object r4 = r10.f6949t
                    androidx.datastore.core.c r4 = (android.content.core.c) r4
                    java.lang.Object r5 = r10.f6948s
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f6952w
                    java.util.List r6 = (java.util.List) r6
                    kotlin.a1.n(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L68
                L38:
                    kotlin.a1.n(r11)
                    java.lang.Object r11 = r10.f6952w
                    java.util.List<androidx.datastore.core.c<T>> r1 = r10.f6953x
                    java.util.List<q3.l<kotlin.coroutines.d<? super kotlin.m2>, java.lang.Object>> r4 = r10.f6954y
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L46:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L8f
                    java.lang.Object r6 = r1.next()
                    androidx.datastore.core.c r6 = (android.content.core.c) r6
                    r5.f6952w = r4
                    r5.f6948s = r1
                    r5.f6949t = r6
                    r5.f6950u = r11
                    r5.f6951v = r3
                    java.lang.Object r7 = r6.b(r11, r5)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L68:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8c
                    androidx.datastore.core.d$a$c$a r11 = new androidx.datastore.core.d$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f6952w = r4
                    r7.f6948s = r5
                    r7.f6949t = r8
                    r7.f6950u = r8
                    r7.f6951v = r2
                    java.lang.Object r11 = r6.c(r1, r7)
                    if (r11 != r0) goto L8d
                    return r0
                L8a:
                    r5 = r7
                    goto L46
                L8c:
                    r11 = r1
                L8d:
                    r1 = r5
                    goto L8a
                L8f:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: android.content.core.d.Companion.c.A(java.lang.Object):java.lang.Object");
            }

            @Override // q3.p
            @e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(T t5, @e Continuation<? super T> continuation) {
                return ((c) c(t5, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@e Object obj, @d5.d Continuation<?> continuation) {
                c cVar = new c(this.f6953x, this.f6954y, continuation);
                cVar.f6952w = obj;
                return cVar;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0084 -> B:13:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0087 -> B:13:0x0067). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends android.content.core.c<T>> r7, android.content.core.h<T> r8, kotlin.coroutines.Continuation<? super kotlin.m2> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof android.content.core.d.Companion.b
                if (r0 == 0) goto L13
                r0 = r9
                androidx.datastore.core.d$a$b r0 = (android.content.core.d.Companion.b) r0
                int r1 = r0.f6947v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f6947v = r1
                goto L18
            L13:
                androidx.datastore.core.d$a$b r0 = new androidx.datastore.core.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f6945t
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f6947v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r7 = r0.f6944s
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f6943r
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L32
                goto L67
            L32:
                r9 = move-exception
                goto L80
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3c:
                java.lang.Object r7 = r0.f6943r
                java.util.List r7 = (java.util.List) r7
                kotlin.a1.n(r9)
                goto L5e
            L44:
                kotlin.a1.n(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                androidx.datastore.core.d$a$c r2 = new androidx.datastore.core.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f6943r = r9
                r0.f6947v = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5d
                return r1
            L5d:
                r7 = r9
            L5e:
                kotlin.jvm.internal.k1$h r8 = new kotlin.jvm.internal.k1$h
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L67:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r7.next()
                q3.l r9 = (q3.l) r9
                r0.f6943r = r8     // Catch: java.lang.Throwable -> L32
                r0.f6944s = r7     // Catch: java.lang.Throwable -> L32
                r0.f6947v = r3     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.N(r0)     // Catch: java.lang.Throwable -> L32
                if (r9 != r1) goto L67
                return r1
            L80:
                T r2 = r8.f23572o
                if (r2 != 0) goto L87
                r8.f23572o = r9
                goto L67
            L87:
                kotlin.jvm.internal.l0.m(r2)
                T r2 = r8.f23572o
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.o.a(r2, r9)
                goto L67
            L92:
                T r7 = r8.f23572o
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9b
                kotlin.m2 r7 = kotlin.m2.f23662a
                return r7
            L9b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: android.content.core.d.Companion.c(java.util.List, androidx.datastore.core.h, kotlin.coroutines.d):java.lang.Object");
        }

        @d5.d
        public final <T> p<h<T>, Continuation<? super m2>, Object> b(@d5.d List<? extends android.content.core.c<T>> migrations) {
            l0.p(migrations, "migrations");
            return new C0072a(migrations, null);
        }

        public Companion(w wVar) {
        }
    }
}
