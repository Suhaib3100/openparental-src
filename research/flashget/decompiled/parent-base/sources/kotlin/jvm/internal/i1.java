package kotlin.jvm.internal;

/* compiled from: PropertyReference2Impl.java */
/* loaded from: classes7.dex */
public class i1 extends h1 {
    public i1(kotlin.reflect.h hVar, String str, String str2) {
        super(((t) hVar).e(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.r
    public Object L(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @kotlin.c1(version = "1.4")
    public i1(Class cls, String str, String str2, int i4) {
        super(cls, str, str2, i4);
    }
}
