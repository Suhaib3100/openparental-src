package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: NodeKind.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\u0007R'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\u0007R'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\u0007R'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\u0007R'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u0007R'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0007R'\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\u0007R'\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u0007R'\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u0007R'\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b,\u0010\u0003\u001a\u0004\b+\u0010\u0007R'\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\u0007R'\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u0007R'\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u0010\u0007R'\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u0010\u0007R'\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b@\u0010\u0003\u001a\u0004\b?\u0010\u0007R'\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010\u0007R'\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bH\u0010\u0003\u001a\u0004\bG\u0010\u0007R'\u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bL\u0010\u0003\u001a\u0004\bK\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/ui/node/j1;", "", "<init>", "()V", "Landroidx/compose/ui/node/g1;", "Landroidx/compose/ui/q$d;", "a", "()I", "b", "Any", "Landroidx/compose/ui/node/c0;", "s", "t", "Layout", "Landroidx/compose/ui/node/q;", "e", "f", "Draw", "Landroidx/compose/ui/node/y1;", "E", "F", "Semantics", "Landroidx/compose/ui/node/u1;", "A", "B", "PointerInput", "Landroidx/compose/ui/modifier/j;", "w", "x", "Locals", "Landroidx/compose/ui/node/s1;", "y", "z", "ParentData", "Landroidx/compose/ui/node/b0;", "u", "v", "LayoutAware", "Landroidx/compose/ui/node/s;", "m", "n", "GlobalPositionAware", "Landroidx/compose/ui/layout/n;", "o", "p", "IntermediateMeasure", "Landroidx/compose/ui/focus/FocusTargetNode;", "k", "l", "FocusTarget", "Landroidx/compose/ui/focus/w;", "i", "j", "FocusProperties", "Landroidx/compose/ui/focus/i;", "g", "h", "FocusEvent", "Landroidx/compose/ui/input/key/g;", "q", "r", "KeyInput", "Landroidx/compose/ui/input/rotary/b;", "C", "D", "RotaryInput", "Landroidx/compose/ui/node/h;", "c", "d", "CompositionLocalConsumer", "Landroidx/compose/ui/input/key/j;", "G", "H", "SoftKeyboardKeyInput", "Landroidx/compose/ui/node/c2;", "I", "J", "Traversable", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j1 f19342a = new j1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19343b = 0;

    private j1() {
    }

    public static final int A() {
        return 16;
    }

    @kd.n
    public static /* synthetic */ void B() {
    }

    public static final int C() {
        return 16384;
    }

    @kd.n
    public static /* synthetic */ void D() {
    }

    public static final int E() {
        return 8;
    }

    @kd.n
    public static /* synthetic */ void F() {
    }

    public static final int G() {
        return 131072;
    }

    @kd.n
    public static /* synthetic */ void H() {
    }

    public static final int I() {
        return 262144;
    }

    @kd.n
    public static /* synthetic */ void J() {
    }

    public static final int a() {
        return 1;
    }

    @kd.n
    public static /* synthetic */ void b() {
    }

    public static final int c() {
        return 32768;
    }

    @kd.n
    public static /* synthetic */ void d() {
    }

    public static final int e() {
        return 4;
    }

    @kd.n
    public static /* synthetic */ void f() {
    }

    public static final int g() {
        return 4096;
    }

    @kd.n
    public static /* synthetic */ void h() {
    }

    public static final int i() {
        return 2048;
    }

    @kd.n
    public static /* synthetic */ void j() {
    }

    public static final int k() {
        return 1024;
    }

    @kd.n
    public static /* synthetic */ void l() {
    }

    public static final int m() {
        return 256;
    }

    @kd.n
    public static /* synthetic */ void n() {
    }

    public static final int o() {
        return 512;
    }

    @kd.n
    public static /* synthetic */ void p() {
    }

    public static final int q() {
        return 8192;
    }

    @kd.n
    public static /* synthetic */ void r() {
    }

    public static final int s() {
        return 2;
    }

    @kd.n
    public static /* synthetic */ void t() {
    }

    public static final int u() {
        return 128;
    }

    @kd.n
    public static /* synthetic */ void v() {
    }

    public static final int w() {
        return 32;
    }

    @kd.n
    public static /* synthetic */ void x() {
    }

    public static final int y() {
        return 64;
    }

    @kd.n
    public static /* synthetic */ void z() {
    }
}
