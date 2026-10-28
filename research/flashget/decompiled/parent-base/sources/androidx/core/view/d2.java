package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ViewGroup.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\r\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a7\u0010\u0015\u001a\u00020\n*\u00020\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0011H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aL\u0010\u0018\u001a\u00020\n*\u00020\u000026\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\n0\u0017H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\n*\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001f\u0010 \u001a<\u0010%\u001a\u00020\n*\u00020\u001d2\b\b\u0003\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0003\u0010#\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b%\u0010&\u001a<\u0010)\u001a\u00020\n*\u00020\u001d2\b\b\u0003\u0010'\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0003\u0010(\u001a\u00020\u00012\b\b\u0003\u0010$\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b)\u0010&\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0016\u0010/\u001a\u00020,*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.\"\u001b\u00103\u001a\b\u0012\u0004\u0012\u00020\u000300*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u000300*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "d", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "view", "", "a", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "Lkotlin/k2;", "m", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "l", "i", "(Landroid/view/ViewGroup;)Z", "j", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "action", "b", "(Landroid/view/ViewGroup;Lld/l;)V", "Lkotlin/Function2;", "c", "(Landroid/view/ViewGroup;Lld/p;)V", "", "k", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Landroid/view/ViewGroup$MarginLayoutParams;", "size", "n", "(Landroid/view/ViewGroup$MarginLayoutParams;I)V", "left", "top", "right", "bottom", "o", "(Landroid/view/ViewGroup$MarginLayoutParams;IIII)V", "start", "end", "q", "h", "(Landroid/view/ViewGroup;)I", "Lkotlin/ranges/l;", "g", "(Landroid/view/ViewGroup;)Lkotlin/ranges/l;", "indices", "Lkotlin/sequences/m;", "e", "(Landroid/view/ViewGroup;)Lkotlin/sequences/m;", "children", "f", "descendants", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d2 {

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/core/view/d2$a", "Lkotlin/sequences/m;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements kotlin.sequences.m<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f27100a;

        a(ViewGroup viewGroup) {
            this.f27100a = viewGroup;
        }

        @Override // kotlin.sequences.m
        public Iterator<View> iterator() {
            return new c(this.f27100a);
        }
    }

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "child", "", "a", "(Landroid/view/View;)Ljava/util/Iterator;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<View, Iterator<? extends View>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27101b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                return new a(viewGroup).iterator();
            }
            return null;
        }
    }

    /* compiled from: ViewGroup.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/view/d2$c", "", "Landroid/view/View;", "", "hasNext", "()Z", "b", "()Landroid/view/View;", "Lkotlin/k2;", "remove", "()V", "", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Iterator<View>, md.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f27103c;

        c(ViewGroup viewGroup) {
            this.f27103c = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f27103c;
            int i4 = this.index;
            this.index = i4 + 1;
            View childAt = viewGroup.getChildAt(i4);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f27103c.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f27103c;
            int i4 = this.index - 1;
            this.index = i4;
            viewGroup.removeViewAt(i4);
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n134#2:681\n*E\n"})
    public static final class d implements kotlin.sequences.m<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f27104a;

        public d(ViewGroup viewGroup) {
            this.f27104a = viewGroup;
        }

        @Override // kotlin.sequences.m
        @fg.l
        public Iterator<View> iterator() {
            return new t1(new a(this.f27104a).iterator(), b.f27101b);
        }
    }

    public static final boolean a(@fg.l ViewGroup viewGroup, @fg.l View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@fg.l ViewGroup viewGroup, @fg.l ld.l<? super View, kotlin.k2> lVar) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            lVar.invoke(viewGroup.getChildAt(i4));
        }
    }

    public static final void c(@fg.l ViewGroup viewGroup, @fg.l ld.p<? super Integer, ? super View, kotlin.k2> pVar) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            pVar.invoke(Integer.valueOf(i4), viewGroup.getChildAt(i4));
        }
    }

    @fg.l
    public static final View d(@fg.l ViewGroup viewGroup, int i4) {
        View childAt = viewGroup.getChildAt(i4);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder a5 = androidx.collection.s.a("Index: ", i4, ", Size: ");
        a5.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(a5.toString());
    }

    @fg.l
    public static final kotlin.sequences.m<View> e(@fg.l ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @fg.l
    public static final kotlin.sequences.m<View> f(@fg.l ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    @fg.l
    public static final kotlin.ranges.l g(@fg.l ViewGroup viewGroup) {
        return kotlin.ranges.s.W1(0, viewGroup.getChildCount());
    }

    public static final int h(@fg.l ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean i(@fg.l ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@fg.l ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @fg.l
    public static final Iterator<View> k(@fg.l ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final void l(@fg.l ViewGroup viewGroup, @fg.l View view) {
        viewGroup.removeView(view);
    }

    public static final void m(@fg.l ViewGroup viewGroup, @fg.l View view) {
        viewGroup.addView(view);
    }

    public static final void n(@fg.l ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.u0 int i4) {
        marginLayoutParams.setMargins(i4, i4, i4, i4);
    }

    public static final void o(@fg.l ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.u0 int i4, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7) {
        marginLayoutParams.setMargins(i4, i5, i6, i7);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = marginLayoutParams.leftMargin;
        }
        if ((i10 & 2) != 0) {
            i5 = marginLayoutParams.topMargin;
        }
        if ((i10 & 4) != 0) {
            i6 = marginLayoutParams.rightMargin;
        }
        if ((i10 & 8) != 0) {
            i7 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i4, i5, i6, i7);
    }

    public static final void q(@fg.l ViewGroup.MarginLayoutParams marginLayoutParams, @androidx.annotation.u0 int i4, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7) {
        marginLayoutParams.setMarginStart(i4);
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.setMarginEnd(i6);
        marginLayoutParams.bottomMargin = i7;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = marginLayoutParams.getMarginStart();
        }
        if ((i10 & 2) != 0) {
            i5 = marginLayoutParams.topMargin;
        }
        if ((i10 & 4) != 0) {
            i6 = marginLayoutParams.getMarginEnd();
        }
        if ((i10 & 8) != 0) {
            i7 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i4);
        marginLayoutParams.topMargin = i5;
        marginLayoutParams.setMarginEnd(i6);
        marginLayoutParams.bottomMargin = i7;
    }
}
