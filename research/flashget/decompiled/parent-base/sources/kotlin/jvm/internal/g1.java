package kotlin.jvm.internal;

/* compiled from: PropertyReference1Impl.java */
/* loaded from: classes7.dex */
public class g1 extends f1 {
    public g1(kotlin.reflect.h hVar, String str, String str2) {
        super(q.NO_RECEIVER, ((t) hVar).e(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @kotlin.c1(version = "1.4")
    public g1(Class cls, String str, String str2, int i4) {
        super(q.NO_RECEIVER, cls, str, str2, i4);
    }

    @kotlin.c1(version = "1.4")
    public g1(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
