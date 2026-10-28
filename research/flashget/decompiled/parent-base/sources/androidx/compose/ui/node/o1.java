package androidx.compose.ui.node;

import androidx.compose.ui.graphics.z5;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OwnedLayer.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\bH&¢\u0006\u0004\b\u001d\u0010\u001bJ\"\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b$\u0010%J1\u0010*\u001a\u00020\b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0(H&¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001a\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b0\u0010/ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/o1;", "", "Landroidx/compose/ui/graphics/z5;", "scope", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "Lkotlin/k2;", "h", "(Landroidx/compose/ui/graphics/z5;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)V", "Li0/f;", "position", "", "i", "(J)Z", "Landroidx/compose/ui/unit/q;", "m", "(J)V", "Landroidx/compose/ui/unit/u;", "size", "d", "Landroidx/compose/ui/graphics/v1;", "canvas", "g", "(Landroidx/compose/ui/graphics/v1;)V", "n", "()V", "invalidate", "destroy", "point", "inverse", "c", "(JZ)J", "Li0/d;", "rect", "j", "(Li0/d;Z)V", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "b", "(Lld/l;Lld/a;)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "l", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface o1 {
    void a(@fg.l float[] matrix);

    void b(@fg.l ld.l<? super androidx.compose.ui.graphics.v1, k2> drawBlock, @fg.l ld.a<k2> invalidateParentLayer);

    long c(long point, boolean inverse);

    void d(long size);

    void destroy();

    void g(@fg.l androidx.compose.ui.graphics.v1 canvas);

    void h(@fg.l z5 scope, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density);

    boolean i(long position);

    void invalidate();

    void j(@fg.l i0.d rect, boolean inverse);

    void l(@fg.l float[] matrix);

    void m(long position);

    void n();
}
