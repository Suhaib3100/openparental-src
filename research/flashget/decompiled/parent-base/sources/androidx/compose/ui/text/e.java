package androidx.compose.ui.text;

import androidx.compose.foundation.layout.f3;
import androidx.compose.foundation.w1;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0002\u00145B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b,\u0010*J+\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0004\b.\u0010*J\u001a\u0010/\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00104R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R*\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b>\u0010;R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010;R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010;R\u0014\u0010B\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/text/e;", "", "", "text", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStylesOrNull", "Landroidx/compose/ui/text/y;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "r", "(II)Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/text/t0;", "range", "s", "(J)Landroidx/compose/ui/text/e;", "other", "q", "(Landroidx/compose/ui/text/e;)Landroidx/compose/ui/text/e;", "tag", "start", "end", "l", "(Ljava/lang/String;II)Ljava/util/List;", "", "p", "(Ljava/lang/String;II)Z", "k", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/x0;", "n", "Landroidx/compose/ui/text/y0;", "o", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "m", "c", "Ljava/util/List;", "j", "()Ljava/util/List;", "d", "h", "e", "i", "g", "f", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@m1
@r1({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1128:1\n1045#2:1129\n33#3,6:1130\n235#3,3:1137\n33#3,4:1140\n238#3,2:1144\n38#3:1146\n240#3:1147\n101#3,2:1148\n33#3,6:1150\n103#3:1156\n235#3,3:1157\n33#3,4:1160\n238#3,2:1164\n38#3:1166\n240#3:1167\n235#3,3:1168\n33#3,4:1171\n238#3,2:1175\n38#3:1177\n240#3:1178\n235#3,3:1179\n33#3,4:1182\n238#3,2:1186\n38#3:1188\n240#3:1189\n1#4:1136\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n87#1:1129\n87#1:1130,6\n160#1:1137,3\n160#1:1140,4\n160#1:1144,2\n160#1:1146\n160#1:1147\n168#1:1148,2\n168#1:1150,6\n168#1:1156\n183#1:1157,3\n183#1:1160,4\n183#1:1164,2\n183#1:1166\n183#1:1167\n198#1:1168,3\n198#1:1171,4\n198#1:1175,2\n198#1:1177\n198#1:1178\n214#1:1179,3\n214#1:1182,4\n214#1:1186,2\n214#1:1188\n214#1:1189\n*E\n"})
/* loaded from: classes.dex */
public final class e implements CharSequence {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20634f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<b<i0>> spanStylesOrNull;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<b<y>> paragraphStylesOrNull;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final List<b<? extends Object>> annotations;

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u000bJ%\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b#\u0010$J-\u0010'\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b+\u0010,J'\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\"¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\f¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u0003¢\u0006\u0004\b>\u0010\u0006J\r\u0010?\u001a\u00020\n¢\u0006\u0004\b?\u0010@R\u0018\u0010\b\u001a\u00060Aj\u0002`B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010CR \u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010FR \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010FR\"\u0010J\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020I0E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010FR\"\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020I0E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u0011\u0010N\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Landroidx/compose/ui/text/e$a;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "", "text", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/e;", "(Landroidx/compose/ui/text/e;)V", "Lkotlin/k2;", "l", "", "char", "i", "(C)V", "", "g", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/e$a;", "start", "end", "h", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/e$a;", "f", "(C)Landroidx/compose/ui/text/e$a;", "j", "k", "(Landroidx/compose/ui/text/e;II)V", "Landroidx/compose/ui/text/i0;", "style", "c", "(Landroidx/compose/ui/text/i0;II)V", "Landroidx/compose/ui/text/y;", "b", "(Landroidx/compose/ui/text/y;II)V", "tag", "annotation", "a", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/x0;", "ttsAnnotation", "d", "(Landroidx/compose/ui/text/x0;II)V", "Landroidx/compose/ui/text/y0;", "urlAnnotation", "e", "(Landroidx/compose/ui/text/y0;II)V", "r", "(Landroidx/compose/ui/text/i0;)I", "q", "(Landroidx/compose/ui/text/y;)I", "p", "(Ljava/lang/String;Ljava/lang/String;)I", "s", "(Landroidx/compose/ui/text/x0;)I", "t", "(Landroidx/compose/ui/text/y0;)I", "n", "()V", "index", "o", "u", "()Landroidx/compose/ui/text/e;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/e$a$a;", "Ljava/util/List;", "spanStyles", "paragraphStyles", "", "annotations", "styleStack", "m", "()I", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 0)
    @r1({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1128:1\n33#2,6:1129\n33#2,6:1135\n33#2,6:1141\n33#2,6:1147\n33#2,6:1153\n33#2,6:1159\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n151#2,3:1177\n33#2,4:1180\n154#2,2:1184\n38#2:1186\n156#2:1187\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n1#3:1165\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n397#1:1129,6\n400#1:1135,6\n404#1:1141,6\n424#1:1147,6\n427#1:1153,6\n431#1:1159,6\n641#1:1166,3\n641#1:1169,4\n641#1:1173,2\n641#1:1175\n641#1:1176\n644#1:1177,3\n644#1:1180,4\n644#1:1184,2\n644#1:1186\n644#1:1187\n647#1:1188,3\n647#1:1191,4\n647#1:1195,2\n647#1:1197\n647#1:1198\n*E\n"})
    public static final class a implements Appendable {

        /* renamed from: g, reason: collision with root package name */
        public static final int f20639g = 8;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final StringBuilder text;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<C0369a<i0>> spanStyles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<C0369a<y>> paragraphStyles;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<C0369a<? extends Object>> annotations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<C0369a<? extends Object>> styleStack;

        public a() {
            this(0, 1, null);
        }

        public final void a(@fg.l String tag, @fg.l String annotation, int start, int end) {
            this.annotations.add(new C0369a<>(annotation, start, end, tag));
        }

        public final void b(@fg.l y style, int start, int end) {
            this.paragraphStyles.add(new C0369a<>(style, start, end, null, 8, null));
        }

        public final void c(@fg.l i0 style, int start, int end) {
            this.spanStyles.add(new C0369a<>(style, start, end, null, 8, null));
        }

        @k
        public final void d(@fg.l x0 ttsAnnotation, int start, int end) {
            this.annotations.add(new C0369a<>(ttsAnnotation, start, end, null, 8, null));
        }

        @k
        public final void e(@fg.l y0 urlAnnotation, int start, int end) {
            this.annotations.add(new C0369a<>(urlAnnotation, start, end, null, 8, null));
        }

        @fg.l
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a i(char r22) {
            this.text.append(r22);
            return this;
        }

        @Override // java.lang.Appendable
        @fg.l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a append(@fg.m CharSequence text) {
            if (text instanceof e) {
                j((e) text);
            } else {
                this.text.append(text);
            }
            return this;
        }

        @Override // java.lang.Appendable
        @fg.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a append(@fg.m CharSequence text, int start, int end) {
            if (text instanceof e) {
                k((e) text, start, end);
            } else {
                this.text.append(text, start, end);
            }
            return this;
        }

        public final void j(@fg.l e text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<b<i0>> j4 = text.j();
            if (j4 != null) {
                int size = j4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    b<i0> bVar = j4.get(i4);
                    c(bVar.h(), bVar.i() + length, bVar.g() + length);
                }
            }
            List<b<y>> h4 = text.h();
            if (h4 != null) {
                int size2 = h4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    b<y> bVar2 = h4.get(i5);
                    b(bVar2.h(), bVar2.i() + length, bVar2.g() + length);
                }
            }
            List<b<? extends Object>> e4 = text.e();
            if (e4 != null) {
                int size3 = e4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    b<? extends Object> bVar3 = e4.get(i6);
                    this.annotations.add(new C0369a<>(bVar3.h(), bVar3.i() + length, bVar3.g() + length, bVar3.j()));
                }
            }
        }

        public final void k(@fg.l e text, int start, int end) {
            List s4;
            List r4;
            List q4;
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            s4 = f.s(text, start, end);
            if (s4 != null) {
                int size = s4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    b bVar = (b) s4.get(i4);
                    c((i0) bVar.h(), bVar.i() + length, bVar.g() + length);
                }
            }
            r4 = f.r(text, start, end);
            if (r4 != null) {
                int size2 = r4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    b bVar2 = (b) r4.get(i5);
                    b((y) bVar2.h(), bVar2.i() + length, bVar2.g() + length);
                }
            }
            q4 = f.q(text, start, end);
            if (q4 != null) {
                int size3 = q4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    b bVar3 = (b) q4.get(i6);
                    this.annotations.add(new C0369a<>(bVar3.h(), bVar3.i() + length, bVar3.g() + length, bVar3.j()));
                }
            }
        }

        public final void l(@fg.l String text) {
            this.text.append(text);
        }

        public final int m() {
            return this.text.length();
        }

        public final void n() {
            if (this.styleStack.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).k(this.text.length());
        }

        public final void o(int index) {
            if (index < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= index) {
                    n();
                }
            } else {
                throw new IllegalStateException((index + " should be less than " + this.styleStack.size()).toString());
            }
        }

        public final int p(@fg.l String tag, @fg.l String annotation) {
            C0369a<? extends Object> c0369a = new C0369a<>(annotation, this.text.length(), 0, tag, 4, null);
            this.styleStack.add(c0369a);
            this.annotations.add(c0369a);
            return this.styleStack.size() - 1;
        }

        public final int q(@fg.l y style) {
            C0369a<y> c0369a = new C0369a<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(c0369a);
            this.paragraphStyles.add(c0369a);
            return this.styleStack.size() - 1;
        }

        public final int r(@fg.l i0 style) {
            C0369a<i0> c0369a = new C0369a<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(c0369a);
            this.spanStyles.add(c0369a);
            return this.styleStack.size() - 1;
        }

        public final int s(@fg.l x0 ttsAnnotation) {
            C0369a<? extends Object> c0369a = new C0369a<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(c0369a);
            this.annotations.add(c0369a);
            return this.styleStack.size() - 1;
        }

        @k
        public final int t(@fg.l y0 urlAnnotation) {
            C0369a<? extends Object> c0369a = new C0369a<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(c0369a);
            this.annotations.add(c0369a);
            return this.styleStack.size() - 1;
        }

        @fg.l
        public final e u() {
            String sb = this.text.toString();
            List<C0369a<i0>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(list.get(i4).l(this.text.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C0369a<y>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList2.add(list2.get(i5).l(this.text.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<C0369a<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                arrayList3.add(list3.get(i6).l(this.text.length()));
            }
            return new e(sb, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        public a(int i4) {
            this.text = new StringBuilder(i4);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        @Override // java.lang.Appendable
        public Appendable append(char c5) {
            this.text.append(c5);
            return this;
        }

        /* compiled from: AnnotatedString.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Landroidx/compose/ui/text/e$a$a;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/e$b;", "l", "(I)Landroidx/compose/ui/text/e$b;", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "()Ljava/lang/String;", "e", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/e$a$a;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "h", "I", "i", "g", "k", "(I)V", "Ljava/lang/String;", "j", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1128:1\n1#2:1129\n*E\n"})
        /* renamed from: androidx.compose.ui.text.e$a$a, reason: collision with other inner class name */
        private static final /* data */ class C0369a<T> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final T item;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int start;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int end;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final String tag;

            public C0369a(T t4, int i4, int i5, @fg.l String str) {
                this.item = t4;
                this.start = i4;
                this.end = i5;
                this.tag = str;
            }

            public static C0369a f(C0369a c0369a, Object obj, int i4, int i5, String str, int i6, Object obj2) {
                if ((i6 & 1) != 0) {
                    obj = c0369a.item;
                }
                if ((i6 & 2) != 0) {
                    i4 = c0369a.start;
                }
                if ((i6 & 4) != 0) {
                    i5 = c0369a.end;
                }
                if ((i6 & 8) != 0) {
                    str = c0369a.tag;
                }
                c0369a.getClass();
                return new C0369a(obj, i4, i5, str);
            }

            public static /* synthetic */ b m(C0369a c0369a, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    i4 = Integer.MIN_VALUE;
                }
                return c0369a.l(i4);
            }

            public final T a() {
                return this.item;
            }

            /* renamed from: b, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* renamed from: c, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            @fg.l
            /* renamed from: d, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            @fg.l
            public final C0369a<T> e(T item, int start, int end, @fg.l String tag) {
                return new C0369a<>(item, start, end, tag);
            }

            public boolean equals(@fg.m Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C0369a)) {
                    return false;
                }
                C0369a c0369a = (C0369a) other;
                return kotlin.jvm.internal.l0.g(this.item, c0369a.item) && this.start == c0369a.start && this.end == c0369a.end && kotlin.jvm.internal.l0.g(this.tag, c0369a.tag);
            }

            public final int g() {
                return this.end;
            }

            public final T h() {
                return this.item;
            }

            public int hashCode() {
                T t4 = this.item;
                return this.tag.hashCode() + w1.a(this.end, w1.a(this.start, (t4 == null ? 0 : t4.hashCode()) * 31, 31), 31);
            }

            public final int i() {
                return this.start;
            }

            @fg.l
            public final String j() {
                return this.tag;
            }

            public final void k(int i4) {
                this.end = i4;
            }

            @fg.l
            public final b<T> l(int defaultEnd) {
                int i4 = this.end;
                if (i4 != Integer.MIN_VALUE) {
                    defaultEnd = i4;
                }
                if (defaultEnd != Integer.MIN_VALUE) {
                    return new b<>(this.item, this.start, defaultEnd, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            @fg.l
            public String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.item);
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                sb.append(", tag=");
                return f3.a(sb, this.tag, ')');
            }

            public /* synthetic */ C0369a(Object obj, int i4, int i5, String str, int i6, kotlin.jvm.internal.w wVar) {
                this(obj, i4, (i6 & 4) != 0 ? Integer.MIN_VALUE : i5, (i6 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ a(int i4, int i5, kotlin.jvm.internal.w wVar) {
            this((i5 & 1) != 0 ? 16 : i4);
        }

        public a(@fg.l String str) {
            this(0, 1, null);
            l(str);
        }

        public a(@fg.l e eVar) {
            this(0, 1, null);
            j(eVar);
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n87#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            return kotlin.comparisons.a.l(Integer.valueOf(((b) t4).i()), Integer.valueOf(((b) t5).i()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@fg.l String str, @fg.m List<b<i0>> list, @fg.m List<b<y>> list2, @fg.m List<? extends b<? extends Object>> list3) {
        List u5;
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (u5 = kotlin.collections.w.u5(list2, new c())) == null) {
            return;
        }
        int size = u5.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) u5.get(i5);
            if (bVar.i() < i4) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (bVar.g() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.i() + ", " + bVar.g() + ") is out of boundary").toString());
            }
            i4 = bVar.g();
        }
    }

    public char a(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.text.charAt(i4);
    }

    @fg.m
    public final List<b<? extends Object>> e() {
        return this.annotations;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return kotlin.jvm.internal.l0.g(this.text, eVar.text) && kotlin.jvm.internal.l0.g(this.spanStylesOrNull, eVar.spanStylesOrNull) && kotlin.jvm.internal.l0.g(this.paragraphStylesOrNull, eVar.paragraphStylesOrNull) && kotlin.jvm.internal.l0.g(this.annotations, eVar.annotations);
    }

    public int f() {
        return this.text.length();
    }

    @fg.l
    public final List<b<y>> g() {
        List<b<y>> list = this.paragraphStylesOrNull;
        return list == null ? kotlin.collections.j0.f74919b : list;
    }

    @fg.m
    public final List<b<y>> h() {
        return this.paragraphStylesOrNull;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List<b<i0>> list = this.spanStylesOrNull;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<b<y>> list2 = this.paragraphStylesOrNull;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<b<? extends Object>> list3 = this.annotations;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @fg.l
    public final List<b<i0>> i() {
        List<b<i0>> list = this.spanStylesOrNull;
        return list == null ? kotlin.collections.j0.f74919b : list;
    }

    @fg.m
    public final List<b<i0>> j() {
        return this.spanStylesOrNull;
    }

    @fg.l
    public final List<b<String>> k(int start, int end) {
        List list;
        List<b<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                b<? extends Object> bVar = list2.get(i4);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.h() instanceof String) && f.t(start, end, bVar2.i(), bVar2.g())) {
                    list.add(bVar);
                }
            }
        } else {
            list = kotlin.collections.j0.f74919b;
        }
        kotlin.jvm.internal.l0.n(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    @fg.l
    public final List<b<String>> l(@fg.l String tag, int start, int end) {
        List list;
        List<b<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                b<? extends Object> bVar = list2.get(i4);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.h() instanceof String) && kotlin.jvm.internal.l0.g(tag, bVar2.j()) && f.t(start, end, bVar2.i(), bVar2.g())) {
                    list.add(bVar);
                }
            }
        } else {
            list = kotlin.collections.j0.f74919b;
        }
        kotlin.jvm.internal.l0.n(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.text.length();
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @fg.l
    public final List<b<x0>> n(int start, int end) {
        List list;
        List<b<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                b<? extends Object> bVar = list2.get(i4);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.h() instanceof x0) && f.t(start, end, bVar2.i(), bVar2.g())) {
                    list.add(bVar);
                }
            }
        } else {
            list = kotlin.collections.j0.f74919b;
        }
        kotlin.jvm.internal.l0.n(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list;
    }

    @fg.l
    @k
    public final List<b<y0>> o(int start, int end) {
        List list;
        List<b<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList(list2.size());
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                b<? extends Object> bVar = list2.get(i4);
                b<? extends Object> bVar2 = bVar;
                if ((bVar2.h() instanceof y0) && f.t(start, end, bVar2.i(), bVar2.g())) {
                    list.add(bVar);
                }
            }
        } else {
            list = kotlin.collections.j0.f74919b;
        }
        kotlin.jvm.internal.l0.n(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list;
    }

    public final boolean p(@fg.l String tag, int start, int end) {
        List<b<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            b<? extends Object> bVar = list.get(i4);
            if ((bVar.h() instanceof String) && kotlin.jvm.internal.l0.g(tag, bVar.j()) && f.t(start, end, bVar.i(), bVar.g())) {
                return true;
            }
        }
        return false;
    }

    @x4
    @fg.l
    public final e q(@fg.l e other) {
        a aVar = new a(this);
        aVar.j(other);
        return aVar.u();
    }

    @Override // java.lang.CharSequence
    @fg.l
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e subSequence(int startIndex, int endIndex) {
        List p4;
        List p5;
        List p6;
        if (startIndex > endIndex) {
            throw new IllegalArgumentException(androidx.collection.m1.a("start (", startIndex, ") should be less or equal to end (", endIndex, ')').toString());
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String substring = this.text.substring(startIndex, endIndex);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        p4 = f.p(this.spanStylesOrNull, startIndex, endIndex);
        p5 = f.p(this.paragraphStylesOrNull, startIndex, endIndex);
        p6 = f.p(this.annotations, startIndex, endIndex);
        return new e(substring, p4, p5, p6);
    }

    @fg.l
    public final e s(long range) {
        return subSequence(t0.l(range), t0.k(range));
    }

    @Override // java.lang.CharSequence
    @fg.l
    public String toString() {
        return this.text;
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/e$b;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "()Ljava/lang/String;", "e", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/e$b;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "h", "I", "i", "g", "Ljava/lang/String;", "j", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @m1
    @r1({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1128:1\n1#2:1129\n*E\n"})
    public static final /* data */ class b<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final int f20649e = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T item;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int end;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String tag;

        public b(T t4, int i4, int i5, @fg.l String str) {
            this.item = t4;
            this.start = i4;
            this.end = i5;
            this.tag = str;
            if (i4 > i5) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public static b f(b bVar, Object obj, int i4, int i5, String str, int i6, Object obj2) {
            if ((i6 & 1) != 0) {
                obj = bVar.item;
            }
            if ((i6 & 2) != 0) {
                i4 = bVar.start;
            }
            if ((i6 & 4) != 0) {
                i5 = bVar.end;
            }
            if ((i6 & 8) != 0) {
                str = bVar.tag;
            }
            bVar.getClass();
            return new b(obj, i4, i5, str);
        }

        public final T a() {
            return this.item;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @fg.l
        public final b<T> e(T item, int start, int end, @fg.l String tag) {
            return new b<>(item, start, end, tag);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.item, bVar.item) && this.start == bVar.start && this.end == bVar.end && kotlin.jvm.internal.l0.g(this.tag, bVar.tag);
        }

        public final int g() {
            return this.end;
        }

        public final T h() {
            return this.item;
        }

        public int hashCode() {
            T t4 = this.item;
            return this.tag.hashCode() + w1.a(this.end, w1.a(this.start, (t4 == null ? 0 : t4.hashCode()) * 31, 31), 31);
        }

        public final int i() {
            return this.start;
        }

        @fg.l
        public final String j() {
            return this.tag;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.item);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", tag=");
            return f3.a(sb, this.tag, ')');
        }

        public b(T t4, int i4, int i5) {
            this(t4, i4, i5, "");
        }
    }

    public /* synthetic */ e(String str, List list, List list2, List list3, int i4, kotlin.jvm.internal.w wVar) {
        this(str, (i4 & 2) != 0 ? null : list, (i4 & 4) != 0 ? null : list2, (i4 & 8) != 0 ? null : list3);
    }

    public e(String str, List list, List list2, int i4, kotlin.jvm.internal.w wVar) {
        this(str, (i4 & 2) != 0 ? kotlin.collections.j0.f74919b : list, (i4 & 4) != 0 ? kotlin.collections.j0.f74919b : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@fg.l java.lang.String r3, @fg.l java.util.List<androidx.compose.ui.text.e.b<androidx.compose.ui.text.i0>> r4, @fg.l java.util.List<androidx.compose.ui.text.e.b<androidx.compose.ui.text.y>> r5) {
        /*
            r2 = this;
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            r4 = r1
        La:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15
            r5 = r1
        L15:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.e.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
