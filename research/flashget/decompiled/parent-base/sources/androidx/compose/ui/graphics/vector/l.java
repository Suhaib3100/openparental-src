package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.g5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00160 j\b\u0012\u0004\u0012\u00020\u0016`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/vector/l;", "", "<init>", "()V", "", "dataCount", "Lkotlin/k2;", "e", "(I)V", "", "cmd", "", "args", "count", "a", "(C[FI)V", "c", "", "pathData", "d", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/vector/l;", "", "Landroidx/compose/ui/graphics/vector/i;", "nodes", "b", "(Ljava/util/List;)Landroidx/compose/ui/graphics/vector/l;", "f", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/g5;", "target", "g", "(Landroidx/compose/ui/graphics/g5;)Landroidx/compose/ui/graphics/g5;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "[F", "nodeData", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 JvmFastFloatParser.jvm.kt\nandroidx/compose/ui/graphics/vector/JvmFastFloatParser_jvmKt\n*L\n1#1,555:1\n132#1,6:559\n150#1,2:565\n49#2:556\n50#2:557\n22#3:558\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n115#1:559,6\n123#1:565,2\n109#1:556\n110#1:557\n110#1:558\n*E\n"})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ArrayList<i> nodes = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private float[] nodeData = new float[64];

    private final void a(char cmd, float[] args, int count) {
        k.a(cmd, this.nodes, args, count);
    }

    private final void e(int dataCount) {
        float[] fArr = this.nodeData;
        if (dataCount >= fArr.length) {
            float[] fArr2 = new float[dataCount * 2];
            this.nodeData = fArr2;
            kotlin.collections.l.y0(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static g5 h(l lVar, g5 g5Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            g5Var = a1.a();
        }
        return m.d(lVar.nodes, g5Var);
    }

    @fg.l
    public final l b(@fg.l List<? extends i> nodes) {
        this.nodes.addAll(nodes);
        return this;
    }

    public final void c() {
        this.nodes.clear();
    }

    @fg.l
    public final l d(@fg.l String pathData) {
        int i4;
        char charAt;
        int i5;
        this.nodes.clear();
        int length = pathData.length();
        int i6 = 0;
        while (i6 < length && l0.t(pathData.charAt(i6), 32) <= 0) {
            i6++;
        }
        while (length > i6 && l0.t(pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i7 = 0;
        while (i6 < length) {
            while (true) {
                i4 = i6 + 1;
                charAt = pathData.charAt(i6);
                int i10 = charAt | ' ';
                if ((i10 - 122) * (i10 - 97) <= 0 && i10 != 101) {
                    break;
                }
                if (i4 >= length) {
                    charAt = 0;
                    break;
                }
                i6 = i4;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i7 = 0;
                    while (true) {
                        if (i4 >= length || l0.t(pathData.charAt(i4), 32) > 0) {
                            long i11 = b.i(pathData, i4, length);
                            i5 = (int) (i11 >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (i11 & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i12 = i7 + 1;
                                fArr[i7] = intBitsToFloat;
                                if (i12 >= fArr.length) {
                                    float[] fArr2 = new float[i12 * 2];
                                    this.nodeData = fArr2;
                                    kotlin.collections.l.y0(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i7 = i12;
                            }
                            while (i5 < length && pathData.charAt(i5) == ',') {
                                i5++;
                            }
                            if (i5 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i4 = i5;
                        } else {
                            i4++;
                        }
                    }
                    i4 = i5;
                }
                k.a(charAt, this.nodes, this.nodeData, i7);
            }
            i6 = i4;
        }
        return this;
    }

    @fg.l
    public final List<i> f() {
        return this.nodes;
    }

    @fg.l
    public final g5 g(@fg.l g5 target) {
        return m.d(this.nodes, target);
    }
}
