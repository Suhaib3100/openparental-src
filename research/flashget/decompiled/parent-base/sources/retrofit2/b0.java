package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes9.dex */
final class b0 implements a0 {
    private static final a0 A3 = new b0();

    b0() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (c0.l(annotationArr, a0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = A3;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return a0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof a0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return ProtectedSandApp.s("ꖝ\u0001") + a0.class.getName() + ProtectedSandApp.s("ꖞ\u0001");
    }
}
