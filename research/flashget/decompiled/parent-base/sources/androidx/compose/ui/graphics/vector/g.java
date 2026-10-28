package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0011J=\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u001cJ-\u0010$\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b&\u0010%J-\u0010'\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b'\u0010%J-\u0010(\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b(\u0010%J\u001d\u0010)\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\nJ\u001d\u0010*\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\nJE\u00101\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b1\u00102JE\u00103\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b3\u00102R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020504j\b\u0012\u0004\u0012\u000205`68\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u000205098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/compose/ui/graphics/vector/g;", "", "<init>", "()V", "c", "()Landroidx/compose/ui/graphics/vector/g;", "", "x", "y", "k", "(FF)Landroidx/compose/ui/graphics/vector/g;", "dx", "dy", "l", "i", "j", "g", "(F)Landroidx/compose/ui/graphics/vector/g;", "h", "s", "t", "x1", "y1", "x2", "y2", "x3", "y3", "d", "(FFFFFF)Landroidx/compose/ui/graphics/vector/g;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "e", "o", "(FFFF)Landroidx/compose/ui/graphics/vector/g;", "p", "m", "n", "q", "r", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "a", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/g;", "b", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/i;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "_nodes", "", "f", "()Ljava/util/List;", "nodes", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ArrayList<i> _nodes = new ArrayList<>(32);

    @fg.l
    public final g a(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x12, float y12) {
        this._nodes.add(new i.a(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, x12, y12));
        return this;
    }

    @fg.l
    public final g b(float a5, float b5, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float dx1, float dy1) {
        this._nodes.add(new i.j(a5, b5, theta, isMoreThanHalf, isPositiveArc, dx1, dy1));
        return this;
    }

    @fg.l
    public final g c() {
        this._nodes.add(i.b.f18200c);
        return this;
    }

    @fg.l
    public final g d(float x12, float y12, float x22, float y22, float x32, float y32) {
        this._nodes.add(new i.c(x12, y12, x22, y22, x32, y32));
        return this;
    }

    @fg.l
    public final g e(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this._nodes.add(new i.k(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    @fg.l
    public final List<i> f() {
        return this._nodes;
    }

    @fg.l
    public final g g(float x4) {
        this._nodes.add(new i.d(x4));
        return this;
    }

    @fg.l
    public final g h(float dx) {
        this._nodes.add(new i.l(dx));
        return this;
    }

    @fg.l
    public final g i(float x4, float y4) {
        this._nodes.add(new i.e(x4, y4));
        return this;
    }

    @fg.l
    public final g j(float dx, float dy) {
        this._nodes.add(new i.m(dx, dy));
        return this;
    }

    @fg.l
    public final g k(float x4, float y4) {
        this._nodes.add(new i.f(x4, y4));
        return this;
    }

    @fg.l
    public final g l(float dx, float dy) {
        this._nodes.add(new i.n(dx, dy));
        return this;
    }

    @fg.l
    public final g m(float x12, float y12, float x22, float y22) {
        this._nodes.add(new i.g(x12, y12, x22, y22));
        return this;
    }

    @fg.l
    public final g n(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new i.o(dx1, dy1, dx2, dy2));
        return this;
    }

    @fg.l
    public final g o(float x12, float y12, float x22, float y22) {
        this._nodes.add(new i.h(x12, y12, x22, y22));
        return this;
    }

    @fg.l
    public final g p(float dx1, float dy1, float dx2, float dy2) {
        this._nodes.add(new i.p(dx1, dy1, dx2, dy2));
        return this;
    }

    @fg.l
    public final g q(float x12, float y12) {
        this._nodes.add(new i.C0333i(x12, y12));
        return this;
    }

    @fg.l
    public final g r(float dx1, float dy1) {
        this._nodes.add(new i.q(dx1, dy1));
        return this;
    }

    @fg.l
    public final g s(float y4) {
        this._nodes.add(new i.s(y4));
        return this;
    }

    @fg.l
    public final g t(float dy) {
        this._nodes.add(new i.r(dy));
        return this;
    }
}
