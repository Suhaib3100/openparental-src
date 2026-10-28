package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes6.dex */
public final class j extends f implements b4.e {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Object[] f24405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@d5.e kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Object[] objArr) {
        super(fVar, null);
        l0.p(objArr, ProtectedSandApp.s("药"));
        this.f24405c = objArr;
    }

    @Override // b4.e
    @d5.d
    public List<f> e() {
        Object[] objArr = this.f24405c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            f.a aVar = f.f24402b;
            l0.m(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
