package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: Matrix.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u00015B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\f\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010!J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010!J\u0018\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001dJ\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\r2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b(\u0010&J+\u0010,\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "", "", "values", "b", "([F)[F", "", "row", "column", "", "f", "([FII)F", "v", "Lkotlin/k2;", "s", "([FIIF)V", "Li0/f;", "point", "j", "([FJ)J", "Li0/i;", "rect", "k", "([FLi0/i;)Li0/i;", "Li0/d;", "l", "([FLi0/d;)V", "m", "u", "([F[F)V", "", "([F)Ljava/lang/String;", "i", "([F)V", "matrix", "t", "degrees", "n", "([FF)V", "o", "p", "x", "y", "z", "q", "([FFFF)V", "w", "h", "([F)I", "other", "", "d", "([FLjava/lang/Object;)Z", "a", "[F", "g", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@kotlin.jvm.internal.r1({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#1:442\n39#1:443\n39#1:444\n42#1,2:445\n42#1,2:447\n42#1,2:449\n42#1,2:451\n42#1,2:453\n42#1,2:455\n42#1,2:457\n42#1,2:459\n42#1,2:461\n42#1,2:463\n42#1,2:465\n42#1,2:467\n42#1,2:469\n42#1,2:471\n42#1,2:473\n42#1,2:475\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n39#1:496\n42#1,2:497\n42#1,2:499\n42#1,2:501\n42#1,2:503\n42#1,2:505\n42#1,2:507\n42#1,2:509\n42#1,2:511\n42#1,2:513\n42#1,2:515\n42#1,2:517\n42#1,2:519\n42#1,2:521\n42#1,2:523\n42#1,2:525\n42#1,2:527\n42#1,2:529\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n39#1:538\n42#1,2:539\n42#1,2:541\n42#1,2:543\n42#1,2:545\n42#1,2:547\n42#1,2:549\n42#1,2:551\n42#1,2:553\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n39#1:562\n42#1,2:563\n42#1,2:565\n42#1,2:567\n42#1,2:569\n42#1,2:571\n42#1,2:573\n42#1,2:575\n42#1,2:577\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n39#1:586\n42#1,2:587\n42#1,2:589\n42#1,2:591\n42#1,2:593\n42#1,2:595\n42#1,2:597\n42#1,2:599\n42#1,2:601\n39#1,5:603\n39#1,5:608\n39#1,5:613\n39#1,5:618\n39#1,5:623\n39#1,5:628\n39#1,5:633\n39#1,5:638\n39#1,5:643\n39#1,5:648\n39#1,5:653\n39#1,5:658\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n39#1:678\n42#1,2:679\n42#1,2:681\n42#1,2:683\n42#1,2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:442\n56#1:443\n57#1:444\n112#1:445,2\n113#1:447,2\n114#1:449,2\n115#1:451,2\n116#1:453,2\n117#1:455,2\n118#1:457,2\n119#1:459,2\n120#1:461,2\n121#1:463,2\n122#1:465,2\n123#1:467,2\n124#1:469,2\n125#1:471,2\n126#1:473,2\n127#1:475,2\n132#1:477\n133#1:478\n134#1:479\n135#1:480\n143#1:481\n144#1:482\n145#1:483\n146#1:484\n147#1:485\n148#1:486\n149#1:487\n150#1:488\n151#1:489\n152#1:490\n153#1:491\n154#1:492\n155#1:493\n156#1:494\n157#1:495\n158#1:496\n177#1:497,2\n178#1:499,2\n179#1:501,2\n180#1:503,2\n181#1:505,2\n182#1:507,2\n183#1:509,2\n184#1:511,2\n185#1:513,2\n186#1:515,2\n187#1:517,2\n188#1:519,2\n189#1:521,2\n190#1:523,2\n191#1:525,2\n192#1:527,2\n201#1:529,2\n220#1:531\n221#1:532\n225#1:533\n226#1:534\n230#1:535\n231#1:536\n235#1:537\n236#1:538\n240#1:539,2\n241#1:541,2\n242#1:543,2\n243#1:545,2\n244#1:547,2\n245#1:549,2\n246#1:551,2\n247#1:553,2\n257#1:555\n258#1:556\n262#1:557\n263#1:558\n267#1:559\n268#1:560\n272#1:561\n273#1:562\n277#1:563,2\n278#1:565,2\n279#1:567,2\n280#1:569,2\n281#1:571,2\n282#1:573,2\n283#1:575,2\n284#1:577,2\n294#1:579\n295#1:580\n299#1:581\n300#1:582\n304#1:583\n305#1:584\n309#1:585\n310#1:586\n314#1:587,2\n315#1:589,2\n316#1:591,2\n317#1:593,2\n318#1:595,2\n319#1:597,2\n320#1:599,2\n321#1:601,2\n326#1:603,5\n327#1:608,5\n328#1:613,5\n329#1:618,5\n330#1:623,5\n331#1:628,5\n332#1:633,5\n333#1:638,5\n334#1:643,5\n335#1:648,5\n336#1:653,5\n337#1:658,5\n342#1:663\n343#1:664\n344#1:665\n345#1:666\n346#1:667\n347#1:668\n348#1:669\n349#1:670\n350#1:671\n351#1:672\n352#1:673\n353#1:674\n354#1:675\n355#1:676\n356#1:677\n357#1:678\n358#1:679,2\n359#1:681,2\n360#1:683,2\n361#1:685,2\n*E\n"})
/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18470c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18471d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18472e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18473f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18474g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f18475h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f18476i = 10;

    /* renamed from: j, reason: collision with root package name */
    public static final int f18477j = 12;

    /* renamed from: k, reason: collision with root package name */
    public static final int f18478k = 13;

    /* renamed from: l, reason: collision with root package name */
    public static final int f18479l = 14;

    /* renamed from: m, reason: collision with root package name */
    public static final int f18480m = 15;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] values;

    private /* synthetic */ y4(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ y4 a(float[] fArr) {
        return new y4(fArr);
    }

    @fg.l
    public static float[] b(@fg.l float[] fArr) {
        return fArr;
    }

    public static float[] c(float[] fArr, int i4, kotlin.jvm.internal.w wVar) {
        return (i4 & 1) != 0 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f} : fArr;
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof y4) && kotlin.jvm.internal.l0.g(fArr, ((y4) obj).values);
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.l0.g(fArr, fArr2);
    }

    public static final float f(float[] fArr, int i4, int i5) {
        return fArr[(i4 * 4) + i5];
    }

    public static int h(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void i(float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[11];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = fArr[15];
        float f22 = (f4 * f11) - (f5 * f10);
        float f23 = (f4 * f12) - (f6 * f10);
        float f24 = (f4 * f13) - (f7 * f10);
        float f25 = (f5 * f12) - (f6 * f11);
        float f26 = (f5 * f13) - (f7 * f11);
        float f27 = (f6 * f13) - (f7 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (f27 * f28) + (((f25 * f30) + ((f24 * f31) + ((f22 * f33) - (f23 * f32)))) - (f26 * f29));
        if (f34 == 0.0f) {
            return;
        }
        float f35 = 1.0f / f34;
        fArr[0] = androidx.compose.animation.z0.a(f13, f31, (f11 * f33) - (f12 * f32), f35);
        fArr[1] = x4.a(f7, f31, (f6 * f32) + ((-f5) * f33), f35);
        fArr[2] = androidx.compose.animation.z0.a(f21, f25, (f19 * f27) - (f20 * f26), f35);
        fArr[3] = x4.a(f17, f25, (f16 * f26) + ((-f15) * f27), f35);
        float f36 = -f10;
        fArr[4] = x4.a(f13, f29, (f12 * f30) + (f36 * f33), f35);
        fArr[5] = androidx.compose.animation.z0.a(f7, f29, (f4 * f33) - (f6 * f30), f35);
        float f37 = -f18;
        fArr[6] = x4.a(f21, f23, (f20 * f24) + (f37 * f27), f35);
        fArr[7] = androidx.compose.animation.z0.a(f17, f23, (f14 * f27) - (f16 * f24), f35);
        fArr[8] = androidx.compose.animation.z0.a(f13, f28, (f10 * f32) - (f11 * f30), f35);
        fArr[9] = x4.a(f7, f28, (f5 * f30) + ((-f4) * f32), f35);
        fArr[10] = androidx.compose.animation.z0.a(f21, f22, (f18 * f26) - (f19 * f24), f35);
        fArr[11] = x4.a(f17, f22, (f24 * f15) + ((-f14) * f26), f35);
        fArr[12] = x4.a(f12, f28, (f11 * f29) + (f36 * f31), f35);
        fArr[13] = androidx.compose.animation.z0.a(f6, f28, (f4 * f31) - (f5 * f29), f35);
        fArr[14] = x4.a(f20, f22, (f19 * f23) + (f37 * f25), f35);
        fArr[15] = androidx.compose.animation.z0.a(f16, f22, (f14 * f25) - (f15 * f23), f35);
    }

    public static final long j(float[] fArr, long j4) {
        float p4 = i0.f.p(j4);
        float r4 = i0.f.r(j4);
        float f4 = 1 / (((fArr[7] * r4) + (fArr[3] * p4)) + fArr[15]);
        if (Float.isInfinite(f4) || Float.isNaN(f4)) {
            f4 = 0.0f;
        }
        return i0.g.a(((fArr[4] * r4) + (fArr[0] * p4) + fArr[12]) * f4, ((fArr[5] * r4) + (fArr[1] * p4) + fArr[13]) * f4);
    }

    @fg.l
    public static final i0.i k(float[] fArr, @fg.l i0.i iVar) {
        long j4 = j(fArr, i0.g.a(iVar.t(), iVar.getTop()));
        long j5 = j(fArr, i0.g.a(iVar.t(), iVar.j()));
        long j6 = j(fArr, i0.g.a(iVar.x(), iVar.getTop()));
        long j7 = j(fArr, i0.g.a(iVar.x(), iVar.j()));
        return new i0.i(Math.min(Math.min(i0.f.p(j4), i0.f.p(j5)), Math.min(i0.f.p(j6), i0.f.p(j7))), Math.min(Math.min(i0.f.r(j4), i0.f.r(j5)), Math.min(i0.f.r(j6), i0.f.r(j7))), Math.max(Math.max(i0.f.p(j4), i0.f.p(j5)), Math.max(i0.f.p(j6), i0.f.p(j7))), Math.max(Math.max(i0.f.r(j4), i0.f.r(j5)), Math.max(i0.f.r(j6), i0.f.r(j7))));
    }

    public static final void l(float[] fArr, @fg.l i0.d dVar) {
        long j4 = j(fArr, i0.g.a(dVar.getLeft(), dVar.getTop()));
        long j5 = j(fArr, i0.g.a(dVar.getLeft(), dVar.getBottom()));
        long j6 = j(fArr, i0.g.a(dVar.getRight(), dVar.getTop()));
        long j7 = j(fArr, i0.g.a(dVar.getRight(), dVar.getBottom()));
        dVar.m(Math.min(Math.min(i0.f.p(j4), i0.f.p(j5)), Math.min(i0.f.p(j6), i0.f.p(j7))));
        dVar.o(Math.min(Math.min(i0.f.r(j4), i0.f.r(j5)), Math.min(i0.f.r(j6), i0.f.r(j7))));
        dVar.n(Math.max(Math.max(i0.f.p(j4), i0.f.p(j5)), Math.max(i0.f.p(j6), i0.f.p(j7))));
        dVar.l(Math.max(Math.max(i0.f.r(j4), i0.f.r(j5)), Math.max(i0.f.r(j6), i0.f.r(j7))));
    }

    public static final void m(float[] fArr) {
        int i4 = 0;
        while (i4 < 4) {
            int i5 = 0;
            while (i5 < 4) {
                fArr[(i5 * 4) + i4] = i4 == i5 ? 1.0f : 0.0f;
                i5++;
            }
            i4++;
        }
    }

    public static final void n(float[] fArr, float f4) {
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[13];
        float f14 = fArr[14];
        fArr[1] = (f5 * cos) - (f6 * sin);
        fArr[2] = (f6 * cos) + (f5 * sin);
        fArr[5] = (f7 * cos) - (f10 * sin);
        fArr[6] = (f10 * cos) + (f7 * sin);
        fArr[9] = (f11 * cos) - (f12 * sin);
        fArr[10] = (f12 * cos) + (f11 * sin);
        fArr[13] = (f13 * cos) - (f14 * sin);
        fArr[14] = (f14 * cos) + (f13 * sin);
    }

    public static final void o(float[] fArr, float f4) {
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        float f5 = fArr[0];
        float f6 = fArr[2];
        float f7 = fArr[4];
        float f10 = fArr[6];
        float f11 = fArr[8];
        float f12 = fArr[10];
        float f13 = fArr[12];
        float f14 = fArr[14];
        fArr[0] = (f6 * sin) + (f5 * cos);
        fArr[2] = (f6 * cos) + ((-f5) * sin);
        fArr[4] = (f10 * sin) + (f7 * cos);
        fArr[6] = (f10 * cos) + ((-f7) * sin);
        fArr[8] = (f12 * sin) + (f11 * cos);
        fArr[10] = (f12 * cos) + ((-f11) * sin);
        fArr[12] = (f14 * sin) + (f13 * cos);
        fArr[14] = (f14 * cos) + ((-f13) * sin);
    }

    public static final void p(float[] fArr, float f4) {
        double d5 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d5);
        float sin = (float) Math.sin(d5);
        float f5 = fArr[0];
        float f6 = fArr[4];
        float f7 = (sin * f6) + (cos * f5);
        float f10 = -sin;
        float f11 = fArr[1];
        float f12 = fArr[5];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = fArr[2];
        float f15 = fArr[6];
        float f16 = (sin * f15) + (cos * f14);
        float f17 = fArr[3];
        float f18 = fArr[7];
        fArr[0] = f7;
        fArr[1] = f13;
        fArr[2] = f16;
        fArr[3] = (sin * f18) + (cos * f17);
        fArr[4] = (f6 * cos) + (f5 * f10);
        fArr[5] = (f12 * cos) + (f11 * f10);
        fArr[6] = (f15 * cos) + (f14 * f10);
        fArr[7] = (cos * f18) + (f10 * f17);
    }

    public static final void q(float[] fArr, float f4, float f5, float f6) {
        fArr[0] = fArr[0] * f4;
        fArr[1] = fArr[1] * f4;
        fArr[2] = fArr[2] * f4;
        fArr[3] = fArr[3] * f4;
        fArr[4] = fArr[4] * f5;
        fArr[5] = fArr[5] * f5;
        fArr[6] = fArr[6] * f5;
        fArr[7] = fArr[7] * f5;
        fArr[8] = fArr[8] * f6;
        fArr[9] = fArr[9] * f6;
        fArr[10] = fArr[10] * f6;
        fArr[11] = fArr[11] * f6;
    }

    public static /* synthetic */ void r(float[] fArr, float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 1.0f;
        }
        q(fArr, f4, f5, f6);
    }

    public static final void s(float[] fArr, int i4, int i5, float f4) {
        fArr[(i4 * 4) + i5] = f4;
    }

    public static final void t(float[] fArr, @fg.l float[] fArr2) {
        for (int i4 = 0; i4 < 16; i4++) {
            fArr[i4] = fArr2[i4];
        }
    }

    public static final void u(float[] fArr, @fg.l float[] fArr2) {
        float b5;
        float b6;
        float b7;
        float b10;
        float b11;
        float b12;
        float b13;
        float b14;
        float b15;
        float b16;
        float b17;
        float b18;
        float b19;
        float b20;
        float b21;
        float b22;
        b5 = z4.b(fArr, 0, fArr2, 0);
        b6 = z4.b(fArr, 0, fArr2, 1);
        b7 = z4.b(fArr, 0, fArr2, 2);
        b10 = z4.b(fArr, 0, fArr2, 3);
        b11 = z4.b(fArr, 1, fArr2, 0);
        b12 = z4.b(fArr, 1, fArr2, 1);
        b13 = z4.b(fArr, 1, fArr2, 2);
        b14 = z4.b(fArr, 1, fArr2, 3);
        b15 = z4.b(fArr, 2, fArr2, 0);
        b16 = z4.b(fArr, 2, fArr2, 1);
        b17 = z4.b(fArr, 2, fArr2, 2);
        b18 = z4.b(fArr, 2, fArr2, 3);
        b19 = z4.b(fArr, 3, fArr2, 0);
        b20 = z4.b(fArr, 3, fArr2, 1);
        b21 = z4.b(fArr, 3, fArr2, 2);
        b22 = z4.b(fArr, 3, fArr2, 3);
        fArr[0] = b5;
        fArr[1] = b6;
        fArr[2] = b7;
        fArr[3] = b10;
        fArr[4] = b11;
        fArr[5] = b12;
        fArr[6] = b13;
        fArr[7] = b14;
        fArr[8] = b15;
        fArr[9] = b16;
        fArr[10] = b17;
        fArr[11] = b18;
        fArr[12] = b19;
        fArr[13] = b20;
        fArr[14] = b21;
        fArr[15] = b22;
    }

    @fg.l
    public static String v(float[] fArr) {
        return kotlin.text.v.p("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void w(float[] fArr, float f4, float f5, float f6) {
        float f7 = (fArr[8] * f6) + (fArr[4] * f5) + (fArr[0] * f4) + fArr[12];
        float f10 = (fArr[9] * f6) + (fArr[5] * f5) + (fArr[1] * f4) + fArr[13];
        float f11 = (fArr[10] * f6) + (fArr[6] * f5) + (fArr[2] * f4) + fArr[14];
        float f12 = (fArr[11] * f6) + (fArr[7] * f5) + (fArr[3] * f4) + fArr[15];
        fArr[12] = f7;
        fArr[13] = f10;
        fArr[14] = f11;
        fArr[15] = f12;
    }

    public static /* synthetic */ void x(float[] fArr, float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        w(fArr, f4, f5, f6);
    }

    public boolean equals(Object obj) {
        return d(this.values, obj);
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }

    @fg.l
    public String toString() {
        return v(this.values);
    }

    public final /* synthetic */ float[] y() {
        return this.values;
    }
}
