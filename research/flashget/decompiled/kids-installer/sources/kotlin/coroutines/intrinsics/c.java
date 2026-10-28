package kotlin.coroutines.intrinsics;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.m2;
import q3.l;
import q3.p;
import q3.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0083\b¢\u0006\u0002\b\b\u001a'\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0002¢\u0006\u0002\b\n\u001aA\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007¢\u0006\u0002\u0010\f\u001aZ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a>\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b¢\u0006\u0002\u0010\u0014\u001aW\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b¢\u0006\u0002\u0010\u0015\u001ak\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\u0006\u0010\u0018\u001a\u0002H\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0081\b¢\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001¢\u0006\u0002\u0010\u0014\u001aV\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001aj\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\u0006\u0010\u0018\u001a\u0002H\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createSimpleCoroutineForSuspendFunction", "createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapWithContinuationImpl", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
@SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* loaded from: classes5.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n*L\n1#1,269:1\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class a extends RestrictedContinuationImpl {

        /* renamed from: p, reason: collision with root package name */
        private int f23296p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ l<Continuation<? super T>, Object> f23297q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super T> continuation, l<? super Continuation<? super T>, ? extends Object> lVar) {
            super(continuation);
            this.f23297q = lVar;
            l0.n(continuation, ProtectedSandApp.s("綰"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            int i5 = this.f23296p;
            if (i5 == 0) {
                this.f23296p = 1;
                a1.n(obj);
                return this.f23297q.N(this);
            }
            if (i5 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("綱").toString());
            }
            this.f23296p = 2;
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n*L\n1#1,269:1\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        private int f23298r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ l<Continuation<? super T>, Object> f23299s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super T> continuation, CoroutineContext coroutineContext, l<? super Continuation<? super T>, ? extends Object> lVar) {
            super(continuation, coroutineContext);
            this.f23299s = lVar;
            l0.n(continuation, ProtectedSandApp.s("網"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            int i5 = this.f23298r;
            if (i5 == 0) {
                this.f23298r = 1;
                a1.n(obj);
                return this.f23299s.N(this);
            }
            if (i5 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("綳").toString());
            }
            this.f23298r = 2;
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    /* renamed from: kotlin.coroutines.intrinsics.c$c, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0256c extends RestrictedContinuationImpl {

        /* renamed from: p, reason: collision with root package name */
        private int f23300p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ l f23301q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0256c(Continuation continuation, l lVar) {
            super(continuation);
            this.f23301q = lVar;
            l0.n(continuation, ProtectedSandApp.s("綴"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            int i5 = this.f23300p;
            if (i5 == 0) {
                this.f23300p = 1;
                a1.n(obj);
                l0.n(this.f23301q, ProtectedSandApp.s("綶"));
                return ((l) u1.q(this.f23301q, 1)).N(this);
            }
            if (i5 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("綵").toString());
            }
            this.f23300p = 2;
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        private int f23302r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ l f23303s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, CoroutineContext coroutineContext, l lVar) {
            super(continuation, coroutineContext);
            this.f23303s = lVar;
            l0.n(continuation, ProtectedSandApp.s("綷"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            int i5 = this.f23302r;
            if (i5 == 0) {
                this.f23302r = 1;
                a1.n(obj);
                l0.n(this.f23303s, ProtectedSandApp.s("綹"));
                return ((l) u1.q(this.f23303s, 1)).N(this);
            }
            if (i5 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("綸").toString());
            }
            this.f23302r = 2;
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class e extends RestrictedContinuationImpl {

        /* renamed from: p, reason: collision with root package name */
        private int f23304p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ p f23305q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f23306r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Continuation continuation, p pVar, Object obj) {
            super(continuation);
            this.f23305q = pVar;
            this.f23306r = obj;
            l0.n(continuation, ProtectedSandApp.s("綺"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            int i5 = this.f23304p;
            if (i5 == 0) {
                this.f23304p = 1;
                a1.n(obj);
                l0.n(this.f23305q, ProtectedSandApp.s("綼"));
                return ((p) u1.q(this.f23305q, 2)).g0(this.f23306r, this);
            }
            if (i5 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("綻").toString());
            }
            this.f23304p = 2;
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class f extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        private int f23307r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f23308s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f23309t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Continuation continuation, CoroutineContext coroutineContext, p pVar, Object obj) {
            super(continuation, coroutineContext);
            this.f23308s = pVar;
            this.f23309t = obj;
            l0.n(continuation, ProtectedSandApp.s("綽"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            int i5 = this.f23307r;
            if (i5 == 0) {
                this.f23307r = 1;
                a1.n(obj);
                l0.n(this.f23308s, ProtectedSandApp.s("綿"));
                return ((p) u1.q(this.f23308s, 2)).g0(this.f23309t, this);
            }
            if (i5 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("綾").toString());
            }
            this.f23307r = 2;
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class g extends RestrictedContinuationImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Continuation<? super T> continuation) {
            super(continuation);
            l0.n(continuation, ProtectedSandApp.s("緀"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            a1.n(obj);
            return obj;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0014¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class h extends ContinuationImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Continuation<? super T> continuation, CoroutineContext coroutineContext) {
            super(continuation, coroutineContext);
            l0.n(continuation, ProtectedSandApp.s("緁"));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        protected Object A(@d5.d Object obj) {
            a1.n(obj);
            return obj;
        }
    }

    @SinceKotlin(version = "1.3")
    private static final <T> Continuation<m2> a(Continuation<? super T> continuation, l<? super Continuation<? super T>, ? extends Object> lVar) {
        CoroutineContext context = continuation.getContext();
        return context == EmptyCoroutineContext.f23294o ? new a(continuation, lVar) : new b(continuation, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @d5.d
    public static <T> Continuation<m2> b(@d5.d l<? super Continuation<? super T>, ? extends Object> lVar, @d5.d Continuation<? super T> continuation) {
        l0.p(lVar, ProtectedSandApp.s("㻅"));
        String s5 = ProtectedSandApp.s("㻆");
        l0.p(continuation, s5);
        l0.p(continuation, s5);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).w(continuation);
        }
        CoroutineContext context = continuation.getContext();
        return context == EmptyCoroutineContext.f23294o ? new C0256c(continuation, lVar) : new d(continuation, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @d5.d
    public static <R, T> Continuation<m2> c(@d5.d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d5.d Continuation<? super T> continuation) {
        l0.p(pVar, ProtectedSandApp.s("㻇"));
        String s5 = ProtectedSandApp.s("㻈");
        l0.p(continuation, s5);
        l0.p(continuation, s5);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).c(r5, continuation);
        }
        CoroutineContext context = continuation.getContext();
        return context == EmptyCoroutineContext.f23294o ? new e(continuation, pVar, r5) : new f(continuation, context, pVar, r5);
    }

    private static final <T> Continuation<T> d(Continuation<? super T> continuation) {
        CoroutineContext context = continuation.getContext();
        return context == EmptyCoroutineContext.f23294o ? new g(continuation) : new h(continuation, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @d5.d
    public static <T> Continuation<T> e(@d5.d Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        l0.p(continuation, ProtectedSandApp.s("㻉"));
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuation2 = (Continuation<T>) continuationImpl.L()) == null) ? continuation : continuation2;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object f(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        l0.p(lVar, ProtectedSandApp.s("㻊"));
        l0.p(continuation, ProtectedSandApp.s("㻋"));
        return !(lVar instanceof BaseContinuationImpl) ? i(lVar, continuation) : ((l) u1.q(lVar, 1)).N(continuation);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object g(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, Continuation<? super T> continuation) {
        l0.p(pVar, ProtectedSandApp.s("㻌"));
        l0.p(continuation, ProtectedSandApp.s("㻍"));
        return !(pVar instanceof BaseContinuationImpl) ? j(pVar, r5, continuation) : ((p) u1.q(pVar, 2)).g0(r5, continuation);
    }

    @InlineOnly
    private static final <R, P, T> Object h(q<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> qVar, R r5, P p5, Continuation<? super T> continuation) {
        l0.p(qVar, ProtectedSandApp.s("㻎"));
        l0.p(continuation, ProtectedSandApp.s("㻏"));
        return !(qVar instanceof BaseContinuationImpl) ? k(qVar, r5, p5, continuation) : ((q) u1.q(qVar, 3)).G(r5, p5, continuation);
    }

    @d5.e
    @PublishedApi
    public static final <T> Object i(@d5.d l<? super Continuation<? super T>, ? extends Object> lVar, @d5.d Continuation<? super T> continuation) {
        l0.p(lVar, ProtectedSandApp.s("㻐"));
        String s5 = ProtectedSandApp.s("㻑");
        l0.p(continuation, s5);
        l0.p(continuation, s5);
        return ((l) u1.q(lVar, 1)).N(d(continuation));
    }

    @d5.e
    @PublishedApi
    public static final <R, T> Object j(@d5.d p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r5, @d5.d Continuation<? super T> continuation) {
        l0.p(pVar, ProtectedSandApp.s("㻒"));
        String s5 = ProtectedSandApp.s("㻓");
        l0.p(continuation, s5);
        l0.p(continuation, s5);
        return ((p) u1.q(pVar, 2)).g0(r5, d(continuation));
    }

    @d5.e
    @PublishedApi
    public static <R, P, T> Object k(@d5.d q<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> qVar, R r5, P p5, @d5.d Continuation<? super T> continuation) {
        l0.p(qVar, ProtectedSandApp.s("㻔"));
        String s5 = ProtectedSandApp.s("㻕");
        l0.p(continuation, s5);
        l0.p(continuation, s5);
        return ((q) u1.q(qVar, 3)).G(r5, p5, d(continuation));
    }
}
