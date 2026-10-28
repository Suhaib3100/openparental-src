package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;

/* compiled from: ClassTypeConstructorImpl.java */
/* loaded from: classes6.dex */
public class m extends b implements h1 {

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f26505d;

    /* renamed from: e, reason: collision with root package name */
    private final List<kotlin.reflect.jvm.internal.impl.descriptors.f1> f26506e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection<h0> f26507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d List<? extends kotlin.reflect.jvm.internal.impl.descriptors.f1> list, @d5.d Collection<h0> collection, @d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        super(nVar);
        if (eVar == null) {
            v(0);
        }
        if (list == null) {
            v(1);
        }
        if (collection == null) {
            v(2);
        }
        if (nVar == null) {
            v(3);
        }
        this.f26505d = eVar;
        this.f26506e = Collections.unmodifiableList(new ArrayList(list));
        this.f26507f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void v(int i5) {
        String s5 = (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? ProtectedSandApp.s("襠") : ProtectedSandApp.s("襟");
        Object[] objArr = new Object[(i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : 3];
        String s6 = ProtectedSandApp.s("襡");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("襥");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("襤");
                break;
            case 3:
                objArr[0] = ProtectedSandApp.s("襣");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = s6;
                break;
            default:
                objArr[0] = ProtectedSandApp.s("襢");
                break;
        }
        if (i5 == 4) {
            objArr[1] = ProtectedSandApp.s("襩");
        } else if (i5 == 5) {
            objArr[1] = ProtectedSandApp.s("襨");
        } else if (i5 == 6) {
            objArr[1] = ProtectedSandApp.s("襧");
        } else if (i5 != 7) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("襦");
        }
        if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
            objArr[2] = ProtectedSandApp.s("襪");
        }
        String format = String.format(s5, objArr);
        if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @d5.d
    protected Collection<h0> k() {
        Collection<h0> collection = this.f26507f;
        if (collection == null) {
            v(6);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h
    @d5.d
    protected kotlin.reflect.jvm.internal.impl.descriptors.d1 p() {
        d1.a aVar = d1.a.f24134a;
        if (aVar == null) {
            v(7);
        }
        return aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.f1> r() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list = this.f26506e;
        if (list == null) {
            v(4);
        }
        return list;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.resolve.e.m(this.f26505d).b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.n, kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    /* renamed from: w */
    public kotlin.reflect.jvm.internal.impl.descriptors.e b() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f26505d;
        if (eVar == null) {
            v(5);
        }
        return eVar;
    }
}
