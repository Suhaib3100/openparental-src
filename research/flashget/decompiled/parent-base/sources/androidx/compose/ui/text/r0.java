package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: TextPainter.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/r0;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/text/n0;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final r0 f21295a = new r0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f21296b = 0;

    private r0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:19:0x0086, B:21:0x008c, B:23:0x0094, B:25:0x00a3, B:32:0x00b0, B:34:0x00b8, B:36:0x00cc, B:37:0x00c2), top: B:18:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:19:0x0086, B:21:0x008c, B:23:0x0094, B:25:0x00a3, B:32:0x00b0, B:34:0x00b8, B:36:0x00cc, B:37:0x00c2), top: B:18:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@fg.l androidx.compose.ui.graphics.v1 r14, @fg.l androidx.compose.ui.text.n0 r15) {
        /*
            r13 = this;
            boolean r0 = r15.i()
            r1 = 0
            if (r0 == 0) goto L20
            androidx.compose.ui.text.m0 r0 = r15.getLayoutInput()
            int r0 = r0.getOverflow()
            androidx.compose.ui.text.style.t$a r2 = androidx.compose.ui.text.style.t.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.t.c()
            boolean r0 = androidx.compose.ui.text.style.t.g(r0, r2)
            if (r0 != 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 == 0) goto L51
            long r2 = r15.getSize()
            int r2 = androidx.compose.ui.unit.u.m(r2)
            float r2 = (float) r2
            long r3 = r15.getSize()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            i0.f$a r4 = i0.f.INSTANCE
            r4.getClass()
            long r4 = i0.f.c()
            long r2 = i0.o.a(r2, r3)
            i0.i r2 = i0.j.c(r4, r2)
            r14.C()
            r3 = 2
            r4 = 0
            androidx.compose.ui.graphics.v1.F(r14, r2, r1, r3, r4)
        L51:
            androidx.compose.ui.text.m0 r1 = r15.getLayoutInput()
            androidx.compose.ui.text.v0 r1 = r1.getStyle()
            androidx.compose.ui.text.i0 r1 = r1.getSpanStyle()
            androidx.compose.ui.text.style.k r2 = r1.getBackground()
            if (r2 != 0) goto L6c
            androidx.compose.ui.text.style.k$a r2 = androidx.compose.ui.text.style.k.INSTANCE
            r2.getClass()
            androidx.compose.ui.text.style.k r2 = androidx.compose.ui.text.style.k.b()
        L6c:
            r8 = r2
            androidx.compose.ui.graphics.c6 r2 = r1.getShadow()
            if (r2 != 0) goto L7c
            androidx.compose.ui.graphics.c6$a r2 = androidx.compose.ui.graphics.c6.INSTANCE
            r2.getClass()
            androidx.compose.ui.graphics.c6 r2 = androidx.compose.ui.graphics.c6.a()
        L7c:
            r7 = r2
            androidx.compose.ui.graphics.drawscope.i r2 = r1.getDrawStyle()
            if (r2 != 0) goto L85
            androidx.compose.ui.graphics.drawscope.m r2 = androidx.compose.ui.graphics.drawscope.m.f17797a
        L85:
            r9 = r2
            androidx.compose.ui.graphics.t1 r5 = r1.l()     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto Lb0
            androidx.compose.ui.text.style.n r2 = r1.getTextForegroundStyle()     // Catch: java.lang.Throwable -> L9e
            androidx.compose.ui.text.style.n$b r3 = androidx.compose.ui.text.style.n.b.f21378b     // Catch: java.lang.Throwable -> L9e
            if (r2 == r3) goto La0
            androidx.compose.ui.text.style.n r1 = r1.getTextForegroundStyle()     // Catch: java.lang.Throwable -> L9e
            float r1 = r1.g()     // Catch: java.lang.Throwable -> L9e
        L9c:
            r6 = r1
            goto La3
        L9e:
            r15 = move-exception
            goto Lde
        La0:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L9c
        La3:
            androidx.compose.ui.text.o r3 = r15.getMultiParagraph()     // Catch: java.lang.Throwable -> L9e
            r11 = 64
            r12 = 0
            r10 = 0
            r4 = r14
            androidx.compose.ui.text.o.N(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9e
            goto Ld8
        Lb0:
            androidx.compose.ui.text.style.n r2 = r1.getTextForegroundStyle()     // Catch: java.lang.Throwable -> L9e
            androidx.compose.ui.text.style.n$b r3 = androidx.compose.ui.text.style.n.b.f21378b     // Catch: java.lang.Throwable -> L9e
            if (r2 == r3) goto Lc2
            androidx.compose.ui.text.style.n r1 = r1.getTextForegroundStyle()     // Catch: java.lang.Throwable -> L9e
            long r1 = r1.getValue()     // Catch: java.lang.Throwable -> L9e
        Lc0:
            r5 = r1
            goto Lcc
        Lc2:
            androidx.compose.ui.graphics.d2$a r1 = androidx.compose.ui.graphics.d2.INSTANCE     // Catch: java.lang.Throwable -> L9e
            r1.getClass()     // Catch: java.lang.Throwable -> L9e
            long r1 = androidx.compose.ui.graphics.d2.a()     // Catch: java.lang.Throwable -> L9e
            goto Lc0
        Lcc:
            androidx.compose.ui.text.o r3 = r15.getMultiParagraph()     // Catch: java.lang.Throwable -> L9e
            r11 = 32
            r12 = 0
            r10 = 0
            r4 = r14
            androidx.compose.ui.text.o.J(r3, r4, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9e
        Ld8:
            if (r0 == 0) goto Ldd
            r14.o()
        Ldd:
            return
        Lde:
            if (r0 == 0) goto Le3
            r14.o()
        Le3:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.r0.a(androidx.compose.ui.graphics.v1, androidx.compose.ui.text.n0):void");
    }
}
