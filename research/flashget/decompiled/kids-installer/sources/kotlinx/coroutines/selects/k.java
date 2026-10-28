package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;
import kotlinx.coroutines.c2;
import org.apache.log4j.net.SyslogAppender;
import q3.l;

/* compiled from: WhileSelect.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/coroutines/selects/a;", "", "Lkotlin/m2;", "Lkotlin/u;", "builder", "a", "(Lq3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class k {

    /* compiled from: WhileSelect.kt */
    @DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = SyslogAppender.LOG_LOCAL6)
    /* loaded from: classes6.dex */
    static final class a extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28941r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28942s;

        /* renamed from: t, reason: collision with root package name */
        int f28943t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28942s = obj;
            this.f28943t |= Integer.MIN_VALUE;
            return k.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @kotlinx.coroutines.c2
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@d5.d q3.l<? super kotlinx.coroutines.selects.a<? super java.lang.Boolean>, kotlin.m2> r4, @d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.k.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.k$a r0 = (kotlinx.coroutines.selects.k.a) r0
            int r1 = r0.f28943t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28943t = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.k$a r0 = new kotlinx.coroutines.selects.k$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28942s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28943t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f28941r
            q3.l r4 = (q3.l) r4
            kotlin.a1.n(r5)
            goto L59
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "幖"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
        L3a:
            r0.f28941r = r4
            r0.f28943t = r3
            kotlinx.coroutines.selects.b r5 = new kotlinx.coroutines.selects.b
            r5.<init>(r0)
            r4.N(r5)     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r2 = move-exception
            r5.i1(r2)
        L4b:
            java.lang.Object r5 = r5.h1()
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r2) goto L56
            kotlin.coroutines.jvm.internal.h.c(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3a
            kotlin.m2 r4 = kotlin.m2.f23662a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.k.a(q3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @c2
    private static final Object b(l<? super kotlinx.coroutines.selects.a<? super Boolean>, m2> lVar, Continuation<? super m2> continuation) {
        Object h12;
        do {
            b bVar = new b(continuation);
            try {
                lVar.N(bVar);
            } catch (Throwable th) {
                bVar.i1(th);
            }
            h12 = bVar.h1();
            if (h12 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
        } while (((Boolean) h12).booleanValue());
        return m2.f23662a;
    }
}
