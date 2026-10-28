package androidx.compose.ui.text;

import androidx.compose.foundation.f2;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;

/* compiled from: SpanStyle.kt */
@m1
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b:\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B©\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010$Bµ\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b!\u0010%BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010&BË\u0001\b\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010+J\u001b\u0010-\u001a\u00020\u00002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b/\u0010.J²\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101J¾\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103JÈ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b4\u00105JÒ\u0001\u00106\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u0002082\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002082\u0006\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u0002082\u0006\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0004\b=\u0010<J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020>H\u0000¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b6\u0010Y\u001a\u0004\bZ\u0010CR\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b[\u0010H\u001a\u0004\b\\\u0010JR\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b_\u0010e\u001a\u0004\bf\u0010gR\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010H\u001a\u0004\ba\u0010JR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bW\u0010q\u001a\u0004\br\u0010sR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bZ\u0010t\u001a\u0004\bm\u0010uR\u0017\u0010#\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010JR\u0013\u0010(\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\bh\u0010vR\u0011\u0010*\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b]\u0010w\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006x"}, d2 = {"Landroidx/compose/ui/text/i0;", "", "Landroidx/compose/ui/text/style/n;", "textForegroundStyle", "Landroidx/compose/ui/unit/z;", "fontSize", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "Landroidx/compose/ui/text/font/y;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Landroidx/compose/ui/text/style/a;", "baselineShift", "Landroidx/compose/ui/text/style/o;", "textGeometricTransform", "Lu0/f;", "localeList", "Landroidx/compose/ui/graphics/d2;", "background", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Landroidx/compose/ui/graphics/c6;", "shadow", "Landroidx/compose/ui/text/d0;", "platformStyle", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "<init>", "(Landroidx/compose/ui/text/style/n;JLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Landroidx/compose/ui/graphics/drawscope/i;Lkotlin/jvm/internal/w;)V", "color", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Lkotlin/jvm/internal/w;)V", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Landroidx/compose/ui/graphics/drawscope/i;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Landroidx/compose/ui/graphics/drawscope/i;Lkotlin/jvm/internal/w;)V", "other", "E", "(Landroidx/compose/ui/text/i0;)Landroidx/compose/ui/text/i0;", "G", "e", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;)Landroidx/compose/ui/text/i0;", "a", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;)Landroidx/compose/ui/text/i0;", "c", "(JJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Landroidx/compose/ui/graphics/drawscope/i;)Landroidx/compose/ui/text/i0;", "g", "(Landroidx/compose/ui/graphics/t1;FJLandroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/l0;Landroidx/compose/ui/text/font/y;Ljava/lang/String;JLandroidx/compose/ui/text/style/a;Landroidx/compose/ui/text/style/o;Lu0/f;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/graphics/c6;Landroidx/compose/ui/text/d0;Landroidx/compose/ui/graphics/drawscope/i;)Landroidx/compose/ui/text/i0;", "", "equals", "(Ljava/lang/Object;)Z", "B", "(Landroidx/compose/ui/text/i0;)Z", "C", "", "hashCode", "()I", "D", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/style/n;", "z", "()Landroidx/compose/ui/text/style/n;", "b", "J", "q", "()J", "Landroidx/compose/ui/text/font/o0;", "t", "()Landroidx/compose/ui/text/font/o0;", "d", "Landroidx/compose/ui/text/font/k0;", "r", "()Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/l0;", "s", "()Landroidx/compose/ui/text/font/l0;", "f", "Landroidx/compose/ui/text/font/y;", "o", "()Landroidx/compose/ui/text/font/y;", "Ljava/lang/String;", "p", "h", "u", "i", "Landroidx/compose/ui/text/style/a;", "k", "()Landroidx/compose/ui/text/style/a;", "j", "Landroidx/compose/ui/text/style/o;", "A", "()Landroidx/compose/ui/text/style/o;", "Lu0/f;", "v", "()Lu0/f;", "l", "m", "Landroidx/compose/ui/text/style/k;", "y", "()Landroidx/compose/ui/text/style/k;", "n", "Landroidx/compose/ui/graphics/c6;", "x", "()Landroidx/compose/ui/graphics/c6;", "Landroidx/compose/ui/text/d0;", "w", "()Landroidx/compose/ui/text/d0;", "Landroidx/compose/ui/graphics/drawscope/i;", "()Landroidx/compose/ui/graphics/drawscope/i;", "()Landroidx/compose/ui/graphics/t1;", "()F", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f20964q = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.style.n textForegroundStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.font.o0 fontWeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.font.k0 fontStyle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.font.l0 fontSynthesis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.font.y fontFamily;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final String fontFeatureSettings;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.style.a baselineShift;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.style.o textGeometricTransform;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final u0.f localeList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long background;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.text.style.k background;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final c6 shadow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final d0 platformStyle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    @fg.m
    private final androidx.compose.ui.graphics.drawscope.i drawStyle;

    public /* synthetic */ i0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, d0Var, iVar);
    }

    public static /* synthetic */ i0 F(i0 i0Var, i0 i0Var2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i0Var2 = null;
        }
        return i0Var.E(i0Var2);
    }

    public static i0 b(i0 i0Var, long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, int i4, Object obj) {
        return i0Var.a((i4 & 1) != 0 ? i0Var.textForegroundStyle.getValue() : j4, (i4 & 2) != 0 ? i0Var.fontSize : j5, (i4 & 4) != 0 ? i0Var.fontWeight : o0Var, (i4 & 8) != 0 ? i0Var.fontStyle : k0Var, (i4 & 16) != 0 ? i0Var.fontSynthesis : l0Var, (i4 & 32) != 0 ? i0Var.fontFamily : yVar, (i4 & 64) != 0 ? i0Var.fontFeatureSettings : str, (i4 & 128) != 0 ? i0Var.letterSpacing : j6, (i4 & 256) != 0 ? i0Var.baselineShift : aVar, (i4 & 512) != 0 ? i0Var.textGeometricTransform : oVar, (i4 & 1024) != 0 ? i0Var.localeList : fVar, (i4 & 2048) != 0 ? i0Var.background : j7, (i4 & 4096) != 0 ? i0Var.background : kVar, (i4 & 8192) != 0 ? i0Var.shadow : c6Var, (i4 & 16384) != 0 ? i0Var.platformStyle : d0Var);
    }

    public static i0 d(i0 i0Var, long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, Object obj) {
        return i0Var.c((i4 & 1) != 0 ? i0Var.textForegroundStyle.getValue() : j4, (i4 & 2) != 0 ? i0Var.fontSize : j5, (i4 & 4) != 0 ? i0Var.fontWeight : o0Var, (i4 & 8) != 0 ? i0Var.fontStyle : k0Var, (i4 & 16) != 0 ? i0Var.fontSynthesis : l0Var, (i4 & 32) != 0 ? i0Var.fontFamily : yVar, (i4 & 64) != 0 ? i0Var.fontFeatureSettings : str, (i4 & 128) != 0 ? i0Var.letterSpacing : j6, (i4 & 256) != 0 ? i0Var.baselineShift : aVar, (i4 & 512) != 0 ? i0Var.textGeometricTransform : oVar, (i4 & 1024) != 0 ? i0Var.localeList : fVar, (i4 & 2048) != 0 ? i0Var.background : j7, (i4 & 4096) != 0 ? i0Var.background : kVar, (i4 & 8192) != 0 ? i0Var.shadow : c6Var, (i4 & 16384) != 0 ? i0Var.platformStyle : d0Var, (i4 & 32768) != 0 ? i0Var.drawStyle : iVar);
    }

    public static i0 f(i0 i0Var, long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, int i4, Object obj) {
        return i0Var.e((i4 & 1) != 0 ? i0Var.textForegroundStyle.getValue() : j4, (i4 & 2) != 0 ? i0Var.fontSize : j5, (i4 & 4) != 0 ? i0Var.fontWeight : o0Var, (i4 & 8) != 0 ? i0Var.fontStyle : k0Var, (i4 & 16) != 0 ? i0Var.fontSynthesis : l0Var, (i4 & 32) != 0 ? i0Var.fontFamily : yVar, (i4 & 64) != 0 ? i0Var.fontFeatureSettings : str, (i4 & 128) != 0 ? i0Var.letterSpacing : j6, (i4 & 256) != 0 ? i0Var.baselineShift : aVar, (i4 & 512) != 0 ? i0Var.textGeometricTransform : oVar, (i4 & 1024) != 0 ? i0Var.localeList : fVar, (i4 & 2048) != 0 ? i0Var.background : j7, (i4 & 4096) != 0 ? i0Var.background : kVar, (i4 & 8192) != 0 ? i0Var.shadow : c6Var);
    }

    public static i0 h(i0 i0Var, t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar, int i4, Object obj) {
        c6 c6Var2;
        d0 d0Var2;
        float g4 = (i4 & 2) != 0 ? i0Var.textForegroundStyle.g() : f4;
        long j7 = (i4 & 4) != 0 ? i0Var.fontSize : j4;
        androidx.compose.ui.text.font.o0 o0Var2 = (i4 & 8) != 0 ? i0Var.fontWeight : o0Var;
        androidx.compose.ui.text.font.k0 k0Var2 = (i4 & 16) != 0 ? i0Var.fontStyle : k0Var;
        androidx.compose.ui.text.font.l0 l0Var2 = (i4 & 32) != 0 ? i0Var.fontSynthesis : l0Var;
        androidx.compose.ui.text.font.y yVar2 = (i4 & 64) != 0 ? i0Var.fontFamily : yVar;
        String str2 = (i4 & 128) != 0 ? i0Var.fontFeatureSettings : str;
        long j10 = (i4 & 256) != 0 ? i0Var.letterSpacing : j5;
        androidx.compose.ui.text.style.a aVar2 = (i4 & 512) != 0 ? i0Var.baselineShift : aVar;
        androidx.compose.ui.text.style.o oVar2 = (i4 & 1024) != 0 ? i0Var.textGeometricTransform : oVar;
        u0.f fVar2 = (i4 & 2048) != 0 ? i0Var.localeList : fVar;
        long j11 = (i4 & 4096) != 0 ? i0Var.background : j6;
        androidx.compose.ui.text.style.k kVar2 = (i4 & 8192) != 0 ? i0Var.background : kVar;
        c6 c6Var3 = (i4 & 16384) != 0 ? i0Var.shadow : c6Var;
        if ((i4 & 32768) != 0) {
            c6Var2 = c6Var3;
            d0Var2 = i0Var.platformStyle;
        } else {
            c6Var2 = c6Var3;
            d0Var2 = d0Var;
        }
        return i0Var.g(t1Var, g4, j7, o0Var2, k0Var2, l0Var2, yVar2, str2, j10, aVar2, oVar2, fVar2, j11, kVar2, c6Var2, d0Var2, (i4 & 65536) != 0 ? i0Var.drawStyle : iVar);
    }

    @fg.m
    /* renamed from: A, reason: from getter */
    public final androidx.compose.ui.text.style.o getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean B(@fg.l i0 other) {
        if (this == other) {
            return true;
        }
        return androidx.compose.ui.unit.z.j(this.fontSize, other.fontSize) && kotlin.jvm.internal.l0.g(this.fontWeight, other.fontWeight) && kotlin.jvm.internal.l0.g(this.fontStyle, other.fontStyle) && kotlin.jvm.internal.l0.g(this.fontSynthesis, other.fontSynthesis) && kotlin.jvm.internal.l0.g(this.fontFamily, other.fontFamily) && kotlin.jvm.internal.l0.g(this.fontFeatureSettings, other.fontFeatureSettings) && androidx.compose.ui.unit.z.j(this.letterSpacing, other.letterSpacing) && kotlin.jvm.internal.l0.g(this.baselineShift, other.baselineShift) && kotlin.jvm.internal.l0.g(this.textGeometricTransform, other.textGeometricTransform) && kotlin.jvm.internal.l0.g(this.localeList, other.localeList) && d2.y(this.background, other.background) && kotlin.jvm.internal.l0.g(this.platformStyle, other.platformStyle);
    }

    public final boolean C(@fg.l i0 other) {
        return kotlin.jvm.internal.l0.g(this.textForegroundStyle, other.textForegroundStyle) && kotlin.jvm.internal.l0.g(this.background, other.background) && kotlin.jvm.internal.l0.g(this.shadow, other.shadow) && kotlin.jvm.internal.l0.g(this.drawStyle, other.drawStyle);
    }

    public final int D() {
        int o4 = androidx.compose.ui.unit.z.o(this.fontSize) * 31;
        androidx.compose.ui.text.font.o0 o0Var = this.fontWeight;
        int weight = (o4 + (o0Var != null ? o0Var.getWeight() : 0)) * 31;
        androidx.compose.ui.text.font.k0 k0Var = this.fontStyle;
        int hashCode = (weight + (k0Var != null ? Integer.hashCode(k0Var.j()) : 0)) * 31;
        androidx.compose.ui.text.font.l0 l0Var = this.fontSynthesis;
        int hashCode2 = (hashCode + (l0Var != null ? Integer.hashCode(l0Var.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.y yVar = this.fontFamily;
        int hashCode3 = (hashCode2 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int a5 = i0.k.a(this.letterSpacing, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.a aVar = this.baselineShift;
        int hashCode4 = (a5 + (aVar != null ? Float.hashCode(aVar.k()) : 0)) * 31;
        androidx.compose.ui.text.style.o oVar = this.textGeometricTransform;
        int hashCode5 = (hashCode4 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        u0.f fVar = this.localeList;
        int K = (d2.K(this.background) + ((hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31)) * 31;
        d0 d0Var = this.platformStyle;
        return K + (d0Var != null ? d0Var.hashCode() : 0);
    }

    @x4
    @fg.l
    public final i0 E(@fg.m i0 other) {
        return other == null ? this : j0.b(this, other.textForegroundStyle.getValue(), other.textForegroundStyle.d(), other.textForegroundStyle.g(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.background, other.shadow, other.platformStyle, other.drawStyle);
    }

    @x4
    @fg.l
    public final i0 G(@fg.l i0 other) {
        return E(other);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final i0 a(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow, d0 platformStyle) {
        return new i0(d2.y(color, this.textForegroundStyle.getValue()) ? this.textForegroundStyle : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (kotlin.jvm.internal.w) null);
    }

    @fg.l
    public final i0 c(long color, long fontSize, @fg.m androidx.compose.ui.text.font.o0 fontWeight, @fg.m androidx.compose.ui.text.font.k0 fontStyle, @fg.m androidx.compose.ui.text.font.l0 fontSynthesis, @fg.m androidx.compose.ui.text.font.y fontFamily, @fg.m String fontFeatureSettings, long letterSpacing, @fg.m androidx.compose.ui.text.style.a baselineShift, @fg.m androidx.compose.ui.text.style.o textGeometricTransform, @fg.m u0.f localeList, long background, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m c6 shadow, @fg.m d0 platformStyle, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle) {
        return new i0(d2.y(color, this.textForegroundStyle.getValue()) ? this.textForegroundStyle : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    public final i0 e(long color, long fontSize, androidx.compose.ui.text.font.o0 fontWeight, androidx.compose.ui.text.font.k0 fontStyle, androidx.compose.ui.text.font.l0 fontSynthesis, androidx.compose.ui.text.font.y fontFamily, String fontFeatureSettings, long letterSpacing, androidx.compose.ui.text.style.a baselineShift, androidx.compose.ui.text.style.o textGeometricTransform, u0.f localeList, long background, androidx.compose.ui.text.style.k textDecoration, c6 shadow) {
        return new i0(d2.y(color, this.textForegroundStyle.getValue()) ? this.textForegroundStyle : androidx.compose.ui.text.style.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.platformStyle, this.drawStyle);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) other;
        return B(i0Var) && C(i0Var);
    }

    @fg.l
    public final i0 g(@fg.m t1 brush, float alpha, long fontSize, @fg.m androidx.compose.ui.text.font.o0 fontWeight, @fg.m androidx.compose.ui.text.font.k0 fontStyle, @fg.m androidx.compose.ui.text.font.l0 fontSynthesis, @fg.m androidx.compose.ui.text.font.y fontFamily, @fg.m String fontFeatureSettings, long letterSpacing, @fg.m androidx.compose.ui.text.style.a baselineShift, @fg.m androidx.compose.ui.text.style.o textGeometricTransform, @fg.m u0.f localeList, long background, @fg.m androidx.compose.ui.text.style.k textDecoration, @fg.m c6 shadow, @fg.m d0 platformStyle, @fg.m androidx.compose.ui.graphics.drawscope.i drawStyle) {
        return new i0(androidx.compose.ui.text.style.n.INSTANCE.a(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle);
    }

    public int hashCode() {
        int K = d2.K(this.textForegroundStyle.getValue()) * 31;
        t1 d5 = this.textForegroundStyle.d();
        int o4 = (androidx.compose.ui.unit.z.o(this.fontSize) + ((Float.hashCode(this.textForegroundStyle.g()) + ((K + (d5 != null ? d5.hashCode() : 0)) * 31)) * 31)) * 31;
        androidx.compose.ui.text.font.o0 o0Var = this.fontWeight;
        int weight = (o4 + (o0Var != null ? o0Var.getWeight() : 0)) * 31;
        androidx.compose.ui.text.font.k0 k0Var = this.fontStyle;
        int hashCode = (weight + (k0Var != null ? Integer.hashCode(k0Var.j()) : 0)) * 31;
        androidx.compose.ui.text.font.l0 l0Var = this.fontSynthesis;
        int hashCode2 = (hashCode + (l0Var != null ? Integer.hashCode(l0Var.getValue()) : 0)) * 31;
        androidx.compose.ui.text.font.y yVar = this.fontFamily;
        int hashCode3 = (hashCode2 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int a5 = i0.k.a(this.letterSpacing, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.a aVar = this.baselineShift;
        int hashCode4 = (a5 + (aVar != null ? Float.hashCode(aVar.k()) : 0)) * 31;
        androidx.compose.ui.text.style.o oVar = this.textGeometricTransform;
        int hashCode5 = (hashCode4 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        u0.f fVar = this.localeList;
        int a6 = androidx.compose.material3.m0.a(this.background, (hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.k kVar = this.background;
        int hashCode6 = (a6 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        c6 c6Var = this.shadow;
        int hashCode7 = (hashCode6 + (c6Var != null ? c6Var.hashCode() : 0)) * 31;
        d0 d0Var = this.platformStyle;
        int hashCode8 = (hashCode7 + (d0Var != null ? d0Var.hashCode() : 0)) * 31;
        androidx.compose.ui.graphics.drawscope.i iVar = this.drawStyle;
        return hashCode8 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final float i() {
        return this.textForegroundStyle.g();
    }

    /* renamed from: j, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    @fg.m
    /* renamed from: k, reason: from getter */
    public final androidx.compose.ui.text.style.a getBaselineShift() {
        return this.baselineShift;
    }

    @fg.m
    public final t1 l() {
        return this.textForegroundStyle.d();
    }

    public final long m() {
        return this.textForegroundStyle.getValue();
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final androidx.compose.ui.graphics.drawscope.i getDrawStyle() {
        return this.drawStyle;
    }

    @fg.m
    /* renamed from: o, reason: from getter */
    public final androidx.compose.ui.text.font.y getFontFamily() {
        return this.fontFamily;
    }

    @fg.m
    /* renamed from: p, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: q, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final androidx.compose.ui.text.font.k0 getFontStyle() {
        return this.fontStyle;
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final androidx.compose.ui.text.font.l0 getFontSynthesis() {
        return this.fontSynthesis;
    }

    @fg.m
    /* renamed from: t, reason: from getter */
    public final androidx.compose.ui.text.font.o0 getFontWeight() {
        return this.fontWeight;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) d2.L(this.textForegroundStyle.getValue()));
        sb.append(", brush=");
        sb.append(this.textForegroundStyle.d());
        sb.append(", alpha=");
        sb.append(this.textForegroundStyle.g());
        sb.append(", fontSize=");
        sb.append((Object) androidx.compose.ui.unit.z.u(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) androidx.compose.ui.unit.z.u(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        f2.a(this.background, sb, ", textDecoration=");
        sb.append(this.background);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: u, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    @fg.m
    /* renamed from: v, reason: from getter */
    public final u0.f getLocaleList() {
        return this.localeList;
    }

    @fg.m
    /* renamed from: w, reason: from getter */
    public final d0 getPlatformStyle() {
        return this.platformStyle;
    }

    @fg.m
    /* renamed from: x, reason: from getter */
    public final c6 getShadow() {
        return this.shadow;
    }

    @fg.m
    /* renamed from: y, reason: from getter */
    public final androidx.compose.ui.text.style.k getBackground() {
        return this.background;
    }

    @fg.l
    /* renamed from: z, reason: from getter */
    public final androidx.compose.ui.text.style.n getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ i0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, d0Var);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ i0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, kotlin.jvm.internal.w wVar) {
        this(j4, j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var);
    }

    public /* synthetic */ i0(t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar, kotlin.jvm.internal.w wVar) {
        this(t1Var, f4, j4, o0Var, k0Var, l0Var, yVar, str, j5, aVar, oVar, fVar, j6, kVar, c6Var, d0Var, iVar);
    }

    public /* synthetic */ i0(androidx.compose.ui.text.style.n nVar, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar, kotlin.jvm.internal.w wVar) {
        this(nVar, j4, o0Var, k0Var, l0Var, yVar, str, j5, aVar, oVar, fVar, j6, kVar, c6Var, d0Var, iVar);
    }

    private i0(androidx.compose.ui.text.style.n nVar, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar) {
        this.textForegroundStyle = nVar;
        this.fontSize = j4;
        this.fontWeight = o0Var;
        this.fontStyle = k0Var;
        this.fontSynthesis = l0Var;
        this.fontFamily = yVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j5;
        this.baselineShift = aVar;
        this.textGeometricTransform = oVar;
        this.localeList = fVar;
        this.background = j6;
        this.background = kVar;
        this.shadow = c6Var;
        this.platformStyle = d0Var;
        this.drawStyle = iVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(androidx.compose.ui.text.style.n r19, long r20, androidx.compose.ui.text.font.o0 r22, androidx.compose.ui.text.font.k0 r23, androidx.compose.ui.text.font.l0 r24, androidx.compose.ui.text.font.y r25, java.lang.String r26, long r27, androidx.compose.ui.text.style.a r29, androidx.compose.ui.text.style.o r30, u0.f r31, long r32, androidx.compose.ui.text.style.k r34, androidx.compose.ui.graphics.c6 r35, androidx.compose.ui.text.d0 r36, androidx.compose.ui.graphics.drawscope.i r37, int r38, kotlin.jvm.internal.w r39) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.i0.<init>(androidx.compose.ui.text.style.n, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.d0, androidx.compose.ui.graphics.drawscope.i, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(long r19, long r21, androidx.compose.ui.text.font.o0 r23, androidx.compose.ui.text.font.k0 r24, androidx.compose.ui.text.font.l0 r25, androidx.compose.ui.text.font.y r26, java.lang.String r27, long r28, androidx.compose.ui.text.style.a r30, androidx.compose.ui.text.style.o r31, u0.f r32, long r33, androidx.compose.ui.text.style.k r35, androidx.compose.ui.graphics.c6 r36, int r37, kotlin.jvm.internal.w r38) {
        /*
            r18 = this;
            r0 = r37
            r1 = r0 & 1
            if (r1 == 0) goto L10
            androidx.compose.ui.graphics.d2$a r1 = androidx.compose.ui.graphics.d2.INSTANCE
            r1.getClass()
            long r1 = androidx.compose.ui.graphics.d2.k()
            goto L12
        L10:
            r1 = r19
        L12:
            r3 = r0 & 2
            if (r3 == 0) goto L20
            androidx.compose.ui.unit.z$a r3 = androidx.compose.ui.unit.z.INSTANCE
            r3.getClass()
            long r3 = androidx.compose.ui.unit.z.b()
            goto L22
        L20:
            r3 = r21
        L22:
            r5 = r0 & 4
            if (r5 == 0) goto L28
            r5 = 0
            goto L2a
        L28:
            r5 = r23
        L2a:
            r7 = r0 & 8
            if (r7 == 0) goto L30
            r7 = 0
            goto L32
        L30:
            r7 = r24
        L32:
            r8 = r0 & 16
            if (r8 == 0) goto L38
            r8 = 0
            goto L3a
        L38:
            r8 = r25
        L3a:
            r9 = r0 & 32
            if (r9 == 0) goto L40
            r9 = 0
            goto L42
        L40:
            r9 = r26
        L42:
            r10 = r0 & 64
            if (r10 == 0) goto L48
            r10 = 0
            goto L4a
        L48:
            r10 = r27
        L4a:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L58
            androidx.compose.ui.unit.z$a r11 = androidx.compose.ui.unit.z.INSTANCE
            r11.getClass()
            long r11 = androidx.compose.ui.unit.z.b()
            goto L5a
        L58:
            r11 = r28
        L5a:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L60
            r13 = 0
            goto L62
        L60:
            r13 = r30
        L62:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L68
            r14 = 0
            goto L6a
        L68:
            r14 = r31
        L6a:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L70
            r15 = 0
            goto L72
        L70:
            r15 = r32
        L72:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L80
            androidx.compose.ui.graphics.d2$a r6 = androidx.compose.ui.graphics.d2.INSTANCE
            r6.getClass()
            long r16 = androidx.compose.ui.graphics.d2.k()
            goto L82
        L80:
            r16 = r33
        L82:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L88
            r6 = 0
            goto L8a
        L88:
            r6 = r35
        L8a:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L90
            r0 = 0
            goto L92
        L90:
            r0 = r36
        L92:
            r19 = r18
            r20 = r1
            r22 = r3
            r24 = r5
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r16
            r36 = r6
            r37 = r0
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.i0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, int, kotlin.jvm.internal.w):void");
    }

    private i0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var) {
        this(androidx.compose.ui.text.style.n.INSTANCE.b(j4), j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, (d0) null, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (kotlin.jvm.internal.w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(long r19, long r21, androidx.compose.ui.text.font.o0 r23, androidx.compose.ui.text.font.k0 r24, androidx.compose.ui.text.font.l0 r25, androidx.compose.ui.text.font.y r26, java.lang.String r27, long r28, androidx.compose.ui.text.style.a r30, androidx.compose.ui.text.style.o r31, u0.f r32, long r33, androidx.compose.ui.text.style.k r35, androidx.compose.ui.graphics.c6 r36, androidx.compose.ui.text.d0 r37, int r38, kotlin.jvm.internal.w r39) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.i0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.d0, int, kotlin.jvm.internal.w):void");
    }

    private i0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var) {
        this(androidx.compose.ui.text.style.n.INSTANCE.b(j4), j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, d0Var, (androidx.compose.ui.graphics.drawscope.i) null, 32768, (kotlin.jvm.internal.w) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(long r21, long r23, androidx.compose.ui.text.font.o0 r25, androidx.compose.ui.text.font.k0 r26, androidx.compose.ui.text.font.l0 r27, androidx.compose.ui.text.font.y r28, java.lang.String r29, long r30, androidx.compose.ui.text.style.a r32, androidx.compose.ui.text.style.o r33, u0.f r34, long r35, androidx.compose.ui.text.style.k r37, androidx.compose.ui.graphics.c6 r38, androidx.compose.ui.text.d0 r39, androidx.compose.ui.graphics.drawscope.i r40, int r41, kotlin.jvm.internal.w r42) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.i0.<init>(long, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.d0, androidx.compose.ui.graphics.drawscope.i, int, kotlin.jvm.internal.w):void");
    }

    private i0(long j4, long j5, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j6, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j7, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar) {
        this(androidx.compose.ui.text.style.n.INSTANCE.b(j4), j5, o0Var, k0Var, l0Var, yVar, str, j6, aVar, oVar, fVar, j7, kVar, c6Var, d0Var, iVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(androidx.compose.ui.graphics.t1 r20, float r21, long r22, androidx.compose.ui.text.font.o0 r24, androidx.compose.ui.text.font.k0 r25, androidx.compose.ui.text.font.l0 r26, androidx.compose.ui.text.font.y r27, java.lang.String r28, long r29, androidx.compose.ui.text.style.a r31, androidx.compose.ui.text.style.o r32, u0.f r33, long r34, androidx.compose.ui.text.style.k r36, androidx.compose.ui.graphics.c6 r37, androidx.compose.ui.text.d0 r38, androidx.compose.ui.graphics.drawscope.i r39, int r40, kotlin.jvm.internal.w r41) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.i0.<init>(androidx.compose.ui.graphics.t1, float, long, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.l0, androidx.compose.ui.text.font.y, java.lang.String, long, androidx.compose.ui.text.style.a, androidx.compose.ui.text.style.o, u0.f, long, androidx.compose.ui.text.style.k, androidx.compose.ui.graphics.c6, androidx.compose.ui.text.d0, androidx.compose.ui.graphics.drawscope.i, int, kotlin.jvm.internal.w):void");
    }

    private i0(t1 t1Var, float f4, long j4, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.l0 l0Var, androidx.compose.ui.text.font.y yVar, String str, long j5, androidx.compose.ui.text.style.a aVar, androidx.compose.ui.text.style.o oVar, u0.f fVar, long j6, androidx.compose.ui.text.style.k kVar, c6 c6Var, d0 d0Var, androidx.compose.ui.graphics.drawscope.i iVar) {
        this(androidx.compose.ui.text.style.n.INSTANCE.a(t1Var, f4), j4, o0Var, k0Var, l0Var, yVar, str, j5, aVar, oVar, fVar, j6, kVar, c6Var, d0Var, iVar);
    }
}
