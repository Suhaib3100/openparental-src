package kotlin.coroutines.intrinsics;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.c1;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlin.w0;
import ld.l;
import ld.p;
import ld.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a@\u0010\u0005\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001aY\u0010\f\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001aX\u0010\u000e\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\r\u001am\u0010\u0012\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002H\u0081\b¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0014\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u001aC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\\\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u001c\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0083\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "f", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "i", "R", "Lkotlin/Function2;", "Lkotlin/u;", "receiver", "g", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "P", "Lkotlin/Function3;", "param", "h", "(Lld/q;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "k", "Lkotlin/k2;", "b", "(Lld/l;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "c", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "e", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "block", "a", "(Lkotlin/coroutines/d;Lld/l;)Lkotlin/coroutines/d;", "d", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
@r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* loaded from: classes7.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"kotlin/coroutines/intrinsics/c$a", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n*L\n1#1,269:1\n*E\n"})
    public static final class a extends j {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<kotlin.coroutines.d<? super T>, Object> f75060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d<? super T> dVar, l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
            super(dVar);
            this.f75060c = lVar;
            l0.n(dVar, ProtectedSandApp.s("挞\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            int i4 = this.label;
            if (i4 == 0) {
                this.label = 1;
                a1.n(result);
                return this.f75060c.invoke(this);
            }
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("挟\u0001"));
            }
            this.label = 2;
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"kotlin/coroutines/intrinsics/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n*L\n1#1,269:1\n*E\n"})
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<kotlin.coroutines.d<? super T>, Object> f75062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.coroutines.d<? super T> dVar, kotlin.coroutines.g gVar, l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
            super(dVar, gVar);
            this.f75062c = lVar;
            l0.n(dVar, ProtectedSandApp.s("挠\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            int i4 = this.label;
            if (i4 == 0) {
                this.label = 1;
                a1.n(result);
                return this.f75062c.invoke(this);
            }
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("挡\u0001"));
            }
            this.label = 2;
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/c$a", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    /* renamed from: kotlin.coroutines.intrinsics.c$c, reason: collision with other inner class name */
    public static final class C1056c extends j {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f75064c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1056c(kotlin.coroutines.d dVar, l lVar) {
            super(dVar);
            this.f75064c = lVar;
            l0.n(dVar, ProtectedSandApp.s("挢\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            int i4 = this.label;
            if (i4 == 0) {
                this.label = 1;
                a1.n(result);
                l0.n(this.f75064c, ProtectedSandApp.s("挤\u0001"));
                return ((l) u1.q(this.f75064c, 1)).invoke(this);
            }
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("挣\u0001"));
            }
            this.label = 2;
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f75066c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, kotlin.coroutines.g gVar, l lVar) {
            super(dVar, gVar);
            this.f75066c = lVar;
            l0.n(dVar, ProtectedSandApp.s("挥\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            int i4 = this.label;
            if (i4 == 0) {
                this.label = 1;
                a1.n(result);
                l0.n(this.f75066c, ProtectedSandApp.s("挧\u0001"));
                return ((l) u1.q(this.f75066c, 1)).invoke(this);
            }
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("挦\u0001"));
            }
            this.label = 2;
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/c$a", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    public static final class e extends j {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f75068c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f75069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f75068c = pVar;
            this.f75069d = obj;
            l0.n(dVar, ProtectedSandApp.s("挨\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            int i4 = this.label;
            if (i4 == 0) {
                this.label = 1;
                a1.n(result);
                l0.n(this.f75068c, ProtectedSandApp.s("挪\u0001"));
                return ((p) u1.q(this.f75068c, 2)).invoke(this.f75069d, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("挩\u0001"));
            }
            this.label = 2;
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f75071c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f75072d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.coroutines.d dVar, kotlin.coroutines.g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f75071c = pVar;
            this.f75072d = obj;
            l0.n(dVar, ProtectedSandApp.s("挫\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            int i4 = this.label;
            if (i4 == 0) {
                this.label = 1;
                a1.n(result);
                l0.n(this.f75071c, ProtectedSandApp.s("挭\u0001"));
                return ((p) u1.q(this.f75071c, 2)).invoke(this.f75072d, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException(ProtectedSandApp.s("挬\u0001"));
            }
            this.label = 2;
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/coroutines/intrinsics/c$g", "Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.coroutines.d<? super T> dVar) {
            super(dVar);
            l0.n(dVar, ProtectedSandApp.s("挮\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            a1.n(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/coroutines/intrinsics/c$h", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/z0;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.coroutines.d<? super T> dVar, kotlin.coroutines.g gVar) {
            super(dVar, gVar);
            l0.n(dVar, ProtectedSandApp.s("振\u0001"));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@fg.l Object result) {
            a1.n(result);
            return result;
        }
    }

    @c1(version = "1.3")
    private static final <T> kotlin.coroutines.d<k2> a(kotlin.coroutines.d<? super T> dVar, l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
        kotlin.coroutines.g f75054b = dVar.getF75054b();
        return f75054b == i.f75057b ? new a(dVar, lVar) : new b(dVar, f75054b, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @c1(version = "1.3")
    public static <T> kotlin.coroutines.d<k2> b(@fg.l l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        l0.p(lVar, ProtectedSandApp.s("挛\u0001"));
        String s4 = ProtectedSandApp.s("挜\u0001");
        l0.p(dVar, s4);
        l0.p(dVar, s4);
        if (lVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) lVar).create(dVar);
        }
        kotlin.coroutines.g f75054b = dVar.getF75054b();
        return f75054b == i.f75057b ? new C1056c(dVar, lVar) : new d(dVar, f75054b, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @c1(version = "1.3")
    public static <R, T> kotlin.coroutines.d<k2> c(@fg.l p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r4, @fg.l kotlin.coroutines.d<? super T> dVar) {
        l0.p(pVar, ProtectedSandApp.s("挛\u0001"));
        String s4 = ProtectedSandApp.s("挜\u0001");
        l0.p(dVar, s4);
        l0.p(dVar, s4);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r4, dVar);
        }
        kotlin.coroutines.g f75054b = dVar.getF75054b();
        return f75054b == i.f75057b ? new e(dVar, pVar, r4) : new f(dVar, f75054b, pVar, r4);
    }

    private static final <T> kotlin.coroutines.d<T> d(kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.g f75054b = dVar.getF75054b();
        return f75054b == i.f75057b ? new g(dVar) : new h(dVar, f75054b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    @c1(version = "1.3")
    public static <T> kotlin.coroutines.d<T> e(@fg.l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d<T> dVar2;
        l0.p(dVar, ProtectedSandApp.s("挛\u0001"));
        kotlin.coroutines.jvm.internal.d dVar3 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar3 == null || (dVar2 = (kotlin.coroutines.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object f(l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, kotlin.coroutines.d<? super T> dVar) {
        l0.p(lVar, ProtectedSandApp.s("挛\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挜\u0001"));
        return !(lVar instanceof kotlin.coroutines.jvm.internal.a) ? i(lVar, dVar) : ((l) u1.q(lVar, 1)).invoke(dVar);
    }

    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object g(p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r4, kotlin.coroutines.d<? super T> dVar) {
        l0.p(pVar, ProtectedSandApp.s("挛\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挜\u0001"));
        return !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? j(pVar, r4, dVar) : ((p) u1.q(pVar, 2)).invoke(r4, dVar);
    }

    @kotlin.internal.f
    private static final <R, P, T> Object h(q<? super R, ? super P, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, R r4, P p4, kotlin.coroutines.d<? super T> dVar) {
        l0.p(qVar, ProtectedSandApp.s("挛\u0001"));
        l0.p(dVar, ProtectedSandApp.s("挜\u0001"));
        return !(qVar instanceof kotlin.coroutines.jvm.internal.a) ? k(qVar, r4, p4, dVar) : ((q) u1.q(qVar, 3)).R(r4, p4, dVar);
    }

    @m
    @w0
    public static final <T> Object i(@fg.l l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        l0.p(lVar, ProtectedSandApp.s("挛\u0001"));
        String s4 = ProtectedSandApp.s("挜\u0001");
        l0.p(dVar, s4);
        l0.p(dVar, s4);
        return ((l) u1.q(lVar, 1)).invoke(d(dVar));
    }

    @m
    @w0
    public static final <R, T> Object j(@fg.l p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r4, @fg.l kotlin.coroutines.d<? super T> dVar) {
        l0.p(pVar, ProtectedSandApp.s("挛\u0001"));
        String s4 = ProtectedSandApp.s("挜\u0001");
        l0.p(dVar, s4);
        l0.p(dVar, s4);
        return ((p) u1.q(pVar, 2)).invoke(r4, d(dVar));
    }

    @m
    @w0
    public static <R, P, T> Object k(@fg.l q<? super R, ? super P, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, R r4, P p4, @fg.l kotlin.coroutines.d<? super T> dVar) {
        l0.p(qVar, ProtectedSandApp.s("挛\u0001"));
        String s4 = ProtectedSandApp.s("挜\u0001");
        l0.p(dVar, s4);
        l0.p(dVar, s4);
        return ((q) u1.q(qVar, 3)).R(r4, p4, d(dVar));
    }
}
