package androidx.content.core;

import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import ld.p;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/datastore/core/d;", "T", "", "<init>", "()V", "a", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ[\u0010\u0011\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/datastore/core/d$a;", "", "<init>", "()V", "T", "", "Landroidx/datastore/core/c;", "migrations", "Landroidx/datastore/core/h;", "api", "Lkotlin/k2;", "c", "(Ljava/util/List;Landroidx/datastore/core/h;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "Lkotlin/coroutines/d;", "b", "(Ljava/util/List;)Lld/p;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.core.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DataMigrationInitializer.kt */
        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/h;", "api", "Lkotlin/k2;", "<anonymous>", "(Landroidx/datastore/core/h;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: androidx.datastore.core.d$a$a, reason: collision with other inner class name */
        static final class C0461a extends o implements p<h<T>, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f28394b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f28395c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<androidx.content.core.c<T>> f28396d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0461a(List<? extends androidx.content.core.c<T>> list, kotlin.coroutines.d<? super C0461a> dVar) {
                super(2, dVar);
                this.f28396d = list;
            }

            @Override // ld.p
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@l h<T> hVar, @m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0461a) create(hVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                C0461a c0461a = new C0461a(this.f28396d, dVar);
                c0461a.f28395c = obj;
                return c0461a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i4 = this.f28394b;
                if (i4 == 0) {
                    a1.n(obj);
                    h hVar = (h) this.f28395c;
                    Companion companion = d.INSTANCE;
                    List<androidx.content.core.c<T>> list = this.f28396d;
                    this.f28394b = 1;
                    if (companion.c(list, hVar, this) == aVar) {
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

        /* compiled from: DataMigrationInitializer.kt */
        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", i = {0, 1}, l = {42, 57}, m = "runMigrations", n = {"cleanUps", "cleanUpFailure"}, s = {"L$0", "L$0"})
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.datastore.core.d$a$b */
        static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f28397b;

            /* renamed from: c, reason: collision with root package name */
            Object f28398c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f28399d;

            /* renamed from: f, reason: collision with root package name */
            int f28401f;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                this.f28399d = obj;
                this.f28401f |= Integer.MIN_VALUE;
                return Companion.this.c(null, null, this);
            }
        }

        /* compiled from: DataMigrationInitializer.kt */
        @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.datastore.core.d$a$c */
        static final class c extends o implements p<T, kotlin.coroutines.d<? super T>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f28402b;

            /* renamed from: c, reason: collision with root package name */
            Object f28403c;

            /* renamed from: d, reason: collision with root package name */
            Object f28404d;

            /* renamed from: e, reason: collision with root package name */
            int f28405e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f28406f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<androidx.content.core.c<T>> f28407g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ List<ld.l<kotlin.coroutines.d<? super k2>, Object>> f28408h;

            /* compiled from: DataMigrationInitializer.kt */
            @f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
            /* renamed from: androidx.datastore.core.d$a$c$a, reason: collision with other inner class name */
            static final class C0462a extends o implements ld.l<kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f28409b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.content.core.c<T> f28410c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0462a(androidx.content.core.c<T> cVar, kotlin.coroutines.d<? super C0462a> dVar) {
                    super(1, dVar);
                    this.f28410c = cVar;
                }

                @Override // ld.l
                @m
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0462a) create(dVar)).invokeSuspend(k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final kotlin.coroutines.d<k2> create(@l kotlin.coroutines.d<?> dVar) {
                    return new C0462a(this.f28410c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object obj) {
                    a aVar = a.COROUTINE_SUSPENDED;
                    int i4 = this.f28409b;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.content.core.c<T> cVar = this.f28410c;
                        this.f28409b = 1;
                        if (cVar.b(this) == aVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends androidx.content.core.c<T>> list, List<ld.l<kotlin.coroutines.d<? super k2>, Object>> list2, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f28407g = list;
                this.f28408h = list2;
            }

            @Override // ld.p
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t4, @m kotlin.coroutines.d<? super T> dVar) {
                return ((c) create(t4, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f28407g, this.f28408h, dVar);
                cVar.f28406f = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
                /*
                    r9 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r9.f28405e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L35
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    java.lang.Object r1 = r9.f28402b
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f28406f
                    java.util.List r4 = (java.util.List) r4
                    kotlin.a1.n(r10)
                    goto L44
                L18:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L20:
                    java.lang.Object r1 = r9.f28404d
                    java.lang.Object r4 = r9.f28403c
                    androidx.datastore.core.c r4 = (androidx.content.core.c) r4
                    java.lang.Object r5 = r9.f28402b
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f28406f
                    java.util.List r6 = (java.util.List) r6
                    kotlin.a1.n(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L35:
                    kotlin.a1.n(r10)
                    java.lang.Object r10 = r9.f28406f
                    java.util.List<androidx.datastore.core.c<T>> r1 = r9.f28407g
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<ld.l<kotlin.coroutines.d<? super kotlin.k2>, java.lang.Object>> r4 = r9.f28408h
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    androidx.datastore.core.c r5 = (androidx.content.core.c) r5
                    r9.f28406f = r4
                    r9.f28402b = r1
                    r9.f28403c = r5
                    r9.f28404d = r10
                    r9.f28405e = r3
                    java.lang.Object r6 = r5.a(r10, r9)
                    if (r6 != r0) goto L61
                    return r0
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    androidx.datastore.core.d$a$c$a r10 = new androidx.datastore.core.d$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f28406f = r4
                    r9.f28402b = r5
                    r9.f28403c = r7
                    r9.f28404d = r7
                    r9.f28405e = r2
                    java.lang.Object r10 = r6.c(r1, r9)
                    if (r10 != r0) goto L88
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.d.Companion.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends androidx.content.core.c<T>> r7, androidx.content.core.h<T> r8, kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.content.core.d.Companion.b
                if (r0 == 0) goto L13
                r0 = r9
                androidx.datastore.core.d$a$b r0 = (androidx.content.core.d.Companion.b) r0
                int r1 = r0.f28401f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28401f = r1
                goto L18
            L13:
                androidx.datastore.core.d$a$b r0 = new androidx.datastore.core.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28399d
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f28401f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L3c
                if (r2 != r3) goto L34
                java.lang.Object r7 = r0.f28398c
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f28397b
                kotlin.jvm.internal.k1$h r8 = (kotlin.jvm.internal.k1.h) r8
                kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L32
                goto L65
            L32:
                r9 = move-exception
                goto L7e
            L34:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3c:
                java.lang.Object r7 = r0.f28397b
                java.util.List r7 = (java.util.List) r7
                kotlin.a1.n(r9)
                goto L5a
            L44:
                java.util.ArrayList r9 = androidx.compose.foundation.interaction.b.a(r9)
                androidx.datastore.core.d$a$c r2 = new androidx.datastore.core.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f28397b = r9
                r0.f28401f = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                r7 = r9
            L5a:
                kotlin.jvm.internal.k1$h r8 = new kotlin.jvm.internal.k1$h
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L65:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L90
                java.lang.Object r9 = r7.next()
                ld.l r9 = (ld.l) r9
                r0.f28397b = r8     // Catch: java.lang.Throwable -> L32
                r0.f28398c = r7     // Catch: java.lang.Throwable -> L32
                r0.f28401f = r3     // Catch: java.lang.Throwable -> L32
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L32
                if (r9 != r1) goto L65
                return r1
            L7e:
                T r2 = r8.f75329b
                if (r2 != 0) goto L85
                r8.f75329b = r9
                goto L65
            L85:
                kotlin.jvm.internal.l0.m(r2)
                T r2 = r8.f75329b
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.o.a(r2, r9)
                goto L65
            L90:
                T r7 = r8.f75329b
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L99
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            L99:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.d.Companion.c(java.util.List, androidx.datastore.core.h, kotlin.coroutines.d):java.lang.Object");
        }

        @l
        public final <T> p<h<T>, kotlin.coroutines.d<? super k2>, Object> b(@l List<? extends androidx.content.core.c<T>> migrations) {
            l0.p(migrations, "migrations");
            return new C0461a(migrations, null);
        }

        public Companion(w wVar) {
        }
    }
}
