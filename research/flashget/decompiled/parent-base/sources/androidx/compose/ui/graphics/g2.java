package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: ColorMatrix.kt */
@kd.g
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\r0\u0016H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0014J2\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J-\u0010+\u001a\u00020\r2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b-\u0010&J\u0015\u0010.\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b.\u0010&J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b/\u0010&J\r\u00100\u001a\u00020\r¢\u0006\u0004\b0\u0010\u0011J\r\u00101\u001a\u00020\r¢\u0006\u0004\b1\u0010\u0011J\u0010\u0010\f\u001a\u000202HÖ\u0001¢\u0006\u0004\b\f\u00103J\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/g2;", "", "", "values", "b", "([F)[F", "", "row", "column", "", "i", "([FII)F", "v", "Lkotlin/k2;", "n", "([FIIF)V", "l", "([F)V", "src", "o", "([F[F)V", "degrees", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "cosine", "sine", "block", "m", "([FFLld/p;)V", "colorMatrix", "u", "m1", "m2", "f", "([F[FI[FI)F", "sat", "s", "([FF)V", "redScale", "greenScale", "blueScale", "alphaScale", "t", "([FFFFF)V", "r", "q", "p", "d", "e", "", "([F)Ljava/lang/String;", "k", "([F)I", "other", "", "g", "([FLjava/lang/Object;)Z", "a", "[F", "j", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,329:1\n97#1,2:330\n97#1,2:332\n97#1,2:334\n97#1,2:336\n84#1:338\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n84#1:357\n97#1,2:358\n97#1,2:360\n97#1,2:362\n97#1,2:364\n97#1,2:366\n97#1,2:368\n97#1,2:370\n97#1,2:372\n97#1,2:374\n97#1,2:376\n97#1,2:378\n97#1,2:380\n97#1,2:382\n97#1,2:384\n97#1,2:386\n97#1,2:388\n97#1,2:390\n97#1,2:392\n97#1,2:394\n97#1,2:396\n84#1:398\n84#1:399\n84#1:400\n84#1:401\n97#1,2:402\n97#1,2:404\n97#1,2:406\n97#1,2:408\n97#1,2:410\n97#1,2:412\n97#1,2:414\n97#1,2:416\n97#1,2:418\n97#1,2:420\n97#1,2:422\n97#1,2:424\n97#1,2:426\n133#1,5:428\n97#1,2:433\n97#1,2:435\n97#1,2:437\n97#1,2:439\n138#1:441\n133#1,5:442\n97#1,2:447\n97#1,2:449\n97#1,2:451\n97#1,2:453\n138#1:455\n133#1,5:456\n97#1,2:461\n97#1,2:463\n97#1,2:465\n97#1,2:467\n138#1:469\n97#1,2:470\n97#1,2:472\n97#1,2:474\n97#1,2:476\n97#1,2:478\n97#1,2:480\n97#1,2:482\n97#1,2:484\n97#1,2:486\n97#1,2:488\n97#1,2:490\n97#1,2:492\n97#1,2:494\n97#1,2:496\n97#1,2:498\n97#1,2:500\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n111#1:330,2\n112#1:332,2\n113#1:334,2\n114#1:336,2\n148#1:338\n149#1:339\n150#1:340\n151#1:341\n152#1:342\n158#1:343\n159#1:344\n160#1:345\n161#1:346\n162#1:347\n168#1:348\n169#1:349\n170#1:350\n171#1:351\n172#1:352\n178#1:353\n179#1:354\n180#1:355\n181#1:356\n182#1:357\n184#1:358,2\n185#1:360,2\n186#1:362,2\n187#1:364,2\n188#1:366,2\n189#1:368,2\n190#1:370,2\n191#1:372,2\n192#1:374,2\n193#1:376,2\n194#1:378,2\n195#1:380,2\n196#1:382,2\n197#1:384,2\n198#1:386,2\n199#1:388,2\n200#1:390,2\n201#1:392,2\n202#1:394,2\n203#1:396,2\n211#1:398\n212#1:399\n213#1:400\n214#1:401\n228#1:402,2\n229#1:404,2\n230#1:406,2\n231#1:408,2\n232#1:410,2\n233#1:412,2\n234#1:414,2\n235#1:416,2\n236#1:418,2\n255#1:420,2\n256#1:422,2\n257#1:424,2\n258#1:426,2\n265#1:428,5\n266#1:433,2\n267#1:435,2\n268#1:437,2\n269#1:439,2\n265#1:441\n277#1:442,5\n278#1:447,2\n279#1:449,2\n280#1:451,2\n281#1:453,2\n277#1:455\n289#1:456,5\n290#1:461,2\n291#1:463,2\n292#1:465,2\n293#1:467,2\n289#1:469\n303#1:470,2\n304#1:472,2\n305#1:474,2\n306#1:476,2\n307#1:478,2\n308#1:480,2\n309#1:482,2\n310#1:484,2\n311#1:486,2\n320#1:488,2\n321#1:490,2\n322#1:492,2\n323#1:494,2\n324#1:496,2\n325#1:498,2\n326#1:500,2\n*E\n"})
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] values;

    private /* synthetic */ g2(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ g2 a(float[] fArr) {
        return new g2(fArr);
    }

    @fg.l
    public static float[] b(@fg.l float[] fArr) {
        return fArr;
    }

    public static float[] c(float[] fArr, int i4, kotlin.jvm.internal.w wVar) {
        return (i4 & 1) != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : fArr;
    }

    public static final void d(float[] fArr) {
        l(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    public static final void e(float[] fArr) {
        l(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    private static final float f(float[] fArr, float[] fArr2, int i4, float[] fArr3, int i5) {
        int i6 = i4 * 5;
        return (fArr2[i6 + 3] * fArr3[15 + i5]) + (fArr2[i6 + 2] * fArr3[10 + i5]) + (fArr2[i6 + 1] * fArr3[5 + i5]) + (fArr2[i6] * fArr3[i5]);
    }

    public static boolean g(float[] fArr, Object obj) {
        return (obj instanceof g2) && kotlin.jvm.internal.l0.g(fArr, ((g2) obj).values);
    }

    public static final boolean h(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.l0.g(fArr, fArr2);
    }

    public static final float i(float[] fArr, int i4, int i5) {
        return fArr[(i4 * 5) + i5];
    }

    public static int k(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void l(float[] fArr) {
        kotlin.collections.l.S1(fArr, 0.0f, 0, 0, 6, null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    private static final void m(float[] fArr, float f4, ld.p<? super Float, ? super Float, kotlin.k2> pVar) {
        l(fArr);
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        pVar.invoke(Float.valueOf((float) Math.cos(d5)), Float.valueOf((float) Math.sin(d5)));
    }

    public static final void n(float[] fArr, int i4, int i5, float f4) {
        fArr[(i4 * 5) + i5] = f4;
    }

    public static final void o(float[] fArr, @fg.l float[] fArr2) {
        kotlin.collections.l.H0(fArr2, fArr, 0, 0, 0, 14, null);
    }

    public static final void p(float[] fArr, float f4) {
        l(fArr);
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        fArr[6] = cos;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[5] = -sin;
    }

    public static final void q(float[] fArr, float f4) {
        l(fArr);
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        fArr[12] = cos;
        fArr[0] = cos;
        fArr[2] = -sin;
        fArr[10] = sin;
    }

    public static final void r(float[] fArr, float f4) {
        l(fArr);
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        fArr[12] = cos;
        fArr[6] = cos;
        fArr[7] = sin;
        fArr[11] = -sin;
    }

    public static final void s(float[] fArr, float f4) {
        l(fArr);
        float f5 = 1 - f4;
        float f6 = 0.213f * f5;
        float f7 = 0.715f * f5;
        float f10 = f5 * 0.072f;
        fArr[0] = f6 + f4;
        fArr[1] = f7;
        fArr[2] = f10;
        fArr[5] = f6;
        fArr[6] = f7 + f4;
        fArr[7] = f10;
        fArr[10] = f6;
        fArr[11] = f7;
        fArr[12] = f10 + f4;
    }

    public static final void t(float[] fArr, float f4, float f5, float f6, float f7) {
        l(fArr);
        fArr[0] = f4;
        fArr[6] = f5;
        fArr[12] = f6;
        fArr[18] = f7;
    }

    public static final void u(float[] fArr, @fg.l float[] fArr2) {
        float f4 = f(fArr, fArr, 0, fArr2, 0);
        float f5 = f(fArr, fArr, 0, fArr2, 1);
        float f6 = f(fArr, fArr, 0, fArr2, 2);
        float f7 = f(fArr, fArr, 0, fArr2, 3);
        float f10 = (fArr[3] * fArr2[19]) + (fArr[2] * fArr2[14]) + (fArr[1] * fArr2[9]) + (fArr[0] * fArr2[4]) + fArr[4];
        float f11 = f(fArr, fArr, 1, fArr2, 0);
        float f12 = f(fArr, fArr, 1, fArr2, 1);
        float f13 = f(fArr, fArr, 1, fArr2, 2);
        float f14 = f(fArr, fArr, 1, fArr2, 3);
        float f15 = (fArr[8] * fArr2[19]) + (fArr[7] * fArr2[14]) + (fArr[6] * fArr2[9]) + (fArr[5] * fArr2[4]) + fArr[9];
        float f16 = f(fArr, fArr, 2, fArr2, 0);
        float f17 = f(fArr, fArr, 2, fArr2, 1);
        float f18 = f(fArr, fArr, 2, fArr2, 2);
        float f19 = f(fArr, fArr, 2, fArr2, 3);
        float f20 = (fArr[13] * fArr2[19]) + (fArr[12] * fArr2[14]) + (fArr[11] * fArr2[9]) + (fArr[10] * fArr2[4]) + fArr[14];
        float f21 = f(fArr, fArr, 3, fArr2, 0);
        float f22 = f(fArr, fArr, 3, fArr2, 1);
        float f23 = f(fArr, fArr, 3, fArr2, 2);
        float f24 = f(fArr, fArr, 3, fArr2, 3);
        float f25 = (fArr[18] * fArr2[19]) + (fArr[17] * fArr2[14]) + (fArr[16] * fArr2[9]) + (fArr[15] * fArr2[4]) + fArr[19];
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[3] = f7;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
        fArr[9] = f15;
        fArr[10] = f16;
        fArr[11] = f17;
        fArr[12] = f18;
        fArr[13] = f19;
        fArr[14] = f20;
        fArr[15] = f21;
        fArr[16] = f22;
        fArr[17] = f23;
        fArr[18] = f24;
        fArr[19] = f25;
    }

    public static String v(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.values, obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final float[] getValues() {
        return this.values;
    }

    public String toString() {
        return v(this.values);
    }

    public final /* synthetic */ float[] w() {
        return this.values;
    }
}
