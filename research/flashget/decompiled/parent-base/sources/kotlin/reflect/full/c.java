package kotlin.reflect.full;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.n;

/* compiled from: KCallables.kt */
@kd.i(name = "KCallables")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0087@¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\fH\u0087@¢\u0006\u0004\b\r\u0010\u000e\"$\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"$\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010\"(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/c;", "", "name", "Lkotlin/reflect/n;", "c", "(Lkotlin/reflect/c;Ljava/lang/String;)Lkotlin/reflect/n;", "R", "", "", "args", "a", "(Lkotlin/reflect/c;[Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "(Lkotlin/reflect/c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "(Lkotlin/reflect/c;)Lkotlin/reflect/n;", "g", "(Lkotlin/reflect/c;)V", "instanceParameter", "d", "e", "extensionReceiverParameter", "", "h", "(Lkotlin/reflect/c;)Ljava/util/List;", "i", "valueParameters", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKCallables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n661#2,11:83\n661#2,11:94\n766#2:105\n857#2,2:106\n661#2,11:108\n1#3:119\n*S KotlinDebug\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n*L\n23#1:83,11\n31#1:94,11\n38#1:105\n38#1:106,2\n45#1:108,11\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* compiled from: KCallables.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0}, l = {56}, m = "callSuspend", n = {"$this$callSuspend", "args"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f75526b;

        /* renamed from: c, reason: collision with root package name */
        Object f75527c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f75528d;

        /* renamed from: e, reason: collision with root package name */
        int f75529e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f75528d = obj;
            this.f75529e |= Integer.MIN_VALUE;
            return c.a(null, null, this);
        }
    }

    /* compiled from: KCallables.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0, 0}, l = {74}, m = "callSuspendBy", n = {"$this$callSuspendBy", "args", "kCallable"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b<R> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f75530b;

        /* renamed from: c, reason: collision with root package name */
        Object f75531c;

        /* renamed from: d, reason: collision with root package name */
        Object f75532d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75533e;

        /* renamed from: f, reason: collision with root package name */
        int f75534f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f75533e = obj;
            this.f75534f |= Integer.MIN_VALUE;
            return c.b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    @kotlin.c1(version = "1.3")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object a(@fg.l kotlin.reflect.c<? extends R> r4, @fg.l java.lang.Object[] r5, @fg.l kotlin.coroutines.d<? super R> r6) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.full.c.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.c$a r0 = (kotlin.reflect.full.c.a) r0
            int r1 = r0.f75529e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75529e = r1
            goto L18
        L13:
            kotlin.reflect.full.c$a r0 = new kotlin.reflect.full.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f75528d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f75529e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f75527c
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r4 = r0.f75526b
            kotlin.reflect.c r4 = (kotlin.reflect.c) r4
            kotlin.a1.n(r6)
            goto L7a
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "映\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.a1.n(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L4e
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.Object r4 = r4.call(r5)
            return r4
        L4e:
            boolean r6 = r4 instanceof kotlin.reflect.i
            if (r6 == 0) goto L9c
            r0.f75526b = r4
            r0.f75527c = r5
            r0.f75529e = r3
            kotlin.jvm.internal.s1 r6 = new kotlin.jvm.internal.s1
            r2 = 2
            r6.<init>(r2)
            r6.b(r5)
            r6.a(r0)
            int r5 = r6.c()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r5 = r6.d(r5)
            java.lang.Object r6 = r4.call(r5)
            if (r6 != r1) goto L77
            kotlin.coroutines.jvm.internal.h.c(r0)
        L77:
            if (r6 != r1) goto L7a
            return r1
        L7a:
            kotlin.reflect.s r5 = r4.getReturnType()
            kotlin.reflect.g r5 = r5.getClassifier()
            java.lang.Class<kotlin.k2> r0 = kotlin.k2.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.l1.d(r0)
            boolean r5 = kotlin.jvm.internal.l0.g(r5, r0)
            if (r5 == 0) goto L9b
            kotlin.reflect.s r4 = r4.getReturnType()
            boolean r4 = r4.f()
            if (r4 != 0) goto L9b
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L9b:
            return r6
        L9c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "昡\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = "昢\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.c.a(kotlin.reflect.c, java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    @kotlin.c1(version = "1.3")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object b(@fg.l kotlin.reflect.c<? extends R> r4, @fg.l java.util.Map<kotlin.reflect.n, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super R> r6) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.full.c.b
            if (r0 == 0) goto L13
            r0 = r6
            kotlin.reflect.full.c$b r0 = (kotlin.reflect.full.c.b) r0
            int r1 = r0.f75534f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75534f = r1
            goto L18
        L13:
            kotlin.reflect.full.c$b r0 = new kotlin.reflect.full.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f75533e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f75534f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f75532d
            kotlin.reflect.jvm.internal.n r4 = (kotlin.reflect.jvm.internal.n) r4
            java.lang.Object r4 = r0.f75531c
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r0.f75530b
            kotlin.reflect.c r4 = (kotlin.reflect.c) r4
            kotlin.a1.n(r6)
            goto L6b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "映\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.a1.n(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L4d
            java.lang.Object r4 = r4.callBy(r5)
            return r4
        L4d:
            boolean r6 = r4 instanceof kotlin.reflect.i
            if (r6 == 0) goto La5
            kotlin.reflect.jvm.internal.n r6 = kotlin.reflect.jvm.internal.p0.b(r4)
            if (r6 == 0) goto L8d
            r0.f75530b = r4
            r0.f75531c = r5
            r0.f75532d = r6
            r0.f75534f = r3
            java.lang.Object r6 = r6.i0(r5, r0)
            if (r6 != r1) goto L68
            kotlin.coroutines.jvm.internal.h.c(r0)
        L68:
            if (r6 != r1) goto L6b
            return r1
        L6b:
            kotlin.reflect.s r5 = r4.getReturnType()
            kotlin.reflect.g r5 = r5.getClassifier()
            java.lang.Class<kotlin.k2> r0 = kotlin.k2.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.l1.d(r0)
            boolean r5 = kotlin.jvm.internal.l0.g(r5, r0)
            if (r5 == 0) goto L8c
            kotlin.reflect.s r4 = r4.getReturnType()
            boolean r4 = r4.f()
            if (r4 != 0) goto L8c
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        L8c:
            return r6
        L8d:
            kotlin.reflect.jvm.internal.g0 r5 = new kotlin.reflect.jvm.internal.g0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "昣\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        La5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "昤\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = "昢\u0001"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.full.c.b(kotlin.reflect.c, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    @c1(version = "1.1")
    public static final n c(@l kotlin.reflect.c<?> cVar, @l String str) {
        l0.p(cVar, ProtectedSandApp.s("春\u0001"));
        l0.p(str, ProtectedSandApp.s("昦\u0001"));
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z4 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (l0.g(((n) next).getName(), str)) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    obj2 = next;
                }
            } else if (z4) {
                obj = obj2;
            }
        }
        return (n) obj;
    }

    @m
    public static final n d(@l kotlin.reflect.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("春\u0001"));
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z4 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((n) next).getKind() == n.b.EXTENSION_RECEIVER) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    obj2 = next;
                }
            } else if (z4) {
                obj = obj2;
            }
        }
        return (n) obj;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void e(kotlin.reflect.c cVar) {
    }

    @m
    public static final n f(@l kotlin.reflect.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("春\u0001"));
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z4 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((n) next).getKind() == n.b.INSTANCE) {
                    if (z4) {
                        break;
                    }
                    z4 = true;
                    obj2 = next;
                }
            } else if (z4) {
                obj = obj2;
            }
        }
        return (n) obj;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void g(kotlin.reflect.c cVar) {
    }

    @l
    public static final List<n> h(@l kotlin.reflect.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("春\u0001"));
        List<n> parameters = cVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((n) obj).getKind() == n.b.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void i(kotlin.reflect.c cVar) {
    }
}
