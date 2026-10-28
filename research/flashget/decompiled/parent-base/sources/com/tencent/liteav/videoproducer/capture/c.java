package com.tencent.liteav.videoproducer.capture;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.base.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class c {
    public static Size a(List<Size> list, k kVar, int i4, int i5) {
        double d5;
        Size size = new Size(i4, i5);
        String str = ProtectedSandApp.s("圕\u0001") + size + ProtectedSandApp.s("圖\u0001") + kVar;
        String s4 = ProtectedSandApp.s("圗\u0001");
        LiteavLog.i(s4, str);
        if (list == null) {
            LiteavLog.e(s4, ProtectedSandApp.s("團\u0001"));
            return size;
        }
        if (kVar == k.f71940b || kVar == k.f71942d) {
            size.swap();
        }
        double aspectRatio = size.aspectRatio();
        Size size2 = new Size(640, 640);
        int i6 = size.width;
        int i7 = size2.width;
        if (i6 > i7 || size.height > size2.height) {
            int i10 = size.height;
            if (i6 > i10) {
                size2.height = (i7 * i10) / i6;
            } else {
                size2.width = (size2.height * i6) / i10;
            }
        } else {
            size2.set(size);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        long j4 = Long.MAX_VALUE;
        for (Size size3 : list) {
            sb.append(size3);
            sb.append(ProtectedSandApp.s("圙\u0001"));
            long round = (size3.width < size2.width || size3.height < size2.height) ? Long.MAX_VALUE : Math.round(Math.abs(size3.aspectRatio() - aspectRatio) * 10.0d);
            if (round < j4) {
                arrayList.clear();
                arrayList.add(size3);
                j4 = round;
            } else if (round == j4) {
                arrayList.add(size3);
            }
        }
        LiteavLog.i(s4, ProtectedSandApp.s("圚\u0001").concat(String.valueOf(sb)));
        Collections.sort(arrayList, d.a());
        Size size4 = (Size) arrayList.get(0);
        int area = size.getArea() * 1000;
        Iterator it = arrayList.iterator();
        double d6 = Double.MAX_VALUE;
        while (it.hasNext()) {
            Size size5 = (Size) it.next();
            LiteavLog.i(s4, ProtectedSandApp.s("圛\u0001").concat(String.valueOf(size5)));
            if (aspectRatio > size5.aspectRatio()) {
                int i11 = size5.width;
                d5 = ((i11 * i11) * 1000) / aspectRatio;
            } else {
                int i12 = size5.height;
                d5 = i12 * i12 * aspectRatio * 1000.0d;
            }
            double d7 = area;
            if (d5 / d7 >= 0.9d) {
                double d10 = d5 - d7;
                if (Math.abs(d10) < d6) {
                    d6 = Math.abs(d10);
                    size4 = size5;
                }
            }
        }
        LiteavLog.i(s4, ProtectedSandApp.s("圜\u0001").concat(String.valueOf(size4)));
        return new Size(size4.width, size4.height);
    }

    public static com.tencent.liteav.videoproducer.a.a a(com.tencent.liteav.videoproducer.a.a[] aVarArr, int i4, boolean z4) {
        if (aVarArr != null && aVarArr.length != 0) {
            int i5 = 0;
            for (com.tencent.liteav.videoproducer.a.a aVar : aVarArr) {
                LiteavLog.i(ProtectedSandApp.s("圗\u0001"), ProtectedSandApp.s("圝\u0001").concat(String.valueOf(aVar)));
            }
            if (!z4) {
                Arrays.sort(aVarArr, e.a());
                int length = aVarArr.length;
                while (i5 < length) {
                    com.tencent.liteav.videoproducer.a.a aVar2 = aVarArr[i5];
                    if (aVar2.f72484a >= i4) {
                        return aVar2;
                    }
                    i5++;
                }
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (com.tencent.liteav.videoproducer.a.a aVar3 : aVarArr) {
                if (aVar3.f72484a < aVar3.f72485b) {
                    arrayList.add(aVar3);
                }
            }
            com.tencent.liteav.videoproducer.a.a[] aVarArr2 = (com.tencent.liteav.videoproducer.a.a[]) arrayList.toArray(new com.tencent.liteav.videoproducer.a.a[0]);
            Arrays.sort(aVarArr2, f.a());
            int length2 = aVarArr2.length;
            while (i5 < length2) {
                com.tencent.liteav.videoproducer.a.a aVar4 = aVarArr2[i5];
                if (i4 <= aVar4.f72485b) {
                    return aVar4;
                }
                i5++;
            }
            if (aVarArr2.length > 0) {
                return aVarArr2[aVarArr2.length - 1];
            }
        }
        return null;
    }
}
