package androidx.compose.foundation;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import kotlin.Metadata;

/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "onDraw", "b", "(Landroidx/compose/ui/q;Lld/l;Landroidx/compose/runtime/t;I)V", "", "contentDescription", "a", "(Landroidx/compose/ui/q;Ljava/lang/String;Lld/l;Landroidx/compose/runtime/t;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCanvas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,65:1\n1116#2,6:66\n*S KotlinDebug\n*F\n+ 1 Canvas.kt\nandroidx/compose/foundation/CanvasKt\n*L\n64#1:66,6\n*E\n"})
/* loaded from: classes.dex */
public final class e0 {

    /* compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> f3641c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3642d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.q qVar, ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> lVar, int i4) {
            super(2);
            this.f3640b = qVar;
            this.f3641c = lVar;
            this.f3642d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e0.b(this.f3640b, this.f3641c, tVar, g3.b(this.f3642d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Canvas.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3643b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f3643b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.a1(zVar, this.f3643b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Canvas.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3644b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3645c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> f3646d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f3647e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, String str, ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> lVar, int i4) {
            super(2);
            this.f3644b = qVar;
            this.f3645c = str;
            this.f3646d = lVar;
            this.f3647e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e0.a(this.f3644b, this.f3645c, this.f3646d, tVar, g3.b(this.f3647e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.q qVar, @fg.l String str, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1162737955);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.q0(str) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= o4.S(lVar) ? 256 : 128;
        }
        if ((i5 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1162737955, i5, -1, "androidx.compose.foundation.Canvas (Canvas.kt:63)");
            }
            androidx.compose.ui.q b5 = androidx.compose.ui.draw.l.b(qVar, lVar);
            o4.P(842941550);
            boolean q02 = o4.q0(str);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new b(str);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.foundation.layout.f2.a(androidx.compose.ui.semantics.o.f(b5, false, (ld.l) Q, 1, null), o4, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(qVar, str, lVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-932836462);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.S(lVar) ? 32 : 16;
        }
        if ((i5 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-932836462, i5, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            androidx.compose.foundation.layout.f2.a(androidx.compose.ui.draw.l.b(qVar, lVar), o4, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(qVar, lVar, i4));
        }
    }
}
