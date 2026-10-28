package androidx.compose.ui.text;

import androidx.collection.m1;
import androidx.compose.ui.text.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnnotatedString.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\u001a'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\f\u001a3\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001ah\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012>\b\u0004\u0010\u0018\u001a8\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001e\u001a?\u0010'\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020\u000e*\u00020#2\u0006\u0010$\u001a\u00020\n2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0002\b&H\u0086\b¢\u0006\u0004\b'\u0010(\u001aA\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020\u000e*\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0019\b\u0004\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0002\b&H\u0086\b¢\u0006\u0004\b)\u0010*\u001aI\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020\u000e*\u00020#2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0019\b\u0004\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0002\b&H\u0087\b¢\u0006\u0004\b.\u0010/\u001aA\u00102\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020\u000e*\u00020#2\u0006\u00101\u001a\u0002002\u0019\b\u0004\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0002\b&H\u0087\b¢\u0006\u0004\b2\u00103\u001aA\u00106\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020\u000e*\u00020#2\u0006\u00105\u001a\u0002042\u0019\b\u0004\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0002\b&H\u0087\b¢\u0006\u0004\b6\u00107\u001aK\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00122\u0016\u00108\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010:\u001a)\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b=\u0010>\u001a\u001d\u0010?\u001a\u00020\u00002\u0006\u0010;\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b?\u0010@\u001a)\u0010C\u001a\u00020\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020A0%¢\u0006\u0002\b&H\u0086\b¢\u0006\u0004\bC\u0010D\u001a/\u0010J\u001a\u00020I2\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0004\bJ\u0010K\u001a/\u0010P\u001a\u00020I2\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0000¢\u0006\u0004\bP\u0010K\u001a\u000f\u0010Q\u001a\u00020\u0000H\u0000¢\u0006\u0004\bQ\u0010R\"\u0014\u0010T\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010S¨\u0006U"}, d2 = {"Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/text/y;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/e$b;", "v", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/y;)Ljava/util/List;", "", "start", "end", "Landroidx/compose/ui/text/i0;", "s", "(Landroidx/compose/ui/text/e;II)Ljava/util/List;", "r", "", "q", "w", "(Landroidx/compose/ui/text/e;II)Landroidx/compose/ui/text/e;", "T", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "annotatedString", "paragraphStyle", "block", "u", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/y;Lld/p;)Ljava/util/List;", "Lu0/f;", "localeList", "z", "(Landroidx/compose/ui/text/e;Lu0/f;)Landroidx/compose/ui/text/e;", "x", "j", "m", "R", "Landroidx/compose/ui/text/e$a;", "style", "Lkotlin/Function1;", "Lkotlin/u;", "F", "(Landroidx/compose/ui/text/e$a;Landroidx/compose/ui/text/i0;Lld/l;)Ljava/lang/Object;", "E", "(Landroidx/compose/ui/text/e$a;Landroidx/compose/ui/text/y;Lld/l;)Ljava/lang/Object;", "", "tag", "annotation", "D", "(Landroidx/compose/ui/text/e$a;Ljava/lang/String;Ljava/lang/String;Lld/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/x0;", "ttsAnnotation", "B", "(Landroidx/compose/ui/text/e$a;Landroidx/compose/ui/text/x0;Lld/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/y0;", "urlAnnotation", "C", "(Landroidx/compose/ui/text/e$a;Landroidx/compose/ui/text/y0;Lld/l;)Ljava/lang/Object;", "ranges", "p", "(Ljava/util/List;II)Ljava/util/List;", "text", "spanStyle", "b", "(Ljava/lang/String;Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/y;)Landroidx/compose/ui/text/e;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/y;)Landroidx/compose/ui/text/e;", "Lkotlin/k2;", "builder", "i", "(Lld/l;)Landroidx/compose/ui/text/e;", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "l", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "t", "o", "()Landroidx/compose/ui/text/e;", "Landroidx/compose/ui/text/e;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1128:1\n33#2,6:1129\n235#2,3:1135\n33#2,4:1138\n238#2,2:1142\n38#2:1144\n240#2:1145\n151#2,3:1146\n33#2,4:1149\n154#2,2:1153\n38#2:1155\n156#2:1156\n235#2,3:1157\n33#2,4:1160\n238#2,2:1164\n38#2:1166\n240#2:1167\n151#2,3:1168\n33#2,4:1171\n154#2,2:1175\n38#2:1177\n156#2:1178\n235#2,3:1179\n33#2,4:1182\n238#2,2:1186\n38#2:1188\n240#2:1189\n151#2,3:1190\n33#2,4:1193\n154#2,2:1197\n38#2:1199\n156#2:1200\n151#2,3:1201\n33#2,4:1204\n154#2,2:1208\n38#2:1210\n156#2:1211\n235#2,3:1213\n33#2,4:1216\n238#2,2:1220\n38#2:1222\n240#2:1223\n151#2,3:1224\n33#2,4:1227\n154#2,2:1231\n38#2:1233\n156#2:1234\n1#3:1212\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n677#1:1129,6\n713#1:1135,3\n713#1:1138,4\n713#1:1142,2\n713#1:1144\n713#1:1145\n714#1:1146,3\n714#1:1149,4\n714#1:1153,2\n714#1:1155\n714#1:1156\n740#1:1157,3\n740#1:1160,4\n740#1:1164,2\n740#1:1166\n740#1:1167\n741#1:1168,3\n741#1:1171,4\n741#1:1175,2\n741#1:1177\n741#1:1178\n767#1:1179,3\n767#1:1182,4\n767#1:1186,2\n767#1:1188\n767#1:1189\n768#1:1190,3\n768#1:1193,4\n768#1:1197,2\n768#1:1199\n768#1:1200\n804#1:1201,3\n804#1:1204,4\n804#1:1208,2\n804#1:1210\n804#1:1211\n1050#1:1213,3\n1050#1:1216,4\n1050#1:1220,2\n1050#1:1222\n1050#1:1223\n1050#1:1224,3\n1050#1:1227,4\n1050#1:1231,2\n1050#1:1233\n1050#1:1234\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final e f20654a = new e("", null, null, 6, null);

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "str", "", "start", "end", "a", "(Ljava/lang/String;II)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.q<String, Integer, Integer, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.f f20655b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0.f fVar) {
            super(3);
            this.f20655b = fVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ String R(String str, Integer num, Integer num2) {
            return a(str, num.intValue(), num2.intValue());
        }

        @fg.l
        public final String a(@fg.l String str, int i4, int i5) {
            if (i4 == 0) {
                String substring = str.substring(i4, i5);
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return k0.b(substring, this.f20655b);
            }
            String substring2 = str.substring(i4, i5);
            kotlin.jvm.internal.l0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "str", "", "start", "end", "a", "(Ljava/lang/String;II)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.q<String, Integer, Integer, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.f f20656b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u0.f fVar) {
            super(3);
            this.f20656b = fVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ String R(String str, Integer num, Integer num2) {
            return a(str, num.intValue(), num2.intValue());
        }

        @fg.l
        public final String a(@fg.l String str, int i4, int i5) {
            if (i4 == 0) {
                String substring = str.substring(i4, i5);
                kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return k0.d(substring, this.f20656b);
            }
            String substring2 = str.substring(i4, i5);
            kotlin.jvm.internal.l0.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring2;
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "str", "", "start", "end", "a", "(Ljava/lang/String;II)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<String, Integer, Integer, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.f f20657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u0.f fVar) {
            super(3);
            this.f20657b = fVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ String R(String str, Integer num, Integer num2) {
            return a(str, num.intValue(), num2.intValue());
        }

        @fg.l
        public final String a(@fg.l String str, int i4, int i5) {
            String substring = str.substring(i4, i5);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return k0.f(substring, this.f20657b);
        }
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "str", "", "start", "end", "a", "(Ljava/lang/String;II)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<String, Integer, Integer, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0.f f20658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u0.f fVar) {
            super(3);
            this.f20658b = fVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ String R(String str, Integer num, Integer num2) {
            return a(str, num.intValue(), num2.intValue());
        }

        @fg.l
        public final String a(@fg.l String str, int i4, int i5) {
            String substring = str.substring(i4, i5);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return k0.h(substring, this.f20658b);
        }
    }

    public static /* synthetic */ e A(e eVar, u0.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = u0.f.INSTANCE.a();
        }
        return z(eVar, fVar);
    }

    @fg.l
    @k
    public static final <R> R B(@fg.l e.a aVar, @fg.l x0 x0Var, @fg.l ld.l<? super e.a, ? extends R> lVar) {
        int s4 = aVar.s(x0Var);
        try {
            return lVar.invoke(aVar);
        } finally {
            aVar.o(s4);
        }
    }

    @fg.l
    @k
    public static final <R> R C(@fg.l e.a aVar, @fg.l y0 y0Var, @fg.l ld.l<? super e.a, ? extends R> lVar) {
        int t4 = aVar.t(y0Var);
        try {
            return lVar.invoke(aVar);
        } finally {
            aVar.o(t4);
        }
    }

    @fg.l
    @k
    public static final <R> R D(@fg.l e.a aVar, @fg.l String str, @fg.l String str2, @fg.l ld.l<? super e.a, ? extends R> lVar) {
        int p4 = aVar.p(str, str2);
        try {
            return lVar.invoke(aVar);
        } finally {
            aVar.o(p4);
        }
    }

    @fg.l
    public static final <R> R E(@fg.l e.a aVar, @fg.l y yVar, @fg.l ld.l<? super e.a, ? extends R> lVar) {
        int q4 = aVar.q(yVar);
        try {
            return lVar.invoke(aVar);
        } finally {
            aVar.o(q4);
        }
    }

    @fg.l
    public static final <R> R F(@fg.l e.a aVar, @fg.l i0 i0Var, @fg.l ld.l<? super e.a, ? extends R> lVar) {
        int r4 = aVar.r(i0Var);
        try {
            return lVar.invoke(aVar);
        } finally {
            aVar.o(r4);
        }
    }

    @fg.l
    public static final e a(@fg.l String str, @fg.l y yVar) {
        return new e(str, kotlin.collections.j0.f74919b, kotlin.collections.w.k(new e.b(yVar, 0, str.length())));
    }

    @fg.l
    public static final e b(@fg.l String str, @fg.l i0 i0Var, @fg.m y yVar) {
        return new e(str, kotlin.collections.w.k(new e.b(i0Var, 0, str.length())), yVar == null ? kotlin.collections.j0.f74919b : kotlin.collections.w.k(new e.b(yVar, 0, str.length())));
    }

    public static /* synthetic */ e c(String str, i0 i0Var, y yVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            yVar = null;
        }
        return b(str, i0Var, yVar);
    }

    @fg.l
    public static final e i(@fg.l ld.l<? super e.a, k2> lVar) {
        e.a aVar = new e.a(0, 1, null);
        lVar.invoke(aVar);
        return aVar.u();
    }

    @fg.l
    public static final e j(@fg.l e eVar, @fg.l u0.f fVar) {
        return m.b(eVar, new a(fVar));
    }

    public static /* synthetic */ e k(e eVar, u0.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = u0.f.INSTANCE.a();
        }
        return j(eVar, fVar);
    }

    public static final boolean l(int i4, int i5, int i6, int i7) {
        if (i4 > i6 || i7 > i5) {
            return false;
        }
        if (i5 == i7) {
            if ((i6 == i7) != (i4 == i5)) {
                return false;
            }
        }
        return true;
    }

    @fg.l
    public static final e m(@fg.l e eVar, @fg.l u0.f fVar) {
        return m.b(eVar, new b(fVar));
    }

    public static /* synthetic */ e n(e eVar, u0.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = u0.f.INSTANCE.a();
        }
        return m(eVar, fVar);
    }

    @fg.l
    public static final e o() {
        return f20654a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<e.b<T>> p(List<? extends e.b<? extends T>> list, int i4, int i5) {
        if (i4 > i5) {
            throw new IllegalArgumentException(m1.a("start (", i4, ") should be less than or equal to end (", i5, ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            e.b<? extends T> bVar = list.get(i6);
            e.b<? extends T> bVar2 = bVar;
            if (t(i4, i5, bVar2.i(), bVar2.g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            e.b bVar3 = (e.b) arrayList.get(i7);
            arrayList2.add(new e.b(bVar3.h(), Math.max(i4, bVar3.i()) - i4, Math.min(i5, bVar3.g()) - i4, bVar3.j()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<e.b<? extends Object>> q(e eVar, int i4, int i5) {
        List<e.b<? extends Object>> e4;
        if (i4 == i5 || (e4 = eVar.e()) == null) {
            return null;
        }
        if (i4 == 0 && i5 >= eVar.getText().length()) {
            return e4;
        }
        ArrayList arrayList = new ArrayList(e4.size());
        int size = e4.size();
        for (int i6 = 0; i6 < size; i6++) {
            e.b<? extends Object> bVar = e4.get(i6);
            e.b<? extends Object> bVar2 = bVar;
            if (t(i4, i5, bVar2.i(), bVar2.g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            e.b bVar3 = (e.b) arrayList.get(i7);
            arrayList2.add(new e.b(bVar3.h(), kotlin.ranges.s.I(bVar3.i(), i4, i5) - i4, kotlin.ranges.s.I(bVar3.g(), i4, i5) - i4, bVar3.j()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<e.b<y>> r(e eVar, int i4, int i5) {
        List<e.b<y>> h4;
        if (i4 == i5 || (h4 = eVar.h()) == null) {
            return null;
        }
        if (i4 == 0 && i5 >= eVar.getText().length()) {
            return h4;
        }
        ArrayList arrayList = new ArrayList(h4.size());
        int size = h4.size();
        for (int i6 = 0; i6 < size; i6++) {
            e.b<y> bVar = h4.get(i6);
            e.b<y> bVar2 = bVar;
            if (t(i4, i5, bVar2.i(), bVar2.g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            e.b bVar3 = (e.b) arrayList.get(i7);
            arrayList2.add(new e.b(bVar3.h(), kotlin.ranges.s.I(bVar3.i(), i4, i5) - i4, kotlin.ranges.s.I(bVar3.g(), i4, i5) - i4));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<e.b<i0>> s(e eVar, int i4, int i5) {
        List<e.b<i0>> j4;
        if (i4 == i5 || (j4 = eVar.j()) == null) {
            return null;
        }
        if (i4 == 0 && i5 >= eVar.getText().length()) {
            return j4;
        }
        ArrayList arrayList = new ArrayList(j4.size());
        int size = j4.size();
        for (int i6 = 0; i6 < size; i6++) {
            e.b<i0> bVar = j4.get(i6);
            e.b<i0> bVar2 = bVar;
            if (t(i4, i5, bVar2.i(), bVar2.g())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            e.b bVar3 = (e.b) arrayList.get(i7);
            arrayList2.add(new e.b(bVar3.h(), kotlin.ranges.s.I(bVar3.i(), i4, i5) - i4, kotlin.ranges.s.I(bVar3.g(), i4, i5) - i4));
        }
        return arrayList2;
    }

    public static final boolean t(int i4, int i5, int i6, int i7) {
        return Math.max(i4, i6) < Math.min(i5, i7) || l(i4, i5, i6, i7) || l(i6, i7, i4, i5);
    }

    @fg.l
    public static final <T> List<T> u(@fg.l e eVar, @fg.l y yVar, @fg.l ld.p<? super e, ? super e.b<y>, ? extends T> pVar) {
        List<e.b<y>> v4 = v(eVar, yVar);
        ArrayList arrayList = new ArrayList(v4.size());
        int size = v4.size();
        for (int i4 = 0; i4 < size; i4++) {
            e.b<y> bVar = v4.get(i4);
            arrayList.add(pVar.invoke(w(eVar, bVar.i(), bVar.g()), bVar));
        }
        return arrayList;
    }

    @fg.l
    public static final List<e.b<y>> v(@fg.l e eVar, @fg.l y yVar) {
        int length = eVar.getText().length();
        List<e.b<y>> h4 = eVar.h();
        if (h4 == null) {
            h4 = kotlin.collections.j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        int size = h4.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            e.b<y> bVar = h4.get(i4);
            y a5 = bVar.a();
            int start = bVar.getStart();
            int end = bVar.getEnd();
            if (start != i5) {
                arrayList.add(new e.b(yVar, i5, start));
            }
            arrayList.add(new e.b(yVar.B(a5), start, end));
            i4++;
            i5 = end;
        }
        if (i5 != length) {
            arrayList.add(new e.b(yVar, i5, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new e.b(yVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e w(e eVar, int i4, int i5) {
        String str;
        if (i4 != i5) {
            str = eVar.getText().substring(i4, i5);
            kotlin.jvm.internal.l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new e(str, s(eVar, i4, i5), null, null, 12, null);
    }

    @fg.l
    public static final e x(@fg.l e eVar, @fg.l u0.f fVar) {
        return m.b(eVar, new c(fVar));
    }

    public static /* synthetic */ e y(e eVar, u0.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = u0.f.INSTANCE.a();
        }
        return x(eVar, fVar);
    }

    @fg.l
    public static final e z(@fg.l e eVar, @fg.l u0.f fVar) {
        return m.b(eVar, new d(fVar));
    }
}
