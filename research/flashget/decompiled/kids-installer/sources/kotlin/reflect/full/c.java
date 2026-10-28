package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;

/* compiled from: KCallables.kt */
@p3.i(name = "KCallables")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a;\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"$\u0010\u0012\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"$\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f\"(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/c;", "", "name", "Lkotlin/reflect/n;", "c", "R", "", "", "args", "a", "(Lkotlin/reflect/c;[Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "(Lkotlin/reflect/c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "(Lkotlin/reflect/c;)Lkotlin/reflect/n;", "getInstanceParameter$annotations", "(Lkotlin/reflect/c;)V", "instanceParameter", "d", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "", "h", "(Lkotlin/reflect/c;)Ljava/util/List;", "getValueParameters$annotations", "valueParameters", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: KCallables.kt */
    @DebugMetadata(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0}, l = {56}, m = "callSuspend", n = {"$this$callSuspend", "args"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<R> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f23777r;

        /* renamed from: s, reason: collision with root package name */
        Object f23778s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f23779t;

        /* renamed from: u, reason: collision with root package name */
        int f23780u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f23779t = obj;
            this.f23780u |= Integer.MIN_VALUE;
            return c.a(null, null, this);
        }
    }

    /* compiled from: KCallables.kt */
    @DebugMetadata(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0, 0}, l = {74}, m = "callSuspendBy", n = {"$this$callSuspendBy", "args", "kCallable"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b<R> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f23781r;

        /* renamed from: s, reason: collision with root package name */
        Object f23782s;

        /* renamed from: t, reason: collision with root package name */
        Object f23783t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f23784u;

        /* renamed from: v, reason: collision with root package name */
        int f23785v;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f23784u = obj;
            this.f23785v |= Integer.MIN_VALUE;
            return c.b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @kotlin.SinceKotlin(version = "1.3")
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object a(@d5.d kotlin.reflect.KCallable<? extends R> r4, @d5.d java.lang.Object[] r5, @d5.d kotlin.coroutines.Continuation<? super R> r6) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.full.c.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.c$a r0 = (kotlin.reflect.full.c.a) r0
            int r1 = r0.f23780u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23780u = r1
            goto L18
        L13:
            kotlin.reflect.full.c$a r0 = new kotlin.reflect.full.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23779t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f23780u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f23778s
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r4 = r0.f23777r
            kotlin.reflect.c r4 = (kotlin.reflect.KCallable) r4
            kotlin.a1.n(r6)
            goto L7a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "䋨"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.a1.n(r6)
            boolean r6 = r4.o()
            if (r6 != 0) goto L4e
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.Object r4 = r4.C(r5)
            return r4
        L4e:
            boolean r6 = r4 instanceof kotlin.reflect.KFunction
            if (r6 == 0) goto L9c
            r0.f23777r = r4
            r0.f23778s = r5
            r0.f23780u = r3
            kotlin.jvm.internal.s1 r6 = new kotlin.jvm.internal.s1
            r2 = 2
            r6.<init>(r2)
            r6.b(r5)
            r6.a(r0)
            int r5 = r6.c()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r5 = r6.d(r5)
            java.lang.Object r6 = r4.C(r5)
            if (r6 != r1) goto L77
            kotlin.coroutines.jvm.internal.h.c(r0)
        L77:
            if (r6 != r1) goto L7a
            return r1
        L7a:
            kotlin.reflect.s r5 = r4.i()
            kotlin.reflect.g r5 = r5.getF23643o()
            java.lang.Class<kotlin.m2> r0 = kotlin.m2.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.l1.d(r0)
            boolean r5 = kotlin.jvm.internal.l0.g(r5, r0)
            if (r5 == 0) goto L9b
            kotlin.reflect.s r4 = r4.i()
            boolean r4 = r4.L()
            if (r4 != 0) goto L9b
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        L9b:
            return r6
        L9c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "䋩"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = "䋪"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.c.a(kotlin.reflect.c, java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @kotlin.SinceKotlin(version = "1.3")
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object b(@d5.d kotlin.reflect.KCallable<? extends R> r4, @d5.d java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r5, @d5.d kotlin.coroutines.Continuation<? super R> r6) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.full.c.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.c$b r0 = (kotlin.reflect.full.c.b) r0
            int r1 = r0.f23785v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23785v = r1
            goto L18
        L13:
            kotlin.reflect.full.c$b r0 = new kotlin.reflect.full.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23784u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f23785v
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23783t
            kotlin.reflect.jvm.internal.l r4 = (kotlin.reflect.jvm.internal.l) r4
            java.lang.Object r4 = r0.f23782s
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r0.f23781r
            kotlin.reflect.c r4 = (kotlin.reflect.KCallable) r4
            kotlin.a1.n(r6)
            goto L6b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "䋫"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.a1.n(r6)
            boolean r6 = r4.o()
            if (r6 != 0) goto L4d
            java.lang.Object r4 = r4.X(r5)
            return r4
        L4d:
            boolean r6 = r4 instanceof kotlin.reflect.KFunction
            if (r6 == 0) goto La5
            kotlin.reflect.jvm.internal.l r6 = kotlin.reflect.jvm.internal.n0.b(r4)
            if (r6 == 0) goto L8d
            r0.f23781r = r4
            r0.f23782s = r5
            r0.f23783t = r6
            r0.f23785v = r3
            java.lang.Object r6 = r6.w0(r5, r0)
            if (r6 != r1) goto L68
            kotlin.coroutines.jvm.internal.h.c(r0)
        L68:
            if (r6 != r1) goto L6b
            return r1
        L6b:
            kotlin.reflect.s r5 = r4.i()
            kotlin.reflect.g r5 = r5.getF23643o()
            java.lang.Class<kotlin.m2> r0 = kotlin.m2.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.l1.d(r0)
            boolean r5 = kotlin.jvm.internal.l0.g(r5, r0)
            if (r5 == 0) goto L8c
            kotlin.reflect.s r4 = r4.i()
            boolean r4 = r4.L()
            if (r4 != 0) goto L8c
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        L8c:
            return r6
        L8d:
            kotlin.reflect.jvm.internal.e0 r5 = new kotlin.reflect.jvm.internal.e0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "䋬"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        La5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "䋭"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = "䋮"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.c.b(kotlin.reflect.c, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    @SinceKotlin(version = "1.1")
    @d5.e
    public static final KParameter c(@d5.d KCallable<?> kCallable, @d5.d String str) {
        l0.p(kCallable, ProtectedSandApp.s("䋯"));
        l0.p(str, ProtectedSandApp.s("䋰"));
        Iterator<T> it = kCallable.r().iterator();
        Object obj = null;
        boolean z5 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (l0.g(((KParameter) next).getName(), str)) {
                    if (z5) {
                        break;
                    }
                    z5 = true;
                    obj2 = next;
                }
            } else if (z5) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @d5.e
    public static final KParameter d(@d5.d KCallable<?> kCallable) {
        l0.p(kCallable, ProtectedSandApp.s("䋱"));
        Iterator<T> it = kCallable.r().iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z5 = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.b.EXTENSION_RECEIVER) {
                    if (z5) {
                        break;
                    }
                    obj2 = next;
                    z5 = true;
                }
            } else if (z5) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void e(KCallable kCallable) {
    }

    @d5.e
    public static final KParameter f(@d5.d KCallable<?> kCallable) {
        l0.p(kCallable, ProtectedSandApp.s("䋲"));
        Iterator<T> it = kCallable.r().iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z5 = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.b.INSTANCE) {
                    if (z5) {
                        break;
                    }
                    obj2 = next;
                    z5 = true;
                }
            } else if (z5) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void g(KCallable kCallable) {
    }

    @d5.d
    public static final List<KParameter> h(@d5.d KCallable<?> kCallable) {
        l0.p(kCallable, ProtectedSandApp.s("䋳"));
        List<KParameter> r5 = kCallable.r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : r5) {
            if (((KParameter) obj).getKind() == KParameter.b.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void i(KCallable kCallable) {
    }
}
