package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;

/* compiled from: ClassTypeConstructorImpl.java */
/* loaded from: classes7.dex */
public class m extends b implements h1 {

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f78514d;

    /* renamed from: e, reason: collision with root package name */
    private final List<kotlin.reflect.jvm.internal.impl.descriptors.f1> f78515e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection<h0> f78516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l List<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @fg.l Collection<h0> collection, @fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar);
        if (eVar == null) {
            u(0);
        }
        if (list == null) {
            u(1);
        }
        if (collection == null) {
            u(2);
        }
        if (nVar == null) {
            u(3);
        }
        this.f78514d = eVar;
        this.f78515e = Collections.unmodifiableList(new ArrayList(list));
        this.f78516f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void u(int i4) {
        String s4 = (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? ProtectedSandApp.s("羟\u0001") : ProtectedSandApp.s("羞\u0001");
        Object[] objArr = new Object[(i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : 3];
        String s5 = ProtectedSandApp.s("羠\u0001");
        switch (i4) {
            case 1:
                objArr[0] = ProtectedSandApp.s("群\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("羣\u0001");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("羢\u0001");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = s5;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("羡\u0001");
                break;
        }
        if (i4 == 4) {
            objArr[1] = ProtectedSandApp.s("羨\u0001");
        } else if (i4 == 5) {
            objArr[1] = ProtectedSandApp.s("羧\u0001");
        } else if (i4 == 6) {
            objArr[1] = ProtectedSandApp.s("羦\u0001");
        } else if (i4 != 7) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("羥\u0001");
        }
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            objArr[2] = ProtectedSandApp.s("義\u0001");
        }
        String format = String.format(s4, objArr);
        if (i4 != 4 && i4 != 5 && i4 != 6 && i4 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f1> getParameters() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list = this.f78515e;
        if (list == null) {
            u(4);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @fg.l
    protected Collection<h0> k() {
        Collection<h0> collection = this.f78516f;
        if (collection == null) {
            u(6);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @fg.l
    protected kotlin.reflect.jvm.internal.impl.descriptors.d1 o() {
        d1.a aVar = d1.a.f75932a;
        if (aVar == null) {
            u(7);
        }
        return aVar;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.resolve.f.m(this.f78514d).b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    /* renamed from: v */
    public kotlin.reflect.jvm.internal.impl.descriptors.e c() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f78514d;
        if (eVar == null) {
            u(5);
        }
        return eVar;
    }
}
