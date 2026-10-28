package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\nR$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/pb;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", "a", "Landroidx/compose/runtime/h2;", "e", "()F", "i", "(F)V", "heightOffsetLimit", "b", "c", "g", "contentOffset", "Landroidx/compose/runtime/h2;", "_heightOffset", "newOffset", "d", "h", "heightOffset", "collapsedFraction", "f", "overlappedFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.x4
@f5
@kotlin.jvm.internal.r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,2283:1\n76#2:2284\n109#2,2:2285\n76#2:2287\n109#2,2:2288\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n1086#1:2284\n1086#1:2285,2\n1113#1:2287\n1113#1:2288,2\n*E\n"})
/* loaded from: classes.dex */
public final class pb {

    /* renamed from: e, reason: collision with root package name */
    public static final int f13484e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 heightOffsetLimit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.h2 contentOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.h2 _heightOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<pb, ?> f13485f = androidx.compose.runtime.saveable.a.a(a.f13489b, b.f13490b);

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/material3/pb;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/material3/pb;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, pb, List<? extends Float>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13489b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Float> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l pb pbVar) {
            return kotlin.collections.w.O(Float.valueOf(pbVar.e()), Float.valueOf(pbVar.d()), Float.valueOf(pbVar.c()));
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/material3/pb;", "a", "(Ljava/util/List;)Landroidx/compose/material3/pb;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<? extends Float>, pb> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f13490b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pb invoke(@fg.l List<Float> list) {
            return new pb(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material3/pb$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/material3/pb;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.pb$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<pb, ?> a() {
            return pb.f13485f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public pb(float f4, float f5, float f6) {
        this.heightOffsetLimit = androidx.compose.runtime.b.b(f4);
        this.contentOffset = androidx.compose.runtime.b.b(f6);
        this._heightOffset = androidx.compose.runtime.b.b(f5);
    }

    public final float b() {
        if (this.heightOffsetLimit.b() == 0.0f) {
            return 0.0f;
        }
        return this._heightOffset.b() / this.heightOffsetLimit.b();
    }

    public final float c() {
        return this.contentOffset.b();
    }

    public final float d() {
        return this._heightOffset.b();
    }

    public final float e() {
        return this.heightOffsetLimit.b();
    }

    public final float f() {
        if (this.heightOffsetLimit.b() == 0.0f) {
            return 0.0f;
        }
        return 1 - (kotlin.ranges.s.H(this.heightOffsetLimit.b() - this.contentOffset.b(), this.heightOffsetLimit.b(), 0.0f) / this.heightOffsetLimit.b());
    }

    public final void g(float f4) {
        this.contentOffset.E(f4);
    }

    public final void h(float f4) {
        this._heightOffset.E(kotlin.ranges.s.H(f4, this.heightOffsetLimit.b(), 0.0f));
    }

    public final void i(float f4) {
        this.heightOffsetLimit.E(f4);
    }
}
