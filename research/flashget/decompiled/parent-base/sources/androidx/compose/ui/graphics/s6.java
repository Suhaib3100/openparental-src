package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Vertices.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0010\u0017\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\u000b\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001d\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/s6;", "", "Landroidx/compose/ui/graphics/r6;", "vertexMode", "", "Li0/f;", "positions", "textureCoordinates", "Landroidx/compose/ui/graphics/d2;", "colors", "", "indices", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "", "a", "(Ljava/util/List;)[I", "points", "", "b", "(Ljava/util/List;)[F", "I", "g", "()I", "[F", "e", "()[F", "c", "f", "d", "[I", "()[I", "", "[S", "()[S", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n101#2,2:77\n33#2,6:79\n103#2:85\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:77,2\n42#1:79,6\n42#1:85\n*E\n"})
/* loaded from: classes.dex */
public final class s6 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int vertexMode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] positions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] textureCoordinates;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] colors;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final short[] indices;

    /* compiled from: Vertices.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Integer, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<i0.f> f18033b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<i0.f> list) {
            super(1);
            this.f18033b = list;
        }

        @fg.l
        public final Boolean a(int i4) {
            return Boolean.valueOf(i4 < 0 || i4 >= this.f18033b.size());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public /* synthetic */ s6(int i4, List list, List list2, List list3, List list4, kotlin.jvm.internal.w wVar) {
        this(i4, list, list2, list3, list4);
    }

    private final int[] a(List<d2> colors) {
        int size = colors.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = f2.r(colors.get(i4).M());
        }
        return iArr;
    }

    private final float[] b(List<i0.f> points) {
        int size = points.size() * 2;
        float[] fArr = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            long packedValue = points.get(i4 / 2).getPackedValue();
            fArr[i4] = i4 % 2 == 0 ? i0.f.p(packedValue) : i0.f.r(packedValue);
        }
        return fArr;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final int[] getColors() {
        return this.colors;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final short[] getIndices() {
        return this.indices;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: g, reason: from getter */
    public final int getVertexMode() {
        return this.vertexMode;
    }

    private s6(int i4, List<i0.f> list, List<i0.f> list2, List<d2> list3, List<Integer> list4) {
        this.vertexMode = i4;
        a aVar = new a(list);
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (aVar.invoke(list4.get(i5)).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.positions = b(list);
        this.textureCoordinates = b(list2);
        this.colors = a(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            sArr[i6] = (short) list4.get(i6).intValue();
        }
        this.indices = sArr;
    }
}
