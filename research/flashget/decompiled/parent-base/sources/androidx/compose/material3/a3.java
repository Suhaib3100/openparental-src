package androidx.compose.material3;

import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: ColorScheme.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0002\bH\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(Bñ\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010)Jø\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J´\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b6\u00103R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00103R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b>\u00103R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u00103R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u00103R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u00103R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bF\u00103R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\bH\u00103R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u00103R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\b9\u00103R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bM\u00103R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bO\u00103R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u00101\u001a\u0004\bQ\u00103R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bR\u00101\u001a\u0004\bS\u00103R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u00101\u001a\u0004\bU\u00103R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bV\u00101\u001a\u0004\bW\u00103R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u00101\u001a\u0004\bY\u00103R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bZ\u00101\u001a\u0004\b[\u00103R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u00101\u001a\u0004\b]\u00103R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b^\u00101\u001a\u0004\b_\u00103R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b`\u00101\u001a\u0004\ba\u00103R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u00101\u001a\u0004\bc\u00103R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u00101\u001a\u0004\be\u00103R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bf\u00101\u001a\u0004\bg\u00103R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u00101\u001a\u0004\bi\u00103R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u00101\u001a\u0004\bk\u00103R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u00101\u001a\u0004\bm\u00103R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bn\u00101\u001a\u0004\bo\u00103R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bp\u00101\u001a\u0004\bq\u00103R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\br\u00101\u001a\u0004\bs\u00103R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bt\u00101\u001a\u0004\bu\u00103R\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u00101\u001a\u0004\bv\u00103R$\u0010}\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\b=\u0010z\"\u0004\b{\u0010|R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b~\u0010y\u001a\u0004\bL\u0010z\"\u0004\b\u007f\u0010|R'\u0010\u0083\u0001\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b\u0081\u0001\u0010y\u001a\u0004\bT\u0010z\"\u0005\b\u0082\u0001\u0010|R'\u0010\u0086\u0001\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b\u0084\u0001\u0010y\u001a\u0004\bj\u0010z\"\u0005\b\u0085\u0001\u0010|R(\u0010\u0089\u0001\u001a\u0004\u0018\u00010w8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010y\u001a\u0005\b\u0087\u0001\u0010z\"\u0005\b\u0088\u0001\u0010|R+\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b?\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R+\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0005\bN\u0010\u008d\u0001\"\u0006\b\u0092\u0001\u0010\u008f\u0001R+\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0094\u0001\u0010\u008c\u0001\u001a\u0005\bl\u0010\u008d\u0001\"\u0006\b\u0095\u0001\u0010\u008f\u0001R+\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b;\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R+\u0010 \u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u009e\u0001\u0010\u0099\u0001\u001a\u0005\bK\u0010\u009a\u0001\"\u0006\b\u009f\u0001\u0010\u009c\u0001R+\u0010¢\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b]\u0010\u0099\u0001\u001a\u0006\b\u0081\u0001\u0010\u009a\u0001\"\u0006\b¡\u0001\u0010\u009c\u0001R*\u0010¤\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\ba\u0010\u0099\u0001\u001a\u0005\bR\u0010\u009a\u0001\"\u0006\b£\u0001\u0010\u009c\u0001R*\u0010ª\u0001\u001a\u0005\u0018\u00010¥\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b[\u0010¦\u0001\u001a\u0005\bV\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010¬\u0001\u001a\u0005\u0018\u00010¥\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b:\u0010¦\u0001\u001a\u0005\bP\u0010§\u0001\"\u0006\b«\u0001\u0010©\u0001R*\u0010®\u0001\u001a\u0005\u0018\u00010¥\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bY\u0010¦\u0001\u001a\u0005\bZ\u0010§\u0001\"\u0006\b\u00ad\u0001\u0010©\u0001R3\u0010µ\u0001\u001a\u0005\u0018\u00010¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0005\bM\u0010°\u0001\u0012\u0006\b\u009e\u0001\u0010´\u0001\u001a\u0006\b\u0098\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R1\u0010·\u0001\u001a\u0005\u0018\u00010¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b_\u0010°\u0001\u0012\u0005\bC\u0010´\u0001\u001a\u0005\bA\u0010±\u0001\"\u0006\b¶\u0001\u0010³\u0001R1\u0010¹\u0001\u001a\u0005\u0018\u00010¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\bc\u0010°\u0001\u0012\u0005\bb\u0010´\u0001\u001a\u0005\b`\u0010±\u0001\"\u0006\b¸\u0001\u0010³\u0001R1\u0010»\u0001\u001a\u0005\u0018\u00010¯\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b5\u0010°\u0001\u0012\u0005\b^\u0010´\u0001\u001a\u0005\b\\\u0010±\u0001\"\u0006\bº\u0001\u0010³\u0001R*\u0010Á\u0001\u001a\u0005\u0018\u00010¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b8\u0010½\u0001\u001a\u0005\bE\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R1\u0010Ç\u0001\u001a\u0005\u0018\u00010Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b>\u0010Ã\u0001\u0012\u0005\bI\u0010´\u0001\u001a\u0005\bG\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010Í\u0001\u001a\u0005\u0018\u00010È\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bB\u0010É\u0001\u001a\u0005\bX\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Ó\u0001\u001a\u0005\u0018\u00010Î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bQ\u0010Ï\u0001\u001a\u0005\bd\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Ù\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bU\u0010Õ\u0001\u001a\u0005\bf\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R*\u0010ß\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bF\u0010Û\u0001\u001a\u0005\bh\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R*\u0010å\u0001\u001a\u0005\u0018\u00010à\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bJ\u0010á\u0001\u001a\u0005\bp\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R1\u0010ë\u0001\u001a\u0005\u0018\u00010æ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\be\u0010ç\u0001\u0012\u0005\bx\u0010´\u0001\u001a\u0005\b1\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R*\u0010ñ\u0001\u001a\u0005\u0018\u00010ì\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bg\u0010í\u0001\u001a\u0005\b~\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R+\u0010÷\u0001\u001a\u0005\u0018\u00010ò\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b2\u0010ó\u0001\u001a\u0006\b\u0084\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R*\u0010ý\u0001\u001a\u0005\u0018\u00010ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b6\u0010ù\u0001\u001a\u0005\bn\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R+\u0010ÿ\u0001\u001a\u0005\u0018\u00010ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bi\u0010ù\u0001\u001a\u0006\b\u008b\u0001\u0010ú\u0001\"\u0006\bþ\u0001\u0010ü\u0001R3\u0010\u0085\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u001f\n\u0005\b<\u0010\u0081\u0002\u0012\u0006\b\u0094\u0001\u0010´\u0001\u001a\u0006\b\u0091\u0001\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R1\u0010\u008b\u0002\u001a\u0005\u0018\u00010\u0086\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u001d\n\u0005\b@\u0010\u0087\u0002\u0012\u0005\bt\u0010´\u0001\u001a\u0005\br\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0002"}, d2 = {"Landroidx/compose/material3/a3;", "", "Landroidx/compose/ui/graphics/d2;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "a", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/a3;", "c", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/a3;", "", "toString", "()Ljava/lang/String;", "J", "m0", "()J", "b", "c0", "n0", "d", "d0", "e", "X", "f", "p0", "g", "e0", "h", "q0", "i", "f0", "j", "B0", "k", "i0", "l", "C0", "m", "j0", "n", "o", "Z", "p", "r0", "q", "g0", "r", "A0", "s", "h0", "t", "z0", "u", "Y", "v", "W", "w", "U", "x", "a0", "y", "V", "z", "b0", "A", "k0", "B", "l0", "C", "o0", "D", "s0", "E", "y0", "F", "t0", "G", "u0", "H", "v0", "I", "w0", "x0", "Landroidx/compose/material3/n0;", "K", "Landroidx/compose/material3/n0;", "()Landroidx/compose/material3/n0;", "E0", "(Landroidx/compose/material3/n0;)V", "defaultButtonColorsCached", "L", "K0", "defaultElevatedButtonColorsCached", "M", "O0", "defaultFilledTonalButtonColorsCached", "N", "X0", "defaultOutlinedButtonColorsCached", "O", "g1", "defaultTextButtonColorsCached", "Landroidx/compose/material3/k2;", "P", "Landroidx/compose/material3/k2;", "()Landroidx/compose/material3/k2;", "F0", "(Landroidx/compose/material3/k2;)V", "defaultCardColorsCached", "Q", "L0", "defaultElevatedCardColorsCached", "R", "Y0", "defaultOutlinedCardColorsCached", "Landroidx/compose/material3/v2;", "S", "Landroidx/compose/material3/v2;", "()Landroidx/compose/material3/v2;", "D0", "(Landroidx/compose/material3/v2;)V", "defaultAssistChipColorsCached", "T", "J0", "defaultElevatedAssistChipColorsCached", "e1", "defaultSuggestionChipColorsCached", "N0", "defaultElevatedSuggestionChipColorsCached", "Landroidx/compose/material3/q8;", "Landroidx/compose/material3/q8;", "()Landroidx/compose/material3/q8;", "P0", "(Landroidx/compose/material3/q8;)V", "defaultFilterChipColorsCached", "M0", "defaultElevatedFilterChipColorsCached", "R0", "defaultInputChipColorsCached", "Landroidx/compose/material3/mb;", "Landroidx/compose/material3/mb;", "()Landroidx/compose/material3/mb;", "j1", "(Landroidx/compose/material3/mb;)V", "()V", "defaultTopAppBarColorsCached", "G0", "defaultCenterAlignedTopAppBarColorsCached", "T0", "defaultMediumTopAppBarColorsCached", "S0", "defaultLargeTopAppBarColorsCached", "Landroidx/compose/material3/r2;", "Landroidx/compose/material3/r2;", "()Landroidx/compose/material3/r2;", "H0", "(Landroidx/compose/material3/r2;)V", "defaultCheckboxColorsCached", "Landroidx/compose/material3/u3;", "Landroidx/compose/material3/u3;", "()Landroidx/compose/material3/u3;", "I0", "(Landroidx/compose/material3/u3;)V", "defaultDatePickerColorsCached", "Landroidx/compose/material3/s5;", "Landroidx/compose/material3/s5;", "()Landroidx/compose/material3/s5;", "Q0", "(Landroidx/compose/material3/s5;)V", "defaultIconButtonColorsCached", "Landroidx/compose/material3/s6;", "Landroidx/compose/material3/s6;", "()Landroidx/compose/material3/s6;", "U0", "(Landroidx/compose/material3/s6;)V", "defaultMenuItemColorsCached", "Landroidx/compose/material3/g7;", "Landroidx/compose/material3/g7;", "()Landroidx/compose/material3/g7;", "V0", "(Landroidx/compose/material3/g7;)V", "defaultNavigationBarItemColorsCached", "Landroidx/compose/material3/n7;", "Landroidx/compose/material3/n7;", "()Landroidx/compose/material3/n7;", "W0", "(Landroidx/compose/material3/n7;)V", "defaultNavigationRailItemColorsCached", "Landroidx/compose/material3/y7;", "Landroidx/compose/material3/y7;", "()Landroidx/compose/material3/y7;", "a1", "(Landroidx/compose/material3/y7;)V", "defaultRadioButtonColorsCached", "Landroidx/compose/material3/m8;", "Landroidx/compose/material3/m8;", "()Landroidx/compose/material3/m8;", "c1", "(Landroidx/compose/material3/m8;)V", "defaultSegmentedButtonColorsCached", "Landroidx/compose/material3/d9;", "Landroidx/compose/material3/d9;", "()Landroidx/compose/material3/d9;", "d1", "(Landroidx/compose/material3/d9;)V", "defaultSliderColorsCached", "Landroidx/compose/material3/da;", "Landroidx/compose/material3/da;", "()Landroidx/compose/material3/da;", "f1", "(Landroidx/compose/material3/da;)V", "defaultSwitchColorsCached", "Landroidx/compose/material3/pa;", "Landroidx/compose/material3/pa;", "()Landroidx/compose/material3/pa;", "Z0", "(Landroidx/compose/material3/pa;)V", "defaultOutlinedTextFieldColorsCached", "h1", "defaultTextFieldColorsCached", "Landroidx/compose/material3/za;", "Landroidx/compose/material3/za;", "()Landroidx/compose/material3/za;", "i1", "(Landroidx/compose/material3/za;)V", "defaultTimePickerColorsCached", "Landroidx/compose/material3/e8;", "Landroidx/compose/material3/e8;", "()Landroidx/compose/material3/e8;", "b1", "(Landroidx/compose/material3/e8;)V", "defaultRichTooltipColorsCached", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: r0, reason: collision with root package name */
    public static final int f9417r0 = 0;

    /* renamed from: A, reason: from kotlin metadata */
    private final long outline;

    /* renamed from: B, reason: from kotlin metadata */
    private final long outlineVariant;

    /* renamed from: C, reason: from kotlin metadata */
    private final long scrim;

    /* renamed from: D, reason: from kotlin metadata */
    private final long surfaceBright;

    /* renamed from: E, reason: from kotlin metadata */
    private final long surfaceDim;

    /* renamed from: F, reason: from kotlin metadata */
    private final long surfaceContainer;

    /* renamed from: G, reason: from kotlin metadata */
    private final long surfaceContainerHigh;

    /* renamed from: H, reason: from kotlin metadata */
    private final long surfaceContainerHighest;

    /* renamed from: I, reason: from kotlin metadata */
    private final long surfaceContainerLow;

    /* renamed from: J, reason: from kotlin metadata */
    private final long surfaceContainerLowest;

    /* renamed from: K, reason: from kotlin metadata */
    @fg.m
    private n0 defaultButtonColorsCached;

    /* renamed from: L, reason: from kotlin metadata */
    @fg.m
    private n0 defaultElevatedButtonColorsCached;

    /* renamed from: M, reason: from kotlin metadata */
    @fg.m
    private n0 defaultFilledTonalButtonColorsCached;

    /* renamed from: N, reason: from kotlin metadata */
    @fg.m
    private n0 defaultOutlinedButtonColorsCached;

    /* renamed from: O, reason: from kotlin metadata */
    @fg.m
    private n0 defaultTextButtonColorsCached;

    /* renamed from: P, reason: from kotlin metadata */
    @fg.m
    private k2 defaultCardColorsCached;

    /* renamed from: Q, reason: from kotlin metadata */
    @fg.m
    private k2 defaultElevatedCardColorsCached;

    /* renamed from: R, reason: from kotlin metadata */
    @fg.m
    private k2 defaultOutlinedCardColorsCached;

    /* renamed from: S, reason: from kotlin metadata */
    @fg.m
    private v2 defaultAssistChipColorsCached;

    /* renamed from: T, reason: from kotlin metadata */
    @fg.m
    private v2 defaultElevatedAssistChipColorsCached;

    /* renamed from: U, reason: from kotlin metadata */
    @fg.m
    private v2 defaultSuggestionChipColorsCached;

    /* renamed from: V, reason: from kotlin metadata */
    @fg.m
    private v2 defaultElevatedSuggestionChipColorsCached;

    /* renamed from: W, reason: from kotlin metadata */
    @fg.m
    private q8 defaultFilterChipColorsCached;

    /* renamed from: X, reason: from kotlin metadata */
    @fg.m
    private q8 defaultElevatedFilterChipColorsCached;

    /* renamed from: Y, reason: from kotlin metadata */
    @fg.m
    private q8 defaultInputChipColorsCached;

    /* renamed from: Z, reason: from kotlin metadata */
    @fg.m
    private mb defaultTopAppBarColorsCached;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long primary;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private mb defaultCenterAlignedTopAppBarColorsCached;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long onPrimary;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private mb defaultMediumTopAppBarColorsCached;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long primaryContainer;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private mb defaultLargeTopAppBarColorsCached;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long onPrimaryContainer;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private r2 defaultCheckboxColorsCached;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long inversePrimary;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private u3 defaultDatePickerColorsCached;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long secondary;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s5 defaultIconButtonColorsCached;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long onSecondary;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s6 defaultMenuItemColorsCached;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long secondaryContainer;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private g7 defaultNavigationBarItemColorsCached;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long onSecondaryContainer;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private n7 defaultNavigationRailItemColorsCached;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long tertiary;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private y7 defaultRadioButtonColorsCached;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long onTertiary;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private m8 defaultSegmentedButtonColorsCached;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long tertiaryContainer;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d9 defaultSliderColorsCached;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long onTertiaryContainer;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private da defaultSwitchColorsCached;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long background;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private pa defaultOutlinedTextFieldColorsCached;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long onBackground;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private pa defaultTextFieldColorsCached;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long surface;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private za defaultTimePickerColorsCached;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long onSurface;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e8 defaultRichTooltipColorsCached;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long surfaceVariant;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long onSurfaceVariant;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long surfaceTint;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long inverseSurface;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long inverseOnSurface;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long error;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long onError;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long errorContainer;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long onErrorContainer;

    public /* synthetic */ a3(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41);
    }

    public static /* synthetic */ void I() {
    }

    public static /* synthetic */ void K() {
    }

    public static /* synthetic */ void R() {
    }

    public static /* synthetic */ void T() {
    }

    public static a3 b(a3 a3Var, long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, int i4, int i5, Object obj) {
        long j42 = (i4 & 1) != 0 ? a3Var.primary : j4;
        long j43 = (i4 & 2) != 0 ? a3Var.onPrimary : j5;
        long j44 = (i4 & 4) != 0 ? a3Var.primaryContainer : j6;
        long j45 = (i4 & 8) != 0 ? a3Var.onPrimaryContainer : j7;
        long j46 = (i4 & 16) != 0 ? a3Var.inversePrimary : j10;
        long j47 = (i4 & 32) != 0 ? a3Var.secondary : j11;
        long j48 = (i4 & 64) != 0 ? a3Var.onSecondary : j12;
        long j49 = (i4 & 128) != 0 ? a3Var.secondaryContainer : j13;
        long j50 = (i4 & 256) != 0 ? a3Var.onSecondaryContainer : j14;
        long j51 = (i4 & 512) != 0 ? a3Var.tertiary : j15;
        long j52 = (i4 & 1024) != 0 ? a3Var.onTertiary : j16;
        long j53 = (i4 & 2048) != 0 ? a3Var.tertiaryContainer : j17;
        long j54 = (i4 & 4096) != 0 ? a3Var.onTertiaryContainer : j18;
        long j55 = (i4 & 8192) != 0 ? a3Var.background : j19;
        long j56 = (i4 & 16384) != 0 ? a3Var.onBackground : j20;
        long j57 = (i4 & 32768) != 0 ? a3Var.surface : j21;
        long j58 = (i4 & 65536) != 0 ? a3Var.onSurface : j22;
        long j59 = (i4 & 131072) != 0 ? a3Var.surfaceVariant : j23;
        long j60 = (i4 & 262144) != 0 ? a3Var.onSurfaceVariant : j24;
        long j61 = (i4 & 524288) != 0 ? a3Var.surfaceTint : j25;
        long j62 = (i4 & 1048576) != 0 ? a3Var.inverseSurface : j26;
        long j63 = (i4 & 2097152) != 0 ? a3Var.inverseOnSurface : j27;
        long j64 = (i4 & 4194304) != 0 ? a3Var.error : j28;
        long j65 = (i4 & 8388608) != 0 ? a3Var.onError : j29;
        long j66 = (i4 & 16777216) != 0 ? a3Var.errorContainer : j30;
        long j67 = (i4 & 33554432) != 0 ? a3Var.onErrorContainer : j31;
        long j68 = (i4 & androidx.core.view.accessibility.b.f26943s) != 0 ? a3Var.outline : j32;
        long j69 = (i4 & 134217728) != 0 ? a3Var.outlineVariant : j33;
        long j70 = (i4 & ClientDefaults.MAX_MSG_SIZE) != 0 ? a3Var.scrim : j34;
        long j71 = (i4 & 536870912) != 0 ? a3Var.surfaceBright : j35;
        long j72 = (i4 & 1073741824) != 0 ? a3Var.surfaceDim : j36;
        long j73 = (i4 & Integer.MIN_VALUE) != 0 ? a3Var.surfaceContainer : j37;
        long j74 = (i5 & 1) != 0 ? a3Var.surfaceContainerHigh : j38;
        long j75 = (i5 & 2) != 0 ? a3Var.surfaceContainerHighest : j39;
        long j76 = (i5 & 4) != 0 ? a3Var.surfaceContainerLow : j40;
        long j77 = (i5 & 8) != 0 ? a3Var.surfaceContainerLowest : j41;
        a3Var.getClass();
        return new a3(j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77);
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void z() {
    }

    @fg.m
    /* renamed from: A, reason: from getter */
    public final s6 getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    /* renamed from: A0, reason: from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    @fg.m
    /* renamed from: B, reason: from getter */
    public final g7 getDefaultNavigationBarItemColorsCached() {
        return this.defaultNavigationBarItemColorsCached;
    }

    /* renamed from: B0, reason: from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    @fg.m
    /* renamed from: C, reason: from getter */
    public final n7 getDefaultNavigationRailItemColorsCached() {
        return this.defaultNavigationRailItemColorsCached;
    }

    /* renamed from: C0, reason: from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    @fg.m
    /* renamed from: D, reason: from getter */
    public final n0 getDefaultOutlinedButtonColorsCached() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final void D0(@fg.m v2 v2Var) {
        this.defaultAssistChipColorsCached = v2Var;
    }

    @fg.m
    /* renamed from: E, reason: from getter */
    public final k2 getDefaultOutlinedCardColorsCached() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final void E0(@fg.m n0 n0Var) {
        this.defaultButtonColorsCached = n0Var;
    }

    @fg.m
    /* renamed from: F, reason: from getter */
    public final pa getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final void F0(@fg.m k2 k2Var) {
        this.defaultCardColorsCached = k2Var;
    }

    @fg.m
    /* renamed from: G, reason: from getter */
    public final y7 getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    public final void G0(@fg.m mb mbVar) {
        this.defaultCenterAlignedTopAppBarColorsCached = mbVar;
    }

    @fg.m
    /* renamed from: H, reason: from getter */
    public final e8 getDefaultRichTooltipColorsCached() {
        return this.defaultRichTooltipColorsCached;
    }

    public final void H0(@fg.m r2 r2Var) {
        this.defaultCheckboxColorsCached = r2Var;
    }

    public final void I0(@fg.m u3 u3Var) {
        this.defaultDatePickerColorsCached = u3Var;
    }

    @fg.m
    /* renamed from: J, reason: from getter */
    public final m8 getDefaultSegmentedButtonColorsCached() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final void J0(@fg.m v2 v2Var) {
        this.defaultElevatedAssistChipColorsCached = v2Var;
    }

    public final void K0(@fg.m n0 n0Var) {
        this.defaultElevatedButtonColorsCached = n0Var;
    }

    @fg.m
    /* renamed from: L, reason: from getter */
    public final d9 getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    public final void L0(@fg.m k2 k2Var) {
        this.defaultElevatedCardColorsCached = k2Var;
    }

    @fg.m
    /* renamed from: M, reason: from getter */
    public final v2 getDefaultSuggestionChipColorsCached() {
        return this.defaultSuggestionChipColorsCached;
    }

    public final void M0(@fg.m q8 q8Var) {
        this.defaultElevatedFilterChipColorsCached = q8Var;
    }

    @fg.m
    /* renamed from: N, reason: from getter */
    public final da getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    public final void N0(@fg.m v2 v2Var) {
        this.defaultElevatedSuggestionChipColorsCached = v2Var;
    }

    @fg.m
    /* renamed from: O, reason: from getter */
    public final n0 getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    public final void O0(@fg.m n0 n0Var) {
        this.defaultFilledTonalButtonColorsCached = n0Var;
    }

    @fg.m
    /* renamed from: P, reason: from getter */
    public final pa getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    public final void P0(@fg.m q8 q8Var) {
        this.defaultFilterChipColorsCached = q8Var;
    }

    @fg.m
    /* renamed from: Q, reason: from getter */
    public final za getDefaultTimePickerColorsCached() {
        return this.defaultTimePickerColorsCached;
    }

    public final void Q0(@fg.m s5 s5Var) {
        this.defaultIconButtonColorsCached = s5Var;
    }

    public final void R0(@fg.m q8 q8Var) {
        this.defaultInputChipColorsCached = q8Var;
    }

    @fg.m
    /* renamed from: S, reason: from getter */
    public final mb getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    public final void S0(@fg.m mb mbVar) {
        this.defaultLargeTopAppBarColorsCached = mbVar;
    }

    public final void T0(@fg.m mb mbVar) {
        this.defaultMediumTopAppBarColorsCached = mbVar;
    }

    /* renamed from: U, reason: from getter */
    public final long getError() {
        return this.error;
    }

    public final void U0(@fg.m s6 s6Var) {
        this.defaultMenuItemColorsCached = s6Var;
    }

    /* renamed from: V, reason: from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    public final void V0(@fg.m g7 g7Var) {
        this.defaultNavigationBarItemColorsCached = g7Var;
    }

    /* renamed from: W, reason: from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public final void W0(@fg.m n7 n7Var) {
        this.defaultNavigationRailItemColorsCached = n7Var;
    }

    /* renamed from: X, reason: from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    public final void X0(@fg.m n0 n0Var) {
        this.defaultOutlinedButtonColorsCached = n0Var;
    }

    /* renamed from: Y, reason: from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    public final void Y0(@fg.m k2 k2Var) {
        this.defaultOutlinedCardColorsCached = k2Var;
    }

    /* renamed from: Z, reason: from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    public final void Z0(@fg.m pa paVar) {
        this.defaultOutlinedTextFieldColorsCached = paVar;
    }

    @fg.l
    public final a3 a(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceDim, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest) {
        return new a3(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest);
    }

    /* renamed from: a0, reason: from getter */
    public final long getOnError() {
        return this.onError;
    }

    public final void a1(@fg.m y7 y7Var) {
        this.defaultRadioButtonColorsCached = y7Var;
    }

    /* renamed from: b0, reason: from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public final void b1(@fg.m e8 e8Var) {
        this.defaultRichTooltipColorsCached = e8Var;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    public final /* synthetic */ a3 c(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return b(this, primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    /* renamed from: c0, reason: from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    public final void c1(@fg.m m8 m8Var) {
        this.defaultSegmentedButtonColorsCached = m8Var;
    }

    /* renamed from: d0, reason: from getter */
    public final long getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public final void d1(@fg.m d9 d9Var) {
        this.defaultSliderColorsCached = d9Var;
    }

    /* renamed from: e, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: e0, reason: from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    public final void e1(@fg.m v2 v2Var) {
        this.defaultSuggestionChipColorsCached = v2Var;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final v2 getDefaultAssistChipColorsCached() {
        return this.defaultAssistChipColorsCached;
    }

    /* renamed from: f0, reason: from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public final void f1(@fg.m da daVar) {
        this.defaultSwitchColorsCached = daVar;
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final n0 getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    /* renamed from: g0, reason: from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    public final void g1(@fg.m n0 n0Var) {
        this.defaultTextButtonColorsCached = n0Var;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final k2 getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* renamed from: h0, reason: from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public final void h1(@fg.m pa paVar) {
        this.defaultTextFieldColorsCached = paVar;
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final mb getDefaultCenterAlignedTopAppBarColorsCached() {
        return this.defaultCenterAlignedTopAppBarColorsCached;
    }

    /* renamed from: i0, reason: from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    public final void i1(@fg.m za zaVar) {
        this.defaultTimePickerColorsCached = zaVar;
    }

    /* renamed from: j0, reason: from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public final void j1(@fg.m mb mbVar) {
        this.defaultTopAppBarColorsCached = mbVar;
    }

    @fg.m
    /* renamed from: k, reason: from getter */
    public final r2 getDefaultCheckboxColorsCached() {
        return this.defaultCheckboxColorsCached;
    }

    /* renamed from: k0, reason: from getter */
    public final long getOutline() {
        return this.outline;
    }

    @fg.m
    /* renamed from: l, reason: from getter */
    public final u3 getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    /* renamed from: l0, reason: from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* renamed from: m0, reason: from getter */
    public final long getPrimary() {
        return this.primary;
    }

    @fg.m
    /* renamed from: n, reason: from getter */
    public final v2 getDefaultElevatedAssistChipColorsCached() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    /* renamed from: n0, reason: from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    @fg.m
    /* renamed from: o, reason: from getter */
    public final n0 getDefaultElevatedButtonColorsCached() {
        return this.defaultElevatedButtonColorsCached;
    }

    /* renamed from: o0, reason: from getter */
    public final long getScrim() {
        return this.scrim;
    }

    @fg.m
    /* renamed from: p, reason: from getter */
    public final k2 getDefaultElevatedCardColorsCached() {
        return this.defaultElevatedCardColorsCached;
    }

    /* renamed from: p0, reason: from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    @fg.m
    /* renamed from: q, reason: from getter */
    public final q8 getDefaultElevatedFilterChipColorsCached() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    /* renamed from: q0, reason: from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    @fg.m
    /* renamed from: r, reason: from getter */
    public final v2 getDefaultElevatedSuggestionChipColorsCached() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    /* renamed from: r0, reason: from getter */
    public final long getSurface() {
        return this.surface;
    }

    @fg.m
    /* renamed from: s, reason: from getter */
    public final n0 getDefaultFilledTonalButtonColorsCached() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    /* renamed from: s0, reason: from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    @fg.m
    /* renamed from: t, reason: from getter */
    public final q8 getDefaultFilterChipColorsCached() {
        return this.defaultFilterChipColorsCached;
    }

    /* renamed from: t0, reason: from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        androidx.compose.foundation.f2.a(this.primary, sb, "onPrimary=");
        androidx.compose.foundation.f2.a(this.onPrimary, sb, "primaryContainer=");
        androidx.compose.foundation.f2.a(this.primaryContainer, sb, "onPrimaryContainer=");
        androidx.compose.foundation.f2.a(this.onPrimaryContainer, sb, "inversePrimary=");
        androidx.compose.foundation.f2.a(this.inversePrimary, sb, "secondary=");
        androidx.compose.foundation.f2.a(this.secondary, sb, "onSecondary=");
        androidx.compose.foundation.f2.a(this.onSecondary, sb, "secondaryContainer=");
        androidx.compose.foundation.f2.a(this.secondaryContainer, sb, "onSecondaryContainer=");
        androidx.compose.foundation.f2.a(this.onSecondaryContainer, sb, "tertiary=");
        androidx.compose.foundation.f2.a(this.tertiary, sb, "onTertiary=");
        androidx.compose.foundation.f2.a(this.onTertiary, sb, "tertiaryContainer=");
        androidx.compose.foundation.f2.a(this.tertiaryContainer, sb, "onTertiaryContainer=");
        androidx.compose.foundation.f2.a(this.onTertiaryContainer, sb, "background=");
        androidx.compose.foundation.f2.a(this.background, sb, "onBackground=");
        androidx.compose.foundation.f2.a(this.onBackground, sb, "surface=");
        androidx.compose.foundation.f2.a(this.surface, sb, "onSurface=");
        androidx.compose.foundation.f2.a(this.onSurface, sb, "surfaceVariant=");
        androidx.compose.foundation.f2.a(this.surfaceVariant, sb, "onSurfaceVariant=");
        androidx.compose.foundation.f2.a(this.onSurfaceVariant, sb, "surfaceTint=");
        androidx.compose.foundation.f2.a(this.surfaceTint, sb, "inverseSurface=");
        androidx.compose.foundation.f2.a(this.inverseSurface, sb, "inverseOnSurface=");
        androidx.compose.foundation.f2.a(this.inverseOnSurface, sb, "error=");
        androidx.compose.foundation.f2.a(this.error, sb, "onError=");
        androidx.compose.foundation.f2.a(this.onError, sb, "errorContainer=");
        androidx.compose.foundation.f2.a(this.errorContainer, sb, "onErrorContainer=");
        androidx.compose.foundation.f2.a(this.onErrorContainer, sb, "outline=");
        androidx.compose.foundation.f2.a(this.outline, sb, "outlineVariant=");
        androidx.compose.foundation.f2.a(this.outlineVariant, sb, "scrim=");
        androidx.compose.foundation.f2.a(this.scrim, sb, "surfaceBright=");
        androidx.compose.foundation.f2.a(this.surfaceBright, sb, "surfaceDim=");
        androidx.compose.foundation.f2.a(this.surfaceDim, sb, "surfaceContainer=");
        androidx.compose.foundation.f2.a(this.surfaceContainer, sb, "surfaceContainerHigh=");
        androidx.compose.foundation.f2.a(this.surfaceContainerHigh, sb, "surfaceContainerHighest=");
        androidx.compose.foundation.f2.a(this.surfaceContainerHighest, sb, "surfaceContainerLow=");
        androidx.compose.foundation.f2.a(this.surfaceContainerLow, sb, "surfaceContainerLowest=");
        sb.append((Object) androidx.compose.ui.graphics.d2.L(this.surfaceContainerLowest));
        sb.append(')');
        return sb.toString();
    }

    @fg.m
    /* renamed from: u, reason: from getter */
    public final s5 getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    /* renamed from: u0, reason: from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    @fg.m
    /* renamed from: v, reason: from getter */
    public final q8 getDefaultInputChipColorsCached() {
        return this.defaultInputChipColorsCached;
    }

    /* renamed from: v0, reason: from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    @fg.m
    /* renamed from: w, reason: from getter */
    public final mb getDefaultLargeTopAppBarColorsCached() {
        return this.defaultLargeTopAppBarColorsCached;
    }

    /* renamed from: w0, reason: from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* renamed from: x0, reason: from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    @fg.m
    /* renamed from: y, reason: from getter */
    public final mb getDefaultMediumTopAppBarColorsCached() {
        return this.defaultMediumTopAppBarColorsCached;
    }

    /* renamed from: y0, reason: from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* renamed from: z0, reason: from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    public /* synthetic */ a3(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34);
    }

    private a3(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41) {
        this.primary = j4;
        this.onPrimary = j5;
        this.primaryContainer = j6;
        this.onPrimaryContainer = j7;
        this.inversePrimary = j10;
        this.secondary = j11;
        this.onSecondary = j12;
        this.secondaryContainer = j13;
        this.onSecondaryContainer = j14;
        this.tertiary = j15;
        this.onTertiary = j16;
        this.tertiaryContainer = j17;
        this.onTertiaryContainer = j18;
        this.background = j19;
        this.onBackground = j20;
        this.surface = j21;
        this.onSurface = j22;
        this.surfaceVariant = j23;
        this.onSurfaceVariant = j24;
        this.surfaceTint = j25;
        this.inverseSurface = j26;
        this.inverseOnSurface = j27;
        this.error = j28;
        this.onError = j29;
        this.errorContainer = j30;
        this.onErrorContainer = j31;
        this.outline = j32;
        this.outlineVariant = j33;
        this.scrim = j34;
        this.surfaceBright = j35;
        this.surfaceDim = j36;
        this.surfaceContainer = j37;
        this.surfaceContainerHigh = j38;
        this.surfaceContainerHighest = j39;
        this.surfaceContainerLow = j40;
        this.surfaceContainerLowest = j41;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a3(long r75, long r77, long r79, long r81, long r83, long r85, long r87, long r89, long r91, long r93, long r95, long r97, long r99, long r101, long r103, long r105, long r107, long r109, long r111, long r113, long r115, long r117, long r119, long r121, long r123, long r125, long r127, long r129, long r131) {
        /*
            r74 = this;
            androidx.compose.ui.graphics.d2$a r0 = androidx.compose.ui.graphics.d2.INSTANCE
            r0.getClass()
            long r60 = androidx.compose.ui.graphics.d2.k()
            r0.getClass()
            long r62 = androidx.compose.ui.graphics.d2.k()
            r0.getClass()
            long r64 = androidx.compose.ui.graphics.d2.k()
            r0.getClass()
            long r66 = androidx.compose.ui.graphics.d2.k()
            r0.getClass()
            long r68 = androidx.compose.ui.graphics.d2.k()
            r0.getClass()
            long r70 = androidx.compose.ui.graphics.d2.k()
            r0.getClass()
            long r72 = androidx.compose.ui.graphics.d2.k()
            r1 = r74
            r2 = r75
            r4 = r77
            r6 = r79
            r8 = r81
            r10 = r83
            r12 = r85
            r14 = r87
            r16 = r89
            r18 = r91
            r20 = r93
            r22 = r95
            r24 = r97
            r26 = r99
            r28 = r101
            r30 = r103
            r32 = r105
            r34 = r107
            r36 = r109
            r38 = r111
            r40 = r113
            r42 = r115
            r44 = r117
            r46 = r119
            r48 = r121
            r50 = r123
            r52 = r125
            r54 = r127
            r56 = r129
            r58 = r131
            r1.<init>(r2, r4, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.a3.<init>(long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long):void");
    }
}
