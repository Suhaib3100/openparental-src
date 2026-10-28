package androidx.compose.foundation.gestures;

import androidx.compose.ui.q;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.p2;

/* compiled from: ContentInViewNode.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001YB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\"\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\b*\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020$*\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020$*\u00020'2\u0006\u0010#\u001a\u00020'H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010&J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+J \u0010-\u001a\u00020\u00112\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0,H\u0096@¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020/H\u0016¢\u0006\u0004\b4\u00102J\u001a\u00105\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J-\u00108\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b8\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010;R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u00103\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010=R*\u0010R\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00198\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010=R\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/gestures/l;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/relocation/h;", "Landroidx/compose/ui/node/b0;", "Landroidx/compose/foundation/gestures/j0;", "orientation", "Landroidx/compose/foundation/gestures/w0;", "scrollState", "", "reverseDirection", "Landroidx/compose/foundation/gestures/k;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/j0;Landroidx/compose/foundation/gestures/w0;ZLandroidx/compose/foundation/gestures/k;)V", "Li0/i;", "O7", "()Li0/i;", "Lkotlin/k2;", "S7", "()V", "", "J7", "()F", "N7", "childBounds", "Landroidx/compose/ui/unit/u;", "containerSize", "M7", "(Li0/i;J)Li0/i;", "size", "Q7", "(Li0/i;J)Z", "Li0/f;", "U7", "(Li0/i;J)J", "other", "", "K7", "(JJ)I", "Li0/n;", "L7", "localRect", "G5", "(Li0/i;)Li0/i;", "Lkotlin/Function0;", "t1", "(Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/u;", "newBounds", "T7", "(Landroidx/compose/ui/layout/u;)V", "coordinates", "q", "l", "(J)V", "state", "V7", "p", "Landroidx/compose/foundation/gestures/j0;", "Landroidx/compose/foundation/gestures/w0;", "r", "Z", "s", "Landroidx/compose/foundation/gestures/k;", "Landroidx/compose/foundation/gestures/j;", "t", "Landroidx/compose/foundation/gestures/j;", "bringIntoViewRequests", "u", "Landroidx/compose/ui/layout/u;", "v", "focusedChild", "w", "Li0/i;", "focusedChildBoundsFromPreviousRemeasure", "x", "trackingFocusedChild", "<set-?>", "y", "J", "P7", "()J", "viewportSize", "z", "isAnimationRunning", "Landroidx/compose/foundation/gestures/h1;", "A", "Landroidx/compose/foundation/gestures/h1;", "animationState", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,429:1\n314#2,11:430\n1#3:441\n106#4,2:442\n108#4:455\n492#5,11:444\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n122#1:430,11\n323#1:442,2\n323#1:455\n323#1:444,11\n*E\n"})
/* loaded from: classes.dex */
public final class l extends q.d implements androidx.compose.foundation.relocation.h, androidx.compose.ui.node.b0 {
    public static final int B = 8;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private final h1 animationState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private j0 orientation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w0 scrollState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private k bringIntoViewSpec;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j bringIntoViewRequests = new j();

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u coordinates;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u focusedChild;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.i focusedChildBoundsFromPreviousRemeasure;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean trackingFocusedChild;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long viewportSize;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimationRunning;

    /* compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/l$a;", "", "Lkotlin/Function0;", "Li0/i;", "currentBounds", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "continuation", "<init>", "(Lld/a;Lkotlinx/coroutines/p;)V", "", "toString", "()Ljava/lang/String;", "a", "Lld/a;", "b", "()Lld/a;", "Lkotlinx/coroutines/p;", "()Lkotlinx/coroutines/p;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f4119c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.a<i0.i> currentBounds;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlinx.coroutines.p<k2> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l ld.a<i0.i> aVar, @fg.l kotlinx.coroutines.p<? super k2> pVar) {
            this.currentBounds = aVar;
            this.continuation = pVar;
        }

        @fg.l
        public final kotlinx.coroutines.p<k2> a() {
            return this.continuation;
        }

        @fg.l
        public final ld.a<i0.i> b() {
            return this.currentBounds;
        }

        @fg.l
        public String toString() {
            String str;
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.continuation.getF75269b().c(kotlinx.coroutines.q0.INSTANCE);
            String name = q0Var != null ? q0Var.getName() : null;
            StringBuilder sb = new StringBuilder("Request@");
            String num = Integer.toString(hashCode(), kotlin.text.c.a(16));
            kotlin.jvm.internal.l0.o(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            if (name == null || (str = android.support.v4.media.d.a("[", name, "](")) == null) {
                str = "(";
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.currentBounds.invoke());
            sb.append(", continuation=");
            sb.append(this.continuation);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4122a;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4122a = iArr;
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f4123b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4124c;

        /* compiled from: ContentInViewNode.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/q0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/q0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<q0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f4126b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f4127c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ l f4128d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.k2 f4129e;

            /* compiled from: ContentInViewNode.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.l$c$a$a, reason: collision with other inner class name */
            static final class C0071a extends kotlin.jvm.internal.n0 implements ld.l<Float, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l f4130b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ q0 f4131c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.k2 f4132d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0071a(l lVar, q0 q0Var, kotlinx.coroutines.k2 k2Var) {
                    super(1);
                    this.f4130b = lVar;
                    this.f4131c = q0Var;
                    this.f4132d = k2Var;
                }

                public final void a(float f4) {
                    float f5 = this.f4130b.reverseDirection ? 1.0f : -1.0f;
                    float a5 = this.f4131c.a(f5 * f4) * f5;
                    if (Math.abs(a5) < Math.abs(f4)) {
                        p2.j(this.f4132d, "Scroll animation cancelled because scroll was not consumed (" + a5 + " < " + f4 + ')', null, 2, null);
                    }
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(Float f4) {
                    a(f4.floatValue());
                    return k2.f75408a;
                }
            }

            /* compiled from: ContentInViewNode.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,429:1\n118#2,4:430\n123#2,4:435\n48#3:434\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$launchAnimation$2$1$2\n*L\n233#1:430,4\n233#1:435,4\n233#1:434\n*E\n"})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l f4133b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(l lVar) {
                    super(0);
                    this.f4133b = lVar;
                }

                public final void a() {
                    j jVar = this.f4133b.bringIntoViewRequests;
                    l lVar = this.f4133b;
                    while (true) {
                        if (!jVar.requests.V()) {
                            break;
                        }
                        i0.i invoke = ((a) jVar.requests.W()).b().invoke();
                        if (!(invoke == null ? true : l.R7(lVar, invoke, 0L, 1, null))) {
                            break;
                        }
                        kotlinx.coroutines.p<k2> a5 = ((a) jVar.requests.n0(jVar.requests.getSize() - 1)).a();
                        k2 k2Var = k2.f75408a;
                        z0.Companion companion = kotlin.z0.INSTANCE;
                        a5.resumeWith(k2Var);
                    }
                    if (this.f4133b.trackingFocusedChild) {
                        i0.i O7 = this.f4133b.O7();
                        if (O7 != null && l.R7(this.f4133b, O7, 0L, 1, null)) {
                            this.f4133b.trackingFocusedChild = false;
                        }
                    }
                    this.f4133b.animationState.j(this.f4133b.J7());
                }

                @Override // ld.a
                public /* bridge */ /* synthetic */ k2 invoke() {
                    a();
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, kotlinx.coroutines.k2 k2Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f4128d = lVar;
                this.f4129e = k2Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l q0 q0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f4128d, this.f4129e, dVar);
                aVar.f4127c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f4126b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    q0 q0Var = (q0) this.f4127c;
                    this.f4128d.animationState.j(this.f4128d.J7());
                    h1 h1Var = this.f4128d.animationState;
                    C0071a c0071a = new C0071a(this.f4128d, q0Var, this.f4129e);
                    b bVar = new b(this.f4128d);
                    this.f4126b = 1;
                    if (h1Var.h(c0071a, bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return k2.f75408a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = l.this.new c(dVar);
            cVar.f4124c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f4123b;
            CancellationException cancellationException = null;
            try {
                try {
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        kotlinx.coroutines.k2 B = n2.B(((kotlinx.coroutines.r0) this.f4124c).getCoroutineContext());
                        l.this.isAnimationRunning = true;
                        w0 w0Var = l.this.scrollState;
                        a aVar2 = new a(l.this, B, null);
                        this.f4123b = 1;
                        if (w0.h(w0Var, null, aVar2, this, 1, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    l.this.bringIntoViewRequests.g();
                    l.this.isAnimationRunning = false;
                    l.this.bringIntoViewRequests.b(null);
                    l.this.trackingFocusedChild = false;
                    return k2.f75408a;
                } catch (CancellationException e4) {
                    cancellationException = e4;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                l.this.isAnimationRunning = false;
                l.this.bringIntoViewRequests.b(cancellationException);
                l.this.trackingFocusedChild = false;
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public l(@fg.l j0 j0Var, @fg.l w0 w0Var, boolean z4, @fg.l k kVar) {
        this.orientation = j0Var;
        this.scrollState = w0Var;
        this.reverseDirection = z4;
        this.bringIntoViewSpec = kVar;
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        this.viewportSize = androidx.compose.ui.unit.u.f21529c;
        this.animationState = new h1(this.bringIntoViewSpec.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float J7() {
        if (androidx.compose.foundation.e.a(androidx.compose.ui.unit.u.INSTANCE, this.viewportSize)) {
            return 0.0f;
        }
        i0.i N7 = N7();
        if (N7 == null) {
            N7 = this.trackingFocusedChild ? O7() : null;
            if (N7 == null) {
                return 0.0f;
            }
        }
        long f4 = androidx.compose.ui.unit.v.f(this.viewportSize);
        int i4 = b.f4122a[this.orientation.ordinal()];
        if (i4 == 1) {
            return this.bringIntoViewSpec.a(N7.getTop(), N7.j() - N7.getTop(), i0.n.m(f4));
        }
        if (i4 == 2) {
            return this.bringIntoViewSpec.a(N7.t(), N7.x() - N7.t(), i0.n.t(f4));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int K7(long j4, long j5) {
        int i4 = b.f4122a[this.orientation.ordinal()];
        if (i4 == 1) {
            return kotlin.jvm.internal.l0.t(androidx.compose.ui.unit.u.j(j4), (int) (j5 & 4294967295L));
        }
        if (i4 == 2) {
            return kotlin.jvm.internal.l0.t(androidx.compose.ui.unit.u.m(j4), (int) (j5 >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int L7(long j4, long j5) {
        int i4 = b.f4122a[this.orientation.ordinal()];
        if (i4 == 1) {
            return Float.compare(i0.n.m(j4), i0.n.m(j5));
        }
        if (i4 == 2) {
            return Float.compare(i0.n.t(j4), i0.n.t(j5));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final i0.i M7(i0.i childBounds, long containerSize) {
        return childBounds.T(i0.f.z(U7(childBounds, containerSize)));
    }

    private final i0.i N7() {
        androidx.compose.runtime.collection.g gVar = this.bringIntoViewRequests.requests;
        int size = gVar.getSize();
        i0.i iVar = null;
        if (size > 0) {
            int i4 = size - 1;
            Object[] L = gVar.L();
            do {
                i0.i invoke = ((a) L[i4]).b().invoke();
                if (invoke != null) {
                    if (L7(invoke.z(), androidx.compose.ui.unit.v.f(this.viewportSize)) > 0) {
                        return iVar == null ? invoke : iVar;
                    }
                    iVar = invoke;
                }
                i4--;
            } while (i4 >= 0);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0.i O7() {
        androidx.compose.ui.layout.u uVar;
        androidx.compose.ui.layout.u uVar2 = this.coordinates;
        if (uVar2 != null) {
            if (!uVar2.f()) {
                uVar2 = null;
            }
            if (uVar2 != null && (uVar = this.focusedChild) != null) {
                if (!uVar.f()) {
                    uVar = null;
                }
                if (uVar != null) {
                    return uVar2.j0(uVar, false);
                }
            }
        }
        return null;
    }

    private final boolean Q7(i0.i iVar, long j4) {
        long U7 = U7(iVar, j4);
        return Math.abs(i0.f.p(U7)) <= 0.5f && Math.abs(i0.f.r(U7)) <= 0.5f;
    }

    static /* synthetic */ boolean R7(l lVar, i0.i iVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = lVar.viewportSize;
        }
        return lVar.Q7(iVar, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S7() {
        if (this.isAnimationRunning) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        kotlinx.coroutines.k.f(V6(), null, kotlinx.coroutines.t0.UNDISPATCHED, new c(null), 1, null);
    }

    private final long U7(i0.i childBounds, long containerSize) {
        long f4 = androidx.compose.ui.unit.v.f(containerSize);
        int i4 = b.f4122a[this.orientation.ordinal()];
        if (i4 == 1) {
            return i0.g.a(0.0f, this.bringIntoViewSpec.a(childBounds.getTop(), childBounds.j() - childBounds.getTop(), i0.n.m(f4)));
        }
        if (i4 == 2) {
            return i0.g.a(this.bringIntoViewSpec.a(childBounds.t(), childBounds.x() - childBounds.t(), i0.n.t(f4)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.foundation.relocation.h
    @fg.l
    public i0.i G5(@fg.l i0.i localRect) {
        if (androidx.compose.foundation.e.a(androidx.compose.ui.unit.u.INSTANCE, this.viewportSize)) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return M7(localRect, this.viewportSize);
    }

    /* renamed from: P7, reason: from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    public final void T7(@fg.m androidx.compose.ui.layout.u newBounds) {
        this.focusedChild = newBounds;
    }

    public final void V7(@fg.l j0 orientation, @fg.l w0 state, boolean reverseDirection, @fg.l k bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = state;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.node.b0
    public void l(long size) {
        i0.i O7;
        long j4 = this.viewportSize;
        this.viewportSize = size;
        if (K7(size, j4) < 0 && (O7 = O7()) != null) {
            i0.i iVar = this.focusedChildBoundsFromPreviousRemeasure;
            if (iVar == null) {
                iVar = O7;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && Q7(iVar, j4) && !Q7(O7, size)) {
                this.trackingFocusedChild = true;
                S7();
            }
            this.focusedChildBoundsFromPreviousRemeasure = O7;
        }
    }

    @Override // androidx.compose.ui.node.b0
    public void q(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.coordinates = coordinates;
    }

    @Override // androidx.compose.foundation.relocation.h
    @fg.m
    public Object t1(@fg.l ld.a<i0.i> aVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        i0.i invoke = aVar.invoke();
        if (invoke == null || R7(this, invoke, 0L, 1, null)) {
            return k2.f75408a;
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        if (this.bringIntoViewRequests.c(new a(aVar, qVar)) && !this.isAnimationRunning) {
            S7();
        }
        Object y4 = qVar.y();
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (y4 == aVar2) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == aVar2 ? y4 : k2.f75408a;
    }
}
