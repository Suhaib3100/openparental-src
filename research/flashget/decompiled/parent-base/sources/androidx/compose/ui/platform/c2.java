package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InvertMatrix.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "other", "", "a", "([F[F)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,78:1\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n39#2:94\n42#2,2:95\n42#2,2:97\n42#2,2:99\n42#2,2:101\n42#2,2:103\n42#2,2:105\n42#2,2:107\n42#2,2:109\n42#2,2:111\n42#2,2:113\n42#2,2:115\n42#2,2:117\n42#2,2:119\n42#2,2:121\n42#2,2:123\n42#2,2:125\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:79\n27#1:80\n28#1:81\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n60#1:95,2\n61#1:97,2\n62#1:99,2\n63#1:101,2\n64#1:103,2\n65#1:105,2\n66#1:107,2\n67#1:109,2\n68#1:111,2\n69#1:113,2\n70#1:115,2\n71#1:117,2\n72#1:119,2\n73#1:121,2\n74#1:123,2\n75#1:125,2\n*E\n"})
/* loaded from: classes.dex */
public final class c2 {
    public static final boolean a(@fg.l float[] fArr, @fg.l float[] fArr2) {
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
            return false;
        }
        float f35 = 1.0f / f34;
        fArr2[0] = androidx.compose.animation.z0.a(f13, f31, (f11 * f33) - (f12 * f32), f35);
        fArr2[1] = androidx.compose.ui.graphics.x4.a(f7, f31, (f6 * f32) + ((-f5) * f33), f35);
        fArr2[2] = androidx.compose.animation.z0.a(f21, f25, (f19 * f27) - (f20 * f26), f35);
        fArr2[3] = androidx.compose.ui.graphics.x4.a(f17, f25, (f16 * f26) + ((-f15) * f27), f35);
        float f36 = -f10;
        fArr2[4] = androidx.compose.ui.graphics.x4.a(f13, f29, (f12 * f30) + (f36 * f33), f35);
        fArr2[5] = androidx.compose.animation.z0.a(f7, f29, (f4 * f33) - (f6 * f30), f35);
        float f37 = -f18;
        fArr2[6] = androidx.compose.ui.graphics.x4.a(f21, f23, (f20 * f24) + (f37 * f27), f35);
        fArr2[7] = androidx.compose.animation.z0.a(f17, f23, (f14 * f27) - (f16 * f24), f35);
        fArr2[8] = androidx.compose.animation.z0.a(f13, f28, (f10 * f32) - (f11 * f30), f35);
        fArr2[9] = androidx.compose.ui.graphics.x4.a(f7, f28, (f5 * f30) + ((-f4) * f32), f35);
        fArr2[10] = androidx.compose.animation.z0.a(f21, f22, (f18 * f26) - (f19 * f24), f35);
        fArr2[11] = androidx.compose.ui.graphics.x4.a(f17, f22, (f24 * f15) + ((-f14) * f26), f35);
        fArr2[12] = androidx.compose.ui.graphics.x4.a(f12, f28, (f11 * f29) + (f36 * f31), f35);
        fArr2[13] = androidx.compose.animation.z0.a(f6, f28, (f4 * f31) - (f5 * f29), f35);
        fArr2[14] = androidx.compose.ui.graphics.x4.a(f20, f22, (f19 * f23) + (f37 * f25), f35);
        fArr2[15] = androidx.compose.animation.z0.a(f16, f22, (f14 * f25) - (f15 * f23), f35);
        return true;
    }
}
