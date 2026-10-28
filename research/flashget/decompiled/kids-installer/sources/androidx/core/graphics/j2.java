package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Region.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\r\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\f\u001a3\u0010\u0019\u001a\u00020\u0017*\u00020\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\bø\u0001\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a*\u00020\u0000H\u0086\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "c", "Landroid/graphics/Rect;", "r", "k", "l", "f", "g", "m", "h", "i", "j", "a", "b", "n", "o", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "rect", "Lkotlin/m2;", "action", "d", "", "e", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class j2 {

    /* compiled from: Region.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/core/graphics/j2$a", "", "Landroid/graphics/Rect;", "", "hasNext", "a", "Landroid/graphics/RegionIterator;", "o", "Landroid/graphics/RegionIterator;", "iterator", "p", "Landroid/graphics/Rect;", "rect", "q", "Z", "hasMore", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<Rect>, r3.a {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final RegionIterator iterator;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Rect rect;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean hasMore;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Region f4759r;

        a(Region region) {
            this.f4759r = region;
            RegionIterator regionIterator = new RegionIterator(region);
            this.iterator = regionIterator;
            Rect rect = new Rect();
            this.rect = rect;
            this.hasMore = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (!this.hasMore) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.rect);
            this.hasMore = this.iterator.next(this.rect);
            return rect;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasMore;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @d5.d
    public static final Region a(@d5.d Region region, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.INTERSECT);
        return region2;
    }

    @d5.d
    public static final Region b(@d5.d Region region, @d5.d Region r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean c(@d5.d Region region, @d5.d Point p5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        return region.contains(p5.x, p5.y);
    }

    public static final void d(@d5.d Region region, @d5.d q3.l<? super Rect, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                action.N(rect);
            }
        }
    }

    @d5.d
    public static final Iterator<Rect> e(@d5.d Region region) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        return new a(region);
    }

    @d5.d
    public static final Region f(@d5.d Region region, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.DIFFERENCE);
        return region2;
    }

    @d5.d
    public static final Region g(@d5.d Region region, @d5.d Region r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.DIFFERENCE);
        return region2;
    }

    @d5.d
    public static final Region h(@d5.d Region region) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @d5.d
    public static final Region i(@d5.d Region region, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.union(r5);
        return region2;
    }

    @d5.d
    public static final Region j(@d5.d Region region, @d5.d Region r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.UNION);
        return region2;
    }

    @d5.d
    public static final Region k(@d5.d Region region, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.union(r5);
        return region2;
    }

    @d5.d
    public static final Region l(@d5.d Region region, @d5.d Region r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.UNION);
        return region2;
    }

    @d5.d
    public static final Region m(@d5.d Region region) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @d5.d
    public static final Region n(@d5.d Region region, @d5.d Rect r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.XOR);
        return region2;
    }

    @d5.d
    public static final Region o(@d5.d Region region, @d5.d Region r5) {
        kotlin.jvm.internal.l0.p(region, "<this>");
        kotlin.jvm.internal.l0.p(r5, "r");
        Region region2 = new Region(region);
        region2.op(r5, Region.Op.XOR);
        return region2;
    }
}
