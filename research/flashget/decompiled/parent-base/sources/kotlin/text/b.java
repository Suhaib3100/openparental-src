package kotlin.text;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharDirectionality.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/text/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE;

    @fg.l
    private static final kotlin.b0<Map<Integer, b>> directionalityMap$delegate;
    private final int value;
    public static final b UNDEFINED = new b(ProtectedSandApp.s("菍\u0001"), 0, -1);
    public static final b LEFT_TO_RIGHT = new b(ProtectedSandApp.s("菎\u0001"), 1, 0);
    public static final b RIGHT_TO_LEFT = new b(ProtectedSandApp.s("菏\u0001"), 2, 1);
    public static final b RIGHT_TO_LEFT_ARABIC = new b(ProtectedSandApp.s("菐\u0001"), 3, 2);
    public static final b EUROPEAN_NUMBER = new b(ProtectedSandApp.s("菑\u0001"), 4, 3);
    public static final b EUROPEAN_NUMBER_SEPARATOR = new b(ProtectedSandApp.s("菒\u0001"), 5, 4);
    public static final b EUROPEAN_NUMBER_TERMINATOR = new b(ProtectedSandApp.s("菓\u0001"), 6, 5);
    public static final b ARABIC_NUMBER = new b(ProtectedSandApp.s("菔\u0001"), 7, 6);
    public static final b COMMON_NUMBER_SEPARATOR = new b(ProtectedSandApp.s("菕\u0001"), 8, 7);
    public static final b NONSPACING_MARK = new b(ProtectedSandApp.s("菖\u0001"), 9, 8);
    public static final b BOUNDARY_NEUTRAL = new b(ProtectedSandApp.s("菗\u0001"), 10, 9);
    public static final b PARAGRAPH_SEPARATOR = new b(ProtectedSandApp.s("菘\u0001"), 11, 10);
    public static final b SEGMENT_SEPARATOR = new b(ProtectedSandApp.s("菙\u0001"), 12, 11);
    public static final b WHITESPACE = new b(ProtectedSandApp.s("菚\u0001"), 13, 12);
    public static final b OTHER_NEUTRALS = new b(ProtectedSandApp.s("菛\u0001"), 14, 13);
    public static final b LEFT_TO_RIGHT_EMBEDDING = new b(ProtectedSandApp.s("菜\u0001"), 15, 14);
    public static final b LEFT_TO_RIGHT_OVERRIDE = new b(ProtectedSandApp.s("菝\u0001"), 16, 15);
    public static final b RIGHT_TO_LEFT_EMBEDDING = new b(ProtectedSandApp.s("菞\u0001"), 17, 16);
    public static final b RIGHT_TO_LEFT_OVERRIDE = new b(ProtectedSandApp.s("菟\u0001"), 18, 17);
    public static final b POP_DIRECTIONAL_FORMAT = new b(ProtectedSandApp.s("菠\u0001"), 19, 18);

    /* compiled from: CharDirectionality.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lkotlin/text/b;", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1194#2,2:125\n1222#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Map<Integer, ? extends b>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f79060b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Integer, b> invoke() {
            kotlin.enums.a<b> entries = b.getEntries();
            int j4 = z0.j(kotlin.collections.w.b0(entries, 10));
            if (j4 < 16) {
                j4 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
            for (Object obj : entries) {
                linkedHashMap.put(Integer.valueOf(((b) obj).getValue()), obj);
            }
            return linkedHashMap;
        }
    }

    /* compiled from: CharDirectionality.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/text/b$b;", "", "<init>", "()V", "", "directionality", "Lkotlin/text/b;", "b", "(I)Lkotlin/text/b;", "", "directionalityMap$delegate", "Lkotlin/b0;", "a", "()Ljava/util/Map;", "directionalityMap", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final Map<Integer, b> a() {
            return (Map) b.directionalityMap$delegate.getValue();
        }

        @fg.l
        public final b b(int directionality) {
            b bVar = a().get(Integer.valueOf(directionality));
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("菅\u0001"), directionality, ProtectedSandApp.s("菆\u0001")));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        INSTANCE = new Companion();
        directionalityMap$delegate = kotlin.c0.c(a.f79060b);
    }

    private b(String str, int i4, int i5) {
        this.value = i5;
    }

    @fg.l
    public static kotlin.enums.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
