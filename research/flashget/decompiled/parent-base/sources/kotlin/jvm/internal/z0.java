package kotlin.jvm.internal;

/* compiled from: MutablePropertyReference2Impl.java */
/* loaded from: classes7.dex */
public class z0 extends y0 {
    public z0(kotlin.reflect.h hVar, String str, String str2) {
        super(((t) hVar).e(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.r
    public Object L(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.m
    public void P(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    @kotlin.c1(version = "1.4")
    public z0(Class cls, String str, String str2, int i4) {
        super(cls, str, str2, i4);
    }
}
