package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Region.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\f\u0010\t\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\r\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0000*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0011\u0010\t\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0012\u0010\u000b\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0013\u0010\t\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0014\u0010\u000b\u001a\u001c\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\f¢\u0006\u0004\b\u0015\u0010\t\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u0016\u0010\u000b\u001a7\u0010\u001d\u001a\u00020\u001b*\u00020\u00002!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0017H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001f*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroid/graphics/Region;", "Landroid/graphics/Point;", "p", "", "c", "(Landroid/graphics/Region;Landroid/graphics/Point;)Z", "Landroid/graphics/Rect;", "r", "k", "(Landroid/graphics/Region;Landroid/graphics/Rect;)Landroid/graphics/Region;", "l", "(Landroid/graphics/Region;Landroid/graphics/Region;)Landroid/graphics/Region;", "f", "g", "m", "(Landroid/graphics/Region;)Landroid/graphics/Region;", "h", "i", "j", "a", "b", "n", "o", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "rect", "Lkotlin/k2;", "action", "d", "(Landroid/graphics/Region;Lld/l;)V", "", "e", "(Landroid/graphics/Region;)Ljava/util/Iterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n51#1:119\n31#1:121\n36#1:123\n1#2:118\n1#2:120\n1#2:122\n1#2:124\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n55#1:119\n58#1:121\n61#1:123\n55#1:120\n58#1:122\n61#1:124\n*E\n"})
/* loaded from: classes3.dex */
public final class q0 {

    /* compiled from: Region.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/core/graphics/q0$a", "", "Landroid/graphics/Rect;", "", "hasNext", "()Z", "b", "()Landroid/graphics/Rect;", "Landroid/graphics/RegionIterator;", "Landroid/graphics/RegionIterator;", "iterator", "c", "Landroid/graphics/Rect;", "rect", "d", "Z", "hasMore", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Iterator<Rect>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final RegionIterator iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Rect rect;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean hasMore;

        a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.iterator = regionIterator;
            Rect rect = new Rect();
            this.rect = rect;
            this.hasMore = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
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

    @fg.l
    public static final Region a(@fg.l Region region, @fg.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @fg.l
    public static final Region b(@fg.l Region region, @fg.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean c(@fg.l Region region, @fg.l Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void d(@fg.l Region region, @fg.l ld.l<? super Rect, k2> lVar) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                lVar.invoke(rect);
            }
        }
    }

    @fg.l
    public static final Iterator<Rect> e(@fg.l Region region) {
        return new a(region);
    }

    @fg.l
    public static final Region f(@fg.l Region region, @fg.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @fg.l
    public static final Region g(@fg.l Region region, @fg.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @fg.l
    public static final Region h(@fg.l Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @fg.l
    public static final Region i(@fg.l Region region, @fg.l Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @fg.l
    public static final Region j(@fg.l Region region, @fg.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @fg.l
    public static final Region k(@fg.l Region region, @fg.l Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @fg.l
    public static final Region l(@fg.l Region region, @fg.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @fg.l
    public static final Region m(@fg.l Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @fg.l
    public static final Region n(@fg.l Region region, @fg.l Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @fg.l
    public static final Region o(@fg.l Region region, @fg.l Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
