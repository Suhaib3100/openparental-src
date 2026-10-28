package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ReflectJavaAnnotationOwner.kt */
@r1({"SMAP\nReflectJavaAnnotationOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n11065#2:44\n11400#2,3:45\n1282#2,2:48\n1#3:50\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationOwner.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaAnnotationOwnerKt\n*L\n37#1:44\n37#1:45,3\n41#1:48,2\n*E\n"})
/* loaded from: classes7.dex */
public final class i {
    @fg.m
    public static final e a(@fg.l Annotation[] annotationArr, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation annotation;
        l0.p(annotationArr, ProtectedSandApp.s("滇\u0001"));
        l0.p(cVar, ProtectedSandApp.s("滈\u0001"));
        int length = annotationArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i4];
            if (l0.g(d.a(kd.b.e(kd.b.a(annotation))).b(), cVar)) {
                break;
            }
            i4++;
        }
        if (annotation != null) {
            return new e(annotation);
        }
        return null;
    }

    @fg.l
    public static final List<e> b(@fg.l Annotation[] annotationArr) {
        l0.p(annotationArr, ProtectedSandApp.s("滇\u0001"));
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new e(annotation));
        }
        return arrayList;
    }
}
