package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
@r1({"SMAP\nReflectJavaAnnotationArguments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,79:1\n11065#2:80\n11400#2,3:81\n*S KotlinDebug\n*F\n+ 1 ReflectJavaAnnotationArguments.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaArrayAnnotationArgument\n*L\n48#1:80\n48#1:81,3\n*E\n"})
/* loaded from: classes7.dex */
public final class j extends f implements wd.e {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Object[] f76255c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@fg.m kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l Object[] objArr) {
        super(fVar, null);
        l0.p(objArr, ProtectedSandApp.s("滉\u0001"));
        this.f76255c = objArr;
    }

    @Override // wd.e
    @fg.l
    public List<f> getElements() {
        Object[] objArr = this.f76255c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            f.a aVar = f.f76252b;
            l0.m(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
