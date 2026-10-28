package androidx.compose.ui.text;

import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.style.a;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.style.o;
import androidx.compose.ui.text.style.q;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.unit.z;
import i0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a2;
import kotlin.jvm.internal.r1;
import u0.e;
import u0.f;

/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\f\u001a\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\u0010\u0010\u000f\"&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\".\u0010\u001a\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00180\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013\".\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u0012\u0004\b\u001c\u0010\u001d\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013\"&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u0012\u0004\b#\u0010\u001d\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b&\u0010\u0015\"&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b)\u0010\u0015\" \u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0013\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0013\" \u00103\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0013\" \u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0013\" \u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0013\" \u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0013\" \u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0013\" \u0010B\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0013\"&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\bD\u0010\u0013\u0012\u0004\bE\u0010\u001d\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0013\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0013\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0013\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0\u0000*\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010Q\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010T\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u0000*\u00020U8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010V\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u0000*\u00020W8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010X\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u0000*\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010Z\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u0000*\u00020[8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\\\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u0000*\u00020]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010^\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010`\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\b0\u0000*\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010b\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010d\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0\u0000*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010f\"$\u0010R\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010h¨\u0006i"}, d2 = {"Landroidx/compose/runtime/saveable/l;", "T", "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/n;", "scope", "", "z", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/l;Landroidx/compose/runtime/saveable/n;)Ljava/lang/Object;", "Result", "x", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/l;)Ljava/lang/Object;", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "w", "Landroidx/compose/ui/text/e;", "a", "Landroidx/compose/runtime/saveable/l;", "e", "()Landroidx/compose/runtime/saveable/l;", "AnnotatedStringSaver", "", "Landroidx/compose/ui/text/e$b;", "b", "AnnotationRangeListSaver", "c", "f", "()V", "AnnotationRangeSaver", "Landroidx/compose/ui/text/z0;", "d", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/y0;", "v", "UrlAnnotationSaver", "Landroidx/compose/ui/text/y;", "g", "ParagraphStyleSaver", "Landroidx/compose/ui/text/i0;", "t", "SpanStyleSaver", "Landroidx/compose/ui/text/style/k;", "h", "TextDecorationSaver", "Landroidx/compose/ui/text/style/o;", "i", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/q;", "j", "TextIndentSaver", "Landroidx/compose/ui/text/font/o0;", "k", "FontWeightSaver", "Landroidx/compose/ui/text/style/a;", "l", "BaselineShiftSaver", "Landroidx/compose/ui/text/t0;", "m", "TextRangeSaver", "Landroidx/compose/ui/graphics/c6;", "n", "ShadowSaver", "Landroidx/compose/ui/graphics/d2;", "o", "ColorSaver", "Landroidx/compose/ui/unit/z;", "p", "u", "TextUnitSaver", "Li0/f;", "q", "OffsetSaver", "Lu0/f;", "r", "LocaleListSaver", "Lu0/e;", "s", "LocaleSaver", "Landroidx/compose/ui/text/style/k$a;", "(Landroidx/compose/ui/text/style/k$a;)Landroidx/compose/runtime/saveable/l;", "Saver", "Landroidx/compose/ui/text/style/o$a;", "(Landroidx/compose/ui/text/style/o$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/text/style/q$a;", "(Landroidx/compose/ui/text/style/q$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/text/font/o0$a;", "(Landroidx/compose/ui/text/font/o0$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/text/style/a$a;", "(Landroidx/compose/ui/text/style/a$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/text/t0$a;", "(Landroidx/compose/ui/text/t0$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/graphics/c6$a;", "(Landroidx/compose/ui/graphics/c6$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/graphics/d2$a;", "(Landroidx/compose/ui/graphics/d2$a;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/unit/z$a;", "(Landroidx/compose/ui/unit/z$a;)Landroidx/compose/runtime/saveable/l;", "Li0/f$a;", "(Li0/f$a;)Landroidx/compose/runtime/saveable/l;", "Lu0/f$a;", "(Lu0/f$a;)Landroidx/compose/runtime/saveable/l;", "Lu0/e$a;", "(Lu0/e$a;)Landroidx/compose/runtime/saveable/l;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.e, Object> f20901a = androidx.compose.runtime.saveable.m.a(a.f20920b, b.f20922b);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<List<e.b<? extends Object>>, Object> f20902b = androidx.compose.runtime.saveable.m.a(c.f20924b, d.f20926b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<e.b<? extends Object>, Object> f20903c = androidx.compose.runtime.saveable.m.a(e.f20928b, f.f20931b);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<z0, Object> f20904d = androidx.compose.runtime.saveable.m.a(k0.f20943b, l0.f20945b);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<y0, Object> f20905e = androidx.compose.runtime.saveable.m.a(i0.f20939b, j0.f20941b);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.y, Object> f20906f = androidx.compose.runtime.saveable.m.a(s.f20952b, t.f20953b);

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.i0, Object> f20907g = androidx.compose.runtime.saveable.m.a(w.f20956b, x.f20957b);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.k, Object> f20908h = androidx.compose.runtime.saveable.m.a(y.f20958b, z.f20959b);

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.o, Object> f20909i = androidx.compose.runtime.saveable.m.a(a0.f20921b, b0.f20923b);

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.q, Object> f20910j = androidx.compose.runtime.saveable.m.a(c0.f20925b, d0.f20927b);

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.font.o0, Object> f20911k = androidx.compose.runtime.saveable.m.a(k.f20942b, l.f20944b);

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.a, Object> f20912l = androidx.compose.runtime.saveable.m.a(g.f20934b, h.f20936b);

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<t0, Object> f20913m = androidx.compose.runtime.saveable.m.a(e0.f20930b, f0.f20933b);

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<c6, Object> f20914n = androidx.compose.runtime.saveable.m.a(u.f20954b, v.f20955b);

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<d2, Object> f20915o = androidx.compose.runtime.saveable.m.a(i.f20938b, j.f20940b);

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<androidx.compose.ui.unit.z, Object> f20916p = androidx.compose.runtime.saveable.m.a(g0.f20935b, C0373h0.f20937b);

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<i0.f, Object> f20917q = androidx.compose.runtime.saveable.m.a(q.f20950b, r.f20951b);

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<u0.f, Object> f20918r = androidx.compose.runtime.saveable.m.a(m.f20946b, n.f20947b);

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<u0.e, Object> f20919s = androidx.compose.runtime.saveable.m.a(o.f20948b, p.f20949b);

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/e;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.e, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20920b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.e eVar) {
            return kotlin.collections.w.s(h0.y(eVar.getText()), h0.z(eVar.i(), h0.f20902b, nVar), h0.z(eVar.g(), h0.f20902b, nVar), h0.z(eVar.e(), h0.f20902b, nVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/style/o;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/style/o;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.style.o, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a0 f20921b = new a0(2);

        a0() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.style.o oVar) {
            return kotlin.collections.w.s(Float.valueOf(oVar.getScaleX()), Float.valueOf(oVar.getSkewX()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/e;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/e;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n55#2,2:423\n55#2,2:426\n70#2:429\n55#2,2:432\n1#3:425\n1#3:428\n1#3:430\n1#3:431\n1#3:434\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n*L\n86#1:423,2\n88#1:426,2\n90#1:429\n93#1:432,2\n86#1:425\n88#1:428\n90#1:430\n93#1:434\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20922b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.e invoke(@fg.l Object obj) {
            List list;
            List list2;
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list3 = (List) obj;
            Object obj2 = list3.get(1);
            androidx.compose.runtime.saveable.l lVar = h0.f20902b;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = (kotlin.jvm.internal.l0.g(obj2, bool) || obj2 == null) ? null : (List) lVar.b(obj2);
            Object obj3 = list3.get(2);
            List list6 = (kotlin.jvm.internal.l0.g(obj3, bool) || obj3 == null) ? null : (List) h0.f20902b.b(obj3);
            Object obj4 = list3.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            kotlin.jvm.internal.l0.m(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj5 = list3.get(3);
            androidx.compose.runtime.saveable.l lVar2 = h0.f20902b;
            if (!kotlin.jvm.internal.l0.g(obj5, bool) && obj5 != null) {
                list4 = (List) lVar2.b(obj5);
            }
            return new androidx.compose.ui.text.e(str, list, list2, list4);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/o;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/o;"}, k = 3, mv = {1, 8, 0})
    static final class b0 extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.style.o> {

        /* renamed from: b, reason: collision with root package name */
        public static final b0 f20923b = new b0(1);

        b0() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.o invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new androidx.compose.ui.text.style.o(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "", "Landroidx/compose/ui/text/e$b;", "", "it", "a", "(Landroidx/compose/runtime/saveable/n;Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,422:1\n151#2,3:423\n33#2,4:426\n154#2,2:430\n38#2:432\n156#2:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n*L\n100#1:423,3\n100#1:426,4\n100#1:430,2\n100#1:432\n100#1:433\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, List<? extends e.b<? extends Object>>, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20924b = new c(2);

        c() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l List<? extends e.b<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(h0.z(list.get(i4), h0.f20903c, nVar));
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/style/q;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/style/q;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.style.q, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final c0 f20925b = new c0(2);

        c0() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.style.q qVar) {
            androidx.compose.ui.unit.z c5 = androidx.compose.ui.unit.z.c(qVar.getFirstLine());
            z.Companion companion = androidx.compose.ui.unit.z.INSTANCE;
            return kotlin.collections.w.s(h0.z(c5, h0.p(companion), nVar), h0.z(androidx.compose.ui.unit.z.c(qVar.getRestLine()), h0.p(companion), nVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Landroidx/compose/ui/text/e$b;", "a", "(Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n151#2,3:423\n33#2,4:426\n154#2:430\n155#2:434\n38#2:435\n156#2:436\n55#3,2:431\n1#4:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n*L\n107#1:423,3\n107#1:426,4\n107#1:430\n107#1:434\n107#1:435\n107#1:436\n108#1:431,2\n108#1:433\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Object, List<? extends e.b<? extends Object>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f20926b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<e.b<? extends Object>> invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = list.get(i4);
                androidx.compose.runtime.saveable.l lVar = h0.f20903c;
                e.b bVar = null;
                if (!kotlin.jvm.internal.l0.g(obj2, Boolean.FALSE) && obj2 != null) {
                    bVar = (e.b) lVar.b(obj2);
                }
                kotlin.jvm.internal.l0.m(bVar);
                arrayList.add(bVar);
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/q;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n55#2,2:423\n55#2,2:426\n1#3:425\n1#3:428\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n295#1:423,2\n296#1:426,2\n295#1:425\n296#1:428\n*E\n"})
    static final class d0 extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.style.q> {

        /* renamed from: b, reason: collision with root package name */
        public static final d0 f20927b = new d0(1);

        d0() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.q invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            z.Companion companion = androidx.compose.ui.unit.z.INSTANCE;
            androidx.compose.runtime.saveable.l<androidx.compose.ui.unit.z, Object> p4 = h0.p(companion);
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.unit.z zVar = null;
            androidx.compose.ui.unit.z b5 = (kotlin.jvm.internal.l0.g(obj2, bool) || obj2 == null) ? null : p4.b(obj2);
            kotlin.jvm.internal.l0.m(b5);
            long packedValue = b5.getPackedValue();
            Object obj3 = list.get(1);
            androidx.compose.runtime.saveable.l<androidx.compose.ui.unit.z, Object> p5 = h0.p(companion);
            if (!kotlin.jvm.internal.l0.g(obj3, bool) && obj3 != null) {
                zVar = p5.b(obj3);
            }
            kotlin.jvm.internal.l0.m(zVar);
            return new androidx.compose.ui.text.style.q(packedValue, zVar.getPackedValue(), null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/e$b;", "", "it", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/e$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, e.b<? extends Object>, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f20928b = new e(2);

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20929a;

            static {
                int[] iArr = new int[androidx.compose.ui.text.g.values().length];
                try {
                    iArr[androidx.compose.ui.text.g.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f20929a = iArr;
            }
        }

        e() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l e.b<? extends Object> bVar) {
            Object z4;
            Object h4 = bVar.h();
            androidx.compose.ui.text.g gVar = h4 instanceof androidx.compose.ui.text.y ? androidx.compose.ui.text.g.Paragraph : h4 instanceof androidx.compose.ui.text.i0 ? androidx.compose.ui.text.g.Span : h4 instanceof z0 ? androidx.compose.ui.text.g.VerbatimTts : h4 instanceof y0 ? androidx.compose.ui.text.g.Url : androidx.compose.ui.text.g.String;
            int i4 = a.f20929a[gVar.ordinal()];
            if (i4 == 1) {
                Object h5 = bVar.h();
                kotlin.jvm.internal.l0.n(h5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                z4 = h0.z((androidx.compose.ui.text.y) h5, h0.g(), nVar);
            } else if (i4 == 2) {
                Object h6 = bVar.h();
                kotlin.jvm.internal.l0.n(h6, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                z4 = h0.z((androidx.compose.ui.text.i0) h6, h0.t(), nVar);
            } else if (i4 == 3) {
                Object h7 = bVar.h();
                kotlin.jvm.internal.l0.n(h7, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                z4 = h0.z((z0) h7, h0.f20904d, nVar);
            } else if (i4 == 4) {
                Object h10 = bVar.h();
                kotlin.jvm.internal.l0.n(h10, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                z4 = h0.z((y0) h10, h0.f20905e, nVar);
            } else {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                z4 = h0.y(bVar.h());
            }
            return kotlin.collections.w.s(h0.y(gVar), z4, Integer.valueOf(bVar.i()), Integer.valueOf(bVar.g()), bVar.j());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/t0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class e0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, t0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final e0 f20930b = new e0(2);

        e0() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final Object a(@fg.l androidx.compose.runtime.saveable.n nVar, long j4) {
            return kotlin.collections.w.s(h0.y(Integer.valueOf(t0.n(j4))), Integer.valueOf((int) (j4 & 4294967295L)));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.n nVar, t0 t0Var) {
            return a(nVar, t0Var.getPackedValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/e$b;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/e$b;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n70#2:425\n70#2:427\n70#2:429\n55#2,2:431\n55#2,2:434\n55#2,2:437\n55#2,2:440\n70#2:443\n1#3:424\n1#3:426\n1#3:428\n1#3:430\n1#3:433\n1#3:436\n1#3:439\n1#3:442\n1#3:444\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n160#1:423\n161#1:425\n162#1:427\n163#1:429\n167#1:431,2\n171#1:434,2\n175#1:437,2\n179#1:440,2\n183#1:443\n160#1:424\n161#1:426\n162#1:428\n163#1:430\n167#1:433\n171#1:436\n175#1:439\n179#1:442\n183#1:444\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<Object, e.b<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f20931b = new f(1);

        /* compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20932a;

            static {
                int[] iArr = new int[androidx.compose.ui.text.g.values().length];
                try {
                    iArr[androidx.compose.ui.text.g.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.compose.ui.text.g.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f20932a = iArr;
            }
        }

        f() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e.b<? extends Object> invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            androidx.compose.ui.text.g gVar = obj2 != null ? (androidx.compose.ui.text.g) obj2 : null;
            kotlin.jvm.internal.l0.m(gVar);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            kotlin.jvm.internal.l0.m(num);
            int intValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            kotlin.jvm.internal.l0.m(num2);
            int intValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            kotlin.jvm.internal.l0.m(str);
            int i4 = a.f20932a[gVar.ordinal()];
            if (i4 == 1) {
                Object obj6 = list.get(1);
                androidx.compose.runtime.saveable.l<androidx.compose.ui.text.y, Object> g4 = h0.g();
                if (!kotlin.jvm.internal.l0.g(obj6, Boolean.FALSE) && obj6 != null) {
                    r1 = g4.b(obj6);
                }
                kotlin.jvm.internal.l0.m(r1);
                return new e.b<>(r1, intValue, intValue2, str);
            }
            if (i4 == 2) {
                Object obj7 = list.get(1);
                androidx.compose.runtime.saveable.l<androidx.compose.ui.text.i0, Object> t4 = h0.t();
                if (!kotlin.jvm.internal.l0.g(obj7, Boolean.FALSE) && obj7 != null) {
                    r1 = t4.b(obj7);
                }
                kotlin.jvm.internal.l0.m(r1);
                return new e.b<>(r1, intValue, intValue2, str);
            }
            if (i4 == 3) {
                Object obj8 = list.get(1);
                androidx.compose.runtime.saveable.l lVar = h0.f20904d;
                if (!kotlin.jvm.internal.l0.g(obj8, Boolean.FALSE) && obj8 != null) {
                    r1 = (z0) lVar.b(obj8);
                }
                kotlin.jvm.internal.l0.m(r1);
                return new e.b<>(r1, intValue, intValue2, str);
            }
            if (i4 != 4) {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj9 = list.get(1);
                r1 = obj9 != null ? (String) obj9 : null;
                kotlin.jvm.internal.l0.m(r1);
                return new e.b<>(r1, intValue, intValue2, str);
            }
            Object obj10 = list.get(1);
            androidx.compose.runtime.saveable.l lVar2 = h0.f20905e;
            if (!kotlin.jvm.internal.l0.g(obj10, Boolean.FALSE) && obj10 != null) {
                r1 = (y0) lVar2.b(obj10);
            }
            kotlin.jvm.internal.l0.m(r1);
            return new e.b<>(r1, intValue, intValue2, str);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/t0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/t0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n329#1:423\n329#1:424\n*E\n"})
    static final class f0 extends kotlin.jvm.internal.n0 implements ld.l<Object, t0> {

        /* renamed from: b, reason: collision with root package name */
        public static final f0 f20933b = new f0(1);

        f0() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0 invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            kotlin.jvm.internal.l0.m(num);
            int intValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            kotlin.jvm.internal.l0.m(num2);
            return t0.b(u0.b(intValue, num2.intValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/style/a;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;F)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.style.a, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f20934b = new g(2);

        g() {
            super(2);
        }

        @fg.m
        public final Object a(@fg.l androidx.compose.runtime.saveable.n nVar, float f4) {
            return Float.valueOf(f4);
        }

        @Override // ld.p
        public Object invoke(androidx.compose.runtime.saveable.n nVar, androidx.compose.ui.text.style.a aVar) {
            return Float.valueOf(aVar.k());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/unit/z;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.unit.z, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final g0 f20935b = new g0(2);

        g0() {
            super(2);
        }

        @fg.m
        public final Object a(@fg.l androidx.compose.runtime.saveable.n nVar, long j4) {
            return kotlin.collections.w.s(h0.y(Float.valueOf(androidx.compose.ui.unit.z.n(j4))), androidx.compose.ui.unit.b0.d(androidx.compose.ui.unit.z.m(j4)));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.n nVar, androidx.compose.ui.unit.z zVar) {
            return a(nVar, zVar.getPackedValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/a;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/a;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.style.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f20936b = new h(1);

        h() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.a invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return androidx.compose.ui.text.style.a.d(androidx.compose.ui.text.style.a.e(((Float) obj).floatValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/unit/z;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/unit/z;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n374#1:423\n374#1:424\n*E\n"})
    /* renamed from: androidx.compose.ui.text.h0$h0, reason: collision with other inner class name */
    static final class C0373h0 extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.unit.z> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0373h0 f20937b = new C0373h0(1);

        C0373h0() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.unit.z invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f4 = obj2 != null ? (Float) obj2 : null;
            kotlin.jvm.internal.l0.m(f4);
            float floatValue = f4.floatValue();
            Object obj3 = list.get(1);
            androidx.compose.ui.unit.b0 b0Var = obj3 != null ? (androidx.compose.ui.unit.b0) obj3 : null;
            kotlin.jvm.internal.l0.m(b0Var);
            return androidx.compose.ui.unit.z.c(androidx.compose.ui.unit.a0.v(b0Var.getType(), floatValue));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/graphics/d2;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, d2, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f20938b = new i(2);

        i() {
            super(2);
        }

        @fg.m
        public final Object a(@fg.l androidx.compose.runtime.saveable.n nVar, long j4) {
            return a2.b(j4);
        }

        @Override // ld.p
        public Object invoke(androidx.compose.runtime.saveable.n nVar, d2 d2Var) {
            return a2.b(d2Var.M());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/y0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/y0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class i0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, y0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final i0 f20939b = new i0(2);

        i0() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l y0 y0Var) {
            return h0.y(y0Var.getUrl());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/graphics/d2;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/graphics/d2;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<Object, d2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f20940b = new j(1);

        j() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d2 invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.ULong");
            return d2.n(d2.t(((a2) obj).getData()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/y0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/y0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n*L\n198#1:423\n198#1:424\n*E\n"})
    static final class j0 extends kotlin.jvm.internal.n0 implements ld.l<Object, y0> {

        /* renamed from: b, reason: collision with root package name */
        public static final j0 f20941b = new j0(1);

        j0() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y0 invoke(@fg.l Object obj) {
            String str = obj != null ? (String) obj : null;
            kotlin.jvm.internal.l0.m(str);
            return new y0(str);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/font/o0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/font/o0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.font.o0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f20942b = new k(2);

        k() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.font.o0 o0Var) {
            return Integer.valueOf(o0Var.u());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/z0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/z0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, z0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final k0 f20943b = new k0(2);

        k0() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l z0 z0Var) {
            return h0.y(z0Var.getVerbatim());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/font/o0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/font/o0;"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.font.o0> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f20944b = new l(1);

        l() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.o0 invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return new androidx.compose.ui.text.font.o0(((Integer) obj).intValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/z0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/z0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n*L\n192#1:423\n192#1:424\n*E\n"})
    static final class l0 extends kotlin.jvm.internal.n0 implements ld.l<Object, z0> {

        /* renamed from: b, reason: collision with root package name */
        public static final l0 f20945b = new l0(1);

        l0() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(@fg.l Object obj) {
            String str = obj != null ? (String) obj : null;
            kotlin.jvm.internal.l0.m(str);
            return new z0(str);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Lu0/f;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Lu0/f;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,422:1\n151#2,3:423\n33#2,4:426\n154#2,2:430\n38#2:432\n156#2:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n404#1:423,3\n404#1:426,4\n404#1:430,2\n404#1:432\n404#1:433\n*E\n"})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, u0.f, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f20946b = new m(2);

        m() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l u0.f fVar) {
            List<u0.e> h4 = fVar.h();
            ArrayList arrayList = new ArrayList(h4.size());
            int size = h4.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(h0.z(h4.get(i4), h0.r(u0.e.INSTANCE), nVar));
            }
            return arrayList;
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lu0/f;", "a", "(Ljava/lang/Object;)Lu0/f;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n151#2,3:423\n33#2,4:426\n154#2:430\n155#2:434\n38#2:435\n156#2:436\n55#3,2:431\n1#4:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n411#1:423,3\n411#1:426,4\n411#1:430\n411#1:434\n411#1:435\n411#1:436\n411#1:431,2\n411#1:433\n*E\n"})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<Object, u0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f20947b = new n(1);

        n() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0.f invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = list.get(i4);
                androidx.compose.runtime.saveable.l<u0.e, Object> r4 = h0.r(u0.e.INSTANCE);
                u0.e eVar = null;
                if (!kotlin.jvm.internal.l0.g(obj2, Boolean.FALSE) && obj2 != null) {
                    eVar = r4.b(obj2);
                }
                kotlin.jvm.internal.l0.m(eVar);
                arrayList.add(eVar);
            }
            return new u0.f(arrayList);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Lu0/e;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Lu0/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, u0.e, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f20948b = new o(2);

        o() {
            super(2);
        }

        @fg.m
        public final Object a(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l u0.e eVar) {
            return eVar.e();
        }

        @Override // ld.p
        public Object invoke(androidx.compose.runtime.saveable.n nVar, u0.e eVar) {
            return eVar.e();
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lu0/e;", "a", "(Ljava/lang/Object;)Lu0/e;"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.n0 implements ld.l<Object, u0.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f20949b = new p(1);

        p() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0.e invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.String");
            return new u0.e((String) obj);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Li0/f;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, i0.f, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f20950b = new q(2);

        q() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final Object a(@fg.l androidx.compose.runtime.saveable.n nVar, long j4) {
            i0.f.INSTANCE.getClass();
            return i0.f.l(j4, i0.f.f74149e) ? Boolean.FALSE : kotlin.collections.w.s(h0.y(Float.valueOf(i0.f.p(j4))), Float.valueOf(i0.f.r(j4)));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.saveable.n nVar, i0.f fVar) {
            return a(nVar, fVar.getPackedValue());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Li0/f;", "a", "(Ljava/lang/Object;)Li0/f;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n1#3:424\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:423\n394#1:424\n*E\n"})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<Object, i0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f20951b = new r(1);

        r() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.f invoke(@fg.l Object obj) {
            if (kotlin.jvm.internal.l0.g(obj, Boolean.FALSE)) {
                i0.f.INSTANCE.getClass();
                return i0.f.d(i0.f.f74149e);
            }
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f4 = obj2 != null ? (Float) obj2 : null;
            kotlin.jvm.internal.l0.m(f4);
            float floatValue = f4.floatValue();
            Object obj3 = list.get(1);
            Float f5 = obj3 != null ? (Float) obj3 : null;
            kotlin.jvm.internal.l0.m(f5);
            return i0.f.d(i0.g.a(floatValue, f5.floatValue()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/y;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/y;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.y, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final s f20952b = new s(2);

        s() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.y yVar) {
            return kotlin.collections.w.s(h0.y(androidx.compose.ui.text.style.j.h(yVar.getTextAlign())), androidx.compose.ui.text.style.l.g(yVar.getTextDirection()), h0.z(androidx.compose.ui.unit.z.c(yVar.getLineHeight()), h0.p(androidx.compose.ui.unit.z.INSTANCE), nVar), h0.z(yVar.getTextIndent(), h0.o(androidx.compose.ui.text.style.q.INSTANCE), nVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/y;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/y;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n70#2:423\n70#2:425\n55#2,2:427\n55#2,2:430\n1#3:424\n1#3:426\n1#3:429\n1#3:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n213#1:423\n214#1:425\n215#1:427,2\n216#1:430,2\n213#1:424\n214#1:426\n215#1:429\n216#1:432\n*E\n"})
    static final class t extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.y> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f20953b = new t(1);

        t() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.y invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            androidx.compose.ui.text.style.j jVar = obj2 != null ? (androidx.compose.ui.text.style.j) obj2 : null;
            kotlin.jvm.internal.l0.m(jVar);
            int value = jVar.getValue();
            Object obj3 = list.get(1);
            androidx.compose.ui.text.style.l lVar = obj3 != null ? (androidx.compose.ui.text.style.l) obj3 : null;
            kotlin.jvm.internal.l0.m(lVar);
            int value2 = lVar.getValue();
            Object obj4 = list.get(2);
            androidx.compose.runtime.saveable.l<androidx.compose.ui.unit.z, Object> p4 = h0.p(androidx.compose.ui.unit.z.INSTANCE);
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.unit.z b5 = (kotlin.jvm.internal.l0.g(obj4, bool) || obj4 == null) ? null : p4.b(obj4);
            kotlin.jvm.internal.l0.m(b5);
            long packedValue = b5.getPackedValue();
            Object obj5 = list.get(3);
            return new androidx.compose.ui.text.y(value, value2, packedValue, (kotlin.jvm.internal.l0.g(obj5, bool) || obj5 == null) ? null : h0.o(androidx.compose.ui.text.style.q.INSTANCE).b(obj5), (androidx.compose.ui.text.c0) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.s) null, 496, (kotlin.jvm.internal.w) null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/graphics/c6;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/graphics/c6;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, c6, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f20954b = new u(2);

        u() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l c6 c6Var) {
            return kotlin.collections.w.s(h0.z(d2.n(c6Var.getColor()), h0.h(d2.INSTANCE), nVar), h0.z(i0.f.d(c6Var.getOffset()), h0.q(i0.f.INSTANCE), nVar), Float.valueOf(c6Var.getBlurRadius()));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/graphics/c6;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/graphics/c6;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n55#2,2:423\n55#2,2:426\n70#2:429\n1#3:425\n1#3:428\n1#3:430\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n348#1:423,2\n349#1:426,2\n350#1:429\n348#1:425\n349#1:428\n350#1:430\n*E\n"})
    static final class v extends kotlin.jvm.internal.n0 implements ld.l<Object, c6> {

        /* renamed from: b, reason: collision with root package name */
        public static final v f20955b = new v(1);

        v() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c6 invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            androidx.compose.runtime.saveable.l<d2, Object> h4 = h0.h(d2.INSTANCE);
            Boolean bool = Boolean.FALSE;
            d2 b5 = (kotlin.jvm.internal.l0.g(obj2, bool) || obj2 == null) ? null : h4.b(obj2);
            kotlin.jvm.internal.l0.m(b5);
            long M = b5.M();
            Object obj3 = list.get(1);
            i0.f b6 = (kotlin.jvm.internal.l0.g(obj3, bool) || obj3 == null) ? null : h0.q(i0.f.INSTANCE).b(obj3);
            kotlin.jvm.internal.l0.m(b6);
            long packedValue = b6.getPackedValue();
            Object obj4 = list.get(2);
            Float f4 = obj4 != null ? (Float) obj4 : null;
            kotlin.jvm.internal.l0.m(f4);
            return new c6(M, packedValue, f4.floatValue(), null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/i0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/i0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.i0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final w f20956b = new w(2);

        w() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.i0 i0Var) {
            d2 n4 = d2.n(i0Var.m());
            d2.Companion companion = d2.INSTANCE;
            Object z4 = h0.z(n4, h0.h(companion), nVar);
            androidx.compose.ui.unit.z c5 = androidx.compose.ui.unit.z.c(i0Var.getFontSize());
            z.Companion companion2 = androidx.compose.ui.unit.z.INSTANCE;
            return kotlin.collections.w.s(z4, h0.z(c5, h0.p(companion2), nVar), h0.z(i0Var.getFontWeight(), h0.k(androidx.compose.ui.text.font.o0.INSTANCE), nVar), i0Var.getFontStyle(), i0Var.getFontSynthesis(), -1, i0Var.getFontFeatureSettings(), h0.z(androidx.compose.ui.unit.z.c(i0Var.getLetterSpacing()), h0.p(companion2), nVar), h0.z(i0Var.getBaselineShift(), h0.l(androidx.compose.ui.text.style.a.INSTANCE), nVar), h0.z(i0Var.getTextGeometricTransform(), h0.n(androidx.compose.ui.text.style.o.INSTANCE), nVar), h0.z(i0Var.getLocaleList(), h0.s(u0.f.INSTANCE), nVar), h0.z(d2.n(i0Var.getBackground()), h0.h(companion), nVar), h0.z(i0Var.getBackground(), h0.m(androidx.compose.ui.text.style.k.INSTANCE), nVar), h0.z(i0Var.getShadow(), h0.i(c6.INSTANCE), nVar));
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/i0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/i0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n55#2,2:423\n55#2,2:426\n55#2,2:429\n70#2:432\n70#2:434\n70#2:436\n55#2,2:438\n55#2,2:441\n55#2,2:444\n55#2,2:447\n55#2,2:450\n55#2,2:453\n55#2,2:456\n1#3:425\n1#3:428\n1#3:431\n1#3:433\n1#3:435\n1#3:437\n1#3:440\n1#3:443\n1#3:446\n1#3:449\n1#3:452\n1#3:455\n1#3:458\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n243#1:423,2\n244#1:426,2\n245#1:429,2\n246#1:432\n247#1:434\n249#1:436\n250#1:438,2\n251#1:441,2\n252#1:444,2\n253#1:447,2\n254#1:450,2\n255#1:453,2\n256#1:456,2\n243#1:425\n244#1:428\n245#1:431\n246#1:433\n247#1:435\n249#1:437\n250#1:440\n251#1:443\n252#1:446\n253#1:449\n254#1:452\n255#1:455\n256#1:458\n*E\n"})
    static final class x extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.i0> {

        /* renamed from: b, reason: collision with root package name */
        public static final x f20957b = new x(1);

        x() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.i0 invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            d2.Companion companion = d2.INSTANCE;
            androidx.compose.runtime.saveable.l<d2, Object> h4 = h0.h(companion);
            Boolean bool = Boolean.FALSE;
            d2 b5 = (kotlin.jvm.internal.l0.g(obj2, bool) || obj2 == null) ? null : h4.b(obj2);
            kotlin.jvm.internal.l0.m(b5);
            long M = b5.M();
            Object obj3 = list.get(1);
            z.Companion companion2 = androidx.compose.ui.unit.z.INSTANCE;
            androidx.compose.ui.unit.z b6 = (kotlin.jvm.internal.l0.g(obj3, bool) || obj3 == null) ? null : h0.p(companion2).b(obj3);
            kotlin.jvm.internal.l0.m(b6);
            long packedValue = b6.getPackedValue();
            Object obj4 = list.get(2);
            androidx.compose.ui.text.font.o0 b7 = (kotlin.jvm.internal.l0.g(obj4, bool) || obj4 == null) ? null : h0.k(androidx.compose.ui.text.font.o0.INSTANCE).b(obj4);
            Object obj5 = list.get(3);
            androidx.compose.ui.text.font.k0 k0Var = obj5 != null ? (androidx.compose.ui.text.font.k0) obj5 : null;
            Object obj6 = list.get(4);
            androidx.compose.ui.text.font.l0 l0Var = obj6 != null ? (androidx.compose.ui.text.font.l0) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            androidx.compose.ui.unit.z b10 = (kotlin.jvm.internal.l0.g(obj8, bool) || obj8 == null) ? null : h0.p(companion2).b(obj8);
            kotlin.jvm.internal.l0.m(b10);
            long packedValue2 = b10.getPackedValue();
            Object obj9 = list.get(8);
            androidx.compose.ui.text.style.a b11 = (kotlin.jvm.internal.l0.g(obj9, bool) || obj9 == null) ? null : h0.l(androidx.compose.ui.text.style.a.INSTANCE).b(obj9);
            Object obj10 = list.get(9);
            androidx.compose.ui.text.style.o b12 = (kotlin.jvm.internal.l0.g(obj10, bool) || obj10 == null) ? null : h0.n(androidx.compose.ui.text.style.o.INSTANCE).b(obj10);
            Object obj11 = list.get(10);
            u0.f b13 = (kotlin.jvm.internal.l0.g(obj11, bool) || obj11 == null) ? null : h0.s(u0.f.INSTANCE).b(obj11);
            Object obj12 = list.get(11);
            d2 b14 = (kotlin.jvm.internal.l0.g(obj12, bool) || obj12 == null) ? null : h0.h(companion).b(obj12);
            kotlin.jvm.internal.l0.m(b14);
            long M2 = b14.M();
            Object obj13 = list.get(12);
            androidx.compose.ui.text.style.k b15 = (kotlin.jvm.internal.l0.g(obj13, bool) || obj13 == null) ? null : h0.m(androidx.compose.ui.text.style.k.INSTANCE).b(obj13);
            Object obj14 = list.get(13);
            return new androidx.compose.ui.text.i0(M, packedValue, b7, k0Var, l0Var, (androidx.compose.ui.text.font.y) null, str, packedValue2, b11, b12, b13, M2, b15, (kotlin.jvm.internal.l0.g(obj14, bool) || obj14 == null) ? null : h0.i(c6.INSTANCE).b(obj14), (androidx.compose.ui.text.d0) null, (androidx.compose.ui.graphics.drawscope.i) null, 49184, (kotlin.jvm.internal.w) null);
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/style/k;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/style/k;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class y extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, androidx.compose.ui.text.style.k, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final y f20958b = new y(2);

        y() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l androidx.compose.ui.text.style.k kVar) {
            return Integer.valueOf(kVar.getMask());
        }
    }

    /* compiled from: Savers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/k;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/style/k;"}, k = 3, mv = {1, 8, 0})
    static final class z extends kotlin.jvm.internal.n0 implements ld.l<Object, androidx.compose.ui.text.style.k> {

        /* renamed from: b, reason: collision with root package name */
        public static final z f20959b = new z(1);

        z() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.style.k invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return new androidx.compose.ui.text.style.k(((Integer) obj).intValue());
        }
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.e, Object> e() {
        return f20901a;
    }

    private static /* synthetic */ void f() {
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.y, Object> g() {
        return f20906f;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<d2, Object> h(@fg.l d2.Companion companion) {
        return f20915o;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<c6, Object> i(@fg.l c6.Companion companion) {
        return f20914n;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<t0, Object> j(@fg.l t0.Companion companion) {
        return f20913m;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.font.o0, Object> k(@fg.l o0.Companion companion) {
        return f20911k;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.a, Object> l(@fg.l a.Companion companion) {
        return f20912l;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.k, Object> m(@fg.l k.Companion companion) {
        return f20908h;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.o, Object> n(@fg.l o.Companion companion) {
        return f20909i;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.style.q, Object> o(@fg.l q.Companion companion) {
        return f20910j;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.unit.z, Object> p(@fg.l z.Companion companion) {
        return f20916p;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<i0.f, Object> q(@fg.l f.Companion companion) {
        return f20917q;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<u0.e, Object> r(@fg.l e.Companion companion) {
        return f20919s;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<u0.f, Object> s(@fg.l f.Companion companion) {
        return f20918r;
    }

    @fg.l
    public static final androidx.compose.runtime.saveable.l<androidx.compose.ui.text.i0, Object> t() {
        return f20907g;
    }

    private static /* synthetic */ void u() {
    }

    private static /* synthetic */ void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <Result> Result w(Object obj) {
        if (obj == 0) {
            return null;
        }
        kotlin.jvm.internal.l0.P();
        return obj;
    }

    public static final <T extends androidx.compose.runtime.saveable.l<Original, Saveable>, Original, Saveable, Result> Result x(Saveable saveable, T t4) {
        if (kotlin.jvm.internal.l0.g(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) t4.b(saveable);
        kotlin.jvm.internal.l0.P();
        return result;
    }

    @fg.m
    public static final <T> T y(@fg.m T t4) {
        return t4;
    }

    @fg.l
    public static final <T extends androidx.compose.runtime.saveable.l<Original, Saveable>, Original, Saveable> Object z(@fg.m Original original, @fg.l T t4, @fg.l androidx.compose.runtime.saveable.n nVar) {
        Object a5;
        return (original == null || (a5 = t4.a(nVar, original)) == null) ? Boolean.FALSE : a5;
    }
}
