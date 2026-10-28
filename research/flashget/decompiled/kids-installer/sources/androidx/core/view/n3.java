package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0000H\u0086\b\u001a3\u0010\u0011\u001a\u00020\b*\u00020\u00002!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\rH\u0086\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\b*\u00020\u000026\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0086\bø\u0001\u0000\u001a\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014*\u00020\u0000H\u0086\u0002\u001a\u0017\u0010\u0018\u001a\u00020\b*\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0001H\u0086\b\u001a5\u0010\u001d\u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a5\u0010 \u001a\u00020\b*\u00020\u00162\b\b\u0003\u0010\u001e\u001a\u00020\u00012\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001f\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u0001H\u0087\b\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030#*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "d", "view", "", "a", "Lkotlin/m2;", "l", "k", "h", "i", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "j", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "m", "left", "top", "right", "bottom", "n", "start", "end", "p", "g", "(Landroid/view/ViewGroup;)I", "Lkotlin/sequences/m;", "e", "(Landroid/view/ViewGroup;)Lkotlin/sequences/m;", "children", "f", "descendants", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class n3 {

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, d2 = {"androidx/core/view/n3$a", "Lkotlin/sequences/m;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Sequence<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f5603a;

        a(ViewGroup viewGroup) {
            this.f5603a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<View> iterator() {
            return n3.j(this.f5603a);
        }
    }

    /* compiled from: ViewGroup.kt */
    @DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 1, 1}, l = {97, 99}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Landroid/view/View;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class b extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super View>, Continuation<? super kotlin.m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f5604q;

        /* renamed from: r, reason: collision with root package name */
        Object f5605r;

        /* renamed from: s, reason: collision with root package name */
        int f5606s;

        /* renamed from: t, reason: collision with root package name */
        int f5607t;

        /* renamed from: u, reason: collision with root package name */
        int f5608u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f5609v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ ViewGroup f5610w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5610w = viewGroup;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x009b, code lost:
        
            if (r5 >= r4) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008e -> B:6:0x0090). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0097 -> B:7:0x009b). Please report as a decompilation issue!!! */
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
                int r1 = r10.f5608u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3c
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                int r1 = r10.f5607t
                int r4 = r10.f5606s
                java.lang.Object r5 = r10.f5604q
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r10.f5609v
                kotlin.sequences.o r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.a1.n(r11)
                r7 = r10
                goto L90
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                int r1 = r10.f5607t
                int r4 = r10.f5606s
                java.lang.Object r5 = r10.f5605r
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r10.f5604q
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r10.f5609v
                kotlin.sequences.o r7 = (kotlin.sequences.SequenceScope) r7
                kotlin.a1.n(r11)
                r11 = r7
                r7 = r10
                goto L70
            L3c:
                kotlin.a1.n(r11)
                java.lang.Object r11 = r10.f5609v
                kotlin.sequences.o r11 = (kotlin.sequences.SequenceScope) r11
                android.view.ViewGroup r1 = r10.f5610w
                int r4 = r1.getChildCount()
                if (r4 <= 0) goto L9d
                r5 = 0
                r6 = r10
            L4d:
                int r7 = r5 + 1
                android.view.View r5 = r1.getChildAt(r5)
                java.lang.String r8 = "getChildAt(index)"
                kotlin.jvm.internal.l0.o(r5, r8)
                r6.f5609v = r11
                r6.f5604q = r1
                r6.f5605r = r5
                r6.f5606s = r7
                r6.f5607t = r4
                r6.f5608u = r3
                java.lang.Object r8 = r11.f(r5, r6)
                if (r8 != r0) goto L6b
                return r0
            L6b:
                r9 = r6
                r6 = r1
                r1 = r4
                r4 = r7
                r7 = r9
            L70:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L97
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                kotlin.sequences.m r5 = androidx.core.view.n3.f(r5)
                r7.f5609v = r11
                r7.f5604q = r6
                r8 = 0
                r7.f5605r = r8
                r7.f5606s = r4
                r7.f5607t = r1
                r7.f5608u = r2
                java.lang.Object r5 = r11.j(r5, r7)
                if (r5 != r0) goto L8e
                return r0
            L8e:
                r5 = r6
                r6 = r11
            L90:
                r11 = r6
                r6 = r7
                r9 = r4
                r4 = r1
                r1 = r5
                r5 = r9
                goto L9b
            L97:
                r5 = r4
                r4 = r1
                r1 = r6
                r6 = r7
            L9b:
                if (r5 < r4) goto L4d
            L9d:
                kotlin.m2 r11 = kotlin.m2.f23662a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.n3.b.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super View> sequenceScope, @d5.e Continuation<? super kotlin.m2> continuation) {
            return ((b) c(sequenceScope, continuation)).A(kotlin.m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<kotlin.m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            b bVar = new b(this.f5610w, continuation);
            bVar.f5609v = obj;
            return bVar;
        }
    }

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/core/view/n3$c", "", "Landroid/view/View;", "", "hasNext", "a", "Lkotlin/m2;", "remove", "", "o", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c implements Iterator<View>, r3.d {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ViewGroup f5612p;

        c(ViewGroup viewGroup) {
            this.f5612p = viewGroup;
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f5612p;
            int i5 = this.index;
            this.index = i5 + 1;
            View childAt = viewGroup.getChildAt(i5);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f5612p.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f5612p;
            int i5 = this.index - 1;
            this.index = i5;
            viewGroup.removeViewAt(i5);
        }
    }

    public static final boolean a(@d5.d ViewGroup viewGroup, @d5.d View view) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        kotlin.jvm.internal.l0.p(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@d5.d ViewGroup viewGroup, @d5.d q3.l<? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            View childAt = viewGroup.getChildAt(i5);
            kotlin.jvm.internal.l0.o(childAt, "getChildAt(index)");
            action.N(childAt);
            if (i6 >= childCount) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    public static final void c(@d5.d ViewGroup viewGroup, @d5.d q3.p<? super Integer, ? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            Integer valueOf = Integer.valueOf(i5);
            View childAt = viewGroup.getChildAt(i5);
            kotlin.jvm.internal.l0.o(childAt, "getChildAt(index)");
            action.g0(valueOf, childAt);
            if (i6 >= childCount) {
                return;
            } else {
                i5 = i6;
            }
        }
    }

    @d5.d
    public static final View d(@d5.d ViewGroup viewGroup, int i5) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i5);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder a6 = androidx.core.app.x.a("Index: ", i5, ", Size: ");
        a6.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(a6.toString());
    }

    @d5.d
    public static final Sequence<View> e(@d5.d ViewGroup viewGroup) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        return new a(viewGroup);
    }

    @d5.d
    public static final Sequence<View> f(@d5.d ViewGroup viewGroup) {
        Sequence<View> b6;
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        b6 = kotlin.sequences.q.b(new b(viewGroup, null));
        return b6;
    }

    public static final int g(@d5.d ViewGroup viewGroup) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean h(@d5.d ViewGroup viewGroup) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean i(@d5.d ViewGroup viewGroup) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    @d5.d
    public static final Iterator<View> j(@d5.d ViewGroup viewGroup) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        return new c(viewGroup);
    }

    public static final void k(@d5.d ViewGroup viewGroup, @d5.d View view) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        kotlin.jvm.internal.l0.p(view, "view");
        viewGroup.removeView(view);
    }

    public static final void l(@d5.d ViewGroup viewGroup, @d5.d View view) {
        kotlin.jvm.internal.l0.p(viewGroup, "<this>");
        kotlin.jvm.internal.l0.p(view, "view");
        viewGroup.addView(view);
    }

    public static final void m(@d5.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.u0 int i5) {
        kotlin.jvm.internal.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i5, i5, i5, i5);
    }

    public static final void n(@d5.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7, @androidx.annotation.u0 int i8) {
        kotlin.jvm.internal.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i5, i6, i7, i8);
    }

    public static /* synthetic */ void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = marginLayoutParams.leftMargin;
        }
        if ((i9 & 2) != 0) {
            i6 = marginLayoutParams.topMargin;
        }
        if ((i9 & 4) != 0) {
            i7 = marginLayoutParams.rightMargin;
        }
        if ((i9 & 8) != 0) {
            i8 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i5, i6, i7, i8);
    }

    @androidx.annotation.x0(17)
    public static final void p(@d5.d ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7, @androidx.annotation.u0 int i8) {
        kotlin.jvm.internal.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i5);
        marginLayoutParams.topMargin = i6;
        marginLayoutParams.setMarginEnd(i7);
        marginLayoutParams.bottomMargin = i8;
    }

    public static /* synthetic */ void q(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = marginLayoutParams.getMarginStart();
        }
        if ((i9 & 2) != 0) {
            i6 = marginLayoutParams.topMargin;
        }
        if ((i9 & 4) != 0) {
            i7 = marginLayoutParams.getMarginEnd();
        }
        if ((i9 & 8) != 0) {
            i8 = marginLayoutParams.bottomMargin;
        }
        kotlin.jvm.internal.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i5);
        marginLayoutParams.topMargin = i6;
        marginLayoutParams.setMarginEnd(i7);
        marginLayoutParams.bottomMargin = i8;
    }
}
