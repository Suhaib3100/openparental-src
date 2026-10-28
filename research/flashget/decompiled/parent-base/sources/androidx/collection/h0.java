package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJA\u0010\u000f\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0011\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0019\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018JA\u0010\u001c\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u001aJd\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\"\u0010#Jy\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b&\u0010'Jd\u0010(\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u000026\u0010!\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b(\u0010#Jy\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001e\u001a\u00028\u00002K\u0010!\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b)\u0010'JA\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-JV\u0010.\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b.\u0010/JA\u00100\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020*0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010-JV\u00101\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020*0\u001fH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b4\u00103J@\u00106\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00020\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b8\u00103JA\u00109\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b9\u0010\u001aJA\u0010:\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b:\u0010\u001aJ\r\u0010;\u001a\u00020\u0006¢\u0006\u0004\b;\u0010\bJ\r\u0010<\u001a\u00020\u0006¢\u0006\u0004\b<\u0010\bJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0018JA\u0010=\u001a\u00020\u00022!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b=\u0010\u001aJ\u0015\u0010>\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b>\u00103JA\u0010F\u001a\u00020E2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020?2\b\b\u0002\u0010C\u001a\u00020\u00022\b\b\u0002\u0010D\u001a\u00020?H\u0007¢\u0006\u0004\bF\u0010GJ[\u0010I\u001a\u00020E2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\b\b\u0002\u0010B\u001a\u00020?2\b\b\u0002\u0010C\u001a\u00020\u00022\b\b\u0002\u0010D\u001a\u00020?2\u0014\b\u0004\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020?0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0002H\u0016¢\u0006\u0004\bK\u0010\u0018J\u001a\u0010M\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020EH\u0016¢\u0006\u0004\bO\u0010PR\u001c\u0010U\u001a\u00020Q8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010R\u0012\u0004\bS\u0010TR\u001c\u0010W\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u000f\u0010F\u0012\u0004\bV\u0010TR\u0011\u0010Y\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bX\u0010\u0018R\u0012\u0010[\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\bZ\u0010\u0018R\u0012\u0010_\u001a\u00020\\8Æ\u0002¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0001\u0001`\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006a"}, d2 = {"Landroidx/collection/h0;", "", "", "initialCapacity", "<init>", "(I)V", "", "U", "()Z", "a", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "element", "predicate", "b", "(Lld/l;)Z", "V", "c", "(I)Z", "elements", "d", "(Landroidx/collection/h0;)Z", "e", "()I", "f", "(Lld/l;)I", "i", "j", "R", "initial", "Lkotlin/Function2;", "acc", "operation", "k", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "index", "l", "(Ljava/lang/Object;Lld/q;)Ljava/lang/Object;", "m", "n", "Lkotlin/k2;", "block", "o", "(Lld/l;)V", "p", "(Lld/p;)V", "q", "r", "s", "(I)I", "g", "defaultValue", "h", "(ILld/l;)I", "y", "z", "A", "B", "C", "S", "T", "", "separator", "prefix", "postfix", "limit", "truncated", "", "I", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "J", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lld/l;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "t", "()V", "content", "x", "_size", "w", "size", "v", "lastIndex", "Lkotlin/ranges/l;", "u", "()Lkotlin/ranges/l;", "indices", "Landroidx/collection/u1;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public int[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int _size;

    public /* synthetic */ h0(int i4, kotlin.jvm.internal.w wVar) {
        this(i4);
    }

    public static /* synthetic */ String P(h0 h0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i5 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i5 & 4) == 0 ? charSequence3 : "";
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        return h0Var.I(charSequence, charSequence5, charSequence6, i6, charSequence4);
    }

    public static /* synthetic */ String Q(h0 h0Var, CharSequence separator, CharSequence prefix, CharSequence postfix, int i4, CharSequence charSequence, ld.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i5 & 1) != 0) {
            separator = ", ";
        }
        if ((i5 & 2) != 0) {
            prefix = "";
        }
        if ((i5 & 4) != 0) {
            postfix = "";
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        if ((i5 & 16) != 0) {
            charSequence = "...";
        }
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        StringBuilder a5 = r.a(charSequence, "truncated", lVar, "transform", prefix);
        int[] iArr = h0Var.content;
        int i6 = h0Var._size;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                a5.append(postfix);
                break;
            }
            int i10 = iArr[i7];
            if (i7 == i4) {
                a5.append(charSequence);
                break;
            }
            if (i7 != 0) {
                a5.append(separator);
            }
            a5.append((CharSequence) lVar.invoke(Integer.valueOf(i10)));
            i7++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @kotlin.w0
    public static /* synthetic */ void t() {
    }

    @kotlin.w0
    public static /* synthetic */ void x() {
    }

    public final int A(@fg.l ld.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i4 = this._size;
        do {
            i4--;
            if (-1 >= i4) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i4])).booleanValue());
        return i4;
    }

    public final boolean B() {
        return this._size == 0;
    }

    public final boolean C() {
        return this._size != 0;
    }

    @fg.l
    @kd.j
    public final String D() {
        return P(this, null, null, null, 0, null, 31, null);
    }

    @fg.l
    @kd.j
    public final String E(@fg.l CharSequence separator) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        return P(this, separator, null, null, 0, null, 30, null);
    }

    @fg.l
    @kd.j
    public final String F(@fg.l CharSequence separator, @fg.l CharSequence prefix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        return P(this, separator, prefix, null, 0, null, 28, null);
    }

    @fg.l
    @kd.j
    public final String G(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return P(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @fg.l
    @kd.j
    public final String H(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int i4) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        return P(this, separator, prefix, postfix, i4, null, 16, null);
    }

    @fg.l
    @kd.j
    public final String I(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = l.a(postfix, "postfix", truncated, "truncated", prefix);
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                a5.append(postfix);
                break;
            }
            int i6 = iArr[i5];
            if (i5 == limit) {
                a5.append(truncated);
                break;
            }
            if (i5 != 0) {
                a5.append(separator);
            }
            a5.append(i6);
            i5++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String J(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence postfix, int limit, @fg.l CharSequence truncated, @fg.l ld.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        kotlin.jvm.internal.l0.p(postfix, "postfix");
        StringBuilder a5 = r.a(truncated, "truncated", transform, "transform", prefix);
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                a5.append(postfix);
                break;
            }
            int i6 = iArr[i5];
            if (i5 == limit) {
                a5.append(truncated);
                break;
            }
            if (i5 != 0) {
                a5.append(separator);
            }
            a5.append(transform.invoke(Integer.valueOf(i6)));
            i5++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String K(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence charSequence, int i4, @fg.l ld.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = r.a(charSequence, "postfix", lVar, "transform", prefix);
        int[] iArr = this.content;
        int i5 = this._size;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                a5.append(charSequence);
                break;
            }
            int i7 = iArr[i6];
            if (i6 == i4) {
                a5.append((CharSequence) "...");
                break;
            }
            if (i6 != 0) {
                a5.append(separator);
            }
            a5.append(lVar.invoke(Integer.valueOf(i7)));
            i6++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String L(@fg.l CharSequence separator, @fg.l CharSequence prefix, @fg.l CharSequence charSequence, @fg.l ld.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(prefix, "prefix");
        StringBuilder a5 = r.a(charSequence, "postfix", lVar, "transform", prefix);
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                a5.append(charSequence);
                break;
            }
            int i6 = iArr[i5];
            if (i5 == -1) {
                a5.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                a5.append(separator);
            }
            a5.append(lVar.invoke(Integer.valueOf(i6)));
            i5++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String M(@fg.l CharSequence separator, @fg.l CharSequence charSequence, @fg.l ld.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        StringBuilder a5 = r.a(charSequence, "prefix", lVar, "transform", charSequence);
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                a5.append((CharSequence) "");
                break;
            }
            int i6 = iArr[i5];
            if (i5 == -1) {
                a5.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                a5.append(separator);
            }
            a5.append(lVar.invoke(Integer.valueOf(i6)));
            i5++;
        }
        String sb = a5.toString();
        kotlin.jvm.internal.l0.o(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @fg.l
    @kd.j
    public final String N(@fg.l CharSequence separator, @fg.l ld.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(separator, "separator");
        kotlin.jvm.internal.l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                sb.append((CharSequence) "");
                break;
            }
            int i6 = iArr[i5];
            if (i5 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                sb.append(separator);
            }
            sb.append(transform.invoke(Integer.valueOf(i6)));
            i5++;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @fg.l
    @kd.j
    public final String O(@fg.l ld.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                sb.append((CharSequence) "");
                break;
            }
            int i6 = iArr[i5];
            if (i5 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i5 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(transform.invoke(Integer.valueOf(i6)));
            i5++;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final int R() {
        if (B()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int S(@fg.l ld.l<? super Integer, Boolean> predicate) {
        int i4;
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i5 = this._size;
        do {
            i5--;
            if (-1 >= i5) {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
            i4 = iArr[i5];
        } while (!predicate.invoke(Integer.valueOf(i4)).booleanValue());
        return i4;
    }

    public final int T(int element) {
        int[] iArr = this.content;
        int i4 = this._size;
        do {
            i4--;
            if (-1 >= i4) {
                return -1;
            }
        } while (iArr[i4] != element);
        return i4;
    }

    public final boolean U() {
        return B();
    }

    public final boolean V(@fg.l ld.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        for (int i4 = this._size - 1; -1 < i4; i4--) {
            if (predicate.invoke(Integer.valueOf(iArr[i4])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return C();
    }

    public final boolean b(@fg.l ld.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (predicate.invoke(Integer.valueOf(iArr[i5])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(int element) {
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (iArr[i5] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, elements._size);
        int first = W1.getFirst();
        int last = W1.getLast();
        if (first > last) {
            return true;
        }
        while (c(elements.s(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    /* renamed from: e, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof h0) {
            h0 h0Var = (h0) other;
            int i4 = h0Var._size;
            int i5 = this._size;
            if (i4 == i5) {
                int[] iArr = this.content;
                int[] iArr2 = h0Var.content;
                kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, i5);
                int first = W1.getFirst();
                int last = W1.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(@fg.l ld.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (predicate.invoke(Integer.valueOf(iArr[i6])).booleanValue()) {
                i5++;
            }
        }
        return i5;
    }

    public final int g(@androidx.annotation.g0(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder a5 = s.a("Index ", index, " must be in 0..");
        a5.append(this._size - 1);
        throw new IndexOutOfBoundsException(a5.toString());
    }

    public final int h(@androidx.annotation.g0(from = 0) int index, @fg.l ld.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)).intValue() : this.content[index];
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i4 = this._size;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += Integer.hashCode(iArr[i6]) * 31;
        }
        return i5;
    }

    public final int i() {
        if (B()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final int j(@fg.l ld.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (predicate.invoke(Integer.valueOf(i6)).booleanValue()) {
                return i6;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R k(R initial, @fg.l ld.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            initial = operation.invoke(initial, Integer.valueOf(iArr[i5]));
        }
        return initial;
    }

    public final <R> R l(R initial, @fg.l ld.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            R r4 = initial;
            initial = operation.R(Integer.valueOf(i5), r4, Integer.valueOf(iArr[i5]));
        }
        return initial;
    }

    public final <R> R m(R initial, @fg.l ld.p<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        int[] iArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(iArr[i4]), initial);
        }
    }

    public final <R> R n(R initial, @fg.l ld.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.l0.p(operation, "operation");
        int[] iArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return initial;
            }
            initial = operation.R(Integer.valueOf(i4), Integer.valueOf(iArr[i4]), initial);
        }
    }

    public final void o(@fg.l ld.l<? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            block.invoke(Integer.valueOf(iArr[i5]));
        }
    }

    public final void p(@fg.l ld.p<? super Integer, ? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            block.invoke(Integer.valueOf(i5), Integer.valueOf(iArr[i5]));
        }
    }

    public final void q(@fg.l ld.l<? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        int[] iArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i4]));
            }
        }
    }

    public final void r(@fg.l ld.p<? super Integer, ? super Integer, kotlin.k2> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        int[] iArr = this.content;
        int i4 = this._size;
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            } else {
                block.invoke(Integer.valueOf(i4), Integer.valueOf(iArr[i4]));
            }
        }
    }

    public final int s(@androidx.annotation.g0(from = 0) int index) {
        if (index >= 0 && index < this._size) {
            return this.content[index];
        }
        StringBuilder a5 = s.a("Index ", index, " must be in 0..");
        a5.append(this._size - 1);
        throw new IndexOutOfBoundsException(a5.toString());
    }

    @fg.l
    public String toString() {
        return P(this, null, "[", "]", 0, null, 25, null);
    }

    @fg.l
    public final kotlin.ranges.l u() {
        return kotlin.ranges.s.W1(0, this._size);
    }

    @androidx.annotation.g0(from = -1)
    public final int v() {
        return this._size - 1;
    }

    @androidx.annotation.g0(from = 0)
    public final int w() {
        return this._size;
    }

    public final int y(int element) {
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (element == iArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    public final int z(@fg.l ld.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.l0.p(predicate, "predicate");
        int[] iArr = this.content;
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (predicate.invoke(Integer.valueOf(iArr[i5])).booleanValue()) {
                return i5;
            }
        }
        return -1;
    }

    private h0(int i4) {
        this.content = i4 == 0 ? o0.b() : new int[i4];
    }
}
