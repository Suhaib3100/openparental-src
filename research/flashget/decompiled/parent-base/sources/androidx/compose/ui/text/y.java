package androidx.compose.ui.text;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: ParagraphStyle.kt */
@m1
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0016B7\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0017BO\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0018Bg\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJX\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!Jp\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J|\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%Jr\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020(2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u0010-R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010-R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u00101\u001a\u0004\bC\u0010-R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bE\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\bG\u0010HR\"\u0010M\u001a\u0004\u0018\u00010\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bK\u0010L\u001a\u0004\bI\u0010JR\"\u0010Q\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bP\u0010L\u001a\u0004\bN\u0010OR\"\u0010U\u001a\u0004\u0018\u00010\u00108GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bT\u0010L\u001a\u0004\bR\u0010SR\"\u0010Y\u001a\u0004\u0018\u00010\u000e8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bX\u0010L\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/text/y;", "", "Landroidx/compose/ui/text/style/j;", "textAlign", "Landroidx/compose/ui/text/style/l;", "textDirection", "Landroidx/compose/ui/unit/z;", "lineHeight", "Landroidx/compose/ui/text/style/q;", "textIndent", "Landroidx/compose/ui/text/c0;", "platformStyle", "Landroidx/compose/ui/text/style/h;", "lineHeightStyle", "Landroidx/compose/ui/text/style/f;", "lineBreak", "Landroidx/compose/ui/text/style/e;", "hyphens", "Landroidx/compose/ui/text/style/s;", "textMotion", "<init>", "(IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/s;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;Lkotlin/jvm/internal/w;)V", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Lkotlin/jvm/internal/w;)V", "other", "B", "(Landroidx/compose/ui/text/y;)Landroidx/compose/ui/text/y;", "D", "a", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;)Landroidx/compose/ui/text/y;", "g", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;)Landroidx/compose/ui/text/y;", "e", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;)Landroidx/compose/ui/text/y;", "c", "(Landroidx/compose/ui/text/style/j;Landroidx/compose/ui/text/style/l;JLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;Landroidx/compose/ui/text/style/f;Landroidx/compose/ui/text/style/e;Landroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/y;", "i", "(IIJLandroidx/compose/ui/text/style/q;Landroidx/compose/ui/text/c0;Landroidx/compose/ui/text/style/h;IILandroidx/compose/ui/text/style/s;)Landroidx/compose/ui/text/y;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "v", "b", "y", "J", "q", "()J", "d", "Landroidx/compose/ui/text/style/q;", "z", "()Landroidx/compose/ui/text/style/q;", "Landroidx/compose/ui/text/c0;", "s", "()Landroidx/compose/ui/text/c0;", "f", "Landroidx/compose/ui/text/style/h;", "r", "()Landroidx/compose/ui/text/style/h;", "p", "h", "m", "Landroidx/compose/ui/text/style/s;", "A", "()Landroidx/compose/ui/text/style/s;", "t", "()Landroidx/compose/ui/text/style/j;", "u", "()V", "deprecated_boxing_textAlign", "w", "()Landroidx/compose/ui/text/style/l;", "x", "deprecated_boxing_textDirection", "k", "()Landroidx/compose/ui/text/style/e;", "l", "deprecated_boxing_hyphens", "n", "()Landroidx/compose/ui/text/style/f;", "o", "deprecated_boxing_lineBreak", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: j, reason: collision with root package name */
    public static final int f21432j = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int textAlign;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int textDirection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long lineHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.text.style.q textIndent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final c0 platformStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.text.style.h lineHeightStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int lineBreak;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int hyphens;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.text.style.s textMotion;

    public /* synthetic */ y(int i4, int i5, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar, kotlin.jvm.internal.w wVar) {
        this(i4, i5, j4, qVar, c0Var, hVar, i6, i7, sVar);
    }

    public static /* synthetic */ y C(y yVar, y yVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            yVar2 = null;
        }
        return yVar.B(yVar2);
    }

    public static /* synthetic */ y b(y yVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j4, androidx.compose.ui.text.style.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            jVar = androidx.compose.ui.text.style.j.h(yVar.textAlign);
        }
        if ((i4 & 2) != 0) {
            lVar = androidx.compose.ui.text.style.l.g(yVar.textDirection);
        }
        androidx.compose.ui.text.style.l lVar2 = lVar;
        if ((i4 & 4) != 0) {
            j4 = yVar.lineHeight;
        }
        long j5 = j4;
        if ((i4 & 8) != 0) {
            qVar = yVar.textIndent;
        }
        return yVar.a(jVar, lVar2, j5, qVar);
    }

    public static /* synthetic */ y h(y yVar, androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            jVar = androidx.compose.ui.text.style.j.h(yVar.textAlign);
        }
        if ((i4 & 2) != 0) {
            lVar = androidx.compose.ui.text.style.l.g(yVar.textDirection);
        }
        androidx.compose.ui.text.style.l lVar2 = lVar;
        if ((i4 & 4) != 0) {
            j4 = yVar.lineHeight;
        }
        long j5 = j4;
        if ((i4 & 8) != 0) {
            qVar = yVar.textIndent;
        }
        androidx.compose.ui.text.style.q qVar2 = qVar;
        if ((i4 & 16) != 0) {
            c0Var = yVar.platformStyle;
        }
        c0 c0Var2 = c0Var;
        if ((i4 & 32) != 0) {
            hVar = yVar.lineHeightStyle;
        }
        return yVar.g(jVar, lVar2, j5, qVar2, c0Var2, hVar);
    }

    public static y j(y yVar, int i4, int i5, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar, int i10, Object obj) {
        int i11 = (i10 & 1) != 0 ? yVar.textAlign : i4;
        int i12 = (i10 & 2) != 0 ? yVar.textDirection : i5;
        long j5 = (i10 & 4) != 0 ? yVar.lineHeight : j4;
        androidx.compose.ui.text.style.q qVar2 = (i10 & 8) != 0 ? yVar.textIndent : qVar;
        c0 c0Var2 = (i10 & 16) != 0 ? yVar.platformStyle : c0Var;
        androidx.compose.ui.text.style.h hVar2 = (i10 & 32) != 0 ? yVar.lineHeightStyle : hVar;
        int i13 = (i10 & 64) != 0 ? yVar.lineBreak : i6;
        int i14 = (i10 & 128) != 0 ? yVar.hyphens : i7;
        androidx.compose.ui.text.style.s sVar2 = (i10 & 256) != 0 ? yVar.textMotion : sVar;
        yVar.getClass();
        return new y(i11, i12, j5, qVar2, c0Var2, hVar2, i13, i14, sVar2);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void l() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void o() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void u() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Kept for backwards compatibility.")
    public static /* synthetic */ void x() {
    }

    @fg.m
    /* renamed from: A, reason: from getter */
    public final androidx.compose.ui.text.style.s getTextMotion() {
        return this.textMotion;
    }

    @x4
    @fg.l
    public final y B(@fg.m y other) {
        return other == null ? this : z.a(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    @x4
    @fg.l
    public final y D(@fg.l y other) {
        return B(other);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final y a(androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent) {
        int i4;
        int i5;
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        int i6 = i4;
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        return new y(i6, i5, lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public final y c(androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, c0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle, androidx.compose.ui.text.style.f lineBreak, androidx.compose.ui.text.style.e hyphens, androidx.compose.ui.text.style.s textMotion) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        int i10 = i4;
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        int i11 = i5;
        if (lineBreak != null) {
            i6 = lineBreak.getMask();
        } else {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i6 = androidx.compose.ui.text.style.f.f21314f;
        }
        int i12 = i6;
        if (hyphens != null) {
            i7 = hyphens.getValue();
        } else {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.e.f21308e;
        }
        return new y(i10, i11, lineHeight, textIndent, platformStyle, lineHeightStyle, i12, i7, textMotion);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    public final y e(androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, c0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle, androidx.compose.ui.text.style.f lineBreak, androidx.compose.ui.text.style.e hyphens) {
        int i4;
        int i5;
        int i6;
        int i7;
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        int i10 = i4;
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        int i11 = i5;
        if (lineBreak != null) {
            i6 = lineBreak.getMask();
        } else {
            androidx.compose.ui.text.style.f.INSTANCE.getClass();
            i6 = androidx.compose.ui.text.style.f.f21314f;
        }
        int i12 = i6;
        if (hyphens != null) {
            i7 = hyphens.getValue();
        } else {
            androidx.compose.ui.text.style.e.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.e.f21308e;
        }
        return new y(i10, i11, lineHeight, textIndent, platformStyle, lineHeightStyle, i12, i7, this.textMotion);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return androidx.compose.ui.text.style.j.k(this.textAlign, yVar.textAlign) && androidx.compose.ui.text.style.l.j(this.textDirection, yVar.textDirection) && androidx.compose.ui.unit.z.j(this.lineHeight, yVar.lineHeight) && kotlin.jvm.internal.l0.g(this.textIndent, yVar.textIndent) && kotlin.jvm.internal.l0.g(this.platformStyle, yVar.platformStyle) && kotlin.jvm.internal.l0.g(this.lineHeightStyle, yVar.lineHeightStyle) && androidx.compose.ui.text.style.f.k(this.lineBreak, yVar.lineBreak) && androidx.compose.ui.text.style.e.g(this.hyphens, yVar.hyphens) && kotlin.jvm.internal.l0.g(this.textMotion, yVar.textMotion);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    public final y g(androidx.compose.ui.text.style.j textAlign, androidx.compose.ui.text.style.l textDirection, long lineHeight, androidx.compose.ui.text.style.q textIndent, c0 platformStyle, androidx.compose.ui.text.style.h lineHeightStyle) {
        int i4;
        int i5;
        if (textAlign != null) {
            i4 = textAlign.getValue();
        } else {
            androidx.compose.ui.text.style.j.INSTANCE.getClass();
            i4 = androidx.compose.ui.text.style.j.f21360i;
        }
        int i6 = i4;
        if (textDirection != null) {
            i5 = textDirection.getValue();
        } else {
            androidx.compose.ui.text.style.l.INSTANCE.getClass();
            i5 = androidx.compose.ui.text.style.l.f21374h;
        }
        return new y(i6, i5, lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion);
    }

    public int hashCode() {
        int o4 = (androidx.compose.ui.unit.z.o(this.lineHeight) + ((androidx.compose.ui.text.style.l.k(this.textDirection) + (androidx.compose.ui.text.style.j.l(this.textAlign) * 31)) * 31)) * 31;
        androidx.compose.ui.text.style.q qVar = this.textIndent;
        int hashCode = (o4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        c0 c0Var = this.platformStyle;
        int hashCode2 = (hashCode + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        androidx.compose.ui.text.style.h hVar = this.lineHeightStyle;
        int h4 = (androidx.compose.ui.text.style.e.h(this.hyphens) + ((androidx.compose.ui.text.style.f.o(this.lineBreak) + ((hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31;
        androidx.compose.ui.text.style.s sVar = this.textMotion;
        return h4 + (sVar != null ? sVar.hashCode() : 0);
    }

    @fg.l
    public final y i(int textAlign, int textDirection, long lineHeight, @fg.m androidx.compose.ui.text.style.q textIndent, @fg.m c0 platformStyle, @fg.m androidx.compose.ui.text.style.h lineHeightStyle, int lineBreak, int hyphens, @fg.m androidx.compose.ui.text.style.s textMotion) {
        return new y(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @fg.m
    @kd.i(name = "getHyphens-EaSxIns")
    public final androidx.compose.ui.text.style.e k() {
        return androidx.compose.ui.text.style.e.d(this.hyphens);
    }

    /* renamed from: m, reason: from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    @fg.m
    @kd.i(name = "getLineBreak-LgCVezo")
    public final androidx.compose.ui.text.style.f n() {
        return androidx.compose.ui.text.style.f.e(this.lineBreak);
    }

    /* renamed from: p, reason: from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* renamed from: q, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final androidx.compose.ui.text.style.h getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final c0 getPlatformStyle() {
        return this.platformStyle;
    }

    @fg.m
    @kd.i(name = "getTextAlign-buA522U")
    public final androidx.compose.ui.text.style.j t() {
        return androidx.compose.ui.text.style.j.h(this.textAlign);
    }

    @fg.l
    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) androidx.compose.ui.text.style.j.m(this.textAlign)) + ", textDirection=" + ((Object) androidx.compose.ui.text.style.l.l(this.textDirection)) + ", lineHeight=" + ((Object) androidx.compose.ui.unit.z.u(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) androidx.compose.ui.text.style.f.p(this.lineBreak)) + ", hyphens=" + ((Object) androidx.compose.ui.text.style.e.i(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    /* renamed from: v, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    @fg.m
    @kd.i(name = "getTextDirection-mmuk1to")
    public final androidx.compose.ui.text.style.l w() {
        return androidx.compose.ui.text.style.l.g(this.textDirection);
    }

    /* renamed from: y, reason: from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    @fg.m
    /* renamed from: z, reason: from getter */
    public final androidx.compose.ui.text.style.q getTextIndent() {
        return this.textIndent;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ y(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, androidx.compose.ui.text.style.s sVar, kotlin.jvm.internal.w wVar) {
        this(jVar, lVar, j4, qVar, c0Var, hVar, fVar, eVar, sVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ y(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, androidx.compose.ui.text.style.f fVar, androidx.compose.ui.text.style.e eVar, kotlin.jvm.internal.w wVar) {
        this(jVar, lVar, j4, qVar, c0Var, hVar, fVar, eVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ y(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, kotlin.jvm.internal.w wVar) {
        this(jVar, lVar, j4, qVar, c0Var, hVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ y(androidx.compose.ui.text.style.j jVar, androidx.compose.ui.text.style.l lVar, long j4, androidx.compose.ui.text.style.q qVar, kotlin.jvm.internal.w wVar) {
        this(jVar, lVar, j4, qVar);
    }

    private y(int i4, int i5, long j4, androidx.compose.ui.text.style.q qVar, c0 c0Var, androidx.compose.ui.text.style.h hVar, int i6, int i7, androidx.compose.ui.text.style.s sVar) {
        this.textAlign = i4;
        this.textDirection = i5;
        this.lineHeight = j4;
        this.textIndent = qVar;
        this.platformStyle = c0Var;
        this.lineHeightStyle = hVar;
        this.lineBreak = i6;
        this.hyphens = i7;
        this.textMotion = sVar;
        androidx.compose.ui.unit.z.INSTANCE.getClass();
        if (androidx.compose.ui.unit.z.j(j4, androidx.compose.ui.unit.z.f21534d) || androidx.compose.ui.unit.z.n(j4) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + androidx.compose.ui.unit.z.n(j4) + ')').toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(int r12, int r13, long r14, androidx.compose.ui.text.style.q r16, androidx.compose.ui.text.c0 r17, androidx.compose.ui.text.style.h r18, int r19, int r20, androidx.compose.ui.text.style.s r21, int r22, kotlin.jvm.internal.w r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L10
            androidx.compose.ui.text.style.j$a r1 = androidx.compose.ui.text.style.j.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.j.g()
            goto L11
        L10:
            r1 = r12
        L11:
            r2 = r0 & 2
            if (r2 == 0) goto L1f
            androidx.compose.ui.text.style.l$a r2 = androidx.compose.ui.text.style.l.INSTANCE
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.l.f()
            goto L20
        L1f:
            r2 = r13
        L20:
            r3 = r0 & 4
            if (r3 == 0) goto L2e
            androidx.compose.ui.unit.z$a r3 = androidx.compose.ui.unit.z.INSTANCE
            r3.getClass()
            long r3 = androidx.compose.ui.unit.z.b()
            goto L2f
        L2e:
            r3 = r14
        L2f:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L36
            r5 = r6
            goto L38
        L36:
            r5 = r16
        L38:
            r7 = r0 & 16
            if (r7 == 0) goto L3e
            r7 = r6
            goto L40
        L3e:
            r7 = r17
        L40:
            r8 = r0 & 32
            if (r8 == 0) goto L46
            r8 = r6
            goto L48
        L46:
            r8 = r18
        L48:
            r9 = r0 & 64
            if (r9 == 0) goto L56
            androidx.compose.ui.text.style.f$a r9 = androidx.compose.ui.text.style.f.INSTANCE
            r9.getClass()
            int r9 = androidx.compose.ui.text.style.f.d()
            goto L58
        L56:
            r9 = r19
        L58:
            r10 = r0 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L66
            androidx.compose.ui.text.style.e$a r10 = androidx.compose.ui.text.style.e.INSTANCE
            r10.getClass()
            int r10 = androidx.compose.ui.text.style.e.c()
            goto L68
        L66:
            r10 = r20
        L68:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L6d
            goto L6f
        L6d:
            r6 = r21
        L6f:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r6
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(int, int, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, int, int, androidx.compose.ui.text.style.s, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(androidx.compose.ui.text.style.j r12, androidx.compose.ui.text.style.l r13, long r14, androidx.compose.ui.text.style.q r16, androidx.compose.ui.text.c0 r17, androidx.compose.ui.text.style.h r18, androidx.compose.ui.text.style.f r19, androidx.compose.ui.text.style.e r20, androidx.compose.ui.text.style.s r21, int r22, kotlin.jvm.internal.w r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            if (r4 == 0) goto L1f
            androidx.compose.ui.unit.z$a r4 = androidx.compose.ui.unit.z.INSTANCE
            r4.getClass()
            long r4 = androidx.compose.ui.unit.z.b()
            goto L20
        L1f:
            r4 = r14
        L20:
            r6 = r0 & 8
            if (r6 == 0) goto L26
            r6 = r2
            goto L28
        L26:
            r6 = r16
        L28:
            r7 = r0 & 16
            if (r7 == 0) goto L2e
            r7 = r2
            goto L30
        L2e:
            r7 = r17
        L30:
            r8 = r0 & 32
            if (r8 == 0) goto L36
            r8 = r2
            goto L38
        L36:
            r8 = r18
        L38:
            r9 = r0 & 64
            if (r9 == 0) goto L3e
            r9 = r2
            goto L40
        L3e:
            r9 = r19
        L40:
            r10 = r0 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L46
            r10 = r2
            goto L48
        L46:
            r10 = r20
        L48:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4d
            goto L4f
        L4d:
            r2 = r21
        L4f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.s, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private y(androidx.compose.ui.text.style.j r13, androidx.compose.ui.text.style.l r14, long r15, androidx.compose.ui.text.style.q r17, androidx.compose.ui.text.c0 r18, androidx.compose.ui.text.style.h r19, androidx.compose.ui.text.style.f r20, androidx.compose.ui.text.style.e r21, androidx.compose.ui.text.style.s r22) {
        /*
            r12 = this;
            if (r13 == 0) goto L8
            int r0 = r13.getValue()
        L6:
            r2 = r0
            goto L12
        L8:
            androidx.compose.ui.text.style.j$a r0 = androidx.compose.ui.text.style.j.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.j.g()
            goto L6
        L12:
            if (r14 == 0) goto L1a
            int r0 = r14.getValue()
        L18:
            r3 = r0
            goto L24
        L1a:
            androidx.compose.ui.text.style.l$a r0 = androidx.compose.ui.text.style.l.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.l.f()
            goto L18
        L24:
            if (r20 == 0) goto L2c
            int r0 = r20.getMask()
        L2a:
            r9 = r0
            goto L36
        L2c:
            androidx.compose.ui.text.style.f$a r0 = androidx.compose.ui.text.style.f.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.f.d()
            goto L2a
        L36:
            if (r21 == 0) goto L3e
            int r0 = r21.getValue()
        L3c:
            r10 = r0
            goto L48
        L3e:
            androidx.compose.ui.text.style.e$a r0 = androidx.compose.ui.text.style.e.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.e.c()
            goto L3c
        L48:
            r1 = r12
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r11 = r22
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.s):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(androidx.compose.ui.text.style.j r5, androidx.compose.ui.text.style.l r6, long r7, androidx.compose.ui.text.style.q r9, int r10, kotlin.jvm.internal.w r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L7
            r11 = r0
            goto L8
        L7:
            r11 = r5
        L8:
            r5 = r10 & 2
            if (r5 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r6
        Lf:
            r5 = r10 & 4
            if (r5 == 0) goto L1c
            androidx.compose.ui.unit.z$a r5 = androidx.compose.ui.unit.z.INSTANCE
            r5.getClass()
            long r7 = androidx.compose.ui.unit.z.b()
        L1c:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L23
            r10 = r0
            goto L24
        L23:
            r10 = r9
        L24:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r5.<init>(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private y(androidx.compose.ui.text.style.j r13, androidx.compose.ui.text.style.l r14, long r15, androidx.compose.ui.text.style.q r17) {
        /*
            r12 = this;
            if (r13 == 0) goto L8
            int r0 = r13.getValue()
        L6:
            r2 = r0
            goto L12
        L8:
            androidx.compose.ui.text.style.j$a r0 = androidx.compose.ui.text.style.j.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.j.g()
            goto L6
        L12:
            if (r14 == 0) goto L1a
            int r0 = r14.getValue()
        L18:
            r3 = r0
            goto L24
        L1a:
            androidx.compose.ui.text.style.l$a r0 = androidx.compose.ui.text.style.l.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.l.f()
            goto L18
        L24:
            androidx.compose.ui.text.style.f$a r0 = androidx.compose.ui.text.style.f.INSTANCE
            r0.getClass()
            int r9 = androidx.compose.ui.text.style.f.d()
            androidx.compose.ui.text.style.e$a r0 = androidx.compose.ui.text.style.e.INSTANCE
            r0.getClass()
            int r10 = androidx.compose.ui.text.style.e.c()
            r7 = 0
            r8 = 0
            r11 = 0
            r1 = r12
            r4 = r15
            r6 = r17
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(androidx.compose.ui.text.style.j r7, androidx.compose.ui.text.style.l r8, long r9, androidx.compose.ui.text.style.q r11, androidx.compose.ui.text.c0 r12, androidx.compose.ui.text.style.h r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L7
            r15 = r0
            goto L8
        L7:
            r15 = r7
        L8:
            r7 = r14 & 2
            if (r7 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = r8
        Lf:
            r7 = r14 & 4
            if (r7 == 0) goto L1c
            androidx.compose.ui.unit.z$a r7 = androidx.compose.ui.unit.z.INSTANCE
            r7.getClass()
            long r9 = androidx.compose.ui.unit.z.b()
        L1c:
            r2 = r9
            r7 = r14 & 8
            if (r7 == 0) goto L23
            r4 = r0
            goto L24
        L23:
            r4 = r11
        L24:
            r7 = r14 & 16
            if (r7 == 0) goto L2a
            r5 = r0
            goto L2b
        L2a:
            r5 = r12
        L2b:
            r7 = r14 & 32
            if (r7 == 0) goto L31
            r14 = r0
            goto L32
        L31:
            r14 = r13
        L32:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private y(androidx.compose.ui.text.style.j r13, androidx.compose.ui.text.style.l r14, long r15, androidx.compose.ui.text.style.q r17, androidx.compose.ui.text.c0 r18, androidx.compose.ui.text.style.h r19) {
        /*
            r12 = this;
            if (r13 == 0) goto L8
            int r0 = r13.getValue()
        L6:
            r2 = r0
            goto L12
        L8:
            androidx.compose.ui.text.style.j$a r0 = androidx.compose.ui.text.style.j.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.j.g()
            goto L6
        L12:
            if (r14 == 0) goto L1a
            int r0 = r14.getValue()
        L18:
            r3 = r0
            goto L24
        L1a:
            androidx.compose.ui.text.style.l$a r0 = androidx.compose.ui.text.style.l.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.l.f()
            goto L18
        L24:
            androidx.compose.ui.text.style.f$a r0 = androidx.compose.ui.text.style.f.INSTANCE
            r0.getClass()
            int r9 = androidx.compose.ui.text.style.f.d()
            androidx.compose.ui.text.style.e$a r0 = androidx.compose.ui.text.style.e.INSTANCE
            r0.getClass()
            int r10 = androidx.compose.ui.text.style.e.c()
            r11 = 0
            r1 = r12
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(androidx.compose.ui.text.style.j r11, androidx.compose.ui.text.style.l r12, long r13, androidx.compose.ui.text.style.q r15, androidx.compose.ui.text.c0 r16, androidx.compose.ui.text.style.h r17, androidx.compose.ui.text.style.f r18, androidx.compose.ui.text.style.e r19, int r20, kotlin.jvm.internal.w r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r11
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r12
        L11:
            r4 = r0 & 4
            if (r4 == 0) goto L1f
            androidx.compose.ui.unit.z$a r4 = androidx.compose.ui.unit.z.INSTANCE
            r4.getClass()
            long r4 = androidx.compose.ui.unit.z.b()
            goto L20
        L1f:
            r4 = r13
        L20:
            r6 = r0 & 8
            if (r6 == 0) goto L26
            r6 = r2
            goto L27
        L26:
            r6 = r15
        L27:
            r7 = r0 & 16
            if (r7 == 0) goto L2d
            r7 = r2
            goto L2f
        L2d:
            r7 = r16
        L2f:
            r8 = r0 & 32
            if (r8 == 0) goto L35
            r8 = r2
            goto L37
        L35:
            r8 = r17
        L37:
            r9 = r0 & 64
            if (r9 == 0) goto L3d
            r9 = r2
            goto L3f
        L3d:
            r9 = r18
        L3f:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L44
            goto L46
        L44:
            r2 = r19
        L46:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private y(androidx.compose.ui.text.style.j r13, androidx.compose.ui.text.style.l r14, long r15, androidx.compose.ui.text.style.q r17, androidx.compose.ui.text.c0 r18, androidx.compose.ui.text.style.h r19, androidx.compose.ui.text.style.f r20, androidx.compose.ui.text.style.e r21) {
        /*
            r12 = this;
            if (r13 == 0) goto L8
            int r0 = r13.getValue()
        L6:
            r2 = r0
            goto L12
        L8:
            androidx.compose.ui.text.style.j$a r0 = androidx.compose.ui.text.style.j.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.j.g()
            goto L6
        L12:
            if (r14 == 0) goto L1a
            int r0 = r14.getValue()
        L18:
            r3 = r0
            goto L24
        L1a:
            androidx.compose.ui.text.style.l$a r0 = androidx.compose.ui.text.style.l.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.l.f()
            goto L18
        L24:
            if (r20 == 0) goto L2c
            int r0 = r20.getMask()
        L2a:
            r9 = r0
            goto L36
        L2c:
            androidx.compose.ui.text.style.f$a r0 = androidx.compose.ui.text.style.f.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.f.d()
            goto L2a
        L36:
            if (r21 == 0) goto L3e
            int r0 = r21.getValue()
        L3c:
            r10 = r0
            goto L48
        L3e:
            androidx.compose.ui.text.style.e$a r0 = androidx.compose.ui.text.style.e.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.e.c()
            goto L3c
        L48:
            r11 = 0
            r1 = r12
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.y.<init>(androidx.compose.ui.text.style.j, androidx.compose.ui.text.style.l, long, androidx.compose.ui.text.style.q, androidx.compose.ui.text.c0, androidx.compose.ui.text.style.h, androidx.compose.ui.text.style.f, androidx.compose.ui.text.style.e):void");
    }
}
