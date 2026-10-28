package androidx.compose.runtime.changelist;

import androidx.compose.animation.core.a2;
import androidx.compose.runtime.a4;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.f2;
import androidx.compose.runtime.f3;
import androidx.compose.runtime.h3;
import androidx.compose.runtime.o3;
import androidx.compose.runtime.p2;
import androidx.compose.runtime.p3;
import androidx.compose.runtime.q3;
import androidx.compose.runtime.x3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Operation.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:!\u000f\u001b\u001e\u001d\u0014\u0017 !\"#$%&'()*+,-./0123456789:B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019\u0082\u0001\u001f;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXY\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"Landroidx/compose/runtime/changelist/g;", "", "", "ints", "objects", "<init>", "(II)V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/g$s;", "f", "toString", "()Ljava/lang/String;", "I", "b", "()I", "d", "c", "name", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "Landroidx/compose/runtime/changelist/g$a;", "Landroidx/compose/runtime/changelist/g$b;", "Landroidx/compose/runtime/changelist/g$c;", "Landroidx/compose/runtime/changelist/g$d;", "Landroidx/compose/runtime/changelist/g$e;", "Landroidx/compose/runtime/changelist/g$f;", "Landroidx/compose/runtime/changelist/g$g;", "Landroidx/compose/runtime/changelist/g$h;", "Landroidx/compose/runtime/changelist/g$i;", "Landroidx/compose/runtime/changelist/g$j;", "Landroidx/compose/runtime/changelist/g$k;", "Landroidx/compose/runtime/changelist/g$l;", "Landroidx/compose/runtime/changelist/g$m;", "Landroidx/compose/runtime/changelist/g$n;", "Landroidx/compose/runtime/changelist/g$o;", "Landroidx/compose/runtime/changelist/g$q;", "Landroidx/compose/runtime/changelist/g$r;", "Landroidx/compose/runtime/changelist/g$t;", "Landroidx/compose/runtime/changelist/g$u;", "Landroidx/compose/runtime/changelist/g$v;", "Landroidx/compose/runtime/changelist/g$w;", "Landroidx/compose/runtime/changelist/g$x;", "Landroidx/compose/runtime/changelist/g$y;", "Landroidx/compose/runtime/changelist/g$z;", "Landroidx/compose/runtime/changelist/g$a0;", "Landroidx/compose/runtime/changelist/g$b0;", "Landroidx/compose/runtime/changelist/g$c0;", "Landroidx/compose/runtime/changelist/g$d0;", "Landroidx/compose/runtime/changelist/g$e0;", "Landroidx/compose/runtime/changelist/g$f0;", "Landroidx/compose/runtime/changelist/g$g0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16003c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int ints;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int objects;

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/g$a;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "g", "()I", "Distance", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n1#1,879:1\n116#1:880\n116#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n*L\n119#1:880\n128#1:881\n*E\n"})
    public static final class a extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final a f16006d = new a();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16007e = 0;

        private a() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.E(hVar.b(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "distance" : super.e(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$a0;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a0 extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final a0 f16008d = new a0();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16009e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a0() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.a0.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.n1();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/g$b;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/changelist/d;", "g", "()I", "Changes", "Landroidx/compose/runtime/internal/n;", "h", "EffectiveNodeIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,879:1\n681#1:880\n682#1:881\n682#1:882\n681#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n685#1:880\n686#1:881\n695#1:882\n697#1:883\n*E\n"})
    public static final class b extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final b f16010d = new b();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16011e = 0;

        private b() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            androidx.compose.runtime.internal.n nVar = (androidx.compose.runtime.internal.n) hVar.a(1);
            int element = nVar != null ? nVar.getElement() : 0;
            androidx.compose.runtime.changelist.d dVar = (androidx.compose.runtime.changelist.d) hVar.a(0);
            if (element > 0) {
                eVar = new p2(eVar, element);
            }
            dVar.d(eVar, a4Var, o3Var);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "changes" : s.d(parameter, 1) ? "effectiveNodeIndex" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 1;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012$\b\u0002\u0010\n\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\t*\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R3\u0010\n\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!0\u001a8\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006&"}, d2 = {"Landroidx/compose/runtime/changelist/g$b0;", "Landroidx/compose/runtime/changelist/g;", "", "ints", "objects", "Lkotlin/Function3;", "Landroidx/compose/runtime/e;", "Landroidx/compose/runtime/a4;", "Landroidx/compose/runtime/o3;", "Lkotlin/k2;", "block", "<init>", "(IILld/q;)V", "Landroidx/compose/runtime/changelist/h;", "applier", "slots", "rememberManager", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "", "toString", "()Ljava/lang/String;", "d", "Lld/q;", "g", "()Lld/q;", "", "Landroidx/compose/runtime/changelist/g$p;", "e", "Ljava/util/List;", "h", "()Ljava/util/List;", "intParams", "Landroidx/compose/runtime/changelist/g$s;", "", "f", "i", "objParams", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TestOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    public static final class b0 extends g {

        /* renamed from: g, reason: collision with root package name */
        public static final int f16012g = 8;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.q<androidx.compose.runtime.e<?>, a4, o3, k2> block;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<p> intParams;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<s<Object>> objParams;

        /* compiled from: Operation.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/e;", "<anonymous parameter 0>", "Landroidx/compose/runtime/a4;", "<anonymous parameter 1>", "Landroidx/compose/runtime/o3;", "<anonymous parameter 2>", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.q<androidx.compose.runtime.e<?>, a4, o3, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f16016b = new a(3);

            a() {
                super(3);
            }

            @Override // ld.q
            public k2 R(androidx.compose.runtime.e<?> eVar, a4 a4Var, o3 o3Var) {
                return k2.f75408a;
            }

            public final void a(@fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            }
        }

        @fg.p
        public b0() {
            this(0, 0, null, 7, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            this.block.R(eVar, a4Var, o3Var);
        }

        @fg.l
        public final ld.q<androidx.compose.runtime.e<?>, a4, o3, k2> g() {
            return this.block;
        }

        @fg.l
        public final List<p> h() {
            return this.intParams;
        }

        @fg.l
        public final List<s<Object>> i() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + System.identityHashCode(this);
        }

        public /* synthetic */ b0(int i4, int i5, ld.q qVar, int i6, kotlin.jvm.internal.w wVar) {
            this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5, (i6 & 4) != 0 ? a.f16016b : qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.p
        public b0(int i4, int i5, @fg.l ld.q<? super androidx.compose.runtime.e<?>, ? super a4, ? super o3, k2> qVar) {
            super(i4, i5, null);
            this.block = qVar;
            ArrayList arrayList = new ArrayList(i4);
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(p.a(i6));
            }
            this.intParams = arrayList;
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList2.add(s.a(i7));
            }
            this.objParams = arrayList2;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/g$c;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/internal/n;", "g", "()I", "EffectiveNodeIndex", "", "", "h", "Nodes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,879:1\n567#1:880\n568#1:881\n567#1:882\n568#1:883\n64#2,6:884\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n*L\n571#1:880\n572#1:881\n581#1:882\n582#1:883\n584#1:884,6\n*E\n"})
    public static final class c extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final c f16017d = new c();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16018e = 0;

        private c() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            int element = ((androidx.compose.runtime.internal.n) hVar.a(0)).getElement();
            List list = (List) hVar.a(1);
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = list.get(i4);
                l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i5 = element + i4;
                eVar.h(i5, obj);
                eVar.e(i5, obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "effectiveNodeIndex" : s.d(parameter, 1) ? "nodes" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 1;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/g$c0;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "", "g", "()I", "Data", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n1#1,879:1\n203#1:880\n203#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n*L\n206#1:880\n215#1:881\n*E\n"})
    public static final class c0 extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final c0 f16019d = new c0();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16020e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private c0() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.c0.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.D1(hVar.a(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "data" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/g$d;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/e2;", "i", "()I", "ResolvedState", "Landroidx/compose/runtime/z;", "h", "ParentCompositionContext", "Landroidx/compose/runtime/f2;", "g", "From", "j", "To", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n1#1,879:1\n594#1:880\n595#1:881\n596#1:882\n597#1:883\n596#1:884\n597#1:885\n595#1:886\n594#1:887\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n*L\n600#1:880\n601#1:881\n602#1:882\n603#1:883\n612#1:884\n613#1:885\n615#1:886\n617#1:887\n*E\n"})
    public static final class d extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final d f16021d = new d();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16022e = 0;

        private d() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            f2 f2Var = (f2) hVar.a(2);
            f2 f2Var2 = (f2) hVar.a(3);
            androidx.compose.runtime.z zVar = (androidx.compose.runtime.z) hVar.a(1);
            e2 e2Var = (e2) hVar.a(0);
            if (e2Var == null && (e2Var = zVar.o(f2Var)) == null) {
                throw androidx.compose.runtime.u.a("Could not resolve state for movable content");
            }
            List<androidx.compose.runtime.d> K0 = a4Var.K0(1, e2Var.getSlotTable(), 2);
            f3.Companion companion = f3.INSTANCE;
            androidx.compose.runtime.n0 composition = f2Var2.getComposition();
            l0.n(composition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.a(a4Var, K0, (h3) composition);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "resolvedState" : s.d(parameter, 1) ? "resolvedCompositionContext" : s.d(parameter, 2) ? "from" : s.d(parameter, 3) ? "to" : super.f(parameter);
        }

        public final int g() {
            return 2;
        }

        public final int h() {
            return 1;
        }

        public final int i() {
            return 0;
        }

        public final int j() {
            return 3;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R9\u0010\u001a\u001a#\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0002\b\u00180\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/g$d0;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "", "h", "()I", "Value", "Lkotlin/Function2;", "Lkotlin/u;", "g", "Block", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,879:1\n326#1:880\n327#1:881\n326#1:882\n327#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n330#1:880\n331#1:881\n340#1:882\n341#1:883\n*E\n"})
    public static final class d0 extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final d0 f16023d = new d0();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16024e = 0;

        private d0() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            ((ld.p) hVar.a(1)).invoke(eVar.b(), hVar.a(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "value" : s.d(parameter, 1) ? "block" : super.f(parameter);
        }

        public final int g() {
            return 1;
        }

        public final int h() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$e;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final e f16025d = new e();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16026e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.e.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            androidx.compose.runtime.x.y(a4Var, o3Var);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/g$e0;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/g$s;", "f", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "", "h", "()I", "Value", "g", "GroupSlotIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n1#1,879:1\n170#1:880\n169#1:881\n169#1:882\n170#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n*L\n173#1:880\n178#1:881\n187#1:882\n188#1:883\n*E\n"})
    public static final class e0 extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final e0 f16027d = new e0();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16028e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private e0() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.e0.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            Object a5 = hVar.a(0);
            int b5 = hVar.b(0);
            if (a5 instanceof q3) {
                o3Var.e(((q3) a5).getWrapped());
            }
            Object j12 = a4Var.j1(b5, a5);
            if (j12 instanceof q3) {
                o3Var.b(((q3) j12).getWrapped());
            } else if (j12 instanceof f3) {
                ((f3) j12).B();
            }
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "groupSlotIndex" : super.e(parameter);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "value" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/g$f;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/internal/n;", "h", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/d;", "g", "Anchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n1#1,879:1\n539#1:880\n540#1:881\n539#1:882\n540#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n*L\n543#1:880\n544#1:881\n554#1:882\n558#1:883\n*E\n"})
    public static final class f extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final f f16029d = new f();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16030e = 0;

        private f() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            int e4;
            androidx.compose.runtime.internal.n nVar = (androidx.compose.runtime.internal.n) hVar.a(0);
            androidx.compose.runtime.d dVar = (androidx.compose.runtime.d) hVar.a(1);
            l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            e4 = androidx.compose.runtime.changelist.i.e(a4Var, dVar, eVar);
            nVar.b(e4);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "effectiveNodeIndexOut" : s.d(parameter, 1) ? "anchor" : super.f(parameter);
        }

        public final int g() {
            return 1;
        }

        public final int h() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/g$f0;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "g", "()I", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n77#1:880\n77#1:881\n1#2:882\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n*L\n80#1:880\n89#1:881\n*E\n"})
    public static final class f0 extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final f0 f16031d = new f0();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16032e = 0;

        private f0() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            int b5 = hVar.b(0);
            for (int i4 = 0; i4 < b5; i4++) {
                eVar.k();
            }
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "count" : super.e(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/g$g;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "", "", "g", "()I", "Nodes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n1#1,879:1\n94#1:880\n94#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n*L\n97#1:880\n108#1:881\n*E\n"})
    /* renamed from: androidx.compose.runtime.changelist.g$g, reason: collision with other inner class name */
    public static final class C0306g extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final C0306g f16033d = new C0306g();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16034e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private C0306g() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.C0306g.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) hVar.a(0)) {
                eVar.i(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "nodes" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$g0;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g0 extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final g0 f16035d = new g0();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16036e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private g0() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.g0.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            Object b5 = eVar.b();
            l0.n(b5, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((androidx.compose.runtime.r) b5).r();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/g$h;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/y;", "g", "()I", "Action", "h", "Composition", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n1#1,879:1\n294#1:880\n295#1:881\n294#1:882\n295#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n*L\n298#1:880\n299#1:881\n308#1:882\n309#1:883\n*E\n"})
    public static final class h extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final h f16037d = new h();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16038e = 0;

        private h() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            ((ld.l) hVar.a(0)).invoke((androidx.compose.runtime.y) hVar.a(1));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "anchor" : s.d(parameter, 1) ? "composition" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 1;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$i;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final i f16039d = new i();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16040e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private i() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.i.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.W();
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$j;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final j f16041d = new j();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16042e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private j() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.j.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            androidx.compose.runtime.changelist.i.f(a4Var, eVar, 0);
            a4Var.W();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/g$k;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/d;", "g", "()I", "Anchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n1#1,879:1\n230#1:880\n230#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n*L\n233#1:880\n242#1:881\n*E\n"})
    public static final class k extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final k f16043d = new k();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16044e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private k() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.k.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.Z((androidx.compose.runtime.d) hVar.a(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "anchor" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$l;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final l f16045d = new l();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16046e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private l() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.l.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.Y(0);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/g$m;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/g$s;", "f", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Lkotlin/Function0;", "", "g", "()I", "Factory", "i", "InsertIndex", "Landroidx/compose/runtime/d;", "h", "GroupAnchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n1#1,879:1\n457#1:880\n456#1:881\n458#1:882\n456#1:883\n458#1:884\n457#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n*L\n461#1:880\n466#1:881\n467#1:882\n476#1:883\n477#1:884\n478#1:885\n*E\n"})
    public static final class m extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final m f16047d = new m();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16048e = 0;

        private m() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            Object invoke = ((ld.a) hVar.a(0)).invoke();
            androidx.compose.runtime.d dVar = (androidx.compose.runtime.d) hVar.a(1);
            int b5 = hVar.b(0);
            l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            a4Var.H1(dVar, invoke);
            eVar.e(b5, invoke);
            eVar.i(invoke);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "insertIndex" : super.e(parameter);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "factory" : s.d(parameter, 1) ? "groupAnchor" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 1;
        }

        public final int i() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/g$n;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/d;", "g", "()I", "Anchor", "Landroidx/compose/runtime/x3;", "h", "FromSlotTable", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n1#1,879:1\n394#1:880\n395#1:881\n395#1:882\n394#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n*L\n398#1:880\n399#1:881\n408#1:882\n409#1:883\n*E\n"})
    public static final class n extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final n f16049d = new n();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16050e = 0;

        private n() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            x3 x3Var = (x3) hVar.a(1);
            androidx.compose.runtime.d dVar = (androidx.compose.runtime.d) hVar.a(0);
            a4Var.K();
            dVar.getClass();
            a4Var.G0(x3Var, x3Var.i(dVar), false);
            a4Var.X();
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "anchor" : s.d(parameter, 1) ? "from" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 1;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/changelist/g$o;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/d;", "g", "()I", "Anchor", "Landroidx/compose/runtime/x3;", "i", "FromSlotTable", "Landroidx/compose/runtime/changelist/f;", "h", "Fixups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n422#1:880\n423#1:881\n424#1:882\n423#1:883\n422#1:884\n424#1:885\n166#2,8:886\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n*L\n427#1:880\n428#1:881\n429#1:882\n438#1:883\n439#1:884\n440#1:885\n442#1:886,8\n*E\n"})
    public static final class o extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final o f16051d = new o();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16052e = 0;

        private o() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            x3 x3Var = (x3) hVar.a(1);
            androidx.compose.runtime.d dVar = (androidx.compose.runtime.d) hVar.a(0);
            androidx.compose.runtime.changelist.f fVar = (androidx.compose.runtime.changelist.f) hVar.a(2);
            a4 e02 = x3Var.e0();
            try {
                fVar.f(eVar, e02, o3Var);
                k2 k2Var = k2.f75408a;
                e02.N();
                a4Var.K();
                dVar.getClass();
                a4Var.G0(x3Var, x3Var.i(dVar), false);
                a4Var.X();
            } catch (Throwable th) {
                e02.N();
                throw th;
            }
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "anchor" : s.d(parameter, 1) ? "from" : s.d(parameter, 2) ? "fixups" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 2;
        }

        public final int i() {
            return 1;
        }
    }

    /* compiled from: Operation.kt */
    @kd.g
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/changelist/g$p;", "", "", "offset", "b", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "e", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class p {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        private /* synthetic */ p(int i4) {
            this.offset = i4;
        }

        public static final /* synthetic */ p a(int i4) {
            return new p(i4);
        }

        public static int b(int i4) {
            return i4;
        }

        public static boolean c(int i4, Object obj) {
            return (obj instanceof p) && i4 == ((p) obj).offset;
        }

        public static final boolean d(int i4, int i5) {
            return i4 == i5;
        }

        public static int f(int i4) {
            return Integer.hashCode(i4);
        }

        public static String g(int i4) {
            return a2.a("IntParameter(offset=", i4, ')');
        }

        /* renamed from: e, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public boolean equals(Object obj) {
            return c(this.offset, obj);
        }

        public final /* synthetic */ int h() {
            return this.offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset);
        }

        public String toString() {
            return g(this.offset);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/g$q;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "g", "()I", "Offset", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n1#1,879:1\n257#1:880\n257#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n*L\n260#1:880\n269#1:881\n*E\n"})
    public static final class q extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final q f16054d = new q();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16055e = 0;

        private q() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.I0(hVar.b(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "offset" : super.e(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0019\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/g$r;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "h", "()I", "From", "i", "To", "g", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n1#1,879:1\n369#1:880\n370#1:881\n371#1:882\n369#1:883\n370#1:884\n371#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n*L\n374#1:880\n375#1:881\n376#1:882\n386#1:883\n387#1:884\n388#1:885\n*E\n"})
    public static final class r extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final r f16056d = new r();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16057e = 0;

        private r() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            eVar.c(hVar.b(0), hVar.b(1), hVar.b(2));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "from" : p.d(parameter, 1) ? "to" : p.d(parameter, 2) ? "count" : super.e(parameter);
        }

        public final int g() {
            return 2;
        }

        public final int h() {
            return 0;
        }

        public final int i() {
            return 1;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/changelist/g$s;", "T", "", "", "offset", "b", "(I)I", "", "g", "(I)Ljava/lang/String;", "f", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "e", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kd.g
    public static final class s<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        private /* synthetic */ s(int i4) {
            this.offset = i4;
        }

        public static final /* synthetic */ s a(int i4) {
            return new s(i4);
        }

        public static <T> int b(int i4) {
            return i4;
        }

        public static boolean c(int i4, Object obj) {
            return (obj instanceof s) && i4 == ((s) obj).offset;
        }

        public static final boolean d(int i4, int i5) {
            return i4 == i5;
        }

        public static int f(int i4) {
            return Integer.hashCode(i4);
        }

        public static String g(int i4) {
            return a2.a("ObjectParameter(offset=", i4, ')');
        }

        /* renamed from: e, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public boolean equals(Object obj) {
            return c(this.offset, obj);
        }

        public final /* synthetic */ int h() {
            return this.offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset);
        }

        public String toString() {
            return g(this.offset);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ/\u0010\u0013\u001a\u00020\u0012*\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/g$t;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/g$s;", "f", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "h", "()I", "InsertIndex", "Landroidx/compose/runtime/d;", "g", "GroupAnchor", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n1#1,879:1\n488#1:880\n489#1:881\n489#1:882\n488#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n*L\n492#1:880\n497#1:881\n506#1:882\n507#1:883\n*E\n"})
    public static final class t extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final t f16059d = new t();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16060e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private t() {
            /*
                r2 = this;
                r0 = 1
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.t.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            androidx.compose.runtime.d dVar = (androidx.compose.runtime.d) hVar.a(0);
            int b5 = hVar.b(0);
            eVar.k();
            l0.n(eVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            eVar.h(b5, a4Var.O0(dVar));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "insertIndex" : super.e(parameter);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "groupAnchor" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/changelist/g$u;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/n0;", "g", "()I", "Composition", "Landroidx/compose/runtime/z;", "h", "ParentCompositionContext", "Landroidx/compose/runtime/f2;", "i", "Reference", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n1#1,879:1\n655#1:880\n656#1:881\n657#1:882\n655#1:883\n656#1:884\n657#1:885\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n*L\n660#1:880\n661#1:881\n662#1:882\n672#1:883\n673#1:884\n674#1:885\n*E\n"})
    public static final class u extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final u f16061d = new u();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16062e = 0;

        private u() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            androidx.compose.runtime.changelist.i.g((androidx.compose.runtime.n0) hVar.a(0), (androidx.compose.runtime.z) hVar.a(1), (f2) hVar.a(2), a4Var);
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "composition" : s.d(parameter, 1) ? "parentCompositionContext" : s.d(parameter, 2) ? "reference" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }

        public final int h() {
            return 1;
        }

        public final int i() {
            return 2;
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/g$v;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Landroidx/compose/runtime/p3;", "g", "()I", "Value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n1#1,879:1\n152#1:880\n152#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n*L\n155#1:880\n164#1:881\n*E\n"})
    public static final class v extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final v f16063d = new v();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16064e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private v() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.v.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            o3Var.e((p3) hVar.a(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "value" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$w;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class w extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final w f16065d = new w();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16066e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private w() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.w.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            androidx.compose.runtime.x.h0(a4Var, o3Var);
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/g$x;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "h", "()I", "RemoveIndex", "g", "Count", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n1#1,879:1\n347#1:880\n348#1:881\n347#1:882\n348#1:883\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n*L\n351#1:880\n352#1:881\n362#1:882\n363#1:883\n*E\n"})
    public static final class x extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final x f16067d = new x();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16068e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private x() {
            /*
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 2
                r3.<init>(r2, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.x.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            eVar.a(hVar.b(0), hVar.b(1));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String e(int parameter) {
            return p.d(parameter, 0) ? "removeIndex" : p.d(parameter, 1) ? "count" : super.e(parameter);
        }

        public final int g() {
            return 1;
        }

        public final int h() {
            return 0;
        }
    }

    /* compiled from: Operation.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/changelist/g$y;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class y extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final y f16069d = new y();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16070e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private y() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.y.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            a4Var.e1();
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u0010*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/g$z;", "Landroidx/compose/runtime/changelist/g;", "<init>", "()V", "Landroidx/compose/runtime/changelist/g$s;", "parameter", "", "f", "(I)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/h;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/changelist/h;Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "Lkotlin/Function0;", "g", "()I", "Effect", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    @r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n1#1,879:1\n135#1:880\n135#1:881\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n*L\n138#1:880\n147#1:881\n*E\n"})
    public static final class z extends g {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final z f16071d = new z();

        /* renamed from: e, reason: collision with root package name */
        public static final int f16072e = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private z() {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.changelist.g.z.<init>():void");
        }

        @Override // androidx.compose.runtime.changelist.g
        public void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var) {
            o3Var.a((ld.a) hVar.a(0));
        }

        @Override // androidx.compose.runtime.changelist.g
        @fg.l
        public String f(int parameter) {
            return s.d(parameter, 0) ? "effect" : super.f(parameter);
        }

        public final int g() {
            return 0;
        }
    }

    public /* synthetic */ g(int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5);
    }

    public abstract void a(@fg.l androidx.compose.runtime.changelist.h hVar, @fg.l androidx.compose.runtime.e<?> eVar, @fg.l a4 a4Var, @fg.l o3 o3Var);

    /* renamed from: b, reason: from getter */
    public final int getInts() {
        return this.ints;
    }

    @fg.l
    public final String c() {
        String W = l1.d(getClass()).W();
        return W == null ? "" : W;
    }

    /* renamed from: d, reason: from getter */
    public final int getObjects() {
        return this.objects;
    }

    @fg.l
    public String e(int parameter) {
        return a2.a("IntParameter(", parameter, ')');
    }

    @fg.l
    public String f(int parameter) {
        return a2.a("ObjectParameter(", parameter, ')');
    }

    @fg.l
    public String toString() {
        return c();
    }

    public /* synthetic */ g(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this(i4, i5);
    }

    private g(int i4, int i5) {
        this.ints = i4;
        this.objects = i5;
    }
}
