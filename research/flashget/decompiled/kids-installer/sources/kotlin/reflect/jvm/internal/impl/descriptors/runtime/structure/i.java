package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* loaded from: classes5.dex */
public final class i {
    @d5.e
    public static final e a(@d5.d Annotation[] annotationArr, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation annotation;
        l0.p(annotationArr, ProtectedSandApp.s("䢰"));
        l0.p(cVar, ProtectedSandApp.s("䢱"));
        int length = annotationArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i5];
            if (l0.g(d.a(p3.b.e(p3.b.a(annotation))).b(), cVar)) {
                break;
            }
            i5++;
        }
        if (annotation != null) {
            return new e(annotation);
        }
        return null;
    }

    @d5.d
    public static final List<e> b(@d5.d Annotation[] annotationArr) {
        l0.p(annotationArr, ProtectedSandApp.s("䢲"));
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new e(annotation));
        }
        return arrayList;
    }
}
