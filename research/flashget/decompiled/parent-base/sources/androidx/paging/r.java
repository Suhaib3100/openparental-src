package androidx.paging;

import androidx.paging.e0;
import androidx.paging.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CachedPageEventFlow.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/paging/r;", "", "T", "<init>", "()V", "Landroidx/paging/l0$a;", "event", "Lkotlin/k2;", "e", "(Landroidx/paging/l0$a;)V", "Landroidx/paging/l0$b;", "c", "(Landroidx/paging/l0$b;)V", "Landroidx/paging/l0$c;", "d", "(Landroidx/paging/l0$c;)V", "Landroidx/paging/l0;", "a", "(Landroidx/paging/l0;)V", "", "b", "()Ljava/util/List;", "", "I", "placeholdersBefore", "placeholdersAfter", "Lkotlin/collections/k;", "Landroidx/paging/t1;", "Lkotlin/collections/k;", "pages", "Landroidx/paging/j0;", "Landroidx/paging/j0;", "sourceStates", "Landroidx/paging/f0;", "Landroidx/paging/f0;", "mediatorStates", "", "f", "Z", "receivedFirstEvent", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
@androidx.annotation.m1(otherwise = 2)
/* loaded from: classes3.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.collections.k<t1<T>> pages = new kotlin.collections.k<>();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 sourceStates = new j0();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f0 mediatorStates;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean receivedFirstEvent;

    /* compiled from: CachedPageEventFlow.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32255a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.PREPEND.ordinal()] = 1;
            iArr[g0.APPEND.ordinal()] = 2;
            iArr[g0.REFRESH.ordinal()] = 3;
            f32255a = iArr;
        }
    }

    private final void c(l0.b<T> event) {
        this.sourceStates.e(event.u());
        this.mediatorStates = event.q();
        int i4 = a.f32255a[event.p().ordinal()];
        if (i4 == 1) {
            this.placeholdersBefore = event.t();
            Iterator<Integer> it = kotlin.ranges.s.k0(event.r().size() - 1, 0).iterator();
            while (it.hasNext()) {
                this.pages.addFirst(event.r().get(((kotlin.collections.u0) it).c()));
            }
            return;
        }
        if (i4 == 2) {
            this.placeholdersAfter = event.s();
            this.pages.addAll(event.r());
        } else {
            if (i4 != 3) {
                return;
            }
            this.pages.clear();
            this.placeholdersAfter = event.s();
            this.placeholdersBefore = event.t();
            this.pages.addAll(event.r());
        }
    }

    private final void d(l0.c<T> event) {
        this.sourceStates.e(event.l());
        this.mediatorStates = event.k();
    }

    private final void e(l0.a<T> event) {
        j0 j0Var = this.sourceStates;
        g0 m4 = event.m();
        e0.c.INSTANCE.getClass();
        j0Var.f(m4, e0.c.f31663d);
        int i4 = a.f32255a[event.m().ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            this.placeholdersBefore = event.q();
            int p4 = event.p();
            while (i5 < p4) {
                this.pages.removeFirst();
                i5++;
            }
            return;
        }
        if (i4 != 2) {
            throw new IllegalArgumentException("Page drop type must be prepend or append");
        }
        this.placeholdersAfter = event.q();
        int p5 = event.p();
        while (i5 < p5) {
            this.pages.removeLast();
            i5++;
        }
    }

    public final void a(@fg.l l0<T> event) {
        kotlin.jvm.internal.l0.p(event, "event");
        this.receivedFirstEvent = true;
        if (event instanceof l0.b) {
            c((l0.b) event);
        } else if (event instanceof l0.a) {
            e((l0.a) event);
        } else if (event instanceof l0.c) {
            d((l0.c) event);
        }
    }

    @fg.l
    public final List<l0<T>> b() {
        if (!this.receivedFirstEvent) {
            return kotlin.collections.j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        f0 j4 = this.sourceStates.j();
        if (this.pages.isEmpty()) {
            arrayList.add(new l0.c(j4, this.mediatorStates));
        } else {
            arrayList.add(l0.b.INSTANCE.e(kotlin.collections.w.V5(this.pages), this.placeholdersBefore, this.placeholdersAfter, j4, this.mediatorStates));
        }
        return arrayList;
    }
}
