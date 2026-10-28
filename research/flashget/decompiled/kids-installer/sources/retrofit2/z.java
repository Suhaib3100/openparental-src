package retrofit2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl.java */
/* loaded from: classes6.dex */
final class z implements y {
    private static final y A0 = new z();

    z() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (a0.l(annotationArr, y.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = A0;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return y.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof y;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return ProtectedSandApp.s("鑙") + y.class.getName() + ProtectedSandApp.s("鑚");
    }
}
