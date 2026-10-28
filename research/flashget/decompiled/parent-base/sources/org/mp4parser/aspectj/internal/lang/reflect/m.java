package org.mp4parser.aspectj.internal.lang.reflect;

import lg.a0;
import lg.x;
import lg.z;

/* compiled from: PointcutBasedPerClauseImpl.java */
/* loaded from: classes9.dex */
public class m extends l implements z {

    /* renamed from: b, reason: collision with root package name */
    private final a0 f87664b;

    /* compiled from: PointcutBasedPerClauseImpl.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87665a;

        static {
            int[] iArr = new int[x.values().length];
            f87665a = iArr;
            try {
                iArr[x.PERCFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87665a[x.PERCFLOWBELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87665a[x.PERTARGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87665a[x.PERTHIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public m(x xVar, String str) {
        super(xVar);
        this.f87664b = new n(str);
    }

    @Override // lg.z
    public a0 d() {
        return this.f87664b;
    }

    @Override // org.mp4parser.aspectj.internal.lang.reflect.l
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i4 = a.f87665a[b().ordinal()];
        if (i4 == 1) {
            stringBuffer.append("percflow(");
        } else if (i4 == 2) {
            stringBuffer.append("percflowbelow(");
        } else if (i4 == 3) {
            stringBuffer.append("pertarget(");
        } else if (i4 == 4) {
            stringBuffer.append("perthis(");
        }
        stringBuffer.append(this.f87664b.a());
        stringBuffer.append(")");
        return stringBuffer.toString();
    }
}
