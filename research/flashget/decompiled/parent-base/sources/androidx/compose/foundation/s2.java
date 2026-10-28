package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: ProgressSemantics.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/q;", "", "value", "Lkotlin/ranges/f;", "valueRange", "", "steps", "b", "(Landroidx/compose/ui/q;FLkotlin/ranges/f;I)Landroidx/compose/ui/q;", "a", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s2 {

    /* compiled from: ProgressSemantics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f7006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.ranges.f<Float> f7007c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, kotlin.ranges.f<Float> fVar, int i4) {
            super(1);
            this.f7006b = f4;
            this.f7007c = fVar;
            this.f7008d = i4;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.k1(zVar, new androidx.compose.ui.semantics.h(((Number) kotlin.ranges.s.N(Float.valueOf(this.f7006b), this.f7007c)).floatValue(), this.f7007c, this.f7008d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ProgressSemantics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f7009b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.h.INSTANCE.getClass();
            androidx.compose.ui.semantics.w.k1(zVar, androidx.compose.ui.semantics.h.f20304f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar) {
        return androidx.compose.ui.semantics.o.e(qVar, true, b.f7009b);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, float f4, @fg.l kotlin.ranges.f<Float> fVar, @androidx.annotation.g0(from = 0) int i4) {
        return androidx.compose.ui.semantics.o.e(qVar, true, new a(f4, fVar, i4));
    }

    public static /* synthetic */ androidx.compose.ui.q c(androidx.compose.ui.q qVar, float f4, kotlin.ranges.f fVar, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fVar = kotlin.ranges.s.e(0.0f, 1.0f);
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return b(qVar, f4, fVar, i4);
    }
}
