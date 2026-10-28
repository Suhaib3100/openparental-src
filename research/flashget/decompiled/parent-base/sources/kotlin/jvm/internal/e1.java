package kotlin.jvm.internal;

/* compiled from: PropertyReference0Impl.java */
/* loaded from: classes7.dex */
public class e1 extends d1 {
    public e1(kotlin.reflect.h hVar, String str, String str2) {
        super(q.NO_RECEIVER, ((t) hVar).e(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @kotlin.c1(version = "1.4")
    public e1(Class cls, String str, String str2, int i4) {
        super(q.NO_RECEIVER, cls, str, str2, i4);
    }

    @kotlin.c1(version = "1.4")
    public e1(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
