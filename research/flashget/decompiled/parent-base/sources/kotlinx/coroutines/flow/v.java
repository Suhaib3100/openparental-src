package kotlinx.coroutines.flow;

import androidx.collection.r2;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.InterfaceC1469b;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a+\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aJ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\f\u001ar\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0019\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015¢\u0006\u0002\b\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aX\u0010\u001c\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\n\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "count", "d", "(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "e", "(Lkotlinx/coroutines/flow/i;Lld/p;)Lkotlinx/coroutines/flow/i;", "g", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "R", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "Lkotlin/u;", "transform", "i", "(Lkotlinx/coroutines/flow/i;Lld/q;)Lkotlinx/coroutines/flow/i;", "b", "(Lkotlinx/coroutines/flow/i;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n107#3:143\n107#3:144\n107#3:145\n107#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n22#1:143\n33#1:144\n52#1:145\n83#1:146\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class v {

    /* compiled from: Limit.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {SyslogAppender.LOG_LOCAL1}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$1\n*L\n1#1,141:1\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80481b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80482c;

        /* renamed from: d, reason: collision with root package name */
        int f80483d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80482c = obj;
            this.f80483d |= Integer.MIN_VALUE;
            return v.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n*L\n1#1,141:1\n*E\n"})
    public static final class b<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super Boolean>, Object> f80484b;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS}, m = "emit", n = {"this"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80485b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80486c;

            /* renamed from: e, reason: collision with root package name */
            int f80488e;

            public a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80486c = obj;
                this.f80488e |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
            this.f80484b = pVar;
        }

        @fg.m
        public Object a(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            new a(dVar);
            if (((Boolean) this.f80484b.invoke(t4, dVar)).booleanValue()) {
                return k2.f75408a;
            }
            throw new AbortFlowException(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.v$b$a r0 = (kotlinx.coroutines.flow.v.b.a) r0
                int r1 = r0.f80488e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80488e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$b$a r0 = new kotlinx.coroutines.flow.v$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f80486c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80488e
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f80485b
                kotlinx.coroutines.flow.v$b r5 = (kotlinx.coroutines.flow.v.b) r5
                kotlin.a1.n(r6)
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "螑\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.a1.n(r6)
                ld.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f80484b
                r0.f80485b = r4
                r0.f80488e = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L53
                kotlin.k2 r5 = kotlin.k2.f75408a
                return r5
            L53:
                kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n23#2,5:114\n*E\n"})
    public static final class c<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f80489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80490c;

        public c(kotlinx.coroutines.flow.i iVar, int i4) {
            this.f80489b = iVar;
            this.f80490c = i4;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object a5 = this.f80489b.a(new d(new k1.f(), this.f80490c, jVar), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.f f80491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f80493d;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80494b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ d<T> f80495c;

            /* renamed from: d, reason: collision with root package name */
            int f80496d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f80495c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80494b = obj;
                this.f80496d |= Integer.MIN_VALUE;
                return this.f80495c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(k1.f fVar, int i4, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f80491b = fVar;
            this.f80492c = i4;
            this.f80493d = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.d.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$d$a r0 = (kotlinx.coroutines.flow.v.d.a) r0
                int r1 = r0.f80496d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80496d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$d$a r0 = new kotlinx.coroutines.flow.v$d$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f80494b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80496d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L27
                kotlin.a1.n(r7)
                goto L49
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "螒\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L33:
                kotlin.a1.n(r7)
                kotlin.jvm.internal.k1$f r7 = r5.f80491b
                int r2 = r7.f75327b
                int r4 = r5.f80492c
                if (r2 < r4) goto L4c
                kotlinx.coroutines.flow.j<T> r7 = r5.f80493d
                r0.f80496d = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L49
                return r1
            L49:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            L4c:
                int r2 = r2 + r3
                r7.f75327b = r2
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.d.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n34#2,10:114\n*E\n"})
    public static final class e<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f80497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f80498c;

        public e(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f80497b = iVar;
            this.f80498c = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super T> jVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            Object a5 = this.f80497b.a(new f(new k1.a(), jVar, this.f80498c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f80499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f80500c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<T, kotlin.coroutines.d<? super Boolean>, Object> f80501d;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80502b;

            /* renamed from: c, reason: collision with root package name */
            Object f80503c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f80504d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ f<T> f80505e;

            /* renamed from: f, reason: collision with root package name */
            int f80506f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(f<? super T> fVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80505e = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80504d = obj;
                this.f80506f |= Integer.MIN_VALUE;
                return this.f80505e.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(k1.a aVar, kotlinx.coroutines.flow.j<? super T> jVar, ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
            this.f80499b = aVar;
            this.f80500c = jVar;
            this.f80501d = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.f.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$f$a r0 = (kotlinx.coroutines.flow.v.f.a) r0
                int r1 = r0.f80506f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80506f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$f$a r0 = new kotlinx.coroutines.flow.v$f$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f80504d
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80506f
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L47
                if (r2 == r5) goto L43
                if (r2 == r4) goto L39
                if (r2 != r3) goto L2d
                kotlin.a1.n(r8)
                goto L8a
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "螓\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L39:
                java.lang.Object r7 = r0.f80503c
                java.lang.Object r2 = r0.f80502b
                kotlinx.coroutines.flow.v$f r2 = (kotlinx.coroutines.flow.v.f) r2
                kotlin.a1.n(r8)
                goto L6e
            L43:
                kotlin.a1.n(r8)
                goto L5b
            L47:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$a r8 = r6.f80499b
                boolean r8 = r8.f75322b
                if (r8 == 0) goto L5e
                kotlinx.coroutines.flow.j<T> r8 = r6.f80500c
                r0.f80506f = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            L5e:
                ld.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f80501d
                r0.f80502b = r6
                r0.f80503c = r7
                r0.f80506f = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6d
                return r1
            L6d:
                r2 = r6
            L6e:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8d
                kotlin.jvm.internal.k1$a r8 = r2.f80499b
                r8.f75322b = r5
                kotlinx.coroutines.flow.j<T> r8 = r2.f80500c
                r2 = 0
                r0.f80502b = r2
                r0.f80503c = r2
                r0.f80506f = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L8a
                return r1
            L8a:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            L8d:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Limit.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {73}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80507b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80508c;

        /* renamed from: d, reason: collision with root package name */
        int f80509d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80508c = obj;
            this.f80509d |= Integer.MIN_VALUE;
            return v.f(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n53#2,3:114\n66#2,4:117\n*E\n"})
    public static final class h<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f80510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80511c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {116}, m = "collect", n = {"$this$take_u24lambda_u244"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80512b;

            /* renamed from: c, reason: collision with root package name */
            int f80513c;

            /* renamed from: e, reason: collision with root package name */
            Object f80515e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80512b = obj;
                this.f80513c |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(kotlinx.coroutines.flow.i iVar, int i4) {
            this.f80510b = iVar;
            this.f80511c = i4;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
        
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        
            kotlinx.coroutines.flow.internal.o.b(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r7, @fg.l kotlin.coroutines.d<? super kotlin.k2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.v.h.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.v$h$a r0 = (kotlinx.coroutines.flow.v.h.a) r0
                int r1 = r0.f80513c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80513c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$h$a r0 = new kotlinx.coroutines.flow.v$h$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f80512b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80513c
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f80515e
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                kotlin.a1.n(r8)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                goto L58
            L2b:
                r8 = move-exception
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "螔\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                r7.<init>(r8)
                throw r7
            L39:
                kotlin.a1.n(r8)
                kotlin.jvm.internal.k1$f r8 = new kotlin.jvm.internal.k1$f
                r8.<init>()
                kotlinx.coroutines.flow.i r2 = r6.f80510b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                kotlinx.coroutines.flow.v$i r4 = new kotlinx.coroutines.flow.v$i     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                int r5 = r6.f80511c     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                r0.f80515e = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                r0.f80513c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                java.lang.Object r7 = r2.a(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                if (r7 != r1) goto L58
                return r1
            L55:
                kotlinx.coroutines.flow.internal.o.b(r8, r7)
            L58:
                kotlin.k2 r7 = kotlin.k2.f75408a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.h.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.f f80516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f80518d;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80519b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i<T> f80520c;

            /* renamed from: d, reason: collision with root package name */
            int f80521d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(i<? super T> iVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f80520c = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80519b = obj;
                this.f80521d |= Integer.MIN_VALUE;
                return this.f80520c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        i(k1.f fVar, int i4, kotlinx.coroutines.flow.j<? super T> jVar) {
            this.f80516b = fVar;
            this.f80517c = i4;
            this.f80518d = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.i.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$i$a r0 = (kotlinx.coroutines.flow.v.i.a) r0
                int r1 = r0.f80521d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80521d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$i$a r0 = new kotlinx.coroutines.flow.v$i$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f80519b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80521d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2a
                kotlin.a1.n(r7)
                goto L61
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "螕\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L36:
                kotlin.a1.n(r7)
                goto L53
            L3a:
                kotlin.a1.n(r7)
                kotlin.jvm.internal.k1$f r7 = r5.f80516b
                int r2 = r7.f75327b
                int r2 = r2 + r4
                r7.f75327b = r2
                int r7 = r5.f80517c
                if (r2 >= r7) goto L56
                kotlinx.coroutines.flow.j<T> r7 = r5.f80518d
                r0.f80521d = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L53
                return r1
            L53:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            L56:
                kotlinx.coroutines.flow.j<T> r7 = r5.f80518d
                r0.f80521d = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.v.a(r7, r6, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.i.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/v$b", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,113:1\n85#2:114\n126#2,15:115\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n85#1:115,15\n*E\n"})
    public static final class j<T> implements kotlinx.coroutines.flow.i<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f80522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p f80523c;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {125}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,113:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f80524b;

            /* renamed from: c, reason: collision with root package name */
            int f80525c;

            /* renamed from: e, reason: collision with root package name */
            Object f80527e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80524b = obj;
                this.f80525c |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(kotlinx.coroutines.flow.i iVar, ld.p pVar) {
            this.f80522b = iVar;
            this.f80523c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // kotlinx.coroutines.flow.i
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(@fg.l kotlinx.coroutines.flow.j<? super T> r6, @fg.l kotlin.coroutines.d<? super kotlin.k2> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.v.j.a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.v$j$a r0 = (kotlinx.coroutines.flow.v.j.a) r0
                int r1 = r0.f80525c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80525c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$j$a r0 = new kotlinx.coroutines.flow.v$j$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f80524b
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80525c
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L2d
                java.lang.Object r6 = r0.f80527e
                kotlinx.coroutines.flow.v$k r6 = (kotlinx.coroutines.flow.v.k) r6
                kotlin.a1.n(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
                goto L55
            L2b:
                r7 = move-exception
                goto L52
            L2d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "螖\u0001"
                java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
                r6.<init>(r7)
                throw r6
            L39:
                kotlin.a1.n(r7)
                kotlinx.coroutines.flow.i r7 = r5.f80522b
                kotlinx.coroutines.flow.v$k r2 = new kotlinx.coroutines.flow.v$k
                ld.p r4 = r5.f80523c
                r2.<init>(r4, r6)
                r0.f80527e = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L50
                r0.f80525c = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L50
                java.lang.Object r6 = r7.a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L50
                if (r6 != r1) goto L55
                return r1
            L50:
                r7 = move-exception
                r6 = r2
            L52:
                kotlinx.coroutines.flow.internal.o.b(r7, r6)
            L55:
                kotlin.k2 r6 = kotlin.k2.f75408a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.j.a(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Limit.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n86#2,5:142\n*E\n"})
    public static final class k<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p f80528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j f80529c;

        /* compiled from: Limit.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: b, reason: collision with root package name */
            Object f80530b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f80531c;

            /* renamed from: d, reason: collision with root package name */
            int f80532d;

            /* renamed from: f, reason: collision with root package name */
            Object f80534f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                this.f80531c = obj;
                this.f80532d |= Integer.MIN_VALUE;
                return k.this.emit(null, this);
            }
        }

        public k(ld.p pVar, kotlinx.coroutines.flow.j jVar) {
            this.f80528b = pVar;
            this.f80529c = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.j
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.v.k.a
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.v$k$a r0 = (kotlinx.coroutines.flow.v.k.a) r0
                int r1 = r0.f80532d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f80532d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.v$k$a r0 = new kotlinx.coroutines.flow.v$k$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f80531c
                kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r2 = r0.f80532d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L48
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L2e
                java.lang.Object r8 = r0.f80530b
                kotlinx.coroutines.flow.v$k r8 = (kotlinx.coroutines.flow.v.k) r8
                kotlin.a1.n(r9)
                goto L76
            L2e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "螗\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                r8.<init>(r9)
                throw r8
            L3a:
                java.lang.Object r8 = r0.f80534f
                java.lang.Object r2 = r0.f80530b
                kotlinx.coroutines.flow.v$k r2 = (kotlinx.coroutines.flow.v.k) r2
                kotlin.a1.n(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L5d
            L48:
                kotlin.a1.n(r9)
                ld.p r9 = r7.f80528b
                r0.f80530b = r7
                r0.f80534f = r8
                r0.f80532d = r4
                java.lang.Object r9 = r9.invoke(r8, r0)
                if (r9 != r1) goto L5a
                return r1
            L5a:
                r2 = r9
                r9 = r8
                r8 = r7
            L5d:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L75
                kotlinx.coroutines.flow.j r2 = r8.f80529c
                r0.f80530b = r8
                r5 = 0
                r0.f80534f = r5
                r0.f80532d = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L76
                return r1
            L75:
                r4 = 0
            L76:
                if (r4 == 0) goto L7b
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            L7b:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.k.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Limit.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {SyslogAppender.LOG_LOCAL3}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n126#2,15:142\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n119#1:142,15\n*E\n"})
    static final class l<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f80535b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f80536c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f80537d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super Boolean>, Object> f80538e;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Limit.kt */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/v$b", "Lkotlinx/coroutines/flow/j;", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,141:1\n120#2:142\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.q f80539b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f80540c;

            /* compiled from: Limit.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
            /* renamed from: kotlinx.coroutines.flow.v$l$a$a, reason: collision with other inner class name */
            public static final class C1252a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                Object f80541b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f80542c;

                /* renamed from: d, reason: collision with root package name */
                int f80543d;

                public C1252a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f80542c = obj;
                    this.f80543d |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(ld.q qVar, kotlinx.coroutines.flow.j jVar) {
                this.f80539b = qVar;
                this.f80540c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.l.a.C1252a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.v$l$a$a r0 = (kotlinx.coroutines.flow.v.l.a.C1252a) r0
                    int r1 = r0.f80543d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f80543d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.v$l$a$a r0 = new kotlinx.coroutines.flow.v$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f80542c
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f80543d
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2b
                    java.lang.Object r5 = r0.f80541b
                    kotlinx.coroutines.flow.v$l$a r5 = (kotlinx.coroutines.flow.v.l.a) r5
                    kotlin.a1.n(r6)
                    goto L4a
                L2b:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "螘\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L37:
                    kotlin.a1.n(r6)
                    ld.q r6 = r4.f80539b
                    kotlinx.coroutines.flow.j r2 = r4.f80540c
                    r0.f80541b = r4
                    r0.f80543d = r3
                    java.lang.Object r6 = r6.R(r2, r5, r0)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    r5 = r4
                L4a:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L55
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                L55:
                    kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.l.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(kotlinx.coroutines.flow.i<? extends T> iVar, ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f80537d = iVar;
            this.f80538e = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super R> jVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(jVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f80537d, this.f80538e, dVar);
            lVar.f80536c = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            a aVar;
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f80535b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f80536c;
                kotlinx.coroutines.flow.i<T> iVar = this.f80537d;
                a aVar3 = new a(this.f80538e, jVar);
                try {
                    this.f80536c = aVar3;
                    this.f80535b = 1;
                    if (iVar.a(aVar3, this) == aVar2) {
                        return aVar2;
                    }
                } catch (AbortFlowException e4) {
                    e = e4;
                    aVar = aVar3;
                    kotlinx.coroutines.flow.internal.o.b(e, aVar);
                    return k2.f75408a;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("螙\u0001"));
                }
                aVar = (a) this.f80536c;
                try {
                    a1.n(obj);
                } catch (AbortFlowException e5) {
                    e = e5;
                    kotlinx.coroutines.flow.internal.o.b(e, aVar);
                    return k2.f75408a;
                }
            }
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$a r0 = (kotlinx.coroutines.flow.v.a) r0
            int r1 = r0.f80483d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80483d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$a r0 = new kotlinx.coroutines.flow.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80482c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80483d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f80481b
            kotlinx.coroutines.flow.v$b r4 = (kotlinx.coroutines.flow.v.b) r4
            kotlin.a1.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L51
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螜\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r6)
            kotlinx.coroutines.flow.v$b r6 = new kotlinx.coroutines.flow.v$b
            r6.<init>(r5)
            r0.f80481b = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            r0.f80483d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4c
            if (r4 != r1) goto L51
            return r1
        L4c:
            r5 = move-exception
            r4 = r6
        L4e:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
        L51:
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.b(kotlinx.coroutines.flow.i, ld.p, kotlin.coroutines.d):java.lang.Object");
    }

    private static final <T> Object c(kotlinx.coroutines.flow.i<? extends T> iVar, ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super k2> dVar) {
        b bVar = new b(pVar);
        try {
            iVar.a(bVar, dVar);
        } catch (AbortFlowException e4) {
            kotlinx.coroutines.flow.internal.o.b(e4, bVar);
        }
        return k2.f75408a;
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> d(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, int i4) {
        if (i4 >= 0) {
            return new c(iVar, i4);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("螝\u0001"), i4).toString());
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> e(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object f(kotlinx.coroutines.flow.j<? super T> r4, T r5, kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.v.g
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.v$g r0 = (kotlinx.coroutines.flow.v.g) r0
            int r1 = r0.f80509d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80509d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.v$g r0 = new kotlinx.coroutines.flow.v$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80508c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80509d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "螜\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L2f:
            java.lang.Object r4 = r0.f80507b
            kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
            kotlin.a1.n(r6)
            goto L45
        L37:
            kotlin.a1.n(r6)
            r0.f80507b = r4
            r0.f80509d = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.v.f(kotlinx.coroutines.flow.j, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> g(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, int i4) {
        if (i4 > 0) {
            return new h(iVar, i4);
        }
        throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("螞\u0001"), i4, ProtectedSandApp.s("螟\u0001")).toString());
    }

    @fg.l
    public static final <T> kotlinx.coroutines.flow.i<T> h(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l ld.p<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return new j(iVar, pVar);
    }

    @fg.l
    public static final <T, R> kotlinx.coroutines.flow.i<R> i(@fg.l kotlinx.coroutines.flow.i<? extends T> iVar, @fg.l @InterfaceC1469b ld.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar) {
        return new h0(new l(iVar, qVar, null));
    }
}
