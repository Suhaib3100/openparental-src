package androidx.compose.ui.node;

import android.view.View;
import androidx.collection.r2;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.m0;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.platform.s5;
import androidx.compose.ui.q;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 è\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0007\u0087\u0001~\u0090\u0001\u0096\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u0010J$\u0010#\u001a\u00020\u000e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0!H\u0086\b¢\u0006\u0004\b#\u0010$J*\u0010&\u001a\u00020\u000e2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0%H\u0086\b¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\n\u0018\u00010(j\u0004\u0018\u0001`)H\u0017¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0000H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0004\b0\u0010\u0010J\u001f\u00102\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\n2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0000¢\u0006\u0004\b4\u0010\u0010J'\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0010J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000eH\u0000¢\u0006\u0004\b>\u0010\u0010J\u000f\u0010?\u001a\u00020\u0016H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0000¢\u0006\u0004\bA\u0010\u0010J\u000f\u0010B\u001a\u00020\u000eH\u0000¢\u0006\u0004\bB\u0010\u0010J\u001f\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0000¢\u0006\u0004\bD\u00103J\u000f\u0010E\u001a\u00020\u000eH\u0000¢\u0006\u0004\bE\u0010\u0010J\u000f\u0010F\u001a\u00020\u000eH\u0000¢\u0006\u0004\bF\u0010\u0010J\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010JJ6\u0010Q\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020\b2\b\b\u0002\u0010P\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ6\u0010T\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020K2\u0006\u0010S\u001a\u00020M2\b\b\u0002\u0010O\u001a\u00020\b2\b\b\u0002\u0010P\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\bT\u0010RJ\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u0000H\u0000¢\u0006\u0004\bV\u0010\u0014J#\u0010Y\u001a\u00020\u000e2\b\b\u0002\u0010W\u001a\u00020\b2\b\b\u0002\u0010X\u001a\u00020\bH\u0000¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u00020\u000e2\b\b\u0002\u0010W\u001a\u00020\b2\b\b\u0002\u0010X\u001a\u00020\bH\u0000¢\u0006\u0004\b[\u0010ZJ\u000f\u0010\\\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\\\u0010\u0010J\u001e\u0010^\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0]H\u0080\b¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020\u000e2\b\b\u0002\u0010W\u001a\u00020\bH\u0000¢\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001a\u00020\u000e2\b\b\u0002\u0010W\u001a\u00020\bH\u0000¢\u0006\u0004\bb\u0010aJ\u000f\u0010c\u001a\u00020\u000eH\u0000¢\u0006\u0004\bc\u0010\u0010J\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020e0dH\u0016¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u000eH\u0000¢\u0006\u0004\bh\u0010\u0010J\u001e\u0010k\u001a\u00020\b2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010iH\u0000ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ\u001e\u0010m\u001a\u00020\b2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010iH\u0000ø\u0001\u0000¢\u0006\u0004\bm\u0010lJ\u000f\u0010n\u001a\u00020\u000eH\u0000¢\u0006\u0004\bn\u0010\u0010J\u000f\u0010o\u001a\u00020\u000eH\u0000¢\u0006\u0004\bo\u0010\u0010J\u000f\u0010p\u001a\u00020\u000eH\u0000¢\u0006\u0004\bp\u0010\u0010J\u0017\u0010r\u001a\u00020\u000e2\b\b\u0002\u0010q\u001a\u00020\b¢\u0006\u0004\br\u0010aJ\u000f\u0010s\u001a\u00020\u000eH\u0000¢\u0006\u0004\bs\u0010\u0010J\u000f\u0010t\u001a\u00020\u000eH\u0016¢\u0006\u0004\bt\u0010\u0010J\u000f\u0010u\u001a\u00020\u000eH\u0016¢\u0006\u0004\bu\u0010\u0010J$\u0010w\u001a\u00020\u000e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u000e0!H\u0080\b¢\u0006\u0004\bw\u0010$J$\u0010y\u001a\u00020\u000e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020\u000e0!H\u0080\b¢\u0006\u0004\by\u0010$J\u000f\u0010z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bz\u0010\u0010J\u000f\u0010{\u001a\u00020\u000eH\u0000¢\u0006\u0004\b{\u0010\u0010J\u000f\u0010|\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010\u0010J\u000f\u0010}\u001a\u00020\u000eH\u0016¢\u0006\u0004\b}\u0010\u0010J\u000f\u0010~\u001a\u00020\u000eH\u0016¢\u0006\u0004\b~\u0010\u0010R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u0081\u0001\u0010z\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R8\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u0086\u0001\u001a\u00020\n8W@WX\u0097\u000e¢\u0006\u001e\n\u0005\b\u0087\u0001\u0010z\u0012\u0005\b\u008a\u0001\u0010\u0010\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001\"\u0006\b\u0089\u0001\u0010\u0085\u0001R&\u0010\u008e\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b~\u0010\u0080\u0001\u001a\u0005\b\u008c\u0001\u0010\u001e\"\u0005\b\u008d\u0001\u0010aR5\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0005\b\u0094\u0001\u0010\u0014R\u0018\u0010\u0097\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010zR\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0099\u0001R\"\u0010\u009d\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u009c\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0080\u0001R\u001a\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b}\u0010\u0091\u0001R-\u0010;\u001a\u0004\u0018\u00010:2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010:8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R3\u0010«\u0001\u001a\f\u0018\u00010¤\u0001j\u0005\u0018\u0001`¥\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R'\u0010\u0015\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b¬\u0001\u0010z\u001a\u0006\b\u00ad\u0001\u0010\u0083\u0001\"\u0006\b®\u0001\u0010\u0085\u0001R\u0018\u0010¯\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010\u0080\u0001R\u001b\u0010²\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010±\u0001R\u001e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u009c\u0001R\u0018\u0010µ\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010\u0080\u0001R2\u0010¼\u0001\u001a\u00030¶\u00012\b\u0010·\u0001\u001a\u00030¶\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\bu\u0010¸\u0001\u001a\u0005\bC\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R \u0010Á\u0001\u001a\u00030½\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R3\u0010Ç\u0001\u001a\u00030Â\u00012\b\u0010·\u0001\u001a\u00030Â\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0005\b\u007f\u0010Å\u0001\"\u0006\b\u0096\u0001\u0010Æ\u0001R4\u0010Ï\u0001\u001a\u00030È\u00012\b\u0010·\u0001\u001a\u00030È\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R4\u0010Õ\u0001\u001a\u00030Ð\u00012\b\u0010·\u0001\u001a\u00030Ð\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\b\u0087\u0001\u0010Ó\u0001\"\u0006\b³\u0001\u0010Ô\u0001R3\u0010Ü\u0001\u001a\u00030Ö\u00012\b\u0010·\u0001\u001a\u00030Ö\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\bC\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R)\u0010ã\u0001\u001a\u00030Ý\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R\u001a\u0010ä\u0001\u001a\u00030Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Þ\u0001R.\u0010è\u0001\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\bØ\u0001\u0010\u0080\u0001\u0012\u0005\bç\u0001\u0010\u0010\u001a\u0005\bå\u0001\u0010\u001e\"\u0005\bæ\u0001\u0010aR \u0010î\u0001\u001a\u00030é\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001R \u0010ô\u0001\u001a\u00030ï\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R,\u0010ü\u0001\u001a\u0005\u0018\u00010õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R\u001b\u0010ÿ\u0001\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R'\u0010\u0083\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0080\u0002\u0010\u0080\u0001\u001a\u0005\b\u0081\u0002\u0010\u001e\"\u0005\b\u0082\u0002\u0010aR4\u0010\u0089\u0002\u001a\u00030\u0084\u00022\b\u0010·\u0001\u001a\u00030\u0084\u00028\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0081\u0001\u0010\u0087\u0002\"\u0006\bÃ\u0001\u0010\u0088\u0002R5\u0010\u008e\u0002\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u000e\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b<\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0005\b\u008d\u0002\u0010$R5\u0010\u0091\u0002\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u000e\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bz\u0010\u008a\u0002\u001a\u0006\b\u008f\u0002\u0010\u008c\u0002\"\u0005\b\u0090\u0002\u0010$R&\u0010\u0094\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u001f\u0010\u0080\u0001\u001a\u0005\b\u0092\u0002\u0010\u001e\"\u0005\b\u0093\u0002\u0010aR(\u0010\u0095\u0002\u001a\u00020\b2\u0007\u0010\u0086\u0001\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\b\u0017\u0010\u0080\u0001\u001a\u0005\bÑ\u0001\u0010\u001eR%\u0010\u0099\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009b\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0098\u0002\u0010\u0010\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009a\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0019\u0010 \u0002\u001a\u0004\u0018\u00010x8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0016\u0010£\u0002\u001a\u0004\u0018\u00010\b8F¢\u0006\b\u001a\u0006\b¡\u0002\u0010¢\u0002R\u001c\u0010¥\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¤\u0002\u0010gR\u001d\u0010¨\u0002\u001a\t\u0012\u0005\u0012\u00030¦\u00020d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b§\u0002\u0010gR\u001d\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030¦\u00020d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b©\u0002\u0010gR\u001e\u0010¬\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009b\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010\u0097\u0002R\u001c\u0010®\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000d8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0002\u0010gR\u0019\u0010°\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010\u0093\u0001R\u0016\u0010±\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u001eR\u0018\u0010µ\u0002\u001a\u00030²\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010´\u0002R\u001f\u0010¹\u0002\u001a\n\u0018\u00010¶\u0002R\u00030ï\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010¸\u0002R\u001d\u0010½\u0002\u001a\b0º\u0002R\u00030ï\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u001a\u0010¿\u0002\u001a\u0005\u0018\u00010°\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010¾\u0002R\u0016\u0010Á\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0002\u0010\u001eR\u0016\u0010Ã\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0002\u0010\u001eR\u0017\u0010Å\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010\u0083\u0001R\u0017\u0010Ç\u0002\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010\u0083\u0001R\u0016\u0010É\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0002\u0010\u001eR\u0018\u0010Í\u0002\u001a\u00030Ê\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R\u0016\u0010Î\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u001eR\u0013\u0010Ð\u0002\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\bÏ\u0002\u0010\u001eR\u0017\u0010Ò\u0002\u001a\u00020\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÑ\u0002\u0010\u0083\u0001R\u0018\u0010Ô\u0002\u001a\u00030Ý\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÓ\u0002\u0010à\u0001R\u0018\u0010Ö\u0002\u001a\u00030Ý\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010à\u0001R\u0017\u0010Ø\u0002\u001a\u00020x8@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010\u009f\u0002R\u0017\u0010Ú\u0002\u001a\u00020x8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0002\u0010\u009f\u0002R\u0018\u0010Ý\u0002\u001a\u00030Û\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ü\u0002R\u0016\u0010ß\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÞ\u0002\u0010\u001eR\u0016\u0010á\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bà\u0002\u0010\u001eR\u0016\u0010ã\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bâ\u0002\u0010\u001eR\u0016\u0010å\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bä\u0002\u0010\u001eR\u0019\u0010ç\u0002\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010æ\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006é\u0002"}, d2 = {"Landroidx/compose/ui/node/h0;", "Landroidx/compose/runtime/r;", "Landroidx/compose/ui/layout/k1;", "Landroidx/compose/ui/node/q1;", "Landroidx/compose/ui/layout/z;", "Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/node/y;", "Landroidx/compose/ui/node/p1$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "Lkotlin/k2;", "n1", "()V", "X0", "child", "j1", "(Landroidx/compose/ui/node/h0;)V", "depth", "", "K", "(I)Ljava/lang/String;", "k1", "C1", "O0", "P0", "Q1", "()Z", "J", "R1", "Lkotlin/Function1;", "block", "P", "(Lld/l;)V", "Lkotlin/Function2;", "Q", "(Lld/p;)V", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "y", "()Landroid/view/View;", "index", "instance", "N0", "(ILandroidx/compose/ui/node/h0;)V", "l1", "count", "r1", "(II)V", "q1", "from", "to", "i1", "(III)V", "U0", "Landroidx/compose/ui/node/p1;", "owner", "H", "(Landroidx/compose/ui/node/p1;)V", "M", "toString", "()Ljava/lang/String;", "Q0", "T0", "x", "m1", "s1", "d1", "Landroidx/compose/ui/graphics/v1;", "canvas", "O", "(Landroidx/compose/ui/graphics/v1;)V", "Li0/f;", "pointerPosition", "Landroidx/compose/ui/node/t;", "hitTestResult", "isTouchEvent", "isInLayer", "I0", "(JLandroidx/compose/ui/node/t;ZZ)V", "hitSemanticsEntities", "K0", "it", "B1", "forceRequest", "scheduleMeasureAndLayout", "z1", "(ZZ)V", "v1", "S0", "Lkotlin/Function0;", "M0", "(Lld/a;)V", "x1", "(Z)V", "t1", "N", "", "Landroidx/compose/ui/layout/r0;", "o", "()Ljava/util/List;", "R0", "Landroidx/compose/ui/unit/b;", "constraints", "b1", "(Landroidx/compose/ui/unit/b;)Z", "o1", "e1", "h1", "f1", "isRootOfInvalidation", "V0", "g1", "p", "s", "Landroidx/compose/ui/node/d0;", "R", "Landroidx/compose/ui/node/e1;", "S", "I", "D1", "r", "k", "e", "b", "Z", "c", "m", "()I", "N1", "(I)V", "<set-?>", "d", "j", "i", "h", "compositeKeyHash", "a1", "P1", "isVirtualLookaheadRoot", "newRoot", "f", "Landroidx/compose/ui/node/h0;", "p0", "()Landroidx/compose/ui/node/h0;", "J1", "lookaheadRoot", "g", "virtualChildrenCount", "Landroidx/compose/ui/node/z0;", "Landroidx/compose/ui/node/z0;", "_foldedChildren", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "_foldedParent", "l", "Landroidx/compose/ui/node/p1;", "A0", "()Landroidx/compose/ui/node/p1;", "Landroidx/compose/ui/viewinterop/c;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/c;", "g0", "()Landroidx/compose/ui/viewinterop/c;", "H1", "(Landroidx/compose/ui/viewinterop/c;)V", "interopViewFactoryHolder", "n", "a0", "F1", "ignoreRemeasureRequests", "Landroidx/compose/ui/semantics/l;", "Landroidx/compose/ui/semantics/l;", "_collapsedSemantics", "q", "_zSortedChildren", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/m0;", "value", "Landroidx/compose/ui/layout/m0;", "()Landroidx/compose/ui/layout/m0;", "t", "(Landroidx/compose/ui/layout/m0;)V", "measurePolicy", "Landroidx/compose/ui/node/z;", "Landroidx/compose/ui/node/z;", "h0", "()Landroidx/compose/ui/node/z;", "intrinsicsPolicy", "Landroidx/compose/ui/unit/d;", "u", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/ui/unit/w;", "v", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "a", "(Landroidx/compose/ui/unit/w;)V", "layoutDirection", "Landroidx/compose/ui/platform/s5;", "w", "Landroidx/compose/ui/platform/s5;", "()Landroidx/compose/ui/platform/s5;", "(Landroidx/compose/ui/platform/s5;)V", "viewConfiguration", "Landroidx/compose/runtime/g0;", "Landroidx/compose/runtime/g0;", "A", "()Landroidx/compose/runtime/g0;", "z", "(Landroidx/compose/runtime/g0;)V", "compositionLocalMap", "Landroidx/compose/ui/node/h0$g;", "Landroidx/compose/ui/node/h0$g;", "i0", "()Landroidx/compose/ui/node/h0$g;", "I1", "(Landroidx/compose/ui/node/h0$g;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "U", "E1", "V", "canMultiMeasure", "Landroidx/compose/ui/node/c1;", "B", "Landroidx/compose/ui/node/c1;", "w0", "()Landroidx/compose/ui/node/c1;", "nodes", "Landroidx/compose/ui/node/m0;", "C", "Landroidx/compose/ui/node/m0;", "j0", "()Landroidx/compose/ui/node/m0;", "layoutDelegate", "Landroidx/compose/ui/layout/e0;", "D", "Landroidx/compose/ui/layout/e0;", "D0", "()Landroidx/compose/ui/layout/e0;", "O1", "(Landroidx/compose/ui/layout/e0;)V", "subcompositionsState", "E", "Landroidx/compose/ui/node/e1;", "_innerLayerCoordinator", "F", "f0", "G1", "innerLayerCoordinatorIsDirty", "Landroidx/compose/ui/q;", "G", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "(Landroidx/compose/ui/q;)V", "modifier", "Lld/l;", "x0", "()Lld/l;", "L1", "onAttach", "y0", "M1", "onDetach", "v0", "K1", "needsOnPositionedDispatch", "isDeactivated", "F0", "()Landroidx/compose/runtime/collection/g;", "G0", "zSortedChildren", "", "E0", "()F", "zIndex", "e0", "()Landroidx/compose/ui/node/e1;", "innerLayerCoordinator", "Z0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "b0", "foldedChildren", "Landroidx/compose/ui/layout/l0;", "X", "childMeasurables", "W", "childLookaheadMeasurables", "H0", "_children", "Y", "children", "B0", "parent", "isAttached", "Landroidx/compose/ui/node/h0$e;", "l0", "()Landroidx/compose/ui/node/h0$e;", "layoutState", "Landroidx/compose/ui/node/m0$a;", "o0", "()Landroidx/compose/ui/node/m0$a;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/m0$b;", "r0", "()Landroidx/compose/ui/node/m0$b;", "measurePassDelegate", "()Landroidx/compose/ui/semantics/l;", "collapsedSemantics", "G3", "isValidOwnerScope", "c0", "hasFixedInnerContentConstraints", "getWidth", "width", "getHeight", "height", "T", "alignmentLinesRequired", "Landroidx/compose/ui/node/j0;", "q0", "()Landroidx/compose/ui/node/j0;", "mDrawScope", "isPlaced", "Y0", "isPlacedByParent", "C0", "placeOrder", "t0", "measuredByParent", "u0", "measuredByParentInLookahead", "d0", "innerCoordinator", "z0", "outerCoordinator", "Landroidx/compose/ui/layout/u;", "()Landroidx/compose/ui/layout/u;", "coordinates", "s0", "measurePending", "k0", "layoutPending", "n0", "lookaheadMeasurePending", "m0", "lookaheadLayoutPending", "()Landroidx/compose/ui/layout/z;", "parentInfo", "L", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 13 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1477:1\n1247#1,7:1484\n1247#1,7:1556\n1072#1,2:1564\n1074#1,2:1578\n197#1:1581\n1235#1,7:1964\n197#1:2139\n197#1:2151\n197#1:2163\n1247#1,7:2175\n1208#2:1478\n1187#2,2:1479\n1208#2:1481\n1187#2,2:1482\n1208#2:1491\n1187#2,2:1492\n1208#2:1627\n1187#2,2:1628\n1208#2:1691\n1187#2,2:1692\n1208#2:1765\n1187#2,2:1766\n1208#2:1861\n1187#2,2:1862\n1208#2:1925\n1187#2,2:1926\n1208#2:2007\n1187#2,2:2008\n1208#2:2092\n1187#2,2:2093\n48#3:1494\n48#3:1529\n48#3:1544\n48#3:1566\n460#4,7:1495\n146#4:1502\n467#4,4:1503\n460#4,11:1507\n476#4,11:1518\n460#4,11:1530\n460#4,11:1545\n460#4,11:1567\n146#4:1580\n460#4,11:1582\n460#4,11:2046\n460#4,11:2140\n460#4,11:2152\n460#4,11:2164\n76#5:1541\n76#5:1543\n76#5:1563\n78#5:1593\n78#5:1656\n101#5:1730\n88#5:1804\n90#5,3:1805\n94#5:1809\n90#5:1814\n92#5,3:1816\n90#5:1822\n86#5:1889\n86#5:1909\n72#5:1971\n72#5:1991\n84#5:2057\n74#5:2126\n72#5:2127\n72#5:2131\n72#5:2133\n74#5:2134\n1#6:1542\n702#7,8:1594\n725#7,3:1602\n710#7,2:1605\n713#7,2:1650\n728#7,3:1652\n715#7:1655\n702#7,8:1657\n725#7,3:1665\n710#7,2:1668\n703#7:1670\n704#7,11:1714\n728#7,3:1725\n715#7:1728\n705#7:1729\n702#7,8:1731\n725#7,3:1739\n710#7,2:1742\n703#7:1744\n704#7,11:1788\n728#7,3:1799\n715#7:1802\n705#7:1803\n725#7,3:1811\n728#7,3:1819\n741#7,18:1823\n759#7,3:1884\n753#7:1887\n744#7:1888\n702#7,8:1890\n725#7,3:1898\n710#7,2:1901\n703#7:1903\n704#7,11:1948\n728#7,3:1959\n715#7:1962\n705#7:1963\n702#7,8:1972\n725#7,3:1980\n710#7,2:1983\n703#7:1985\n704#7,11:2030\n728#7,3:2041\n715#7:2044\n705#7:2045\n725#7,3:2128\n728#7,3:2136\n385#8,6:1607\n395#8,2:1614\n397#8,8:1619\n405#8,9:1630\n414#8,8:1642\n385#8,6:1671\n395#8,2:1678\n397#8,8:1683\n405#8,9:1694\n414#8,8:1706\n385#8,6:1745\n395#8,2:1752\n397#8,8:1757\n405#8,9:1768\n414#8,8:1780\n385#8,6:1841\n395#8,2:1848\n397#8,8:1853\n405#8,9:1864\n414#8,8:1876\n385#8,5:1904\n390#8:1910\n395#8,2:1912\n397#8,8:1917\n405#8,9:1928\n414#8,8:1940\n385#8,5:1986\n390#8:1992\n395#8,2:1994\n397#8,8:1999\n405#8,9:2010\n414#8,8:2022\n385#8,6:2072\n395#8,2:2079\n397#8,8:2084\n405#8,9:2095\n414#8,8:2107\n261#9:1613\n261#9:1677\n261#9:1751\n261#9:1815\n261#9:1847\n261#9:1911\n261#9:1993\n261#9:2078\n261#9:2132\n261#9:2135\n234#10,3:1616\n237#10,3:1639\n234#10,3:1680\n237#10,3:1703\n234#10,3:1754\n237#10,3:1777\n234#10,3:1850\n237#10,3:1873\n234#10,3:1914\n237#10,3:1937\n234#10,3:1996\n237#10,3:2019\n234#10,3:2081\n237#10,3:2104\n47#11:1808\n52#12:1810\n106#13:2058\n95#13,13:2059\n108#13:2115\n100#13,10:2116\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n114#1:1484,7\n490#1:1556,7\n524#1:1564,2\n524#1:1578,2\n593#1:1581\n1115#1:1964,7\n1283#1:2139\n1305#1:2151\n1317#1:2163\n1363#1:2175,7\n128#1:1478\n128#1:1479,2\n539#1:1481\n539#1:1482,2\n140#1:1491\n140#1:1492,2\n656#1:1627\n656#1:1628,2\n678#1:1691\n678#1:1692,2\n690#1:1765\n690#1:1766,2\n1063#1:1861\n1063#1:1862,2\n1099#1:1925\n1099#1:1926,2\n1197#1:2007\n1197#1:2008,2\n1226#1:2092\n1226#1:2093,2\n144#1:1494\n368#1:1529\n480#1:1544\n525#1:1566\n144#1:1495,7\n146#1:1502\n144#1:1503,4\n197#1:1507,11\n199#1:1518,11\n368#1:1530,11\n480#1:1545,11\n525#1:1567,11\n555#1:1580\n593#1:1582,11\n1201#1:2046,11\n1283#1:2140,11\n1305#1:2152,11\n1317#1:2164,11\n416#1:1541\n463#1:1543\n520#1:1563\n656#1:1593\n678#1:1656\n690#1:1730\n856#1:1804\n1053#1:1805,3\n1053#1:1809\n1055#1:1814\n1055#1:1816,3\n1063#1:1822\n1099#1:1889\n1100#1:1909\n1197#1:1971\n1198#1:1991\n1226#1:2057\n1256#1:2126\n1256#1:2127\n1258#1:2131\n1259#1:2133\n1263#1:2134\n656#1:1594,8\n656#1:1602,3\n656#1:1605,2\n656#1:1650,2\n656#1:1652,3\n656#1:1655\n678#1:1657,8\n678#1:1665,3\n678#1:1668,2\n678#1:1670\n678#1:1714,11\n678#1:1725,3\n678#1:1728\n678#1:1729\n690#1:1731,8\n690#1:1739,3\n690#1:1742,2\n690#1:1744\n690#1:1788,11\n690#1:1799,3\n690#1:1802\n690#1:1803\n1054#1:1811,3\n1054#1:1819,3\n1063#1:1823,18\n1063#1:1884,3\n1063#1:1887\n1063#1:1888\n1099#1:1890,8\n1099#1:1898,3\n1099#1:1901,2\n1099#1:1903\n1099#1:1948,11\n1099#1:1959,3\n1099#1:1962\n1099#1:1963\n1197#1:1972,8\n1197#1:1980,3\n1197#1:1983,2\n1197#1:1985\n1197#1:2030,11\n1197#1:2041,3\n1197#1:2044\n1197#1:2045\n1257#1:2128,3\n1257#1:2136,3\n656#1:1607,6\n656#1:1614,2\n656#1:1619,8\n656#1:1630,9\n656#1:1642,8\n678#1:1671,6\n678#1:1678,2\n678#1:1683,8\n678#1:1694,9\n678#1:1706,8\n690#1:1745,6\n690#1:1752,2\n690#1:1757,8\n690#1:1768,9\n690#1:1780,8\n1063#1:1841,6\n1063#1:1848,2\n1063#1:1853,8\n1063#1:1864,9\n1063#1:1876,8\n1099#1:1904,5\n1099#1:1910\n1099#1:1912,2\n1099#1:1917,8\n1099#1:1928,9\n1099#1:1940,8\n1197#1:1986,5\n1197#1:1992\n1197#1:1994,2\n1197#1:1999,8\n1197#1:2010,9\n1197#1:2022,8\n1226#1:2072,6\n1226#1:2079,2\n1226#1:2084,8\n1226#1:2095,9\n1226#1:2107,8\n656#1:1613\n678#1:1677\n690#1:1751\n1055#1:1815\n1063#1:1847\n1099#1:1911\n1197#1:1993\n1226#1:2078\n1258#1:2132\n1263#1:2135\n656#1:1616,3\n656#1:1639,3\n678#1:1680,3\n678#1:1703,3\n690#1:1754,3\n690#1:1777,3\n1063#1:1850,3\n1063#1:1873,3\n1099#1:1914,3\n1099#1:1937,3\n1197#1:1996,3\n1197#1:2019,3\n1226#1:2081,3\n1226#1:2104,3\n1053#1:1808\n1053#1:1810\n1226#1:2058\n1226#1:2059,13\n1226#1:2115\n1226#1:2116,10\n*E\n"})
/* loaded from: classes.dex */
public final class h0 implements androidx.compose.runtime.r, androidx.compose.ui.layout.k1, q1, androidx.compose.ui.layout.z, androidx.compose.ui.node.g, y, p1.b {
    public static final int M = 8;
    public static final int O = Integer.MAX_VALUE;

    /* renamed from: A, reason: from kotlin metadata */
    private boolean canMultiMeasure;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private final c1 nodes;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private final m0 layoutDelegate;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.e0 subcompositionsState;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.m
    private e1 _innerLayerCoordinator;

    /* renamed from: F, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.l
    private androidx.compose.ui.q modifier;

    /* renamed from: H, reason: from kotlin metadata */
    @fg.m
    private ld.l<? super p1, k2> onAttach;

    /* renamed from: I, reason: from kotlin metadata */
    @fg.m
    private ld.l<? super p1, k2> onDetach;

    /* renamed from: J, reason: from kotlin metadata */
    private boolean needsOnPositionedDispatch;

    /* renamed from: K, reason: from kotlin metadata */
    private boolean isDeactivated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int semanticsId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int compositeKeyHash;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h0 lookaheadRoot;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z0<h0> _foldedChildren;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.collection.g<h0> _unfoldedChildren;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h0 _foldedParent;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p1 owner;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.viewinterop.c interopViewFactoryHolder;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.semantics.l _collapsedSemantics;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<h0> _zSortedChildren;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.layout.m0 measurePolicy;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z intrinsicsPolicy;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private s5 viewConfiguration;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.g0 compositionLocalMap;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g intrinsicsUsageByParent;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g previousIntrinsicsUsageByParent;

    /* renamed from: L, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final f N = new c();

    @fg.l
    private static final ld.a<h0> P = a.f19322b;

    @fg.l
    private static final s5 Q = new b();

    @fg.l
    private static final Comparator<h0> R = new g0();

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/h0;", "a", "()Landroidx/compose/ui/node/h0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19322b = new a(0);

        a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            return new h0(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"androidx/compose/ui/node/h0$b", "Landroidx/compose/ui/platform/s5;", "", "c", "()J", "longPressTimeoutMillis", "a", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "h", "()F", "touchSlop", "Landroidx/compose/ui/unit/l;", "d", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements s5 {
        b() {
        }

        @Override // androidx.compose.ui.platform.s5
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.s5
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.s5
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.s5
        public long d() {
            androidx.compose.ui.unit.l.INSTANCE.getClass();
            return androidx.compose.ui.unit.l.f21514c;
        }

        @Override // androidx.compose.ui.platform.s5
        public float h() {
            return 16.0f;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/ui/node/h0$c", "Landroidx/compose/ui/node/h0$f;", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "", "n", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // androidx.compose.ui.layout.m0
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 a(androidx.compose.ui.layout.o0 o0Var, List list, long j4) {
            return (androidx.compose.ui.layout.n0) n(o0Var, list, j4);
        }

        @fg.l
        public Void n(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/h0$d;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/h0;", "Constructor", "Lld/a;", "a", "()Lld/a;", "Landroidx/compose/ui/platform/s5;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/s5;", "b", "()Landroidx/compose/ui/platform/s5;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "c", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/h0$f;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/h0$f;", "", "NotPlacedPlaceOrder", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.h0$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final ld.a<h0> a() {
            return h0.P;
        }

        @fg.l
        public final s5 b() {
            return h0.Q;
        }

        @fg.l
        public final Comparator<h0> c() {
            return h0.R;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/h0$e;", "", "<init>", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/h0$f;", "Landroidx/compose/ui/layout/m0;", "", "error", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/q;", "", "Landroidx/compose/ui/layout/p;", "measurables", "", "height", "", "m", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)Ljava/lang/Void;", "width", "l", "k", "j", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f implements androidx.compose.ui.layout.m0 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f19323b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String error;

        public f(@fg.l String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.m0
        public /* bridge */ /* synthetic */ int b(androidx.compose.ui.layout.q qVar, List list, int i4) {
            return ((Number) k(qVar, list, i4)).intValue();
        }

        @Override // androidx.compose.ui.layout.m0
        public /* bridge */ /* synthetic */ int c(androidx.compose.ui.layout.q qVar, List list, int i4) {
            return ((Number) l(qVar, list, i4)).intValue();
        }

        @Override // androidx.compose.ui.layout.m0
        public /* bridge */ /* synthetic */ int d(androidx.compose.ui.layout.q qVar, List list, int i4) {
            return ((Number) m(qVar, list, i4)).intValue();
        }

        @Override // androidx.compose.ui.layout.m0
        public /* bridge */ /* synthetic */ int e(androidx.compose.ui.layout.q qVar, List list, int i4) {
            return ((Number) j(qVar, list, i4)).intValue();
        }

        @fg.l
        public Void j(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            throw new IllegalStateException(this.error.toString());
        }

        @fg.l
        public Void k(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            throw new IllegalStateException(this.error.toString());
        }

        @fg.l
        public Void l(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            throw new IllegalStateException(this.error.toString());
        }

        @fg.l
        public Void m(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/h0$g;", "", "<init>", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19325a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f19325a = iArr;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        i() {
            super(0);
        }

        public final void a() {
            h0.this.getLayoutDelegate().K();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1477:1\n76#2:1478\n741#3,18:1479\n759#3,3:1541\n385#4,5:1497\n390#4:1503\n395#4,2:1505\n397#4,8:1510\n405#4,9:1521\n414#4,8:1533\n1#5:1502\n261#6:1504\n234#7,3:1507\n237#7,3:1530\n1208#8:1518\n1187#8,2:1519\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1\n*L\n422#1:1478\n422#1:1479,18\n422#1:1541,3\n422#1:1497,5\n422#1:1503\n422#1:1505,2\n422#1:1510,8\n422#1:1521,9\n422#1:1533,8\n422#1:1504\n422#1:1507,3\n422#1:1530,3\n422#1:1518\n422#1:1519,2\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.ui.semantics.l> f19328c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k1.h<androidx.compose.ui.semantics.l> hVar) {
            super(0);
            this.f19328c = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.q$d] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.q$d] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.compose.ui.semantics.l] */
        public final void a() {
            c1 nodes = h0.this.getNodes();
            k1.h<androidx.compose.ui.semantics.l> hVar = this.f19328c;
            if ((c1.c(nodes) & 8) != 0) {
                for (q.d tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                    if ((tail.getKindSet() & 8) != 0) {
                        l lVar = tail;
                        androidx.compose.runtime.collection.g gVar = null;
                        while (lVar != 0) {
                            if (lVar instanceof y1) {
                                y1 y1Var = (y1) lVar;
                                if (y1Var.h1()) {
                                    ?? lVar2 = new androidx.compose.ui.semantics.l();
                                    hVar.f75329b = lVar2;
                                    lVar2.s(true);
                                }
                                if (y1Var.getMergeDescendants()) {
                                    hVar.f75329b.v(true);
                                }
                                y1Var.f6(hVar.f75329b);
                            } else if ((lVar.getKindSet() & 8) != 0 && (lVar instanceof l)) {
                                q.d delegate = lVar.getDelegate();
                                int i4 = 0;
                                lVar = lVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & 8) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVar = delegate;
                                        } else {
                                            if (gVar == null) {
                                                gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                            }
                                            if (lVar != 0) {
                                                gVar.b(lVar);
                                                lVar = 0;
                                            }
                                            gVar.b(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    lVar = lVar;
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVar = k.l(gVar);
                        }
                    }
                }
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ void A1(h0 h0Var, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        h0Var.z1(z4, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(h0 h0Var, h0 h0Var2) {
        return h0Var.E0() == h0Var2.E0() ? kotlin.jvm.internal.l0.t(h0Var.C0(), h0Var2.C0()) : Float.compare(h0Var.E0(), h0Var2.E0());
    }

    private final void C1() {
        this.nodes.H();
    }

    private final float E0() {
        return this.layoutDelegate.F().r1();
    }

    @kotlin.w0
    public static /* synthetic */ void G0() {
    }

    private final void J() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.NotUsed;
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                if (h0Var.intrinsicsUsageByParent == g.InLayoutBlock) {
                    h0Var.J();
                }
                i4++;
            } while (i4 < size);
        }
    }

    public static /* synthetic */ void J0(h0 h0Var, long j4, t tVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        boolean z6 = z4;
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        h0Var.I0(j4, tVar, z6, z5);
    }

    private final void J1(h0 h0Var) {
        if (kotlin.jvm.internal.l0.g(h0Var, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = h0Var;
        if (h0Var != null) {
            this.layoutDelegate.q();
            e1 wrapped = this.nodes.getInnerCoordinator().getWrapped();
            for (e1 outerCoordinator = this.nodes.getOuterCoordinator(); !kotlin.jvm.internal.l0.g(outerCoordinator, wrapped) && outerCoordinator != null; outerCoordinator = outerCoordinator.getWrapped()) {
                outerCoordinator.s2();
            }
        }
        S0();
    }

    private final String K(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < depth; i4++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i5 = 0;
            do {
                sb.append(L[i5].K(depth + 1));
                i5++;
            } while (i5 < size);
        }
        String sb2 = sb.toString();
        if (depth != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ String L(h0 h0Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return h0Var.K(i4);
    }

    private final void O0() {
        if (this.nodes.s(7168)) {
            for (q.d head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((head.getKindSet() & 1024) != 0) | ((head.getKindSet() & 2048) != 0) | ((head.getKindSet() & 4096) != 0)) {
                    h1.a(head);
                }
            }
        }
    }

    private final void P0() {
        c1 c1Var = this.nodes;
        if ((c1.c(c1Var) & 1024) != 0) {
            for (q.d tail = c1Var.getTail(); tail != null; tail = tail.getParent()) {
                if ((tail.getKindSet() & 1024) != 0) {
                    q.d dVar = tail;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (dVar != null) {
                        if (dVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) dVar;
                            if (focusTargetNode.I0().isFocused()) {
                                l0.d(this).getFocusOwner().e(true, false);
                                focusTargetNode.K7();
                            }
                        } else if ((dVar.getKindSet() & 1024) != 0 && (dVar instanceof l)) {
                            int i4 = 0;
                            for (q.d delegate = ((l) dVar).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & 1024) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        dVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (dVar != null) {
                                            gVar.b(dVar);
                                            dVar = null;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        dVar = k.l(gVar);
                    }
                }
            }
        }
    }

    private final boolean Q1() {
        if (this.nodes.t(4) && !this.nodes.t(2)) {
            return true;
        }
        for (q.d head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & 2) != 0 && k.m(head, 2).getLayer() != null) {
                return false;
            }
            if ((head.getKindSet() & 4) != 0) {
                return true;
            }
        }
        return true;
    }

    @kotlin.k(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void V() {
    }

    public static /* synthetic */ void W0(h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        h0Var.V0(z4);
    }

    private final void X0() {
        h0 h0Var;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (h0Var = this._foldedParent) == null) {
            return;
        }
        h0Var.X0();
    }

    public static /* synthetic */ boolean c1(h0 h0Var, androidx.compose.ui.unit.b bVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bVar = h0Var.layoutDelegate.y();
        }
        return h0Var.b1(bVar);
    }

    private final e1 e0() {
        if (this.innerLayerCoordinatorIsDirty) {
            e1 innerCoordinator = this.nodes.getInnerCoordinator();
            e1 wrappedBy = this.nodes.getOuterCoordinator().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (kotlin.jvm.internal.l0.g(innerCoordinator, wrappedBy)) {
                    break;
                }
                if ((innerCoordinator != null ? innerCoordinator.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator;
                    break;
                }
                innerCoordinator = innerCoordinator != null ? innerCoordinator.getWrappedBy() : null;
            }
        }
        e1 e1Var = this._innerLayerCoordinator;
        if (e1Var == null || e1Var.getLayer() != null) {
            return e1Var;
        }
        throw new IllegalStateException("layer was not set");
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void h() {
    }

    private final void j1(h0 child) {
        if (child.layoutDelegate.s() > 0) {
            this.layoutDelegate.T(r0.s() - 1);
        }
        if (this.owner != null) {
            child.M();
        }
        child._foldedParent = null;
        child.nodes.getOuterCoordinator().T4(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            androidx.compose.runtime.collection.g<h0> h4 = child._foldedChildren.h();
            int size = h4.getSize();
            if (size > 0) {
                h0[] L = h4.L();
                int i4 = 0;
                do {
                    L[i4].nodes.getOuterCoordinator().T4(null);
                    i4++;
                } while (i4 < size);
            }
        }
        X0();
        l1();
    }

    private final void k1() {
        S0();
        h0 B0 = B0();
        if (B0 != null) {
            B0.Q0();
        }
        R0();
    }

    private final void n1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i4 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            androidx.compose.runtime.collection.g<h0> gVar = this._unfoldedChildren;
            if (gVar == null) {
                gVar = new androidx.compose.runtime.collection.g<>(new h0[16], 0);
                this._unfoldedChildren = gVar;
            }
            gVar.m();
            androidx.compose.runtime.collection.g<h0> h4 = this._foldedChildren.h();
            int size = h4.getSize();
            if (size > 0) {
                h0[] L = h4.L();
                do {
                    h0 h0Var = L[i4];
                    if (h0Var.isVirtual) {
                        gVar.c(gVar.getSize(), h0Var.H0());
                    } else {
                        gVar.b(h0Var);
                    }
                    i4++;
                } while (i4 < size);
            }
            this.layoutDelegate.K();
        }
    }

    public static /* synthetic */ boolean p1(h0 h0Var, androidx.compose.ui.unit.b bVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bVar = h0Var.layoutDelegate.x();
        }
        return h0Var.o1(bVar);
    }

    public static /* synthetic */ void u1(h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        h0Var.t1(z4);
    }

    public static /* synthetic */ void w1(h0 h0Var, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        if ((i4 & 2) != 0) {
            z5 = true;
        }
        h0Var.v1(z4, z5);
    }

    public static /* synthetic */ void y1(h0 h0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        h0Var.x1(z4);
    }

    @Override // androidx.compose.ui.node.g
    @fg.l
    /* renamed from: A, reason: from getter */
    public androidx.compose.runtime.g0 getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @fg.m
    /* renamed from: A0, reason: from getter */
    public final p1 getOwner() {
        return this.owner;
    }

    @fg.m
    public final h0 B0() {
        h0 h0Var = this._foldedParent;
        while (h0Var != null && h0Var.isVirtual) {
            h0Var = h0Var._foldedParent;
        }
        return h0Var;
    }

    public final void B1(@fg.l h0 it) {
        if (h.f19325a[it.layoutDelegate.A().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.layoutDelegate.A());
        }
        if (it.layoutDelegate.D()) {
            w1(it, true, false, 2, null);
            return;
        }
        if (it.layoutDelegate.C()) {
            it.t1(true);
        }
        if (it.layoutDelegate.G()) {
            A1(it, true, false, 2, null);
        } else if (it.layoutDelegate.z()) {
            it.x1(true);
        }
    }

    public final int C0() {
        return this.layoutDelegate.F().k1();
    }

    @fg.m
    /* renamed from: D0, reason: from getter */
    public final androidx.compose.ui.layout.e0 getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void D1() {
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                g gVar = h0Var.previousIntrinsicsUsageByParent;
                h0Var.intrinsicsUsageByParent = gVar;
                if (gVar != g.NotUsed) {
                    h0Var.D1();
                }
                i4++;
            } while (i4 < size);
        }
    }

    public final void E1(boolean z4) {
        this.canMultiMeasure = z4;
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<h0> F0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.m();
            androidx.compose.runtime.collection.g<h0> gVar = this._zSortedChildren;
            gVar.c(gVar.getSize(), H0());
            this._zSortedChildren.v0(R);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final void F1(int i4) {
        this.depth = i4;
    }

    public final void G1(boolean z4) {
        this.innerLayerCoordinatorIsDirty = z4;
    }

    @Override // androidx.compose.ui.node.q1
    public boolean G3() {
        return f();
    }

    public final void H(@fg.l p1 owner) {
        h0 h0Var;
        int i4 = 0;
        if (this.owner != null) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + L(this, 0, 1, null)).toString());
        }
        h0 h0Var2 = this._foldedParent;
        if (h0Var2 != null) {
            if (!kotlin.jvm.internal.l0.g(h0Var2 != null ? h0Var2.owner : null, owner)) {
                StringBuilder sb = new StringBuilder("Attaching to a different owner(");
                sb.append(owner);
                sb.append(") than the parent's owner(");
                h0 B0 = B0();
                sb.append(B0 != null ? B0.owner : null);
                sb.append("). This tree: ");
                sb.append(L(this, 0, 1, null));
                sb.append(" Parent tree: ");
                h0 h0Var3 = this._foldedParent;
                sb.append(h0Var3 != null ? L(h0Var3, 0, 1, null) : null);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        h0 B02 = B0();
        if (B02 == null) {
            this.layoutDelegate.F().n2(true);
            m0.a E = this.layoutDelegate.E();
            if (E != null) {
                E.e2(true);
            }
        }
        this.nodes.getOuterCoordinator().T4(B02 != null ? B02.nodes.getInnerCoordinator() : null);
        this.owner = owner;
        this.depth = (B02 != null ? B02.depth : -1) + 1;
        if (this.nodes.t(8)) {
            U0();
        }
        owner.T(this);
        if (this.isVirtualLookaheadRoot) {
            J1(this);
        } else {
            h0 h0Var4 = this._foldedParent;
            if (h0Var4 == null || (h0Var = h0Var4.lookaheadRoot) == null) {
                h0Var = this.lookaheadRoot;
            }
            J1(h0Var);
        }
        if (!this.isDeactivated) {
            this.nodes.C();
        }
        androidx.compose.runtime.collection.g<h0> h4 = this._foldedChildren.h();
        int size = h4.getSize();
        if (size > 0) {
            h0[] L = h4.L();
            do {
                L[i4].H(owner);
                i4++;
            } while (i4 < size);
        }
        if (!this.isDeactivated) {
            this.nodes.I();
        }
        S0();
        if (B02 != null) {
            B02.S0();
        }
        e1 wrapped = this.nodes.getInnerCoordinator().getWrapped();
        for (e1 outerCoordinator = this.nodes.getOuterCoordinator(); !kotlin.jvm.internal.l0.g(outerCoordinator, wrapped) && outerCoordinator != null; outerCoordinator = outerCoordinator.getWrapped()) {
            outerCoordinator.k4();
        }
        ld.l<? super p1, k2> lVar = this.onAttach;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        this.layoutDelegate.W();
        if (this.isDeactivated) {
            return;
        }
        O0();
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<h0> H0() {
        R1();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.h();
        }
        androidx.compose.runtime.collection.g<h0> gVar = this._unfoldedChildren;
        kotlin.jvm.internal.l0.m(gVar);
        return gVar;
    }

    public final void H1(@fg.m androidx.compose.ui.viewinterop.c cVar) {
        this.interopViewFactoryHolder = cVar;
    }

    public final void I() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.NotUsed;
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                if (h0Var.intrinsicsUsageByParent != g.NotUsed) {
                    h0Var.I();
                }
                i4++;
            } while (i4 < size);
        }
    }

    public final void I0(long pointerPosition, @fg.l t hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        long y22 = this.nodes.getOuterCoordinator().y2(pointerPosition);
        e1 outerCoordinator = this.nodes.getOuterCoordinator();
        e1.INSTANCE.getClass();
        outerCoordinator.F3(e1.N, y22, hitTestResult, isTouchEvent, isInLayer);
    }

    public final void I1(@fg.l g gVar) {
        this.intrinsicsUsageByParent = gVar;
    }

    public final void K0(long pointerPosition, @fg.l t hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        long y22 = this.nodes.getOuterCoordinator().y2(pointerPosition);
        e1 outerCoordinator = this.nodes.getOuterCoordinator();
        e1.INSTANCE.getClass();
        outerCoordinator.F3(e1.O, y22, hitSemanticsEntities, true, isInLayer);
    }

    public final void K1(boolean z4) {
        this.needsOnPositionedDispatch = z4;
    }

    public final void L1(@fg.m ld.l<? super p1, k2> lVar) {
        this.onAttach = lVar;
    }

    public final void M() {
        p1 p1Var = this.owner;
        if (p1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            h0 B0 = B0();
            sb.append(B0 != null ? L(B0, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        P0();
        h0 B02 = B0();
        if (B02 != null) {
            B02.Q0();
            B02.S0();
            m0.b F = this.layoutDelegate.F();
            g gVar = g.NotUsed;
            F.m2(gVar);
            m0.a E = this.layoutDelegate.E();
            if (E != null) {
                E.Z1(gVar);
            }
        }
        this.layoutDelegate.S();
        ld.l<? super p1, k2> lVar = this.onDetach;
        if (lVar != null) {
            lVar.invoke(p1Var);
        }
        if (this.nodes.t(8)) {
            U0();
        }
        this.nodes.J();
        this.ignoreRemeasureRequests = true;
        androidx.compose.runtime.collection.g<h0> h4 = this._foldedChildren.h();
        int size = h4.getSize();
        if (size > 0) {
            h0[] L = h4.L();
            int i4 = 0;
            do {
                L[i4].M();
                i4++;
            } while (i4 < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.D();
        p1Var.a0(this);
        this.owner = null;
        J1(null);
        this.depth = 0;
        this.layoutDelegate.F().V1();
        m0.a E2 = this.layoutDelegate.E();
        if (E2 != null) {
            E2.L1();
        }
    }

    public final void M0(@fg.l ld.a<k2> block) {
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void M1(@fg.m ld.l<? super p1, k2> lVar) {
        this.onDetach = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void N() {
        if (this.layoutDelegate.A() != e.Idle || this.layoutDelegate.z() || this.layoutDelegate.G() || this.isDeactivated || !l()) {
            return;
        }
        c1 c1Var = this.nodes;
        if ((c1.c(c1Var) & 256) != 0) {
            for (q.d head = c1Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & 256) != 0) {
                    l lVar = head;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (lVar != 0) {
                        if (lVar instanceof s) {
                            s sVar = (s) lVar;
                            sVar.W(k.m(sVar, 256));
                        } else if ((lVar.getKindSet() & 256) != 0 && (lVar instanceof l)) {
                            q.d delegate = lVar.getDelegate();
                            int i4 = 0;
                            lVar = lVar;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & 256) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        lVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (lVar != 0) {
                                            gVar.b(lVar);
                                            lVar = 0;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                lVar = lVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        lVar = k.l(gVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & 256) == 0) {
                    return;
                }
            }
        }
    }

    public final void N0(int index, @fg.l h0 instance) {
        if (instance._foldedParent != null) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(L(this, 0, 1, null));
            sb.append(" Other tree: ");
            h0 h0Var = instance._foldedParent;
            sb.append(h0Var != null ? L(h0Var, 0, 1, null) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (instance.owner != null) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + L(this, 0, 1, null) + " Other tree: " + L(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        l1();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        X0();
        p1 p1Var = this.owner;
        if (p1Var != null) {
            instance.H(p1Var);
        }
        if (instance.layoutDelegate.s() > 0) {
            m0 m0Var = this.layoutDelegate;
            m0Var.T(m0Var.s() + 1);
        }
    }

    public void N1(int i4) {
        this.semanticsId = i4;
    }

    public final void O(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        this.nodes.getOuterCoordinator().h2(canvas);
    }

    public final void O1(@fg.m androidx.compose.ui.layout.e0 e0Var) {
        this.subcompositionsState = e0Var;
    }

    public final void P(@fg.l ld.l<? super h0, k2> block) {
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                block.invoke(L[i4]);
                i4++;
            } while (i4 < size);
        }
    }

    public final void P1(boolean z4) {
        this.isVirtualLookaheadRoot = z4;
    }

    public final void Q(@fg.l ld.p<? super Integer, ? super h0, k2> block) {
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i4 = 0;
            do {
                block.invoke(Integer.valueOf(i4), L[i4]);
                i4++;
            } while (i4 < size);
        }
    }

    public final void Q0() {
        e1 e02 = e0();
        if (e02 != null) {
            e02.M3();
            return;
        }
        h0 B0 = B0();
        if (B0 != null) {
            B0.Q0();
        }
    }

    public final void R(@fg.l ld.l<? super d0, k2> block) {
        e1 outerCoordinator = this.nodes.getOuterCoordinator();
        v innerCoordinator = this.nodes.getInnerCoordinator();
        while (outerCoordinator != innerCoordinator) {
            kotlin.jvm.internal.l0.n(outerCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d0 d0Var = (d0) outerCoordinator;
            block.invoke(d0Var);
            outerCoordinator = d0Var.getWrapped();
        }
    }

    public final void R0() {
        e1 outerCoordinator = this.nodes.getOuterCoordinator();
        v innerCoordinator = this.nodes.getInnerCoordinator();
        while (outerCoordinator != innerCoordinator) {
            kotlin.jvm.internal.l0.n(outerCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            d0 d0Var = (d0) outerCoordinator;
            o1 layer = d0Var.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator = d0Var.getWrapped();
        }
        o1 layer2 = this.nodes.getInnerCoordinator().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void R1() {
        if (this.virtualChildrenCount > 0) {
            n1();
        }
    }

    public final void S(@fg.l ld.l<? super e1, k2> block) {
        e1 wrapped = this.nodes.getInnerCoordinator().getWrapped();
        for (e1 outerCoordinator = this.nodes.getOuterCoordinator(); !kotlin.jvm.internal.l0.g(outerCoordinator, wrapped) && outerCoordinator != null; outerCoordinator = outerCoordinator.getWrapped()) {
            block.invoke(outerCoordinator);
        }
    }

    public final void S0() {
        if (this.lookaheadRoot != null) {
            w1(this, false, false, 3, null);
        } else {
            A1(this, false, false, 3, null);
        }
    }

    public final boolean T() {
        androidx.compose.ui.node.a p4;
        m0 m0Var = this.layoutDelegate;
        if (m0Var.r().p().l()) {
            return true;
        }
        androidx.compose.ui.node.b B = m0Var.B();
        return (B == null || (p4 = B.p()) == null || !p4.l()) ? false : true;
    }

    public final void T0() {
        this.layoutDelegate.J();
    }

    /* renamed from: U, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void U0() {
        this._collapsedSemantics = null;
        l0.d(this).i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void V0(boolean isRootOfInvalidation) {
        h0 B0;
        if (isRootOfInvalidation && (B0 = B0()) != null) {
            B0.Q0();
        }
        U0();
        A1(this, false, false, 3, null);
        c1 c1Var = this.nodes;
        if ((c1.c(c1Var) & 2) != 0) {
            for (q.d head = c1Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & 2) != 0) {
                    l lVar = head;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (lVar != 0) {
                        if (lVar instanceof c0) {
                            o1 layer = k.m((c0) lVar, 2).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((lVar.getKindSet() & 2) != 0 && (lVar instanceof l)) {
                            q.d delegate = lVar.getDelegate();
                            int i4 = 0;
                            lVar = lVar;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & 2) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        lVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (lVar != 0) {
                                            gVar.b(lVar);
                                            lVar = 0;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                lVar = lVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        lVar = k.l(gVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & 2) == 0) {
                    break;
                }
            }
        }
        androidx.compose.runtime.collection.g<h0> H0 = H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            int i5 = 0;
            do {
                L[i5].V0(false);
                i5++;
            } while (i5 < size);
        }
    }

    @fg.l
    public final List<androidx.compose.ui.layout.l0> W() {
        m0.a E = this.layoutDelegate.E();
        kotlin.jvm.internal.l0.m(E);
        return E.S0();
    }

    @fg.l
    public final List<androidx.compose.ui.layout.l0> X() {
        return this.layoutDelegate.F().Z0();
    }

    @fg.l
    public final List<h0> Y() {
        return H0().l();
    }

    public final boolean Y0() {
        return this.layoutDelegate.F().y1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.semantics.l] */
    @fg.m
    public final androidx.compose.ui.semantics.l Z() {
        if (!this.nodes.t(8) || this._collapsedSemantics != null) {
            return this._collapsedSemantics;
        }
        k1.h hVar = new k1.h();
        hVar.f75329b = new androidx.compose.ui.semantics.l();
        l0.d(this).getSnapshotObserver().j(this, new j(hVar));
        T t4 = hVar.f75329b;
        this._collapsedSemantics = (androidx.compose.ui.semantics.l) t4;
        return (androidx.compose.ui.semantics.l) t4;
    }

    @fg.m
    public final Boolean Z0() {
        m0.a E = this.layoutDelegate.E();
        if (E != null) {
            return Boolean.valueOf(E.l());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.g
    public void a(@fg.l androidx.compose.ui.unit.w wVar) {
        if (this.layoutDirection != wVar) {
            this.layoutDirection = wVar;
            k1();
        }
    }

    /* renamed from: a0, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: a1, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    @Override // androidx.compose.ui.layout.z, androidx.compose.ui.node.g
    @fg.l
    /* renamed from: b, reason: from getter */
    public androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    public final List<h0> b0() {
        return this._foldedChildren.b();
    }

    public final boolean b1(@fg.m androidx.compose.ui.unit.b constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        m0.a E = this.layoutDelegate.E();
        kotlin.jvm.internal.l0.m(E);
        return E.P1(constraints.getValue());
    }

    @Override // androidx.compose.ui.node.g
    @fg.l
    /* renamed from: c, reason: from getter */
    public androidx.compose.ui.q getModifier() {
        return this.modifier;
    }

    public final boolean c0() {
        long P2 = this.nodes.getInnerCoordinator().P2();
        return androidx.compose.ui.unit.b.n(P2) && androidx.compose.ui.unit.b.l(P2);
    }

    @Override // androidx.compose.ui.layout.z, androidx.compose.ui.node.g
    @fg.l
    /* renamed from: d, reason: from getter */
    public s5 getViewConfiguration() {
        return this.viewConfiguration;
    }

    @fg.l
    public final e1 d0() {
        return this.nodes.getInnerCoordinator();
    }

    public final void d1() {
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            J();
        }
        m0.a E = this.layoutDelegate.E();
        kotlin.jvm.internal.l0.m(E);
        E.V1();
    }

    @Override // androidx.compose.runtime.r
    public void e() {
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            cVar.e();
        }
        androidx.compose.ui.layout.e0 e0Var = this.subcompositionsState;
        if (e0Var != null) {
            e0Var.e();
        }
        e1 wrapped = this.nodes.getInnerCoordinator().getWrapped();
        for (e1 outerCoordinator = this.nodes.getOuterCoordinator(); !kotlin.jvm.internal.l0.g(outerCoordinator, wrapped) && outerCoordinator != null; outerCoordinator = outerCoordinator.getWrapped()) {
            outerCoordinator.r4();
        }
    }

    public final void e1() {
        this.layoutDelegate.L();
    }

    @Override // androidx.compose.ui.layout.z
    public boolean f() {
        return this.owner != null;
    }

    /* renamed from: f0, reason: from getter */
    public final boolean getInnerLayerCoordinatorIsDirty() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final void f1() {
        this.layoutDelegate.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.g
    public void g(@fg.l androidx.compose.ui.unit.d dVar) {
        if (kotlin.jvm.internal.l0.g(this.density, dVar)) {
            return;
        }
        this.density = dVar;
        k1();
        c1 c1Var = this.nodes;
        if ((c1.c(c1Var) & 16) != 0) {
            for (q.d head = c1Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & 16) != 0) {
                    l lVar = head;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (lVar != 0) {
                        if (lVar instanceof u1) {
                            ((u1) lVar).g5();
                        } else if ((lVar.getKindSet() & 16) != 0 && (lVar instanceof l)) {
                            q.d delegate = lVar.getDelegate();
                            int i4 = 0;
                            lVar = lVar;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        lVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (lVar != 0) {
                                            gVar.b(lVar);
                                            lVar = 0;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                lVar = lVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        lVar = k.l(gVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & 16) == 0) {
                    return;
                }
            }
        }
    }

    @fg.m
    /* renamed from: g0, reason: from getter */
    public final androidx.compose.ui.viewinterop.c getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void g1() {
        this.layoutDelegate.N();
    }

    @Override // androidx.compose.ui.layout.z
    public int getHeight() {
        return this.layoutDelegate.w();
    }

    @Override // androidx.compose.ui.layout.z, androidx.compose.ui.node.g
    @fg.l
    public androidx.compose.ui.unit.w getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.z
    public int getWidth() {
        return this.layoutDelegate.I();
    }

    @fg.l
    /* renamed from: h0, reason: from getter */
    public final z getIntrinsicsPolicy() {
        return this.intrinsicsPolicy;
    }

    public final void h1() {
        this.layoutDelegate.O();
    }

    @Override // androidx.compose.ui.node.g
    @androidx.compose.ui.k
    public void i(int i4) {
        this.compositeKeyHash = i4;
    }

    @fg.l
    /* renamed from: i0, reason: from getter */
    public final g getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void i1(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i4 = 0; i4 < count; i4++) {
            this._foldedChildren.a(from > to ? to + i4 : (to + count) - 2, this._foldedChildren.i(from > to ? from + i4 : from));
        }
        l1();
        X0();
        S0();
    }

    @Override // androidx.compose.ui.node.g
    @androidx.compose.ui.k
    /* renamed from: j, reason: from getter */
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @fg.l
    /* renamed from: j0, reason: from getter */
    public final m0 getLayoutDelegate() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.runtime.r
    public void k() {
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            cVar.k();
        }
        androidx.compose.ui.layout.e0 e0Var = this.subcompositionsState;
        if (e0Var != null) {
            e0Var.k();
        }
        this.isDeactivated = true;
        C1();
        if (f()) {
            U0();
        }
    }

    public final boolean k0() {
        return this.layoutDelegate.z();
    }

    @Override // androidx.compose.ui.layout.z
    public boolean l() {
        return this.layoutDelegate.F().l();
    }

    @fg.l
    public final e l0() {
        return this.layoutDelegate.A();
    }

    public final void l1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        h0 B0 = B0();
        if (B0 != null) {
            B0.l1();
        }
    }

    @Override // androidx.compose.ui.layout.z
    /* renamed from: m, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final boolean m0() {
        return this.layoutDelegate.C();
    }

    public final void m1(int x4, int y4) {
        i1.a C;
        v innerCoordinator;
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            J();
        }
        h0 B0 = B0();
        if (B0 == null || (innerCoordinator = B0.nodes.getInnerCoordinator()) == null || (C = innerCoordinator.getPlacementScope()) == null) {
            C = l0.d(this).C();
        }
        i1.a.m(C, this.layoutDelegate.F(), x4, y4, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.layout.z
    @fg.m
    public androidx.compose.ui.layout.z n() {
        return B0();
    }

    public final boolean n0() {
        return this.layoutDelegate.D();
    }

    @Override // androidx.compose.ui.layout.z
    @fg.l
    public List<androidx.compose.ui.layout.r0> o() {
        return this.nodes.p();
    }

    @fg.m
    public final m0.a o0() {
        return this.layoutDelegate.E();
    }

    public final boolean o1(@fg.m androidx.compose.ui.unit.b constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            I();
        }
        return this.layoutDelegate.F().d2(constraints.getValue());
    }

    @Override // androidx.compose.ui.layout.k1
    public void p() {
        if (this.lookaheadRoot != null) {
            w1(this, false, false, 1, null);
        } else {
            A1(this, false, false, 1, null);
        }
        androidx.compose.ui.unit.b x4 = this.layoutDelegate.x();
        if (x4 != null) {
            p1 p1Var = this.owner;
            if (p1Var != null) {
                p1Var.V(this, x4.getValue());
                return;
            }
            return;
        }
        p1 p1Var2 = this.owner;
        if (p1Var2 != null) {
            p1.s(p1Var2, false, 1, null);
        }
    }

    @fg.m
    /* renamed from: p0, reason: from getter */
    public final h0 getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.g
    public void q(@fg.l s5 s5Var) {
        if (kotlin.jvm.internal.l0.g(this.viewConfiguration, s5Var)) {
            return;
        }
        this.viewConfiguration = s5Var;
        c1 c1Var = this.nodes;
        if ((c1.c(c1Var) & 16) != 0) {
            for (q.d head = c1Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & 16) != 0) {
                    l lVar = head;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (lVar != 0) {
                        if (lVar instanceof u1) {
                            ((u1) lVar).i6();
                        } else if ((lVar.getKindSet() & 16) != 0 && (lVar instanceof l)) {
                            q.d delegate = lVar.getDelegate();
                            int i4 = 0;
                            lVar = lVar;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        lVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (lVar != 0) {
                                            gVar.b(lVar);
                                            lVar = 0;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                lVar = lVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        lVar = k.l(gVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & 16) == 0) {
                    return;
                }
            }
        }
    }

    @fg.l
    public final j0 q0() {
        return l0.d(this).getSharedDrawScope();
    }

    public final void q1() {
        int g4 = this._foldedChildren.g();
        while (true) {
            g4--;
            if (-1 >= g4) {
                this._foldedChildren.c();
                return;
            }
            j1(this._foldedChildren.e(g4));
        }
    }

    @Override // androidx.compose.runtime.r
    public void r() {
        if (!f()) {
            throw new IllegalArgumentException("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            cVar.r();
        }
        androidx.compose.ui.layout.e0 e0Var = this.subcompositionsState;
        if (e0Var != null) {
            e0Var.r();
        }
        if (this.isDeactivated) {
            this.isDeactivated = false;
            U0();
        } else {
            C1();
        }
        this.semanticsId = androidx.compose.ui.semantics.o.d();
        this.nodes.C();
        this.nodes.I();
        B1(this);
    }

    @fg.l
    public final m0.b r0() {
        return this.layoutDelegate.F();
    }

    public final void r1(int index, int count) {
        if (count < 0) {
            throw new IllegalArgumentException(r2.a("count (", count, ") must be greater than 0").toString());
        }
        int i4 = (count + index) - 1;
        if (index > i4) {
            return;
        }
        while (true) {
            j1(this._foldedChildren.i(i4));
            if (i4 == index) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.node.p1.b
    public void s() {
        q.d x32;
        v innerCoordinator = this.nodes.getInnerCoordinator();
        boolean j4 = h1.j(128);
        q.d g32 = innerCoordinator.g3();
        if (!j4 && (g32 = g32.getParent()) == null) {
            return;
        }
        for (x32 = innerCoordinator.x3(j4); x32 != null && (x32.getAggregateChildKindSet() & 128) != 0; x32 = x32.getChild()) {
            if ((x32.getKindSet() & 128) != 0) {
                l lVar = x32;
                androidx.compose.runtime.collection.g gVar = null;
                while (lVar != 0) {
                    if (lVar instanceof b0) {
                        ((b0) lVar).q(this.nodes.getInnerCoordinator());
                    } else if ((lVar.getKindSet() & 128) != 0 && (lVar instanceof l)) {
                        q.d delegate = lVar.getDelegate();
                        int i4 = 0;
                        lVar = lVar;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & 128) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    lVar = delegate;
                                } else {
                                    if (gVar == null) {
                                        gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                    }
                                    if (lVar != 0) {
                                        gVar.b(lVar);
                                        lVar = 0;
                                    }
                                    gVar.b(delegate);
                                }
                            }
                            delegate = delegate.getChild();
                            lVar = lVar;
                        }
                        if (i4 == 1) {
                        }
                    }
                    lVar = k.l(gVar);
                }
            }
            if (x32 == g32) {
                return;
            }
        }
    }

    public final boolean s0() {
        return this.layoutDelegate.G();
    }

    public final void s1() {
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            J();
        }
        this.layoutDelegate.F().e2();
    }

    @Override // androidx.compose.ui.node.g
    public void t(@fg.l androidx.compose.ui.layout.m0 m0Var) {
        if (kotlin.jvm.internal.l0.g(this.measurePolicy, m0Var)) {
            return;
        }
        this.measurePolicy = m0Var;
        this.intrinsicsPolicy.m(m0Var);
        S0();
    }

    @fg.l
    public final g t0() {
        return this.layoutDelegate.F().h1();
    }

    public final void t1(boolean forceRequest) {
        p1 p1Var;
        if (this.isVirtual || (p1Var = this.owner) == null) {
            return;
        }
        p1Var.v(this, true, forceRequest);
    }

    @fg.l
    public String toString() {
        return androidx.compose.ui.platform.d2.b(this, null) + " children: " + Y().size() + " measurePolicy: " + this.measurePolicy;
    }

    @Override // androidx.compose.ui.node.g
    public void u(@fg.l androidx.compose.ui.q qVar) {
        if (this.isVirtual && this.modifier != androidx.compose.ui.q.INSTANCE) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.isDeactivated) {
            throw new IllegalArgumentException("modifier is updated when deactivated");
        }
        this.modifier = qVar;
        this.nodes.S(qVar);
        this.layoutDelegate.W();
        if (this.nodes.t(512) && this.lookaheadRoot == null) {
            J1(this);
        }
    }

    @fg.l
    public final g u0() {
        g k12;
        m0.a E = this.layoutDelegate.E();
        return (E == null || (k12 = E.k1()) == null) ? g.NotUsed : k12;
    }

    @Override // androidx.compose.ui.layout.z
    @fg.l
    public androidx.compose.ui.layout.u v() {
        return this.nodes.getInnerCoordinator();
    }

    /* renamed from: v0, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    public final void v1(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (this.lookaheadRoot == null) {
            throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        p1 p1Var = this.owner;
        if (p1Var == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        p1Var.Y(this, true, forceRequest, scheduleMeasureAndLayout);
        m0.a E = this.layoutDelegate.E();
        kotlin.jvm.internal.l0.m(E);
        E.t1(forceRequest);
    }

    @Override // androidx.compose.ui.layout.z
    /* renamed from: w, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    @fg.l
    /* renamed from: w0, reason: from getter */
    public final c1 getNodes() {
        return this.nodes;
    }

    @Override // androidx.compose.ui.node.g
    @fg.l
    /* renamed from: x, reason: from getter */
    public androidx.compose.ui.layout.m0 getMeasurePolicy() {
        return this.measurePolicy;
    }

    @fg.m
    public final ld.l<p1, k2> x0() {
        return this.onAttach;
    }

    public final void x1(boolean forceRequest) {
        p1 p1Var;
        if (this.isVirtual || (p1Var = this.owner) == null) {
            return;
        }
        p1.w(p1Var, this, false, forceRequest, 2, null);
    }

    @Override // androidx.compose.ui.node.y
    @fg.m
    @androidx.compose.ui.l
    public View y() {
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            return cVar.p();
        }
        return null;
    }

    @fg.m
    public final ld.l<p1, k2> y0() {
        return this.onDetach;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.q$d] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.g
    public void z(@fg.l androidx.compose.runtime.g0 g0Var) {
        this.compositionLocalMap = g0Var;
        g((androidx.compose.ui.unit.d) g0Var.b(androidx.compose.ui.platform.h1.i()));
        a((androidx.compose.ui.unit.w) g0Var.b(androidx.compose.ui.platform.h1.p()));
        q((s5) g0Var.b(androidx.compose.ui.platform.h1.v()));
        c1 c1Var = this.nodes;
        if ((c1.c(c1Var) & 32768) != 0) {
            for (q.d head = c1Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & 32768) != 0) {
                    l lVar = head;
                    androidx.compose.runtime.collection.g gVar = null;
                    while (lVar != 0) {
                        if (lVar instanceof androidx.compose.ui.node.h) {
                            q.d node = ((androidx.compose.ui.node.h) lVar).getNode();
                            if (node.getIsAttached()) {
                                h1.e(node);
                            } else {
                                node.v7(true);
                            }
                        } else if ((lVar.getKindSet() & 32768) != 0 && (lVar instanceof l)) {
                            q.d delegate = lVar.getDelegate();
                            int i4 = 0;
                            lVar = lVar;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & 32768) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        lVar = delegate;
                                    } else {
                                        if (gVar == null) {
                                            gVar = new androidx.compose.runtime.collection.g(new q.d[16], 0);
                                        }
                                        if (lVar != 0) {
                                            gVar.b(lVar);
                                            lVar = 0;
                                        }
                                        gVar.b(delegate);
                                    }
                                }
                                delegate = delegate.getChild();
                                lVar = lVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        lVar = k.l(gVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & 32768) == 0) {
                    return;
                }
            }
        }
    }

    @fg.l
    public final e1 z0() {
        return this.nodes.getOuterCoordinator();
    }

    public final void z1(boolean forceRequest, boolean scheduleMeasureAndLayout) {
        p1 p1Var;
        if (this.ignoreRemeasureRequests || this.isVirtual || (p1Var = this.owner) == null) {
            return;
        }
        p1.k0(p1Var, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        this.layoutDelegate.F().t1(forceRequest);
    }

    public h0(boolean z4, int i4) {
        androidx.compose.ui.unit.d dVar;
        this.isVirtual = z4;
        this.semanticsId = i4;
        this._foldedChildren = new z0<>(new androidx.compose.runtime.collection.g(new h0[16], 0), new i());
        this._zSortedChildren = new androidx.compose.runtime.collection.g<>(new h0[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = N;
        this.intrinsicsPolicy = new z(this);
        dVar = l0.f19348b;
        this.density = dVar;
        this.layoutDirection = androidx.compose.ui.unit.w.Ltr;
        this.viewConfiguration = Q;
        this.compositionLocalMap = androidx.compose.runtime.g0.INSTANCE.a();
        g gVar = g.NotUsed;
        this.intrinsicsUsageByParent = gVar;
        this.previousIntrinsicsUsageByParent = gVar;
        this.nodes = new c1(this);
        this.layoutDelegate = new m0(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = androidx.compose.ui.q.INSTANCE;
    }

    public /* synthetic */ h0(boolean z4, int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? androidx.compose.ui.semantics.o.d() : i4);
    }
}
