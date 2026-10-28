package androidx.compose.runtime;

import androidx.compose.runtime.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010 \n\u0002\bQ\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u0000 \u008c\u00022\u00020\u0001:\u0002Ì\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u001cJ\u001f\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010\u001aJ\u0017\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u001cJ\u001f\u00100\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010,J\u001f\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J'\u00107\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010(J!\u00109\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010,JG\u0010C\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062&\u0010B\u001a\"\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n\u0018\u00010?j\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n\u0018\u0001`AH\u0002¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\bG\u0010(J\u001f\u0010J\u001a\u00020\u0012*\u00060Hj\u0002`I2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010MJ\u001b\u0010Q\u001a\u00020\u0006*\u00020P2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010MJ\u001b\u0010U\u001a\u00020\u0006*\u00020P2\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bU\u0010RJ\u001b\u0010V\u001a\u00020\u0006*\u00020P2\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010RJ#\u0010W\u001a\u00020\u0012*\u00020P2\u0006\u0010T\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bW\u0010XJ\u001b\u0010Y\u001a\u00020\u0006*\u00020P2\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010RJ\u001b\u0010Z\u001a\u00020\u0006*\u00020P2\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bZ\u0010RJ\u0019\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060[*\u00020PH\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060[H\u0002¢\u0006\u0004\b^\u0010_J/\u0010b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010cJ'\u0010e\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010fJ\u001f\u0010g\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\bi\u0010MJ\u0015\u0010j\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bj\u0010\u0017J\u0015\u0010k\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bk\u0010MJ\u0015\u0010l\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bl\u0010MJ\u0017\u0010m\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bm\u0010nJ\u0015\u0010o\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bo\u0010MJ\u0017\u0010p\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bp\u0010nJ\u0015\u0010q\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bq\u0010\u0017J\u0015\u0010r\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\br\u0010\u0017J\u001d\u0010s\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\bs\u00104J\u0017\u0010t\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bt\u0010nJ\u0017\u0010u\u001a\u0004\u0018\u00010\u00012\u0006\u0010d\u001a\u00020@¢\u0006\u0004\bu\u0010vJ\u0015\u0010w\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\bw\u0010MJ\u0015\u0010x\u001a\u00020\u00062\u0006\u0010d\u001a\u00020@¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020\u0012¢\u0006\u0004\bz\u0010\u001aJ\r\u0010{\u001a\u00020\u0012¢\u0006\u0004\b{\u0010\u001aJ\u0019\u0010|\u001a\u0004\u0018\u00010\u00012\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0080\u0001\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u0018\u0010\u0081\u0001\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J \u0010\u0083\u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u00108\u001a\u00020\b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\u0012¢\u0006\u0005\b\u0085\u0001\u0010\u001aJ\u0019\u0010\u0086\u0001\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0086\u0001\u0010\u007fJ\"\u0010\u0087\u0001\u001a\u00020\u00122\u0006\u0010d\u001a\u00020@2\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u0089\u0001\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0089\u0001\u0010\u007fJ\u0019\u0010\u008a\u0001\u001a\u00020\u00122\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u008a\u0001\u0010\u007fJ$\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J,\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0012\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\"\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010d\u001a\u00020@2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J#\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0018\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u0006¢\u0006\u0005\b\u0097\u0001\u0010\u001cJ\u0018\u0010\u0098\u0001\u001a\u00020\u00122\u0006\u0010d\u001a\u00020@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\u0012¢\u0006\u0005\b\u009a\u0001\u0010\u001aJ\u000f\u0010\u009b\u0001\u001a\u00020\u0012¢\u0006\u0005\b\u009b\u0001\u0010\u001aJ\u000f\u0010\u009c\u0001\u001a\u00020\u0012¢\u0006\u0005\b\u009c\u0001\u0010\u001aJ\u000f\u0010\u009d\u0001\u001a\u00020\u0012¢\u0006\u0005\b\u009d\u0001\u0010\u001aJ\u0017\u0010\u009e\u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0005\b\u009e\u0001\u0010\u001cJ\"\u0010 \u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b \u0001\u0010:J!\u0010¡\u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b¡\u0001\u0010:J-\u0010£\u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J,\u0010¥\u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b¥\u0001\u0010¤\u0001J!\u0010¦\u0001\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b¦\u0001\u0010:J\u000f\u0010§\u0001\u001a\u00020\u0006¢\u0006\u0005\b§\u0001\u0010$J\u0017\u0010¨\u0001\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0005\b¨\u0001\u0010\u001cJ\u0018\u0010©\u0001\u001a\u00020\u00122\u0006\u0010d\u001a\u00020@¢\u0006\u0006\b©\u0001\u0010\u0099\u0001J\u000f\u0010ª\u0001\u001a\u00020\u0006¢\u0006\u0005\bª\u0001\u0010$J\u0010\u0010«\u0001\u001a\u00020\u000f¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0019\u0010®\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00ad\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\\\u0010µ\u0001\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062?\u0010´\u0001\u001a:\u0012\u0015\u0012\u00130\u0006¢\u0006\u000e\b±\u0001\u0012\t\b²\u0001\u0012\u0004\b\b()\u0012\u0018\u0012\u0016\u0018\u00010\u0001¢\u0006\u000f\b±\u0001\u0012\n\b²\u0001\u0012\u0005\b\b(³\u0001\u0012\u0004\u0012\u00020\u00120°\u0001H\u0086\b¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0018\u0010¸\u0001\u001a\u00020\u00122\u0007\u0010·\u0001\u001a\u00020\u0006¢\u0006\u0005\b¸\u0001\u0010\u001cJ0\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020@0[2\u0006\u0010d\u001a\u00020@2\u0007\u0010·\u0001\u001a\u00020\u00062\u0007\u0010¹\u0001\u001a\u00020\u0000¢\u0006\u0006\bº\u0001\u0010»\u0001J1\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020@0[2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00062\t\b\u0002\u0010¼\u0001\u001a\u00020\u000f¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u000f\u0010¿\u0001\u001a\u00020\u0012¢\u0006\u0005\b¿\u0001\u0010\u001aJ/\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020@0[2\u0007\u0010·\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001a\u0010Â\u0001\u001a\u00020@2\b\b\u0002\u0010)\u001a\u00020\u0006¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0019\u0010Ä\u0001\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0005\bÄ\u0001\u0010\u001cJ\u0017\u0010Å\u0001\u001a\u00020\u00062\u0006\u0010d\u001a\u00020@¢\u0006\u0005\bÅ\u0001\u0010yJ\u0012\u0010Æ\u0001\u001a\u00020\bH\u0016¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001c\u0010È\u0001\u001a\u0004\u0018\u00010@2\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0006\bÈ\u0001\u0010Ã\u0001J\u0010\u0010É\u0001\u001a\u00020\b¢\u0006\u0006\bÉ\u0001\u0010Ç\u0001J\u0011\u0010Ê\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\bÊ\u0001\u0010\u001aJ\u0011\u0010Ë\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\bË\u0001\u0010\u001aR\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0019\u0010Ò\u0001\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\"\u0010Ö\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R+\u0010Û\u0001\u001a\u0014\u0012\u0004\u0012\u00020@0×\u0001j\t\u0012\u0004\u0012\u00020@`Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R8\u0010B\u001a\"\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n\u0018\u00010?j\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\n\u0018\u0001`A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010ß\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÞ\u0001\u0010ZR\u0018\u0010á\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bà\u0001\u0010ZR\u0018\u0010ã\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bâ\u0001\u0010ZR\u0018\u0010å\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bä\u0001\u0010ZR\u0018\u0010ç\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bæ\u0001\u0010ZR\u0018\u0010é\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bè\u0001\u0010ZR\u0018\u0010ë\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bê\u0001\u0010ZR\u0018\u0010í\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bì\u0001\u0010ZR\u0018\u0010ï\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bî\u0001\u0010ZR\u0018\u0010ó\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010õ\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010ò\u0001R\u0018\u0010÷\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010ò\u0001R(\u0010û\u0001\u001a\u00020\u00062\u0007\u0010ø\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bù\u0001\u0010Z\u001a\u0005\bú\u0001\u0010$R(\u0010þ\u0001\u001a\u00020\u00062\u0007\u0010ø\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bü\u0001\u0010Z\u001a\u0005\bý\u0001\u0010$R'\u0010\u0007\u001a\u00020\u00062\u0007\u0010ø\u0001\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bÿ\u0001\u0010Z\u001a\u0005\b\u0080\u0002\u0010$R*\u0010\u0083\u0002\u001a\u00020\u000f2\u0007\u0010ø\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010©\u0001\u001a\u0006\b\u0082\u0002\u0010¬\u0001R\u001b\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0015\u0010a\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u0010$R\u0014\u0010\u0089\u0002\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010¬\u0001R\u0013\u0010\u0010\u001a\u00020\u000f8F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010¬\u0001R\u0015\u0010.\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0002\u0010$¨\u0006\u008d\u0002"}, d2 = {"Landroidx/compose/runtime/a4;", "", "Landroidx/compose/runtime/x3;", "table", "<init>", "(Landroidx/compose/runtime/x3;)V", "", "parent", "", "sourceInformation", "Landroidx/compose/runtime/j1;", "r0", "(ILjava/lang/String;)Landroidx/compose/runtime/j1;", "key", "objectKey", "", "isNode", "aux", "Lkotlin/k2;", "x1", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "P", "(I)Z", "O", "W0", "()V", "E1", "(I)V", "Landroidx/compose/runtime/w2;", "set", "F1", "(ILandroidx/compose/runtime/w2;)V", "L", "g1", "f1", "()I", "endGroup", "firstChild", "a0", "(III)V", "index", "J0", "L0", "(II)V", "M", "size", "x0", "y0", "start", "len", "c1", "(II)Z", "r1", "(I)Landroidx/compose/runtime/j1;", "d1", "value", "J1", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "C1", "gapStart", "Ljava/util/HashMap;", "Landroidx/compose/runtime/d;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "a1", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "F0", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "j0", "(Ljava/lang/StringBuilder;I)V", "m0", "(I)I", "dataIndex", "T", "", "T0", "([II)I", "R", "address", "S", "q1", "G1", "([III)V", "Q0", "I", "", "V", "([I)Ljava/util/List;", "C0", "()Ljava/util/List;", "gapLen", "capacity", "U", "(IIII)I", "anchor", "Q", "(III)I", "V0", "(II)I", "U0", "B0", "P0", "n0", "o0", "(I)Ljava/lang/Object;", "p0", "l0", "v0", "t0", "u0", "N0", "O0", "(Landroidx/compose/runtime/d;)Ljava/lang/Object;", "R0", "S0", "(Landroidx/compose/runtime/d;)I", "N", "e1", "B1", "(Ljava/lang/Object;)Ljava/lang/Object;", "D1", "(Ljava/lang/Object;)V", "w0", "X0", "(Ljava/lang/String;)V", "Z0", "(ILjava/lang/String;)V", "Y0", "I1", "H1", "(Landroidx/compose/runtime/d;Ljava/lang/Object;)V", "K1", "k1", "j1", "(ILjava/lang/Object;)Ljava/lang/Object;", "i1", "(IILjava/lang/Object;)Ljava/lang/Object;", "l1", "()Ljava/lang/Object;", "p1", "(Landroidx/compose/runtime/d;I)Ljava/lang/Object;", "groupIndex", "o1", "(II)Ljava/lang/Object;", "amount", "E", "h1", "(Landroidx/compose/runtime/d;)V", "n1", "K", "X", "u1", "v1", "dataKey", "w1", "y1", "node", "z1", "(ILjava/lang/Object;Ljava/lang/Object;)V", "t1", "s1", "W", "Y", "Z", "m1", "b1", "()Z", "", "q0", "()Ljava/util/Iterator;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "data", "block", "b0", "(ILld/p;)V", "offset", "I0", "writer", "M0", "(Landroidx/compose/runtime/d;ILandroidx/compose/runtime/a4;)Ljava/util/List;", "removeSourceGroup", "G0", "(Landroidx/compose/runtime/x3;IZ)Ljava/util/List;", "J", "K0", "(ILandroidx/compose/runtime/x3;I)Ljava/util/List;", "F", "(I)Landroidx/compose/runtime/d;", "D0", "H", "toString", "()Ljava/lang/String;", "A1", "s0", "L1", "M1", "a", "Landroidx/compose/runtime/x3;", "i0", "()Landroidx/compose/runtime/x3;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "anchors", "e", "Ljava/util/HashMap;", "f", "groupGapStart", "g", "groupGapLen", "h", "currentSlot", "i", "currentSlotEnd", "j", "slotsGapStart", "k", "slotsGapLen", "l", "slotsGapOwner", "m", "insertCount", "n", "nodeCount", "Landroidx/compose/runtime/n1;", "o", "Landroidx/compose/runtime/n1;", "startStack", "p", "endStack", "q", "nodeCountStack", "<set-?>", "r", "e0", "currentGroup", "s", "f0", "currentGroupEnd", "t", "g0", "u", "d0", "closed", "v", "Landroidx/compose/runtime/w2;", "pendingRecalculateMarks", "c0", "z0", "isGroupEnd", "A0", "h0", "w", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3745:1\n4178#2,5:3746\n4178#2,5:3751\n4178#2,5:3756\n4178#2,5:3761\n4178#2,5:3774\n4178#2,5:3779\n4178#2,5:3784\n4178#2,5:3789\n4178#2,5:3794\n4178#2,5:3799\n4178#2,5:3804\n4178#2,5:3809\n4178#2,5:3814\n4178#2,5:3819\n4178#2,5:3824\n4178#2,5:3829\n4178#2,5:3834\n4178#2,5:3839\n4178#2,5:3866\n4178#2,5:3871\n4178#2,5:3876\n1#3:3766\n361#4,7:3767\n166#5,8:3844\n166#5,8:3852\n3616#6,6:3860\n33#7,6:3881\n82#7,3:3887\n33#7,4:3890\n85#7,2:3894\n38#7:3896\n87#7:3897\n231#7,3:3898\n64#7,4:3901\n234#7,2:3905\n69#7:3907\n236#7:3908\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1526#1:3746,5\n1550#1:3751,5\n1563#1:3756,5\n1566#1:3761,5\n1649#1:3774,5\n1670#1:3779,5\n1717#1:3784,5\n1722#1:3789,5\n1762#1:3794,5\n1773#1:3799,5\n1903#1:3804,5\n1967#1:3809,5\n1972#1:3814,5\n2004#1:3819,5\n2064#1:3824,5\n2065#1:3829,5\n2078#1:3834,5\n2172#1:3839,5\n2735#1:3866,5\n2747#1:3871,5\n2957#1:3876,5\n1611#1:3767,7\n2479#1:3844,8\n2520#1:3852,8\n2540#1:3860,6\n3058#1:3881,6\n3228#1:3887,3\n3228#1:3890,4\n3228#1:3894,2\n3228#1:3896\n3228#1:3897\n3231#1:3898,3\n3231#1:3901,4\n3231#1:3905,2\n3231#1:3907\n3231#1:3908\n*E\n"})
/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: x, reason: collision with root package name */
    public static final int f15909x = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] slots;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ArrayList<d> anchors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private HashMap<d, j1> sourceInformationMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int groupGapStart;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int groupGapLen;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int slotsGapStart;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotsGapLen;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int slotsGapOwner;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int insertCount;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int currentGroupEnd;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private w2 pendingRecalculateMarks;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 startStack = new n1();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 endStack = new n1();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n1 nodeCountStack = new n1();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/a4$a;", "", "<init>", "()V", "Landroidx/compose/runtime/a4;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Landroidx/compose/runtime/d;", "b", "(Landroidx/compose/runtime/a4;ILandroidx/compose/runtime/a4;ZZZ)Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3745:1\n1#2:3746\n33#3,6:3747\n4178#4,5:3753\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2302#1:3747,6\n2367#1:3753,5\n*E\n"})
    /* renamed from: androidx.compose.runtime.a4$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final List<d> b(a4 fromWriter, int fromIndex, a4 toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean z4;
            int g02;
            int g03;
            kotlin.collections.j0 j0Var;
            boolean c02;
            int V;
            HashMap hashMap;
            int g04;
            int i4;
            int m02;
            int p02 = fromWriter.p0(fromIndex);
            int i5 = fromIndex + p02;
            int R = fromWriter.R(fromIndex);
            int R2 = fromWriter.R(i5);
            int i6 = R2 - R;
            boolean O = fromWriter.O(fromIndex);
            toWriter.x0(p02);
            toWriter.y0(i6, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i5) {
                fromWriter.J0(i5);
            }
            if (fromWriter.slotsGapStart < R2) {
                fromWriter.L0(R2, i5);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            kotlin.collections.l.z0(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i5 * 5);
            Object[] objArr = toWriter.slots;
            int i7 = toWriter.currentSlot;
            kotlin.collections.l.B0(fromWriter.slots, objArr, i7, R, R2);
            int parent = toWriter.getParent();
            z3.y0(iArr, currentGroup, parent);
            int i10 = currentGroup - fromIndex;
            int i11 = currentGroup + p02;
            int S = i7 - toWriter.S(iArr, currentGroup);
            int i12 = toWriter.slotsGapOwner;
            int i13 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i14 = i12;
            int i15 = currentGroup;
            while (true) {
                z4 = false;
                if (i15 >= i11) {
                    break;
                }
                if (i15 != currentGroup) {
                    m02 = z3.m0(iArr, i15);
                    i4 = i11;
                    z3.y0(iArr, i15, m02 + i10);
                } else {
                    i4 = i11;
                }
                int i16 = S;
                z3.t0(iArr, i15, toWriter.U(toWriter.S(iArr, i15) + S, i14 >= i15 ? toWriter.slotsGapStart : 0, i13, length));
                if (i15 == i14) {
                    i14++;
                }
                i15++;
                S = i16;
                i11 = i4;
            }
            int i17 = i11;
            toWriter.slotsGapOwner = i14;
            g02 = z3.g0(fromWriter.anchors, fromIndex, fromWriter.h0());
            g03 = z3.g0(fromWriter.anchors, i5, fromWriter.h0());
            if (g02 < g03) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(g03 - g02);
                for (int i18 = g02; i18 < g03; i18++) {
                    d dVar = (d) arrayList.get(i18);
                    dVar.c(dVar.getLocation() + i10);
                    arrayList2.add(dVar);
                }
                g04 = z3.g0(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.h0());
                toWriter.anchors.addAll(g04, arrayList2);
                arrayList.subList(g02, g03).clear();
                j0Var = arrayList2;
            } else {
                j0Var = kotlin.collections.j0.f74919b;
            }
            if (!j0Var.isEmpty() && (hashMap = fromWriter.sourceInformationMap) != null) {
                HashMap hashMap2 = toWriter.sourceInformationMap;
                int size = j0Var.size();
                for (int i19 = 0; i19 < size; i19++) {
                    d dVar2 = (d) j0Var.get(i19);
                    j1 j1Var = (j1) hashMap.get(dVar2);
                    if (j1Var != null) {
                        hashMap.remove(dVar2);
                        if (hashMap2 == null) {
                            Companion companion = a4.INSTANCE;
                            hashMap2 = new HashMap();
                            toWriter.sourceInformationMap = hashMap2;
                        }
                        hashMap2.put(dVar2, j1Var);
                    }
                }
                if (hashMap.isEmpty()) {
                    fromWriter.sourceInformationMap = null;
                }
            }
            int parent2 = toWriter.getParent();
            j1 r12 = toWriter.r1(parent);
            if (r12 != null) {
                int i20 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i21 = -1;
                while (i20 < currentGroup2) {
                    V = z3.V(toWriter.groups, i20);
                    int i22 = V + i20;
                    i21 = i20;
                    i20 = i22;
                }
                r12.b(toWriter, i21, currentGroup2);
            }
            int R0 = fromWriter.R0(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z5 = R0 >= 0;
                    if (z5) {
                        fromWriter.u1();
                        fromWriter.E(R0 - fromWriter.getCurrentGroup());
                        fromWriter.u1();
                    }
                    fromWriter.E(fromIndex - fromWriter.getCurrentGroup());
                    boolean b12 = fromWriter.b1();
                    if (z5) {
                        fromWriter.n1();
                        fromWriter.W();
                        fromWriter.n1();
                        fromWriter.W();
                    }
                    z4 = b12;
                } else {
                    z4 = fromWriter.c1(fromIndex, p02);
                    fromWriter.d1(R, i6, fromIndex - 1);
                }
            }
            if (z4) {
                throw u.a("Unexpectedly removed anchors");
            }
            int i23 = toWriter.nodeCount;
            c02 = z3.c0(iArr, currentGroup);
            toWriter.nodeCount = i23 + (c02 ? 1 : z3.h0(iArr, currentGroup));
            if (updateToCursor) {
                toWriter.currentGroup = i17;
                toWriter.currentSlot = i7 + i6;
            }
            if (O) {
                toWriter.E1(parent);
            }
            return j0Var;
        }

        static /* synthetic */ List c(Companion companion, a4 a4Var, int i4, a4 a4Var2, boolean z4, boolean z5, boolean z6, int i5, Object obj) {
            if ((i5 & 32) != 0) {
                z6 = true;
            }
            return companion.b(a4Var, i4, a4Var2, z4, z5, z6);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/runtime/a4$b", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Iterator<Object>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int current;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15933c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a4 f15934d;

        b(int i4, int i5, a4 a4Var) {
            this.f15933c = i5;
            this.f15934d = a4Var;
            this.current = i4;
        }

        /* renamed from: b, reason: from getter */
        public final int getCurrent() {
            return this.current;
        }

        public final void c(int i4) {
            this.current = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.f15933c;
        }

        @Override // java.util.Iterator
        @fg.m
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.f15934d.slots;
            a4 a4Var = this.f15934d;
            int i4 = this.current;
            this.current = i4 + 1;
            return objArr[a4Var.T(i4)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a4(@fg.l x3 x3Var) {
        this.table = x3Var;
        this.groups = x3Var.getGroups();
        this.slots = x3Var.getSlots();
        this.anchors = x3Var.w();
        this.sourceInformationMap = x3Var.S();
        this.groupGapStart = x3Var.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - x3Var.getGroupsSize();
        this.slotsGapStart = x3Var.getSlotsSize();
        this.slotsGapLen = this.slots.length - x3Var.getSlotsSize();
        this.slotsGapOwner = x3Var.getGroupsSize();
        this.currentGroupEnd = x3Var.getGroupsSize();
    }

    private final List<Integer> C0() {
        List f02 = z3.f0(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(f02.size());
        int size = f02.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = f02.get(i4);
            ((Number) obj).intValue();
            int i5 = this.groupGapStart;
            if (i4 < i5 || i4 >= i5 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void C1(int previousGapStart, int newGapStart) {
        int g02;
        d dVar;
        int location;
        int g03;
        d dVar2;
        int location2;
        int i4;
        int c02 = c0() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (g02 = z3.g0(this.anchors, newGapStart, c02); g02 < this.anchors.size() && (location = (dVar = this.anchors.get(g02)).getLocation()) >= 0; g02++) {
                dVar.c(-(c02 - location));
            }
            return;
        }
        for (g03 = z3.g0(this.anchors, previousGapStart, c02); g03 < this.anchors.size() && (location2 = (dVar2 = this.anchors.get(g03)).getLocation()) < 0 && (i4 = location2 + c02) < newGapStart; g03++) {
            dVar2.c(i4);
        }
    }

    public static /* synthetic */ void E0(a4 a4Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = a4Var.parent;
        }
        a4Var.D0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E1(int group) {
        if (group >= 0) {
            w2 w2Var = this.pendingRecalculateMarks;
            if (w2Var == null) {
                w2Var = new w2(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = w2Var;
            }
            w2Var.a(group);
        }
    }

    private final void F0(int originalLocation, int newLocation, int size) {
        int g02;
        int g03;
        d dVar;
        int H;
        int i4 = size + originalLocation;
        int h02 = h0();
        g02 = z3.g0(this.anchors, originalLocation, h02);
        ArrayList arrayList = new ArrayList();
        if (g02 >= 0) {
            while (g02 < this.anchors.size() && (H = H((dVar = this.anchors.get(g02)))) >= originalLocation && H < i4) {
                arrayList.add(dVar);
                this.anchors.remove(g02);
            }
        }
        int i5 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            d dVar2 = (d) arrayList.get(i6);
            int H2 = H(dVar2) + i5;
            if (H2 >= this.groupGapStart) {
                dVar2.c(-(h02 - H2));
            } else {
                dVar2.c(H2);
            }
            g03 = z3.g0(this.anchors, H2, h02);
            this.anchors.add(g03, dVar2);
        }
    }

    private final void F1(int group, w2 set) {
        boolean L;
        int m02 = m0(group);
        boolean L2 = L(group);
        L = z3.L(this.groups, m02);
        if (L != L2) {
            z3.s0(this.groups, m02, L2);
            int T0 = T0(this.groups, group);
            if (T0 >= 0) {
                set.a(T0);
            }
        }
    }

    public static /* synthetic */ d G(a4 a4Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = a4Var.currentGroup;
        }
        return a4Var.F(i4);
    }

    private final void G1(int[] iArr, int i4, int i5) {
        z3.t0(iArr, i4, U(i5, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    public static /* synthetic */ List H0(a4 a4Var, x3 x3Var, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        return a4Var.G0(x3Var, i4, z4);
    }

    private final int I(int[] iArr, int i4) {
        int U;
        int M;
        int S = S(iArr, i4);
        U = z3.U(iArr, i4);
        M = z3.M(U >> 29);
        return M + S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(int index) {
        int m02;
        int i4 = this.groupGapLen;
        int i5 = this.groupGapStart;
        if (i5 != index) {
            if (!this.anchors.isEmpty()) {
                C1(i5, index);
            }
            if (i4 > 0) {
                int[] iArr = this.groups;
                int i6 = index * 5;
                int i7 = i4 * 5;
                int i10 = i5 * 5;
                if (index < i5) {
                    kotlin.collections.l.z0(iArr, iArr, i7 + i6, i6, i10);
                } else {
                    kotlin.collections.l.z0(iArr, iArr, i10, i10 + i7, i6 + i7);
                }
            }
            if (index < i5) {
                i5 = index + i4;
            }
            int c02 = c0();
            x.l0(i5 < c02);
            while (i5 < c02) {
                m02 = z3.m0(this.groups, i5);
                int V0 = V0(U0(m02), index);
                if (V0 != m02) {
                    z3.y0(this.groups, i5, V0);
                }
                i5++;
                if (i5 == index) {
                    i5 += i4;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J1(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.m0(r4)
            int[] r1 = r3.groups
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = androidx.compose.runtime.z3.p(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.slots
            int[] r1 = r3.groups
            int r0 = r3.S(r1, r0)
            int r0 = r3.T(r0)
            r4[r0] = r5
            return
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Updating the node of a group at "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            androidx.compose.runtime.x.x(r4)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.a4.J1(int, java.lang.Object):void");
    }

    private final boolean L(int group) {
        boolean K;
        int i4 = group + 1;
        int p02 = p0(group) + group;
        while (i4 < p02) {
            K = z3.K(this.groups, m0(i4));
            if (K) {
                return true;
            }
            i4 += p0(i4);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(int index, int group) {
        int N;
        int N2;
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != index) {
            Object[] objArr = this.slots;
            if (index < i5) {
                kotlin.collections.l.B0(objArr, objArr, index + i4, index, i5);
            } else {
                kotlin.collections.l.B0(objArr, objArr, i5, i5 + i4, index + i4);
            }
        }
        int min = Math.min(group + 1, h0());
        if (i6 != min) {
            int length = this.slots.length - i4;
            if (min < i6) {
                int m02 = m0(min);
                int m03 = m0(i6);
                int i7 = this.groupGapStart;
                while (m02 < m03) {
                    N2 = z3.N(this.groups, m02);
                    if (!(N2 >= 0)) {
                        throw u.a("Unexpected anchor value, expected a positive anchor");
                    }
                    z3.t0(this.groups, m02, -((length - N2) + 1));
                    m02++;
                    if (m02 == i7) {
                        m02 += this.groupGapLen;
                    }
                }
            } else {
                int m04 = m0(i6);
                int m05 = m0(min);
                while (m04 < m05) {
                    N = z3.N(this.groups, m04);
                    if (!(N < 0)) {
                        throw u.a("Unexpected anchor value, expected a negative anchor");
                    }
                    z3.t0(this.groups, m04, N + length + 1);
                    m04++;
                    if (m04 == this.groupGapStart) {
                        m04 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = index;
    }

    private final void M() {
        int i4 = this.slotsGapStart;
        kotlin.collections.l.M1(this.slots, null, i4, this.slotsGapLen + i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(int group) {
        boolean K;
        if (group >= 0) {
            K = z3.K(this.groups, m0(group));
            if (K) {
                return true;
            }
        }
        return false;
    }

    private final boolean P(int group) {
        boolean L;
        if (group >= 0) {
            L = z3.L(this.groups, m0(group));
            if (L) {
                return true;
            }
        }
        return false;
    }

    private final int Q(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    private final int Q0(int[] iArr, int i4) {
        return S(iArr, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int index) {
        return S(this.groups, m0(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int[] iArr, int i4) {
        int N;
        if (i4 >= c0()) {
            return this.slots.length - this.slotsGapLen;
        }
        N = z3.N(iArr, i4);
        return Q(N, this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int T(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    private final int T0(int[] iArr, int i4) {
        int m02;
        m02 = z3.m0(iArr, m0(i4));
        return U0(m02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int U(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final int U0(int index) {
        return index > -2 ? index : h0() + index + 2;
    }

    private final List<Integer> V(int[] iArr) {
        List P = z3.P(this.groups, 0, 1, null);
        List D4 = kotlin.collections.w.D4(kotlin.collections.w.m5(P, kotlin.ranges.s.W1(0, this.groupGapStart)), kotlin.collections.w.m5(P, kotlin.ranges.s.W1(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(D4.size());
        int size = D4.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(Integer.valueOf(Q(((Number) D4.get(i4)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final int V0(int index, int gapStart) {
        return index < gapStart ? index : -((h0() - index) + 2);
    }

    private final void W0() {
        w2 w2Var = this.pendingRecalculateMarks;
        if (w2Var != null) {
            while (w2Var.c()) {
                F1(w2Var.e(), w2Var);
            }
        }
    }

    private final void a0(int parent, int endGroup, int firstChild) {
        int V;
        int V0 = V0(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            z3.y0(this.groups, m0(firstChild), V0);
            V = z3.V(this.groups, m0(firstChild));
            int i4 = V + firstChild;
            a0(firstChild, i4, firstChild + 1);
            firstChild = i4;
        }
    }

    private final boolean a1(int gapStart, int size, HashMap<d, j1> sourceInformationMap) {
        int g02;
        int i4 = size + gapStart;
        g02 = z3.g0(this.anchors, i4, c0() - this.groupGapLen);
        if (g02 >= this.anchors.size()) {
            g02--;
        }
        int i5 = g02 + 1;
        int i6 = 0;
        while (g02 >= 0) {
            d dVar = this.anchors.get(g02);
            int H = H(dVar);
            if (H < gapStart) {
                break;
            }
            if (H < i4) {
                dVar.c(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(dVar);
                }
                if (i6 == 0) {
                    i6 = g02 + 1;
                }
                i5 = g02;
            }
            g02--;
        }
        boolean z4 = i5 < i6;
        if (z4) {
            this.anchors.subList(i5, i6).clear();
        }
        return z4;
    }

    private final int c0() {
        return this.groups.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c1(int start, int len) {
        if (len > 0) {
            ArrayList<d> arrayList = this.anchors;
            J0(start);
            r0 = arrayList.isEmpty() ? false : a1(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i4 = this.slotsGapOwner;
            if (i4 > start) {
                this.slotsGapOwner = Math.max(start, i4 - len);
            }
            int i5 = this.currentGroupEnd;
            if (i5 >= this.groupGapStart) {
                this.currentGroupEnd = i5 - len;
            }
            int i6 = this.parent;
            if (P(i6)) {
                E1(i6);
            }
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(int start, int len, int group) {
        if (len > 0) {
            int i4 = this.slotsGapLen;
            int i5 = start + len;
            L0(i5, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i4 + len;
            kotlin.collections.l.M1(this.slots, null, start, i5);
            int i6 = this.currentSlotEnd;
            if (i6 >= start) {
                this.currentSlotEnd = i6 - len;
            }
        }
    }

    private final int f1() {
        int c02 = (c0() - this.groupGapLen) - this.endStack.i();
        this.currentGroupEnd = c02;
        return c02;
    }

    private final void g1() {
        this.endStack.j((c0() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final void j0(StringBuilder sb, int i4) {
        int V;
        int m02;
        int h02;
        int N;
        int m03;
        boolean c02;
        int m04 = m0(i4);
        sb.append("Group(");
        if (i4 < 10) {
            sb.append(' ');
        }
        if (i4 < 100) {
            sb.append(' ');
        }
        if (i4 < 1000) {
            sb.append(' ');
        }
        sb.append(i4);
        if (m04 != i4) {
            sb.append("(");
            sb.append(m04);
            sb.append(")");
        }
        sb.append('#');
        V = z3.V(this.groups, m04);
        sb.append(V);
        boolean k02 = k0(this, i4);
        if (k02) {
            sb.append('?');
        }
        sb.append('^');
        m02 = z3.m0(this.groups, m04);
        sb.append(U0(m02));
        sb.append(": key=");
        sb.append(this.groups[m04 * 5]);
        sb.append(", nodes=");
        h02 = z3.h0(this.groups, m04);
        sb.append(h02);
        if (k02) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        N = z3.N(this.groups, m04);
        sb.append(N);
        sb.append(", parentAnchor=");
        m03 = z3.m0(this.groups, m04);
        sb.append(m03);
        c02 = z3.c0(this.groups, m04);
        if (c02) {
            sb.append(", node=" + this.slots[T(S(this.groups, m04))]);
        }
        int q12 = q1(this.groups, m04);
        int S = S(this.groups, m04 + 1);
        if (S > q12) {
            sb.append(", [");
            for (int i5 = q12; i5 < S; i5++) {
                if (i5 != q12) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[T(i5)]));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    private static final boolean k0(a4 a4Var, int i4) {
        return i4 < a4Var.currentGroup && (i4 == a4Var.parent || a4Var.startStack.c(i4) >= 0 || k0(a4Var, a4Var.T0(a4Var.groups, i4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int m0(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q1(int[] iArr, int i4) {
        int r02;
        if (i4 >= c0()) {
            return this.slots.length - this.slotsGapLen;
        }
        r02 = z3.r0(iArr, i4);
        return Q(r02, this.slotsGapLen, this.slots.length);
    }

    private final j1 r0(int parent, String sourceInformation) {
        int V;
        HashMap<d, j1> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        this.sourceInformationMap = hashMap;
        d F = F(parent);
        j1 j1Var = hashMap.get(F);
        if (j1Var == null) {
            j1Var = new j1(0, sourceInformation);
            if (sourceInformation == null) {
                int i4 = parent + 1;
                int i5 = this.currentGroup;
                while (i4 < i5) {
                    j1Var.m(this, i4);
                    V = z3.V(this.groups, i4);
                    i4 += V;
                }
            }
            hashMap.put(F, j1Var);
        }
        return j1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j1 r1(int group) {
        d A1;
        HashMap<d, j1> hashMap = this.sourceInformationMap;
        if (hashMap == null || (A1 = A1(group)) == null) {
            return null;
        }
        return hashMap.get(A1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(int size) {
        if (size > 0) {
            int i4 = this.currentGroup;
            J0(i4);
            int i5 = this.groupGapStart;
            int i6 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i7 = length - i6;
            if (i6 < size) {
                int max = Math.max(Math.max(length * 2, i7 + size), 32);
                int[] iArr2 = new int[max * 5];
                int i10 = max - i7;
                kotlin.collections.l.z0(iArr, iArr2, 0, 0, i5 * 5);
                kotlin.collections.l.z0(iArr, iArr2, (i5 + i10) * 5, (i6 + i5) * 5, length * 5);
                this.groups = iArr2;
                i6 = i10;
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= i5) {
                this.currentGroupEnd = i11 + size;
            }
            int i12 = i5 + size;
            this.groupGapStart = i12;
            this.groupGapLen = i6 - size;
            int U = U(i7 > 0 ? R(i4 + size) : 0, this.slotsGapOwner >= i5 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i13 = i5; i13 < i12; i13++) {
                z3.t0(this.groups, i13, U);
            }
            int i14 = this.slotsGapOwner;
            if (i14 >= i5) {
                this.slotsGapOwner = i14 + size;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x1(int key, Object objectKey, boolean isNode, Object aux) {
        int h02;
        int V;
        int i4;
        j1 r12;
        int i5 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.j(this.nodeCount);
        if (objArr == true) {
            x0(1);
            int i6 = this.currentGroup;
            int m02 = m0(i6);
            t.Companion companion = t.INSTANCE;
            int i7 = objectKey != companion.a() ? 1 : 0;
            int i10 = (isNode || aux == companion.a()) ? 0 : 1;
            z3.b0(this.groups, m02, key, isNode, i7, i10, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i11 = (isNode ? 1 : 0) + i7 + i10;
            if (i11 > 0) {
                y0(i11, i6);
                Object[] objArr2 = this.slots;
                int i12 = this.currentSlot;
                if (isNode) {
                    objArr2[i12] = aux;
                    i12++;
                }
                if (i7 != 0) {
                    objArr2[i12] = objectKey;
                    i12++;
                }
                if (i10 != 0) {
                    objArr2[i12] = aux;
                    i12++;
                }
                this.currentSlot = i12;
            }
            this.nodeCount = 0;
            i4 = i6 + 1;
            this.parent = i6;
            this.currentGroup = i4;
            if (i5 >= 0 && (r12 = r1(i5)) != null) {
                r12.m(this, i6);
            }
        } else {
            this.startStack.j(i5);
            g1();
            int i13 = this.currentGroup;
            int m03 = m0(i13);
            if (!kotlin.jvm.internal.l0.g(aux, t.INSTANCE.a())) {
                if (isNode) {
                    I1(aux);
                } else {
                    D1(aux);
                }
            }
            this.currentSlot = q1(this.groups, m03);
            this.currentSlotEnd = S(this.groups, m0(this.currentGroup + 1));
            h02 = z3.h0(this.groups, m03);
            this.nodeCount = h02;
            this.parent = i13;
            this.currentGroup = i13 + 1;
            V = z3.V(this.groups, m03);
            i4 = i13 + V;
        }
        this.currentGroupEnd = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(int size, int group) {
        if (size > 0) {
            L0(this.currentSlot, group);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            if (i5 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i6 = length - i5;
                int max = Math.max(Math.max(length * 2, i6 + size), 32);
                Object[] objArr2 = new Object[max];
                for (int i7 = 0; i7 < max; i7++) {
                    objArr2[i7] = null;
                }
                int i10 = max - i6;
                kotlin.collections.l.B0(objArr, objArr2, 0, 0, i4);
                kotlin.collections.l.B0(objArr, objArr2, i4 + i10, i5 + i4, length);
                this.slots = objArr2;
                i5 = i10;
            }
            int i11 = this.currentSlotEnd;
            if (i11 >= i4) {
                this.currentSlotEnd = i11 + size;
            }
            this.slotsGapStart = i4 + size;
            this.slotsGapLen = i5 - size;
        }
    }

    public final boolean A0() {
        boolean c02;
        int i4 = this.currentGroup;
        if (i4 < this.currentGroupEnd) {
            c02 = z3.c0(this.groups, m0(i4));
            if (c02) {
                return true;
            }
        }
        return false;
    }

    @fg.m
    public final d A1(int group) {
        d S;
        if (group < 0 || group >= h0()) {
            return null;
        }
        S = z3.S(this.anchors, group, h0());
        return S;
    }

    public final boolean B0(int index) {
        boolean c02;
        c02 = z3.c0(this.groups, m0(index));
        return c02;
    }

    @fg.m
    public final Object B1(@fg.m Object value) {
        Object l12 = l1();
        k1(value);
        return l12;
    }

    public final void D0(int group) {
        boolean Z;
        boolean L;
        int m02 = m0(group);
        Z = z3.Z(this.groups, m02);
        if (Z) {
            return;
        }
        z3.w0(this.groups, m02, true);
        L = z3.L(this.groups, m02);
        if (L) {
            return;
        }
        E1(T0(this.groups, group));
    }

    public final void D1(@fg.m Object value) {
        boolean Y;
        int m02 = m0(this.currentGroup);
        Y = z3.Y(this.groups, m02);
        if (!Y) {
            throw u.a("Updating the data of a group that was not created with a data slot");
        }
        this.slots[T(I(this.groups, m02))] = value;
    }

    public final void E(int amount) {
        boolean z4 = false;
        if (!(amount >= 0)) {
            throw u.a("Cannot seek backwards");
        }
        if (this.insertCount > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i4 = this.currentGroup + amount;
        if (i4 >= this.parent && i4 <= this.currentGroupEnd) {
            z4 = true;
        }
        if (z4) {
            this.currentGroup = i4;
            int S = S(this.groups, m0(i4));
            this.currentSlot = S;
            this.currentSlotEnd = S;
            return;
        }
        x.x(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    @fg.l
    public final d F(int index) {
        int p02;
        ArrayList<d> arrayList = this.anchors;
        p02 = z3.p0(arrayList, index, h0());
        if (p02 >= 0) {
            return arrayList.get(p02);
        }
        if (index > this.groupGapStart) {
            index = -(h0() - index);
        }
        d dVar = new d(index);
        arrayList.add(-(p02 + 1), dVar);
        return dVar;
    }

    @fg.l
    public final List<d> G0(@fg.l x3 table, int index, boolean removeSourceGroup) {
        int V;
        x.l0(this.insertCount > 0);
        if (index == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            V = z3.V(table.getGroups(), index);
            if (V == table.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<d> arrayList = this.anchors;
                HashMap<d, j1> hashMap = this.sourceInformationMap;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                HashMap<d, j1> S = table.S();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.w();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = S;
                table.k0(iArr, 0, objArr, 0, arrayList, hashMap);
                return this.anchors;
            }
        }
        a4 e02 = table.e0();
        try {
            return INSTANCE.b(e02, index, this, true, true, removeSourceGroup);
        } finally {
            e02.N();
        }
    }

    public final int H(@fg.l d anchor) {
        int location = anchor.getLocation();
        return location < 0 ? location + h0() : location;
    }

    public final void H1(@fg.l d anchor, @fg.m Object value) {
        anchor.getClass();
        J1(H(anchor), value);
    }

    public final void I0(int offset) {
        int V;
        int V2;
        if (!(this.insertCount == 0)) {
            throw u.a("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            throw u.a("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i4 = this.currentGroup;
        int i5 = this.parent;
        int i6 = this.currentGroupEnd;
        int i7 = i4;
        for (int i10 = offset; i10 > 0; i10--) {
            V2 = z3.V(this.groups, m0(i7));
            i7 += V2;
            if (!(i7 <= i6)) {
                throw u.a("Parameter offset is out of bounds");
            }
        }
        V = z3.V(this.groups, m0(i7));
        int i11 = this.currentSlot;
        int S = S(this.groups, m0(i7));
        int i12 = i7 + V;
        int S2 = S(this.groups, m0(i12));
        int i13 = S2 - S;
        y0(i13, Math.max(this.currentGroup - 1, 0));
        x0(V);
        int[] iArr = this.groups;
        int m02 = m0(i12) * 5;
        kotlin.collections.l.z0(iArr, iArr, m0(i4) * 5, m02, (V * 5) + m02);
        if (i13 > 0) {
            Object[] objArr = this.slots;
            kotlin.collections.l.B0(objArr, objArr, i11, T(S + i13), T(S2 + i13));
        }
        int i14 = S + i13;
        int i15 = i14 - i11;
        int i16 = this.slotsGapStart;
        int i17 = this.slotsGapLen;
        int length = this.slots.length;
        int i18 = this.slotsGapOwner;
        int i19 = i4 + V;
        int i20 = i4;
        while (i20 < i19) {
            int m03 = m0(i20);
            int i21 = i16;
            int i22 = i15;
            G1(iArr, m03, U(S(iArr, m03) - i15, i18 < m03 ? 0 : i21, i17, length));
            i20++;
            i16 = i21;
            i15 = i22;
        }
        F0(i12, i4, V);
        if (c1(i12, V)) {
            throw u.a("Unexpectedly removed anchors");
        }
        a0(i5, this.currentGroupEnd, i4);
        if (i13 > 0) {
            d1(i14, i13, i12 - 1);
        }
    }

    public final void I1(@fg.m Object value) {
        J1(this.currentGroup, value);
    }

    public final void J() {
        z3.u0(this.groups, this.currentGroup, -3);
    }

    public final void K() {
        int i4 = this.insertCount;
        this.insertCount = i4 + 1;
        if (i4 == 0) {
            g1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (p0(r12.currentGroup + r13) == 1) goto L8;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.d> K0(int r13, @fg.l androidx.compose.runtime.x3 r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.insertCount
            if (r0 > 0) goto Lf
            int r0 = r12.currentGroup
            int r0 = r0 + r13
            int r0 = r12.p0(r0)
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            androidx.compose.runtime.x.l0(r1)
            int r0 = r12.currentGroup
            int r1 = r12.currentSlot
            int r2 = r12.currentSlotEnd
            r12.E(r13)
            r12.u1()
            r12.K()
            androidx.compose.runtime.a4 r13 = r14.e0()
            androidx.compose.runtime.a4$a r3 = androidx.compose.runtime.a4.INSTANCE     // Catch: java.lang.Throwable -> L45
            r10 = 32
            r11 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = androidx.compose.runtime.a4.Companion.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L45
            r13.N()
            r12.X()
            r12.W()
            r12.currentGroup = r0
            r12.currentSlot = r1
            r12.currentSlotEnd = r2
            return r14
        L45:
            r14 = move-exception
            r13.N()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.a4.K0(int, androidx.compose.runtime.x3, int):java.util.List");
    }

    public final void K1(@fg.m Object value) {
        J1(this.parent, value);
    }

    public final void L1() {
        int N;
        int i4 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int h02 = h0();
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        while (i5 < h02) {
            int m02 = m0(i5);
            N = z3.N(this.groups, m02);
            int S = S(this.groups, m02);
            if (S < i6) {
                StringBuilder a5 = androidx.collection.n1.a("Data index out of order at ", i5, ", previous = ", i6, ", current = ");
                a5.append(S);
                throw new IllegalStateException(a5.toString().toString());
            }
            if (S > length) {
                throw new IllegalStateException(androidx.compose.foundation.text.q.a("Data index, ", S, ", out of bound at ", i5).toString());
            }
            if (N < 0 && !z4) {
                if (i4 != i5) {
                    throw new IllegalStateException(androidx.compose.foundation.text.q.a("Expected the slot gap owner to be ", i4, " found gap at ", i5).toString());
                }
                z4 = true;
            }
            i5++;
            i6 = S;
        }
    }

    @fg.l
    public final List<d> M0(@fg.l d anchor, int offset, @fg.l a4 writer) {
        int V;
        boolean c02;
        int h02;
        x.l0(writer.insertCount > 0);
        x.l0(this.insertCount == 0);
        x.l0(anchor.b());
        int H = H(anchor) + offset;
        int i4 = this.currentGroup;
        x.l0(i4 <= H && H < this.currentGroupEnd);
        int T0 = T0(this.groups, H);
        int p02 = p0(H);
        int P0 = B0(H) ? 1 : P0(H);
        List<d> c5 = Companion.c(INSTANCE, this, H, writer, false, false, false, 32, null);
        E1(T0);
        boolean z4 = P0 > 0;
        while (T0 >= i4) {
            int m02 = m0(T0);
            int[] iArr = this.groups;
            V = z3.V(iArr, m02);
            z3.v0(iArr, m02, V - p02);
            if (z4) {
                c02 = z3.c0(this.groups, m02);
                if (c02) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.groups;
                    h02 = z3.h0(iArr2, m02);
                    z3.x0(iArr2, m02, h02 - P0);
                }
            }
            T0 = T0(this.groups, T0);
        }
        if (z4) {
            x.l0(this.nodeCount >= P0);
            this.nodeCount -= P0;
        }
        return c5;
    }

    public final void M1() {
        int m02;
        int m03;
        int i4 = this.groupGapStart;
        int i5 = this.groupGapLen;
        int c02 = c0();
        for (int i6 = 0; i6 < i4; i6++) {
            m03 = z3.m0(this.groups, i6);
            if (m03 <= -2) {
                throw new IllegalStateException(android.support.v4.media.a.a("Expected a start relative anchor at ", i6).toString());
            }
        }
        for (int i7 = i5 + i4; i7 < c02; i7++) {
            m02 = z3.m0(this.groups, i7);
            if (U0(m02) < i4) {
                if (m02 <= -2) {
                    throw new IllegalStateException(android.support.v4.media.a.a("Expected a start relative anchor at ", i7).toString());
                }
            } else if (m02 > -2) {
                throw new IllegalStateException(android.support.v4.media.a.a("Expected an end relative anchor at ", i7).toString());
            }
        }
    }

    public final void N() {
        this.closed = true;
        if (this.startStack.d()) {
            J0(h0());
            L0(this.slots.length - this.slotsGapLen, this.groupGapStart);
            M();
            W0();
        }
        this.table.m(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap);
    }

    @fg.m
    public final Object N0(int index) {
        boolean c02;
        int m02 = m0(index);
        c02 = z3.c0(this.groups, m02);
        if (c02) {
            return this.slots[T(S(this.groups, m02))];
        }
        return null;
    }

    @fg.m
    public final Object O0(@fg.l d anchor) {
        anchor.getClass();
        return N0(H(anchor));
    }

    public final int P0(int index) {
        int h02;
        h02 = z3.h0(this.groups, m0(index));
        return h02;
    }

    public final int R0(int index) {
        return T0(this.groups, index);
    }

    public final int S0(@fg.l d anchor) {
        if (anchor.b()) {
            return T0(this.groups, H(anchor));
        }
        return -1;
    }

    public final int W() {
        boolean c02;
        int V;
        int h02;
        boolean c03;
        int h03;
        int V2;
        boolean z4 = this.insertCount > 0;
        int i4 = this.currentGroup;
        int i5 = this.currentGroupEnd;
        int i6 = this.parent;
        int m02 = m0(i6);
        int i7 = this.nodeCount;
        int i10 = i4 - i6;
        c02 = z3.c0(this.groups, m02);
        if (z4) {
            z3.v0(this.groups, m02, i10);
            z3.x0(this.groups, m02, i7);
            this.nodeCount = this.nodeCountStack.i() + (c02 ? 1 : i7);
            this.parent = T0(this.groups, i6);
        } else {
            if ((i4 != i5 ? 0 : 1) == 0) {
                throw u.a("Expected to be at the end of a group");
            }
            V = z3.V(this.groups, m02);
            h02 = z3.h0(this.groups, m02);
            z3.v0(this.groups, m02, i10);
            z3.x0(this.groups, m02, i7);
            int i11 = this.startStack.i();
            f1();
            this.parent = i11;
            int T0 = T0(this.groups, i6);
            int i12 = this.nodeCountStack.i();
            this.nodeCount = i12;
            if (T0 == i11) {
                this.nodeCount = i12 + (c02 ? 0 : i7 - h02);
            } else {
                int i13 = i10 - V;
                int i14 = c02 ? 0 : i7 - h02;
                if (i13 != 0 || i14 != 0) {
                    while (T0 != 0 && T0 != i11 && (i14 != 0 || i13 != 0)) {
                        int m03 = m0(T0);
                        if (i13 != 0) {
                            V2 = z3.V(this.groups, m03);
                            z3.v0(this.groups, m03, V2 + i13);
                        }
                        if (i14 != 0) {
                            int[] iArr = this.groups;
                            h03 = z3.h0(iArr, m03);
                            z3.x0(iArr, m03, h03 + i14);
                        }
                        c03 = z3.c0(this.groups, m03);
                        if (c03) {
                            i14 = 0;
                        }
                        T0 = T0(this.groups, T0);
                    }
                }
                this.nodeCount += i14;
            }
        }
        return i7;
    }

    public final void X() {
        int i4 = this.insertCount;
        if (i4 <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        int i5 = i4 - 1;
        this.insertCount = i5;
        if (i5 == 0) {
            if (!(this.nodeCountStack.getTos() == this.startStack.getTos())) {
                throw u.a("startGroup/endGroup mismatch while inserting");
            }
            f1();
        }
    }

    public final void X0(@fg.l String sourceInformation) {
        if (this.insertCount > 0) {
            r0(this.parent, sourceInformation);
        }
    }

    public final void Y(int index) {
        boolean z4 = false;
        if (!(this.insertCount <= 0)) {
            throw u.a("Cannot call ensureStarted() while inserting");
        }
        int i4 = this.parent;
        if (i4 != index) {
            if (index >= i4 && index < this.currentGroupEnd) {
                z4 = true;
            }
            if (!z4) {
                x.x(("Started group at " + index + " must be a subgroup of the group at " + i4).toString());
                throw new KotlinNothingValueException();
            }
            int i5 = this.currentGroup;
            int i6 = this.currentSlot;
            int i7 = this.currentSlotEnd;
            this.currentGroup = index;
            u1();
            this.currentGroup = i5;
            this.currentSlot = i6;
            this.currentSlotEnd = i7;
        }
    }

    public final void Y0() {
        if (this.insertCount > 0) {
            r0(this.parent, null).d();
        }
    }

    public final void Z(@fg.l d anchor) {
        anchor.getClass();
        Y(H(anchor));
    }

    public final void Z0(int key, @fg.l String value) {
        if (this.insertCount > 0) {
            r0(this.parent, null).q(key, value);
        }
    }

    public final void b0(int group, @fg.l ld.p<? super Integer, Object, kotlin.k2> block) {
        int q12 = q1(this.groups, m0(group));
        int S = S(this.groups, m0(group + 1));
        for (int i4 = q12; i4 < S; i4++) {
            block.invoke(Integer.valueOf(i4 - q12), this.slots[T(i4)]);
        }
    }

    public final boolean b1() {
        d A1;
        if (!(this.insertCount == 0)) {
            throw u.a("Cannot remove group while inserting");
        }
        int i4 = this.currentGroup;
        int i5 = this.currentSlot;
        int m12 = m1();
        j1 r12 = r1(this.parent);
        if (r12 != null && (A1 = A1(i4)) != null) {
            r12.k(A1);
        }
        w2 w2Var = this.pendingRecalculateMarks;
        if (w2Var != null) {
            while (w2Var.c() && w2Var.d() >= i4) {
                w2Var.e();
            }
        }
        boolean c12 = c1(i4, this.currentGroup - i4);
        d1(i5, this.currentSlot - i5, i4 - 1);
        this.currentGroup = i4;
        this.currentSlot = i5;
        this.nodeCount -= m12;
        return c12;
    }

    /* renamed from: d0, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: e0, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final void e1() {
        if (!(this.insertCount == 0)) {
            throw u.a("Cannot reset when inserting");
        }
        W0();
        this.currentGroup = 0;
        this.currentGroupEnd = c0() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    /* renamed from: f0, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    /* renamed from: g0, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int h0() {
        return c0() - this.groupGapLen;
    }

    public final void h1(@fg.l d anchor) {
        anchor.getClass();
        E(H(anchor) - this.currentGroup);
    }

    @fg.l
    /* renamed from: i0, reason: from getter */
    public final x3 getTable() {
        return this.table;
    }

    @fg.m
    public final Object i1(int group, int index, @fg.m Object value) {
        int q12 = q1(this.groups, m0(group));
        int i4 = q12 + index;
        if (i4 >= q12 && i4 < S(this.groups, m0(group + 1))) {
            int T = T(i4);
            Object[] objArr = this.slots;
            Object obj = objArr[T];
            objArr[T] = value;
            return obj;
        }
        x.x(("Write to an invalid slot index " + index + " for group " + group).toString());
        throw new KotlinNothingValueException();
    }

    @fg.m
    public final Object j1(int index, @fg.m Object value) {
        return i1(this.currentGroup, index, value);
    }

    public final void k1(@fg.m Object value) {
        int i4 = this.currentSlot;
        if (!(i4 <= this.currentSlotEnd)) {
            throw u.a("Writing to an invalid slot");
        }
        this.slots[T(i4 - 1)] = value;
    }

    @fg.m
    public final Object l0(int index) {
        boolean Y;
        int m02 = m0(index);
        Y = z3.Y(this.groups, m02);
        return Y ? this.slots[I(this.groups, m02)] : t.INSTANCE.a();
    }

    @fg.m
    public final Object l1() {
        if (this.insertCount > 0) {
            y0(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i4 = this.currentSlot;
        this.currentSlot = i4 + 1;
        return objArr[T(i4)];
    }

    public final int m1() {
        int V;
        boolean c02;
        int h02;
        int m02 = m0(this.currentGroup);
        int i4 = this.currentGroup;
        V = z3.V(this.groups, m02);
        int i5 = V + i4;
        this.currentGroup = i5;
        this.currentSlot = S(this.groups, m0(i5));
        c02 = z3.c0(this.groups, m02);
        if (c02) {
            return 1;
        }
        h02 = z3.h0(this.groups, m02);
        return h02;
    }

    public final int n0(int index) {
        return this.groups[m0(index) * 5];
    }

    public final void n1() {
        int i4 = this.currentGroupEnd;
        this.currentGroup = i4;
        this.currentSlot = S(this.groups, m0(i4));
    }

    @fg.m
    public final Object o0(int index) {
        boolean a02;
        int l02;
        int m02 = m0(index);
        a02 = z3.a0(this.groups, m02);
        if (!a02) {
            return null;
        }
        Object[] objArr = this.slots;
        l02 = z3.l0(this.groups, m02);
        return objArr[l02];
    }

    @fg.m
    public final Object o1(int groupIndex, int index) {
        int q12 = q1(this.groups, m0(groupIndex));
        int S = S(this.groups, m0(groupIndex + 1));
        int i4 = index + q12;
        if (q12 > i4 || i4 >= S) {
            return t.INSTANCE.a();
        }
        return this.slots[T(i4)];
    }

    public final int p0(int index) {
        int V;
        V = z3.V(this.groups, m0(index));
        return V;
    }

    @fg.m
    public final Object p1(@fg.l d anchor, int index) {
        return o1(H(anchor), index);
    }

    @fg.l
    public final Iterator<Object> q0() {
        int S = S(this.groups, m0(this.currentGroup));
        int[] iArr = this.groups;
        int i4 = this.currentGroup;
        return new b(S, S(iArr, m0(p0(i4) + i4)), this);
    }

    @fg.l
    public final String s0() {
        StringBuilder sb = new StringBuilder();
        int h02 = h0();
        for (int i4 = 0; i4 < h02; i4++) {
            j0(sb, i4);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void s1(int key, @fg.m Object aux) {
        x1(key, t.INSTANCE.a(), false, aux);
    }

    public final boolean t0(int index) {
        return u0(index, this.currentGroup);
    }

    public final void t1(int key, @fg.m Object objectKey, @fg.m Object aux) {
        x1(key, objectKey, false, aux);
    }

    @fg.l
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + h0() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final boolean u0(int index, int group) {
        int c02;
        int p02;
        if (group == this.parent) {
            c02 = this.currentGroupEnd;
        } else {
            if (group > this.startStack.h(0)) {
                p02 = p0(group);
            } else {
                int c5 = this.startStack.c(group);
                if (c5 < 0) {
                    p02 = p0(group);
                } else {
                    c02 = (c0() - this.groupGapLen) - this.endStack.g(c5);
                }
            }
            c02 = p02 + group;
        }
        return index > group && index < c02;
    }

    public final void u1() {
        if (!(this.insertCount == 0)) {
            throw u.a("Key must be supplied when inserting");
        }
        t.Companion companion = t.INSTANCE;
        x1(0, companion.a(), false, companion.a());
    }

    public final boolean v0(int index) {
        int i4 = this.parent;
        return (index > i4 && index < this.currentGroupEnd) || (i4 == 0 && index == 0);
    }

    public final void v1(int key) {
        t.Companion companion = t.INSTANCE;
        x1(key, companion.a(), false, companion.a());
    }

    public final void w0(@fg.m Object value) {
        boolean Y;
        if (!(this.insertCount >= 0)) {
            throw u.a("Cannot insert auxiliary data when not inserting");
        }
        int i4 = this.parent;
        int m02 = m0(i4);
        Y = z3.Y(this.groups, m02);
        if (Y) {
            throw u.a("Group already has auxiliary data");
        }
        y0(1, i4);
        int I = I(this.groups, m02);
        int T = T(I);
        int i5 = this.currentSlot;
        if (i5 > I) {
            int i6 = i5 - I;
            if (i6 >= 3) {
                throw new IllegalStateException("Moving more than two slot not supported");
            }
            if (i6 > 1) {
                Object[] objArr = this.slots;
                objArr[T + 2] = objArr[T + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[T + 1] = objArr2[T];
        }
        z3.I(this.groups, m02);
        this.slots[T] = value;
        this.currentSlot++;
    }

    public final void w1(int key, @fg.m Object dataKey) {
        x1(key, dataKey, false, t.INSTANCE.a());
    }

    public final void y1(int key, @fg.m Object objectKey) {
        x1(key, objectKey, true, t.INSTANCE.a());
    }

    public final boolean z0() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final void z1(int key, @fg.m Object objectKey, @fg.m Object node) {
        x1(key, objectKey, true, node);
    }
}
