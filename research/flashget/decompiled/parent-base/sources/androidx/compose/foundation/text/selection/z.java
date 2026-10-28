package androidx.compose.foundation.text.selection;

import com.android.internal.telephony.SmsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u0011\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001a&\u0010\u001c\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010%\u001a\u00020\"8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0018\u0010(\u001a\u00020\u0002*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "", "Lkotlin/k2;", "updateTouchMode", "j", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/foundation/text/selection/j;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/o0;", "textDragObserver", "h", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/selection/j;Landroidx/compose/foundation/text/o0;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/c;", "observer", "Landroidx/compose/ui/input/pointer/p;", "down", "i", "(Landroidx/compose/ui/input/pointer/c;Landroidx/compose/foundation/text/o0;Landroidx/compose/ui/input/pointer/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/d;", "clicksCounter", "g", "(Landroidx/compose/ui/input/pointer/c;Landroidx/compose/foundation/text/selection/j;Landroidx/compose/foundation/text/selection/d;Landroidx/compose/ui/input/pointer/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "(Landroidx/compose/ui/input/pointer/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Li0/f;", "offset1", "offset2", "e", "(Landroidx/compose/ui/input/pointer/c;JJ)Z", "", "a", "I", "STATIC_KEY", "", "b", "D", "ClicksSlop", "f", "(Landroidx/compose/ui/input/pointer/p;)Z", "isPrecisePointer", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,238:1\n33#2,6:239\n33#2,6:245\n33#2,6:251\n86#2,2:257\n33#2,6:259\n88#2:265\n86#2,2:266\n33#2,6:268\n88#2:274\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n129#1:239,6\n160#1:245,6\n183#1:251,6\n226#1:257,2\n226#1:259,6\n226#1:265\n237#1:266,2\n237#1:268,6\n237#1:274\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8216a = 8675309;

    /* renamed from: b, reason: collision with root package name */
    public static final double f8217b = 100.0d;

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {225}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8218b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f8219c;

        /* renamed from: d, reason: collision with root package name */
        int f8220d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8219c = obj;
            this.f8220d |= Integer.MIN_VALUE;
            return z.d(null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1}, l = {SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER, SyslogAppender.LOG_LOCAL6}, m = "mouseSelection", n = {"$this$mouseSelection", "observer", "$this$mouseSelection", "observer"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8221b;

        /* renamed from: c, reason: collision with root package name */
        Object f8222c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f8223d;

        /* renamed from: e, reason: collision with root package name */
        int f8224e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8223d = obj;
            this.f8224e |= Integer.MIN_VALUE;
            return z.g(null, null, null, null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f8225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(1);
            this.f8225b = jVar;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            if (this.f8225b.b(b0Var.getPosition())) {
                b0Var.a();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
            a(b0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f8226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f8227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(j jVar, w wVar) {
            super(1);
            this.f8226b = jVar;
            this.f8227c = wVar;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            if (this.f8226b.d(b0Var.getPosition(), this.f8227c)) {
                b0Var.a();
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
            a(b0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8228b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8229c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j f8230d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.o0 f8231e;

        /* compiled from: SelectionGestures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {100, 106, 108}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,238:1\n86#2,2:239\n33#2,6:241\n88#2:247\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n104#1:239,2\n104#1:241,6\n104#1:247\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f8232c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f8233d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j f8234e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.d f8235f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.o0 f8236g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, androidx.compose.foundation.text.selection.d dVar, androidx.compose.foundation.text.o0 o0Var, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f8234e = jVar;
                this.f8235f = dVar;
                this.f8236g = o0Var;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f8234e, this.f8235f, this.f8236g, dVar);
                aVar.f8233d = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                androidx.compose.ui.input.pointer.c cVar;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f8232c;
                if (i4 == 0) {
                    a1.n(obj);
                    cVar = (androidx.compose.ui.input.pointer.c) this.f8233d;
                    this.f8233d = cVar;
                    this.f8232c = 1;
                    obj = z.d(cVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                        return k2.f75408a;
                    }
                    cVar = (androidx.compose.ui.input.pointer.c) this.f8233d;
                    a1.n(obj);
                }
                androidx.compose.ui.input.pointer.p pVar = (androidx.compose.ui.input.pointer.p) obj;
                if (z.f(pVar) && androidx.compose.ui.input.pointer.u.o(pVar.getButtons())) {
                    List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
                    int size = e4.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (!e4.get(i5).D()) {
                        }
                    }
                    j jVar = this.f8234e;
                    androidx.compose.foundation.text.selection.d dVar = this.f8235f;
                    this.f8233d = null;
                    this.f8232c = 2;
                    if (z.g(cVar, jVar, dVar, pVar, this) == aVar) {
                        return aVar;
                    }
                    return k2.f75408a;
                }
                if (!z.f(pVar)) {
                    androidx.compose.foundation.text.o0 o0Var = this.f8236g;
                    this.f8233d = null;
                    this.f8232c = 3;
                    if (z.i(cVar, o0Var, pVar, this) == aVar) {
                        return aVar;
                    }
                }
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j jVar, androidx.compose.foundation.text.o0 o0Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f8230d = jVar;
            this.f8231e = o0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f8230d, this.f8231e, dVar);
            eVar.f8229c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8228b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8229c;
                a aVar2 = new a(this.f8230d, new androidx.compose.foundation.text.selection.d(k0Var.d()), this.f8231e, null);
                this.f8228b = 1;
                if (androidx.compose.foundation.gestures.f0.d(k0Var, aVar2, this) == aVar) {
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

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {119, 123}, m = "touchSelection", n = {"$this$touchSelection", "observer", "firstDown", "$this$touchSelection", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8237b;

        /* renamed from: c, reason: collision with root package name */
        Object f8238c;

        /* renamed from: d, reason: collision with root package name */
        Object f8239d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f8240e;

        /* renamed from: f, reason: collision with root package name */
        int f8241f;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8240e = obj;
            this.f8241f |= Integer.MIN_VALUE;
            return z.i(null, null, null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/b0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/input/pointer/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.pointer.b0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.o0 f8242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.foundation.text.o0 o0Var) {
            super(1);
            this.f8242b = o0Var;
        }

        public final void a(@fg.l androidx.compose.ui.input.pointer.b0 b0Var) {
            this.f8242b.d(androidx.compose.ui.input.pointer.q.k(b0Var));
            b0Var.a();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.input.pointer.b0 b0Var) {
            a(b0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1", f = "SelectionGestures.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8243b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, k2> f8245d;

        /* compiled from: SelectionGestures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: c, reason: collision with root package name */
            int f8246c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f8247d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.l<Boolean, k2> f8248e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.l<? super Boolean, k2> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8248e = lVar;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f8248e, dVar);
                aVar.f8247d = obj;
                return aVar;
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r5) {
                /*
                    r4 = this;
                    kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r1 = r4.f8246c
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r1 = r4.f8247d
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                    kotlin.a1.n(r5)
                    goto L2e
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.a1.n(r5)
                    java.lang.Object r5 = r4.f8247d
                    androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
                    r1 = r5
                L21:
                    androidx.compose.ui.input.pointer.r r5 = androidx.compose.ui.input.pointer.r.Initial
                    r4.f8247d = r1
                    r4.f8246c = r2
                    java.lang.Object r5 = r1.u3(r5, r4)
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    androidx.compose.ui.input.pointer.p r5 = (androidx.compose.ui.input.pointer.p) r5
                    ld.l<java.lang.Boolean, kotlin.k2> r3 = r4.f8248e
                    boolean r5 = androidx.compose.foundation.text.selection.z.f(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r3.invoke(r5)
                    goto L21
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.z.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.l<? super Boolean, k2> lVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f8245d = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((h) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f8245d, dVar);
            hVar.f8244c = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8243b;
            if (i4 == 0) {
                a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f8244c;
                a aVar2 = new a(this.f8245d, null);
                this.f8243b = 1;
                if (k0Var.o3(aVar2, this) == aVar) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:10:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.c r7, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.p> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.z.a
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.z$a r0 = (androidx.compose.foundation.text.selection.z.a) r0
            int r1 = r0.f8220d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8220d = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.z$a r0 = new androidx.compose.foundation.text.selection.z$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8219c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8220d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f8218b
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.ui.input.pointer.c) r7
            kotlin.a1.n(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.a1.n(r8)
        L36:
            androidx.compose.ui.input.pointer.r r8 = androidx.compose.ui.input.pointer.r.Main
            r0.f8218b = r7
            r0.f8220d = r3
            java.lang.Object r8 = r7.u3(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.ui.input.pointer.p) r8
            java.util.List r2 = r8.e()
            int r4 = r2.size()
            r5 = 0
        L4e:
            if (r5 >= r4) goto L60
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.b0 r6 = (androidx.compose.ui.input.pointer.b0) r6
            boolean r6 = androidx.compose.ui.input.pointer.q.c(r6)
            if (r6 != 0) goto L5d
            goto L36
        L5d:
            int r5 = r5 + 1
            goto L4e
        L60:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.z.d(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    private static final boolean e(androidx.compose.ui.input.pointer.c cVar, long j4, long j5) {
        return i0.f.m(i0.f.u(j4, j5)) < cVar.d().h();
    }

    public static final boolean f(@fg.l androidx.compose.ui.input.pointer.p pVar) {
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        int size = e4.size();
        for (int i4 = 0; i4 < size; i4++) {
            int type = e4.get(i4).getType();
            androidx.compose.ui.input.pointer.q0.INSTANCE.getClass();
            if (!androidx.compose.ui.input.pointer.q0.i(type, androidx.compose.ui.input.pointer.q0.f18818e)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(androidx.compose.ui.input.pointer.c r7, androidx.compose.foundation.text.selection.j r8, androidx.compose.foundation.text.selection.d r9, androidx.compose.ui.input.pointer.p r10, kotlin.coroutines.d<? super kotlin.k2> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.z.b
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.z$b r0 = (androidx.compose.foundation.text.selection.z.b) r0
            int r1 = r0.f8224e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8224e = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.z$b r0 = new androidx.compose.foundation.text.selection.z$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f8223d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8224e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L75
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r7 = r0.f8222c
            r8 = r7
            androidx.compose.foundation.text.selection.j r8 = (androidx.compose.foundation.text.selection.j) r8
            java.lang.Object r7 = r0.f8221b
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.ui.input.pointer.c) r7
            kotlin.a1.n(r11)
            goto Lc1
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f8222c
            androidx.compose.foundation.text.selection.j r7 = (androidx.compose.foundation.text.selection.j) r7
            java.lang.Object r8 = r0.f8221b
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.c) r8
            kotlin.a1.n(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L70
            androidx.compose.ui.input.pointer.p r8 = r8.v3()
            java.util.List r8 = r8.e()
            int r9 = r8.size()
        L5c:
            if (r3 >= r9) goto L70
            java.lang.Object r10 = r8.get(r3)
            androidx.compose.ui.input.pointer.b0 r10 = (androidx.compose.ui.input.pointer.b0) r10
            boolean r11 = androidx.compose.ui.input.pointer.q.d(r10)
            if (r11 == 0) goto L6d
            r10.a()
        L6d:
            int r3 = r3 + 1
            goto L5c
        L70:
            r7.a()
            goto Lec
        L75:
            kotlin.a1.n(r11)
            r9.g(r10)
            java.util.List r10 = r10.e()
            java.lang.Object r10 = r10.get(r3)
            androidx.compose.ui.input.pointer.b0 r10 = (androidx.compose.ui.input.pointer.b0) r10
            int r9 = r9.getClicks()
            if (r9 == r5) goto L9b
            if (r9 == r4) goto L94
            androidx.compose.foundation.text.selection.w$a r9 = androidx.compose.foundation.text.selection.w.INSTANCE
            androidx.compose.foundation.text.selection.w r9 = r9.n()
            goto La1
        L94:
            androidx.compose.foundation.text.selection.w$a r9 = androidx.compose.foundation.text.selection.w.INSTANCE
            androidx.compose.foundation.text.selection.w r9 = r9.o()
            goto La1
        L9b:
            androidx.compose.foundation.text.selection.w$a r9 = androidx.compose.foundation.text.selection.w.INSTANCE
            androidx.compose.foundation.text.selection.w r9 = r9.m()
        La1:
            long r5 = r10.getPosition()
            boolean r11 = r8.c(r5, r9)
            if (r11 == 0) goto Lec
            long r10 = r10.getId()
            androidx.compose.foundation.text.selection.z$d r2 = new androidx.compose.foundation.text.selection.z$d
            r2.<init>(r8, r9)
            r0.f8221b = r7
            r0.f8222c = r8
            r0.f8224e = r4
            java.lang.Object r11 = androidx.compose.foundation.gestures.u.x(r7, r10, r2, r0)
            if (r11 != r1) goto Lc1
            return r1
        Lc1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto Le9
            androidx.compose.ui.input.pointer.p r7 = r7.v3()
            java.util.List r7 = r7.e()
            int r9 = r7.size()
        Ld5:
            if (r3 >= r9) goto Le9
            java.lang.Object r10 = r7.get(r3)
            androidx.compose.ui.input.pointer.b0 r10 = (androidx.compose.ui.input.pointer.b0) r10
            boolean r11 = androidx.compose.ui.input.pointer.q.d(r10)
            if (r11 == 0) goto Le6
            r10.a()
        Le6:
            int r3 = r3 + 1
            goto Ld5
        Le9:
            r8.a()
        Lec:
            kotlin.k2 r7 = kotlin.k2.f75408a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.z.g(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.selection.j, androidx.compose.foundation.text.selection.d, androidx.compose.ui.input.pointer.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final androidx.compose.ui.q h(@fg.l androidx.compose.ui.q qVar, @fg.l j jVar, @fg.l androidx.compose.foundation.text.o0 o0Var) {
        return androidx.compose.ui.input.pointer.u0.d(qVar, jVar, o0Var, new e(jVar, o0Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac A[Catch: CancellationException -> 0x0034, TryCatch #0 {CancellationException -> 0x0034, blocks: (B:12:0x002f, B:13:0x00a4, B:15:0x00ac, B:17:0x00bb, B:19:0x00c7, B:21:0x00ca, B:24:0x00cd, B:28:0x00d1, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0084, B:42:0x0055), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1 A[Catch: CancellationException -> 0x0034, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0034, blocks: (B:12:0x002f, B:13:0x00a4, B:15:0x00ac, B:17:0x00bb, B:19:0x00c7, B:21:0x00ca, B:24:0x00cd, B:28:0x00d1, B:32:0x004b, B:34:0x0072, B:36:0x0076, B:38:0x0084, B:42:0x0055), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(androidx.compose.ui.input.pointer.c r9, androidx.compose.foundation.text.o0 r10, androidx.compose.ui.input.pointer.p r11, kotlin.coroutines.d<? super kotlin.k2> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.text.selection.z.f
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.text.selection.z$f r0 = (androidx.compose.foundation.text.selection.z.f) r0
            int r1 = r0.f8241f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8241f = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.z$f r0 = new androidx.compose.foundation.text.selection.z$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f8240e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8241f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f8238c
            r10 = r9
            androidx.compose.foundation.text.o0 r10 = (androidx.compose.foundation.text.o0) r10
            java.lang.Object r9 = r0.f8237b
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.c) r9
            kotlin.a1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L34
            goto La4
        L34:
            r9 = move-exception
            goto Ld7
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.Object r9 = r0.f8239d
            androidx.compose.ui.input.pointer.b0 r9 = (androidx.compose.ui.input.pointer.b0) r9
            java.lang.Object r10 = r0.f8238c
            androidx.compose.foundation.text.o0 r10 = (androidx.compose.foundation.text.o0) r10
            java.lang.Object r11 = r0.f8237b
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.ui.input.pointer.c) r11
            kotlin.a1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L34
            r8 = r11
            r11 = r9
            r9 = r8
            goto L72
        L52:
            kotlin.a1.n(r12)
            java.util.List r11 = r11.e()     // Catch: java.util.concurrent.CancellationException -> L34
            java.lang.Object r11 = kotlin.collections.w.B2(r11)     // Catch: java.util.concurrent.CancellationException -> L34
            androidx.compose.ui.input.pointer.b0 r11 = (androidx.compose.ui.input.pointer.b0) r11     // Catch: java.util.concurrent.CancellationException -> L34
            long r5 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8237b = r9     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8238c = r10     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8239d = r11     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8241f = r4     // Catch: java.util.concurrent.CancellationException -> L34
            java.lang.Object r12 = androidx.compose.foundation.gestures.u.g(r9, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L34
            if (r12 != r1) goto L72
            return r1
        L72:
            androidx.compose.ui.input.pointer.b0 r12 = (androidx.compose.ui.input.pointer.b0) r12     // Catch: java.util.concurrent.CancellationException -> L34
            if (r12 == 0) goto Ld4
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L34
            long r6 = r12.getPosition()     // Catch: java.util.concurrent.CancellationException -> L34
            boolean r11 = e(r9, r4, r6)     // Catch: java.util.concurrent.CancellationException -> L34
            if (r11 == 0) goto Ld4
            long r4 = r12.getPosition()     // Catch: java.util.concurrent.CancellationException -> L34
            r10.b(r4)     // Catch: java.util.concurrent.CancellationException -> L34
            long r11 = r12.getId()     // Catch: java.util.concurrent.CancellationException -> L34
            androidx.compose.foundation.text.selection.z$g r2 = new androidx.compose.foundation.text.selection.z$g     // Catch: java.util.concurrent.CancellationException -> L34
            r2.<init>(r10)     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8237b = r9     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8238c = r10     // Catch: java.util.concurrent.CancellationException -> L34
            r4 = 0
            r0.f8239d = r4     // Catch: java.util.concurrent.CancellationException -> L34
            r0.f8241f = r3     // Catch: java.util.concurrent.CancellationException -> L34
            java.lang.Object r12 = androidx.compose.foundation.gestures.u.x(r9, r11, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L34
            if (r12 != r1) goto La4
            return r1
        La4:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L34
            boolean r11 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L34
            if (r11 == 0) goto Ld1
            androidx.compose.ui.input.pointer.p r9 = r9.v3()     // Catch: java.util.concurrent.CancellationException -> L34
            java.util.List r9 = r9.e()     // Catch: java.util.concurrent.CancellationException -> L34
            int r11 = r9.size()     // Catch: java.util.concurrent.CancellationException -> L34
            r12 = 0
        Lb9:
            if (r12 >= r11) goto Lcd
            java.lang.Object r0 = r9.get(r12)     // Catch: java.util.concurrent.CancellationException -> L34
            androidx.compose.ui.input.pointer.b0 r0 = (androidx.compose.ui.input.pointer.b0) r0     // Catch: java.util.concurrent.CancellationException -> L34
            boolean r1 = androidx.compose.ui.input.pointer.q.d(r0)     // Catch: java.util.concurrent.CancellationException -> L34
            if (r1 == 0) goto Lca
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L34
        Lca:
            int r12 = r12 + 1
            goto Lb9
        Lcd:
            r10.onStop()     // Catch: java.util.concurrent.CancellationException -> L34
            goto Ld4
        Ld1:
            r10.onCancel()     // Catch: java.util.concurrent.CancellationException -> L34
        Ld4:
            kotlin.k2 r9 = kotlin.k2.f75408a
            return r9
        Ld7:
            r10.onCancel()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.z.i(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.o0, androidx.compose.ui.input.pointer.p, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    public static final androidx.compose.ui.q j(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super Boolean, k2> lVar) {
        return androidx.compose.ui.input.pointer.u0.e(qVar, Integer.valueOf(f8216a), new h(lVar, null));
    }
}
