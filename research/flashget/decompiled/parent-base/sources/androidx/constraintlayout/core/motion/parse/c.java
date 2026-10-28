package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.e;
import androidx.constraintlayout.core.parser.g;
import androidx.constraintlayout.core.parser.h;

/* compiled from: KeyParser.java */
/* loaded from: classes.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyParser.java */
    interface a {
        int get(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyParser.java */
    interface b {
        int get(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static v b(String str, b bVar, a aVar) {
        v vVar = new v();
        try {
            g d5 = h.d(str);
            int size = d5.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = (e) d5.K(i4);
                String c5 = eVar.c();
                d n02 = eVar.n0();
                int i5 = bVar.get(c5);
                if (i5 == -1) {
                    System.err.println("unknown type " + c5);
                } else {
                    int i6 = aVar.get(i5);
                    if (i6 == 1) {
                        vVar.d(i5, d5.J(i4));
                    } else if (i6 == 2) {
                        vVar.b(i5, n02.l());
                        System.out.println("parse " + c5 + " INT_MASK > " + n02.l());
                    } else if (i6 == 4) {
                        vVar.a(i5, n02.j());
                        System.out.println("parse " + c5 + " FLOAT_MASK > " + n02.j());
                    } else if (i6 == 8) {
                        vVar.c(i5, n02.c());
                        System.out.println("parse " + c5 + " STRING_MASK > " + n02.c());
                    }
                }
            }
        } catch (CLParsingException e4) {
            e4.printStackTrace();
        }
        return vVar;
    }

    public static v c(String str) {
        return b(str, new androidx.constraintlayout.core.motion.parse.a(), new androidx.constraintlayout.core.motion.parse.b());
    }
}
