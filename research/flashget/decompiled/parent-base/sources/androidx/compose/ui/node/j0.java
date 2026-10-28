package androidx.compose.ui.node;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.h5;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LayoutNodeDrawScope.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJq\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJY\u0010\"\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JY\u0010$\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%JO\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)Jm\u00100\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020*2\b\b\u0002\u0010/\u001a\u00020,2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101Jw\u00104\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020*2\b\b\u0002\u0010/\u001a\u00020,2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u00103\u001a\u000202H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105Jk\u0010=\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jk\u0010?\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@JY\u0010A\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJY\u0010C\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJM\u0010G\u001a\u00020\u00192\u0006\u0010F\u001a\u00020E2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJM\u0010I\u001a\u00020\u00192\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJq\u0010O\u001a\u00020\u00192\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0K2\u0006\u0010N\u001a\u00020M2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJq\u0010Q\u001a\u00020\u00192\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0K2\u0006\u0010N\u001a\u00020M2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u0002092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJY\u0010S\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010BJY\u0010T\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010DJc\u0010W\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010V\u001a\u00020U2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010XJc\u0010Y\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010V\u001a\u00020U2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\\*\u00020[H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\\*\u00020_H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020[*\u00020_H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ\u001a\u0010d\u001a\u00020[*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u001a\u0010f\u001a\u00020[*\u00020\\H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020h*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\t*\u00020[H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010eJ\u0017\u0010l\u001a\u00020\t*\u00020_H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010cJ\u0014\u0010o\u001a\u00020n*\u00020mH\u0097\u0001¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u0010*\u00020hH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010jJ\u0017\u0010r\u001a\u00020_*\u00020[H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010sJ\u001a\u0010t\u001a\u00020_*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bt\u0010sJ\u001a\u0010u\u001a\u00020_*\u00020\\H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0019H\u0016¢\u0006\u0004\bw\u0010xJ\u0019\u0010|\u001a\u00020\u0019*\u00020y2\u0006\u0010{\u001a\u00020z¢\u0006\u0004\b|\u0010}J7\u0010\u0082\u0001\u001a\u00020\u00192\u0006\u0010{\u001a\u00020z2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020~2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J6\u0010\u0084\u0001\u001a\u00020\u00192\u0006\u0010{\u001a\u00020z2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u0081\u0001\u001a\u00020yH\u0000ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010!\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u008c\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u008b\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0099\u0001"}, d2 = {"Landroidx/compose/ui/node/j0;", "Landroidx/compose/ui/graphics/drawscope/f;", "Landroidx/compose/ui/graphics/drawscope/c;", "Landroidx/compose/ui/graphics/drawscope/a;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/a;)V", "Landroidx/compose/ui/graphics/t1;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Li0/f;", "topLeft", "Li0/n;", "size", "alpha", "Landroidx/compose/ui/graphics/drawscope/i;", "style", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Lkotlin/k2;", "Q3", "(Landroidx/compose/ui/graphics/t1;FFZJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/d2;", "color", "G4", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "radius", "center", "a6", "(Landroidx/compose/ui/graphics/t1;FJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "n4", "(JFJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/s4;", "image", "y3", "(Landroidx/compose/ui/graphics/s4;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "dstOffset", "dstSize", "r3", "(Landroidx/compose/ui/graphics/s4;JJJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/m4;", "filterQuality", "c6", "(Landroidx/compose/ui/graphics/s4;JJJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;II)V", "start", "end", "strokeWidth", "Landroidx/compose/ui/graphics/i6;", "cap", "Landroidx/compose/ui/graphics/h5;", "pathEffect", "I5", "(Landroidx/compose/ui/graphics/t1;JJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "P3", "(JJJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "r5", "(Landroidx/compose/ui/graphics/t1;JJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "w4", "(JJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/graphics/g5;", "path", "G1", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/t1;FLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "R3", "(Landroidx/compose/ui/graphics/g5;JFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "", "points", "Landroidx/compose/ui/graphics/n5;", "pointMode", "l1", "(Ljava/util/List;ILandroidx/compose/ui/graphics/t1;FILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "y5", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/h5;FLandroidx/compose/ui/graphics/e2;I)V", "K3", "T3", "Li0/a;", "cornerRadius", "f5", "(Landroidx/compose/ui/graphics/t1;JJJFLandroidx/compose/ui/graphics/drawscope/i;Landroidx/compose/ui/graphics/e2;I)V", "G2", "(JJJJLandroidx/compose/ui/graphics/drawscope/i;FLandroidx/compose/ui/graphics/e2;I)V", "Landroidx/compose/ui/unit/h;", "", "q2", "(F)I", "Landroidx/compose/ui/unit/z;", "J5", "(J)I", "i", "(J)F", "S", "(F)F", "R", "(I)F", "Landroidx/compose/ui/unit/l;", "n", "(J)J", "v5", "J2", "Landroidx/compose/ui/unit/k;", "Li0/i;", "c5", "(Landroidx/compose/ui/unit/k;)Li0/i;", "d0", "h", "(F)J", "w", "u", "(I)J", "G6", "()V", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/graphics/v1;", "canvas", "l", "(Landroidx/compose/ui/node/q;Landroidx/compose/ui/graphics/v1;)V", "Landroidx/compose/ui/node/e1;", "coordinator", "Landroidx/compose/ui/q$d;", "drawNode", "a", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/node/e1;Landroidx/compose/ui/q$d;)V", "f", "(Landroidx/compose/ui/graphics/v1;JLandroidx/compose/ui/node/e1;Landroidx/compose/ui/node/q;)V", "b", "Landroidx/compose/ui/graphics/drawscope/a;", "c", "Landroidx/compose/ui/node/q;", "c0", "()J", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/d;", "E5", "()Landroidx/compose/ui/graphics/drawscope/d;", "drawContext", "U", "fontScale", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,128:1\n246#2:129\n74#3:130\n74#3:174\n74#3:175\n74#3:176\n385#4,6:131\n395#4,2:138\n397#4,8:143\n405#4,9:154\n414#4,8:166\n385#4,6:177\n395#4,2:184\n397#4,8:189\n405#4,9:200\n414#4,8:212\n261#5:137\n261#5:183\n234#6,3:140\n237#6,3:163\n234#6,3:186\n237#6,3:209\n1208#7:151\n1187#7,2:152\n1208#7:197\n1187#7,2:198\n542#8,17:220\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:129\n54#1:130\n61#1:174\n73#1:175\n85#1:176\n54#1:131,6\n54#1:138,2\n54#1:143,8\n54#1:154,9\n54#1:166,8\n85#1:177,6\n85#1:184,2\n85#1:189,8\n85#1:200,9\n85#1:212,8\n54#1:137\n85#1:183\n54#1:140,3\n54#1:163,3\n85#1:186,3\n85#1:209,3\n54#1:151\n54#1:152,2\n85#1:197\n85#1:198,2\n98#1:220,17\n*E\n"})
/* loaded from: classes.dex */
public final class j0 implements androidx.compose.ui.graphics.drawscope.f, androidx.compose.ui.graphics.drawscope.c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19339d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.drawscope.a canvasDrawScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private q drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public j0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @fg.l
    /* renamed from: E5 */
    public androidx.compose.ui.graphics.drawscope.d getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void G1(@fg.l g5 path, @fg.l androidx.compose.ui.graphics.t1 brush, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.G1(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void G2(long color, long topLeft, long size, long cornerRadius, @fg.l androidx.compose.ui.graphics.drawscope.i style, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.G2(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void G4(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.G4(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.graphics.drawscope.c
    public void G6() {
        l b5;
        androidx.compose.ui.graphics.v1 i4 = getDrawContext().i();
        q qVar = this.drawNode;
        kotlin.jvm.internal.l0.m(qVar);
        b5 = k0.b(qVar);
        if (b5 == 0) {
            e1 m4 = k.m(qVar, 4);
            if (m4.g3() == qVar.getNode()) {
                m4 = m4.getWrapped();
                kotlin.jvm.internal.l0.m(m4);
            }
            m4.x4(i4);
            return;
        }
        androidx.compose.runtime.collection.g gVar = null;
        while (b5 != 0) {
            if (b5 instanceof q) {
                l((q) b5, i4);
            } else if ((b5.getKindSet() & 4) != 0 && (b5 instanceof l)) {
                q.d delegate = b5.getDelegate();
                int i5 = 0;
                b5 = b5;
                while (delegate != null) {
                    if ((delegate.getKindSet() & 4) != 0) {
                        i5++;
                        if (i5 == 1) {
                            b5 = delegate;
                        } else {
                            if (gVar == null) {
                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                            }
                            if (b5 != 0) {
                                gVar.b(b5);
                                b5 = 0;
                            }
                            gVar.b(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    b5 = b5;
                }
                if (i5 == 1) {
                }
            }
            b5 = k.l(gVar);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void I5(@fg.l androidx.compose.ui.graphics.t1 brush, long start, long end, float strokeWidth, int cap, @fg.m h5 pathEffect, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.I5(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float J2(long j4) {
        return this.canvasDrawScope.J2(j4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int J5(long j4) {
        return this.canvasDrawScope.J5(j4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void K3(@fg.l androidx.compose.ui.graphics.t1 brush, long topLeft, long size, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.K3(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void P3(long color, long start, long end, float strokeWidth, int cap, @fg.m h5 pathEffect, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.P3(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void Q3(@fg.l androidx.compose.ui.graphics.t1 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.Q3(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float R(int i4) {
        return this.canvasDrawScope.R(i4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void R3(@fg.l g5 path, long color, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.R3(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float S(float f4) {
        return this.canvasDrawScope.S(f4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void T3(long color, long topLeft, long size, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.T3(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final void a(@fg.l androidx.compose.ui.graphics.v1 canvas, long size, @fg.l e1 coordinator, @fg.l q.d drawNode) {
        androidx.compose.runtime.collection.g gVar = null;
        while (drawNode != 0) {
            if (drawNode instanceof q) {
                f(canvas, size, coordinator, drawNode);
            } else if ((drawNode.getKindSet() & 4) != 0 && (drawNode instanceof l)) {
                q.d delegate = drawNode.getDelegate();
                int i4 = 0;
                drawNode = drawNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & 4) != 0) {
                        i4++;
                        if (i4 == 1) {
                            drawNode = delegate;
                        } else {
                            if (gVar == null) {
                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                            }
                            if (drawNode != 0) {
                                gVar.b(drawNode);
                                drawNode = 0;
                            }
                            gVar.b(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    drawNode = drawNode;
                }
                if (i4 == 1) {
                }
            }
            drawNode = k.l(gVar);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void a6(@fg.l androidx.compose.ui.graphics.t1 brush, float radius, long center, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.a6(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public long c0() {
        return this.canvasDrawScope.c0();
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    @fg.l
    public i0.i c5(@fg.l androidx.compose.ui.unit.k kVar) {
        return this.canvasDrawScope.c5(kVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void c6(@fg.l s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.c6(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long d0(long j4) {
        return this.canvasDrawScope.d0(j4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public long e() {
        return this.canvasDrawScope.e();
    }

    public final void f(@fg.l androidx.compose.ui.graphics.v1 canvas, long size, @fg.l e1 coordinator, @fg.l q drawNode) {
        q qVar = this.drawNode;
        this.drawNode = drawNode;
        androidx.compose.ui.graphics.drawscope.a aVar = this.canvasDrawScope;
        androidx.compose.ui.unit.w layoutDirection = coordinator.getLayoutDirection();
        a.C0331a drawParams = aVar.getDrawParams();
        androidx.compose.ui.unit.d density = drawParams.getDensity();
        androidx.compose.ui.unit.w layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.v1 canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        a.C0331a drawParams2 = aVar.getDrawParams();
        drawParams2.l(coordinator);
        drawParams2.m(layoutDirection);
        drawParams2.k(canvas);
        drawParams2.n(size);
        canvas.C();
        drawNode.E(this);
        canvas.o();
        a.C0331a drawParams3 = aVar.getDrawParams();
        drawParams3.l(density);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas2);
        drawParams3.n(size2);
        this.drawNode = qVar;
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void f5(@fg.l androidx.compose.ui.graphics.t1 brush, long topLeft, long size, long cornerRadius, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.f5(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    public long h(float f4) {
        return this.canvasDrawScope.h(f4);
    }

    @Override // androidx.compose.ui.unit.n
    @x4
    public float i(long j4) {
        return this.canvasDrawScope.i(j4);
    }

    public final void l(@fg.l q qVar, @fg.l androidx.compose.ui.graphics.v1 v1Var) {
        e1 m4 = k.m(qVar, 4);
        m4.getLayoutNode().q0().f(v1Var, androidx.compose.ui.unit.v.f(m4.c()), m4, qVar);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void l1(@fg.l List<i0.f> points, int pointMode, @fg.l androidx.compose.ui.graphics.t1 brush, float strokeWidth, int cap, @fg.m h5 pathEffect, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.l1(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long n(long j4) {
        return this.canvasDrawScope.n(j4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void n4(long color, float radius, long center, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.n4(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public int q2(float f4) {
        return this.canvasDrawScope.q2(f4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.x0(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public /* synthetic */ void r3(s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, androidx.compose.ui.graphics.drawscope.i style, androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.r3(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void r5(@fg.l androidx.compose.ui.graphics.t1 brush, long topLeft, long size, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.r5(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long u(int i4) {
        return this.canvasDrawScope.u(i4);
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public float v5(float f4) {
        return this.canvasDrawScope.getDensity() * f4;
    }

    @Override // androidx.compose.ui.unit.d
    @x4
    public long w(float f4) {
        return this.canvasDrawScope.w(f4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void w4(long color, long topLeft, long size, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.w4(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void y3(@fg.l s4 image, long topLeft, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.l androidx.compose.ui.graphics.drawscope.i style, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.y3(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void y5(@fg.l List<i0.f> points, int pointMode, long color, float strokeWidth, int cap, @fg.m h5 pathEffect, @androidx.annotation.x(from = 0.0d, to = 1.0d) float alpha, @fg.m androidx.compose.ui.graphics.e2 colorFilter, int blendMode) {
        this.canvasDrawScope.y5(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    public j0(@fg.l androidx.compose.ui.graphics.drawscope.a aVar) {
        this.canvasDrawScope = aVar;
    }

    public /* synthetic */ j0(androidx.compose.ui.graphics.drawscope.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
